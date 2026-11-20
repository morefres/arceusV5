package o1;

import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import n0.a2;
import n0.k3;
import n0.z1;

/* loaded from: classes.dex */
public class e implements z1 {

    /* renamed from: c, reason: collision with root package name */
    public final z1 f27520c;

    /* renamed from: d, reason: collision with root package name */
    public final k3 f27521d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Integer, a2> f27522e = new HashMap();

    public e(z1 z1Var, k3 k3Var) {
        this.f27520c = z1Var;
        this.f27521d = k3Var;
    }

    public static a2.c d(a2.c cVar, Size size) {
        return a2.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private a2 f(int i10) {
        a2 a2Var;
        if (this.f27522e.containsKey(Integer.valueOf(i10))) {
            return this.f27522e.get(Integer.valueOf(i10));
        }
        if (this.f27520c.a(i10)) {
            a2 b = this.f27520c.b(i10);
            Objects.requireNonNull(b);
            a2Var = b;
            Size e10 = e(i10);
            if (e10 != null) {
                a2Var = c(a2Var, e10);
            }
        } else {
            a2Var = null;
        }
        this.f27522e.put(Integer.valueOf(i10), a2Var);
        return a2Var;
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f27520c.a(i10) && f(i10) != null;
    }

    @Override // n0.z1
    public a2 b(int i10) {
        return f(i10);
    }

    public final a2 c(a2 a2Var, Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<a2.c> it = a2Var.b().iterator();
        while (it.hasNext()) {
            arrayList.add(d(it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a2.b.h(a2Var.a(), a2Var.e(), a2Var.f(), arrayList);
    }

    public final Size e(int i10) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.f27521d.c(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.g(i10);
            }
        }
        return null;
    }
}
