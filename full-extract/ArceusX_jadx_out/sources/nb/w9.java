package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26775a;
    public final /* synthetic */ qa b;

    public w9(qa qaVar, AtomicReference atomicReference) {
        this.f26775a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26775a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(Double.valueOf(qaVar.f26328a.w().G(qaVar.f26328a.L().q(), z4.f26867f0)));
                } finally {
                    this.f26775a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
