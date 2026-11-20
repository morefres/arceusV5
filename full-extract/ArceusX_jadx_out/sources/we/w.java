package we;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w {
    public static final a<q> b = new a() { // from class: we.v
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            p e10;
            e10 = w.e((q) xVar, num);
            return e10;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final w f34299c = g();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends pe.x>, a<? extends pe.x>> f34300a = new HashMap();

    public interface a<ParametersT extends pe.x> {
        pe.l a(ParametersT parameterst, Integer num);
    }

    public static p e(q qVar, Integer num) {
        af.h0 d10 = qVar.b().d();
        pe.m<?> c10 = l.d().c(d10.f0());
        if (!l.d().f(d10.f0())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        af.f0 b10 = c10.b(d10.g0());
        return new p(l0.b(b10.f0(), b10.g0(), b10.e0(), d10.e0(), num), pe.j.a());
    }

    public static w f() {
        return f34299c;
    }

    public static w g() {
        w wVar = new w();
        try {
            wVar.b(b, q.class);
            return wVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public synchronized <ParametersT extends pe.x> void b(a<ParametersT> aVar, Class<ParametersT> cls) {
        try {
            a<? extends pe.x> aVar2 = this.f34300a.get(cls);
            if (aVar2 != null && !aVar2.equals(aVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f34300a.put(cls, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public pe.l c(pe.x xVar, Integer num) {
        return d(xVar, num);
    }

    public final synchronized <ParametersT extends pe.x> pe.l d(ParametersT parameterst, Integer num) {
        a<? extends pe.x> aVar;
        aVar = this.f34300a.get(parameterst.getClass());
        if (aVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + parameterst + ": no key creator for this class was registered.");
        }
        return aVar.a(parameterst, num);
    }
}
