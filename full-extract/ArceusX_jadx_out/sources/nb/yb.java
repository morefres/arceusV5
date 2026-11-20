package nb;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzr f26839a;
    public final /* synthetic */ tc b;

    public yb(tc tcVar, zzr zzrVar) {
        this.f26839a = zzrVar;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b;
        d5 N = tcVar.N();
        if (N == null) {
            tcVar.f26328a.a().o().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzr zzrVar = this.f26839a;
            n9.m.l(zzrVar);
            N.W(zzrVar);
            tcVar.J();
        } catch (RemoteException e10) {
            this.b.f26328a.a().o().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
