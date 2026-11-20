package b8;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3904a;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f3905a;

        public a(Runnable runnable) {
            this.f3905a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3905a.run();
            } catch (Exception e10) {
                f8.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public m(Executor executor) {
        this.f3904a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3904a.execute(new a(runnable));
    }
}
