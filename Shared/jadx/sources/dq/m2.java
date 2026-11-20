package dq;

import android.content.Context;
import aq.b;
import bq.a;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.e;
import fn.c;
import rr.b;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f15323a;
    public final dt.i<b.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<b.a> f15324c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<e.b> f15325d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<e.a> f15326e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<e.a> f15327f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<c.a> f15328g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<jn.a> f15329h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<sq.a> f15330i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<DirectFileUploader> f15331j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<ju.p0> f15332k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<a.b> f15333l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.selfie.g> f15334m;

    /* renamed from: n, reason: collision with root package name */
    public final dt.i<eo.e> f15335n;

    /* renamed from: o, reason: collision with root package name */
    public final dt.i<oq.c> f15336o;

    public m2(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<b.a> iVar3, dt.i<e.b> iVar4, dt.i<e.a> iVar5, dt.i<e.a> iVar6, dt.i<c.a> iVar7, dt.i<jn.a> iVar8, dt.i<sq.a> iVar9, dt.i<DirectFileUploader> iVar10, dt.i<ju.p0> iVar11, dt.i<a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.selfie.g> iVar13, dt.i<eo.e> iVar14, dt.i<oq.c> iVar15) {
        this.f15323a = iVar;
        this.b = iVar2;
        this.f15324c = iVar3;
        this.f15325d = iVar4;
        this.f15326e = iVar5;
        this.f15327f = iVar6;
        this.f15328g = iVar7;
        this.f15329h = iVar8;
        this.f15330i = iVar9;
        this.f15331j = iVar10;
        this.f15332k = iVar11;
        this.f15333l = iVar12;
        this.f15334m = iVar13;
        this.f15335n = iVar14;
        this.f15336o = iVar15;
    }

    public static m2 a(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<b.a> iVar3, dt.i<e.b> iVar4, dt.i<e.a> iVar5, dt.i<e.a> iVar6, dt.i<c.a> iVar7, dt.i<jn.a> iVar8, dt.i<sq.a> iVar9, dt.i<DirectFileUploader> iVar10, dt.i<ju.p0> iVar11, dt.i<a.b> iVar12, dt.i<com.withpersona.sdk2.inquiry.selfie.g> iVar13, dt.i<eo.e> iVar14, dt.i<oq.c> iVar15) {
        return new m2(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15);
    }

    public static k2 c(SelfieWorkflow.Input input, android.view.l0 l0Var, Context context, b.a aVar, b.a aVar2, e.b bVar, e.a aVar3, e.a aVar4, c.a aVar5, jn.a aVar6, sq.a aVar7, DirectFileUploader directFileUploader, ju.p0 p0Var, a.b bVar2, com.withpersona.sdk2.inquiry.selfie.g gVar, eo.e eVar, oq.c cVar) {
        return new k2(input, l0Var, context, aVar, aVar2, bVar, aVar3, aVar4, aVar5, aVar6, aVar7, directFileUploader, p0Var, bVar2, gVar, eVar, cVar);
    }

    public k2 b(SelfieWorkflow.Input input, android.view.l0 l0Var) {
        return c(input, l0Var, this.f15323a.get(), this.b.get(), this.f15324c.get(), this.f15325d.get(), this.f15326e.get(), this.f15327f.get(), this.f15328g.get(), this.f15329h.get(), this.f15330i.get(), this.f15331j.get(), this.f15332k.get(), this.f15333l.get(), this.f15334m.get(), this.f15335n.get(), this.f15336o.get());
    }
}
