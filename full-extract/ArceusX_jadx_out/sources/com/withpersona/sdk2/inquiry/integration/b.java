package com.withpersona.sdk2.inquiry.integration;

import com.withpersona.sdk2.inquiry.integration.a;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import dt.e;
import dt.i;
import vo.BrowserSelection;

/* loaded from: classes3.dex */
public final class b implements a.InterfaceC0209a {

    /* renamed from: a, reason: collision with root package name */
    public final vo.c f11201a;

    public b(vo.c cVar) {
        this.f11201a = cVar;
    }

    public static i<a.InterfaceC0209a> b(vo.c cVar) {
        return e.a(new b(cVar));
    }

    @Override // com.withpersona.sdk2.inquiry.integration.a.InterfaceC0209a
    public a a(String str, String str2, BrowserSelection browserSelection, NextStep.Integration.IntegrationStepBrowserType integrationStepBrowserType) {
        return this.f11201a.b(str, str2, browserSelection, integrationStepBrowserType);
    }
}
