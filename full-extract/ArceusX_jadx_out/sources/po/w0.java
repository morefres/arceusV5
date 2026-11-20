package po;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;

/* loaded from: classes3.dex */
public final class w0 implements dt.d<v0> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28847a;
    public final dt.i<e.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<c.a> f28848c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f28849d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28850e;

    public w0(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        this.f28847a = iVar;
        this.b = iVar2;
        this.f28848c = iVar3;
        this.f28849d = iVar4;
        this.f28850e = iVar5;
    }

    public static w0 a(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        return new w0(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v0 c(Context context, e.a aVar, c.a aVar2, sq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new v0(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v0 get() {
        return c(this.f28847a.get(), this.b.get(), this.f28848c.get(), this.f28849d.get(), this.f28850e.get());
    }
}
