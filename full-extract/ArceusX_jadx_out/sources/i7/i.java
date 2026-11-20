package i7;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public class i extends t7.a<PointF> {

    /* renamed from: q, reason: collision with root package name */
    public Path f20220q;

    /* renamed from: r, reason: collision with root package name */
    public final t7.a<PointF> f20221r;

    public i(f7.i iVar, t7.a<PointF> aVar) {
        super(iVar, aVar.b, aVar.f32052c, aVar.f32053d, aVar.f32054e, aVar.f32055f, aVar.f32056g, aVar.f32057h);
        this.f20221r = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t8;
        T t10;
        T t11 = this.f32052c;
        boolean z10 = (t11 == 0 || (t10 = this.b) == 0 || !((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) ? false : true;
        T t12 = this.b;
        if (t12 == 0 || (t8 = this.f32052c) == 0 || z10) {
            return;
        }
        t7.a<PointF> aVar = this.f20221r;
        this.f20220q = s7.m.d((PointF) t12, (PointF) t8, aVar.f32064o, aVar.f32065p);
    }

    public Path k() {
        return this.f20220q;
    }
}
