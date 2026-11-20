package ev;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final i f16316a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final c f16317c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16318d;

    public f(c cVar, Looper looper, int i10) {
        super(looper);
        this.f16317c = cVar;
        this.b = i10;
        this.f16316a = new i();
    }

    public void a(n nVar, Object obj) {
        h a10 = h.a(nVar, obj);
        synchronized (this) {
            try {
                this.f16316a.a(a10);
                if (!this.f16318d) {
                    this.f16318d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new e("Could not send handler message");
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                h b = this.f16316a.b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f16316a.b();
                        if (b == null) {
                            this.f16318d = false;
                            return;
                        }
                    }
                }
                this.f16317c.g(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.b);
            if (!sendMessage(obtainMessage())) {
                throw new e("Could not send handler message");
            }
            this.f16318d = true;
        } catch (Throwable th2) {
            this.f16318d = false;
            throw th2;
        }
    }
}
