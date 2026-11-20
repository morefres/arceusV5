package p5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.graphics.e;
import androidx.core.view.ViewCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import n2.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class f extends p5.e {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f28382k = PorterDuff.Mode.SRC_IN;
    public h b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f28383c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f28384d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28385e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28386f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable.ConstantState f28387g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f28388h;

    /* renamed from: i, reason: collision with root package name */
    public final Matrix f28389i;

    /* renamed from: j, reason: collision with root package name */
    public final Rect f28390j;

    public static class b extends AbstractC0503f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f28415a = androidx.core.graphics.e.d(string2);
            }
            this.f28416c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p5.f.AbstractC0503f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray i10 = k.i(resources, theme, attributeSet, p5.a.f28357d);
                f(i10, xmlPullParser);
                i10.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f28434a;
        public g b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f28435c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f28436d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f28437e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f28438f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f28439g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f28440h;

        /* renamed from: i, reason: collision with root package name */
        public int f28441i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f28442j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f28443k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f28444l;

        public h(h hVar) {
            this.f28435c = null;
            this.f28436d = f.f28382k;
            if (hVar != null) {
                this.f28434a = hVar.f28434a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.f28422e != null) {
                    gVar.f28422e = new Paint(hVar.b.f28422e);
                }
                if (hVar.b.f28421d != null) {
                    this.b.f28421d = new Paint(hVar.b.f28421d);
                }
                this.f28435c = hVar.f28435c;
                this.f28436d = hVar.f28436d;
                this.f28437e = hVar.f28437e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f28438f.getWidth() && i11 == this.f28438f.getHeight();
        }

        public boolean b() {
            return !this.f28443k && this.f28439g == this.f28435c && this.f28440h == this.f28436d && this.f28442j == this.f28437e && this.f28441i == this.b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f28438f == null || !a(i10, i11)) {
                this.f28438f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f28443k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f28438f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f28444l == null) {
                Paint paint = new Paint();
                this.f28444l = paint;
                paint.setFilterBitmap(true);
            }
            this.f28444l.setAlpha(this.b.getRootAlpha());
            this.f28444l.setColorFilter(colorFilter);
            return this.f28444l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28434a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.b.g(iArr);
            this.f28443k |= g10;
            return g10;
        }

        public void i() {
            this.f28439g = this.f28435c;
            this.f28440h = this.f28436d;
            this.f28441i = this.b.getRootAlpha();
            this.f28442j = this.f28437e;
            this.f28443k = false;
        }

        public void j(int i10, int i11) {
            this.f28438f.eraseColor(0);
            this.b.b(new Canvas(this.f28438f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f28435c = null;
            this.f28436d = f.f28382k;
            this.b = new g();
        }
    }

    public f() {
        this.f28386f = true;
        this.f28388h = new float[9];
        this.f28389i = new Matrix();
        this.f28390j = new Rect();
        this.b = new h();
    }

    public static int a(int i10, float f10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(@NonNull Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f28381a = n2.h.e(resources, i10, theme);
        fVar.f28387g = new i(fVar.f28381a.getConstantState());
        return fVar;
    }

    public static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public Object c(String str) {
        return this.b.b.f28433p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f28381a;
        if (drawable == null) {
            return false;
        }
        q2.a.b(drawable);
        return false;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.b;
        g gVar = hVar.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f28425h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f28433p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f28434a = cVar.f28417d | hVar.f28434a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f28433p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f28434a = bVar.f28417d | hVar.f28434a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f28433p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f28434a = dVar2.f28412k | hVar.f28434a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f28390j);
        if (this.f28390j.width() <= 0 || this.f28390j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f28384d;
        if (colorFilter == null) {
            colorFilter = this.f28383c;
        }
        canvas.getMatrix(this.f28389i);
        this.f28389i.getValues(this.f28388h);
        float abs = Math.abs(this.f28388h[0]);
        float abs2 = Math.abs(this.f28388h[4]);
        float abs3 = Math.abs(this.f28388h[1]);
        float abs4 = Math.abs(this.f28388h[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f28390j.width() * abs));
        int min2 = Math.min(2048, (int) (this.f28390j.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f28390j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f28390j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f28390j.offsetTo(0, 0);
        this.b.c(min, min2);
        if (!this.f28386f) {
            this.b.j(min, min2);
        } else if (!this.b.b()) {
            this.b.j(min, min2);
            this.b.i();
        }
        this.b.d(canvas, colorFilter, this.f28390j);
        canvas.restoreToCount(save);
    }

    public final boolean e() {
        return isAutoMirrored() && q2.a.f(this) == 1;
    }

    public void g(boolean z10) {
        this.f28386f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f28381a;
        return drawable != null ? q2.a.d(drawable) : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f28381a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f28381a;
        return drawable != null ? q2.a.e(drawable) : this.f28384d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f28381a != null) {
            return new i(this.f28381a.getConstantState());
        }
        this.b.f28434a = getChangingConfigurations();
        return this.b;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f28381a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f28427j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f28381a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.f28426i;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.b;
        g gVar = hVar.b;
        hVar.f28436d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            hVar.f28435c = c10;
        }
        hVar.f28437e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f28437e);
        gVar.f28428k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f28428k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f28429l);
        gVar.f28429l = f10;
        if (gVar.f28428k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f28426i = typedArray.getDimension(3, gVar.f28426i);
        float dimension = typedArray.getDimension(2, gVar.f28427j);
        gVar.f28427j = dimension;
        if (gVar.f28426i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f28431n = string;
            gVar.f28433p.put(string, gVar);
        }
    }

    public PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f28381a;
        return drawable != null ? q2.a.h(drawable) : this.b.f28437e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.b.f28435c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f28385e && super.mutate() == this) {
            this.b = new h(this.b);
            this.f28385e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.b;
        ColorStateList colorStateList = hVar.f28435c;
        if (colorStateList == null || (mode = hVar.f28436d) == null) {
            z10 = false;
        } else {
            this.f28383c = i(this.f28383c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.b.b.getRootAlpha() != i10) {
            this.b.b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            q2.a.j(drawable, z10);
        } else {
            this.b.f28437e = z10;
        }
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p5.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            q2.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.b;
        if (hVar.f28435c != colorStateList) {
            hVar.f28435c = colorStateList;
            this.f28383c = i(this.f28383c, colorStateList, hVar.f28436d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            q2.a.p(drawable, mode);
            return;
        }
        h hVar = this.b;
        if (hVar.f28436d != mode) {
            hVar.f28436d = mode;
            this.f28383c = i(this.f28383c, hVar.f28435c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f28381a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f28445a;

        public i(Drawable.ConstantState constantState) {
            this.f28445a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f28445a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f28445a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f28381a = (VectorDrawable) this.f28445a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f28381a = (VectorDrawable) this.f28445a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f28381a = (VectorDrawable) this.f28445a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f28384d = colorFilter;
            invalidateSelf();
        }
    }

    /* renamed from: p5.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0503f extends e {

        /* renamed from: a, reason: collision with root package name */
        public e.b[] f28415a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public int f28416c;

        /* renamed from: d, reason: collision with root package name */
        public int f28417d;

        public AbstractC0503f() {
            super();
            this.f28415a = null;
            this.f28416c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            e.b[] bVarArr = this.f28415a;
            if (bVarArr != null) {
                e.b.h(bVarArr, path);
            }
        }

        public e.b[] getPathData() {
            return this.f28415a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(e.b[] bVarArr) {
            if (androidx.core.graphics.e.b(this.f28415a, bVarArr)) {
                androidx.core.graphics.e.k(this.f28415a, bVarArr);
            } else {
                this.f28415a = androidx.core.graphics.e.f(bVarArr);
            }
        }

        public AbstractC0503f(AbstractC0503f abstractC0503f) {
            super();
            this.f28415a = null;
            this.f28416c = 0;
            this.b = abstractC0503f.b;
            this.f28417d = abstractC0503f.f28417d;
            this.f28415a = androidx.core.graphics.e.f(abstractC0503f.f28415a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f28381a;
        if (drawable != null) {
            q2.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.b;
        hVar.b = new g();
        TypedArray i10 = k.i(resources, theme, attributeSet, p5.a.f28355a);
        h(i10, xmlPullParser, theme);
        i10.recycle();
        hVar.f28434a = getChangingConfigurations();
        hVar.f28443k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f28383c = i(this.f28383c, hVar.f28435c, hVar.f28436d);
    }

    public f(@NonNull h hVar) {
        this.f28386f = true;
        this.f28388h = new float[9];
        this.f28389i = new Matrix();
        this.f28390j = new Rect();
        this.b = hVar;
        this.f28383c = i(this.f28383c, hVar.f28435c, hVar.f28436d);
    }

    public static class c extends AbstractC0503f {

        /* renamed from: e, reason: collision with root package name */
        public int[] f28391e;

        /* renamed from: f, reason: collision with root package name */
        public n2.d f28392f;

        /* renamed from: g, reason: collision with root package name */
        public float f28393g;

        /* renamed from: h, reason: collision with root package name */
        public n2.d f28394h;

        /* renamed from: i, reason: collision with root package name */
        public float f28395i;

        /* renamed from: j, reason: collision with root package name */
        public float f28396j;

        /* renamed from: k, reason: collision with root package name */
        public float f28397k;

        /* renamed from: l, reason: collision with root package name */
        public float f28398l;

        /* renamed from: m, reason: collision with root package name */
        public float f28399m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Cap f28400n;

        /* renamed from: o, reason: collision with root package name */
        public Paint.Join f28401o;

        /* renamed from: p, reason: collision with root package name */
        public float f28402p;

        public c() {
            this.f28393g = 0.0f;
            this.f28395i = 1.0f;
            this.f28396j = 1.0f;
            this.f28397k = 0.0f;
            this.f28398l = 1.0f;
            this.f28399m = 0.0f;
            this.f28400n = Paint.Cap.BUTT;
            this.f28401o = Paint.Join.MITER;
            this.f28402p = 4.0f;
        }

        @Override // p5.f.e
        public boolean a() {
            return this.f28394h.i() || this.f28392f.i();
        }

        @Override // p5.f.e
        public boolean b(int[] iArr) {
            return this.f28392f.j(iArr) | this.f28394h.j(iArr);
        }

        public final Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i10 = k.i(resources, theme, attributeSet, p5.a.f28356c);
            h(i10, xmlPullParser, theme);
            i10.recycle();
        }

        public float getFillAlpha() {
            return this.f28396j;
        }

        public int getFillColor() {
            return this.f28394h.e();
        }

        public float getStrokeAlpha() {
            return this.f28395i;
        }

        public int getStrokeColor() {
            return this.f28392f.e();
        }

        public float getStrokeWidth() {
            return this.f28393g;
        }

        public float getTrimPathEnd() {
            return this.f28398l;
        }

        public float getTrimPathOffset() {
            return this.f28399m;
        }

        public float getTrimPathStart() {
            return this.f28397k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f28391e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f28415a = androidx.core.graphics.e.d(string2);
                }
                this.f28394h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f28396j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f28396j);
                this.f28400n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f28400n);
                this.f28401o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f28401o);
                this.f28402p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f28402p);
                this.f28392f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f28395i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f28395i);
                this.f28393g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f28393g);
                this.f28398l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f28398l);
                this.f28399m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f28399m);
                this.f28397k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f28397k);
                this.f28416c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f28416c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f28396j = f10;
        }

        public void setFillColor(int i10) {
            this.f28394h.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f28395i = f10;
        }

        public void setStrokeColor(int i10) {
            this.f28392f.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f28393g = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f28398l = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f28399m = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f28397k = f10;
        }

        public c(c cVar) {
            super(cVar);
            this.f28393g = 0.0f;
            this.f28395i = 1.0f;
            this.f28396j = 1.0f;
            this.f28397k = 0.0f;
            this.f28398l = 1.0f;
            this.f28399m = 0.0f;
            this.f28400n = Paint.Cap.BUTT;
            this.f28401o = Paint.Join.MITER;
            this.f28402p = 4.0f;
            this.f28391e = cVar.f28391e;
            this.f28392f = cVar.f28392f;
            this.f28393g = cVar.f28393g;
            this.f28395i = cVar.f28395i;
            this.f28394h = cVar.f28394h;
            this.f28416c = cVar.f28416c;
            this.f28396j = cVar.f28396j;
            this.f28397k = cVar.f28397k;
            this.f28398l = cVar.f28398l;
            this.f28399m = cVar.f28399m;
            this.f28400n = cVar.f28400n;
            this.f28401o = cVar.f28401o;
            this.f28402p = cVar.f28402p;
        }
    }

    public static class g {

        /* renamed from: q, reason: collision with root package name */
        public static final Matrix f28418q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f28419a;
        public final Path b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f28420c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f28421d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f28422e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f28423f;

        /* renamed from: g, reason: collision with root package name */
        public int f28424g;

        /* renamed from: h, reason: collision with root package name */
        public final d f28425h;

        /* renamed from: i, reason: collision with root package name */
        public float f28426i;

        /* renamed from: j, reason: collision with root package name */
        public float f28427j;

        /* renamed from: k, reason: collision with root package name */
        public float f28428k;

        /* renamed from: l, reason: collision with root package name */
        public float f28429l;

        /* renamed from: m, reason: collision with root package name */
        public int f28430m;

        /* renamed from: n, reason: collision with root package name */
        public String f28431n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f28432o;

        /* renamed from: p, reason: collision with root package name */
        public final w1.a<String, Object> f28433p;

        public g() {
            this.f28420c = new Matrix();
            this.f28426i = 0.0f;
            this.f28427j = 0.0f;
            this.f28428k = 0.0f;
            this.f28429l = 0.0f;
            this.f28430m = 255;
            this.f28431n = null;
            this.f28432o = null;
            this.f28433p = new w1.a<>();
            this.f28425h = new d();
            this.f28419a = new Path();
            this.b = new Path();
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f28425h, f28418q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f28403a.set(matrix);
            dVar2.f28403a.preConcat(dVar2.f28411j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.b.size()) {
                e eVar = dVar2.b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f28403a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0503f) {
                    d(dVar2, (AbstractC0503f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public final void d(d dVar, AbstractC0503f abstractC0503f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f28428k;
            float f11 = i11 / this.f28429l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f28403a;
            this.f28420c.set(matrix);
            this.f28420c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            abstractC0503f.d(this.f28419a);
            Path path = this.f28419a;
            this.b.reset();
            if (abstractC0503f.c()) {
                this.b.setFillType(abstractC0503f.f28416c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.b.addPath(path, this.f28420c);
                canvas.clipPath(this.b);
                return;
            }
            c cVar = (c) abstractC0503f;
            float f12 = cVar.f28397k;
            if (f12 != 0.0f || cVar.f28398l != 1.0f) {
                float f13 = cVar.f28399m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f28398l + f13) % 1.0f;
                if (this.f28423f == null) {
                    this.f28423f = new PathMeasure();
                }
                this.f28423f.setPath(this.f28419a, false);
                float length = this.f28423f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f28423f.getSegment(f16, length, path, true);
                    this.f28423f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f28423f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path, this.f28420c);
            if (cVar.f28394h.l()) {
                n2.d dVar2 = cVar.f28394h;
                if (this.f28422e == null) {
                    Paint paint = new Paint(1);
                    this.f28422e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f28422e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f28420c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f28396j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f28396j));
                }
                paint2.setColorFilter(colorFilter);
                this.b.setFillType(cVar.f28416c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.b, paint2);
            }
            if (cVar.f28392f.l()) {
                n2.d dVar3 = cVar.f28392f;
                if (this.f28421d == null) {
                    Paint paint3 = new Paint(1);
                    this.f28421d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f28421d;
                Paint.Join join = cVar.f28401o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f28400n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f28402p);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f28420c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f28395i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f28395i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f28393g * min * e10);
                canvas.drawPath(this.b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f28432o == null) {
                this.f28432o = Boolean.valueOf(this.f28425h.a());
            }
            return this.f28432o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f28425h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f28430m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f28430m = i10;
        }

        public g(g gVar) {
            this.f28420c = new Matrix();
            this.f28426i = 0.0f;
            this.f28427j = 0.0f;
            this.f28428k = 0.0f;
            this.f28429l = 0.0f;
            this.f28430m = 255;
            this.f28431n = null;
            this.f28432o = null;
            w1.a<String, Object> aVar = new w1.a<>();
            this.f28433p = aVar;
            this.f28425h = new d(gVar.f28425h, aVar);
            this.f28419a = new Path(gVar.f28419a);
            this.b = new Path(gVar.b);
            this.f28426i = gVar.f28426i;
            this.f28427j = gVar.f28427j;
            this.f28428k = gVar.f28428k;
            this.f28429l = gVar.f28429l;
            this.f28424g = gVar.f28424g;
            this.f28430m = gVar.f28430m;
            this.f28431n = gVar.f28431n;
            String str = gVar.f28431n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f28432o = gVar.f28432o;
        }
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f28403a;
        public final ArrayList<e> b;

        /* renamed from: c, reason: collision with root package name */
        public float f28404c;

        /* renamed from: d, reason: collision with root package name */
        public float f28405d;

        /* renamed from: e, reason: collision with root package name */
        public float f28406e;

        /* renamed from: f, reason: collision with root package name */
        public float f28407f;

        /* renamed from: g, reason: collision with root package name */
        public float f28408g;

        /* renamed from: h, reason: collision with root package name */
        public float f28409h;

        /* renamed from: i, reason: collision with root package name */
        public float f28410i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f28411j;

        /* renamed from: k, reason: collision with root package name */
        public int f28412k;

        /* renamed from: l, reason: collision with root package name */
        public int[] f28413l;

        /* renamed from: m, reason: collision with root package name */
        public String f28414m;

        public d(d dVar, w1.a<String, Object> aVar) {
            super();
            AbstractC0503f bVar;
            this.f28403a = new Matrix();
            this.b = new ArrayList<>();
            this.f28404c = 0.0f;
            this.f28405d = 0.0f;
            this.f28406e = 0.0f;
            this.f28407f = 1.0f;
            this.f28408g = 1.0f;
            this.f28409h = 0.0f;
            this.f28410i = 0.0f;
            Matrix matrix = new Matrix();
            this.f28411j = matrix;
            this.f28414m = null;
            this.f28404c = dVar.f28404c;
            this.f28405d = dVar.f28405d;
            this.f28406e = dVar.f28406e;
            this.f28407f = dVar.f28407f;
            this.f28408g = dVar.f28408g;
            this.f28409h = dVar.f28409h;
            this.f28410i = dVar.f28410i;
            this.f28413l = dVar.f28413l;
            String str = dVar.f28414m;
            this.f28414m = str;
            this.f28412k = dVar.f28412k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f28411j);
            ArrayList<e> arrayList = dVar.b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.b.add(bVar);
                    String str2 = bVar.b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p5.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                if (this.b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p5.f.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.b.size(); i10++) {
                z10 |= this.b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray i10 = k.i(resources, theme, attributeSet, p5.a.b);
            e(i10, xmlPullParser);
            i10.recycle();
        }

        public final void d() {
            this.f28411j.reset();
            this.f28411j.postTranslate(-this.f28405d, -this.f28406e);
            this.f28411j.postScale(this.f28407f, this.f28408g);
            this.f28411j.postRotate(this.f28404c, 0.0f, 0.0f);
            this.f28411j.postTranslate(this.f28409h + this.f28405d, this.f28410i + this.f28406e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f28413l = null;
            this.f28404c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f28404c);
            this.f28405d = typedArray.getFloat(1, this.f28405d);
            this.f28406e = typedArray.getFloat(2, this.f28406e);
            this.f28407f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f28407f);
            this.f28408g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f28408g);
            this.f28409h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f28409h);
            this.f28410i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f28410i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f28414m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f28414m;
        }

        public Matrix getLocalMatrix() {
            return this.f28411j;
        }

        public float getPivotX() {
            return this.f28405d;
        }

        public float getPivotY() {
            return this.f28406e;
        }

        public float getRotation() {
            return this.f28404c;
        }

        public float getScaleX() {
            return this.f28407f;
        }

        public float getScaleY() {
            return this.f28408g;
        }

        public float getTranslateX() {
            return this.f28409h;
        }

        public float getTranslateY() {
            return this.f28410i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f28405d) {
                this.f28405d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f28406e) {
                this.f28406e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f28404c) {
                this.f28404c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f28407f) {
                this.f28407f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f28408g) {
                this.f28408g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f28409h) {
                this.f28409h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f28410i) {
                this.f28410i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f28403a = new Matrix();
            this.b = new ArrayList<>();
            this.f28404c = 0.0f;
            this.f28405d = 0.0f;
            this.f28406e = 0.0f;
            this.f28407f = 1.0f;
            this.f28408g = 1.0f;
            this.f28409h = 0.0f;
            this.f28410i = 0.0f;
            this.f28411j = new Matrix();
            this.f28414m = null;
        }
    }
}
