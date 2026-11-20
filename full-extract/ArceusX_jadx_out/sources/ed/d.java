package ed;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import ic.k;
import n2.h;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f15953a;
    public final ColorStateList b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f15954c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15955d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15956e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15957f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15958g;

    /* renamed from: h, reason: collision with root package name */
    public final float f15959h;

    /* renamed from: i, reason: collision with root package name */
    public final float f15960i;

    /* renamed from: j, reason: collision with root package name */
    public final float f15961j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f15962k;

    /* renamed from: l, reason: collision with root package name */
    public final float f15963l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f15964m;

    /* renamed from: n, reason: collision with root package name */
    public float f15965n;

    /* renamed from: o, reason: collision with root package name */
    public final int f15966o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15967p = false;

    /* renamed from: q, reason: collision with root package name */
    public Typeface f15968q;

    public class a extends h.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f15969a;

        public a(f fVar) {
            this.f15969a = fVar;
        }

        @Override // n2.h.f
        public void f(int i10) {
            d.this.f15967p = true;
            this.f15969a.a(i10);
        }

        @Override // n2.h.f
        public void g(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f15968q = Typeface.create(typeface, dVar.f15956e);
            d.this.f15967p = true;
            this.f15969a.b(d.this.f15968q, false);
        }
    }

    public class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f15970a;
        public final /* synthetic */ TextPaint b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f15971c;

        public b(Context context, TextPaint textPaint, f fVar) {
            this.f15970a = context;
            this.b = textPaint;
            this.f15971c = fVar;
        }

        @Override // ed.f
        public void a(int i10) {
            this.f15971c.a(i10);
        }

        @Override // ed.f
        public void b(@NonNull Typeface typeface, boolean z10) {
            d.this.p(this.f15970a, this.b, typeface);
            this.f15971c.b(typeface, z10);
        }
    }

    public d(@NonNull Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, k.f20628f6);
        l(obtainStyledAttributes.getDimension(k.f20637g6, 0.0f));
        k(c.a(context, obtainStyledAttributes, k.f20664j6));
        this.f15953a = c.a(context, obtainStyledAttributes, k.f20673k6);
        this.b = c.a(context, obtainStyledAttributes, k.f20682l6);
        this.f15956e = obtainStyledAttributes.getInt(k.f20655i6, 0);
        this.f15957f = obtainStyledAttributes.getInt(k.f20646h6, 1);
        int e10 = c.e(obtainStyledAttributes, k.f20736r6, k.f20727q6);
        this.f15966o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f15955d = obtainStyledAttributes.getString(e10);
        this.f15958g = obtainStyledAttributes.getBoolean(k.f20745s6, false);
        this.f15954c = c.a(context, obtainStyledAttributes, k.f20691m6);
        this.f15959h = obtainStyledAttributes.getFloat(k.f20700n6, 0.0f);
        this.f15960i = obtainStyledAttributes.getFloat(k.f20709o6, 0.0f);
        this.f15961j = obtainStyledAttributes.getFloat(k.f20718p6, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f20725q4);
        this.f15962k = obtainStyledAttributes2.hasValue(k.f20734r4);
        this.f15963l = obtainStyledAttributes2.getFloat(k.f20734r4, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f15968q == null && (str = this.f15955d) != null) {
            this.f15968q = Typeface.create(str, this.f15956e);
        }
        if (this.f15968q == null) {
            int i10 = this.f15957f;
            if (i10 == 1) {
                this.f15968q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f15968q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f15968q = Typeface.DEFAULT;
            } else {
                this.f15968q = Typeface.MONOSPACE;
            }
            this.f15968q = Typeface.create(this.f15968q, this.f15956e);
        }
    }

    public Typeface e() {
        d();
        return this.f15968q;
    }

    @NonNull
    public Typeface f(@NonNull Context context) {
        if (this.f15967p) {
            return this.f15968q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h10 = n2.h.h(context, this.f15966o);
                this.f15968q = h10;
                if (h10 != null) {
                    this.f15968q = Typeface.create(h10, this.f15956e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f15955d, e10);
            }
        }
        d();
        this.f15967p = true;
        return this.f15968q;
    }

    public void g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(@NonNull Context context, @NonNull f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f15966o;
        if (i10 == 0) {
            this.f15967p = true;
        }
        if (this.f15967p) {
            fVar.b(this.f15968q, true);
            return;
        }
        try {
            n2.h.j(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f15967p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f15955d, e10);
            this.f15967p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f15964m;
    }

    public float j() {
        return this.f15965n;
    }

    public void k(ColorStateList colorStateList) {
        this.f15964m = colorStateList;
    }

    public void l(float f10) {
        this.f15965n = f10;
    }

    public final boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f15966o;
        return (i10 != 0 ? n2.h.c(context, i10) : null) != null;
    }

    public void n(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f15964m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : ViewCompat.MEASURED_STATE_MASK);
        float f10 = this.f15961j;
        float f11 = this.f15959h;
        float f12 = this.f15960i;
        ColorStateList colorStateList2 = this.f15954c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface a10 = h.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f15956e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f15965n);
        if (this.f15962k) {
            textPaint.setLetterSpacing(this.f15963l);
        }
    }
}
