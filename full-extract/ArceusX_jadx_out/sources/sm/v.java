package sm;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import sm.h;

/* loaded from: classes2.dex */
public final class v<K, V> extends h<Map<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    public static final h.e f31539c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final h<K> f31540a;
    public final h<V> b;

    public class a implements h.e {
        @Override // sm.h.e
        public h<?> create(Type type, Set<? extends Annotation> set, w wVar) {
            Class<?> g10;
            if (!set.isEmpty() || (g10 = a0.g(type)) != Map.class) {
                return null;
            }
            Type[] i10 = a0.i(type, g10);
            return new v(wVar, i10[0], i10[1]).nullSafe();
        }
    }

    public v(w wVar, Type type, Type type2) {
        this.f31540a = wVar.d(type);
        this.b = wVar.d(type2);
    }

    @Override // sm.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map<K, V> fromJson(m mVar) {
        u uVar = new u();
        mVar.b();
        while (mVar.f()) {
            mVar.x();
            K fromJson = this.f31540a.fromJson(mVar);
            V fromJson2 = this.b.fromJson(mVar);
            V put = uVar.put(fromJson, fromJson2);
            if (put != null) {
                throw new j("Map key '" + fromJson + "' has multiple values at path " + mVar.getPath() + ": " + put + " and " + fromJson2);
            }
        }
        mVar.d();
        return uVar;
    }

    @Override // sm.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(t tVar, Map<K, V> map) {
        tVar.c();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new j("Map key is null at " + tVar.getPath());
            }
            tVar.s();
            this.f31540a.toJson(tVar, (t) entry.getKey());
            this.b.toJson(tVar, (t) entry.getValue());
        }
        tVar.g();
    }

    public String toString() {
        return "JsonAdapter(" + this.f31540a + "=" + this.b + ")";
    }
}
