package ln;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public class q implements pn.c {

    /* renamed from: a, reason: collision with root package name */
    public final List<qn.b> f23611a;
    public final List<sn.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final List<qn.e> f23612c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<Character> f23613d;

    /* renamed from: e, reason: collision with root package name */
    public final f f23614e;

    public q(List<qn.b> list, List<sn.a> list2, List<qn.e> list3, Set<Character> set, f fVar) {
        this.f23611a = list;
        this.b = list2;
        this.f23612c = list3;
        this.f23613d = set;
        this.f23614e = fVar;
    }

    @Override // pn.c
    public <D> D a(Class<D> cls, String str) {
        return (D) this.f23614e.b(cls, str);
    }

    @Override // pn.c
    public List<qn.e> b() {
        return this.f23612c;
    }

    @Override // pn.c
    public List<sn.a> c() {
        return this.b;
    }

    @Override // pn.c
    public Set<Character> d() {
        return this.f23613d;
    }

    @Override // pn.c
    public List<qn.b> e() {
        return this.f23611a;
    }
}
