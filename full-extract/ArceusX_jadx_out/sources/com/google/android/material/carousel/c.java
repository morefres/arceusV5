package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import qc.f;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f7784a;
    public final List<b> b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f7785c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f7786d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f7787e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7788f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7789g;

    public c(@NonNull b bVar, List<b> list, List<b> list2) {
        this.f7784a = bVar;
        this.b = Collections.unmodifiableList(list);
        this.f7785c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f7777a - bVar.c().f7777a;
        this.f7788f = f10;
        float f11 = bVar.j().f7777a - list2.get(list2.size() - 1).j().f7777a;
        this.f7789g = f11;
        this.f7786d = m(f10, list, true);
        this.f7787e = m(f11, list2, false);
    }

    public static int b(b bVar, float f10) {
        for (int i10 = bVar.i(); i10 < bVar.g().size(); i10++) {
            if (f10 == bVar.g().get(i10).f7778c) {
                return i10;
            }
        }
        return bVar.g().size() - 1;
    }

    public static int c(b bVar) {
        for (int i10 = 0; i10 < bVar.g().size(); i10++) {
            if (!bVar.g().get(i10).f7780e) {
                return i10;
            }
        }
        return -1;
    }

    public static int d(b bVar, float f10) {
        for (int b = bVar.b() - 1; b >= 0; b--) {
            if (f10 == bVar.g().get(b).f7778c) {
                return b;
            }
        }
        return 0;
    }

    public static int e(b bVar) {
        for (int size = bVar.g().size() - 1; size >= 0; size--) {
            if (!bVar.g().get(size).f7780e) {
                return size;
            }
        }
        return -1;
    }

    public static c f(qc.b bVar, b bVar2, float f10, float f11, float f12) {
        return new c(bVar2, p(bVar, bVar2, f10, f11), n(bVar, bVar2, f10, f12));
    }

    public static float[] m(float f10, List<b> list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            b bVar = list.get(i11);
            b bVar2 = list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? bVar2.c().f7777a - bVar.c().f7777a : bVar.j().f7777a - bVar2.j().f7777a) / f10);
            i10++;
        }
        return fArr;
    }

    public static List<b> n(qc.b bVar, b bVar2, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int e10 = e(bVar2);
        float a10 = bVar.f() ? bVar.a() : bVar.b();
        if (!r(bVar, bVar2) && e10 != -1) {
            int i10 = e10 - bVar2.i();
            float f12 = bVar2.c().b - (bVar2.c().f7779d / 2.0f);
            if (i10 <= 0 && bVar2.h().f7781f > 0.0f) {
                arrayList.add(v(bVar2, f12 - bVar2.h().f7781f, a10));
                return arrayList;
            }
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < i10) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i12 = e10 - i11;
                float f14 = f13 + bVar2.g().get(i12).f7781f;
                int i13 = i12 + 1;
                b t8 = t(bVar3, e10, i13 < bVar2.g().size() ? d(bVar3, bVar2.g().get(i13).f7778c) + 1 : 0, f12 - f14, bVar2.b() + i11 + 1, bVar2.i() + i11 + 1, a10);
                if (i11 == i10 - 1 && f11 > 0.0f) {
                    t8 = u(t8, f11, a10, false, f10);
                }
                arrayList.add(t8);
                i11++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, a10, false, f10));
        }
        return arrayList;
    }

    public static float[] o(List<b> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{jc.a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List<b> p(qc.b bVar, b bVar2, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int c10 = c(bVar2);
        float a10 = bVar.f() ? bVar.a() : bVar.b();
        if (!q(bVar2) && c10 != -1) {
            int b = bVar2.b() - c10;
            float f12 = bVar2.c().b - (bVar2.c().f7779d / 2.0f);
            if (b <= 0 && bVar2.a().f7781f > 0.0f) {
                arrayList.add(v(bVar2, f12 + bVar2.a().f7781f, a10));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < b) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i11 = c10 + i10;
                int size = bVar2.g().size() - 1;
                float f14 = f13 + bVar2.g().get(i11).f7781f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(bVar3, bVar2.g().get(i12).f7778c) - 1;
                }
                b t8 = t(bVar3, c10, size, f12 + f14, (bVar2.b() - i10) - 1, (bVar2.i() - i10) - 1, a10);
                if (i10 == b - 1 && f11 > 0.0f) {
                    t8 = u(t8, f11, a10, true, f10);
                }
                arrayList.add(t8);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, a10, true, f10));
        }
        return arrayList;
    }

    public static boolean q(b bVar) {
        return bVar.a().b - (bVar.a().f7779d / 2.0f) >= 0.0f && bVar.a() == bVar.d();
    }

    public static boolean r(qc.b bVar, b bVar2) {
        int b = bVar.b();
        if (bVar.f()) {
            b = bVar.a();
        }
        return bVar2.h().b + (bVar2.h().f7779d / 2.0f) <= ((float) b) && bVar2.h() == bVar2.k();
    }

    public static b s(List<b> list, float f10, float[] fArr) {
        float[] o8 = o(list, f10, fArr);
        return b.m(list.get((int) o8[1]), list.get((int) o8[2]), o8[0]);
    }

    public static b t(b bVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(bVar.g());
        arrayList.add(i11, (b.c) arrayList.remove(i10));
        b.C0124b c0124b = new b.C0124b(bVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i14);
            float f12 = cVar.f7779d;
            c0124b.e(f10 + (f12 / 2.0f), cVar.f7778c, f12, i14 >= i12 && i14 <= i13, cVar.f7780e, cVar.f7781f);
            f10 += cVar.f7779d;
            i14++;
        }
        return c0124b.i();
    }

    public static b u(b bVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(bVar.g());
        b.C0124b c0124b = new b.C0124b(bVar.f(), f11);
        float l10 = f10 / bVar.l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i10);
            if (cVar.f7780e) {
                c0124b.e(cVar.b, cVar.f7778c, cVar.f7779d, false, true, cVar.f7781f);
            } else {
                boolean z11 = i10 >= bVar.b() && i10 <= bVar.i();
                float f14 = cVar.f7779d - l10;
                float b = f.b(f14, bVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.b;
                c0124b.f(f15, b, f14, z11, false, cVar.f7781f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return c0124b.i();
    }

    public static b v(b bVar, float f10, float f11) {
        return t(bVar, 0, 0, f10, bVar.b(), bVar.i(), f11);
    }

    public final b a(List<b> list, float f10, float[] fArr) {
        float[] o8 = o(list, f10, fArr);
        return o8[0] >= 0.5f ? list.get((int) o8[2]) : list.get((int) o8[1]);
    }

    public b g() {
        return this.f7784a;
    }

    public b h() {
        return this.f7785c.get(r0.size() - 1);
    }

    public Map<Integer, b> i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f7784a.f();
        HashMap hashMap = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f7789g || i13 >= i10 - this.f7785c.size()) {
                Integer valueOf = Integer.valueOf(i15);
                List<b> list = this.f7785c;
                hashMap.put(valueOf, list.get(s2.a.c(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f7788f || i17 < this.b.size()) {
                Integer valueOf2 = Integer.valueOf(i18);
                List<b> list2 = this.b;
                hashMap.put(valueOf2, list2.get(s2.a.c(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return hashMap;
    }

    public b j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    public b k(float f10, float f11, float f12, boolean z10) {
        float b;
        List<b> list;
        float[] fArr;
        float f13 = this.f7788f + f11;
        float f14 = f12 - this.f7789g;
        float f15 = l().a().f7782g;
        float f16 = h().h().f7783h;
        if (this.f7788f == f15) {
            f13 += f15;
        }
        if (this.f7789g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            b = jc.a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.b;
            fArr = this.f7786d;
        } else {
            if (f10 <= f14) {
                return this.f7784a;
            }
            b = jc.a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f7785c;
            fArr = this.f7787e;
        }
        return z10 ? a(list, b, fArr) : s(list, b, fArr);
    }

    public b l() {
        return this.b.get(r0.size() - 1);
    }
}
