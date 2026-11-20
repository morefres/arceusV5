package bt;

import bt.a;
import dt.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b<T> implements bt.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, ft.a<a.InterfaceC0091a<?>>> f4440a;

    public static final class a extends RuntimeException {
        public a(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    public b(Map<Class<?>, ft.a<a.InterfaceC0091a<?>>> map, Map<String, ft.a<a.InterfaceC0091a<?>>> map2) {
        this.f4440a = d(map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <C, V> Map<String, ft.a<a.InterfaceC0091a<?>>> d(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap c10 = dt.b.c(map.size() + map2.size());
        c10.putAll(map2);
        for (Map.Entry<Class<? extends C>, V> entry : map.entrySet()) {
            c10.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(c10);
    }

    @Override // bt.a
    public void a(T t8) {
        if (!c(t8)) {
            throw new IllegalArgumentException(b(t8));
        }
    }

    public final String b(T t8) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = t8.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.f4440a.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", t8.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", t8.getClass().getCanonicalName(), arrayList);
    }

    public boolean c(T t8) {
        ft.a<a.InterfaceC0091a<?>> aVar = this.f4440a.get(t8.getClass().getName());
        if (aVar == null) {
            return false;
        }
        a.InterfaceC0091a<?> interfaceC0091a = aVar.get();
        try {
            ((bt.a) h.d(interfaceC0091a.a(t8), "%s.create(I) should not return null.", interfaceC0091a.getClass())).a(t8);
            return true;
        } catch (ClassCastException e10) {
            throw new a(String.format("%s does not implement AndroidInjector.Factory<%s>", interfaceC0091a.getClass().getCanonicalName(), t8.getClass().getCanonicalName()), e10);
        }
    }
}
