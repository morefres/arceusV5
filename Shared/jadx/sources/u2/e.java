package u2;

import android.os.CancellationSignal;

@Deprecated
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32589a;
    public a b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32590c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32591d;

    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f32589a) {
                    return;
                }
                this.f32589a = true;
                this.f32591d = true;
                a aVar = this.b;
                Object obj = this.f32590c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f32591d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f32591d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.b == aVar) {
                    return;
                }
                this.b = aVar;
                if (this.f32589a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public final void c() {
        while (this.f32591d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
