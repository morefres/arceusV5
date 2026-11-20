package n4;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class c<Result> {

    /* renamed from: e, reason: collision with root package name */
    public static Handler f25751e;
    public volatile e b = e.PENDING;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f25753c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25754d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final FutureTask<Result> f25752a = new b(new a());

    public class a implements Callable<Result> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.f25754d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b();
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    public class b extends FutureTask<Result> {
        public b(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: n4.c$c, reason: collision with other inner class name */
    public class RunnableC0453c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f25757a;

        public RunnableC0453c(Object obj) {
            this.f25757a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            c.this.d(this.f25757a);
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25758a;

        static {
            int[] iArr = new int[e.values().length];
            f25758a = iArr;
            try {
                iArr[e.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25758a[e.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f25751e == null) {
                    f25751e = new Handler(Looper.getMainLooper());
                }
                handler = f25751e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f25753c.set(true);
        return this.f25752a.cancel(z10);
    }

    public abstract Result b();

    public final void c(@NonNull Executor executor) {
        if (this.b == e.PENDING) {
            this.b = e.RUNNING;
            executor.execute(this.f25752a);
            return;
        }
        int i10 = d.f25758a[this.b.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public void d(Result result) {
        if (f()) {
            g(result);
        } else {
            h(result);
        }
        this.b = e.FINISHED;
    }

    public final boolean f() {
        return this.f25753c.get();
    }

    public void g(Result result) {
    }

    public void h(Result result) {
    }

    public void i(Result result) {
        e().post(new RunnableC0453c(result));
    }

    public void j(Result result) {
        if (this.f25754d.get()) {
            return;
        }
        i(result);
    }
}
