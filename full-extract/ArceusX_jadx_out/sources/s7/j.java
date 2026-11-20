package s7;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import n7.o;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f30931a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean d(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static int e(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int f(float f10, float f11) {
        return g((int) f10, (int) f11);
    }

    public static int g(int i10, int i11) {
        return i10 - (i11 * e(i10, i11));
    }

    public static void h(o oVar, Path path) {
        Path path2;
        path.reset();
        PointF b = oVar.b();
        path.moveTo(b.x, b.y);
        f30931a.set(b.x, b.y);
        int i10 = 0;
        while (i10 < oVar.a().size()) {
            l7.a aVar = oVar.a().get(i10);
            PointF a10 = aVar.a();
            PointF b10 = aVar.b();
            PointF c10 = aVar.c();
            PointF pointF = f30931a;
            if (a10.equals(pointF) && b10.equals(c10)) {
                path.lineTo(c10.x, c10.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(a10.x, a10.y, b10.x, b10.y, c10.x, c10.y);
            }
            pointF.set(c10.x, c10.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (oVar.d()) {
            path3.close();
        }
    }

    public static float i(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static int j(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    public static void k(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2, h7.k kVar) {
        if (eVar.c(kVar.getName(), i10)) {
            list.add(eVar2.a(kVar.getName()).i(kVar));
        }
    }
}
