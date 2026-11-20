package ao;

import android.content.Context;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.i;
import com.withpersona.sdk2.inquiry.document.network.a;
import com.withpersona.sdk2.inquiry.document.network.c;
import com.withpersona.sdk2.inquiry.document.network.e;
import com.withpersona.sdk2.inquiry.document.network.g;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import zn.a;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<k6.s> f3359a;
    public final dt.i<Context> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.document.a> f3360c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<i.b> f3361d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<a.C0184a> f3362e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<e.a> f3363f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<c.a> f3364g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<a.C0697a> f3365h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<g.a> f3366i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<sq.a> f3367j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<nq.c> f3368k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f3369l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<e.a> f3370m;

    /* renamed from: n, reason: collision with root package name */
    public final dt.i<ju.p0> f3371n;

    public c1(dt.i<k6.s> iVar, dt.i<Context> iVar2, dt.i<com.withpersona.sdk2.inquiry.document.a> iVar3, dt.i<i.b> iVar4, dt.i<a.C0184a> iVar5, dt.i<e.a> iVar6, dt.i<c.a> iVar7, dt.i<a.C0697a> iVar8, dt.i<g.a> iVar9, dt.i<sq.a> iVar10, dt.i<nq.c> iVar11, dt.i<TrackingEventsLogger> iVar12, dt.i<e.a> iVar13, dt.i<ju.p0> iVar14) {
        this.f3359a = iVar;
        this.b = iVar2;
        this.f3360c = iVar3;
        this.f3361d = iVar4;
        this.f3362e = iVar5;
        this.f3363f = iVar6;
        this.f3364g = iVar7;
        this.f3365h = iVar8;
        this.f3366i = iVar9;
        this.f3367j = iVar10;
        this.f3368k = iVar11;
        this.f3369l = iVar12;
        this.f3370m = iVar13;
        this.f3371n = iVar14;
    }

    public static c1 a(dt.i<k6.s> iVar, dt.i<Context> iVar2, dt.i<com.withpersona.sdk2.inquiry.document.a> iVar3, dt.i<i.b> iVar4, dt.i<a.C0184a> iVar5, dt.i<e.a> iVar6, dt.i<c.a> iVar7, dt.i<a.C0697a> iVar8, dt.i<g.a> iVar9, dt.i<sq.a> iVar10, dt.i<nq.c> iVar11, dt.i<TrackingEventsLogger> iVar12, dt.i<e.a> iVar13, dt.i<ju.p0> iVar14) {
        return new c1(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14);
    }

    public static com.withpersona.sdk2.inquiry.document.step.b c(DocumentWorkflow.Input input, android.view.l0 l0Var, k6.s sVar, Context context, com.withpersona.sdk2.inquiry.document.a aVar, i.b bVar, a.C0184a c0184a, e.a aVar2, c.a aVar3, a.C0697a c0697a, g.a aVar4, sq.a aVar5, nq.c cVar, TrackingEventsLogger trackingEventsLogger, e.a aVar6, ju.p0 p0Var) {
        return new com.withpersona.sdk2.inquiry.document.step.b(input, l0Var, sVar, context, aVar, bVar, c0184a, aVar2, aVar3, c0697a, aVar4, aVar5, cVar, trackingEventsLogger, aVar6, p0Var);
    }

    public com.withpersona.sdk2.inquiry.document.step.b b(DocumentWorkflow.Input input, android.view.l0 l0Var) {
        return c(input, l0Var, this.f3359a.get(), this.b.get(), this.f3360c.get(), this.f3361d.get(), this.f3362e.get(), this.f3363f.get(), this.f3364g.get(), this.f3365h.get(), this.f3366i.get(), this.f3367j.get(), this.f3368k.get(), this.f3369l.get(), this.f3370m.get(), this.f3371n.get());
    }
}
