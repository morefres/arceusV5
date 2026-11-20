package ro;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import go.OverlayAssets;
import k6.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ro.k;
import ro.q;
import un.a;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lro/q;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lro/k;", "viewController", "<init>", "(Lro/k;)V", "rendering", "Lym/y;", "viewEnvironment", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lym/y;)V", j6.b.f21518e, "Lro/k;", "c", ve.a.f33391e, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements ym.k<Screen.h> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final k viewController;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lro/q$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", rl.d.f30696a, "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: ro.q$a, reason: from kotlin metadata */
    public static final class Companion implements a0<Screen.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ym.f<Screen.h> f30730a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: ro.q$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0541a extends kotlin.jvm.internal.k implements Function2<Screen.h, ViewEnvironment, Unit> {
            public C0541a(Object obj) {
                super(2, obj, q.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$ReviewScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(Screen.h p02, ViewEnvironment p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                ((q) this.receiver).b(p02, p12);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Screen.h hVar, ViewEnvironment viewEnvironment) {
                d(hVar, viewEnvironment);
                return Unit.f22894a;
            }
        }

        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ro/q$a$b", "Lro/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lro/k;", ve.a.f33391e, "(Landroid/content/Context;Landroid/view/ViewGroup;)Lro/k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: ro.q$a$b */
        public static final class b implements k.a {
            @Override // ro.k.a
            public k a(Context context, ViewGroup container) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new j(context, container);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: ro.q$a$c */
        public static final /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30731a;

            static {
                int[] iArr = new int[go.d.values().length];
                try {
                    iArr[go.d.f18578a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[go.d.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f30731a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(Screen.h initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            un.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            a.C0601a c10 = un.a.f33038a.c(k.a.class, new b());
            int i10 = c.f30731a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = un.d.f33041c;
            } else {
                if (i10 != 2) {
                    throw new gt.l();
                }
                dVar = un.d.f33046h;
            }
            k a10 = ((k.a) c10.a(dVar)).a(context, viewGroup);
            e0.a(a10.getRoot(), initialRendering, initialViewEnvironment, new C0541a(new q(a10)));
            return a10.getRoot();
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull Screen.h initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f30730a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super Screen.h> getType() {
            return this.f30730a.getType();
        }

        public Companion() {
            this.f30730a = new ym.f<>(d0.b(Screen.h.class), new yt.o() { // from class: ro.p
                @Override // yt.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    View c10;
                    c10 = q.Companion.c((Screen.h) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                    return c10;
                }
            });
        }
    }

    public q(@NotNull k viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    public static final Unit g(Screen.h hVar) {
        hVar.c().invoke();
        return Unit.f22894a;
    }

    public static final Unit h(Screen.h hVar) {
        hVar.u().invoke();
        return Unit.f22894a;
    }

    public static final Unit i(Screen.h hVar) {
        hVar.g().invoke();
        return Unit.f22894a;
    }

    public static final Unit j(Screen.h hVar) {
        hVar.s().invoke();
        return Unit.f22894a;
    }

    @Override // ym.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final Screen.h rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        k kVar = this.viewController;
        s imageLoader = rendering.getImageLoader();
        String imagePath = rendering.getImagePath();
        String message = rendering.getMessage();
        String disclaimer = rendering.getDisclaimer();
        String acceptText = rendering.getAcceptText();
        String retryText = rendering.getRetryText();
        String confirmCaptureTitle = rendering.getConfirmCaptureTitle();
        Screen.Overlay overlay = rendering.getOverlay();
        Context context = this.viewController.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OverlayAssets b = com.withpersona.sdk2.inquiry.governmentid.o.b(context, rendering.getOverlay(), rendering.getCaptureSide());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        kVar.b(viewEnvironment, imageLoader, imagePath, message, disclaimer, acceptText, retryText, confirmCaptureTitle, overlay, b, assetConfig != null ? com.withpersona.sdk2.inquiry.governmentid.a.a(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null, rendering.getNavigationState(), rendering.getIsEnabled(), rendering.getIsAutoClassifying(), rendering.getStyles(), rendering.getError(), rendering.getReviewCaptureButtonsAxis(), rendering.getNavBarTitle(), new Function0() { // from class: ro.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit g10;
                g10 = q.g(Screen.h.this);
                return g10;
            }
        }, new Function0() { // from class: ro.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit h10;
                h10 = q.h(Screen.h.this);
                return h10;
            }
        }, new Function0() { // from class: ro.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i10;
                i10 = q.i(Screen.h.this);
                return i10;
            }
        }, new Function0() { // from class: ro.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j10;
                j10 = q.j(Screen.h.this);
                return j10;
            }
        });
    }
}
