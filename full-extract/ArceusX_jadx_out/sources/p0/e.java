package p0;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class e implements Comparator<Size> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28198a;

    public e() {
        this(false);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Size size, Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f28198a ? signum * (-1) : signum;
    }

    public e(boolean z10) {
        this.f28198a = z10;
    }
}
