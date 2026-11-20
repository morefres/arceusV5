package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.ui.h;
import com.withpersona.sdk2.inquiry.ui.network.b;
import or.a;
import xq.a;

/* loaded from: classes3.dex */
public final class c implements dt.d<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f13879a;
    public final dt.i<b.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<a.C0492a> f13880c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<a.C0662a> f13881d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<h.a> f13882e;

    public c(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<a.C0492a> iVar3, dt.i<a.C0662a> iVar4, dt.i<h.a> iVar5) {
        this.f13879a = iVar;
        this.b = iVar2;
        this.f13880c = iVar3;
        this.f13881d = iVar4;
        this.f13882e = iVar5;
    }

    public static c a(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<a.C0492a> iVar3, dt.i<a.C0662a> iVar4, dt.i<h.a> iVar5) {
        return new c(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static a c(Context context, b.a aVar, a.C0492a c0492a, a.C0662a c0662a, h.a aVar2) {
        return new a(context, aVar, c0492a, c0662a, aVar2);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f13879a.get(), this.b.get(), this.f13880c.get(), this.f13881d.get(), this.f13882e.get());
    }
}
