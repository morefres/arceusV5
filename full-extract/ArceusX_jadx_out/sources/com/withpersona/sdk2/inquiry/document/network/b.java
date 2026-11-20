package com.withpersona.sdk2.inquiry.document.network;

import com.withpersona.sdk2.inquiry.document.network.a;
import dt.i;

/* loaded from: classes3.dex */
public final class b implements dt.d<a.C0184a> {

    /* renamed from: a, reason: collision with root package name */
    public final i<zn.c> f10333a;

    public b(i<zn.c> iVar) {
        this.f10333a = iVar;
    }

    public static b a(i<zn.c> iVar) {
        return new b(iVar);
    }

    public static a.C0184a c(zn.c cVar) {
        return new a.C0184a(cVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0184a get() {
        return c(this.f10333a.get());
    }
}
