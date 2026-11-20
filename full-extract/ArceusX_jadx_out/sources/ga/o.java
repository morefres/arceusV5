package ga;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReference f18418g = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Application f18419a;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f18422e;
    public final Application.ActivityLifecycleCallbacks b = new n(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final Object f18420c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Set f18421d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: f, reason: collision with root package name */
    public boolean f18423f = false;

    public o(Application application) {
        this.f18419a = application;
    }

    public static o a(Application application) {
        n9.m.l(application);
        AtomicReference atomicReference = f18418g;
        o oVar = (o) atomicReference.get();
        if (oVar != null) {
            return oVar;
        }
        p1.t.a(atomicReference, null, new o(application));
        return (o) atomicReference.get();
    }

    public final void b() {
        synchronized (this.f18420c) {
            try {
                if (!this.f18423f) {
                    this.f18419a.registerActivityLifecycleCallbacks(this.b);
                    this.f18423f = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(final l lVar) {
        n9.m.l(lVar);
        synchronized (this.f18420c) {
            this.f18421d.add(lVar);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            e(lVar);
        } else {
            sb.l.f31006a.execute(new Runnable() { // from class: ga.m
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    o.this.e(lVar);
                }
            });
        }
    }

    public final Activity d() {
        Activity activity;
        synchronized (this.f18420c) {
            WeakReference weakReference = this.f18422e;
            activity = weakReference == null ? null : (Activity) weakReference.get();
        }
        return activity;
    }

    public final /* synthetic */ void f(Activity activity) {
        n9.m.l(activity);
        synchronized (this.f18420c) {
            try {
                if (d() == activity) {
                    return;
                }
                this.f18422e = new WeakReference(activity);
                Iterator it = this.f18421d.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).a(activity);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void g(Activity activity) {
        synchronized (this.f18420c) {
            try {
                WeakReference weakReference = this.f18422e;
                if (weakReference == null) {
                    return;
                }
                if (weakReference.get() == activity) {
                    this.f18422e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void e(l lVar) {
        Activity d10 = d();
        if (d10 == null) {
            return;
        }
        lVar.a(d10);
    }
}
