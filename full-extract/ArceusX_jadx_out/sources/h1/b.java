package h1;

import android.util.Rational;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import m1.r1;
import n0.a2;
import n0.z1;

/* loaded from: classes.dex */
public class b implements z1 {

    /* renamed from: c, reason: collision with root package name */
    public final z1 f18933c;

    /* renamed from: d, reason: collision with root package name */
    public final r1.a f18934d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<Integer, a2> f18935e = new HashMap();

    public b(z1 z1Var, r1.a aVar) {
        this.f18933c = z1Var;
        this.f18934d = aVar;
    }

    public static int d(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return 5;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    public static String e(int i10) {
        return a2.d(i10);
    }

    public static int f(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4096;
        }
        if (i10 == 3) {
            return 8192;
        }
        if (i10 == 4) {
            return -1;
        }
        throw new IllegalArgumentException("Unexpected HDR format: " + i10);
    }

    public static a2.c g(a2.c cVar, int i10, int i11) {
        if (cVar == null) {
            return null;
        }
        int e10 = cVar.e();
        String i12 = cVar.i();
        int j10 = cVar.j();
        if (i10 != cVar.g()) {
            e10 = d(i10);
            i12 = e(e10);
            j10 = f(i10);
        }
        return a2.c.a(e10, i12, j(cVar.c(), i11, cVar.b()), cVar.f(), cVar.l(), cVar.h(), j10, i11, cVar.d(), i10);
    }

    private a2 h(int i10) {
        if (this.f18935e.containsKey(Integer.valueOf(i10))) {
            return this.f18935e.get(Integer.valueOf(i10));
        }
        if (!this.f18933c.a(i10)) {
            return null;
        }
        a2 c10 = c(this.f18933c.b(i10), 1, 10);
        this.f18935e.put(Integer.valueOf(i10), c10);
        return c10;
    }

    public static a2.c i(a2.c cVar, int i10) {
        return a2.c.a(cVar.e(), cVar.i(), i10, cVar.f(), cVar.l(), cVar.h(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static int j(int i10, int i11, int i12) {
        if (i11 == i12) {
            return i10;
        }
        int doubleValue = (int) (i10 * new Rational(i11, i12).doubleValue());
        if (g0.r1.f("BackupHdrProfileEncoderProfilesProvider")) {
            g0.r1.a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(doubleValue)));
        }
        return doubleValue;
    }

    public static a2.c k(a2.c cVar, r1.a aVar) {
        r1 a10;
        if (cVar == null || (a10 = aVar.a(cVar.i())) == null || !a10.e(cVar.l(), cVar.h())) {
            return null;
        }
        int c10 = cVar.c();
        int intValue = a10.g().clamp(Integer.valueOf(c10)).intValue();
        return intValue == c10 ? cVar : i(cVar, intValue);
    }

    @Override // n0.z1
    public boolean a(int i10) {
        return this.f18933c.a(i10) && h(i10) != null;
    }

    @Override // n0.z1
    public a2 b(int i10) {
        return h(i10);
    }

    public final a2 c(a2 a2Var, int i10, int i11) {
        a2.c cVar;
        if (a2Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a2Var.b());
        Iterator<a2.c> it = a2Var.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            if (cVar.g() == 0) {
                break;
            }
        }
        a2.c k10 = k(g(cVar, i10, i11), this.f18934d);
        if (k10 != null) {
            arrayList.add(k10);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a2.b.h(a2Var.a(), a2Var.e(), a2Var.f(), arrayList);
    }
}
