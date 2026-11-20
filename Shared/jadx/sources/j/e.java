package j;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import j.e;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static c f21298a = new c(new d());
    public static int b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static u2.j f21299c = null;

    /* renamed from: d, reason: collision with root package name */
    public static u2.j f21300d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f21301e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f21302f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final w1.b<WeakReference<e>> f21303g = new w1.b<>();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f21304h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f21305i = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f21306a = new Object();
        public final Queue<Runnable> b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        public final Executor f21307c;

        /* renamed from: d, reason: collision with root package name */
        public Runnable f21308d;

        public c(Executor executor) {
            this.f21307c = executor;
        }

        public static /* synthetic */ void b(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.c();
            }
        }

        public void c() {
            synchronized (this.f21306a) {
                try {
                    Runnable poll = this.b.poll();
                    this.f21308d = poll;
                    if (poll != null) {
                        this.f21307c.execute(poll);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f21306a) {
                try {
                    this.b.add(new Runnable() { // from class: j.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.c.b(e.c.this, runnable);
                        }
                    });
                    if (this.f21308d == null) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void D(@NonNull e eVar) {
        synchronized (f21304h) {
            E(eVar);
        }
    }

    public static void E(@NonNull e eVar) {
        synchronized (f21304h) {
            try {
                Iterator<WeakReference<e>> it = f21303g.iterator();
                while (it.hasNext()) {
                    e eVar2 = it.next().get();
                    if (eVar2 == eVar || eVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().e()) {
                    String b10 = k2.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b10));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void N(final Context context) {
        if (u(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f21302f) {
                    return;
                }
                f21298a.execute(new Runnable() { // from class: j.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c(context);
                    }
                });
                return;
            }
            synchronized (f21305i) {
                try {
                    u2.j jVar = f21299c;
                    if (jVar == null) {
                        if (f21300d == null) {
                            f21300d = u2.j.b(k2.e.b(context));
                        }
                        if (f21300d.e()) {
                        } else {
                            f21299c = f21300d;
                        }
                    } else if (!jVar.equals(f21300d)) {
                        u2.j jVar2 = f21299c;
                        f21300d = jVar2;
                        k2.e.a(context, jVar2.g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        M(context);
        f21302f = true;
    }

    public static void d(@NonNull e eVar) {
        synchronized (f21304h) {
            E(eVar);
            f21303g.add(new WeakReference<>(eVar));
        }
    }

    @NonNull
    public static e h(@NonNull Activity activity, j.c cVar) {
        return new g(activity, cVar);
    }

    @NonNull
    public static e i(@NonNull Dialog dialog, j.c cVar) {
        return new g(dialog, cVar);
    }

    @NonNull
    public static u2.j k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object o8 = o();
            if (o8 != null) {
                return u2.j.h(b.a(o8));
            }
        } else {
            u2.j jVar = f21299c;
            if (jVar != null) {
                return jVar;
            }
        }
        return u2.j.d();
    }

    public static int m() {
        return b;
    }

    public static Object o() {
        Context l10;
        Iterator<WeakReference<e>> it = f21303g.iterator();
        while (it.hasNext()) {
            e eVar = it.next().get();
            if (eVar != null && (l10 = eVar.l()) != null) {
                return l10.getSystemService("locale");
            }
        }
        return null;
    }

    public static u2.j q() {
        return f21299c;
    }

    public static boolean u(Context context) {
        if (f21301e == null) {
            try {
                Bundle bundle = o.a(context).metaData;
                if (bundle != null) {
                    f21301e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f21301e = Boolean.FALSE;
            }
        }
        return f21301e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C();

    public abstract boolean F(int i10);

    public abstract void G(int i10);

    public abstract void H(View view);

    public abstract void I(View view, ViewGroup.LayoutParams layoutParams);

    public void J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void K(int i10) {
    }

    public abstract void L(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void f(Context context) {
    }

    @NonNull
    public Context g(@NonNull Context context) {
        f(context);
        return context;
    }

    public abstract <T extends View> T j(int i10);

    public Context l() {
        return null;
    }

    public int n() {
        return -100;
    }

    public abstract MenuInflater p();

    public abstract j.a r();

    public abstract void s();

    public abstract void t();

    public abstract void v(Configuration configuration);

    public abstract void w(Bundle bundle);

    public abstract void x();

    public abstract void y(Bundle bundle);

    public abstract void z();
}
