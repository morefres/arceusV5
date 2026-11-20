package g0;

import android.graphics.PointF;
import android.util.Rational;

/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public Rational f17995a;

    public v1() {
        this(null);
    }

    public static float d() {
        return 0.15f;
    }

    public abstract PointF a(float f10, float f11);

    public final u1 b(float f10, float f11) {
        return c(f10, f11, d());
    }

    public final u1 c(float f10, float f11, float f12) {
        PointF a10 = a(f10, f11);
        return new u1(a10.x, a10.y, f12, this.f17995a);
    }

    public void e(Rational rational) {
        this.f17995a = rational;
    }

    public v1(Rational rational) {
        this.f17995a = rational;
    }
}
