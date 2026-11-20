package wn;

import android.content.Context;

/* loaded from: classes3.dex */
public final class u implements dt.d<t> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34467a;
    public final dt.i<m> b;

    public u(dt.i<Context> iVar, dt.i<m> iVar2) {
        this.f34467a = iVar;
        this.b = iVar2;
    }

    public static u a(dt.i<Context> iVar, dt.i<m> iVar2) {
        return new u(iVar, iVar2);
    }

    public static t c(Context context, m mVar) {
        return new t(context, mVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f34467a.get(), this.b.get());
    }
}
