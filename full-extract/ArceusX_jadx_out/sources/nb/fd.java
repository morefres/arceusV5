package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class fd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f26223a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gd f26224c;

    public fd(gd gdVar, long j10, long j11) {
        Objects.requireNonNull(gdVar);
        this.f26224c = gdVar;
        this.f26223a = j10;
        this.b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26224c.b.f26328a.b().t(new Runnable() { // from class: nb.ed
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                fd fdVar = fd.this;
                ld ldVar = fdVar.f26224c.b;
                ldVar.h();
                g7 g7Var = ldVar.f26328a;
                g7Var.a().v().a("Application going to the background");
                g7Var.x().f26388t.b(true);
                ldVar.o(true);
                if (!g7Var.w().N()) {
                    long j10 = fdVar.b;
                    jd jdVar = ldVar.f26438f;
                    jdVar.d(false, false, j10);
                    jdVar.b(j10);
                }
                g7Var.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(fdVar.f26223a));
                g7 g7Var2 = ldVar.f26328a;
                qa B = g7Var2.B();
                B.h();
                g7 g7Var3 = B.f26328a;
                B.j();
                tc J = g7Var3.J();
                J.h();
                J.j();
                if (!J.y() || J.f26328a.C().W() >= 242600) {
                    g7Var3.J().t();
                }
                if (g7Var.w().H(null, z4.O0)) {
                    long D = g7Var.C().P(g7Var.d().getPackageName(), g7Var.w().R()) ? 1000L : g7Var.w().D(g7Var.d().getPackageName(), z4.E);
                    g7Var.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(D));
                    g7Var2.N().o(D);
                }
            }
        });
    }
}
