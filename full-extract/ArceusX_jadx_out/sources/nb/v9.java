package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26731a;
    public final /* synthetic */ qa b;

    public v9(qa qaVar, AtomicReference atomicReference) {
        this.f26731a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26731a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(Integer.valueOf(qaVar.f26328a.w().E(qaVar.f26328a.L().q(), z4.f26864e0)));
                } finally {
                    this.f26731a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
