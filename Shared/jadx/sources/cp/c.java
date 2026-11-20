package cp;

import android.content.Context;
import dt.i;
import ju.l0;
import lp.e;

/* loaded from: classes3.dex */
public final class c implements dt.d<a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f14145a;
    public final i<e.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<f> f14146c;

    /* renamed from: d, reason: collision with root package name */
    public final i<l0> f14147d;

    public c(i<Context> iVar, i<e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        this.f14145a = iVar;
        this.b = iVar2;
        this.f14146c = iVar3;
        this.f14147d = iVar4;
    }

    public static c a(i<Context> iVar, i<e.a> iVar2, i<f> iVar3, i<l0> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static a c(Context context, e.a aVar, f fVar, l0 l0Var) {
        return new a(context, aVar, fVar, l0Var);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f14145a.get(), this.b.get(), this.f14146c.get(), this.f14147d.get());
    }
}
