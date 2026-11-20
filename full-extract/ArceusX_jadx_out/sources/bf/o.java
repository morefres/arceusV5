package bf;

import bf.i;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class o extends c1 {

    /* renamed from: a, reason: collision with root package name */
    public final i f4100a;
    public final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public final ef.a f4101c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4102d;

    public o(i iVar, ef.a aVar, ef.a aVar2, Integer num) {
        this.f4100a = iVar;
        this.b = aVar;
        this.f4101c = aVar2;
        this.f4102d = num;
    }

    public static o c(i.a aVar, ef.a aVar2, Integer num) {
        i b = i.b(aVar);
        i.a aVar3 = i.a.f4057e;
        if (!aVar.equals(aVar3) && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar.equals(aVar3) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar2.c() == 32) {
            return new o(b, aVar2, d(b, num), num);
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + aVar2.c());
    }

    public static ef.a d(i iVar, Integer num) {
        if (iVar.c() == i.a.f4057e) {
            return we.e0.f34207a;
        }
        if (iVar.c() == i.a.f4055c || iVar.c() == i.a.f4056d) {
            return we.e0.a(num.intValue());
        }
        if (iVar.c() == i.a.b) {
            return we.e0.b(num.intValue());
        }
        throw new IllegalStateException("Unknown Variant: " + iVar.c());
    }

    @Override // pe.l
    public Integer a() {
        return this.f4102d;
    }

    @Override // bf.c1
    public ef.a b() {
        return this.f4101c;
    }

    public i e() {
        return this.f4100a;
    }

    public ef.a f() {
        return this.b;
    }
}
