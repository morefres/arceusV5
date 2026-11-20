package oo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import no.c;
import po.j1;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28029a;
    public final dt.i<k6.s> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<c.a> f28030c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f28031d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<po.v0> f28032e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<j1> f28033f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<po.m0> f28034g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<AutoClassifyWorker.b> f28035h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<po.i> f28036i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<jn.a> f28037j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<sq.a> f28038k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<nq.c> f28039l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28040m;

    /* renamed from: n, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f28041n;

    /* renamed from: o, reason: collision with root package name */
    public final dt.i<ju.p0> f28042o;

    public d1(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<po.v0> iVar5, dt.i<j1> iVar6, dt.i<po.m0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<po.i> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14, dt.i<ju.p0> iVar15) {
        this.f28029a = iVar;
        this.b = iVar2;
        this.f28030c = iVar3;
        this.f28031d = iVar4;
        this.f28032e = iVar5;
        this.f28033f = iVar6;
        this.f28034g = iVar7;
        this.f28035h = iVar8;
        this.f28036i = iVar9;
        this.f28037j = iVar10;
        this.f28038k = iVar11;
        this.f28039l = iVar12;
        this.f28040m = iVar13;
        this.f28041n = iVar14;
        this.f28042o = iVar15;
    }

    public static d1 a(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<po.v0> iVar5, dt.i<j1> iVar6, dt.i<po.m0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<po.i> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14, dt.i<ju.p0> iVar15) {
        return new d1(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15);
    }

    public static com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b c(GovernmentIdWorkflow.Input input, android.view.l0 l0Var, Context context, k6.s sVar, c.a aVar, com.withpersona.sdk2.inquiry.governmentid.e eVar, po.v0 v0Var, j1 j1Var, po.m0 m0Var, AutoClassifyWorker.b bVar, po.i iVar, jn.a aVar2, sq.a aVar3, nq.c cVar, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar4, ju.p0 p0Var) {
        return new com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b(input, l0Var, context, sVar, aVar, eVar, v0Var, j1Var, m0Var, bVar, iVar, aVar2, aVar3, cVar, trackingEventsLogger, aVar4, p0Var);
    }

    public com.withpersona.sdk2.inquiry.governmentid.persona_workflow.b b(GovernmentIdWorkflow.Input input, android.view.l0 l0Var) {
        return c(input, l0Var, this.f28029a.get(), this.b.get(), this.f28030c.get(), this.f28031d.get(), this.f28032e.get(), this.f28033f.get(), this.f28034g.get(), this.f28035h.get(), this.f28036i.get(), this.f28037j.get(), this.f28038k.get(), this.f28039l.get(), this.f28040m.get(), this.f28041n.get(), this.f28042o.get());
    }
}
