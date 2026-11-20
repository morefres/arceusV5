package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import com.withpersona.sdk2.inquiry.nfc.b;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.d;
import com.withpersona.sdk2.inquiry.ui.k;
import jp.n;

/* loaded from: classes3.dex */
public final class j implements dt.d<UiWorkflow> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f13948a;
    public final dt.i<b.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<n.a> f13949c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<up.c> f13950d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<d.a> f13951e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<k.a> f13952f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<sq.a> f13953g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<PermissionRequestWorkflow> f13954h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<a> f13955i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<nq.c> f13956j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<eo.e> f13957k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f13958l;

    public j(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<n.a> iVar3, dt.i<up.c> iVar4, dt.i<d.a> iVar5, dt.i<k.a> iVar6, dt.i<sq.a> iVar7, dt.i<PermissionRequestWorkflow> iVar8, dt.i<a> iVar9, dt.i<nq.c> iVar10, dt.i<eo.e> iVar11, dt.i<TrackingEventsLogger> iVar12) {
        this.f13948a = iVar;
        this.b = iVar2;
        this.f13949c = iVar3;
        this.f13950d = iVar4;
        this.f13951e = iVar5;
        this.f13952f = iVar6;
        this.f13953g = iVar7;
        this.f13954h = iVar8;
        this.f13955i = iVar9;
        this.f13956j = iVar10;
        this.f13957k = iVar11;
        this.f13958l = iVar12;
    }

    public static j a(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<n.a> iVar3, dt.i<up.c> iVar4, dt.i<d.a> iVar5, dt.i<k.a> iVar6, dt.i<sq.a> iVar7, dt.i<PermissionRequestWorkflow> iVar8, dt.i<a> iVar9, dt.i<nq.c> iVar10, dt.i<eo.e> iVar11, dt.i<TrackingEventsLogger> iVar12) {
        return new j(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12);
    }

    public static UiWorkflow c(Context context, b.a aVar, n.a aVar2, up.c cVar, d.a aVar3, k.a aVar4, sq.a aVar5, PermissionRequestWorkflow permissionRequestWorkflow, a aVar6, nq.c cVar2, eo.e eVar, TrackingEventsLogger trackingEventsLogger) {
        return new UiWorkflow(context, aVar, aVar2, cVar, aVar3, aVar4, aVar5, permissionRequestWorkflow, aVar6, cVar2, eVar, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public UiWorkflow get() {
        return c(this.f13948a.get(), this.b.get(), this.f13949c.get(), this.f13950d.get(), this.f13951e.get(), this.f13952f.get(), this.f13953g.get(), this.f13954h.get(), this.f13955i.get(), this.f13956j.get(), this.f13957k.get(), this.f13958l.get());
    }
}
