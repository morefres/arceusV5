package q8;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* loaded from: classes.dex */
public final class c extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<a> f29612a;
    public final long b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f29613c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f29614d = false;

    public c(a aVar, long j10) {
        this.f29612a = new WeakReference<>(aVar);
        this.b = j10;
        start();
    }

    public final void a() {
        a aVar = this.f29612a.get();
        if (aVar != null) {
            aVar.c();
            this.f29614d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f29613c.await(this.b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
