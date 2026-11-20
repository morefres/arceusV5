package kp;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class p implements dt.d<g.c<Uri>> {

    /* renamed from: a, reason: collision with root package name */
    public final i f23134a;

    public p(i iVar) {
        this.f23134a = iVar;
    }

    public static p a(i iVar) {
        return new p(iVar);
    }

    public static g.c<Uri> c(i iVar) {
        return (g.c) dt.h.e(iVar.c());
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<Uri> get() {
        return c(this.f23134a);
    }
}
