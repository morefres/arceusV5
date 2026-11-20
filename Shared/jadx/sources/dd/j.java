package dd;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import dd.b;
import dd.h;

/* loaded from: classes2.dex */
public final class j<S extends b> extends g {

    /* renamed from: p, reason: collision with root package name */
    public h<S> f14555p;

    /* renamed from: q, reason: collision with root package name */
    public i<ObjectAnimator> f14556q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f14557r;

    public j(@NonNull Context context, @NonNull b bVar, @NonNull h<S> hVar, @NonNull i<ObjectAnimator> iVar) {
        super(context, bVar);
        y(hVar);
        x(iVar);
    }

    @NonNull
    public static j<e> t(@NonNull Context context, @NonNull e eVar, @NonNull c cVar) {
        j<e> jVar = new j<>(context, eVar, cVar, new d(eVar));
        jVar.z(p5.f.b(context.getResources(), ic.e.f20468d, null));
        return jVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i10;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (w() && (drawable = this.f14557r) != null) {
                drawable.setBounds(getBounds());
                q2.a.n(this.f14557r, this.b.f14501c[0]);
                this.f14557r.draw(canvas);
                return;
            }
            canvas.save();
            this.f14555p.g(canvas, getBounds(), h(), k(), j());
            int i11 = this.b.f14505g;
            int alpha = getAlpha();
            if (i11 == 0) {
                this.f14555p.d(canvas, this.f14546m, 0.0f, 1.0f, this.b.f14502d, alpha, 0);
                i10 = i11;
            } else {
                h.a aVar = this.f14556q.b.get(0);
                alpha = 0;
                i10 = i11;
                this.f14555p.d(canvas, this.f14546m, this.f14556q.b.get(r1.size() - 1).b, 1.0f + aVar.f14551a, this.b.f14502d, 0, i10);
            }
            for (int i12 = 0; i12 < this.f14556q.b.size(); i12++) {
                h.a aVar2 = this.f14556q.b.get(i12);
                this.f14555p.c(canvas, this.f14546m, aVar2, getAlpha());
                if (i12 > 0 && i10 > 0) {
                    this.f14555p.d(canvas, this.f14546m, this.f14556q.b.get(i12 - 1).b, aVar2.f14551a, this.b.f14502d, alpha, i10);
                }
            }
            canvas.restore();
        }
    }

    @Override // dd.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f14555p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f14555p.f();
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

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ void m(@NonNull p5.b bVar) {
        super.m(bVar);
    }

    @Override // dd.g
    public /* bridge */ /* synthetic */ boolean q(boolean z10, boolean z11, boolean z12) {
        return super.q(z10, z11, z12);
    }

    @Override // dd.g
    public boolean r(boolean z10, boolean z11, boolean z12) {
        Drawable drawable;
        boolean r8 = super.r(z10, z11, z12);
        if (w() && (drawable = this.f14557r) != null) {
            return drawable.setVisible(z10, z11);
        }
        if (!isRunning()) {
            this.f14556q.a();
        }
        if (!z10 || !z12) {
            return r8;
        }
        this.f14556q.g();
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
    public i<ObjectAnimator> u() {
        return this.f14556q;
    }

    @NonNull
    public h<S> v() {
        return this.f14555p;
    }

    public final boolean w() {
        a aVar = this.f14536c;
        return aVar != null && aVar.a(this.f14535a.getContentResolver()) == 0.0f;
    }

    public void x(@NonNull i<ObjectAnimator> iVar) {
        this.f14556q = iVar;
        iVar.e(this);
    }

    public void y(@NonNull h<S> hVar) {
        this.f14555p = hVar;
    }

    public void z(Drawable drawable) {
        this.f14557r = drawable;
    }
}
