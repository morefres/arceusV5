package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.camera.b;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.e;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.d;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dn.n0;
import dn.s;
import fn.CameraChoices;
import fn.c;
import fn.f0;
import fn.i0;
import fn.m0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u001f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/d;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lat/a;", "Ldn/n0;", "selfieDirectionFeed", "Lfn/i0;", "cameraChoiceHelper", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lcom/withpersona/sdk2/camera/b;Lat/a;Lfn/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", rl.d.f30696a, "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/b;", "c", "Lat/a;", "Lfn/i0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements a0<SelfieWorkflow.c.C0240c> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym.f<SelfieWorkflow.c.C0240c> f12931a;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final at.a<n0> selfieDirectionFeed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i0 cameraChoiceHelper;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2<SelfieWorkflow.c.C0240c, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, c.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void d(SelfieWorkflow.c.C0240c p02, ViewEnvironment p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((c) this.receiver).b(p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.c.C0240c c0240c, ViewEnvironment viewEnvironment) {
            d(c0240c, viewEnvironment);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/d$b", "Ldn/s;", "", ve.a.f33391e, "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ yp.a f12935a;
        public final /* synthetic */ at.a<n0> b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.withpersona.sdk2.camera.b f12936c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0240c f12937d;

        public b(yp.a aVar, at.a<n0> aVar2, com.withpersona.sdk2.camera.b bVar, SelfieWorkflow.c.C0240c c0240c) {
            this.f12935a = aVar;
            this.b = aVar2;
            this.f12936c = bVar;
            this.f12937d = c0240c;
        }

        public static final Unit c(SelfieWorkflow.c.C0240c c0240c, dn.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c0240c.i().invoke(it);
            return Unit.f22894a;
        }

        @Override // dn.s
        public void a() {
            PreviewView previewviewSelfieCamera = this.f12935a.f36862k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            b.a aVar = b.a.f9974a;
            n0 n0Var = this.b.get();
            com.withpersona.sdk2.camera.b bVar = this.f12936c;
            final SelfieWorkflow.c.C0240c c0240c = this.f12937d;
            com.withpersona.sdk2.camera.b.g(bVar, previewviewSelfieCamera, aVar, n0Var, true, false, new Function1() { // from class: wp.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit c10;
                    c10 = d.b.c(SelfieWorkflow.c.C0240c.this, (dn.h) obj);
                    return c10;
                }
            }, 16, null);
        }
    }

    public d(@NotNull final com.withpersona.sdk2.camera.b cameraPreview, @NotNull final at.a<n0> selfieDirectionFeed, @NotNull i0 cameraChoiceHelper, @NotNull final TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(cameraChoiceHelper, "cameraChoiceHelper");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.f12931a = new ym.f<>(d0.b(SelfieWorkflow.c.C0240c.class), new yt.o() { // from class: wp.l
            @Override // yt.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                View c10;
                c10 = com.withpersona.sdk2.inquiry.selfie.d.c(at.a.this, cameraPreview, trackingEventsLogger, (SelfieWorkflow.c.C0240c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                return c10;
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.cameraChoiceHelper = cameraChoiceHelper;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    public static final View c(at.a aVar, com.withpersona.sdk2.camera.b bVar, TrackingEventsLogger trackingEventsLogger, SelfieWorkflow.c.C0240c initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        dn.g a10;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        yp.a c10 = yp.a.c(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() != kn.a.f22872c) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices b10 = f0.b(applicationContext, m0.f17385a);
            if (b10 == null) {
                initialRendering.i().invoke(new dn.i0());
                Camera2PreviewView camera2Preview = c10.f36854c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                a10 = new com.withpersona.sdk2.camera.g(camera2Preview);
            } else {
                c.a camera2ControllerFactory = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = c10.f36854c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                Object obj = aVar.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                a10 = camera2ControllerFactory.a(b10, camera2Preview2, (fn.g) obj, kn.a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            e.a cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            PreviewView previewviewSelfieCamera = c10.f36862k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            a10 = cameraXControllerFactory.a(bVar, previewviewSelfieCamera, new b(c10, aVar, bVar, initialRendering), initialRendering.getIsAudioRequired());
        }
        ConstraintLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Intrinsics.checkNotNull(c10);
        Object obj2 = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        e0.a(root, initialRendering, initialViewEnvironment, new a(new c(c10, a10, (n0) obj2, trackingEventsLogger)));
        ConstraintLayout root2 = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "let(...)");
        return root2;
    }

    @Override // ym.a0
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public View a(@NotNull SelfieWorkflow.c.C0240c initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f12931a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // ym.a0
    @NotNull
    public gu.c<? super SelfieWorkflow.c.C0240c> getType() {
        return this.f12931a.getType();
    }
}
