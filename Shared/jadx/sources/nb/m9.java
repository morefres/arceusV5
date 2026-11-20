package nb;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26451a;
    public final /* synthetic */ qa b;

    public m9(qa qaVar, long j10) {
        this.f26451a = j10;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        qaVar.h();
        qaVar.j();
        g7 g7Var = qaVar.f26328a;
        g7Var.a().v().a("Resetting analytics data (FE)");
        g7 g7Var2 = qaVar.f26328a;
        ld z10 = g7Var2.z();
        z10.h();
        z10.f26438f.c();
        g7Var2.L().p();
        boolean z11 = !qaVar.f26328a.g();
        k6 x10 = g7Var.x();
        x10.f26374f.b(this.f26451a);
        g7 g7Var3 = x10.f26328a;
        if (!TextUtils.isEmpty(g7Var3.x().f26391w.a())) {
            x10.f26391w.b(null);
        }
        x10.f26385q.b(0L);
        x10.f26386r.b(0L);
        if (!g7Var3.w().L()) {
            x10.y(z11);
        }
        x10.f26392x.b(null);
        x10.f26393y.b(0L);
        x10.f26394z.b(null);
        g7Var2.J().p();
        g7Var2.z().f26437e.a();
        qaVar.f26610s = z11;
        g7Var2.J().q(new AtomicReference());
    }
}
