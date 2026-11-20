package i7;

import java.util.List;

/* loaded from: classes3.dex */
public class f extends g<Integer> {
    public f(List<t7.a<Integer>> list) {
        super(list);
    }

    public int r(t7.a<Integer> aVar, float f10) {
        float f11;
        if (aVar.b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int h10 = aVar.f32052c == null ? aVar.h() : aVar.e();
        t7.c<A> cVar = this.f20200e;
        if (cVar != 0) {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f32056g, aVar.f32057h.floatValue(), aVar.b, Integer.valueOf(h10), f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return s7.j.j(aVar.h(), h10, f11);
    }

    @Override // i7.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(t7.a<Integer> aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
