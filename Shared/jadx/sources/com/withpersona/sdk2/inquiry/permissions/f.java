package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.permissions.d;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dt.i;

/* loaded from: classes3.dex */
public final class f implements dt.d<PermissionRequestWorkflow> {

    /* renamed from: a, reason: collision with root package name */
    public final i<Context> f12377a;
    public final i<d.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final i<DeviceFeatureRequestWorkflow> f12378c;

    /* renamed from: d, reason: collision with root package name */
    public final i<TrackingEventsLogger> f12379d;

    public f(i<Context> iVar, i<d.a> iVar2, i<DeviceFeatureRequestWorkflow> iVar3, i<TrackingEventsLogger> iVar4) {
        this.f12377a = iVar;
        this.b = iVar2;
        this.f12378c = iVar3;
        this.f12379d = iVar4;
    }

    public static f a(i<Context> iVar, i<d.a> iVar2, i<DeviceFeatureRequestWorkflow> iVar3, i<TrackingEventsLogger> iVar4) {
        return new f(iVar, iVar2, iVar3, iVar4);
    }

    public static PermissionRequestWorkflow c(Context context, d.a aVar, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, TrackingEventsLogger trackingEventsLogger) {
        return new PermissionRequestWorkflow(context, aVar, deviceFeatureRequestWorkflow, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PermissionRequestWorkflow get() {
        return c(this.f12377a.get(), this.b.get(), this.f12378c.get(), this.f12379d.get());
    }
}
