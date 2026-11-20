package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.internal.a;
import com.withpersona.sdk2.inquiry.network.dto.InquirySessionDataWrapper;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b implements a.InterfaceC0217a {

    /* renamed from: a, reason: collision with root package name */
    public final xo.c f11501a;

    public b(xo.c cVar) {
        this.f11501a = cVar;
    }

    public static dt.i<a.InterfaceC0217a> b(xo.c cVar) {
        return dt.e.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.a.InterfaceC0217a
    public a a(String str, @Nullable InquirySessionDataWrapper inquirySessionDataWrapper) {
        return this.f11501a.b(str, inquirySessionDataWrapper);
    }
}
