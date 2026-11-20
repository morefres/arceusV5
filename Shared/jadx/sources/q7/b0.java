package q7;

import android.graphics.PointF;
import r7.c;

/* loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f29555a = new b0();

    @Override // q7.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(r7.c cVar, float f10) {
        c.b o8 = cVar.o();
        if (o8 != c.b.BEGIN_ARRAY && o8 != c.b.BEGIN_OBJECT) {
            if (o8 == c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.h()) * f10, ((float) cVar.h()) * f10);
                while (cVar.f()) {
                    cVar.u();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + o8);
        }
        return s.e(cVar, f10);
    }
}
