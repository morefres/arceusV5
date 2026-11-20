package ib;

import android.os.IBinder;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import qd.a;

/* loaded from: classes.dex */
public final class k extends e {
    public final /* synthetic */ IBinder b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f20367c;

    public k(m mVar, IBinder iBinder) {
        this.b = iBinder;
        Objects.requireNonNull(mVar);
        this.f20367c = mVar;
    }

    @Override // ib.e
    public final void b() {
        List list;
        List list2;
        qd.a s22 = a.AbstractBinderC0517a.s2(this.b);
        o oVar = this.f20367c.f20368a;
        oVar.f20381m = s22;
        o.r(oVar);
        oVar.f20375g = false;
        list = oVar.f20372d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = oVar.f20372d;
        list2.clear();
    }
}
