package q7;

import r7.c;

/* loaded from: classes3.dex */
public class g0 implements n0<t7.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f29564a = new g0();

    @Override // q7.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t7.d a(r7.c cVar, float f10) {
        boolean z10 = cVar.o() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        float h10 = (float) cVar.h();
        float h11 = (float) cVar.h();
        while (cVar.f()) {
            cVar.u();
        }
        if (z10) {
            cVar.d();
        }
        return new t7.d((h10 / 100.0f) * f10, (h11 / 100.0f) * f10);
    }
}
