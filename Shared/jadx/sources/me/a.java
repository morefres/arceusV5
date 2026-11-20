package me;

import androidx.core.view.inputmethod.EditorInfoCompat;
import he.n;

/* loaded from: classes2.dex */
public final class a extends b {
    public static int a(int i10, int i11, int i12) {
        n.g(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j10 < -2147483648L ? EditorInfoCompat.IME_FLAG_FORCE_ASCII : (int) j10;
    }
}
