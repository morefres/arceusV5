package nb;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f26454a;
    public final /* synthetic */ nc b;

    public mc(nc ncVar, ConnectionResult connectionResult) {
        this.f26454a = connectionResult;
        Objects.requireNonNull(ncVar);
        this.b = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b.f26504c;
        tcVar.O(null);
        if (this.f26454a.w3() != 7777) {
            tcVar.L();
            return;
        }
        if (tcVar.P() == null) {
            tcVar.Q(Executors.newScheduledThreadPool(1));
        }
        tcVar.P().schedule(new Runnable() { // from class: nb.kc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final tc tcVar2 = mc.this.b.f26504c;
                tcVar2.f26328a.b().t(new Runnable() { // from class: nb.lc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        tc.this.w();
                    }
                });
            }
        }, ((Long) z4.f26853a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
