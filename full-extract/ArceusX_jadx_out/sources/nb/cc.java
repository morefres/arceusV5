package nb;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class cc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26137a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26138c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f26139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tc f26140e;

    public cc(tc tcVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar) {
        this.f26137a = atomicReference;
        this.b = str2;
        this.f26138c = str3;
        this.f26139d = zzrVar;
        Objects.requireNonNull(tcVar);
        this.f26140e = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        tc tcVar;
        d5 N;
        AtomicReference atomicReference2 = this.f26137a;
        synchronized (atomicReference2) {
            try {
                try {
                    tcVar = this.f26140e;
                    N = tcVar.N();
                } catch (RemoteException e10) {
                    this.f26140e.f26328a.a().o().d("(legacy) Failed to get conditional properties; remote exception", null, this.b, e10);
                    this.f26137a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f26137a;
                }
                if (N == null) {
                    tcVar.f26328a.a().o().d("(legacy) Failed to get conditional properties; not connected to service", null, this.b, this.f26138c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.f26139d;
                    n9.m.l(zzrVar);
                    atomicReference2.set(N.e2(this.b, this.f26138c, zzrVar));
                } else {
                    atomicReference2.set(N.K(null, this.b, this.f26138c));
                }
                tcVar.J();
                atomicReference = this.f26137a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f26137a.notify();
                throw th2;
            }
        }
    }
}
