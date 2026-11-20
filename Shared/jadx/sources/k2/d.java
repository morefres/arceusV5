package k2;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f22200a;
    public static final Field b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f22201c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f22202d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f22203e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f22204f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f22205g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0390d f22206a;
        public final /* synthetic */ Object b;

        public a(C0390d c0390d, Object obj) {
            this.f22206a = c0390d;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22206a.f22209a = this.b;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f22207a;
        public final /* synthetic */ C0390d b;

        public b(Application application, C0390d c0390d) {
            this.f22207a = application;
            this.b = c0390d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22207a.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f22208a;
        public final /* synthetic */ Object b;

        public c(Object obj, Object obj2) {
            this.f22208a = obj;
            this.b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f22202d;
                if (method != null) {
                    method.invoke(this.f22208a, this.b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f22203e.invoke(this.f22208a, this.b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: k2.d$d, reason: collision with other inner class name */
    public static final class C0390d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public Object f22209a;
        public Activity b;

        /* renamed from: c, reason: collision with root package name */
        public final int f22210c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22211d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f22212e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f22213f = false;

        public C0390d(Activity activity) {
            this.b = activity;
            this.f22210c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.f22212e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f22212e || this.f22213f || this.f22211d || !d.h(this.f22209a, this.f22210c, activity)) {
                return;
            }
            this.f22213f = true;
            this.f22209a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.f22211d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f22200a = a10;
        b = b();
        f22201c = f();
        f22202d = d(a10);
        f22203e = c(a10);
        f22204f = e(a10);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f22201c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f22205g.postAtFrontOfQueue(new c(b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f22204f == null) {
            return false;
        }
        if (f22203e == null && f22202d == null) {
            return false;
        }
        try {
            Object obj2 = f22201c.get(activity);
            if (obj2 == null || (obj = b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0390d c0390d = new C0390d(activity);
            application.registerActivityLifecycleCallbacks(c0390d);
            Handler handler = f22205g;
            handler.post(new a(c0390d, obj2));
            try {
                if (g()) {
                    Method method = f22204f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0390d));
                return true;
            } catch (Throwable th2) {
                f22205g.post(new b(application, c0390d));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
