package fb;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m1 extends n1 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f17116c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f17117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f17118e;

    public m1(n1 n1Var, int i10, int i11) {
        Objects.requireNonNull(n1Var);
        this.f17118e = n1Var;
        this.f17116c = i10;
        this.f17117d = i11;
    }

    @Override // fb.i1
    public final Object[] a() {
        return this.f17118e.a();
    }

    @Override // fb.i1
    public final int b() {
        return this.f17118e.b() + this.f17116c;
    }

    @Override // fb.i1
    public final int c() {
        return this.f17118e.b() + this.f17116c + this.f17117d;
    }

    @Override // fb.n1
    /* renamed from: e */
    public final n1 subList(int i10, int i11) {
        z0.c(i10, i11, this.f17117d);
        int i12 = this.f17116c;
        return this.f17118e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        z0.a(i10, this.f17117d, "index");
        return this.f17118e.get(i10 + this.f17116c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17117d;
    }

    @Override // fb.n1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
