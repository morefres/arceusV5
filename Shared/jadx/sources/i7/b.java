package i7;

import java.util.List;

/* loaded from: classes3.dex */
public class b extends g<Integer> {
    public b(List<t7.a<Integer>> list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    public int s(t7.a<Integer> aVar, float f10) {
        float f11;
        Float f12;
        if (aVar.b == null || aVar.f32052c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        t7.c<A> cVar = this.f20200e;
        if (cVar == 0 || (f12 = aVar.f32057h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f32056g, f12.floatValue(), aVar.b, aVar.f32052c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return s7.c.c(s7.j.b(f11, 0.0f, 1.0f), aVar.b.intValue(), aVar.f32052c.intValue());
    }

    @Override // i7.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(t7.a<Integer> aVar, float f10) {
        return Integer.valueOf(s(aVar, f10));
    }
}
