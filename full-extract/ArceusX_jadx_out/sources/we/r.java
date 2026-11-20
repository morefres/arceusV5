package we;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r {
    public static final r b = a().a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f34287a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public HashMap<String, String> f34288a = new HashMap<>();

        public r a() {
            if (this.f34288a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            r rVar = new r(Collections.unmodifiableMap(this.f34288a));
            this.f34288a = null;
            return rVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f34287a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f34287a.equals(((r) obj).f34287a);
        }
        return false;
    }

    public int hashCode() {
        return this.f34287a.hashCode();
    }

    public String toString() {
        return this.f34287a.toString();
    }

    public r(Map<String, String> map) {
        this.f34287a = map;
    }
}
