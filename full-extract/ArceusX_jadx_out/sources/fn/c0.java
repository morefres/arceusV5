package fn;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f17328a;
    public final dt.i<jn.a> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<oq.c> f17329c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<i0> f17330d;

    /* renamed from: e, reason: collision with root package name */
    public final dt.i<jq.a> f17331e;

    /* renamed from: f, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f17332f;

    /* renamed from: g, reason: collision with root package name */
    public final dt.i<nq.c> f17333g;

    /* renamed from: h, reason: collision with root package name */
    public final dt.i<eo.e> f17334h;

    public c0(dt.i<Context> iVar, dt.i<jn.a> iVar2, dt.i<oq.c> iVar3, dt.i<i0> iVar4, dt.i<jq.a> iVar5, dt.i<TrackingEventsLogger> iVar6, dt.i<nq.c> iVar7, dt.i<eo.e> iVar8) {
        this.f17328a = iVar;
        this.b = iVar2;
        this.f17329c = iVar3;
        this.f17330d = iVar4;
        this.f17331e = iVar5;
        this.f17332f = iVar6;
        this.f17333g = iVar7;
        this.f17334h = iVar8;
    }

    public static c0 a(dt.i<Context> iVar, dt.i<jn.a> iVar2, dt.i<oq.c> iVar3, dt.i<i0> iVar4, dt.i<jq.a> iVar5, dt.i<TrackingEventsLogger> iVar6, dt.i<nq.c> iVar7, dt.i<eo.e> iVar8) {
        return new c0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static b0 c(Context context, jn.a aVar, oq.c cVar, i0 i0Var, jq.a aVar2, TrackingEventsLogger trackingEventsLogger, nq.c cVar2, eo.e eVar, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, kn.a aVar3, @Nullable sr.a aVar4, boolean z10) {
        return new b0(context, aVar, cVar, i0Var, aVar2, trackingEventsLogger, cVar2, eVar, cameraChoices, camera2PreviewView, gVar, aVar3, aVar4, z10);
    }

    public b0 b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, kn.a aVar, @Nullable sr.a aVar2, boolean z10) {
        return c(this.f17328a.get(), this.b.get(), this.f17329c.get(), this.f17330d.get(), this.f17331e.get(), this.f17332f.get(), this.f17333g.get(), this.f17334h.get(), cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}
