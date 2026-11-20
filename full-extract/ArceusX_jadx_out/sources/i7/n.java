package i7;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f20234i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f20235j;

    /* renamed from: k, reason: collision with root package name */
    public final a<Float, Float> f20236k;

    /* renamed from: l, reason: collision with root package name */
    public final a<Float, Float> f20237l;

    /* renamed from: m, reason: collision with root package name */
    public t7.c<Float> f20238m;

    /* renamed from: n, reason: collision with root package name */
    public t7.c<Float> f20239n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f20234i = new PointF();
        this.f20235j = new PointF();
        this.f20236k = aVar;
        this.f20237l = aVar2;
        n(f());
    }

    @Override // i7.a
    public void n(float f10) {
        this.f20236k.n(f10);
        this.f20237l.n(f10);
        this.f20234i.set(this.f20236k.h().floatValue(), this.f20237l.h().floatValue());
        for (int i10 = 0; i10 < this.f20197a.size(); i10++) {
            this.f20197a.get(i10).a();
        }
    }

    @Override // i7.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // i7.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(t7.a<PointF> aVar, float f10) {
        Float f11;
        t7.a<Float> b;
        t7.a<Float> b10;
        Float f12 = null;
        if (this.f20238m == null || (b10 = this.f20236k.b()) == null) {
            f11 = null;
        } else {
            Float f13 = b10.f32057h;
            t7.c<Float> cVar = this.f20238m;
            float f14 = b10.f32056g;
            f11 = cVar.b(f14, f13 == null ? f14 : f13.floatValue(), b10.b, b10.f32052c, this.f20236k.d(), this.f20236k.e(), this.f20236k.f());
        }
        if (this.f20239n != null && (b = this.f20237l.b()) != null) {
            Float f15 = b.f32057h;
            t7.c<Float> cVar2 = this.f20239n;
            float f16 = b.f32056g;
            f12 = cVar2.b(f16, f15 == null ? f16 : f15.floatValue(), b.b, b.f32052c, this.f20237l.d(), this.f20237l.e(), this.f20237l.f());
        }
        if (f11 == null) {
            this.f20235j.set(this.f20234i.x, 0.0f);
        } else {
            this.f20235j.set(f11.floatValue(), 0.0f);
        }
        if (f12 == null) {
            PointF pointF = this.f20235j;
            pointF.set(pointF.x, this.f20234i.y);
        } else {
            PointF pointF2 = this.f20235j;
            pointF2.set(pointF2.x, f12.floatValue());
        }
        return this.f20235j;
    }

    public void t(t7.c<Float> cVar) {
        t7.c<Float> cVar2 = this.f20238m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20238m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(t7.c<Float> cVar) {
        t7.c<Float> cVar2 = this.f20239n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20239n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
