package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.c;
import ep.InquiryAttributes;

/* loaded from: classes3.dex */
public final class d implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final xo.d f11507a;

    public d(xo.d dVar) {
        this.f11507a = dVar;
    }

    public static dt.i<c.a> b(xo.d dVar) {
        return dt.e.a(new d(dVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.c.a
    public c a(InquiryAttributes inquiryAttributes) {
        return this.f11507a.b(inquiryAttributes);
    }
}
