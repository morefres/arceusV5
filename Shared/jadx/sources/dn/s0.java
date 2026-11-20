package dn;

/* loaded from: classes3.dex */
public final class s0 implements dt.d<r0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<eo.e> f15162a;

    public s0(dt.i<eo.e> iVar) {
        this.f15162a = iVar;
    }

    public static s0 a(dt.i<eo.e> iVar) {
        return new s0(iVar);
    }

    public static r0 c(eo.e eVar) {
        return new r0(eVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 get() {
        return c(this.f15162a.get());
    }
}
