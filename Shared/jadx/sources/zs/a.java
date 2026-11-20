package zs;

import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public abstract class a {
    public static int a(int i10, int i11) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }
}
