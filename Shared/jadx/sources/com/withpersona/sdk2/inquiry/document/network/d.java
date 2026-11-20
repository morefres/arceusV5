package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.document.network.c;
import dt.i;
import hq.k;

/* loaded from: classes3.dex */
public final class d implements dt.d<c.a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10384a;
    public final i<k> b;

    public d(i<zn.c> iVar, i<k> iVar2) {
        this.f10384a = iVar;
        this.b = iVar2;
    }

    public static d a(i<zn.c> iVar, i<k> iVar2) {
        return new d(iVar, iVar2);
    }

    public static c.a c(zn.c cVar, k kVar) {
        return new c.a(cVar, kVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.a get() {
        return c(this.f10384a.get(), this.b.get());
    }
}
