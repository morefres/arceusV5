package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class o {
    public static volatile o b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f2059c = new o(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, x.e<?, ?>> f2060a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2061a;
        public final int b;

        public a(Object obj, int i10) {
            this.f2061a = obj;
            this.b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2061a == aVar.f2061a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2061a) * 65535) + this.b;
        }
    }

    public o() {
        this.f2060a = new HashMap();
    }

    public static o b() {
        o oVar;
        if (c1.f1963d) {
            return f2059c;
        }
        o oVar2 = b;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            try {
                oVar = b;
                if (oVar == null) {
                    oVar = n.a();
                    b = oVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public <ContainingType extends r0> x.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return (x.e) this.f2060a.get(new a(containingtype, i10));
    }

    public o(boolean z10) {
        this.f2060a = Collections.EMPTY_MAP;
    }
}
