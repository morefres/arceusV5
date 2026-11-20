package fp;

import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.a;
import com.withpersona.sdk2.inquiry.internal.c;
import com.withpersona.sdk2.inquiry.internal.f;
import com.withpersona.sdk2.inquiry.internal.k;
import com.withpersona.sdk2.inquiry.internal.m;
import com.withpersona.sdk2.inquiry.internal.o;
import com.withpersona.sdk2.inquiry.internal.r;
import com.withpersona.sdk2.inquiry.internal.v;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import fo.b;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<c.a> f17584a;
    public final dt.i<a.InterfaceC0217a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<k.b> f17585c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<r.a> f17586d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<TransitionWorker.a> f17587e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<v.a> f17588f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<f.a> f17589g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<m.a> f17590h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<GovernmentIdWorkflow> f17591i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<SelfieWorkflow> f17592j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<UiWorkflow> f17593k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<DocumentWorkflow> f17594l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<IntegrationWorkflow> f17595m;

    /* renamed from: n, reason: collision with root package name */
    public final dt.i<nq.e> f17596n;

    /* renamed from: o, reason: collision with root package name */
    public final dt.i<sq.a> f17597o;

    /* renamed from: p, reason: collision with root package name */
    public final dt.i<nq.c> f17598p;

    /* renamed from: q, reason: collision with root package name */
    public final dt.i<UiStepSavedStateHelper> f17599q;

    /* renamed from: r, reason: collision with root package name */
    public final dt.i<o.a> f17600r;

    /* renamed from: s, reason: collision with root package name */
    public final dt.i<b.a> f17601s;

    /* renamed from: t, reason: collision with root package name */
    public final dt.i<eo.e> f17602t;

    /* renamed from: u, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f17603u;

    /* renamed from: v, reason: collision with root package name */
    public final dt.i<TrackingMetadataProvider> f17604v;

    /* renamed from: w, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.q> f17605w;

    /* renamed from: x, reason: collision with root package name */
    public final dt.i<xo.f> f17606x;

    /* renamed from: y, reason: collision with root package name */
    public final dt.i<ju.p0> f17607y;

    public f0(dt.i<c.a> iVar, dt.i<a.InterfaceC0217a> iVar2, dt.i<k.b> iVar3, dt.i<r.a> iVar4, dt.i<TransitionWorker.a> iVar5, dt.i<v.a> iVar6, dt.i<f.a> iVar7, dt.i<m.a> iVar8, dt.i<GovernmentIdWorkflow> iVar9, dt.i<SelfieWorkflow> iVar10, dt.i<UiWorkflow> iVar11, dt.i<DocumentWorkflow> iVar12, dt.i<IntegrationWorkflow> iVar13, dt.i<nq.e> iVar14, dt.i<sq.a> iVar15, dt.i<nq.c> iVar16, dt.i<UiStepSavedStateHelper> iVar17, dt.i<o.a> iVar18, dt.i<b.a> iVar19, dt.i<eo.e> iVar20, dt.i<TrackingEventsLogger> iVar21, dt.i<TrackingMetadataProvider> iVar22, dt.i<com.withpersona.sdk2.inquiry.internal.q> iVar23, dt.i<xo.f> iVar24, dt.i<ju.p0> iVar25) {
        this.f17584a = iVar;
        this.b = iVar2;
        this.f17585c = iVar3;
        this.f17586d = iVar4;
        this.f17587e = iVar5;
        this.f17588f = iVar6;
        this.f17589g = iVar7;
        this.f17590h = iVar8;
        this.f17591i = iVar9;
        this.f17592j = iVar10;
        this.f17593k = iVar11;
        this.f17594l = iVar12;
        this.f17595m = iVar13;
        this.f17596n = iVar14;
        this.f17597o = iVar15;
        this.f17598p = iVar16;
        this.f17599q = iVar17;
        this.f17600r = iVar18;
        this.f17601s = iVar19;
        this.f17602t = iVar20;
        this.f17603u = iVar21;
        this.f17604v = iVar22;
        this.f17605w = iVar23;
        this.f17606x = iVar24;
        this.f17607y = iVar25;
    }

    public static f0 a(dt.i<c.a> iVar, dt.i<a.InterfaceC0217a> iVar2, dt.i<k.b> iVar3, dt.i<r.a> iVar4, dt.i<TransitionWorker.a> iVar5, dt.i<v.a> iVar6, dt.i<f.a> iVar7, dt.i<m.a> iVar8, dt.i<GovernmentIdWorkflow> iVar9, dt.i<SelfieWorkflow> iVar10, dt.i<UiWorkflow> iVar11, dt.i<DocumentWorkflow> iVar12, dt.i<IntegrationWorkflow> iVar13, dt.i<nq.e> iVar14, dt.i<sq.a> iVar15, dt.i<nq.c> iVar16, dt.i<UiStepSavedStateHelper> iVar17, dt.i<o.a> iVar18, dt.i<b.a> iVar19, dt.i<eo.e> iVar20, dt.i<TrackingEventsLogger> iVar21, dt.i<TrackingMetadataProvider> iVar22, dt.i<com.withpersona.sdk2.inquiry.internal.q> iVar23, dt.i<xo.f> iVar24, dt.i<ju.p0> iVar25) {
        return new f0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16, iVar17, iVar18, iVar19, iVar20, iVar21, iVar22, iVar23, iVar24, iVar25);
    }

    public static e0 c(InquiryWorkflow$Props inquiryWorkflow$Props, android.view.l0 l0Var, c.a aVar, a.InterfaceC0217a interfaceC0217a, k.b bVar, r.a aVar2, TransitionWorker.a aVar3, v.a aVar4, f.a aVar5, m.a aVar6, GovernmentIdWorkflow governmentIdWorkflow, SelfieWorkflow selfieWorkflow, UiWorkflow uiWorkflow, DocumentWorkflow documentWorkflow, IntegrationWorkflow integrationWorkflow, nq.e eVar, sq.a aVar7, nq.c cVar, UiStepSavedStateHelper uiStepSavedStateHelper, o.a aVar8, b.a aVar9, eo.e eVar2, TrackingEventsLogger trackingEventsLogger, TrackingMetadataProvider trackingMetadataProvider, com.withpersona.sdk2.inquiry.internal.q qVar, xo.f fVar, ju.p0 p0Var) {
        return new e0(inquiryWorkflow$Props, l0Var, aVar, interfaceC0217a, bVar, aVar2, aVar3, aVar4, aVar5, aVar6, governmentIdWorkflow, selfieWorkflow, uiWorkflow, documentWorkflow, integrationWorkflow, eVar, aVar7, cVar, uiStepSavedStateHelper, aVar8, aVar9, eVar2, trackingEventsLogger, trackingMetadataProvider, qVar, fVar, p0Var);
    }

    public e0 b(InquiryWorkflow$Props inquiryWorkflow$Props, android.view.l0 l0Var) {
        return c(inquiryWorkflow$Props, l0Var, this.f17584a.get(), this.b.get(), this.f17585c.get(), this.f17586d.get(), this.f17587e.get(), this.f17588f.get(), this.f17589g.get(), this.f17590h.get(), this.f17591i.get(), this.f17592j.get(), this.f17593k.get(), this.f17594l.get(), this.f17595m.get(), this.f17596n.get(), this.f17597o.get(), this.f17598p.get(), this.f17599q.get(), this.f17600r.get(), this.f17601s.get(), this.f17602t.get(), this.f17603u.get(), this.f17604v.get(), this.f17605w.get(), this.f17606x.get(), this.f17607y.get());
    }
}
