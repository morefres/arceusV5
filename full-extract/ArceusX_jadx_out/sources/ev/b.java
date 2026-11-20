package ev;

import android.util.Log;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final i f16278a = new i();
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f16279c;

    public b(c cVar) {
        this.b = cVar;
    }

    public void a(n nVar, Object obj) {
        h a10 = h.a(nVar, obj);
        synchronized (this) {
            try {
                this.f16278a.a(a10);
                if (!this.f16279c) {
                    this.f16279c = true;
                    this.b.e().execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    h c10 = this.f16278a.c(1000);
                    if (c10 == null) {
                        synchronized (this) {
                            c10 = this.f16278a.b();
                            if (c10 == null) {
                                this.f16279c = false;
                                this.f16279c = false;
                                return;
                            }
                        }
                    }
                    this.b.g(c10);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f16279c = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f16279c = false;
                throw th2;
            }
        }
    }
}
