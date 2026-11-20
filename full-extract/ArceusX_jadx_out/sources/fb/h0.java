package fb;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f17096e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f17097f = false;

    /* renamed from: a, reason: collision with root package name */
    public final Application f17098a;
    public final j b;

    /* renamed from: c, reason: collision with root package name */
    public final ga.o f17099c;

    /* renamed from: d, reason: collision with root package name */
    public final ka.e f17100d;

    public h0(Application application, j jVar, ga.o oVar, ka.e eVar) {
        this.f17098a = application;
        this.b = jVar;
        this.f17099c = oVar;
        this.f17100d = eVar;
    }

    public static void a(@NonNull Context context) {
        n9.m.a(context != null);
        AtomicReference atomicReference = f17096e;
        if (atomicReference.get() == null) {
            synchronized (atomicReference) {
                try {
                    if (atomicReference.get() == null) {
                        Context applicationContext = context.getApplicationContext();
                        Application application = applicationContext != null ? (Application) applicationContext : (Application) context;
                        h0 h0Var = new h0(application, j.a(application), ga.o.a(application), ka.e.b(context));
                        atomicReference.set(h0Var);
                        h0Var.f17100d.a();
                        h0Var.b.b();
                        h0Var.f17099c.b();
                    }
                } finally {
                }
            }
        }
        f17097f = true;
    }

    public static void b() {
        n9.m.q(f17097f, "PlayGamesSdk has not been initialized. Ensure that PlayGamesSdk.initialize() has been called.");
    }

    public static Application c() {
        b();
        return ((h0) f17096e.get()).f17098a;
    }
}
