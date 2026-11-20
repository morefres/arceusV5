package lp;

import android.content.Context;
import dt.i;

/* loaded from: classes3.dex */
public final class d implements dt.d<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f23815a;

    public d(i<Context> iVar) {
        this.f23815a = iVar;
    }

    public static d a(i<Context> iVar) {
        return new d(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f23815a.get());
    }
}
