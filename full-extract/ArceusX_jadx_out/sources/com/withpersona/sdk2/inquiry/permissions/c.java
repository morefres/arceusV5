package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.a;
import dt.i;

/* loaded from: classes3.dex */
public final class c implements dt.d<DeviceFeatureRequestWorkflow> {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f12362a;
    public final i<a.InterfaceC0230a> b;

    public c(i<Context> iVar, i<a.InterfaceC0230a> iVar2) {
        this.f12362a = iVar;
        this.b = iVar2;
    }

    public static c a(i<Context> iVar, i<a.InterfaceC0230a> iVar2) {
        return new c(iVar, iVar2);
    }

    public static DeviceFeatureRequestWorkflow c(Context context, a.InterfaceC0230a interfaceC0230a) {
        return new DeviceFeatureRequestWorkflow(context, interfaceC0230a);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DeviceFeatureRequestWorkflow get() {
        return c(this.f12362a.get(), this.b.get());
    }
}
