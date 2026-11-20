package xo;

import android.content.Context;

/* loaded from: classes3.dex */
public final class q implements dt.d<k6.s> {

    /* renamed from: a, reason: collision with root package name */
    public final n f35905a;
    public final dt.i<Context> b;

    public q(n nVar, dt.i<Context> iVar) {
        this.f35905a = nVar;
        this.b = iVar;
    }

    public static q a(n nVar, dt.i<Context> iVar) {
        return new q(nVar, iVar);
    }

    public static k6.s c(n nVar, Context context) {
        return (k6.s) dt.h.e(nVar.c(context));
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k6.s get() {
        return c(this.f35905a, this.b.get());
    }
}
