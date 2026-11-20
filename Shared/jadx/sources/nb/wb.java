package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbg;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbg f26776a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.x1 f26777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc f26778d;

    public wb(tc tcVar, zzbg zzbgVar, String str, com.google.android.gms.internal.measurement.x1 x1Var) {
        this.f26776a = zzbgVar;
        this.b = str;
        this.f26777c = x1Var;
        Objects.requireNonNull(tcVar);
        this.f26778d = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.x1 x1Var;
        ve C;
        tc tcVar;
        d5 N;
        byte[] bArr = null;
        try {
            try {
                tcVar = this.f26778d;
                N = tcVar.N();
            } catch (RemoteException e10) {
                this.f26778d.f26328a.a().o().b("Failed to send event to the service to bundle", e10);
            }
            if (N == null) {
                g7 g7Var = tcVar.f26328a;
                g7Var.a().o().a("Discarding data. Failed to send event to service to bundle");
                C = g7Var.C();
                x1Var = this.f26777c;
                C.d0(x1Var, bArr);
            }
            bArr = N.e0(this.f26776a, this.b);
            tcVar.J();
            tc tcVar2 = this.f26778d;
            x1Var = this.f26777c;
            C = tcVar2.f26328a.C();
            C.d0(x1Var, bArr);
        } catch (Throwable th2) {
            tc tcVar3 = this.f26778d;
            tcVar3.f26328a.C().d0(this.f26777c, null);
            throw th2;
        }
    }
}
