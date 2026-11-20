package xn;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class b implements dt.d<com.withpersona.sdk2.inquiry.document.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<Uri>> f35682a;
    public final dt.i<Context> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<oq.c> f35683c;

    public b(dt.i<g.c<Uri>> iVar, dt.i<Context> iVar2, dt.i<oq.c> iVar3) {
        this.f35682a = iVar;
        this.b = iVar2;
        this.f35683c = iVar3;
    }

    public static b a(dt.i<g.c<Uri>> iVar, dt.i<Context> iVar2, dt.i<oq.c> iVar3) {
        return new b(iVar, iVar2, iVar3);
    }

    public static com.withpersona.sdk2.inquiry.document.a c(g.c<Uri> cVar, Context context, oq.c cVar2) {
        return new com.withpersona.sdk2.inquiry.document.a(cVar, context, cVar2);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.document.a get() {
        return c(this.f35682a.get(), this.b.get(), this.f35683c.get());
    }
}
