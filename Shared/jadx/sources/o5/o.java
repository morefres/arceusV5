package o5;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class o extends p0 {
    public float b = 3.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f27668c = 80;

    @Override // o5.z
    public long c(@NonNull ViewGroup viewGroup, @NonNull q qVar, d0 d0Var, d0 d0Var2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup viewGroup2;
        int i14;
        d0 d0Var3 = d0Var;
        if (d0Var3 == null && d0Var2 == null) {
            return 0L;
        }
        Rect A = qVar.A();
        if (d0Var2 == null || e(d0Var3) == 0) {
            i10 = -1;
        } else {
            d0Var3 = d0Var2;
            i10 = 1;
        }
        int f10 = f(d0Var3);
        int g10 = g(d0Var3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + round;
        int height = viewGroup.getHeight() + round2;
        if (A != null) {
            int centerX = A.centerX();
            i13 = g10;
            viewGroup2 = viewGroup;
            i14 = round2;
            i12 = A.centerY();
            i11 = centerX;
        } else {
            i11 = (round + width) / 2;
            i12 = (round2 + height) / 2;
            i13 = g10;
            viewGroup2 = viewGroup;
            i14 = round2;
        }
        float h10 = h(viewGroup2, f10, i13, i11, i12, round, i14, width, height) / i(viewGroup);
        long z10 = qVar.z();
        if (z10 < 0) {
            z10 = 300;
        }
        return Math.round(((z10 * i10) / this.b) * h10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0012, code lost:
    
        r0 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001d, code lost:
    
        if (r6.getLayoutDirection() == 1) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r6.getLayoutDirection() == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        r0 = 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
        /*
            r5 = this;
            int r0 = r5.f27668c
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 1
            r3 = 3
            r4 = 5
            if (r0 != r1) goto L14
            int r6 = r6.getLayoutDirection()
            if (r6 != r2) goto L12
        L10:
            r0 = r4
            goto L20
        L12:
            r0 = r3
            goto L20
        L14:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L20
            int r6 = r6.getLayoutDirection()
            if (r6 != r2) goto L10
            goto L12
        L20:
            if (r0 == r3) goto L46
            if (r0 == r4) goto L3e
            r6 = 48
            if (r0 == r6) goto L36
            r6 = 80
            if (r0 == r6) goto L2e
            r6 = 0
            return r6
        L2e:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r8 = r8 + r6
            return r8
        L36:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r14 = r14 + r6
            return r14
        L3e:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r7 = r7 + r6
            return r7
        L46:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r13 = r13 + r6
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.o.h(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    public final int i(ViewGroup viewGroup) {
        int i10 = this.f27668c;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    public void j(int i10) {
        this.f27668c = i10;
    }
}
