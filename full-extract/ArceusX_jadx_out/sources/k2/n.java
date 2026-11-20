package k2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import d.a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static String f22292d;

    /* renamed from: g, reason: collision with root package name */
    public static f f22295g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22296a;
    public final NotificationManager b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22291c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static Set<String> f22293e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f22294f = new Object();

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public static class b {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel e(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> f(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> g(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class c {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    public static class d implements g {

        /* renamed from: a, reason: collision with root package name */
        public final String f22297a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final String f22298c;

        /* renamed from: d, reason: collision with root package name */
        public final Notification f22299d;

        public d(String str, int i10, String str2, Notification notification) {
            this.f22297a = str;
            this.b = i10;
            this.f22298c = str2;
            this.f22299d = notification;
        }

        @Override // k2.n.g
        public void a(d.a aVar) {
            aVar.i2(this.f22297a, this.b, this.f22298c, this.f22299d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f22297a + ", id:" + this.b + ", tag:" + this.f22298c + "]";
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f22300a;
        public final IBinder b;

        public e(ComponentName componentName, IBinder iBinder) {
            this.f22300a = componentName;
            this.b = iBinder;
        }
    }

    public static class f implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final Context f22301a;
        public final HandlerThread b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f22302c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<ComponentName, a> f22303d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public Set<String> f22304e = new HashSet();

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f22305a;

            /* renamed from: c, reason: collision with root package name */
            public d.a f22306c;
            public boolean b = false;

            /* renamed from: d, reason: collision with root package name */
            public ArrayDeque<g> f22307d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            public int f22308e = 0;

            public a(ComponentName componentName) {
                this.f22305a = componentName;
            }
        }

        public f(Context context) {
            this.f22301a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.b = handlerThread;
            handlerThread.start();
            this.f22302c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            boolean bindService = this.f22301a.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f22305a), this, 33);
            aVar.b = bindService;
            if (bindService) {
                aVar.f22308e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f22305a);
                this.f22301a.unbindService(this);
            }
            return aVar.b;
        }

        public final void b(a aVar) {
            if (aVar.b) {
                this.f22301a.unbindService(this);
                aVar.b = false;
            }
            aVar.f22306c = null;
        }

        public final void c(g gVar) {
            j();
            for (a aVar : this.f22303d.values()) {
                aVar.f22307d.add(gVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.f22303d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f22303d.get(componentName);
            if (aVar != null) {
                aVar.f22306c = a.AbstractBinderC0276a.r2(iBinder);
                aVar.f22308e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.f22303d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f22305a + ", " + aVar.f22307d.size() + " queued tasks");
            }
            if (aVar.f22307d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f22306c == null) {
                i(aVar);
                return;
            }
            while (true) {
                g peek = aVar.f22307d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.f22306c);
                    aVar.f22307d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f22305a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f22305a, e10);
                }
            }
            if (aVar.f22307d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(g gVar) {
            this.f22302c.obtainMessage(0, gVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((g) message.obj);
                return true;
            }
            if (i10 == 1) {
                e eVar = (e) message.obj;
                e(eVar.f22300a, eVar.b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.f22302c.hasMessages(3, aVar.f22305a)) {
                return;
            }
            int i10 = aVar.f22308e;
            int i11 = i10 + 1;
            aVar.f22308e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f22302c.sendMessageDelayed(this.f22302c.obtainMessage(3, aVar.f22305a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f22307d.size() + " tasks to " + aVar.f22305a + " after " + aVar.f22308e + " retries");
            aVar.f22307d.clear();
        }

        public final void j() {
            Set<String> g10 = n.g(this.f22301a);
            if (g10.equals(this.f22304e)) {
                return;
            }
            this.f22304e = g10;
            List<ResolveInfo> queryIntentServices = this.f22301a.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (g10.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f22303d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f22303d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f22303d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f22302c.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f22302c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface g {
        void a(d.a aVar);
    }

    public n(Context context) {
        this.f22296a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static n f(Context context) {
        return new n(context);
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f22291c) {
            if (string != null) {
                try {
                    if (!string.equals(f22292d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        f22293e = hashSet;
                        f22292d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f22293e;
        }
        return set;
    }

    public static boolean o(Notification notification) {
        Bundle a10 = k.a(notification);
        return a10 != null && a10.getBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean a() {
        return a.a(this.b);
    }

    public void b(String str, int i10) {
        this.b.cancel(str, i10);
    }

    public void c(NotificationChannel notificationChannel) {
        b.a(this.b, notificationChannel);
    }

    public void d(NotificationChannelGroup notificationChannelGroup) {
        b.b(this.b, notificationChannelGroup);
    }

    public void e(String str) {
        b.c(this.b, str);
    }

    public NotificationChannel h(String str) {
        return b.e(this.b, str);
    }

    public NotificationChannelGroup i(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(this.b, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : j()) {
            if (b.d(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public List<NotificationChannelGroup> j() {
        return b.f(this.b);
    }

    public List<NotificationChannel> k() {
        return b.g(this.b);
    }

    public void l(int i10, Notification notification) {
        m(null, i10, notification);
    }

    public void m(String str, int i10, Notification notification) {
        if (!o(notification)) {
            this.b.notify(str, i10, notification);
        } else {
            n(new d(this.f22296a.getPackageName(), i10, str, notification));
            this.b.cancel(str, i10);
        }
    }

    public final void n(g gVar) {
        synchronized (f22294f) {
            try {
                if (f22295g == null) {
                    f22295g = new f(this.f22296a.getApplicationContext());
                }
                f22295g.h(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
