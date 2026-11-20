package we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map<d, n<?, ?>> f34279a;
    public final Map<c, m<?>> b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<d, g0<?, ?>> f34280c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<c, f0<?>> f34281d;

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends p0> f34285a;
        public final ef.a b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f34285a.equals(this.f34285a) && cVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f34285a, this.b);
        }

        public String toString() {
            return this.f34285a.getSimpleName() + ", object identifier: " + this.b;
        }

        public c(Class<? extends p0> cls, ef.a aVar) {
            this.f34285a = cls;
            this.b = aVar;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f34286a;
        public final Class<? extends p0> b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f34286a.equals(this.f34286a) && dVar.b.equals(this.b);
        }

        public int hashCode() {
            return Objects.hash(this.f34286a, this.b);
        }

        public String toString() {
            return this.f34286a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
        }

        public d(Class<?> cls, Class<? extends p0> cls2) {
            this.f34286a = cls;
            this.b = cls2;
        }
    }

    public <SerializationT extends p0> boolean e(SerializationT serializationt) {
        return this.b.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> boolean f(SerializationT serializationt) {
        return this.f34281d.containsKey(new c(serializationt.getClass(), serializationt.a()));
    }

    public <SerializationT extends p0> pe.l g(SerializationT serializationt, pe.d0 d0Var) {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.b.containsKey(cVar)) {
            return this.b.get(cVar).d(serializationt, d0Var);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public <SerializationT extends p0> pe.x h(SerializationT serializationt) {
        c cVar = new c(serializationt.getClass(), serializationt.a());
        if (this.f34281d.containsKey(cVar)) {
            return this.f34281d.get(cVar).d(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + cVar + " available");
    }

    public <KeyT extends pe.l, SerializationT extends p0> SerializationT i(KeyT keyt, Class<SerializationT> cls, pe.d0 d0Var) {
        d dVar = new d(keyt.getClass(), cls);
        if (this.f34279a.containsKey(dVar)) {
            return (SerializationT) this.f34279a.get(dVar).d(keyt, d0Var);
        }
        throw new GeneralSecurityException("No Key serializer for " + dVar + " available");
    }

    public <ParametersT extends pe.x, SerializationT extends p0> SerializationT j(ParametersT parameterst, Class<SerializationT> cls) {
        d dVar = new d(parameterst.getClass(), cls);
        if (this.f34280c.containsKey(dVar)) {
            return (SerializationT) this.f34280c.get(dVar).d(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + dVar + " available");
    }

    public q0(b bVar) {
        this.f34279a = new HashMap(bVar.f34282a);
        this.b = new HashMap(bVar.b);
        this.f34280c = new HashMap(bVar.f34283c);
        this.f34281d = new HashMap(bVar.f34284d);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<d, n<?, ?>> f34282a;
        public final Map<c, m<?>> b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<d, g0<?, ?>> f34283c;

        /* renamed from: d, reason: collision with root package name */
        public final Map<c, f0<?>> f34284d;

        public b() {
            this.f34282a = new HashMap();
            this.b = new HashMap();
            this.f34283c = new HashMap();
            this.f34284d = new HashMap();
        }

        public q0 e() {
            return new q0(this);
        }

        public <SerializationT extends p0> b f(m<SerializationT> mVar) {
            c cVar = new c(mVar.c(), mVar.b());
            if (!this.b.containsKey(cVar)) {
                this.b.put(cVar, mVar);
                return this;
            }
            m<?> mVar2 = this.b.get(cVar);
            if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <KeyT extends pe.l, SerializationT extends p0> b g(n<KeyT, SerializationT> nVar) {
            d dVar = new d(nVar.b(), nVar.c());
            if (!this.f34282a.containsKey(dVar)) {
                this.f34282a.put(dVar, nVar);
                return this;
            }
            n<?, ?> nVar2 = this.f34282a.get(dVar);
            if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public <SerializationT extends p0> b h(f0<SerializationT> f0Var) {
            c cVar = new c(f0Var.c(), f0Var.b());
            if (!this.f34284d.containsKey(cVar)) {
                this.f34284d.put(cVar, f0Var);
                return this;
            }
            f0<?> f0Var2 = this.f34284d.get(cVar);
            if (f0Var2.equals(f0Var) && f0Var.equals(f0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public <ParametersT extends pe.x, SerializationT extends p0> b i(g0<ParametersT, SerializationT> g0Var) {
            d dVar = new d(g0Var.b(), g0Var.c());
            if (!this.f34283c.containsKey(dVar)) {
                this.f34283c.put(dVar, g0Var);
                return this;
            }
            g0<?, ?> g0Var2 = this.f34283c.get(dVar);
            if (g0Var2.equals(g0Var) && g0Var.equals(g0Var2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(q0 q0Var) {
            this.f34282a = new HashMap(q0Var.f34279a);
            this.b = new HashMap(q0Var.b);
            this.f34283c = new HashMap(q0Var.f34280c);
            this.f34284d = new HashMap(q0Var.f34281d);
        }
    }
}
