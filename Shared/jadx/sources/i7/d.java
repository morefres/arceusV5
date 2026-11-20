package i7;

import java.util.List;

/* loaded from: classes3.dex */
public class d extends g<Float> {
    public d(List<t7.a<Float>> list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

    public float s(t7.a<Float> aVar, float f10) {
        float f11;
        if (aVar.b == null || aVar.f32052c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        t7.c<A> cVar = this.f20200e;
        if (cVar != 0) {
            f11 = f10;
            Float f12 = (Float) cVar.b(aVar.f32056g, aVar.f32057h.floatValue(), aVar.b, aVar.f32052c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return s7.j.i(aVar.g(), aVar.d(), f11);
    }

    @Override // i7.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(t7.a<Float> aVar, float f10) {
        return Float.valueOf(s(aVar, f10));
    }
}
