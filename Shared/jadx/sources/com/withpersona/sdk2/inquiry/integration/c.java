package com.withpersona.sdk2.inquiry.integration;

import android.content.Context;
import com.withpersona.sdk2.inquiry.integration.a;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.d;
import dt.i;

/* loaded from: classes3.dex */
public final class c implements d<IntegrationWorkflow> {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f11202a;
    public final i<sq.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<a.InterfaceC0209a> f11203c;

    /* renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f11204d;

    public c(i<Context> iVar, i<sq.a> iVar2, i<a.InterfaceC0209a> iVar3, i<TrackingEventsLogger> iVar4) {
        this.f11202a = iVar;
        this.b = iVar2;
        this.f11203c = iVar3;
        this.f11204d = iVar4;
    }

    public static c a(i<Context> iVar, i<sq.a> iVar2, i<a.InterfaceC0209a> iVar3, i<TrackingEventsLogger> iVar4) {
        return new c(iVar, iVar2, iVar3, iVar4);
    }

    public static IntegrationWorkflow c(Context context, sq.a aVar, a.InterfaceC0209a interfaceC0209a, TrackingEventsLogger trackingEventsLogger) {
        return new IntegrationWorkflow(context, aVar, interfaceC0209a, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public IntegrationWorkflow get() {
        return c(this.f11202a.get(), this.b.get(), this.f11203c.get(), this.f11204d.get());
    }
}
