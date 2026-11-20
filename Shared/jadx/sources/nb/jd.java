package nb;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jd {

    /* renamed from: a, reason: collision with root package name */
    public long f26345a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public final w f26346c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f26347d;

    public jd(ld ldVar) {
        Objects.requireNonNull(ldVar);
        this.f26347d = ldVar;
        this.f26346c = new hd(this, ldVar.f26328a);
        long b = ldVar.f26328a.e().b();
        this.f26345a = b;
        this.b = b;
    }

    public final void a(long j10) {
        this.f26347d.h();
        this.f26346c.d();
        this.f26345a = j10;
        this.b = j10;
    }

    public final void b(long j10) {
        this.f26346c.d();
    }

    public final void c() {
        this.f26346c.d();
        long b = this.f26347d.f26328a.e().b();
        this.f26345a = b;
        this.b = b;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        ld ldVar = this.f26347d;
        ldVar.h();
        ldVar.j();
        if (ldVar.f26328a.g()) {
            g7 g7Var = ldVar.f26328a;
            g7Var.x().f26385q.b(g7Var.e().a());
        }
        long j11 = j10 - this.f26345a;
        if (!z10 && j11 < 1000) {
            ldVar.f26328a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.b;
            this.b = j10;
        }
        g7 g7Var2 = ldVar.f26328a;
        g7Var2.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !g7Var2.w().N();
        g7 g7Var3 = ldVar.f26328a;
        ve.k0(g7Var3.I().q(z12), bundle, true);
        if (!z11) {
            g7Var3.B().t("auto", "_e", bundle);
        }
        this.f26345a = j10;
        w wVar = this.f26346c;
        wVar.d();
        wVar.b(((Long) z4.f26898r0.b(null)).longValue());
        return true;
    }
}
