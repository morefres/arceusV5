package ev;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: d, reason: collision with root package name */
    public static final Map<Class<?>, List<l>> f16332d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final a[] f16333e = new a[4];

    /* renamed from: a, reason: collision with root package name */
    public List<fv.b> f16334a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16335c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final List<l> f16336a = new ArrayList();
        public final Map<Class, Object> b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public final Map<String, Class> f16337c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        public final StringBuilder f16338d = new StringBuilder(128);

        /* renamed from: e, reason: collision with root package name */
        public Class<?> f16339e;

        /* renamed from: f, reason: collision with root package name */
        public Class<?> f16340f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f16341g;

        public boolean a(Method method, Class<?> cls) {
            Object put = this.b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (!b((Method) put, cls)) {
                    throw new IllegalStateException();
                }
                this.b.put(cls, this);
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.f16338d.setLength(0);
            this.f16338d.append(method.getName());
            StringBuilder sb2 = this.f16338d;
            sb2.append('>');
            sb2.append(cls.getName());
            String sb3 = this.f16338d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f16337c.put(sb3, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f16337c.put(sb3, put);
            return false;
        }

        public void c(Class<?> cls) {
            this.f16340f = cls;
            this.f16339e = cls;
            this.f16341g = false;
        }

        public void d() {
            if (this.f16341g) {
                this.f16340f = null;
                return;
            }
            Class<? super Object> superclass = this.f16340f.getSuperclass();
            this.f16340f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f16340f = null;
            }
        }

        public void e() {
            this.f16336a.clear();
            this.b.clear();
            this.f16337c.clear();
            this.f16338d.setLength(0);
            this.f16339e = null;
            this.f16340f = null;
            this.f16341g = false;
        }
    }

    public m(List<fv.b> list, boolean z10, boolean z11) {
        this.f16334a = list;
        this.b = z10;
        this.f16335c = z11;
    }

    public List<l> a(Class<?> cls) {
        Map<Class<?>, List<l>> map = f16332d;
        List<l> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<l> c10 = this.f16335c ? c(cls) : b(cls);
        if (!c10.isEmpty()) {
            map.put(cls, c10);
            return c10;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<l> b(Class<?> cls) {
        a g10 = g();
        g10.c(cls);
        while (g10.f16340f != null) {
            f(g10);
            d(g10);
            g10.d();
        }
        return e(g10);
    }

    public final List<l> c(Class<?> cls) {
        a g10 = g();
        g10.c(cls);
        while (g10.f16340f != null) {
            d(g10);
            g10.d();
        }
        return e(g10);
    }

    public final void d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f16340f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f16340f.getMethods();
            aVar.f16341g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    j jVar = (j) method.getAnnotation(j.class);
                    if (jVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f16336a.add(new l(method, cls, jVar.threadMode(), jVar.priority(), jVar.sticky()));
                        }
                    }
                } else if (this.b && method.isAnnotationPresent(j.class)) {
                    throw new e("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.b && method.isAnnotationPresent(j.class)) {
                throw new e((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    public final List<l> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f16336a);
        aVar.e();
        synchronized (f16333e) {
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                try {
                    a[] aVarArr = f16333e;
                    if (aVarArr[i10] == null) {
                        aVarArr[i10] = aVar;
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    public final fv.a f(a aVar) {
        aVar.getClass();
        List<fv.b> list = this.f16334a;
        if (list == null) {
            return null;
        }
        Iterator<fv.b> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(aVar.f16340f);
        }
        return null;
    }

    public final a g() {
        synchronized (f16333e) {
            for (int i10 = 0; i10 < 4; i10++) {
                try {
                    a[] aVarArr = f16333e;
                    a aVar = aVarArr[i10];
                    if (aVar != null) {
                        aVarArr[i10] = null;
                        return aVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return new a();
        }
    }
}
