package m7;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class p<V, O> implements o<V, O> {

    /* renamed from: a, reason: collision with root package name */
    public final List<t7.a<V>> f24398a;

    public p(List<t7.a<V>> list) {
        this.f24398a = list;
    }

    @Override // m7.o
    public List<t7.a<V>> b() {
        return this.f24398a;
    }

    @Override // m7.o
    public boolean c() {
        return this.f24398a.isEmpty() || (this.f24398a.size() == 1 && this.f24398a.get(0).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f24398a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f24398a.toArray()));
        }
        return sb2.toString();
    }
}
