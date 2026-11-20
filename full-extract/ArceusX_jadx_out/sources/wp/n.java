package wp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* loaded from: classes3.dex */
public final class n implements dt.d<com.withpersona.sdk2.inquiry.selfie.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.camera.b> f34616a;
    public final dt.i<dn.n0> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<fn.i0> f34617c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f34618d;

    public n(dt.i<com.withpersona.sdk2.camera.b> iVar, dt.i<dn.n0> iVar2, dt.i<fn.i0> iVar3, dt.i<TrackingEventsLogger> iVar4) {
        this.f34616a = iVar;
        this.b = iVar2;
        this.f34617c = iVar3;
        this.f34618d = iVar4;
    }

    public static n a(dt.i<com.withpersona.sdk2.camera.b> iVar, dt.i<dn.n0> iVar2, dt.i<fn.i0> iVar3, dt.i<TrackingEventsLogger> iVar4) {
        return new n(iVar, iVar2, iVar3, iVar4);
    }

    public static com.withpersona.sdk2.inquiry.selfie.d c(com.withpersona.sdk2.camera.b bVar, at.a<dn.n0> aVar, fn.i0 i0Var, TrackingEventsLogger trackingEventsLogger) {
        return new com.withpersona.sdk2.inquiry.selfie.d(bVar, aVar, i0Var, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.selfie.d get() {
        return c(this.f34616a.get(), dt.c.b(this.b), this.f34617c.get(), this.f34618d.get());
    }
}
