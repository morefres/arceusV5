package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.document.network.g;
import dt.i;

/* loaded from: classes3.dex */
public final class h implements dt.d<g.a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10420a;
    public final i<co.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<kq.a> f10421c;

    public h(i<zn.c> iVar, i<co.a> iVar2, i<kq.a> iVar3) {
        this.f10420a = iVar;
        this.b = iVar2;
        this.f10421c = iVar3;
    }

    public static h a(i<zn.c> iVar, i<co.a> iVar2, i<kq.a> iVar3) {
        return new h(iVar, iVar2, iVar3);
    }

    public static g.a c(zn.c cVar, co.a aVar, kq.a aVar2) {
        return new g.a(cVar, aVar, aVar2);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.a get() {
        return c(this.f10420a.get(), this.b.get(), this.f10421c.get());
    }
}
