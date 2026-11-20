package android.view;

import android.view.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static d f2575c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, a> f2576a = new HashMap();
    public final Map<Class<?>, Boolean> b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<l.a, List<b>> f2577a = new HashMap();
        public final Map<b, l.a> b;

        public a(Map<b, l.a> map) {
            this.b = map;
            for (Map.Entry<b, l.a> entry : map.entrySet()) {
                l.a value = entry.getValue();
                List<b> list = this.f2577a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f2577a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void b(List<b> list, s sVar, l.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(sVar, aVar, obj);
                }
            }
        }

        public void a(s sVar, l.a aVar, Object obj) {
            b(this.f2577a.get(aVar), sVar, aVar, obj);
            b(this.f2577a.get(l.a.ON_ANY), sVar, aVar, obj);
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f2578a;
        public final Method b;

        public b(int i10, Method method) {
            this.f2578a = i10;
            this.b = method;
            method.setAccessible(true);
        }

        public void a(s sVar, l.a aVar, Object obj) {
            try {
                int i10 = this.f2578a;
                if (i10 == 0) {
                    this.b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.b.invoke(obj, sVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.b.invoke(obj, sVar, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2578a == bVar.f2578a && this.b.getName().equals(bVar.b.getName());
        }

        public int hashCode() {
            return (this.f2578a * 31) + this.b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, l.a> entry : c(cls2).b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            f0 f0Var = (f0) method.getAnnotation(f0.class);
            if (f0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!s.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                l.a value = f0Var.value();
                if (parameterTypes.length > 1) {
                    if (!l.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != l.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f2576a.put(cls, aVar);
        this.b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f2576a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((f0) method.getAnnotation(f0.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, l.a> map, b bVar, l.a aVar, Class<?> cls) {
        l.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
