package ee;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class b extends u0 {
    public final /* synthetic */ IBinder b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15976c;

    public b(e eVar, IBinder iBinder) {
        this.b = iBinder;
        this.f15976c = eVar;
    }

    @Override // ee.u0
    public final void b() {
        a1 a1Var;
        List list;
        List list2;
        a1Var = this.f15976c.f15977a.f15986i;
        this.f15976c.f15977a.f15991n = (IInterface) a1Var.a(this.b);
        f.r(this.f15976c.f15977a);
        this.f15976c.f15977a.f15984g = false;
        list = this.f15976c.f15977a.f15981d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f15976c.f15977a.f15981d;
        list2.clear();
    }
}
