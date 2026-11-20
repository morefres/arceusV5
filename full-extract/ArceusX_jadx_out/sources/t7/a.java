package t7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import f7.i;

/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final i f32051a;
    public final T b;

    /* renamed from: c, reason: collision with root package name */
    public T f32052c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f32053d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f32054e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f32055f;

    /* renamed from: g, reason: collision with root package name */
    public final float f32056g;

    /* renamed from: h, reason: collision with root package name */
    public Float f32057h;

    /* renamed from: i, reason: collision with root package name */
    public float f32058i;

    /* renamed from: j, reason: collision with root package name */
    public float f32059j;

    /* renamed from: k, reason: collision with root package name */
    public int f32060k;

    /* renamed from: l, reason: collision with root package name */
    public int f32061l;

    /* renamed from: m, reason: collision with root package name */
    public float f32062m;

    /* renamed from: n, reason: collision with root package name */
    public float f32063n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f32064o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f32065p;

    public a(i iVar, T t8, T t10, Interpolator interpolator, float f10, Float f11) {
        this.f32058i = -3987645.8f;
        this.f32059j = -3987645.8f;
        this.f32060k = 784923401;
        this.f32061l = 784923401;
        this.f32062m = Float.MIN_VALUE;
        this.f32063n = Float.MIN_VALUE;
        this.f32064o = null;
        this.f32065p = null;
        this.f32051a = iVar;
        this.b = t8;
        this.f32052c = t10;
        this.f32053d = interpolator;
        this.f32054e = null;
        this.f32055f = null;
        this.f32056g = f10;
        this.f32057h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t8, T t10) {
        return new a<>(t8, t10);
    }

    public float c() {
        if (this.f32051a == null) {
            return 1.0f;
        }
        if (this.f32063n == Float.MIN_VALUE) {
            if (this.f32057h == null) {
                this.f32063n = 1.0f;
            } else {
                this.f32063n = (float) (f() + ((this.f32057h.floatValue() - this.f32056g) / this.f32051a.e()));
            }
        }
        return this.f32063n;
    }

    public float d() {
        if (this.f32059j == -3987645.8f) {
            this.f32059j = ((Float) this.f32052c).floatValue();
        }
        return this.f32059j;
    }

    public int e() {
        if (this.f32061l == 784923401) {
            this.f32061l = ((Integer) this.f32052c).intValue();
        }
        return this.f32061l;
    }

    public float f() {
        i iVar = this.f32051a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f32062m == Float.MIN_VALUE) {
            this.f32062m = (this.f32056g - iVar.p()) / this.f32051a.e();
        }
        return this.f32062m;
    }

    public float g() {
        if (this.f32058i == -3987645.8f) {
            this.f32058i = ((Float) this.b).floatValue();
        }
        return this.f32058i;
    }

    public int h() {
        if (this.f32060k == 784923401) {
            this.f32060k = ((Integer) this.b).intValue();
        }
        return this.f32060k;
    }

    public boolean i() {
        return this.f32053d == null && this.f32054e == null && this.f32055f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.f32052c + ", startFrame=" + this.f32056g + ", endFrame=" + this.f32057h + ", interpolator=" + this.f32053d + '}';
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f32058i = -3987645.8f;
        this.f32059j = -3987645.8f;
        this.f32060k = 784923401;
        this.f32061l = 784923401;
        this.f32062m = Float.MIN_VALUE;
        this.f32063n = Float.MIN_VALUE;
        this.f32064o = null;
        this.f32065p = null;
        this.f32051a = iVar;
        this.b = t8;
        this.f32052c = t10;
        this.f32053d = null;
        this.f32054e = interpolator;
        this.f32055f = interpolator2;
        this.f32056g = f10;
        this.f32057h = f11;
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f32058i = -3987645.8f;
        this.f32059j = -3987645.8f;
        this.f32060k = 784923401;
        this.f32061l = 784923401;
        this.f32062m = Float.MIN_VALUE;
        this.f32063n = Float.MIN_VALUE;
        this.f32064o = null;
        this.f32065p = null;
        this.f32051a = iVar;
        this.b = t8;
        this.f32052c = t10;
        this.f32053d = interpolator;
        this.f32054e = interpolator2;
        this.f32055f = interpolator3;
        this.f32056g = f10;
        this.f32057h = f11;
    }

    public a(T t8) {
        this.f32058i = -3987645.8f;
        this.f32059j = -3987645.8f;
        this.f32060k = 784923401;
        this.f32061l = 784923401;
        this.f32062m = Float.MIN_VALUE;
        this.f32063n = Float.MIN_VALUE;
        this.f32064o = null;
        this.f32065p = null;
        this.f32051a = null;
        this.b = t8;
        this.f32052c = t8;
        this.f32053d = null;
        this.f32054e = null;
        this.f32055f = null;
        this.f32056g = Float.MIN_VALUE;
        this.f32057h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(T t8, T t10) {
        this.f32058i = -3987645.8f;
        this.f32059j = -3987645.8f;
        this.f32060k = 784923401;
        this.f32061l = 784923401;
        this.f32062m = Float.MIN_VALUE;
        this.f32063n = Float.MIN_VALUE;
        this.f32064o = null;
        this.f32065p = null;
        this.f32051a = null;
        this.b = t8;
        this.f32052c = t10;
        this.f32053d = null;
        this.f32054e = null;
        this.f32055f = null;
        this.f32056g = Float.MIN_VALUE;
        this.f32057h = Float.valueOf(Float.MAX_VALUE);
    }
}
