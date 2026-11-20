package wn;

import android.content.Context;

/* loaded from: classes3.dex */
public final class a0 implements dt.d<z> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34439a;

    public a0(dt.i<Context> iVar) {
        this.f34439a = iVar;
    }

    public static a0 a(dt.i<Context> iVar) {
        return new a0(iVar);
    }

    public static z c(Context context) {
        return new z(context);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f34439a.get());
    }
}
