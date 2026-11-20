package o1;

import androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m1.r1;
import n0.a2;
import n0.k3;
import n0.o0;
import n0.z1;

/* loaded from: classes.dex */
public class d implements z1 {

    /* renamed from: c, reason: collision with root package name */
    public final z1 f27518c;

    /* renamed from: d, reason: collision with root package name */
    public Map<Integer, a2> f27519d;

    public d(z1 z1Var, k3 k3Var, o0 o0Var, r1.a aVar) {
        this.f27518c = z1Var;
        List c10 = k3Var.c(ExtraSupportedQualityQuirk.class);
        if (c10.isEmpty()) {
            return;
        }
        x2.g.i(c10.size() == 1);
        Map<Integer, a2> g10 = ((ExtraSupportedQualityQuirk) c10.get(0)).g(o0Var, z1Var, aVar);
        if (g10 != null) {
            this.f27519d = new HashMap(g10);
        }
    }

    private a2 c(int i10) {
        Map<Integer, a2> map = this.f27519d;
        return (map == null || !map.containsKey(Integer.valueOf(i10))) ? this.f27518c.b(i10) : this.f27519d.get(Integer.valueOf(i10));
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return c(i10) != null;
    }

    @Override // n0.z1
    public a2 b(int i10) {
        return c(i10);
    }
}
