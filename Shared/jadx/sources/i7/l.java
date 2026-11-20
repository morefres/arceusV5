package i7;

import java.util.List;

/* loaded from: classes3.dex */
public class l extends g<t7.d> {

    /* renamed from: i, reason: collision with root package name */
    public final t7.d f20228i;

    public l(List<t7.a<t7.d>> list) {
        super(list);
        this.f20228i = new t7.d();
    }

    @Override // i7.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public t7.d i(t7.a<t7.d> aVar, float f10) {
        t7.d dVar;
        float f11;
        t7.d dVar2 = aVar.b;
        if (dVar2 == null || (dVar = aVar.f32052c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        t7.d dVar3 = dVar2;
        t7.d dVar4 = dVar;
        t7.c<A> cVar = this.f20200e;
        if (cVar != 0) {
            f11 = f10;
            t7.d dVar5 = (t7.d) cVar.b(aVar.f32056g, aVar.f32057h.floatValue(), dVar3, dVar4, f11, e(), f());
            if (dVar5 != null) {
                return dVar5;
            }
        } else {
            f11 = f10;
        }
        this.f20228i.d(s7.j.i(dVar3.b(), dVar4.b(), f11), s7.j.i(dVar3.c(), dVar4.c(), f11));
        return this.f20228i;
    }
}
