package f1;

import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m1.r1;
import n0.k3;

/* loaded from: classes.dex */
public class d1 implements h1 {
    public final n0.z1 b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16395c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16396d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<g0.k0, o> f16397e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map<g0.k0, o> f16398f = new HashMap();

    public d1(int i10, n0.o0 o0Var, int i11, r1.a aVar) {
        x2.g.b(i10 == 0 || i10 == 1, "Not a supported video capabilities source: " + i10);
        int i12 = i11 == 2 ? 2 : 1;
        this.f16396d = i12;
        this.b = h(i10, o0Var, aVar, i12);
        for (g0.k0 k0Var : o0Var.c()) {
            o oVar = new o(new h1.e(this.b, k0Var), this.f16396d);
            if (!oVar.g().isEmpty()) {
                this.f16397e.put(k0Var, oVar);
            }
        }
        this.f16395c = o0Var.o();
    }

    public static n0.z1 h(int i10, n0.o0 o0Var, r1.a aVar, int i11) {
        r1.a aVar2;
        n0.z1 x10 = o0Var.x();
        if (i11 == 2) {
            return !o0Var.s() ? n0.z1.f25678a : x10;
        }
        if (!o.b(x10, i11)) {
            g0.r1.l("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            x10 = new o1.c(o0Var, Arrays.asList(x.f16613c, x.b, x.f16612a), aVar);
        }
        k3 c10 = k1.c.c();
        n0.z1 dVar = new o1.d(x10, c10, o0Var, aVar);
        if (i10 == 1) {
            aVar2 = aVar;
            dVar = new h1.h(dVar, x.b(), Collections.singleton(g0.k0.f17922d), o0Var.m(34), aVar2);
        } else {
            aVar2 = aVar;
        }
        n0.z1 eVar = new o1.e(dVar, c10);
        if (i(o0Var)) {
            eVar = new h1.b(eVar, aVar2);
        }
        return new o1.f(eVar, o0Var, c10);
    }

    public static boolean i(n0.o0 o0Var) {
        for (g0.k0 k0Var : o0Var.c()) {
            Integer valueOf = Integer.valueOf(k0Var.b());
            int a10 = k0Var.a();
            if (valueOf.equals(3) && a10 == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.h1
    public x a(Size size, g0.k0 k0Var) {
        o g10 = g(k0Var);
        return g10 == null ? x.f16617g : g10.d(size);
    }

    @Override // f1.h1
    public h1.i b(Size size, g0.k0 k0Var) {
        o g10 = g(k0Var);
        if (g10 == null) {
            return null;
        }
        return g10.c(size);
    }

    @Override // f1.h1
    public Set<g0.k0> c() {
        return this.f16397e.keySet();
    }

    @Override // f1.h1
    public h1.i d(x xVar, g0.k0 k0Var) {
        o g10 = g(k0Var);
        if (g10 == null) {
            return null;
        }
        return g10.f(xVar);
    }

    @Override // f1.h1
    public List<x> e(g0.k0 k0Var) {
        o g10 = g(k0Var);
        return g10 == null ? new ArrayList() : g10.g();
    }

    public final o f(g0.k0 k0Var) {
        if (n0.y1.c(k0Var, c())) {
            return new o(new h1.e(this.b, k0Var), this.f16396d);
        }
        return null;
    }

    public final o g(g0.k0 k0Var) {
        if (k0Var.e()) {
            return this.f16397e.get(k0Var);
        }
        if (this.f16398f.containsKey(k0Var)) {
            return this.f16398f.get(k0Var);
        }
        o f10 = f(k0Var);
        this.f16398f.put(k0Var, f10);
        return f10;
    }
}
