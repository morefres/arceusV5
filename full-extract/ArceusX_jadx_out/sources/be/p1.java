package be;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f3996a = new HashSet();

    public final synchronized void a(vd.a aVar) {
        this.f3996a.add(aVar);
    }

    public final synchronized void b(vd.a aVar) {
        this.f3996a.remove(aVar);
    }

    public final synchronized void c(Object obj) {
        Iterator it = this.f3996a.iterator();
        while (it.hasNext()) {
            ((vd.a) it.next()).a(obj);
        }
    }
}
