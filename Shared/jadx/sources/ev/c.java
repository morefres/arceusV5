package ev;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: q, reason: collision with root package name */
    public static String f16280q = "EventBus";

    /* renamed from: r, reason: collision with root package name */
    public static volatile c f16281r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f16282s = new d();

    /* renamed from: t, reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f16283t = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<n>> f16284a;
    public final Map<Object, List<Class<?>>> b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Object> f16285c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal<C0303c> f16286d;

    /* renamed from: e, reason: collision with root package name */
    public final f f16287e;

    /* renamed from: f, reason: collision with root package name */
    public final ev.b f16288f;

    /* renamed from: g, reason: collision with root package name */
    public final ev.a f16289g;

    /* renamed from: h, reason: collision with root package name */
    public final m f16290h;

    /* renamed from: i, reason: collision with root package name */
    public final ExecutorService f16291i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f16292j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16293k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16294l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f16295m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f16296n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16297o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16298p;

    public class a extends ThreadLocal<C0303c> {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0303c initialValue() {
            return new C0303c();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16300a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f16300a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16300a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16300a[ThreadMode.BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16300a[ThreadMode.ASYNC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: ev.c$c, reason: collision with other inner class name */
    public static final class C0303c {

        /* renamed from: a, reason: collision with root package name */
        public final List<Object> f16301a = new ArrayList();
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16302c;

        /* renamed from: d, reason: collision with root package name */
        public n f16303d;

        /* renamed from: e, reason: collision with root package name */
        public Object f16304e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16305f;
    }

    public c() {
        this(f16282s);
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static d b() {
        return new d();
    }

    public static c d() {
        if (f16281r == null) {
            synchronized (c.class) {
                try {
                    if (f16281r == null) {
                        f16281r = new c();
                    }
                } finally {
                }
            }
        }
        return f16281r;
    }

    public static List<Class<?>> i(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f16283t;
        synchronized (map) {
            try {
                list = map.get(cls);
                if (list == null) {
                    list = new ArrayList<>();
                    for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        list.add(cls2);
                        a(list, cls2.getInterfaces());
                    }
                    f16283t.put(cls, list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return list;
    }

    public final void c(n nVar, Object obj) {
        if (obj != null) {
            m(nVar, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    public ExecutorService e() {
        return this.f16291i;
    }

    public final void f(n nVar, Object obj, Throwable th2) {
        if (!(obj instanceof k)) {
            if (this.f16292j) {
                throw new e("Invoking subscriber failed", th2);
            }
            if (this.f16293k) {
                Log.e(f16280q, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + nVar.f16342a.getClass(), th2);
            }
            if (this.f16295m) {
                j(new k(this, th2, obj, nVar.f16342a));
                return;
            }
            return;
        }
        if (this.f16293k) {
            Log.e(f16280q, "SubscriberExceptionEvent subscriber " + nVar.f16342a.getClass() + " threw an exception", th2);
            k kVar = (k) obj;
            Log.e(f16280q, "Initial event " + kVar.f16325c + " caused exception in " + kVar.f16326d, kVar.b);
        }
    }

    public void g(h hVar) {
        Object obj = hVar.f16321a;
        n nVar = hVar.b;
        h.b(hVar);
        if (nVar.f16343c) {
            h(nVar, obj);
        }
    }

    public void h(n nVar, Object obj) {
        try {
            nVar.b.f16327a.invoke(nVar.f16342a, obj);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Unexpected exception", e10);
        } catch (InvocationTargetException e11) {
            f(nVar, obj, e11.getCause());
        }
    }

    public void j(Object obj) {
        C0303c c0303c = this.f16286d.get();
        List<Object> list = c0303c.f16301a;
        list.add(obj);
        if (c0303c.b) {
            return;
        }
        c0303c.f16302c = Looper.getMainLooper() == Looper.myLooper();
        c0303c.b = true;
        if (c0303c.f16305f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (!list.isEmpty()) {
            try {
                k(list.remove(0), c0303c);
            } finally {
                c0303c.b = false;
                c0303c.f16302c = false;
            }
        }
    }

    public final void k(Object obj, C0303c c0303c) {
        boolean l10;
        Class<?> cls = obj.getClass();
        if (this.f16297o) {
            List<Class<?>> i10 = i(cls);
            int size = i10.size();
            l10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                l10 |= l(obj, c0303c, i10.get(i11));
            }
        } else {
            l10 = l(obj, c0303c, cls);
        }
        if (l10) {
            return;
        }
        if (this.f16294l) {
            Log.d(f16280q, "No subscribers registered for event " + cls);
        }
        if (!this.f16296n || cls == g.class || cls == k.class) {
            return;
        }
        j(new g(this, obj));
    }

    public final boolean l(Object obj, C0303c c0303c, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f16284a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<n> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            n next = it.next();
            c0303c.f16304e = obj;
            c0303c.f16303d = next;
            try {
                m(next, obj, c0303c.f16302c);
                if (c0303c.f16305f) {
                    return true;
                }
            } finally {
                c0303c.f16304e = null;
                c0303c.f16303d = null;
                c0303c.f16305f = false;
            }
        }
        return true;
    }

    public final void m(n nVar, Object obj, boolean z10) {
        int i10 = b.f16300a[nVar.b.b.ordinal()];
        if (i10 == 1) {
            h(nVar, obj);
            return;
        }
        if (i10 == 2) {
            if (z10) {
                h(nVar, obj);
                return;
            } else {
                this.f16287e.a(nVar, obj);
                return;
            }
        }
        if (i10 == 3) {
            if (z10) {
                this.f16288f.a(nVar, obj);
                return;
            } else {
                h(nVar, obj);
                return;
            }
        }
        if (i10 == 4) {
            this.f16289g.a(nVar, obj);
            return;
        }
        throw new IllegalStateException("Unknown thread mode: " + nVar.b.b);
    }

    public void n(Object obj) {
        List<l> a10 = this.f16290h.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator<l> it = a10.iterator();
                while (it.hasNext()) {
                    o(obj, it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(Object obj, l lVar) {
        Class<?> cls = lVar.f16328c;
        n nVar = new n(obj, lVar);
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f16284a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f16284a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(nVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i10 = 0; i10 <= size; i10++) {
            if (i10 == size || lVar.f16329d > copyOnWriteArrayList.get(i10).b.f16329d) {
                copyOnWriteArrayList.add(i10, nVar);
                break;
            }
        }
        List<Class<?>> list = this.b.get(obj);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(obj, list);
        }
        list.add(cls);
        if (lVar.f16330e) {
            if (!this.f16297o) {
                c(nVar, this.f16285c.get(cls));
                return;
            }
            for (Map.Entry<Class<?>, Object> entry : this.f16285c.entrySet()) {
                if (cls.isAssignableFrom(entry.getKey())) {
                    c(nVar, entry.getValue());
                }
            }
        }
    }

    public synchronized void p(Object obj) {
        try {
            List<Class<?>> list = this.b.get(obj);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    q(obj, it.next());
                }
                this.b.remove(obj);
            } else {
                Log.w(f16280q, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void q(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<n> copyOnWriteArrayList = this.f16284a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                n nVar = copyOnWriteArrayList.get(i10);
                if (nVar.f16342a == obj) {
                    nVar.f16343c = false;
                    copyOnWriteArrayList.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f16298p + ", eventInheritance=" + this.f16297o + "]";
    }

    public c(d dVar) {
        this.f16286d = new a();
        this.f16284a = new HashMap();
        this.b = new HashMap();
        this.f16285c = new ConcurrentHashMap();
        this.f16287e = new f(this, Looper.getMainLooper(), 10);
        this.f16288f = new ev.b(this);
        this.f16289g = new ev.a(this);
        List<fv.b> list = dVar.f16315j;
        this.f16298p = list != null ? list.size() : 0;
        this.f16290h = new m(dVar.f16315j, dVar.f16313h, dVar.f16312g);
        this.f16293k = dVar.f16307a;
        this.f16294l = dVar.b;
        this.f16295m = dVar.f16308c;
        this.f16296n = dVar.f16309d;
        this.f16292j = dVar.f16310e;
        this.f16297o = dVar.f16311f;
        this.f16291i = dVar.f16314i;
    }
}
