package so;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;

/* loaded from: classes3.dex */
public final class w implements dt.d<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f31608a;
    public final dt.i<e.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<c.a> f31609c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f31610d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f31611e;

    public w(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        this.f31608a = iVar;
        this.b = iVar2;
        this.f31609c = iVar3;
        this.f31610d = iVar4;
        this.f31611e = iVar5;
    }

    public static w a(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        return new w(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static v c(Context context, e.a aVar, c.a aVar2, sq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new v(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f31608a.get(), this.b.get(), this.f31609c.get(), this.f31610d.get(), this.f31611e.get());
    }
}
