package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.document.network.e;
import dt.i;

/* loaded from: classes3.dex */
public final class f implements dt.d<e.a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10399a;

    public f(i<zn.c> iVar) {
        this.f10399a = iVar;
    }

    public static f a(i<zn.c> iVar) {
        return new f(iVar);
    }

    public static e.a c(zn.c cVar) {
        return new e.a(cVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.a get() {
        return c(this.f10399a.get());
    }
}
