package wn;

import android.content.Context;

/* loaded from: classes3.dex */
public final class q implements dt.d<p> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34463a;

    public q(dt.i<Context> iVar) {
        this.f34463a = iVar;
    }

    public static q a(dt.i<Context> iVar) {
        return new q(iVar);
    }

    public static p c(Context context) {
        return new p(context);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f34463a.get());
    }
}
