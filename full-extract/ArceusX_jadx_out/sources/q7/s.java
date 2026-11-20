package q7;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import r7.c;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final c.a f29591a = c.a.a("x", "y");

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29592a;

        static {
            int[] iArr = new int[c.b.values().length];
            f29592a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29592a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29592a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(r7.c cVar, float f10) {
        cVar.b();
        float h10 = (float) cVar.h();
        float h11 = (float) cVar.h();
        while (cVar.o() != c.b.END_ARRAY) {
            cVar.u();
        }
        cVar.d();
        return new PointF(h10 * f10, h11 * f10);
    }

    public static PointF b(r7.c cVar, float f10) {
        float h10 = (float) cVar.h();
        float h11 = (float) cVar.h();
        while (cVar.f()) {
            cVar.u();
        }
        return new PointF(h10 * f10, h11 * f10);
    }

    public static PointF c(r7.c cVar, float f10) {
        cVar.c();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.f()) {
            int r8 = cVar.r(f29591a);
            if (r8 == 0) {
                f11 = g(cVar);
            } else if (r8 != 1) {
                cVar.s();
                cVar.u();
            } else {
                f12 = g(cVar);
            }
        }
        cVar.e();
        return new PointF(f11 * f10, f12 * f10);
    }

    public static int d(r7.c cVar) {
        cVar.b();
        int h10 = (int) (cVar.h() * 255.0d);
        int h11 = (int) (cVar.h() * 255.0d);
        int h12 = (int) (cVar.h() * 255.0d);
        while (cVar.f()) {
            cVar.u();
        }
        cVar.d();
        return Color.argb(255, h10, h11, h12);
    }

    public static PointF e(r7.c cVar, float f10) {
        int i10 = a.f29592a[cVar.o().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.o());
    }

    public static List<PointF> f(r7.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f10));
            cVar.d();
        }
        cVar.d();
        return arrayList;
    }

    public static float g(r7.c cVar) {
        c.b o8 = cVar.o();
        int i10 = a.f29592a[o8.ordinal()];
        if (i10 == 1) {
            return (float) cVar.h();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + o8);
        }
        cVar.b();
        float h10 = (float) cVar.h();
        while (cVar.f()) {
            cVar.u();
        }
        cVar.d();
        return h10;
    }
}
