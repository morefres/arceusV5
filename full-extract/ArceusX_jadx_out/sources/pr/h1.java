package pr;

import android.content.Context;
import com.withpersona.sdk2.inquiry.nfc.b;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.d;
import com.withpersona.sdk2.inquiry.ui.k;
import jp.n;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f29087a;
    public final dt.i<b.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<n.a> f29088c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<up.c> f29089d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<d.a> f29090e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<k.a> f29091f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<sq.a> f29092g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<e0> f29093h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<nq.c> f29094i;

    /* renamed from: j, reason: collision with root package name */
    public final dt.i<eo.e> f29095j;

    /* renamed from: k, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f29096k;

    /* renamed from: l, reason: collision with root package name */
    public final dt.i<e.a> f29097l;

    /* renamed from: m, reason: collision with root package name */
    public final dt.i<ju.p0> f29098m;

    public h1(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<n.a> iVar3, dt.i<up.c> iVar4, dt.i<d.a> iVar5, dt.i<k.a> iVar6, dt.i<sq.a> iVar7, dt.i<e0> iVar8, dt.i<nq.c> iVar9, dt.i<eo.e> iVar10, dt.i<TrackingEventsLogger> iVar11, dt.i<e.a> iVar12, dt.i<ju.p0> iVar13) {
        this.f29087a = iVar;
        this.b = iVar2;
        this.f29088c = iVar3;
        this.f29089d = iVar4;
        this.f29090e = iVar5;
        this.f29091f = iVar6;
        this.f29092g = iVar7;
        this.f29093h = iVar8;
        this.f29094i = iVar9;
        this.f29095j = iVar10;
        this.f29096k = iVar11;
        this.f29097l = iVar12;
        this.f29098m = iVar13;
    }

    public static h1 a(dt.i<Context> iVar, dt.i<b.a> iVar2, dt.i<n.a> iVar3, dt.i<up.c> iVar4, dt.i<d.a> iVar5, dt.i<k.a> iVar6, dt.i<sq.a> iVar7, dt.i<e0> iVar8, dt.i<nq.c> iVar9, dt.i<eo.e> iVar10, dt.i<TrackingEventsLogger> iVar11, dt.i<e.a> iVar12, dt.i<ju.p0> iVar13) {
        return new h1(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13);
    }

    public static g1 c(UiWorkflow.Input input, android.view.l0 l0Var, Context context, b.a aVar, n.a aVar2, up.c cVar, d.a aVar3, k.a aVar4, sq.a aVar5, e0 e0Var, nq.c cVar2, eo.e eVar, TrackingEventsLogger trackingEventsLogger, e.a aVar6, ju.p0 p0Var) {
        return new g1(input, l0Var, context, aVar, aVar2, cVar, aVar3, aVar4, aVar5, e0Var, cVar2, eVar, trackingEventsLogger, aVar6, p0Var);
    }

    public g1 b(UiWorkflow.Input input, android.view.l0 l0Var) {
        return c(input, l0Var, this.f29087a.get(), this.b.get(), this.f29088c.get(), this.f29089d.get(), this.f29090e.get(), this.f29091f.get(), this.f29092g.get(), this.f29093h.get(), this.f29094i.get(), this.f29095j.get(), this.f29096k.get(), this.f29097l.get(), this.f29098m.get());
    }
}
