package q7;

import android.graphics.Color;
import r7.c;

/* loaded from: classes3.dex */
public class g implements n0<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f29563a = new g();

    @Override // q7.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(r7.c cVar, float f10) {
        boolean z10 = cVar.o() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        double h10 = cVar.h();
        double h11 = cVar.h();
        double h12 = cVar.h();
        double h13 = cVar.o() == c.b.NUMBER ? cVar.h() : 1.0d;
        if (z10) {
            cVar.d();
        }
        if (h10 <= 1.0d && h11 <= 1.0d && h12 <= 1.0d) {
            h10 *= 255.0d;
            h11 *= 255.0d;
            h12 *= 255.0d;
            if (h13 <= 1.0d) {
                h13 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) h13, (int) h10, (int) h11, (int) h12));
    }
}
