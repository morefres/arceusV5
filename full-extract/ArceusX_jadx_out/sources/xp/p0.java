package xp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import un.a;
import xp.r0;
import ym.ViewEnvironment;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020 8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lxp/p0;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/camera/b;", "cameraPreview", "Lat/a;", "Ldn/n0;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Leo/e;", "featureFlagManager", "<init>", "(Lcom/withpersona/sdk2/camera/b;Lat/a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Leo/e;)V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", j6.b.f21518e, "Lcom/withpersona/sdk2/camera/b;", "c", "Lat/a;", rl.d.f30696a, "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "e", "Leo/e;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p0 implements ym.a0<SelfieWorkflow.c.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym.f<SelfieWorkflow.c.a> f36047a;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.b cameraPreview;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final at.a<dn.n0> selfieDirectionFeed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eo.e featureFlagManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements Function2<SelfieWorkflow.c.a, ViewEnvironment, Unit> {
        public a(Object obj) {
            super(2, obj, k0.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
        }

        public final void d(SelfieWorkflow.c.a p02, ViewEnvironment p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((k0) this.receiver).b(p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.c.a aVar, ViewEnvironment viewEnvironment) {
            d(aVar, viewEnvironment);
            return Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36051a;

        static {
            int[] iArr = new int[wp.a.values().length];
            try {
                iArr[wp.a.f34486a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wp.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wp.a.f34487c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36051a = iArr;
        }
    }

    public p0(@NotNull final com.withpersona.sdk2.camera.b cameraPreview, @NotNull final at.a<dn.n0> selfieDirectionFeed, @NotNull final TrackingEventsLogger trackingEventsLogger, @NotNull final eo.e featureFlagManager) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.f36047a = new ym.f<>(kotlin.jvm.internal.d0.b(SelfieWorkflow.c.a.class), new yt.o() { // from class: xp.n0
            @Override // yt.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                View d10;
                d10 = p0.d(com.withpersona.sdk2.camera.b.this, selfieDirectionFeed, trackingEventsLogger, featureFlagManager, (SelfieWorkflow.c.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                return d10;
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.trackingEventsLogger = trackingEventsLogger;
        this.featureFlagManager = featureFlagManager;
    }

    public static final View d(com.withpersona.sdk2.camera.b bVar, at.a aVar, TrackingEventsLogger trackingEventsLogger, eo.e eVar, SelfieWorkflow.c.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        un.d dVar;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        a.C0601a c10 = un.a.f33038a.c(r0.a.class, new r0.a() { // from class: xp.o0
            @Override // xp.r0.a
            public final r0 a(Context context2, ViewGroup viewGroup2) {
                r0 e10;
                e10 = p0.e(context2, viewGroup2);
                return e10;
            }
        });
        int i10 = b.f36051a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Invalid design version.");
        }
        if (i10 == 2) {
            dVar = un.d.f33040a;
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            dVar = un.d.f33043e;
        }
        r0 a10 = ((r0.a) c10.a(dVar)).a(context, viewGroup);
        tq.c.b(initialViewEnvironment, context, l2.b.c(context, wp.o.f34629a));
        View root = a10.getRoot();
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ym.e0.a(root, initialRendering, initialViewEnvironment, new a(new k0(context, a10, bVar, (dn.n0) obj, trackingEventsLogger, eVar.a(eo.a0.f16087a))));
        return a10.getRoot();
    }

    public static final r0 e(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new q(context, viewGroup);
    }

    @Override // ym.a0
    @NotNull
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public View a(@NotNull SelfieWorkflow.c.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.f36047a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // ym.a0
    @NotNull
    public gu.c<? super SelfieWorkflow.c.a> getType() {
        return this.f36047a.getType();
    }
}
