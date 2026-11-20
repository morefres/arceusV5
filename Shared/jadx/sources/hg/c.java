package hg;

import java.util.Iterator;
import java.util.Set;
import mf.r;

/* loaded from: classes2.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f19411a;
    public final d b;

    public c(Set<f> set, d dVar) {
        this.f19411a = d(set);
        this.b = dVar;
    }

    public static /* synthetic */ i b(mf.d dVar) {
        return new c(dVar.d(f.class), d.a());
    }

    public static mf.c<i> c() {
        return mf.c.c(i.class).b(r.m(f.class)).f(new mf.g() { // from class: hg.b
            @Override // mf.g
            public final Object create(mf.d dVar) {
                return c.b(dVar);
            }
        }).d();
    }

    public static String d(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // hg.i
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.f19411a;
        }
        return this.f19411a + ' ' + d(this.b.b());
    }
}
