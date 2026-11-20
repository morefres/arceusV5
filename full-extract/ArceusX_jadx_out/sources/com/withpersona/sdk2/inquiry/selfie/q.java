package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import aq.b;
import bq.a;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.e;
import fn.c;
import rr.b;

/* loaded from: classes3.dex */
public final class q implements dt.d<SelfieWorkflow> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f13072a;
    public final dt.i<b.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<b.a> f13073c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<e.b> f13074d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<PermissionRequestWorkflow> f13075e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<fq.j> f13076f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<e.a> f13077g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<c.a> f13078h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<jn.a> f13079i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<sq.a> f13080j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<DirectFileUploader> f13081k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<a.b> f13082l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f13083m;

    /* renamed from: n, reason: collision with root package name */
    public final dt.i<g> f13084n;

    /* renamed from: o, reason: collision with root package name */
    public final dt.i<oq.c> f13085o;

    /* renamed from: p, reason: collision with root package name */
    public final dt.i<eo.e> f13086p;

    public q(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<b.a> iVar3, dt.i<e.b> iVar4, dt.i<PermissionRequestWorkflow> iVar5, dt.i<fq.j> iVar6, dt.i<e.a> iVar7, dt.i<c.a> iVar8, dt.i<jn.a> iVar9, dt.i<sq.a> iVar10, dt.i<DirectFileUploader> iVar11, dt.i<a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar13, dt.i<g> iVar14, dt.i<oq.c> iVar15, dt.i<eo.e> iVar16) {
        this.f13072a = iVar;
        this.b = iVar2;
        this.f13073c = iVar3;
        this.f13074d = iVar4;
        this.f13075e = iVar5;
        this.f13076f = iVar6;
        this.f13077g = iVar7;
        this.f13078h = iVar8;
        this.f13079i = iVar9;
        this.f13080j = iVar10;
        this.f13081k = iVar11;
        this.f13082l = iVar12;
        this.f13083m = iVar13;
        this.f13084n = iVar14;
        this.f13085o = iVar15;
        this.f13086p = iVar16;
    }

    public static q a(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<b.a> iVar3, dt.i<e.b> iVar4, dt.i<PermissionRequestWorkflow> iVar5, dt.i<fq.j> iVar6, dt.i<e.a> iVar7, dt.i<c.a> iVar8, dt.i<jn.a> iVar9, dt.i<sq.a> iVar10, dt.i<DirectFileUploader> iVar11, dt.i<a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar13, dt.i<g> iVar14, dt.i<oq.c> iVar15, dt.i<eo.e> iVar16) {
        return new q(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16);
    }

    public static SelfieWorkflow c(Context context, b.a aVar, b.a aVar2, e.b bVar, PermissionRequestWorkflow permissionRequestWorkflow, fq.j jVar, e.a aVar3, c.a aVar4, jn.a aVar5, sq.a aVar6, DirectFileUploader directFileUploader, a.b bVar2, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar7, g gVar, oq.c cVar, eo.e eVar) {
        return new SelfieWorkflow(context, aVar, aVar2, bVar, permissionRequestWorkflow, jVar, aVar3, aVar4, aVar5, aVar6, directFileUploader, bVar2, aVar7, gVar, cVar, eVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SelfieWorkflow get() {
        return c(this.f13072a.get(), this.b.get(), this.f13073c.get(), this.f13074d.get(), this.f13075e.get(), this.f13076f.get(), this.f13077g.get(), this.f13078h.get(), this.f13079i.get(), this.f13080j.get(), this.f13081k.get(), this.f13082l.get(), this.f13083m.get(), this.f13084n.get(), this.f13085o.get(), this.f13086p.get());
    }
}
