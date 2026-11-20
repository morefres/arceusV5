package i7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes3.dex */
public class j extends g<PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f20222i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f20223j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f20224k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f20225l;

    /* renamed from: m, reason: collision with root package name */
    public i f20226m;

    public j(List<? extends t7.a<PointF>> list) {
        super(list);
        this.f20222i = new PointF();
        this.f20223j = new float[2];
        this.f20224k = new float[2];
        this.f20225l = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i7.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(t7.a<PointF> aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path k10 = iVar.k();
        t7.c<A> cVar = this.f20200e;
        if (cVar == 0 || aVar.f32057h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.b(iVar.f32056g, iVar.f32057h.floatValue(), (PointF) iVar.b, (PointF) iVar.f32052c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (k10 == null) {
            return aVar.b;
        }
        if (this.f20226m != iVar) {
            this.f20225l.setPath(k10, false);
            this.f20226m = iVar;
        }
        float length = this.f20225l.getLength();
        float f12 = f11 * length;
        this.f20225l.getPosTan(f12, this.f20223j, this.f20224k);
        PointF pointF2 = this.f20222i;
        float[] fArr = this.f20223j;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f20222i;
            float[] fArr2 = this.f20224k;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f20222i;
            float[] fArr3 = this.f20224k;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f20222i;
    }
}
