package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import f1.c2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m1.r1;
import n0.a2;
import n0.g3;
import n0.o0;
import n0.z1;
import n1.c;
import w0.d;

/* loaded from: classes.dex */
public class ExtraSupportedQualityQuirk implements g3 {
    public static Range<Integer> i(a2.c cVar, r1.a aVar) {
        r1 a10 = aVar.a(cVar.i());
        return a10 != null ? a10.g() : c2.f16390a;
    }

    private static boolean j() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean k() {
        return j();
    }

    public Map<Integer, a2> g(o0 o0Var, z1 z1Var, r1.a aVar) {
        return j() ? h(o0Var, z1Var, aVar) : Collections.EMPTY_MAP;
    }

    public final Map<Integer, a2> h(o0 o0Var, z1 z1Var, r1.a aVar) {
        a2 b;
        a2.c b10;
        if (!"1".equals(o0Var.e()) || z1Var.a(4) || (b10 = c.b((b = z1Var.b(1)))) == null) {
            return null;
        }
        Range<Integer> i10 = i(b10, aVar);
        Size size = d.f33614d;
        a2.b h10 = a2.b.h(b.a(), b.e(), b.f(), Collections.singletonList(c.a(b10, size, i10)));
        HashMap hashMap = new HashMap();
        hashMap.put(4, h10);
        if (d.c(size) > d.c(b10.k())) {
            hashMap.put(1, h10);
        }
        return hashMap;
    }
}
