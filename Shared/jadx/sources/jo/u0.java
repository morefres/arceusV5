package jo;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;
import mo.GovernmentIdHintWorker;
import rr.b;

/* loaded from: classes3.dex */
public final class u0 implements dt.d<t0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f21960a;
    public final dt.i<PermissionRequestWorkflow> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<GovernmentIdAnalyzeWorker.a> f21961c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<GovernmentIdHintWorker.b> f21962d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<b.a> f21963e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<e.a> f21964f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<c.a> f21965g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<sq.a> f21966h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f21967i;

    public u0(dt.i<Context> iVar, dt.i<PermissionRequestWorkflow> iVar2, dt.i<GovernmentIdAnalyzeWorker.a> iVar3, dt.i<GovernmentIdHintWorker.b> iVar4, dt.i<b.a> iVar5, dt.i<e.a> iVar6, dt.i<c.a> iVar7, dt.i<sq.a> iVar8, dt.i<TrackingEventsLogger> iVar9) {
        this.f21960a = iVar;
        this.b = iVar2;
        this.f21961c = iVar3;
        this.f21962d = iVar4;
        this.f21963e = iVar5;
        this.f21964f = iVar6;
        this.f21965g = iVar7;
        this.f21966h = iVar8;
        this.f21967i = iVar9;
    }

    public static u0 a(dt.i<Context> iVar, dt.i<PermissionRequestWorkflow> iVar2, dt.i<GovernmentIdAnalyzeWorker.a> iVar3, dt.i<GovernmentIdHintWorker.b> iVar4, dt.i<b.a> iVar5, dt.i<e.a> iVar6, dt.i<c.a> iVar7, dt.i<sq.a> iVar8, dt.i<TrackingEventsLogger> iVar9) {
        return new u0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static t0 c(Context context, PermissionRequestWorkflow permissionRequestWorkflow, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, b.a aVar2, e.a aVar3, c.a aVar4, sq.a aVar5, TrackingEventsLogger trackingEventsLogger) {
        return new t0(context, permissionRequestWorkflow, aVar, bVar, aVar2, aVar3, aVar4, aVar5, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f21960a.get(), this.b.get(), this.f21961c.get(), this.f21962d.get(), this.f21963e.get(), this.f21964f.get(), this.f21965g.get(), this.f21966h.get(), this.f21967i.get());
    }
}
