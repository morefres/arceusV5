package x0;

import g0.j2;
import g0.k2;
import g0.r1;
import g0.v2;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class y0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final k2 f34998a;
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final x2.a<Throwable> f34999c;

    public y0(g0.n nVar) {
        k2 f10 = nVar.f();
        Objects.requireNonNull(f10);
        this.f34998a = f10;
        this.b = nVar.c();
        this.f34999c = nVar.b();
    }

    @Override // x0.r0
    public void a() {
    }

    @Override // g0.k2
    public void b(final v2 v2Var) {
        try {
            this.b.execute(new Runnable() { // from class: x0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.this.f34998a.b(v2Var);
                }
            });
        } catch (RejectedExecutionException unused) {
            r1.c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    @Override // x0.r0
    public ne.x<Void> c(int i10, int i11) {
        return r0.n.n(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // g0.k2
    public void d(final j2 j2Var) {
        try {
            this.b.execute(new Runnable() { // from class: x0.x0
                @Override // java.lang.Runnable
                public final void run() {
                    y0.this.f34998a.d(j2Var);
                }
            });
        } catch (RejectedExecutionException unused) {
            r1.c("SurfaceProcessor", "SurfaceProcessor failed due to executor shutdown");
        }
    }

    public String toString() {
        return "SurfaceProcessorWithExecutor(" + this.f34998a + ")";
    }
}
