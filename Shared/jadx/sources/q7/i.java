package q7;

import android.graphics.PointF;
import l7.b;
import r7.c;

/* loaded from: classes3.dex */
public class i implements n0<l7.b> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f29567a = new i();
    public static final c.a b = c.a.a(zl.t.f38095d, "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // q7.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l7.b a(r7.c cVar, float f10) {
        b.a aVar = b.a.CENTER;
        cVar.c();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = true;
        while (cVar.f()) {
            switch (cVar.r(b)) {
                case 0:
                    str = cVar.m();
                    break;
                case 1:
                    str2 = cVar.m();
                    break;
                case 2:
                    f11 = (float) cVar.h();
                    break;
                case 3:
                    int j10 = cVar.j();
                    aVar2 = b.a.CENTER;
                    if (j10 <= aVar2.ordinal() && j10 >= 0) {
                        aVar2 = b.a.values()[j10];
                        break;
                    }
                    break;
                case 4:
                    i10 = cVar.j();
                    break;
                case 5:
                    f12 = (float) cVar.h();
                    break;
                case 6:
                    f13 = (float) cVar.h();
                    break;
                case 7:
                    i11 = s.d(cVar);
                    break;
                case 8:
                    i12 = s.d(cVar);
                    break;
                case 9:
                    f14 = (float) cVar.h();
                    break;
                case 10:
                    z10 = cVar.g();
                    break;
                case 11:
                    cVar.b();
                    PointF pointF3 = new PointF(((float) cVar.h()) * f10, ((float) cVar.h()) * f10);
                    cVar.d();
                    pointF = pointF3;
                    break;
                case 12:
                    cVar.b();
                    PointF pointF4 = new PointF(((float) cVar.h()) * f10, ((float) cVar.h()) * f10);
                    cVar.d();
                    pointF2 = pointF4;
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        cVar.e();
        return new l7.b(str, str2, f11, aVar2, i10, f12, f13, i11, i12, f14, z10, pointF, pointF2);
    }
}
