package z;

import android.content.Context;
import n0.j4;
import n0.l1;
import n0.o3;

/* loaded from: classes.dex */
public final class t2 implements n0.j4 {
    public final q3 b;

    public t2(Context context) {
        this.b = q3.c(context);
    }

    @Override // n0.j4
    public n0.n1 a(j4.b bVar, int i10) {
        n0.x2 k02 = n0.x2.k0();
        o3.b bVar2 = new o3.b();
        bVar2.B(t5.b(bVar, i10));
        k02.G(n0.i4.f25400w, bVar2.p());
        k02.G(n0.i4.f25402y, s2.f37422a);
        l1.a aVar = new l1.a();
        aVar.v(t5.a(bVar, i10));
        k02.G(n0.i4.f25401x, aVar.h());
        k02.G(n0.i4.f25403z, bVar == j4.b.IMAGE_CAPTURE ? n4.f37332c : b1.f37056a);
        if (bVar == j4.b.PREVIEW) {
            k02.G(n0.i2.f25393s, this.b.f());
        }
        k02.G(n0.i2.f25388n, Integer.valueOf(this.b.d(true).getRotation()));
        if (bVar == j4.b.VIDEO_CAPTURE || bVar == j4.b.STREAM_SHARING) {
            k02.G(n0.i4.E, Boolean.TRUE);
        }
        return n0.c3.j0(k02);
    }
}
