package ee;

import java.util.List;

/* loaded from: classes2.dex */
public final class r extends s {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f15997c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f15998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f15999e;

    public r(s sVar, int i10, int i11) {
        this.f15999e = sVar;
        this.f15997c = i10;
        this.f15998d = i11;
    }

    @Override // ee.p
    public final int b() {
        return this.f15999e.c() + this.f15997c + this.f15998d;
    }

    @Override // ee.p
    public final int c() {
        return this.f15999e.c() + this.f15997c;
    }

    @Override // ee.p
    public final Object[] d() {
        return this.f15999e.d();
    }

    @Override // ee.s
    /* renamed from: e */
    public final s subList(int i10, int i11) {
        m.c(i10, i11, this.f15998d);
        int i12 = this.f15997c;
        return this.f15999e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        m.a(i10, this.f15998d, "index");
        return this.f15999e.get(i10 + this.f15997c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15998d;
    }

    @Override // ee.s, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
