package nb;

import com.google.android.gms.measurement.internal.zzoq;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class mb extends i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26453a;
    public final /* synthetic */ tc b;

    public mb(tc tcVar, AtomicReference atomicReference) {
        this.f26453a = atomicReference;
        Objects.requireNonNull(tcVar);
        this.b = tcVar;
    }

    @Override // nb.j5
    public final void M1(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f26453a;
        synchronized (atomicReference) {
            this.b.f26328a.a().w().b("[sgtm] Got upload batches from service. count", Integer.valueOf(zzoqVar.f7486f.size()));
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
