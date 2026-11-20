package nb;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public final o6 f26550a;

    public p6(o6 o6Var) {
        n9.m.l(o6Var);
        this.f26550a = o6Var;
    }

    public final void a(Context context, Intent intent) {
        g7 O = g7.O(context, null, null);
        w5 a10 = O.a();
        if (intent == null) {
            a10.r().a("Receiver called with null intent");
            return;
        }
        O.c();
        String action = intent.getAction();
        a10.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                a10.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            a10.w().a("Starting wakeful intent.");
            this.f26550a.a(context, className);
        }
    }
}
