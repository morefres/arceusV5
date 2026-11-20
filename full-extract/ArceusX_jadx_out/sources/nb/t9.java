package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26684a;
    public final /* synthetic */ qa b;

    public t9(qa qaVar, AtomicReference atomicReference) {
        this.f26684a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26684a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(qaVar.f26328a.w().C(qaVar.f26328a.L().q(), z4.f26858c0));
                } finally {
                    this.f26684a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
