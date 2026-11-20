package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import com.withpersona.sdk2.inquiry.document.i;
import com.withpersona.sdk2.inquiry.document.network.a;
import com.withpersona.sdk2.inquiry.document.network.c;
import com.withpersona.sdk2.inquiry.document.network.e;
import com.withpersona.sdk2.inquiry.document.network.g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import k6.s;
import zn.a;

/* loaded from: classes3.dex */
public final class h implements dt.d<DocumentWorkflow> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<s> f10250a;
    public final dt.i<Context> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<PermissionRequestWorkflow> f10251c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<a> f10252d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<i.b> f10253e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<a.C0184a> f10254f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<e.a> f10255g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<c.a> f10256h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<a.C0697a> f10257i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<g.a> f10258j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<sq.a> f10259k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<nq.c> f10260l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f10261m;

    public h(dt.i<s> iVar, dt.i<Context> iVar2, dt.i<PermissionRequestWorkflow> iVar3, dt.i<a> iVar4, dt.i<i.b> iVar5, dt.i<a.C0184a> iVar6, dt.i<e.a> iVar7, dt.i<c.a> iVar8, dt.i<a.C0697a> iVar9, dt.i<g.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13) {
        this.f10250a = iVar;
        this.b = iVar2;
        this.f10251c = iVar3;
        this.f10252d = iVar4;
        this.f10253e = iVar5;
        this.f10254f = iVar6;
        this.f10255g = iVar7;
        this.f10256h = iVar8;
        this.f10257i = iVar9;
        this.f10258j = iVar10;
        this.f10259k = iVar11;
        this.f10260l = iVar12;
        this.f10261m = iVar13;
    }

    public static h a(dt.i<s> iVar, dt.i<Context> iVar2, dt.i<PermissionRequestWorkflow> iVar3, dt.i<a> iVar4, dt.i<i.b> iVar5, dt.i<a.C0184a> iVar6, dt.i<e.a> iVar7, dt.i<c.a> iVar8, dt.i<a.C0697a> iVar9, dt.i<g.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13) {
        return new h(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13);
    }

    public static DocumentWorkflow c(s sVar, Context context, PermissionRequestWorkflow permissionRequestWorkflow, a aVar, i.b bVar, a.C0184a c0184a, e.a aVar2, c.a aVar3, a.C0697a c0697a, g.a aVar4, sq.a aVar5, nq.c cVar, TrackingEventsLogger trackingEventsLogger) {
        return new DocumentWorkflow(sVar, context, permissionRequestWorkflow, aVar, bVar, c0184a, aVar2, aVar3, c0697a, aVar4, aVar5, cVar, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentWorkflow get() {
        return c(this.f10250a.get(), this.b.get(), this.f10251c.get(), this.f10252d.get(), this.f10253e.get(), this.f10254f.get(), this.f10255g.get(), this.f10256h.get(), this.f10257i.get(), this.f10258j.get(), this.f10259k.get(), this.f10260l.get(), this.f10261m.get());
    }
}
