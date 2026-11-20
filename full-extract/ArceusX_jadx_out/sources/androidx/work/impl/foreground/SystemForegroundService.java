package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.view.y;
import androidx.work.impl.foreground.a;
import x5.w;

/* loaded from: classes.dex */
public class SystemForegroundService extends y implements a.b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3332e = w.i("SystemFgService");

    /* renamed from: f, reason: collision with root package name */
    public static SystemForegroundService f3333f = null;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.impl.foreground.a f3334c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f3335d;

    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                w.e().l(SystemForegroundService.f3332e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                w.e().l(SystemForegroundService.f3332e, "Unable to start foreground service", e11);
            }
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void b(int i10, Notification notification) {
        this.f3335d.notify(i10, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10) {
        this.b = true;
        w.e().a(f3332e, "Shutting down.");
        stopForeground(true);
        f3333f = null;
        stopSelf(i10);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            b.a(this, i10, notification, i11);
        } else if (i12 >= 29) {
            a.a(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void e(int i10) {
        this.f3335d.cancel(i10);
    }

    public final void g() {
        this.f3335d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3334c = aVar;
        aVar.o(this);
    }

    @Override // android.view.y, android.app.Service
    public void onCreate() {
        super.onCreate();
        f3333f = this;
        g();
    }

    @Override // android.view.y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3334c.l();
    }

    @Override // android.view.y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.b) {
            w.e().f(f3332e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f3334c.l();
            g();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3334c.m(intent, i11);
        return 3;
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f3334c.n(i10, 2048);
    }

    public void onTimeout(int i10, int i11) {
        this.f3334c.n(i10, i11);
    }
}
