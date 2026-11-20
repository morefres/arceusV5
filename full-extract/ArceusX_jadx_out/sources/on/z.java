package on;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public List<y> f28013a;

    public static z c() {
        return new z();
    }

    public void a(List<y> list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.f28013a == null) {
            this.f28013a = new ArrayList();
        }
        if (this.f28013a.isEmpty()) {
            this.f28013a.addAll(list);
            return;
        }
        int size = this.f28013a.size() - 1;
        y yVar = this.f28013a.get(size);
        y yVar2 = list.get(0);
        if (yVar.b() + yVar.c() != yVar2.b()) {
            this.f28013a.addAll(list);
        } else {
            this.f28013a.set(size, y.e(yVar.d(), yVar.a(), yVar.b(), yVar.c() + yVar2.c()));
            this.f28013a.addAll(list.subList(1, list.size()));
        }
    }

    public void b(Iterable<? extends s> iterable) {
        Iterator<? extends s> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next().h());
        }
    }

    public List<y> d() {
        List<y> list = this.f28013a;
        return list != null ? list : Collections.EMPTY_LIST;
    }
}
