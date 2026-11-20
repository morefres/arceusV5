package g0;

import android.view.Display;

/* loaded from: classes.dex */
public final class j0 extends v1 {
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17912c;

    /* renamed from: d, reason: collision with root package name */
    public final Display f17913d;

    /* renamed from: e, reason: collision with root package name */
    public final t f17914e;

    public j0(Display display, t tVar, float f10, float f11) {
        this.b = f10;
        this.f17912c = f11;
        this.f17913d = display;
        this.f17914e = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // g0.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.PointF a(float r8, float r9) {
        /*
            r7 = this;
            float r0 = r7.b
            float r1 = r7.f17912c
            g0.t r2 = r7.f17914e
            int r2 = r2.i()
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            int r3 = r7.f(r2)
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            if (r3 == r5) goto L22
            if (r3 != r4) goto L1c
            goto L22
        L1c:
            r6 = r9
            r9 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r6
        L22:
            if (r3 == r5) goto L30
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 == r5) goto L2e
            if (r3 == r4) goto L2b
            goto L32
        L2b:
            float r9 = r1 - r9
            goto L32
        L2e:
            float r9 = r1 - r9
        L30:
            float r8 = r0 - r8
        L32:
            if (r2 == 0) goto L36
            float r9 = r1 - r9
        L36:
            float r9 = r9 / r1
            float r8 = r8 / r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r9, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.j0.a(float, float):android.graphics.PointF");
    }

    public final int f(boolean z10) {
        try {
            int w5 = this.f17914e.w(this.f17913d.getRotation());
            return z10 ? (360 - w5) % 360 : w5;
        } catch (Exception unused) {
            return 0;
        }
    }
}
