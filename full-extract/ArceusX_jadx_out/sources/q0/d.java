package q0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static volatile d f29483a;

    public static Executor b() {
        if (f29483a != null) {
            return f29483a;
        }
        synchronized (d.class) {
            try {
                if (f29483a == null) {
                    f29483a = new d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f29483a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
