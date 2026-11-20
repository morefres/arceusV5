package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.i;
import sm.w;

/* loaded from: classes3.dex */
public final class e implements dt.d<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<FallbackModeService> f11851a;
    public final dt.i<w> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<i.a> f11852c;

    public e(dt.i<FallbackModeService> iVar, dt.i<w> iVar2, dt.i<i.a> iVar3) {
        this.f11851a = iVar;
        this.b = iVar2;
        this.f11852c = iVar3;
    }

    public static e a(dt.i<FallbackModeService> iVar, dt.i<w> iVar2, dt.i<i.a> iVar3) {
        return new e(iVar, iVar2, iVar3);
    }

    public static d c(FallbackModeService fallbackModeService, w wVar, i.a aVar) {
        return new d(fallbackModeService, wVar, aVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f11851a.get(), this.b.get(), this.f11852c.get());
    }
}
