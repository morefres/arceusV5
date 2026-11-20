package sm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import sm.h;
import sm.m;

/* loaded from: classes2.dex */
public final class d<T> extends h<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final h.e f31440d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final c<T> f31441a;
    public final b<?>[] b;

    /* renamed from: c, reason: collision with root package name */
    public final m.b f31442c;

    public class a implements h.e {
        public final void a(w wVar, Type type, Map<String, b<?>> map) {
            g gVar;
            Class<?> g10 = a0.g(type);
            boolean j10 = um.c.j(g10);
            for (Field field : g10.getDeclaredFields()) {
                if (b(j10, field.getModifiers()) && ((gVar = (g) field.getAnnotation(g.class)) == null || !gVar.ignore())) {
                    Type q10 = um.c.q(type, g10, field.getGenericType());
                    Set<? extends Annotation> k10 = um.c.k(field);
                    String name = field.getName();
                    h<T> f10 = wVar.f(q10, k10, name);
                    field.setAccessible(true);
                    String n10 = um.c.n(name, gVar);
                    b<?> bVar = new b<>(n10, field, f10);
                    b<?> put = map.put(n10, bVar);
                    if (put != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.b + "\n    " + bVar.b);
                    }
                }
            }
        }

        public final boolean b(boolean z10, int i10) {
            if (Modifier.isStatic(i10) || Modifier.isTransient(i10)) {
                return false;
            }
            return Modifier.isPublic(i10) || Modifier.isProtected(i10) || !z10;
        }

        public final void c(Type type, Class<?> cls) {
            Class<?> g10 = a0.g(type);
            if (cls.isAssignableFrom(g10)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + g10.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // sm.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            if (!(type instanceof Class) && !(type instanceof ParameterizedType)) {
                return null;
            }
            Class<?> g10 = a0.g(type);
            if (g10.isInterface() || g10.isEnum() || !set.isEmpty()) {
                return null;
            }
            if (um.c.j(g10)) {
                c(type, List.class);
                c(type, Set.class);
                c(type, Map.class);
                c(type, Collection.class);
                String str = "Platform " + g10;
                if (type instanceof ParameterizedType) {
                    str = str + " in " + type;
                }
                throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
            }
            if (g10.isAnonymousClass()) {
                throw new IllegalArgumentException("Cannot serialize anonymous class " + g10.getName());
            }
            if (g10.isLocalClass()) {
                throw new IllegalArgumentException("Cannot serialize local class " + g10.getName());
            }
            if (g10.getEnclosingClass() != null && !Modifier.isStatic(g10.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize non-static nested class " + g10.getName());
            }
            if (Modifier.isAbstract(g10.getModifiers())) {
                throw new IllegalArgumentException("Cannot serialize abstract class " + g10.getName());
            }
            if (um.c.i(g10)) {
                throw new IllegalArgumentException("Cannot serialize Kotlin type " + g10.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
            }
            c a10 = c.a(g10);
            TreeMap treeMap = new TreeMap();
            while (type != Object.class) {
                a(wVar, type, treeMap);
                type = a0.f(type);
            }
            return new d(a10, treeMap).nullSafe();
        }
    }

    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f31443a;
        public final Field b;

        /* renamed from: c, reason: collision with root package name */
        public final h<T> f31444c;

        public b(String str, Field field, h<T> hVar) {
            this.f31443a = str;
            this.b = field;
            this.f31444c = hVar;
        }

        public void a(m mVar, Object obj) {
            this.b.set(obj, this.f31444c.fromJson(mVar));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(t tVar, Object obj) {
            this.f31444c.toJson(tVar, (t) this.b.get(obj));
        }
    }

    public d(c<T> cVar, Map<String, b<?>> map) {
        this.f31441a = cVar;
        this.b = (b[]) map.values().toArray(new b[map.size()]);
        this.f31442c = m.b.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // sm.h
    public T fromJson(m mVar) {
        try {
            T b10 = this.f31441a.b();
            try {
                mVar.b();
                while (mVar.f()) {
                    int F = mVar.F(this.f31442c);
                    if (F == -1) {
                        mVar.M();
                        mVar.P();
                    } else {
                        this.b[F].a(mVar, b10);
                    }
                }
                mVar.d();
                return b10;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw um.c.t(e11);
        }
    }

    @Override // sm.h
    public void toJson(t tVar, T t8) {
        try {
            tVar.c();
            for (b<?> bVar : this.b) {
                tVar.n(bVar.f31443a);
                bVar.b(tVar, t8);
            }
            tVar.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f31441a + ")";
    }
}
