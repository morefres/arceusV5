package xd;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class p extends j {
    public final /* synthetic */ IBinder b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f35507c;

    public p(r rVar, IBinder iBinder) {
        this.b = iBinder;
        this.f35507c = rVar;
    }

    @Override // xd.j
    public final void a() {
        List list;
        List list2;
        this.f35507c.f35508a.f35521m = e.s2(this.b);
        t.q(this.f35507c.f35508a);
        this.f35507c.f35508a.f35515g = false;
        list = this.f35507c.f35508a.f35512d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f35507c.f35508a.f35512d;
        list2.clear();
    }
}
