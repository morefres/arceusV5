package ih;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    public Handler f20929c;
    public c b = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    public ih.a f20930d = new a();

    /* renamed from: e, reason: collision with root package name */
    public Runnable f20931e = new RunnableC0365b();

    /* renamed from: a, reason: collision with root package name */
    public Queue<ih.c> f20928a = new ArrayBlockingQueue(20);

    public class a implements ih.a {
        public a() {
        }

        @Override // ih.a
        public void a() {
            b.this.b = c.IDLE;
            b.this.c();
        }
    }

    /* renamed from: ih.b$b, reason: collision with other inner class name */
    public class RunnableC0365b implements Runnable {
        public RunnableC0365b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c();
        }
    }

    public enum c {
        IDLE,
        PROCESSING
    }

    public b() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f20929c = new Handler();
    }

    public void b(ih.c cVar) {
        try {
            this.f20928a.add(cVar);
        } catch (IllegalStateException unused) {
            Log.e("RbxBlockingQueue", "Queue full! Cannot add more reports.");
        }
        c();
    }

    public void c() {
        c cVar = this.b;
        c cVar2 = c.IDLE;
        if (cVar == cVar2) {
            this.b = c.PROCESSING;
            ih.c peek = this.f20928a.peek();
            if (peek == null || !peek.b()) {
                this.b = cVar2;
                this.f20929c.removeCallbacks(this.f20931e);
                if (this.f20928a.size() > 0) {
                    this.f20929c.postDelayed(this.f20931e, 10000L);
                    return;
                }
                return;
            }
            ih.c poll = this.f20928a.poll();
            if (poll != null) {
                poll.a(this.f20930d);
            } else {
                this.b = cVar2;
            }
        }
    }
}
