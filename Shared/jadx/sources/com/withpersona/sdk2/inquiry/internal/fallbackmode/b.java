package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.f;

/* loaded from: classes3.dex */
public final class b implements dt.d<bp.a> {

    /* renamed from: a, reason: collision with root package name */
    public final a f11800a;
    public final dt.i<d> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<f.a> f11801c;

    public b(a aVar, dt.i<d> iVar, dt.i<f.a> iVar2) {
        this.f11800a = aVar;
        this.b = iVar;
        this.f11801c = iVar2;
    }

    public static bp.a a(a aVar, d dVar, f.a aVar2) {
        return (bp.a) dt.h.e(aVar.a(dVar, aVar2));
    }

    public static b b(a aVar, dt.i<d> iVar, dt.i<f.a> iVar2) {
        return new b(aVar, iVar, iVar2);
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bp.a get() {
        return a(this.f11800a, this.b.get(), this.f11801c.get());
    }
}
