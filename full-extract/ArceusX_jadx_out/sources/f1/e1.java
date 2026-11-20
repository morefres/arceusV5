package f1;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e1 implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f16401a;
    public final r0 b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16402c;

    /* renamed from: d, reason: collision with root package name */
    public final u f16403d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16404e;

    /* renamed from: f, reason: collision with root package name */
    public final p0.d f16405f;

    public e1(r0 r0Var, long j10, u uVar, boolean z10, boolean z11) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f16401a = atomicBoolean;
        p0.d b = p0.d.b();
        this.f16405f = b;
        this.b = r0Var;
        this.f16402c = j10;
        this.f16403d = uVar;
        this.f16404e = z10;
        if (z11) {
            atomicBoolean.set(true);
        } else {
            b.c("stop");
        }
    }

    public static e1 a(w wVar, long j10) {
        x2.g.h(wVar, "The given PendingRecording cannot be null.");
        return new e1(wVar.getRecorder(), j10, wVar.getOutputOptions(), wVar.getIsPersistent(), true);
    }

    public static e1 b(w wVar, long j10) {
        x2.g.h(wVar, "The given PendingRecording cannot be null.");
        return new e1(wVar.getRecorder(), j10, wVar.getOutputOptions(), wVar.getIsPersistent(), false);
    }

    public u c() {
        return this.f16403d;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        f(0, null);
    }

    public long d() {
        return this.f16402c;
    }

    public void e() {
        close();
    }

    public final void f(int i10, Throwable th2) {
        this.f16405f.a();
        if (this.f16401a.getAndSet(true)) {
            return;
        }
        this.b.x0(this, i10, th2);
    }

    public void finalize() {
        try {
            this.f16405f.d();
            f(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }
}
