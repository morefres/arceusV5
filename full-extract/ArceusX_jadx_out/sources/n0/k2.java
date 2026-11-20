package n0;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class k2 extends u1 {

    /* renamed from: o, reason: collision with root package name */
    public final Surface f25423o;

    public k2(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f25423o = surface;
    }

    @Override // n0.u1
    public ne.x<Surface> o() {
        return r0.n.p(this.f25423o);
    }

    public k2(Surface surface) {
        this.f25423o = surface;
    }
}
