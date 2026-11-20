package we;

import af.f0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class l0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f34260a;
    public final ef.a b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.h f34261c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.c f34262d;

    /* renamed from: e, reason: collision with root package name */
    public final af.p0 f34263e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f34264f;

    public l0(String str, ef.a aVar, com.google.crypto.tink.shaded.protobuf.h hVar, f0.c cVar, af.p0 p0Var, Integer num) {
        this.f34260a = str;
        this.b = aVar;
        this.f34261c = hVar;
        this.f34262d = cVar;
        this.f34263e = p0Var;
        this.f34264f = num;
    }

    public static l0 b(String str, com.google.crypto.tink.shaded.protobuf.h hVar, f0.c cVar, af.p0 p0Var, Integer num) {
        if (p0Var == af.p0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new l0(str, s0.b(str), hVar, cVar, p0Var, num);
    }

    @Override // we.p0
    public ef.a a() {
        return this.b;
    }

    public Integer c() {
        return this.f34264f;
    }

    public f0.c d() {
        return this.f34262d;
    }

    public af.p0 e() {
        return this.f34263e;
    }

    public String f() {
        return this.f34260a;
    }

    public com.google.crypto.tink.shaded.protobuf.h g() {
        return this.f34261c;
    }
}
