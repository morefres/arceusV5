package nb;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class lb extends f5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26433a;

    public lb(tc tcVar, AtomicReference atomicReference) {
        this.f26433a = atomicReference;
        Objects.requireNonNull(tcVar);
    }

    @Override // nb.g5
    public final void x0(List list) {
        AtomicReference atomicReference = this.f26433a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
