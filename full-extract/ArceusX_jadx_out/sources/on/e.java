package on;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class e<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<D> f27979a;
    public final Map<String, D> b = new LinkedHashMap();

    public e(Class<D> cls) {
        this.f27979a = cls;
    }

    public void a(e<D> eVar) {
        for (Map.Entry<String, D> entry : eVar.b.entrySet()) {
            this.b.putIfAbsent(entry.getKey(), entry.getValue());
        }
    }

    public D b(String str) {
        return this.b.get(nn.c.c(str));
    }

    public Class<D> c() {
        return this.f27979a;
    }

    public D d(String str, D d10) {
        return this.b.putIfAbsent(nn.c.c(str), d10);
    }
}
