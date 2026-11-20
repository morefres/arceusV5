package og;

import java.util.Map;
import mg.b;
import qg.c;
import qg.g;

/* loaded from: classes3.dex */
public final class a {
    public static b b(g gVar, int i10, int i11, int i12) {
        qg.b a10 = gVar.a();
        if (a10 == null) {
            throw new IllegalStateException();
        }
        int e10 = a10.e();
        int d10 = a10.d();
        int i13 = i12 * 2;
        int i14 = e10 + i13;
        int i15 = i13 + d10;
        int max = Math.max(i10, i14);
        int max2 = Math.max(i11, i15);
        int min = Math.min(max / i14, max2 / i15);
        int i16 = (max - (e10 * min)) / 2;
        int i17 = (max2 - (d10 * min)) / 2;
        b bVar = new b(max, max2);
        int i18 = 0;
        while (i18 < d10) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < e10) {
                if (a10.b(i19, i18) == 1) {
                    bVar.e(i20, i17, min, min);
                }
                i19++;
                i20 += min;
            }
            i18++;
            i17 += min;
        }
        return bVar;
    }

    public b a(String str, lg.a aVar, int i10, int i11, Map<lg.b, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != lg.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        pg.a aVar2 = pg.a.L;
        int i12 = 4;
        if (map != null) {
            lg.b bVar = lg.b.ERROR_CORRECTION;
            if (map.containsKey(bVar)) {
                aVar2 = pg.a.valueOf(map.get(bVar).toString());
            }
            lg.b bVar2 = lg.b.MARGIN;
            if (map.containsKey(bVar2)) {
                i12 = Integer.parseInt(map.get(bVar2).toString());
            }
        }
        return b(c.n(str, aVar2, map), i10, i11, i12);
    }
}
