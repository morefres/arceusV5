package n4;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import u2.m;

/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: i, reason: collision with root package name */
    public Executor f25736i;

    /* renamed from: j, reason: collision with root package name */
    public volatile a<D>.RunnableC0452a f25737j;

    /* renamed from: k, reason: collision with root package name */
    public volatile a<D>.RunnableC0452a f25738k;

    /* renamed from: l, reason: collision with root package name */
    public long f25739l;

    /* renamed from: m, reason: collision with root package name */
    public long f25740m;

    /* renamed from: n, reason: collision with root package name */
    public Handler f25741n;

    /* renamed from: n4.a$a, reason: collision with other inner class name */
    public final class RunnableC0452a extends c<D> implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        public boolean f25742f;

        public RunnableC0452a() {
        }

        @Override // n4.c
        public D b() {
            try {
                return (D) a.this.E();
            } catch (m e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // n4.c
        public void g(D d10) {
            a.this.y(this, d10);
        }

        @Override // n4.c
        public void h(D d10) {
            a.this.z(this, d10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f25742f = false;
            a.this.A();
        }
    }

    public a(@NonNull Context context) {
        super(context);
        this.f25740m = -10000L;
    }

    public void A() {
        if (this.f25738k != null || this.f25737j == null) {
            return;
        }
        if (this.f25737j.f25742f) {
            this.f25737j.f25742f = false;
            this.f25741n.removeCallbacks(this.f25737j);
        }
        if (this.f25739l > 0 && SystemClock.uptimeMillis() < this.f25740m + this.f25739l) {
            this.f25737j.f25742f = true;
            this.f25741n.postAtTime(this.f25737j, this.f25740m + this.f25739l);
        } else {
            if (this.f25736i == null) {
                this.f25736i = B();
            }
            this.f25737j.c(this.f25736i);
        }
    }

    @NonNull
    public Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract D C();

    public void D(D d10) {
    }

    public D E() {
        return C();
    }

    @Override // n4.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f25737j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f25737j);
            printWriter.print(" waiting=");
            printWriter.println(this.f25737j.f25742f);
        }
        if (this.f25738k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f25738k);
            printWriter.print(" waiting=");
            printWriter.println(this.f25738k.f25742f);
        }
        if (this.f25739l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.f25739l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.f25740m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.f25740m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    @Override // n4.b
    public boolean l() {
        if (this.f25737j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.f25738k != null) {
            if (this.f25737j.f25742f) {
                this.f25737j.f25742f = false;
                this.f25741n.removeCallbacks(this.f25737j);
            }
            this.f25737j = null;
            return false;
        }
        if (this.f25737j.f25742f) {
            this.f25737j.f25742f = false;
            this.f25741n.removeCallbacks(this.f25737j);
            this.f25737j = null;
            return false;
        }
        boolean a10 = this.f25737j.a(false);
        if (a10) {
            this.f25738k = this.f25737j;
            x();
        }
        this.f25737j = null;
        return a10;
    }

    @Override // n4.b
    public void n() {
        super.n();
        b();
        this.f25737j = new RunnableC0452a();
        A();
    }

    public void x() {
    }

    public void y(a<D>.RunnableC0452a runnableC0452a, D d10) {
        D(d10);
        if (this.f25738k == runnableC0452a) {
            t();
            this.f25740m = SystemClock.uptimeMillis();
            this.f25738k = null;
            e();
            A();
        }
    }

    public void z(a<D>.RunnableC0452a runnableC0452a, D d10) {
        if (this.f25737j != runnableC0452a) {
            y(runnableC0452a, d10);
            return;
        }
        if (i()) {
            D(d10);
            return;
        }
        c();
        this.f25740m = SystemClock.uptimeMillis();
        this.f25737j = null;
        f(d10);
    }
}
