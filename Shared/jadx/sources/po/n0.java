package po;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;
import mo.GovernmentIdHintWorker;
import rr.b;

/* loaded from: classes3.dex */
public final class n0 implements dt.d<m0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28802a;
    public final dt.i<GovernmentIdAnalyzeWorker.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<GovernmentIdHintWorker.b> f28803c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<b.a> f28804d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<e.a> f28805e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<c.a> f28806f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<sq.a> f28807g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28808h;

    /* renamed from: i, reason: collision with root package name */
    public final dt.i<e.a> f28809i;

    public n0(dt.i<Context> iVar, dt.i<GovernmentIdAnalyzeWorker.a> iVar2, dt.i<GovernmentIdHintWorker.b> iVar3, dt.i<b.a> iVar4, dt.i<e.a> iVar5, dt.i<c.a> iVar6, dt.i<sq.a> iVar7, dt.i<TrackingEventsLogger> iVar8, dt.i<e.a> iVar9) {
        this.f28802a = iVar;
        this.b = iVar2;
        this.f28803c = iVar3;
        this.f28804d = iVar4;
        this.f28805e = iVar5;
        this.f28806f = iVar6;
        this.f28807g = iVar7;
        this.f28808h = iVar8;
        this.f28809i = iVar9;
    }

    public static n0 a(dt.i<Context> iVar, dt.i<GovernmentIdAnalyzeWorker.a> iVar2, dt.i<GovernmentIdHintWorker.b> iVar3, dt.i<b.a> iVar4, dt.i<e.a> iVar5, dt.i<c.a> iVar6, dt.i<sq.a> iVar7, dt.i<TrackingEventsLogger> iVar8, dt.i<e.a> iVar9) {
        return new n0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9);
    }

    public static m0 c(Context context, GovernmentIdAnalyzeWorker.a aVar, GovernmentIdHintWorker.b bVar, b.a aVar2, e.a aVar3, c.a aVar4, sq.a aVar5, TrackingEventsLogger trackingEventsLogger, e.a aVar6) {
        return new m0(context, aVar, bVar, aVar2, aVar3, aVar4, aVar5, trackingEventsLogger, aVar6);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f28802a.get(), this.b.get(), this.f28803c.get(), this.f28804d.get(), this.f28805e.get(), this.f28806f.get(), this.f28807g.get(), this.f28808h.get(), this.f28809i.get());
    }
}
