package w0;

import android.util.Size;
import n0.i2;
import n0.i4;

/* loaded from: classes.dex */
public final class e {
    public static void a(i4.b<?, ?, ?> bVar, int i10) {
        Size V;
        i2 i2Var = (i2) bVar.e();
        int J = i2Var.J(-1);
        if (J == -1 || J != i10) {
            ((i2.a) bVar).c(i10);
        }
        if (J == -1 || i10 == -1 || J == i10) {
            return;
        }
        if (Math.abs(p0.c.b(i10) - p0.c.b(J)) % 180 != 90 || (V = i2Var.V(null)) == null) {
            return;
        }
        ((i2.a) bVar).d(new Size(V.getHeight(), V.getWidth()));
    }
}
