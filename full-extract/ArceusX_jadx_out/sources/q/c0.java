package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f29276l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f29277m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public int f29278a = 0;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f29279c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f29280d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f29281e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f29282f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f29283g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f29284h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f29285i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f29286j;

    /* renamed from: k, reason: collision with root package name */
    public final d f29287k;

    public static final class a {
        @NonNull
        public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    public static class b extends d {
        @Override // q.c0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) c0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class c extends b {
        @Override // q.c0.b, q.c0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // q.c0.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) c0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public c0(@NonNull TextView textView) {
        this.f29285i = textView;
        this.f29286j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f29287k = new c();
        } else {
            this.f29287k = new b();
        }
    }

    public static Method k(@NonNull String str) {
        try {
            Method method = f29277m.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            f29277m.put(str, method);
            return method;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static <T> T m(@NonNull Object obj, @NonNull String str, @NonNull T t8) {
        try {
            return (T) k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t8;
        }
    }

    public void a() {
        if (n()) {
            if (this.b) {
                if (this.f29285i.getMeasuredHeight() <= 0 || this.f29285i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f29287k.b(this.f29285i) ? 1048576 : (this.f29285i.getMeasuredWidth() - this.f29285i.getTotalPaddingLeft()) - this.f29285i.getTotalPaddingRight();
                int height = (this.f29285i.getHeight() - this.f29285i.getCompoundPaddingBottom()) - this.f29285i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f29276l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float e10 = e(rectF);
                        if (e10 != this.f29285i.getTextSize()) {
                            t(0, e10);
                        }
                    } finally {
                    }
                }
            }
            this.b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f29278a = 0;
        this.f29280d = -1.0f;
        this.f29281e = -1.0f;
        this.f29279c = -1.0f;
        this.f29282f = new int[0];
        this.b = false;
    }

    @NonNull
    public StaticLayout d(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f29285i, this.f29284h, this.f29287k);
    }

    public final int e(RectF rectF) {
        int length = this.f29282f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f29282f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f29282f[i12];
    }

    public int f() {
        return Math.round(this.f29281e);
    }

    public int g() {
        return Math.round(this.f29280d);
    }

    public int h() {
        return Math.round(this.f29279c);
    }

    public int[] i() {
        return this.f29282f;
    }

    public int j() {
        return this.f29278a;
    }

    public void l(int i10) {
        TextPaint textPaint = this.f29284h;
        if (textPaint == null) {
            this.f29284h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f29284h.set(this.f29285i.getPaint());
        this.f29284h.setTextSize(i10);
    }

    public boolean n() {
        return y() && this.f29278a != 0;
    }

    public void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f29286j.obtainStyledAttributes(attributeSet, i.j.f19970i0, i10, 0);
        TextView textView = this.f29285i;
        androidx.core.view.o0.k0(textView, textView.getContext(), i.j.f19970i0, attributeSet, obtainStyledAttributes, i10, 0);
        if (obtainStyledAttributes.hasValue(i.j.f19995n0)) {
            this.f29278a = obtainStyledAttributes.getInt(i.j.f19995n0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(i.j.f19990m0) ? obtainStyledAttributes.getDimension(i.j.f19990m0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(i.j.f19980k0) ? obtainStyledAttributes.getDimension(i.j.f19980k0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(i.j.f19975j0) ? obtainStyledAttributes.getDimension(i.j.f19975j0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(i.j.f19985l0) && (resourceId = obtainStyledAttributes.getResourceId(i.j.f19985l0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f29278a = 0;
            return;
        }
        if (this.f29278a == 1) {
            if (!this.f29283g) {
                DisplayMetrics displayMetrics = this.f29286j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f29286j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(@NonNull int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f29286j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f29282f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f29283g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f29286j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final void s(float f10) {
        if (f10 != this.f29285i.getPaint().getTextSize()) {
            this.f29285i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f29285i.isInLayout();
            if (this.f29285i.getLayout() != null) {
                this.b = false;
                try {
                    Method k10 = k("nullLayouts");
                    if (k10 != null) {
                        k10.invoke(this.f29285i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (isInLayout) {
                    this.f29285i.forceLayout();
                } else {
                    this.f29285i.requestLayout();
                }
                this.f29285i.invalidate();
            }
        }
    }

    public void t(int i10, float f10) {
        Context context = this.f29286j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f29278a == 1) {
            if (!this.f29283g || this.f29282f.length == 0) {
                int floor = ((int) Math.floor((this.f29281e - this.f29280d) / this.f29279c)) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f29280d + (i10 * this.f29279c));
                }
                this.f29282f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f29282f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        boolean z10 = this.f29282f.length > 0;
        this.f29283g = z10;
        if (z10) {
            this.f29278a = 1;
            this.f29280d = r0[0];
            this.f29281e = r0[r1 - 1];
            this.f29279c = -1.0f;
        }
        return z10;
    }

    public final boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f29285i.getText();
        TransformationMethod transformationMethod = this.f29285i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f29285i)) != null) {
            text = transformation;
        }
        int maxLines = this.f29285i.getMaxLines();
        l(i10);
        StaticLayout d10 = d(text, (Layout.Alignment) m(this.f29285i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d10.getLineCount() <= maxLines && d10.getLineEnd(d10.getLineCount() - 1) == text.length())) && ((float) d10.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f29285i instanceof l);
    }

    public final void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f29278a = 1;
        this.f29280d = f10;
        this.f29281e = f11;
        this.f29279c = f12;
        this.f29283g = false;
    }
}
