package jn;

import android.content.Context;
import dt.d;
import dt.i;

/* loaded from: classes3.dex */
public final class c implements d<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f21873a;

    public c(i<Context> iVar) {
        this.f21873a = iVar;
    }

    public static c a(i<Context> iVar) {
        return new c(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f21873a.get());
    }
}
