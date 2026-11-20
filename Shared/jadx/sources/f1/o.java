package f1;

import android.util.Size;
import f1.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final Map<x, h1.i> f16462a = new LinkedHashMap();
    public final TreeMap<Size, x> b = new TreeMap<>(new p0.e());

    /* renamed from: c, reason: collision with root package name */
    public final h1.i f16463c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.i f16464d;

    public o(n0.z1 z1Var, int i10) {
        for (x xVar : x.b()) {
            n0.a2 e10 = e(xVar, z1Var, i10);
            if (e10 != null) {
                g0.r1.a("CapabilitiesByQuality", "profiles = " + e10);
                h1.i h10 = h(e10);
                if (h10 == null) {
                    g0.r1.l("CapabilitiesByQuality", "EncoderProfiles of quality " + xVar + " has no video validated profiles.");
                } else {
                    this.b.put(h10.k().k(), xVar);
                    this.f16462a.put(xVar, h10);
                }
            }
        }
        if (this.f16462a.isEmpty()) {
            g0.r1.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f16464d = null;
            this.f16463c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f16462a.values());
            this.f16463c = (h1.i) arrayDeque.peekFirst();
            this.f16464d = (h1.i) arrayDeque.peekLast();
        }
    }

    public static void a(x xVar) {
        x2.g.b(x.a(xVar), "Unknown quality: " + xVar);
    }

    public static boolean b(n0.z1 z1Var, int i10) {
        return !new o(z1Var, i10).g().isEmpty();
    }

    public h1.i c(Size size) {
        x d10 = d(size);
        g0.r1.a("CapabilitiesByQuality", "Using supported quality of " + d10 + " for size " + size);
        if (d10 == x.f16617g) {
            return null;
        }
        h1.i f10 = f(d10);
        if (f10 != null) {
            return f10;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public x d(Size size) {
        x xVar = (x) w0.d.a(size, this.b);
        return xVar != null ? xVar : x.f16617g;
    }

    public final n0.a2 e(x xVar, n0.z1 z1Var, int i10) {
        x2.g.j(xVar instanceof x.b, "Currently only support ConstantQuality");
        return z1Var.b(((x.b) xVar).e(i10));
    }

    public h1.i f(x xVar) {
        a(xVar);
        return xVar == x.f16616f ? this.f16463c : xVar == x.f16615e ? this.f16464d : this.f16462a.get(xVar);
    }

    public List<x> g() {
        return new ArrayList(this.f16462a.keySet());
    }

    public final h1.i h(n0.a2 a2Var) {
        if (a2Var.b().isEmpty()) {
            return null;
        }
        return h1.i.i(a2Var);
    }
}
