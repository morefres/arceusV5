package d9;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f extends n4.a implements l9.r {

    /* renamed from: o, reason: collision with root package name */
    public final Semaphore f14444o;

    /* renamed from: p, reason: collision with root package name */
    public final Set f14445p;

    public f(Context context, Set set) {
        super(context);
        this.f14444o = new Semaphore(0);
        this.f14445p = set;
    }

    @Override // n4.a
    public final /* bridge */ /* synthetic */ Object C() {
        Iterator it = this.f14445p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((k9.f) it.next()).d(this)) {
                i10++;
            }
        }
        try {
            this.f14444o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // n4.b
    public final void p() {
        this.f14444o.drainPermits();
        h();
    }
}
