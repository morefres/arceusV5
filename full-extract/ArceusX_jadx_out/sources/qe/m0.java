package qe;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import qe.n0;

/* loaded from: classes2.dex */
public class m0 extends b {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f29715a;
    public final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f29716c;

    public m0(n0 n0Var, ef.a aVar, Integer num) {
        this.f29715a = n0Var;
        this.b = aVar;
        this.f29716c = num;
    }

    public static m0 b(n0 n0Var, Integer num) {
        ef.a a10;
        if (n0Var.d() == n0.a.b) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            a10 = ef.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (n0Var.d() != n0.a.f29718c) {
                throw new GeneralSecurityException("Unknown Variant: " + n0Var.d());
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            a10 = ef.a.a(new byte[0]);
        }
        return new m0(n0Var, a10, num);
    }

    @Override // pe.l
    public Integer a() {
        return this.f29716c;
    }

    public ef.a c() {
        return this.b;
    }

    public n0 d() {
        return this.f29715a;
    }
}
