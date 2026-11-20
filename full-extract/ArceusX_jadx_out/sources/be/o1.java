package be;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f3991a;
    public final IntentFilter b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3992c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3993d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public n1 f3994e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f3995f = false;

    public o1(q1 q1Var, IntentFilter intentFilter, Context context) {
        this.f3991a = q1Var;
        this.b = intentFilter;
        this.f3992c = n0.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(vd.a aVar) {
        this.f3991a.d("registerListener", new Object[0]);
        r0.a(aVar, "Registered Play Core listener should not be null.");
        this.f3993d.add(aVar);
        f();
    }

    public final synchronized void c(boolean z10) {
        this.f3995f = true;
        f();
    }

    public final synchronized void d(vd.a aVar) {
        this.f3991a.d("unregisterListener", new Object[0]);
        r0.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f3993d.remove(aVar);
        f();
    }

    public final synchronized void e(Object obj) {
        Iterator it = new HashSet(this.f3993d).iterator();
        while (it.hasNext()) {
            ((vd.a) it.next()).a(obj);
        }
    }

    public final void f() {
        n1 n1Var;
        if ((this.f3995f || !this.f3993d.isEmpty()) && this.f3994e == null) {
            n1 n1Var2 = new n1(this, null);
            this.f3994e = n1Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f3992c.registerReceiver(n1Var2, this.b, 2);
            } else {
                this.f3992c.registerReceiver(n1Var2, this.b);
            }
        }
        if (this.f3995f || !this.f3993d.isEmpty() || (n1Var = this.f3994e) == null) {
            return;
        }
        this.f3992c.unregisterReceiver(n1Var);
        this.f3994e = null;
    }
}
