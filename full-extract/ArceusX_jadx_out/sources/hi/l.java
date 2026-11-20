package hi;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import rg.y;
import rk.b;

/* loaded from: classes2.dex */
public class l extends rk.b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f19429c = "hi.l";

    public class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f19430a;

        public a(Context context) {
            this.f19430a = context.getApplicationContext();
        }

        @Override // rk.b.a
        public void a(rk.a aVar) {
            Log.v(l.f19429c, "RBHybridModulePush PushPermissionTrigger.execute() " + aVar.f());
            if (Build.VERSION.SDK_INT >= 33) {
                mm.k k10 = y.h().k();
                mm.n nVar = mm.n.POST_NOTIFICATIONS;
                if (!k10.e0(nVar)) {
                    y.h().k().Z(new String[]{nVar.toString()});
                    return;
                }
            }
            b(this.f19430a);
        }

        public void b(Context context) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            if (Build.VERSION.SDK_INT >= 28) {
                intent.addFlags(268435456);
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            context.startActivity(intent);
        }
    }

    public l(Context context) {
        super("Push");
        d("pushPermissionTrigger", new a(context));
    }
}
