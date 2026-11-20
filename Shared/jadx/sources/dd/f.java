package dd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import dd.b;
import dd.h;

/* loaded from: classes2.dex */
public final class f<S extends b> extends g {

    /* renamed from: u, reason: collision with root package name */
    public static final y3.c<f<?>> f14528u = new a("indicatorLevel");

    /* renamed from: p, reason: collision with root package name */
    public h<S> f14529p;

    /* renamed from: q, reason: collision with root package name */
    public final y3.f f14530q;

    /* renamed from: r, reason: collision with root package name */
    public final y3.e f14531r;

    /* renamed from: s, reason: collision with root package name */
    public final h.a f14532s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14533t;

    public class a extends y3.c<f<?>> {
        public a(String str) {
            super(str);
        }

        @Override // y3.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(f<?> fVar) {
            return fVar.x() * 10000.0f;
        }

        @Override // y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(f<?> fVar, float f10) {
            fVar.z(f10 / 10000.0f);
        }
    }

    public f(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar) {
        super(context, bVar);
        this.f14533t = false;
        y(hVar);
        this.f14532s = new h.a();
        y3.f fVar = new y3.f();
        this.f14530q = fVar;
        fVar.d(1.0f);
        fVar.f(50.0f);
        y3.e eVar = new y3.e(this, f14528u);
        this.f14531r = eVar;
        eVar.w(fVar);
        n(1.0f);
    }

    @NonNull
    public static f<e> v(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        return new f<>(context, eVar, cVar);
    }

    public void A(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f14529p.g(canvas, getBounds(), h(), k(), j());
            this.f14546m.setStyle(Paint.Style.FILL);
            this.f14546m.setAntiAlias(true);
            h.a aVar = this.f14532s;
            b bVar = this.b;
            aVar.f14552c = bVar.f14501c[0];
            int i10 = bVar.f14505g;
            if (i10 > 0) {
                this.f14529p.d(canvas, this.f14546m, x(), 1.0f, this.b.f14502d, getAlpha(), (int) ((i10 * s2.a.b(x(), 0.0f, 0.01f)) / 0.01f));
            } else {
                this.f14529p.d(canvas, this.f14546m, 0.0f, 1.0f, bVar.f14502d, getAlpha(), 0);
            }
            this.f14529p.c(canvas, this.f14546m, this.f14532s, getAlpha());
            this.f14529p.b(canvas, this.f14546m, this.b.f14501c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f14529p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f14529p.f();
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // dd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f14531r.x();
        z(getLevel() / 10000.0f);
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ void m(@NonNull p5.b bVar) {
        super.m(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        if (this.f14533t) {
            this.f14531r.x();
            z(i10 / 10000.0f);
            return true;
        }
        this.f14531r.m(x() * 10000.0f);
        this.f14531r.s(i10);
        return true;
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // dd.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        boolean r8 = super.r(z10, z11, z12);
        float a10 = this.f14536c.a(this.f14535a.getContentResolver());
        if (a10 == 0.0f) {
            this.f14533t = true;
            return r8;
        }
        this.f14533t = false;
        this.f14530q.f(50.0f / a10);
        return r8;
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean s(@NonNull p5.b bVar) {
        return super.s(bVar);
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // dd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // dd.g, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @NonNull
    public h<S> w() {
        return this.f14529p;
    }

    public final float x() {
        return this.f14532s.b;
    }

    public void y(@NonNull h<S> hVar) {
        this.f14529p = hVar;
    }

    public final void z(float f10) {
        this.f14532s.b = f10;
        invalidateSelf();
    }
}
