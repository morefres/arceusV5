package wn;

import android.content.Context;

/* loaded from: classes3.dex */
public final class c0 implements dt.d<b0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34444a;

    public c0(dt.i<Context> iVar) {
        this.f34444a = iVar;
    }

    public static c0 a(dt.i<Context> iVar) {
        return new c0(iVar);
    }

    public static b0 c(Context context) {
        return new b0(context);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f34444a.get());
    }
}
