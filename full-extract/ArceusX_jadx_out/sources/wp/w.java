package wp;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* loaded from: classes3.dex */
public final class w implements dt.d<com.withpersona.sdk2.inquiry.selfie.g> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<nq.c> f34761a;
    public final dt.i<TrackingEventsLogger> b;

    public w(dt.i<nq.c> iVar, dt.i<TrackingEventsLogger> iVar2) {
        this.f34761a = iVar;
        this.b = iVar2;
    }

    public static w a(dt.i<nq.c> iVar, dt.i<TrackingEventsLogger> iVar2) {
        return new w(iVar, iVar2);
    }

    public static com.withpersona.sdk2.inquiry.selfie.g c(nq.c cVar, TrackingEventsLogger trackingEventsLogger) {
        return new com.withpersona.sdk2.inquiry.selfie.g(cVar, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.withpersona.sdk2.inquiry.selfie.g get() {
        return c(this.f34761a.get(), this.b.get());
    }
}
