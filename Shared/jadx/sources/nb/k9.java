package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class k9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26399a;
    public final /* synthetic */ qa b;

    public k9(qa qaVar, AtomicReference atomicReference) {
        this.f26399a = atomicReference;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f26399a;
        synchronized (atomicReference) {
            try {
                try {
                    qa qaVar = this.b;
                    atomicReference.set(Boolean.valueOf(qaVar.f26328a.w().H(qaVar.f26328a.L().q(), z4.f26855b0)));
                } finally {
                    this.f26399a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
