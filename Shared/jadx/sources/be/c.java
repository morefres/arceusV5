package be;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c extends r1 {
    public final /* synthetic */ IBinder b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f3955c;

    public c(f fVar, IBinder iBinder) {
        this.f3955c = fVar;
        this.b = iBinder;
    }

    @Override // be.r1
    public final void c() {
        List list;
        List list2;
        this.f3955c.f3957a.f3972m = j0.s2(this.b);
        g.q(this.f3955c.f3957a);
        this.f3955c.f3957a.f3966g = false;
        list = this.f3955c.f3957a.f3963d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f3955c.f3957a.f3963d;
        list2.clear();
    }
}
