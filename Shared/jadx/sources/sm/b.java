package sm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import sm.h;

/* loaded from: classes2.dex */
public final class b extends h<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final h.e f31432c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f31433a;
    public final h<Object> b;

    public class a implements h.e {
        @Override // sm.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            Type a10 = a0.a(type);
            if (a10 != null && set.isEmpty()) {
                return new b(a0.g(a10), wVar.d(a10)).nullSafe();
            }
            return null;
        }
    }

    public b(Class<?> cls, h<Object> hVar) {
        this.f31433a = cls;
        this.b = hVar;
    }

    @Override // sm.h
    public Object fromJson(m mVar) {
        ArrayList arrayList = new ArrayList();
        mVar.a();
        while (mVar.f()) {
            arrayList.add(this.b.fromJson(mVar));
        }
        mVar.c();
        Object newInstance = Array.newInstance(this.f31433a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // sm.h
    public void toJson(t tVar, Object obj) {
        tVar.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.b.toJson(tVar, (t) Array.get(obj, i10));
        }
        tVar.e();
    }

    public String toString() {
        return this.b + ".array()";
    }
}
