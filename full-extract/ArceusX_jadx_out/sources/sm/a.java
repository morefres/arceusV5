package sm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import sm.h;
import sm.m;

/* loaded from: classes2.dex */
public final class a implements h.e {

    /* renamed from: a, reason: collision with root package name */
    public final List<f> f31409a;
    public final List<f> b;

    /* renamed from: sm.a$a, reason: collision with other inner class name */
    public class C0560a extends h<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f31410a;
        public final /* synthetic */ h b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w f31411c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f31412d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Set f31413e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Type f31414f;

        public C0560a(f fVar, h hVar, w wVar, f fVar2, Set set, Type type) {
            this.f31410a = fVar;
            this.b = hVar;
            this.f31411c = wVar;
            this.f31412d = fVar2;
            this.f31413e = set;
            this.f31414f = type;
        }

        @Override // sm.h
        public Object fromJson(m mVar) {
            f fVar = this.f31412d;
            if (fVar == null) {
                return this.b.fromJson(mVar);
            }
            if (!fVar.f31431g && mVar.u() == m.c.NULL) {
                mVar.o();
                return null;
            }
            try {
                return this.f31412d.b(this.f31411c, mVar);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + mVar.getPath(), cause);
            }
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) {
            f fVar = this.f31410a;
            if (fVar == null) {
                this.b.toJson(tVar, (t) obj);
                return;
            }
            if (!fVar.f31431g && obj == null) {
                tVar.o();
                return;
            }
            try {
                fVar.e(this.f31411c, tVar, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new j(cause + " at " + tVar.getPath(), cause);
            }
        }

        public String toString() {
            return "JsonAdapter" + this.f31413e + "(" + this.f31414f + ")";
        }
    }

    public class b extends f {
        public b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // sm.a.f
        public void e(w wVar, t tVar, Object obj) {
            d(tVar, obj);
        }
    }

    public class c extends f {

        /* renamed from: h, reason: collision with root package name */
        public h<Object> f31416h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Type[] f31417i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Type f31418j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Set f31419k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set f31420l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f31417i = typeArr;
            this.f31418j = type2;
            this.f31419k = set2;
            this.f31420l = set3;
        }

        @Override // sm.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f31416h = (a0.d(this.f31417i[0], this.f31418j) && this.f31419k.equals(this.f31420l)) ? wVar.i(eVar, this.f31418j, this.f31420l) : wVar.e(this.f31418j, this.f31420l);
        }

        @Override // sm.a.f
        public void e(w wVar, t tVar, Object obj) {
            this.f31416h.toJson(tVar, (t) c(obj));
        }
    }

    public class d extends f {
        public d(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10) {
            super(type, set, obj, method, i10, i11, z10);
        }

        @Override // sm.a.f
        public Object b(w wVar, m mVar) {
            return c(mVar);
        }
    }

    public class e extends f {

        /* renamed from: h, reason: collision with root package name */
        public h<Object> f31421h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Type[] f31422i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Type f31423j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Set f31424k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Set f31425l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, Type[] typeArr, Type type2, Set set2, Set set3) {
            super(type, set, obj, method, i10, i11, z10);
            this.f31422i = typeArr;
            this.f31423j = type2;
            this.f31424k = set2;
            this.f31425l = set3;
        }

        @Override // sm.a.f
        public void a(w wVar, h.e eVar) {
            super.a(wVar, eVar);
            this.f31421h = (a0.d(this.f31422i[0], this.f31423j) && this.f31424k.equals(this.f31425l)) ? wVar.i(eVar, this.f31422i[0], this.f31424k) : wVar.e(this.f31422i[0], this.f31424k);
        }

        @Override // sm.a.f
        public Object b(w wVar, m mVar) {
            return c(this.f31421h.fromJson(mVar));
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final Type f31426a;
        public final Set<? extends Annotation> b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f31427c;

        /* renamed from: d, reason: collision with root package name */
        public final Method f31428d;

        /* renamed from: e, reason: collision with root package name */
        public final int f31429e;

        /* renamed from: f, reason: collision with root package name */
        public final h<?>[] f31430f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f31431g;

        public f(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f31426a = um.c.a(type);
            this.b = set;
            this.f31427c = obj;
            this.f31428d = method;
            this.f31429e = i11;
            this.f31430f = new h[i10 - i11];
            this.f31431g = z10;
        }

        public void a(w wVar, h.e eVar) {
            if (this.f31430f.length > 0) {
                Type[] genericParameterTypes = this.f31428d.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = this.f31428d.getParameterAnnotations();
                int length = genericParameterTypes.length;
                for (int i10 = this.f31429e; i10 < length; i10++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i10]).getActualTypeArguments()[0];
                    Set<? extends Annotation> l10 = um.c.l(parameterAnnotations[i10]);
                    this.f31430f[i10 - this.f31429e] = (a0.d(this.f31426a, type) && this.b.equals(l10)) ? wVar.i(eVar, type, l10) : wVar.e(type, l10);
                }
            }
        }

        public Object b(w wVar, m mVar) {
            throw new AssertionError();
        }

        public Object c(Object obj) {
            h<?>[] hVarArr = this.f31430f;
            Object[] objArr = new Object[hVarArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(hVarArr, 0, objArr, 1, hVarArr.length);
            try {
                return this.f31428d.invoke(this.f31427c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public Object d(Object obj, Object obj2) {
            h<?>[] hVarArr = this.f31430f;
            Object[] objArr = new Object[hVarArr.length + 2];
            objArr[0] = obj;
            objArr[1] = obj2;
            System.arraycopy(hVarArr, 0, objArr, 2, hVarArr.length);
            try {
                return this.f31428d.invoke(this.f31427c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        public void e(w wVar, t tVar, Object obj) {
            throw new AssertionError();
        }
    }

    public a(List<f> list, List<f> list2) {
        this.f31409a = list;
        this.b = list2;
    }

    public static f a(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Set<? extends Annotation> k10 = um.c.k(method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 1 && genericParameterTypes[0] == m.class && genericReturnType != cls && d(1, genericParameterTypes)) {
            return new d(genericReturnType, k10, obj, method, genericParameterTypes.length, 1, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            return new e(genericReturnType, k10, obj, method, genericParameterTypes.length, 1, um.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, um.c.l(parameterAnnotations[0]), k10);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
    }

    public static f b(List<f> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = list.get(i10);
            if (a0.d(fVar.f31426a, type) && fVar.b.equals(set)) {
                return fVar;
            }
        }
        return null;
    }

    public static a c(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.isAnnotationPresent(z.class)) {
                    f e10 = e(obj, method);
                    f b10 = b(arrayList, e10.f31426a, e10.b);
                    if (b10 != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + b10.f31428d + "\n    " + e10.f31428d);
                    }
                    arrayList.add(e10);
                }
                if (method.isAnnotationPresent(sm.f.class)) {
                    f a10 = a(obj, method);
                    f b11 = b(arrayList2, a10.f31426a, a10.b);
                    if (b11 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + b11.f31428d + "\n    " + a10.f31428d);
                    }
                    arrayList2.add(a10);
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            return new a(arrayList, arrayList2);
        }
        throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + obj.getClass().getName());
    }

    public static boolean d(int i10, Type[] typeArr) {
        int length = typeArr.length;
        while (i10 < length) {
            Type type = typeArr[i10];
            if (!(type instanceof ParameterizedType) || ((ParameterizedType) type).getRawType() != h.class) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static f e(Object obj, Method method) {
        method.setAccessible(true);
        Type genericReturnType = method.getGenericReturnType();
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        int length = genericParameterTypes.length;
        Class cls = Void.TYPE;
        if (length >= 2 && genericParameterTypes[0] == t.class && genericReturnType == cls && d(2, genericParameterTypes)) {
            return new b(genericParameterTypes[1], um.c.l(parameterAnnotations[1]), obj, method, genericParameterTypes.length, 2, true);
        }
        if (genericParameterTypes.length == 1 && genericReturnType != cls) {
            Set<? extends Annotation> k10 = um.c.k(method);
            Set<? extends Annotation> l10 = um.c.l(parameterAnnotations[0]);
            return new c(genericParameterTypes[0], l10, obj, method, genericParameterTypes.length, 1, um.c.f(parameterAnnotations[0]), genericParameterTypes, genericReturnType, l10, k10);
        }
        throw new IllegalArgumentException("Unexpected signature for " + method + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
    }

    @Override // sm.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
        f b10 = b(this.f31409a, type, set);
        f b11 = b(this.b, type, set);
        h hVar = null;
        if (b10 == null && b11 == null) {
            return null;
        }
        if (b10 == null || b11 == null) {
            try {
                hVar = wVar.i(this, type, set);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("No " + (b10 == null ? "@ToJson" : "@FromJson") + " adapter for " + um.c.u(type, set), e10);
            }
        }
        h hVar2 = hVar;
        if (b10 != null) {
            b10.a(wVar, this);
        }
        if (b11 != null) {
            b11.a(wVar, this);
        }
        return new C0560a(b10, hVar2, wVar, b11, set, type);
    }
}
