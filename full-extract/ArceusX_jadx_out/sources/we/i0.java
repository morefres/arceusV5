package we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map<c, h0<?, ?>> f34237a;
    public final Map<Class<?>, k0<?, ?>> b;

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f34239a;
        public final Class<?> b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f34239a.equals(this.f34239a) && cVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f34239a, this.b);
        }

        public String toString() {
            return this.f34239a.getSimpleName() + " with primitive type: " + this.b.getSimpleName();
        }

        public c(Class<?> cls, Class<?> cls2) {
            this.f34239a = cls;
            this.b = cls2;
        }
    }

    public static b c() {
        return new b();
    }

    public static b d(i0 i0Var) {
        return new b();
    }

    public Class<?> e(Class<?> cls) {
        if (this.b.containsKey(cls)) {
            return this.b.get(cls).c();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public <KeyT extends pe.l, PrimitiveT> PrimitiveT f(KeyT keyt, Class<PrimitiveT> cls) {
        c cVar = new c(keyt.getClass(), cls);
        if (this.f34237a.containsKey(cVar)) {
            return (PrimitiveT) this.f34237a.get(cVar).a(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT g(j0<InputPrimitiveT> j0Var, Class<WrapperPrimitiveT> cls) {
        if (!this.b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        k0<?, ?> k0Var = this.b.get(cls);
        if (j0Var.f().equals(k0Var.c()) && k0Var.c().equals(j0Var.f())) {
            return (WrapperPrimitiveT) k0Var.b(j0Var);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<c, h0<?, ?>> f34238a;
        public final Map<Class<?>, k0<?, ?>> b;

        public i0 c() {
            return new i0(this);
        }

        public <KeyT extends pe.l, PrimitiveT> b d(h0<KeyT, PrimitiveT> h0Var) {
            if (h0Var == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(h0Var.c(), h0Var.d());
            if (!this.f34238a.containsKey(cVar)) {
                this.f34238a.put(cVar, h0Var);
                return this;
            }
            h0<?, ?> h0Var2 = this.f34238a.get(cVar);
            if (h0Var2.equals(h0Var) && h0Var.equals(h0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        public <InputPrimitiveT, WrapperPrimitiveT> b e(k0<InputPrimitiveT, WrapperPrimitiveT> k0Var) {
            if (k0Var == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class<WrapperPrimitiveT> a10 = k0Var.a();
            if (!this.b.containsKey(a10)) {
                this.b.put(a10, k0Var);
                return this;
            }
            k0<?, ?> k0Var2 = this.b.get(a10);
            if (k0Var2.equals(k0Var) && k0Var.equals(k0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + a10);
        }

        public b() {
            this.f34238a = new HashMap();
            this.b = new HashMap();
        }

        public b(i0 i0Var) {
            this.f34238a = new HashMap(i0Var.f34237a);
            this.b = new HashMap(i0Var.b);
        }
    }

    public i0(b bVar) {
        this.f34237a = new HashMap(bVar.f34238a);
        this.b = new HashMap(bVar.b);
    }
}
