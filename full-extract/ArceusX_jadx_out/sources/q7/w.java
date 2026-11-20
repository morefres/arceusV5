package q7;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o7.e;
import r7.c;

/* loaded from: classes3.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29600a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static c.a b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29601c = c.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    public static final c.a f29602d = c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0044. Please report as an issue. */
    public static f7.i a(r7.c cVar) {
        float f10;
        r7.c cVar2 = cVar;
        float e10 = s7.m.e();
        w1.g<o7.e> gVar = new w1.g<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        w1.k<l7.d> kVar = new w1.k<>();
        f7.i iVar = new f7.i();
        cVar2.c();
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        while (cVar2.f()) {
            switch (cVar2.r(f29600a)) {
                case 0:
                    f10 = e10;
                    i11 = (int) cVar.h();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 1:
                    f10 = e10;
                    i10 = (int) cVar.h();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 2:
                    f10 = e10;
                    f11 = (float) cVar.h();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 3:
                    f10 = e10;
                    f12 = ((float) cVar.h()) - 0.01f;
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 4:
                    f10 = e10;
                    f13 = (float) cVar.h();
                    cVar2 = cVar;
                    e10 = f10;
                    break;
                case 5:
                    String[] split = cVar2.m().split("\\.");
                    if (!s7.m.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    cVar2 = cVar;
                    break;
                case 6:
                    e(cVar2, iVar, arrayList, gVar);
                    cVar2 = cVar;
                    break;
                case 7:
                    b(cVar2, iVar, hashMap, hashMap2);
                    cVar2 = cVar;
                    break;
                case 8:
                    d(cVar2, hashMap3);
                    cVar2 = cVar;
                    break;
                case 9:
                    c(cVar2, iVar, kVar);
                    cVar2 = cVar;
                    break;
                case 10:
                    f(cVar2, arrayList2);
                    cVar2 = cVar;
                    break;
                default:
                    cVar2.s();
                    cVar2.u();
                    cVar2 = cVar;
                    break;
            }
        }
        float f14 = e10;
        iVar.s(new Rect(0, 0, (int) (i11 * f14), (int) (i10 * f14)), f11, f12, f13, arrayList, gVar, hashMap, hashMap2, s7.m.e(), kVar, hashMap3, arrayList2, i11, i10);
        return iVar;
    }

    public static void b(r7.c cVar, f7.i iVar, Map<String, List<o7.e>> map, Map<String, f7.k0> map2) {
        cVar.b();
        while (cVar.f()) {
            ArrayList arrayList = new ArrayList();
            w1.g gVar = new w1.g();
            cVar.c();
            int i10 = 0;
            int i11 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (cVar.f()) {
                int r8 = cVar.r(b);
                if (r8 == 0) {
                    str = cVar.m();
                } else if (r8 == 1) {
                    cVar.b();
                    while (cVar.f()) {
                        o7.e b10 = v.b(cVar, iVar);
                        gVar.i(b10.e(), b10);
                        arrayList.add(b10);
                    }
                    cVar.d();
                } else if (r8 == 2) {
                    i10 = cVar.j();
                } else if (r8 == 3) {
                    i11 = cVar.j();
                } else if (r8 == 4) {
                    str2 = cVar.m();
                } else if (r8 != 5) {
                    cVar.s();
                    cVar.u();
                } else {
                    str3 = cVar.m();
                }
            }
            cVar.e();
            if (str2 != null) {
                f7.k0 k0Var = new f7.k0(i10, i11, str, str2, str3);
                map2.put(k0Var.e(), k0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.d();
    }

    public static void c(r7.c cVar, f7.i iVar, w1.k<l7.d> kVar) {
        cVar.b();
        while (cVar.f()) {
            l7.d a10 = m.a(cVar, iVar);
            kVar.i(a10.hashCode(), a10);
        }
        cVar.d();
    }

    public static void d(r7.c cVar, Map<String, l7.c> map) {
        cVar.c();
        while (cVar.f()) {
            if (cVar.r(f29601c) != 0) {
                cVar.s();
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    l7.c a10 = n.a(cVar);
                    map.put(a10.b(), a10);
                }
                cVar.d();
            }
        }
        cVar.e();
    }

    public static void e(r7.c cVar, f7.i iVar, List<o7.e> list, w1.g<o7.e> gVar) {
        cVar.b();
        int i10 = 0;
        while (cVar.f()) {
            o7.e b10 = v.b(cVar, iVar);
            if (b10.g() == e.a.IMAGE) {
                i10++;
            }
            list.add(b10);
            gVar.i(b10.e(), b10);
            if (i10 > 4) {
                s7.e.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.d();
    }

    public static void f(r7.c cVar, List<l7.h> list) {
        cVar.b();
        while (cVar.f()) {
            cVar.c();
            float f10 = 0.0f;
            String str = null;
            float f11 = 0.0f;
            while (cVar.f()) {
                int r8 = cVar.r(f29602d);
                if (r8 == 0) {
                    str = cVar.m();
                } else if (r8 == 1) {
                    f10 = (float) cVar.h();
                } else if (r8 != 2) {
                    cVar.s();
                    cVar.u();
                } else {
                    f11 = (float) cVar.h();
                }
            }
            cVar.e();
            list.add(new l7.h(str, f10, f11));
        }
        cVar.d();
    }
}
