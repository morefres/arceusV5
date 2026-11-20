package eb;

import java.util.AbstractMap;

/* loaded from: classes.dex */
public final class j1 extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1 f15803c;

    public j1(k1 k1Var) {
        this.f15803c = k1Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        v1 v1Var;
        e1 e1Var;
        v1Var = this.f15803c.f15806c.f15811c;
        Object obj = v1Var.f15936e.get(i10);
        e1Var = this.f15803c.f15806c.f15812d;
        return new AbstractMap.SimpleImmutableEntry(obj, e1Var.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15803c.f15806c.size();
    }
}
