package we;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h<E extends Enum<E>, O> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<E, O> f34230a;
    public final Map<O, E> b;

    public static final class b<E extends Enum<E>, O> {

        /* renamed from: a, reason: collision with root package name */
        public Map<E, O> f34231a;
        public Map<O, E> b;

        public b<E, O> a(E e10, O o8) {
            this.f34231a.put(e10, o8);
            this.b.put(o8, e10);
            return this;
        }

        public h<E, O> b() {
            return new h<>(Collections.unmodifiableMap(this.f34231a), Collections.unmodifiableMap(this.b));
        }

        public b() {
            this.f34231a = new HashMap();
            this.b = new HashMap();
        }
    }

    public static <E extends Enum<E>, O> b<E, O> a() {
        return new b<>();
    }

    public O b(E e10) {
        O o8 = this.f34230a.get(e10);
        if (o8 != null) {
            return o8;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + e10);
    }

    public E c(O o8) {
        E e10 = this.b.get(o8);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + o8);
    }

    public h(Map<E, O> map, Map<O, E> map2) {
        this.f34230a = map;
        this.b = map2;
    }
}
