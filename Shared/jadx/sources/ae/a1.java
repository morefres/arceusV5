package ae;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import be.o1;
import be.q1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a1 extends o1 {

    /* renamed from: j, reason: collision with root package name */
    public static a1 f406j;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f407g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f408h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f409i;

    public a1(Context context, j0 j0Var) {
        super(new q1("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f407g = new Handler(Looper.getMainLooper());
        this.f409i = new LinkedHashSet();
        this.f408h = j0Var;
    }

    public static synchronized a1 h(Context context) {
        a1 a1Var;
        synchronized (a1.class) {
            try {
                if (f406j == null) {
                    f406j = new a1(context, r0.INSTANCE);
                }
                a1Var = f406j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1Var;
    }

    @Override // be.o1
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        e n10 = e.n(bundleExtra);
        this.f3991a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", n10);
        k0 zza = this.f408h.zza();
        if (n10.i() != 3 || zza == null) {
            j(n10);
        } else {
            zza.a(n10.m(), new y0(this, n10, intent, context));
        }
    }

    public final synchronized void j(e eVar) {
        try {
            Iterator it = new LinkedHashSet(this.f409i).iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(eVar);
            }
            super.e(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
