package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import com.withpersona.sdk2.inquiry.document.i;

/* loaded from: classes3.dex */
public final class j implements dt.d<i.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<g.c<String[]>> f10282a;
    public final dt.i<g.c<g.h>> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<Context> f10283c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<oq.c> f10284d;

    public j(dt.i<g.c<String[]>> iVar, dt.i<g.c<g.h>> iVar2, dt.i<Context> iVar3, dt.i<oq.c> iVar4) {
        this.f10282a = iVar;
        this.b = iVar2;
        this.f10283c = iVar3;
        this.f10284d = iVar4;
    }

    public static j a(dt.i<g.c<String[]>> iVar, dt.i<g.c<g.h>> iVar2, dt.i<Context> iVar3, dt.i<oq.c> iVar4) {
        return new j(iVar, iVar2, iVar3, iVar4);
    }

    public static i.b c(g.c<String[]> cVar, g.c<g.h> cVar2, Context context, oq.c cVar3) {
        return new i.b(cVar, cVar2, context, cVar3);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i.b get() {
        return c(this.f10282a.get(), this.b.get(), this.f10283c.get(), this.f10284d.get());
    }
}
