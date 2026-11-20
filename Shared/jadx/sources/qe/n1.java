package qe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import we.h0;
import we.w;

/* loaded from: classes2.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final w.a<o1> f29720a = new w.a() { // from class: qe.l1
        @Override // we.w.a
        public final pe.l a(pe.x xVar, Integer num) {
            k1 b10;
            b10 = n1.b((o1) xVar, num);
            return b10;
        }
    };
    public static final we.h0<k1, pe.a> b = we.h0.b(new h0.b() { // from class: qe.m1
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return re.l0.c((k1) lVar);
        }
    }, k1.class, pe.a.class);

    public static k1 b(o1 o1Var, Integer num) {
        return k1.b(o1Var, ef.c.b(32), num);
    }

    public static Map<String, pe.x> c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", j1.f29683i);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", j1.f29684j);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", j1.f29685k);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", j1.f29686l);
        return Collections.unmodifiableMap(hashMap);
    }

    public static void d(boolean z10) {
        re.q0.g();
        we.z.a().c(c());
        we.a0.c().d(b);
        we.w.f().b(f29720a, o1.class);
    }
}
