package q7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r7.c;

/* loaded from: classes3.dex */
public class h0 implements n0<n7.o> {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f29566a = new h0();
    public static final c.a b = c.a.a("c", "v", "i", "o");

    @Override // q7.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n7.o a(r7.c cVar, float f10) {
        if (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z10 = false;
        while (cVar.f()) {
            int r8 = cVar.r(b);
            if (r8 == 0) {
                z10 = cVar.g();
            } else if (r8 == 1) {
                list = s.f(cVar, f10);
            } else if (r8 == 2) {
                list2 = s.f(cVar, f10);
            } else if (r8 != 3) {
                cVar.s();
                cVar.u();
            } else {
                list3 = s.f(cVar, f10);
            }
        }
        cVar.e();
        if (cVar.o() == c.b.END_ARRAY) {
            cVar.d();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new n7.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = list.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new l7.a(s7.j.a(list.get(i11), list3.get(i11)), s7.j.a(pointF2, list2.get(i10)), pointF2));
        }
        if (z10) {
            PointF pointF3 = list.get(0);
            int i12 = size - 1;
            arrayList.add(new l7.a(s7.j.a(list.get(i12), list3.get(i12)), s7.j.a(pointF3, list2.get(0)), pointF3));
        }
        return new n7.o(pointF, z10, arrayList);
    }
}
