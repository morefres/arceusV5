package po;

import android.content.Context;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.c;

/* loaded from: classes3.dex */
public final class k1 implements dt.d<j1> {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f28772a;
    public final dt.i<e.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<c.a> f28773c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<sq.a> f28774d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f28775e;

    public k1(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        this.f28772a = iVar;
        this.b = iVar2;
        this.f28773c = iVar3;
        this.f28774d = iVar4;
        this.f28775e = iVar5;
    }

    public static k1 a(dt.i<Context> iVar, dt.i<e.a> iVar2, dt.i<c.a> iVar3, dt.i<sq.a> iVar4, dt.i<TrackingEventsLogger> iVar5) {
        return new k1(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static j1 c(Context context, e.a aVar, c.a aVar2, sq.a aVar3, TrackingEventsLogger trackingEventsLogger) {
        return new j1(context, aVar, aVar2, aVar3, trackingEventsLogger);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j1 get() {
        return c(this.f28772a.get(), this.b.get(), this.f28773c.get(), this.f28774d.get(), this.f28775e.get());
    }
}
