package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26162a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f26163c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26165e;

    public dc(tc tcVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26162a = str;
        this.b = str2;
        this.f26163c = zzrVar;
        this.f26164d = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26165e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ve C;
        tc tcVar;
        d5 N;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                tcVar = this.f26165e;
                N = tcVar.N();
            } catch (RemoteException e10) {
                this.f26165e.f26328a.a().o().d("Failed to get conditional properties; remote exception", this.f26162a, this.b, e10);
            }
            if (N == null) {
                g7 g7Var = tcVar.f26328a;
                g7Var.a().o().c("Failed to get conditional properties; not connected to service", this.f26162a, this.b);
                C = g7Var.C();
                x1Var = this.f26164d;
                C.g0(x1Var, arrayList);
            }
            zzr zzrVar = this.f26163c;
            n9.m.l(zzrVar);
            arrayList = ve.h0(N.e2(this.f26162a, this.b, zzrVar));
            tcVar.J();
            tc tcVar2 = this.f26165e;
            x1Var = this.f26164d;
            C = tcVar2.f26328a.C();
            C.g0(x1Var, arrayList);
        } catch (Throwable th2) {
            tc tcVar3 = this.f26165e;
            tcVar3.f26328a.C().g0(this.f26164d, arrayList);
            throw th2;
        }
    }
}
