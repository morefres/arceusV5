package wn;

import android.content.Context;

/* loaded from: classes3.dex */
public final class s implements dt.d<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34465a;

    public s(dt.i<Context> iVar) {
        this.f34465a = iVar;
    }

    public static s a(dt.i<Context> iVar) {
        return new s(iVar);
    }

    public static r c(Context context) {
        return new r(context);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f34465a.get());
    }
}
