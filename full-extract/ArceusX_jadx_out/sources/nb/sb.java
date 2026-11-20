package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26653a;
    public final /* synthetic */ tc b;

    public sb(tc tcVar, zzr zzrVar) {
        this.f26653a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().r().a("Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.f26653a;
            n9.m.l(zzrVar);
            N.S1(zzrVar);
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f26328a.a().o().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
