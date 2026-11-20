package hd;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import hd.k;
import hd.l;
import hd.m;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class g extends Drawable implements n {

    /* renamed from: x, reason: collision with root package name */
    public static final String f19231x = "g";

    /* renamed from: y, reason: collision with root package name */
    public static final Paint f19232y;

    /* renamed from: a, reason: collision with root package name */
    public c f19233a;
    public final m.g[] b;

    /* renamed from: c, reason: collision with root package name */
    public final m.g[] f19234c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f19235d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19236e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f19237f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f19238g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f19239h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f19240i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f19241j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f19242k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f19243l;

    /* renamed from: m, reason: collision with root package name */
    public k f19244m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f19245n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f19246o;

    /* renamed from: p, reason: collision with root package name */
    public final gd.a f19247p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final l.b f19248q;

    /* renamed from: r, reason: collision with root package name */
    public final l f19249r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f19250s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f19251t;

    /* renamed from: u, reason: collision with root package name */
    public int f19252u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final RectF f19253v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19254w;

    public class a implements l.b {
        public a() {
        }

        @Override // hd.l.b
        public void a(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f19235d.set(i10 + 4, mVar.e());
            g.this.f19234c[i10] = mVar.f(matrix);
        }

        @Override // hd.l.b
        public void b(@NonNull m mVar, Matrix matrix, int i10) {
            g.this.f19235d.set(i10, mVar.e());
            g.this.b[i10] = mVar.f(matrix);
        }
    }

    public class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f19256a;

        public b(float f10) {
            this.f19256a = f10;
        }

        @Override // hd.k.c
        @NonNull
        public hd.c a(@NonNull hd.c cVar) {
            return cVar instanceof i ? cVar : new hd.b(this.f19256a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f19232y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public static int V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    @NonNull
    public static g m(@NonNull Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(uc.a.c(context, ic.b.f20408o, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.Q(context);
        gVar.a0(colorStateList);
        gVar.Z(f10);
        return gVar;
    }

    public int A() {
        return this.f19252u;
    }

    public int B() {
        c cVar = this.f19233a;
        return (int) (cVar.f19274s * Math.sin(Math.toRadians(cVar.f19275t)));
    }

    public int C() {
        c cVar = this.f19233a;
        return (int) (cVar.f19274s * Math.cos(Math.toRadians(cVar.f19275t)));
    }

    public int D() {
        return this.f19233a.f19273r;
    }

    @NonNull
    public k E() {
        return this.f19233a.f19257a;
    }

    public ColorStateList F() {
        return this.f19233a.f19260e;
    }

    public final float G() {
        if (P()) {
            return this.f19246o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float H() {
        return this.f19233a.f19267l;
    }

    public ColorStateList I() {
        return this.f19233a.f19262g;
    }

    public float J() {
        return this.f19233a.f19257a.r().a(u());
    }

    public float K() {
        return this.f19233a.f19257a.t().a(u());
    }

    public float L() {
        return this.f19233a.f19271p;
    }

    public float M() {
        return w() + L();
    }

    public final boolean N() {
        c cVar = this.f19233a;
        int i10 = cVar.f19272q;
        if (i10 == 1 || cVar.f19273r <= 0) {
            return false;
        }
        return i10 == 2 || X();
    }

    public final boolean O() {
        Paint.Style style = this.f19233a.f19277v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean P() {
        Paint.Style style = this.f19233a.f19277v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f19246o.getStrokeWidth() > 0.0f;
    }

    public void Q(Context context) {
        this.f19233a.b = new xc.a(context);
        m0();
    }

    public final void R() {
        super.invalidateSelf();
    }

    public boolean S() {
        xc.a aVar = this.f19233a.b;
        return aVar != null && aVar.d();
    }

    public boolean T() {
        return this.f19233a.f19257a.u(u());
    }

    public final void U(@NonNull Canvas canvas) {
        if (N()) {
            canvas.save();
            W(canvas);
            if (!this.f19254w) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f19253v.width() - getBounds().width());
            int height = (int) (this.f19253v.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f19253v.width()) + (this.f19233a.f19273r * 2) + width, ((int) this.f19253v.height()) + (this.f19233a.f19273r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (getBounds().left - this.f19233a.f19273r) - width;
            float f11 = (getBounds().top - this.f19233a.f19273r) - height;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final void W(@NonNull Canvas canvas) {
        canvas.translate(B(), C());
    }

    public boolean X() {
        return (T() || this.f19238g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(@NonNull hd.c cVar) {
        setShapeAppearanceModel(this.f19233a.f19257a.x(cVar));
    }

    public void Z(float f10) {
        c cVar = this.f19233a;
        if (cVar.f19270o != f10) {
            cVar.f19270o = f10;
            m0();
        }
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f19233a;
        if (cVar.f19259d != colorStateList) {
            cVar.f19259d = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f10) {
        c cVar = this.f19233a;
        if (cVar.f19266k != f10) {
            cVar.f19266k = f10;
            this.f19236e = true;
            invalidateSelf();
        }
    }

    public void c0(int i10, int i11, int i12, int i13) {
        c cVar = this.f19233a;
        if (cVar.f19264i == null) {
            cVar.f19264i = new Rect();
        }
        this.f19233a.f19264i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void d0(float f10) {
        c cVar = this.f19233a;
        if (cVar.f19269n != f10) {
            cVar.f19269n = f10;
            m0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f19245n.setColorFilter(this.f19250s);
        int alpha = this.f19245n.getAlpha();
        this.f19245n.setAlpha(V(alpha, this.f19233a.f19268m));
        this.f19246o.setColorFilter(this.f19251t);
        this.f19246o.setStrokeWidth(this.f19233a.f19267l);
        int alpha2 = this.f19246o.getAlpha();
        this.f19246o.setAlpha(V(alpha2, this.f19233a.f19268m));
        if (this.f19236e) {
            i();
            g(u(), this.f19238g);
            this.f19236e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f19245n.setAlpha(alpha);
        this.f19246o.setAlpha(alpha2);
    }

    public void e0(boolean z10) {
        this.f19254w = z10;
    }

    public final PorterDuffColorFilter f(@NonNull Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int l10 = l(color);
        this.f19252u = l10;
        if (l10 != color) {
            return new PorterDuffColorFilter(l10, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public void f0(int i10) {
        this.f19247p.d(i10);
        this.f19233a.f19276u = false;
        R();
    }

    public final void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f19233a.f19265j != 1.0f) {
            this.f19237f.reset();
            Matrix matrix = this.f19237f;
            float f10 = this.f19233a.f19265j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f19237f);
        }
        path.computeBounds(this.f19253v, true);
    }

    public void g0(float f10, int i10) {
        j0(f10);
        i0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f19233a.f19268m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f19233a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public void getOutline(@NonNull Outline outline) {
        if (this.f19233a.f19272q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f19233a.f19266k);
        } else {
            g(u(), this.f19238g);
            wc.c.k(outline, this.f19238g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f19233a.f19264i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f19242k.set(getBounds());
        g(u(), this.f19238g);
        this.f19243l.setPath(this.f19238g, this.f19242k);
        this.f19242k.op(this.f19243l, Region.Op.DIFFERENCE);
        return this.f19242k;
    }

    public final void h(@NonNull RectF rectF, @NonNull Path path) {
        l lVar = this.f19249r;
        c cVar = this.f19233a;
        lVar.e(cVar.f19257a, cVar.f19266k, rectF, this.f19248q, path);
    }

    public void h0(float f10, ColorStateList colorStateList) {
        j0(f10);
        i0(colorStateList);
    }

    public final void i() {
        k y10 = E().y(new b(-G()));
        this.f19244m = y10;
        this.f19249r.d(y10, this.f19233a.f19266k, v(), this.f19239h);
    }

    public void i0(ColorStateList colorStateList) {
        c cVar = this.f19233a;
        if (cVar.f19260e != colorStateList) {
            cVar.f19260e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f19236e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f19233a.f19262g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f19233a.f19261f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f19233a.f19260e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f19233a.f19259d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @NonNull
    public final PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f19252u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public void j0(float f10) {
        this.f19233a.f19267l = f10;
        invalidateSelf();
    }

    @NonNull
    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, @NonNull Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public final boolean k0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f19233a.f19259d == null || color2 == (colorForState2 = this.f19233a.f19259d.getColorForState(iArr, (color2 = this.f19245n.getColor())))) {
            z10 = false;
        } else {
            this.f19245n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f19233a.f19260e == null || color == (colorForState = this.f19233a.f19260e.getColorForState(iArr, (color = this.f19246o.getColor())))) {
            return z10;
        }
        this.f19246o.setColor(colorForState);
        return true;
    }

    public int l(int i10) {
        float M = M() + z();
        xc.a aVar = this.f19233a.b;
        return aVar != null ? aVar.c(i10, M) : i10;
    }

    public final boolean l0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f19250s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f19251t;
        c cVar = this.f19233a;
        this.f19250s = k(cVar.f19262g, cVar.f19263h, this.f19245n, true);
        c cVar2 = this.f19233a;
        this.f19251t = k(cVar2.f19261f, cVar2.f19263h, this.f19246o, false);
        c cVar3 = this.f19233a;
        if (cVar3.f19276u) {
            this.f19247p.d(cVar3.f19262g.getColorForState(getState(), 0));
        }
        return (x2.b.a(porterDuffColorFilter, this.f19250s) && x2.b.a(porterDuffColorFilter2, this.f19251t)) ? false : true;
    }

    public final void m0() {
        float M = M();
        this.f19233a.f19273r = (int) Math.ceil(0.75f * M);
        this.f19233a.f19274s = (int) Math.ceil(M * 0.25f);
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f19233a = new c(this.f19233a);
        return this;
    }

    public final void n(@NonNull Canvas canvas) {
        if (this.f19235d.cardinality() > 0) {
            Log.w(f19231x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f19233a.f19274s != 0) {
            canvas.drawPath(this.f19238g, this.f19247p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.b[i10].b(this.f19247p, this.f19233a.f19273r, canvas);
            this.f19234c[i10].b(this.f19247p, this.f19233a.f19273r, canvas);
        }
        if (this.f19254w) {
            int B = B();
            int C = C();
            canvas.translate(-B, -C);
            canvas.drawPath(this.f19238g, f19232y);
            canvas.translate(B, C);
        }
    }

    public final void o(@NonNull Canvas canvas) {
        q(canvas, this.f19245n, this.f19238g, this.f19233a.f19257a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f19236e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, ad.m.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = k0(iArr) || l0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public void p(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        q(canvas, paint, path, this.f19233a.f19257a, rectF);
    }

    public final void q(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull k kVar, @NonNull RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a10 = kVar.t().a(rectF) * this.f19233a.f19266k;
            canvas.drawRoundRect(rectF, a10, a10, paint);
        }
    }

    public void r(@NonNull Canvas canvas) {
        q(canvas, this.f19246o, this.f19239h, this.f19244m, v());
    }

    public float s() {
        return this.f19233a.f19257a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f19233a;
        if (cVar.f19268m != i10) {
            cVar.f19268m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19233a.f19258c = colorFilter;
        R();
    }

    @Override // hd.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f19233a.f19257a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f19233a.f19262g = colorStateList;
        l0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f19233a;
        if (cVar.f19263h != mode) {
            cVar.f19263h = mode;
            l0();
            R();
        }
    }

    public float t() {
        return this.f19233a.f19257a.l().a(u());
    }

    @NonNull
    public RectF u() {
        this.f19240i.set(getBounds());
        return this.f19240i;
    }

    @NonNull
    public final RectF v() {
        this.f19241j.set(u());
        float G = G();
        this.f19241j.inset(G, G);
        return this.f19241j;
    }

    public float w() {
        return this.f19233a.f19270o;
    }

    public ColorStateList x() {
        return this.f19233a.f19259d;
    }

    public float y() {
        return this.f19233a.f19266k;
    }

    public float z() {
        return this.f19233a.f19269n;
    }

    public g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(@NonNull k kVar) {
        this(new c(kVar, null));
    }

    public g(@NonNull c cVar) {
        l lVar;
        this.b = new m.g[4];
        this.f19234c = new m.g[4];
        this.f19235d = new BitSet(8);
        this.f19237f = new Matrix();
        this.f19238g = new Path();
        this.f19239h = new Path();
        this.f19240i = new RectF();
        this.f19241j = new RectF();
        this.f19242k = new Region();
        this.f19243l = new Region();
        Paint paint = new Paint(1);
        this.f19245n = paint;
        Paint paint2 = new Paint(1);
        this.f19246o = paint2;
        this.f19247p = new gd.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f19249r = lVar;
        this.f19253v = new RectF();
        this.f19254w = true;
        this.f19233a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l0();
        k0(getState());
        this.f19248q = new a();
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public k f19257a;
        public xc.a b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f19258c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f19259d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f19260e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f19261f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f19262g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f19263h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f19264i;

        /* renamed from: j, reason: collision with root package name */
        public float f19265j;

        /* renamed from: k, reason: collision with root package name */
        public float f19266k;

        /* renamed from: l, reason: collision with root package name */
        public float f19267l;

        /* renamed from: m, reason: collision with root package name */
        public int f19268m;

        /* renamed from: n, reason: collision with root package name */
        public float f19269n;

        /* renamed from: o, reason: collision with root package name */
        public float f19270o;

        /* renamed from: p, reason: collision with root package name */
        public float f19271p;

        /* renamed from: q, reason: collision with root package name */
        public int f19272q;

        /* renamed from: r, reason: collision with root package name */
        public int f19273r;

        /* renamed from: s, reason: collision with root package name */
        public int f19274s;

        /* renamed from: t, reason: collision with root package name */
        public int f19275t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f19276u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f19277v;

        public c(@NonNull k kVar, xc.a aVar) {
            this.f19259d = null;
            this.f19260e = null;
            this.f19261f = null;
            this.f19262g = null;
            this.f19263h = PorterDuff.Mode.SRC_IN;
            this.f19264i = null;
            this.f19265j = 1.0f;
            this.f19266k = 1.0f;
            this.f19268m = 255;
            this.f19269n = 0.0f;
            this.f19270o = 0.0f;
            this.f19271p = 0.0f;
            this.f19272q = 0;
            this.f19273r = 0;
            this.f19274s = 0;
            this.f19275t = 0;
            this.f19276u = false;
            this.f19277v = Paint.Style.FILL_AND_STROKE;
            this.f19257a = kVar;
            this.b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f19236e = true;
            return gVar;
        }

        public c(@NonNull c cVar) {
            this.f19259d = null;
            this.f19260e = null;
            this.f19261f = null;
            this.f19262g = null;
            this.f19263h = PorterDuff.Mode.SRC_IN;
            this.f19264i = null;
            this.f19265j = 1.0f;
            this.f19266k = 1.0f;
            this.f19268m = 255;
            this.f19269n = 0.0f;
            this.f19270o = 0.0f;
            this.f19271p = 0.0f;
            this.f19272q = 0;
            this.f19273r = 0;
            this.f19274s = 0;
            this.f19275t = 0;
            this.f19276u = false;
            this.f19277v = Paint.Style.FILL_AND_STROKE;
            this.f19257a = cVar.f19257a;
            this.b = cVar.b;
            this.f19267l = cVar.f19267l;
            this.f19258c = cVar.f19258c;
            this.f19259d = cVar.f19259d;
            this.f19260e = cVar.f19260e;
            this.f19263h = cVar.f19263h;
            this.f19262g = cVar.f19262g;
            this.f19268m = cVar.f19268m;
            this.f19265j = cVar.f19265j;
            this.f19274s = cVar.f19274s;
            this.f19272q = cVar.f19272q;
            this.f19276u = cVar.f19276u;
            this.f19266k = cVar.f19266k;
            this.f19269n = cVar.f19269n;
            this.f19270o = cVar.f19270o;
            this.f19271p = cVar.f19271p;
            this.f19273r = cVar.f19273r;
            this.f19275t = cVar.f19275t;
            this.f19261f = cVar.f19261f;
            this.f19277v = cVar.f19277v;
            if (cVar.f19264i != null) {
                this.f19264i = new Rect(cVar.f19264i);
            }
        }
    }
}
