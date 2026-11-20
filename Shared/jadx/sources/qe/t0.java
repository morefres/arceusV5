package qe;

import java.security.GeneralSecurityException;
import qe.u0;

/* loaded from: classes2.dex */
public class t0 extends b {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f29755a;
    public final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f29756c;

    public t0(u0 u0Var, ef.a aVar, Integer num) {
        this.f29755a = u0Var;
        this.b = aVar;
        this.f29756c = num;
    }

    public static t0 b(u0 u0Var, Integer num) {
        ef.a b;
        if (u0Var.e() == u0.d.f29782c) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            b = we.e0.f34207a;
        } else {
            if (u0Var.e() != u0.d.b) {
                throw new GeneralSecurityException("Unknown Variant: " + u0Var.e());
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            b = we.e0.b(num.intValue());
        }
        return new t0(u0Var, b, num);
    }

    @Override // pe.l
    public Integer a() {
        return this.f29756c;
    }

    public ef.a c() {
        return this.b;
    }

    public u0 d() {
        return this.f29755a;
    }
}
