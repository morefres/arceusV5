package ln;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, on.e<?>> f23569a = new HashMap();

    public <D> void a(on.e<D> eVar) {
        on.e c10 = c(eVar.c());
        if (c10 == null) {
            this.f23569a.put(eVar.c(), eVar);
        } else {
            c10.a(eVar);
        }
    }

    public <V> V b(Class<V> cls, String str) {
        on.e<V> c10 = c(cls);
        if (c10 == null) {
            return null;
        }
        return c10.b(str);
    }

    public final <V> on.e<V> c(Class<V> cls) {
        return (on.e) this.f23569a.get(cls);
    }
}
