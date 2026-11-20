package go;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import no.c;

/* loaded from: classes3.dex */
public final class h2 implements dt.d<GovernmentIdWorkflow> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f18610a;
    public final dt.i<k6.s> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<c.a> f18611c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.governmentid.e> f18612d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<so.j> f18613e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<so.v> f18614f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<jo.t0> f18615g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<AutoClassifyWorker.b> f18616h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<ho.n> f18617i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<jn.a> f18618j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<sq.a> f18619k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<nq.c> f18620l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f18621m;

    /* renamed from: n, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f18622n;

    public h2(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<so.j> iVar5, dt.i<so.v> iVar6, dt.i<jo.t0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<ho.n> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14) {
        this.f18610a = iVar;
        this.b = iVar2;
        this.f18611c = iVar3;
        this.f18612d = iVar4;
        this.f18613e = iVar5;
        this.f18614f = iVar6;
        this.f18615g = iVar7;
        this.f18616h = iVar8;
        this.f18617i = iVar9;
        this.f18618j = iVar10;
        this.f18619k = iVar11;
        this.f18620l = iVar12;
        this.f18621m = iVar13;
        this.f18622n = iVar14;
    }

    public static h2 a(dt.i<Context> iVar, dt.i<k6.s> iVar2, dt.i<c.a> iVar3, dt.i<com.withpersona.sdk2.inquiry.governmentid.e> iVar4, dt.i<so.j> iVar5, dt.i<so.v> iVar6, dt.i<jo.t0> iVar7, dt.i<AutoClassifyWorker.b> iVar8, dt.i<ho.n> iVar9, dt.i<jn.a> iVar10, dt.i<sq.a> iVar11, dt.i<nq.c> iVar12, dt.i<TrackingEventsLogger> iVar13, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar14) {
        return new h2(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14);
    }

    public static GovernmentIdWorkflow c(Context context, k6.s sVar, c.a aVar, com.withpersona.sdk2.inquiry.governmentid.e eVar, so.j jVar, so.v vVar, jo.t0 t0Var, AutoClassifyWorker.b bVar, ho.n nVar, jn.a aVar2, sq.a aVar3, nq.c cVar, TrackingEventsLogger trackingEventsLogger, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar4) {
        return new GovernmentIdWorkflow(context, sVar, aVar, eVar, jVar, vVar, t0Var, bVar, nVar, aVar2, aVar3, cVar, trackingEventsLogger, aVar4);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public GovernmentIdWorkflow get() {
        return c(this.f18610a.get(), this.b.get(), this.f18611c.get(), this.f18612d.get(), this.f18613e.get(), this.f18614f.get(), this.f18615g.get(), this.f18616h.get(), this.f18617i.get(), this.f18618j.get(), this.f18619k.get(), this.f18620l.get(), this.f18621m.get(), this.f18622n.get());
    }
}
