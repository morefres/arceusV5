package tm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import sm.a0;
import sm.h;
import sm.j;
import sm.m;
import sm.t;
import sm.w;

/* loaded from: classes2.dex */
public final class b<T> implements h.e {

    /* renamed from: a, reason: collision with root package name */
    public final Class<T> f32324a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f32325c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Type> f32326d;

    /* renamed from: e, reason: collision with root package name */
    public final h<Object> f32327e;

    public class a extends h<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f32328a;

        public a(Object obj) {
            this.f32328a = obj;
        }

        @Override // sm.h
        public Object fromJson(m mVar) {
            mVar.P();
            return this.f32328a;
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) {
            throw new IllegalArgumentException("Expected one of " + b.this.f32326d + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
        }
    }

    /* renamed from: tm.b$b, reason: collision with other inner class name */
    public static final class C0583b extends h<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final String f32329a;
        public final List<String> b;

        /* renamed from: c, reason: collision with root package name */
        public final List<Type> f32330c;

        /* renamed from: d, reason: collision with root package name */
        public final List<h<Object>> f32331d;

        /* renamed from: e, reason: collision with root package name */
        public final h<Object> f32332e;

        /* renamed from: f, reason: collision with root package name */
        public final m.b f32333f;

        /* renamed from: g, reason: collision with root package name */
        public final m.b f32334g;

        public C0583b(String str, List<String> list, List<Type> list2, List<h<Object>> list3, h<Object> hVar) {
            this.f32329a = str;
            this.b = list;
            this.f32330c = list2;
            this.f32331d = list3;
            this.f32332e = hVar;
            this.f32333f = m.b.a(str);
            this.f32334g = m.b.a((String[]) list.toArray(new String[0]));
        }

        public final int a(m mVar) {
            mVar.b();
            while (mVar.f()) {
                if (mVar.F(this.f32333f) != -1) {
                    int H = mVar.H(this.f32334g);
                    if (H != -1 || this.f32332e != null) {
                        return H;
                    }
                    throw new j("Expected one of " + this.b + " for key '" + this.f32329a + "' but found '" + mVar.r() + "'. Register a subtype for this label.");
                }
                mVar.M();
                mVar.P();
            }
            throw new j("Missing label for " + this.f32329a);
        }

        @Override // sm.h
        public Object fromJson(m mVar) {
            m w5 = mVar.w();
            w5.I(false);
            try {
                int a10 = a(w5);
                w5.close();
                return a10 == -1 ? this.f32332e.fromJson(mVar) : this.f32331d.get(a10).fromJson(mVar);
            } catch (Throwable th2) {
                w5.close();
                throw th2;
            }
        }

        @Override // sm.h
        public void toJson(t tVar, Object obj) {
            h<Object> hVar;
            int indexOf = this.f32330c.indexOf(obj.getClass());
            if (indexOf == -1) {
                hVar = this.f32332e;
                if (hVar == null) {
                    throw new IllegalArgumentException("Expected one of " + this.f32330c + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                }
            } else {
                hVar = this.f32331d.get(indexOf);
            }
            tVar.c();
            if (hVar != this.f32332e) {
                tVar.n(this.f32329a).M(this.b.get(indexOf));
            }
            int b = tVar.b();
            hVar.toJson(tVar, (t) obj);
            tVar.f(b);
            tVar.g();
        }

        public String toString() {
            return "PolymorphicJsonAdapter(" + this.f32329a + ")";
        }
    }

    public b(Class<T> cls, String str, List<String> list, List<Type> list2, h<Object> hVar) {
        this.f32324a = cls;
        this.b = str;
        this.f32325c = list;
        this.f32326d = list2;
        this.f32327e = hVar;
    }

    public static <T> b<T> b(Class<T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("baseType == null");
        }
        if (str == null) {
            throw new NullPointerException("labelKey == null");
        }
        List list = Collections.EMPTY_LIST;
        return new b<>(cls, str, list, list, null);
    }

    public final h<Object> a(T t8) {
        return new a(t8);
    }

    public b<T> c(T t8) {
        return d(a(t8));
    }

    @Override // sm.h.e
    public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
        if (a0.g(type) != this.f32324a || !set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f32326d.size());
        int size = this.f32326d.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(wVar.d(this.f32326d.get(i10)));
        }
        return new C0583b(this.b, this.f32325c, this.f32326d, arrayList, this.f32327e).nullSafe();
    }

    public b<T> d(h<Object> hVar) {
        return new b<>(this.f32324a, this.b, this.f32325c, this.f32326d, hVar);
    }

    public b<T> e(Class<? extends T> cls, String str) {
        if (cls == null) {
            throw new NullPointerException("subtype == null");
        }
        if (str == null) {
            throw new NullPointerException("label == null");
        }
        if (this.f32325c.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(this.f32325c);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f32326d);
        arrayList2.add(cls);
        return new b<>(this.f32324a, this.b, arrayList, arrayList2, this.f32327e);
    }
}
