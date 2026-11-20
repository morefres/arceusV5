package ff;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l9.c;
import mf.o;
import mf.x;
import nf.a0;
import p1.t;
import u2.p;
import u9.m;
import u9.n;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f17171k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Map<String, e> f17172l = new w1.a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f17173a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final k f17174c;

    /* renamed from: d, reason: collision with root package name */
    public final o f17175d;

    /* renamed from: g, reason: collision with root package name */
    public final x<eg.a> f17178g;

    /* renamed from: h, reason: collision with root package name */
    public final yf.b<wf.f> f17179h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f17176e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f17177f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final List<a> f17180i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final List<Object> f17181j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z10);
    }

    @TargetApi(14)
    public static class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public static AtomicReference<b> f17182a = new AtomicReference<>();

        public static void c(Context context) {
            if (m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f17182a.get() == null) {
                    b bVar = new b();
                    if (t.a(f17182a, null, bVar)) {
                        l9.c.c(application);
                        l9.c.b().a(bVar);
                    }
                }
            }
        }

        @Override // l9.c.a
        public void a(boolean z10) {
            synchronized (e.f17171k) {
                try {
                    ArrayList arrayList = new ArrayList(e.f17172l.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        e eVar = (e) obj;
                        if (eVar.f17176e.get()) {
                            eVar.v(z10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @TargetApi(MotionEventCompat.AXIS_DISTANCE)
    public static class c extends BroadcastReceiver {
        public static AtomicReference<c> b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        public final Context f17183a;

        public c(Context context) {
            this.f17183a = context;
        }

        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (t.a(b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f17183a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (e.f17171k) {
                try {
                    Iterator<e> it = e.f17172l.values().iterator();
                    while (it.hasNext()) {
                        it.next().o();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c();
        }
    }

    public e(final Context context, String str, k kVar) {
        this.f17173a = (Context) n9.m.l(context);
        this.b = n9.m.f(str);
        this.f17174c = (k) n9.m.l(kVar);
        l b10 = FirebaseInitProvider.b();
        ig.c.b("Firebase");
        ig.c.b("ComponentDiscovery");
        List<yf.b<ComponentRegistrar>> b11 = mf.f.c(context, ComponentDiscoveryService.class).b();
        ig.c.a();
        ig.c.b("Runtime");
        o.b f10 = o.l(a0.INSTANCE).d(b11).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(mf.c.q(context, Context.class, new Class[0])).b(mf.c.q(this, e.class, new Class[0])).b(mf.c.q(kVar, k.class, new Class[0])).f(new ig.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            f10.b(mf.c.q(b10, l.class, new Class[0]));
        }
        o e10 = f10.e();
        this.f17175d = e10;
        ig.c.a();
        this.f17178g = new x<>(new yf.b() { // from class: ff.c
            @Override // yf.b
            public final Object get() {
                return e.b(e.this, context);
            }
        });
        this.f17179h = e10.g(wf.f.class);
        g(new a() { // from class: ff.d
            @Override // ff.e.a
            public final void a(boolean z10) {
                e.a(e.this, z10);
            }
        });
        ig.c.a();
    }

    public static /* synthetic */ void a(e eVar, boolean z10) {
        if (z10) {
            eVar.getClass();
        } else {
            eVar.f17179h.get().h();
        }
    }

    public static /* synthetic */ eg.a b(e eVar, Context context) {
        return new eg.a(context, eVar.n(), (vf.c) eVar.f17175d.a(vf.c.class));
    }

    @NonNull
    public static e k() {
        e eVar;
        synchronized (f17171k) {
            try {
                eVar = f17172l.get("[DEFAULT]");
                if (eVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                eVar.f17179h.get().h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public static e p(@NonNull Context context) {
        synchronized (f17171k) {
            try {
                if (f17172l.containsKey("[DEFAULT]")) {
                    return k();
                }
                k a10 = k.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return q(context, a10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static e q(@NonNull Context context, @NonNull k kVar) {
        return r(context, kVar, "[DEFAULT]");
    }

    @NonNull
    public static e r(@NonNull Context context, @NonNull k kVar, @NonNull String str) {
        e eVar;
        b.c(context);
        String u8 = u(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f17171k) {
            Map<String, e> map = f17172l;
            n9.m.q(!map.containsKey(u8), "FirebaseApp name " + u8 + " already exists!");
            n9.m.m(context, "Application context cannot be null.");
            eVar = new e(context, u8, kVar);
            map.put(u8, eVar);
        }
        eVar.o();
        return eVar;
    }

    public static String u(@NonNull String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.b.equals(((e) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.f17176e.get() && l9.c.b().d()) {
            aVar.a(true);
        }
        this.f17180i.add(aVar);
    }

    public final void h() {
        n9.m.q(!this.f17177f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public <T> T i(Class<T> cls) {
        h();
        return (T) this.f17175d.a(cls);
    }

    @NonNull
    public Context j() {
        h();
        return this.f17173a;
    }

    @NonNull
    public String l() {
        h();
        return this.b;
    }

    @NonNull
    public k m() {
        h();
        return this.f17174c;
    }

    public String n() {
        return u9.c.b(l().getBytes(Charset.defaultCharset())) + "+" + u9.c.b(m().c().getBytes(Charset.defaultCharset()));
    }

    public final void o() {
        if (!p.a(this.f17173a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            c.b(this.f17173a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.f17175d.o(t());
        this.f17179h.get().h();
    }

    public boolean s() {
        h();
        return this.f17178g.get().b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return n9.k.d(this).a("name", this.b).a("options", this.f17174c).toString();
    }

    public final void v(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<a> it = this.f17180i.iterator();
        while (it.hasNext()) {
            it.next().a(z10);
        }
    }
}
