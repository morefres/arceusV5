package eb;

import java.util.List;

/* loaded from: classes.dex */
public final class d1 extends e1 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f15776c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f15778e;

    public d1(e1 e1Var, int i10, int i11) {
        this.f15778e = e1Var;
        this.f15776c = i10;
        this.f15777d = i11;
    }

    @Override // eb.z0
    public final int b() {
        return this.f15778e.c() + this.f15776c + this.f15777d;
    }

    @Override // eb.z0
    public final int c() {
        return this.f15778e.c() + this.f15776c;
    }

    @Override // eb.z0
    public final Object[] e() {
        return this.f15778e.e();
    }

    @Override // eb.e1
    /* renamed from: g */
    public final e1 subList(int i10, int i11) {
        n0.e(i10, i11, this.f15777d);
        int i12 = this.f15776c;
        return this.f15778e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        n0.a(i10, this.f15777d, "index");
        return this.f15778e.get(i10 + this.f15776c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15777d;
    }

    @Override // eb.e1, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
