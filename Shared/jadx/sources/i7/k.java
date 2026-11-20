package i7;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes3.dex */
public class k extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f20227i;

    public k(List<t7.a<PointF>> list) {
        super(list);
        this.f20227i = new PointF();
    }

    @Override // i7.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(t7.a<PointF> aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    @Override // i7.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF j(t7.a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.b;
        if (pointF3 == null || (pointF = aVar.f32052c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        t7.c<A> cVar = this.f20200e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.b(aVar.f32056g, aVar.f32057h.floatValue(), pointF4, pointF5, f10, e(), f())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.f20227i;
        float f13 = pointF4.x;
        float f14 = f13 + (f11 * (pointF5.x - f13));
        float f15 = pointF4.y;
        pointF6.set(f14, f15 + (f12 * (pointF5.y - f15)));
        return this.f20227i;
    }
}
