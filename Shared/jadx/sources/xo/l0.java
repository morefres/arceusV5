package xo;

import android.content.Context;
import xq.a;

/* loaded from: classes3.dex */
public final class l0 implements dt.d<k0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f35895a;
    public final dt.i<a.C0662a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<ep.w> f35896c;

    public l0(dt.i<Context> iVar, dt.i<a.C0662a> iVar2, dt.i<ep.w> iVar3) {
        this.f35895a = iVar;
        this.b = iVar2;
        this.f35896c = iVar3;
    }

    public static l0 a(dt.i<Context> iVar, dt.i<a.C0662a> iVar2, dt.i<ep.w> iVar3) {
        return new l0(iVar, iVar2, iVar3);
    }

    public static k0 c(Context context, a.C0662a c0662a, ep.w wVar) {
        return new k0(context, c0662a, wVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k0 get() {
        return c(this.f35895a.get(), this.b.get(), this.f35896c.get());
    }
}
