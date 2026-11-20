package xe;

import af.c0;
import af.f0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ue.b;
import we.a0;
import we.h0;
import we.r0;
import we.w;
import we.x;
import xe.o;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final h0<i, g> f35546a = h0.b(new h0.b() { // from class: xe.j
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return new ye.h((i) lVar);
        }
    }, i.class, g.class);
    public static final h0<i, pe.w> b = h0.b(new h0.b() { // from class: xe.k
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return df.t.d((i) lVar);
        }
    }, i.class, pe.w.class);

    /* renamed from: c, reason: collision with root package name */
    public static final pe.m<pe.w> f35547c = we.o.e("type.googleapis.com/google.crypto.tink.HmacKey", pe.w.class, f0.c.SYMMETRIC, c0.i0());

    /* renamed from: d, reason: collision with root package name */
    public static final x.a<o> f35548d = new qe.h();

    /* renamed from: e, reason: collision with root package name */
    public static final w.a<o> f35549e = new w.a() { // from class: xe.l
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            return n.b((o) xVar, num);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final b.EnumC0592b f35550f = b.EnumC0592b.b;

    public static i b(o oVar, Integer num) {
        return i.b().e(oVar).d(ef.c.b(oVar.e())).c(num).a();
    }

    public static final pe.o c() {
        return (pe.o) r0.a(new r0.a() { // from class: xe.m
            @Override // we.r0.a
            public final Object get() {
                pe.o a10;
                a10 = pe.o.a(o.b().c(32).d(16).b(o.c.f35558d).e(o.d.b).a());
                return a10;
            }
        });
    }

    public static Map<String, pe.x> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", z.f35572a);
        o.b d10 = o.b().c(32).d(16);
        o.d dVar = o.d.f35564e;
        o.b e10 = d10.e(dVar);
        o.c cVar = o.c.f35558d;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", e10.b(cVar).a());
        o.b d11 = o.b().c(32).d(32);
        o.d dVar2 = o.d.b;
        hashMap.put("HMAC_SHA256_256BITTAG", d11.e(dVar2).b(cVar).a());
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", o.b().c(32).d(32).e(dVar).b(cVar).a());
        o.b e11 = o.b().c(64).d(16).e(dVar2);
        o.c cVar2 = o.c.f35560f;
        hashMap.put("HMAC_SHA512_128BITTAG", e11.b(cVar2).a());
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", o.b().c(64).d(16).e(dVar).b(cVar2).a());
        hashMap.put("HMAC_SHA512_256BITTAG", o.b().c(64).d(32).e(dVar2).b(cVar2).a());
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", o.b().c(64).d(32).e(dVar).b(cVar2).a());
        hashMap.put("HMAC_SHA512_512BITTAG", z.f35574d);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", o.b().c(64).d(64).e(dVar).b(cVar2).a());
        return Collections.unmodifiableMap(hashMap);
    }

    public static void e(boolean z10) {
        b.EnumC0592b enumC0592b = f35550f;
        if (!enumC0592b.a()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        ye.m.h();
        a0.c().d(f35546a);
        a0.c().d(b);
        we.z.a().c(d());
        we.w.f().b(f35549e, o.class);
        we.x.b().a(f35548d, o.class);
        we.l.d().h(f35547c, enumC0592b, z10);
    }
}
