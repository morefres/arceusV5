package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26615a;
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc f26616c;

    public qb(tc tcVar, zzr zzrVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26615a = zzrVar;
        this.b = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26616c = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ve C;
        tc tcVar;
        g7 g7Var;
        String str = null;
        try {
            try {
                tcVar = this.f26616c;
                g7Var = tcVar.f26328a;
            } catch (RemoteException e10) {
                this.f26616c.f26328a.a().o().b("Failed to get app instance id", e10);
            }
            if (g7Var.x().w().o(p8.ANALYTICS_STORAGE)) {
                d5 N = tcVar.N();
                if (N != null) {
                    zzr zzrVar = this.f26615a;
                    n9.m.l(zzrVar);
                    str = N.A0(zzrVar);
                    if (str != null) {
                        tcVar.f26328a.B().E(str);
                        g7Var.x().f26376h.b(str);
                    }
                    tcVar.J();
                    tc tcVar2 = this.f26616c;
                    x1Var = this.b;
                    C = tcVar2.f26328a.C();
                    C.a0(x1Var, str);
                }
                g7Var.a().o().a("Failed to get app instance id");
            } else {
                g7Var.a().t().a("Analytics storage consent denied; will not get app instance id");
                tcVar.f26328a.B().E(null);
                g7Var.x().f26376h.b(null);
            }
            C = g7Var.C();
            x1Var = this.b;
            C.a0(x1Var, str);
        } catch (Throwable th2) {
            tc tcVar3 = this.f26616c;
            tcVar3.f26328a.C().a0(this.b, null);
            throw th2;
        }
    }
}
