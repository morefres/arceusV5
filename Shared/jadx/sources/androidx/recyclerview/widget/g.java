package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<d> f3010a = new a();

    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f3012a - dVar2.f3012a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f3011a;
        public final int b;

        public c(int i10) {
            int[] iArr = new int[i10];
            this.f3011a = iArr;
            this.b = iArr.length / 2;
        }

        public int[] a() {
            return this.f3011a;
        }

        public int b(int i10) {
            return this.f3011a[i10 + this.b];
        }

        public void c(int i10, int i11) {
            this.f3011a[i10 + this.b] = i11;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f3012a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final int f3013c;

        public d(int i10, int i11, int i12) {
            this.f3012a = i10;
            this.b = i11;
            this.f3013c = i12;
        }

        public int a() {
            return this.f3012a + this.f3013c;
        }

        public int b() {
            return this.b + this.f3013c;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final List<d> f3014a;
        public final int[] b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f3015c;

        /* renamed from: d, reason: collision with root package name */
        public final b f3016d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3017e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3018f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f3019g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f3014a = list;
            this.b = iArr;
            this.f3015c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f3016d = bVar;
            this.f3017e = bVar.e();
            this.f3018f = bVar.d();
            this.f3019g = z10;
            a();
            e();
        }

        public static C0052g g(Collection<C0052g> collection, int i10, boolean z10) {
            C0052g c0052g;
            Iterator<C0052g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c0052g = null;
                    break;
                }
                c0052g = it.next();
                if (c0052g.f3020a == i10 && c0052g.f3021c == z10) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C0052g next = it.next();
                if (z10) {
                    next.b--;
                } else {
                    next.b++;
                }
            }
            return c0052g;
        }

        public final void a() {
            d dVar = this.f3014a.isEmpty() ? null : this.f3014a.get(0);
            if (dVar == null || dVar.f3012a != 0 || dVar.b != 0) {
                this.f3014a.add(0, new d(0, 0, 0));
            }
            this.f3014a.add(new d(this.f3017e, this.f3018f, 0));
        }

        public void b(@NonNull RecyclerView.h hVar) {
            c(new androidx.recyclerview.widget.b(hVar));
        }

        public void c(@NonNull w4.b bVar) {
            int i10;
            w4.a aVar = bVar instanceof w4.a ? (w4.a) bVar : new w4.a(bVar);
            int i11 = this.f3017e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f3017e;
            int i13 = this.f3018f;
            for (int size = this.f3014a.size() - 1; size >= 0; size--) {
                d dVar = this.f3014a.get(size);
                int a10 = dVar.a();
                int b = dVar.b();
                while (true) {
                    if (i12 <= a10) {
                        break;
                    }
                    i12--;
                    int i14 = this.b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        C0052g g10 = g(arrayDeque, i15, false);
                        if (g10 != null) {
                            int i16 = (i11 - g10.b) - 1;
                            aVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                aVar.c(i16, 1, this.f3016d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new C0052g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        aVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > b) {
                    i13--;
                    int i17 = this.f3015c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        C0052g g11 = g(arrayDeque, i18, true);
                        if (g11 == null) {
                            arrayDeque.add(new C0052g(i13, i11 - i12, false));
                        } else {
                            aVar.d((i11 - g11.b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                aVar.c(i12, 1, this.f3016d.c(i18, i13));
                            }
                        }
                    } else {
                        aVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f3012a;
                int i20 = dVar.b;
                for (i10 = 0; i10 < dVar.f3013c; i10++) {
                    if ((this.b[i19] & 15) == 2) {
                        aVar.c(i19, 1, this.f3016d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f3012a;
                i13 = dVar.b;
            }
            aVar.e();
        }

        public final void d(int i10) {
            int size = this.f3014a.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = this.f3014a.get(i12);
                while (i11 < dVar.b) {
                    if (this.f3015c[i11] == 0 && this.f3016d.b(i10, i11)) {
                        int i13 = this.f3016d.a(i10, i11) ? 8 : 4;
                        this.b[i10] = (i11 << 4) | i13;
                        this.f3015c[i11] = (i10 << 4) | i13;
                        return;
                    }
                    i11++;
                }
                i11 = dVar.b();
            }
        }

        public final void e() {
            for (d dVar : this.f3014a) {
                for (int i10 = 0; i10 < dVar.f3013c; i10++) {
                    int i11 = dVar.f3012a + i10;
                    int i12 = dVar.b + i10;
                    int i13 = this.f3016d.a(i11, i12) ? 1 : 2;
                    this.b[i11] = (i12 << 4) | i13;
                    this.f3015c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f3019g) {
                f();
            }
        }

        public final void f() {
            int i10 = 0;
            for (d dVar : this.f3014a) {
                while (i10 < dVar.f3012a) {
                    if (this.b[i10] == 0) {
                        d(i10);
                    }
                    i10++;
                }
                i10 = dVar.a();
            }
        }
    }

    public static abstract class f<T> {
        public abstract boolean a(@NonNull T t8, @NonNull T t10);

        public abstract boolean b(@NonNull T t8, @NonNull T t10);

        public Object c(@NonNull T t8, @NonNull T t10) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    public static class C0052g {

        /* renamed from: a, reason: collision with root package name */
        public int f3020a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3021c;

        public C0052g(int i10, int i11, boolean z10) {
            this.f3020a = i10;
            this.b = i11;
            this.f3021c = z10;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f3022a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f3023c;

        /* renamed from: d, reason: collision with root package name */
        public int f3024d;

        public h() {
        }

        public int a() {
            return this.f3024d - this.f3023c;
        }

        public int b() {
            return this.b - this.f3022a;
        }

        public h(int i10, int i11, int i12, int i13) {
            this.f3022a = i10;
            this.b = i11;
            this.f3023c = i12;
            this.f3024d = i13;
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f3025a;
        public int b;

        /* renamed from: c, reason: collision with root package name */
        public int f3026c;

        /* renamed from: d, reason: collision with root package name */
        public int f3027d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3028e;

        public int a() {
            return Math.min(this.f3026c - this.f3025a, this.f3027d - this.b);
        }

        public boolean b() {
            return this.f3027d - this.b != this.f3026c - this.f3025a;
        }

        public boolean c() {
            return this.f3027d - this.b > this.f3026c - this.f3025a;
        }

        @NonNull
        public d d() {
            if (b()) {
                return this.f3028e ? new d(this.f3025a, this.b, a()) : c() ? new d(this.f3025a, this.b + 1, a()) : new d(this.f3025a + 1, this.b, a());
            }
            int i10 = this.f3025a;
            return new d(i10, this.b, this.f3026c - i10);
        }
    }

    public static i a(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int b10;
        int i11;
        int i12;
        boolean z10 = (hVar.b() - hVar.a()) % 2 == 0;
        int b11 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar2.b(i14 + 1) < cVar2.b(i14 - 1))) {
                b10 = cVar2.b(i14 + 1);
                i11 = b10;
            } else {
                b10 = cVar2.b(i14 - 1);
                i11 = b10 - 1;
            }
            int i15 = hVar.f3024d - ((hVar.b - i11) - i14);
            int i16 = (i10 == 0 || i11 != b10) ? i15 : i15 + 1;
            while (i11 > hVar.f3022a && i15 > hVar.f3023c && bVar.b(i11 - 1, i15 - 1)) {
                i11--;
                i15--;
            }
            cVar2.c(i14, i11);
            if (z10 && (i12 = b11 - i14) >= i13 && i12 <= i10 && cVar.b(i12) >= i11) {
                i iVar = new i();
                iVar.f3025a = i11;
                iVar.b = i15;
                iVar.f3026c = b10;
                iVar.f3027d = i16;
                iVar.f3028e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    public static e b(@NonNull b bVar) {
        return c(bVar, true);
    }

    @NonNull
    public static e c(@NonNull b bVar, boolean z10) {
        int e10 = bVar.e();
        int d10 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, e10, 0, d10));
        int i10 = ((((e10 + d10) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            i e11 = e(hVar, bVar, cVar, cVar2);
            if (e11 != null) {
                if (e11.a() > 0) {
                    arrayList.add(e11.d());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.f3022a = hVar.f3022a;
                hVar2.f3023c = hVar.f3023c;
                hVar2.b = e11.f3025a;
                hVar2.f3024d = e11.b;
                arrayList2.add(hVar2);
                hVar.b = hVar.b;
                hVar.f3024d = hVar.f3024d;
                hVar.f3022a = e11.f3026c;
                hVar.f3023c = e11.f3027d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, f3010a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    public static i d(h hVar, b bVar, c cVar, c cVar2, int i10) {
        int b10;
        int i11;
        int i12;
        boolean z10 = Math.abs(hVar.b() - hVar.a()) % 2 == 1;
        int b11 = hVar.b() - hVar.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 == i13 || (i14 != i10 && cVar.b(i14 + 1) > cVar.b(i14 - 1))) {
                b10 = cVar.b(i14 + 1);
                i11 = b10;
            } else {
                b10 = cVar.b(i14 - 1);
                i11 = b10 + 1;
            }
            int i15 = (hVar.f3023c + (i11 - hVar.f3022a)) - i14;
            int i16 = (i10 == 0 || i11 != b10) ? i15 : i15 - 1;
            while (i11 < hVar.b && i15 < hVar.f3024d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = b11 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                i iVar = new i();
                iVar.f3025a = b10;
                iVar.b = i16;
                iVar.f3026c = i11;
                iVar.f3027d = i15;
                iVar.f3028e = false;
                return iVar;
            }
        }
        return null;
    }

    public static i e(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.b() >= 1 && hVar.a() >= 1) {
            int b10 = ((hVar.b() + hVar.a()) + 1) / 2;
            cVar.c(1, hVar.f3022a);
            cVar2.c(1, hVar.b);
            for (int i10 = 0; i10 < b10; i10++) {
                i d10 = d(hVar, bVar, cVar, cVar2, i10);
                if (d10 != null) {
                    return d10;
                }
                i a10 = a(hVar, bVar, cVar, cVar2, i10);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }
}
