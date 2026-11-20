package xp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* loaded from: classes3.dex */
public final class q0 implements dt.d<p0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.camera.b> f36067a;
    public final dt.i<dn.n0> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f36068c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<eo.e> f36069d;

    public q0(dt.i<com.withpersona.sdk2.camera.b> iVar, dt.i<dn.n0> iVar2, dt.i<TrackingEventsLogger> iVar3, dt.i<eo.e> iVar4) {
        this.f36067a = iVar;
        this.b = iVar2;
        this.f36068c = iVar3;
        this.f36069d = iVar4;
    }

    public static q0 a(dt.i<com.withpersona.sdk2.camera.b> iVar, dt.i<dn.n0> iVar2, dt.i<TrackingEventsLogger> iVar3, dt.i<eo.e> iVar4) {
        return new q0(iVar, iVar2, iVar3, iVar4);
    }

    public static p0 c(com.withpersona.sdk2.camera.b bVar, at.a<dn.n0> aVar, TrackingEventsLogger trackingEventsLogger, eo.e eVar) {
        return new p0(bVar, aVar, trackingEventsLogger, eVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return c(this.f36067a.get(), dt.c.b(this.b), this.f36068c.get(), this.f36069d.get());
    }
}
