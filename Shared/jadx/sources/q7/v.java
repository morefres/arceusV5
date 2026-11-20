package q7;

import android.graphics.Color;
import android.graphics.Rect;
import androidx.core.view.MotionEventCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o7.e;
import r7.c;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29597a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", zl.t.f38095d, "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final c.a b = c.a.a(rl.d.f30696a, ve.a.f33391e);

    /* renamed from: c, reason: collision with root package name */
    public static final c.a f29598c = c.a.a("ty", "nm");

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29599a;

        static {
            int[] iArr = new int[e.b.values().length];
            f29599a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29599a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static o7.e a(f7.i iVar) {
        Rect b10 = iVar.b();
        List list = Collections.EMPTY_LIST;
        return new o7.e(list, iVar, "__container", -1L, e.a.PRE_COMP, -1L, null, list, new m7.n(), 0, 0, 0, 0.0f, 0.0f, b10.width(), b10.height(), null, null, list, e.b.NONE, null, false, null, null, n7.h.NORMAL);
    }

    public static o7.e b(r7.c cVar, f7.i iVar) {
        Float f10;
        boolean z10;
        float f11;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        e.b bVar = e.b.NONE;
        n7.h hVar = n7.h.NORMAL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        cVar.c();
        boolean z11 = false;
        e.b bVar2 = bVar;
        n7.h hVar2 = hVar;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        String str = null;
        m7.j jVar = null;
        m7.k kVar = null;
        m7.b bVar3 = null;
        n7.a aVar = null;
        j jVar2 = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        long j11 = -1;
        float f17 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        m7.n nVar = null;
        e.a aVar2 = null;
        boolean z13 = false;
        while (cVar.f()) {
            switch (cVar.r(f29597a)) {
                case 0:
                    str2 = cVar.m();
                    z11 = false;
                    break;
                case 1:
                    j10 = cVar.j();
                    z11 = false;
                    break;
                case 2:
                    str = cVar.m();
                    z11 = false;
                    break;
                case 3:
                    f11 = f17;
                    int j12 = cVar.j();
                    aVar2 = e.a.UNKNOWN;
                    if (j12 < aVar2.ordinal()) {
                        aVar2 = e.a.values()[j12];
                    }
                    f17 = f11;
                    z11 = false;
                    break;
                case 4:
                    j11 = cVar.j();
                    z11 = false;
                    break;
                case 5:
                    i10 = (int) (cVar.j() * s7.m.e());
                    z11 = false;
                    break;
                case 6:
                    i11 = (int) (cVar.j() * s7.m.e());
                    z11 = false;
                    break;
                case 7:
                    i12 = Color.parseColor(cVar.m());
                    z11 = false;
                    break;
                case 8:
                    nVar = c.g(cVar, iVar);
                    z11 = false;
                    break;
                case 9:
                    f11 = f17;
                    int j13 = cVar.j();
                    if (j13 >= e.b.values().length) {
                        iVar.a("Unsupported matte type: " + j13);
                    } else {
                        bVar2 = e.b.values()[j13];
                        int i13 = a.f29599a[bVar2.ordinal()];
                        if (i13 == 1) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (i13 == 2) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        iVar.r(1);
                    }
                    f17 = f11;
                    z11 = false;
                    break;
                case 10:
                    f11 = f17;
                    cVar.b();
                    while (cVar.f()) {
                        arrayList.add(x.a(cVar, iVar));
                    }
                    iVar.r(arrayList.size());
                    cVar.d();
                    f17 = f11;
                    z11 = false;
                    break;
                case 11:
                    f11 = f17;
                    cVar.b();
                    while (cVar.f()) {
                        n7.c a10 = h.a(cVar, iVar);
                        if (a10 != null) {
                            arrayList2.add(a10);
                        }
                    }
                    cVar.d();
                    f17 = f11;
                    z11 = false;
                    break;
                case 12:
                    f11 = f17;
                    cVar.c();
                    while (cVar.f()) {
                        int r8 = cVar.r(b);
                        if (r8 == 0) {
                            jVar = d.d(cVar, iVar);
                        } else if (r8 != 1) {
                            cVar.s();
                            cVar.u();
                        } else {
                            cVar.b();
                            if (cVar.f()) {
                                kVar = b.a(cVar, iVar);
                            }
                            while (cVar.f()) {
                                cVar.u();
                            }
                            cVar.d();
                        }
                    }
                    cVar.e();
                    f17 = f11;
                    z11 = false;
                    break;
                case 13:
                    f11 = f17;
                    cVar.b();
                    ArrayList arrayList3 = new ArrayList();
                    while (cVar.f()) {
                        cVar.c();
                        while (cVar.f()) {
                            int r10 = cVar.r(f29598c);
                            if (r10 == 0) {
                                int j14 = cVar.j();
                                if (j14 == 29) {
                                    aVar = e.b(cVar, iVar);
                                } else if (j14 == 25) {
                                    jVar2 = new k().b(cVar, iVar);
                                }
                            } else if (r10 != 1) {
                                cVar.s();
                                cVar.u();
                            } else {
                                arrayList3.add(cVar.m());
                            }
                        }
                        cVar.e();
                    }
                    cVar.d();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    f17 = f11;
                    z11 = false;
                    break;
                case 14:
                    f17 = (float) cVar.h();
                    z11 = false;
                    break;
                case 15:
                    f16 = (float) cVar.h();
                    z11 = false;
                    break;
                case 16:
                    f11 = f17;
                    f14 = (float) (cVar.h() * s7.m.e());
                    f17 = f11;
                    z11 = false;
                    break;
                case 17:
                    f11 = f17;
                    f15 = (float) (cVar.h() * s7.m.e());
                    f17 = f11;
                    z11 = false;
                    break;
                case 18:
                    f12 = (float) cVar.h();
                    break;
                case 19:
                    f13 = (float) cVar.h();
                    break;
                case 20:
                    bVar3 = d.f(cVar, iVar, z11);
                    break;
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                    str3 = cVar.m();
                    break;
                case MotionEventCompat.AXIS_GAS /* 22 */:
                    z12 = cVar.g();
                    break;
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    if (cVar.j() != 1) {
                        z13 = z11;
                        break;
                    } else {
                        z13 = true;
                        break;
                    }
                case MotionEventCompat.AXIS_DISTANCE /* 24 */:
                    int j15 = cVar.j();
                    if (j15 < n7.h.values().length) {
                        hVar2 = n7.h.values()[j15];
                        break;
                    } else {
                        iVar.a("Unsupported Blend Mode: " + j15);
                        hVar2 = n7.h.NORMAL;
                        break;
                    }
                default:
                    cVar.s();
                    cVar.u();
                    f11 = f17;
                    f17 = f11;
                    z11 = false;
                    break;
            }
        }
        float f18 = f17;
        cVar.e();
        ArrayList arrayList4 = new ArrayList();
        if (f12 > 0.0f) {
            z10 = z13;
            f10 = valueOf;
            arrayList4.add(new t7.a(iVar, valueOf, valueOf, null, 0.0f, Float.valueOf(f12)));
        } else {
            f10 = valueOf;
            z10 = z13;
        }
        if (f13 <= 0.0f) {
            f13 = iVar.f();
        }
        arrayList4.add(new t7.a(iVar, valueOf2, valueOf2, null, f12, Float.valueOf(f13)));
        arrayList4.add(new t7.a(iVar, f10, f10, null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (nVar == null) {
                nVar = new m7.n();
            }
            nVar.m(z10);
        }
        return new o7.e(arrayList2, iVar, str2, j10, aVar2, j11, str, arrayList, nVar, i10, i11, i12, f18, f16, f14, f15, jVar, kVar, arrayList4, bVar2, bVar3, z12, aVar, jVar2, hVar2);
    }
}
