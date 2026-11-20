package nb;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class ld extends b5 {

    /* renamed from: c, reason: collision with root package name */
    public Handler f26435c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26436d;

    /* renamed from: e, reason: collision with root package name */
    public final kd f26437e;

    /* renamed from: f, reason: collision with root package name */
    public final jd f26438f;

    /* renamed from: g, reason: collision with root package name */
    public final gd f26439g;

    public ld(g7 g7Var) {
        super(g7Var);
        this.f26436d = true;
        this.f26437e = new kd(this);
        this.f26438f = new jd(this);
        this.f26439g = new gd(this);
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o(boolean z10) {
        h();
        this.f26436d = z10;
    }

    public final boolean p() {
        h();
        return this.f26436d;
    }

    public final /* synthetic */ void r(long j10) {
        h();
        q();
        g7 g7Var = this.f26328a;
        g7Var.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (g7Var.w().H(null, z4.V0)) {
            if (g7Var.w().N() || this.f26436d) {
                this.f26438f.a(j10);
            }
        } else if (g7Var.w().N() || g7Var.x().f26388t.a()) {
            this.f26438f.a(j10);
        }
        this.f26439g.a();
        kd kdVar = this.f26437e;
        ld ldVar = kdVar.f26407a;
        ldVar.h();
        if (ldVar.f26328a.g()) {
            kdVar.b(ldVar.f26328a.e().a(), false);
        }
    }

    public final /* synthetic */ void s(long j10) {
        h();
        q();
        g7 g7Var = this.f26328a;
        g7Var.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f26439g.b(j10);
        if (g7Var.w().N()) {
            this.f26438f.b(j10);
        }
    }

    public final /* synthetic */ Handler t() {
        return this.f26435c;
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f26435c == null) {
            this.f26435c = new com.google.android.gms.internal.measurement.q1(Looper.getMainLooper());
        }
    }
}
