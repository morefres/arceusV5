package eq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import eq.f;
import eq.g;
import gt.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import un.a;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;
import ym.k;
import yt.o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Leq/f;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Leq/g;", "viewController", "<init>", "(Leq/g;)V", "rendering", "Lym/y;", "viewEnvironment", "", "c", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;)V", "Ltq/a;", "systemUiController", ve.a.f33391e, "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Ltq/a;)V", j6.b.f21518e, "Leq/g;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements k<SelfieWorkflow.c.g> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g viewController;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Leq/f$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "f", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: eq.f$a, reason: from kotlin metadata */
    public static final class Companion implements a0<SelfieWorkflow.c.g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ym.f<SelfieWorkflow.c.g> f16175a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: eq.f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0302a extends kotlin.jvm.internal.k implements Function2<SelfieWorkflow.c.g, ViewEnvironment, Unit> {
            public C0302a(Object obj) {
                super(2, obj, f.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$SubmittingScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(SelfieWorkflow.c.g p02, ViewEnvironment p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                ((f) this.receiver).b(p02, p12);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(SelfieWorkflow.c.g gVar, ViewEnvironment viewEnvironment) {
                d(gVar, viewEnvironment);
                return Unit.f22894a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: eq.f$a$b */
        public static final /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16176a;

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
                f16176a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View d(SelfieWorkflow.c.g initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            un.d dVar;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            a.C0601a c10 = un.a.f33038a.c(g.a.class, new g.a() { // from class: eq.e
                @Override // eq.g.a
                public final g a(Context context2, ViewGroup viewGroup2) {
                    g e10;
                    e10 = f.Companion.e(context2, viewGroup2);
                    return e10;
                }
            });
            int i10 = b.f16176a[initialRendering.getDesignVersion().ordinal()];
            if (i10 == 1 || i10 == 2) {
                dVar = un.d.f33040a;
            } else {
                if (i10 != 3) {
                    throw new l();
                }
                dVar = un.d.f33044f;
            }
            g a10 = ((g.a) c10.a(dVar)).a(context, viewGroup);
            e0.a(a10.getRoot(), initialRendering, initialViewEnvironment, new C0302a(new f(a10)));
            return a10.getRoot();
        }

        public static final g e(Context context, ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new c(context, viewGroup);
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SelfieWorkflow.c.g initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f16175a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super SelfieWorkflow.c.g> getType() {
            return this.f16175a.getType();
        }

        public Companion() {
            this.f16175a = new ym.f<>(d0.b(SelfieWorkflow.c.g.class), new o() { // from class: eq.d
                @Override // yt.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    View d10;
                    d10 = f.Companion.d((SelfieWorkflow.c.g) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                    return d10;
                }
            });
        }
    }

    public f(@NotNull g viewController) {
        Intrinsics.checkNotNullParameter(viewController, "viewController");
        this.viewController = viewController;
        viewController.a();
    }

    public final void a(@NotNull SelfieWorkflow.c.g rendering, @Nullable tq.a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        this.viewController.b(systemUiController, rendering.getSdkFilesManager(), rendering.getTitle(), rendering.getDescription(), rendering.getPendingPageTextVerticalPosition(), rendering.getCustomLoadingAsset(), rendering.getNavBarTitle(), rendering.getNavigationState(), rendering.getStyles(), rendering.g(), rendering.h(), rendering.getCenterSelfieFilePath(), rendering.getUploadScanningHintText(), rendering.getRecoverableSubmitError(), rendering.i());
    }

    @Override // ym.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull SelfieWorkflow.c.g rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        a(rendering, tq.c.a(viewEnvironment));
    }
}
