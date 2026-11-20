package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26712a;
    public final /* synthetic */ qa b;

    public u9(qa qaVar, AtomicReference atomicReference) {
        this.f26712a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26712a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(Long.valueOf(qaVar.f26328a.w().D(qaVar.f26328a.L().q(), z4.f26861d0)));
                } finally {
                    this.f26712a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
