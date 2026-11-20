package fn;

import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.b0;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final dt.i<b0.a> f17337a;
    public final dt.i<i0> b;

    /* renamed from: c, reason: collision with root package name */
    public final dt.i<ju.p0> f17338c;

    /* renamed from: d, reason: collision with root package name */
    public final dt.i<TrackingEventsLogger> f17339d;

    public e(dt.i<b0.a> iVar, dt.i<i0> iVar2, dt.i<ju.p0> iVar3, dt.i<TrackingEventsLogger> iVar4) {
        this.f17337a = iVar;
        this.b = iVar2;
        this.f17338c = iVar3;
        this.f17339d = iVar4;
    }

    public static e a(dt.i<b0.a> iVar, dt.i<i0> iVar2, dt.i<ju.p0> iVar3, dt.i<TrackingEventsLogger> iVar4) {
        return new e(iVar, iVar2, iVar3, iVar4);
    }

    public static c c(b0.a aVar, i0 i0Var, ju.p0 p0Var, TrackingEventsLogger trackingEventsLogger, CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, kn.a aVar2, @Nullable sr.a aVar3, boolean z10) {
        return new c(aVar, i0Var, p0Var, trackingEventsLogger, cameraChoices, camera2PreviewView, gVar, aVar2, aVar3, z10);
    }

    public c b(CameraChoices cameraChoices, Camera2PreviewView camera2PreviewView, g gVar, kn.a aVar, @Nullable sr.a aVar2, boolean z10) {
        return c(this.f17337a.get(), this.b.get(), this.f17338c.get(), this.f17339d.get(), cameraChoices, camera2PreviewView, gVar, aVar, aVar2, z10);
    }
}
