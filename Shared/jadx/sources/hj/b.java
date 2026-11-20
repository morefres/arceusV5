package hj;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.util.function.Consumer;
import k2.k;
import kj.j0;
import kj.v;
import rg.l0;
import rg.q0;

/* loaded from: classes2.dex */
public abstract class b<T extends j0> implements j<T>, v.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public kj.v<T> f19437a = new kj.v<>(this);

    @Override // hj.j
    public void a(Context context, String str) {
        this.f19437a.g(str);
        if (this.f19437a.e()) {
            g(context, o());
        } else {
            f(context, false);
        }
    }

    @Override // hj.j
    public void c(Context context, T t8) {
        this.f19437a.f(t8);
        f(context, t());
    }

    @Override // hj.j
    public void clear() {
        this.f19437a.a();
    }

    @Override // hj.j
    public void d(Context context, long j10) {
        this.f19437a.h(j10);
        if (this.f19437a.e()) {
            g(context, o());
        } else {
            f(context, false);
        }
    }

    public void f(final Context context, final boolean z10) {
        if (context == null || this.f19437a.e()) {
            return;
        }
        b0.f19438a.c(context, r(), new Consumer() { // from class: hj.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b.this.s(context, z10, (Bitmap) obj);
            }
        });
    }

    public void g(Context context, int i10) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i10);
        }
    }

    public k.f h(Context context, boolean z10, Bitmap bitmap) {
        k.f fVar = new k.f(context, "channel_general");
        fVar.j(i(context, m()));
        fVar.n(j(context, m()));
        fVar.z(l0.f30335j);
        fVar.k(n(context));
        fVar.f(true);
        fVar.l(p(context));
        fVar.v(this.f19437a.i());
        fVar.s(bitmap);
        if (z10) {
            fVar.A(RingtoneManager.getDefaultUri(2));
        } else {
            fVar.A(null);
        }
        fVar.B(new k.d().h(n(context)));
        return fVar;
    }

    public final PendingIntent i(Context context, T t8) {
        Intent intent = new Intent(k(2));
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        Intent u8 = u(intent, t8);
        u8.putExtra("EXTRA_NOTIFICATION_ID", t8.getNotificationId());
        u8.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        u8.putExtra("EXTRA_NOTIFICATION_TYPE", q());
        return PendingIntent.getActivity(context, o(), u8, 301989888);
    }

    public PendingIntent j(Context context, T t8) {
        Intent intent = new Intent(k(1));
        intent.setClass(context, l());
        Intent v5 = v(intent, t8);
        v5.putExtra("EXTRA_NOTIFICATION_TYPE", q());
        v5.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        v5.putExtra("EXTRA_NOTIFICATION_ID", t8.getNotificationId());
        return PendingIntent.getBroadcast(context, o(), v5, 301989888);
    }

    public abstract String k(int i10);

    public abstract Class<?> l();

    public T m() {
        if (this.f19437a.e()) {
            return null;
        }
        return this.f19437a.b(r0.i() - 1);
    }

    public abstract String n(Context context);

    public abstract int o();

    public String p(Context context) {
        return context.getString(q0.O);
    }

    public abstract String q();

    public abstract long r();

    public final /* synthetic */ void s(Context context, boolean z10, Bitmap bitmap) {
        if (this.f19437a.e()) {
            return;
        }
        w(context, h(context, z10, bitmap));
    }

    public boolean t() {
        return this.f19437a.i() != 0 && this.f19437a.i() <= 2;
    }

    public abstract Intent u(Intent intent, T t8);

    public abstract Intent v(Intent intent, T t8);

    public void w(Context context, k.f fVar) {
        ((NotificationManager) context.getSystemService("notification")).notify(o(), fVar.c());
    }
}
