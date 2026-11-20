package nb;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ec implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26194a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26195c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzr f26196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f26197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc f26198f;

    public ec(tc tcVar, AtomicReference atomicReference, String str, String str2, String str3, zzr zzrVar, boolean z10) {
        this.f26194a = atomicReference;
        this.b = str2;
        this.f26195c = str3;
        this.f26196d = zzrVar;
        this.f26197e = z10;
        Objects.requireNonNull(tcVar);
        this.f26198f = tcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        tc tcVar;
        d5 N;
        AtomicReference atomicReference2 = this.f26194a;
        synchronized (atomicReference2) {
            try {
                try {
                    tcVar = this.f26198f;
                    N = tcVar.N();
                } catch (RemoteException e10) {
                    this.f26198f.f26328a.a().o().d("(legacy) Failed to get user properties; remote exception", null, this.b, e10);
                    this.f26194a.set(Collections.EMPTY_LIST);
                    atomicReference = this.f26194a;
                }
                if (N == null) {
                    tcVar.f26328a.a().o().d("(legacy) Failed to get user properties; not connected to service", null, this.b, this.f26195c);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    zzr zzrVar = this.f26196d;
                    n9.m.l(zzrVar);
                    atomicReference2.set(N.Y1(this.b, this.f26195c, this.f26197e, zzrVar));
                } else {
                    atomicReference2.set(N.o(null, this.b, this.f26195c, this.f26197e));
                }
                tcVar.J();
                atomicReference = this.f26194a;
                atomicReference.notify();
            } catch (Throwable th2) {
                this.f26194a.notify();
                throw th2;
            }
        }
    }
}
