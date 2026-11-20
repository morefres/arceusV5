package xp;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJÿ\u0002\u0010K\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\t2\b\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\t2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\t2\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010B\u001a\u0004\u0018\u00010\t2\b\u0010D\u001a\u0004\u0018\u00010C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\r0E2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\r0E2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010EH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\rH\u0016¢\u0006\u0004\bM\u0010\u001eJ\u000f\u0010N\u001a\u00020\rH\u0016¢\u0006\u0004\bN\u0010\u001eJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010O\u001a\u00020\u0010H\u0016¢\u0006\u0004\bQ\u0010RJ!\u0010S\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u000bH\u0016¢\u0006\u0004\bV\u0010WJ1\u0010[\u001a\u00020\r2\b\u0010X\u001a\u0004\u0018\u00010\t2\b\u0010Y\u001a\u0004\u0018\u00010\t2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b]\u0010^J\u001d\u0010_\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b_\u0010^J\u001d\u0010`\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\b`\u0010^J\u001d\u0010a\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\ba\u0010^J\u001d\u0010b\u001a\u00020\r2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\r0EH\u0016¢\u0006\u0004\bb\u0010^R\u0014\u0010d\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010cR\u0014\u0010h\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010jR\u0014\u0010n\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010mR\u0016\u0010o\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0016\u0010p\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0019R\u0016\u0010q\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\u0019R\u0016\u0010r\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010\u0019R\u0016\u0010t\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010\u0019R\u0016\u0010v\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010\u0019R\u0016\u0010w\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0016\u0010x\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010\u0019R\u0014\u0010|\u001a\u00020y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bu\u0010\u0081\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0081\u0001¨\u0006\u0085\u0001"}, d2 = {"Lxp/q;", "Lxp/r0;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "Landroid/widget/TextView;", "", Text.type, "", "hideVisibility", "", "c0", "(Landroid/widget/TextView;Ljava/lang/String;I)V", "", "finalizingCoverVisible", "T", "(Z)V", "hintMessage", "hintDescription", "e0", "(Ljava/lang/String;Ljava/lang/String;)V", "messageTitle", "Z", "(Ljava/lang/String;)V", "messageBody", "W", ve.a.f33391e, "()V", "Ltq/a;", "systemUiController", "titleText", "autoCaptureText", "realTimeHintText", "captureSuccessText", "disclaimerText", "hintAutoCaptureTimeoutText", "hintVerifyingText", "isAutoCaptureOn", "isFlashEnabled", "mirrorPreview", "isInitializing", "showCameraCover", "isFinalizing", "nextCameraContentDescription", "isNextCameraButtonVisible", "isNextCameraButtonEnabled", "isToggleFlashButtonVisible", "isToggleFlashButtonEnabled", "isCaptureButtonVisible", "isCaptureButtonEnabled", "isCountingDown", "isCapturing", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "navBarTitle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;", "overlayState", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "watermarkText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "onNextCameraClick", "onToggleFlashClick", "onBackClick", "onCancelClick", "onCaptureClick", "g", "(Ltq/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZLjava/lang/String;ZZZZZZZZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$e;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "c", "l", "strictSelfie", "Lxp/s0;", "o", "(Z)Lxp/s0;", "n", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Ltq/a;)V", "countdownNumber", "e", "(I)V", "nextHintMessage", "nextHintDescription", "onComplete", rl.d.f30696a, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "k", "(Lkotlin/jvm/functions/Function0;)V", "f", "p", "m", "h", "I", "confirmHapticFeedbackConst", "Lyp/c;", j6.b.f21518e, "Lyp/c;", "binding", "Lmu/c0;", "Lmu/c0;", "realTimeHintFlow", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/m;", "lifecycleScope", "isPlayingSuccessAnimation", "isCameraCoverAnimatingOut", "isHintTitleAnimatingOut", "isHintTitleAnimatingIn", "i", "isHintBodyAnimatingOut", "j", "isHintBodyAnimatingIn", "isFinalizingCoverAnimatingIn", "isFinalizingCoverAnimatingOut", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "camera2PreviewView", "Landroidx/camera/view/PreviewView;", "()Landroidx/camera/view/PreviewView;", "cameraXPreviewView", "M", "pointOfInterestView", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements r0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int confirmHapticFeedbackConst;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final yp.c binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.c0<String> realTimeHintFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.m lifecycleScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isPlayingSuccessAnimation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isCameraCoverAnimatingOut;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isHintTitleAnimatingOut;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isHintTitleAnimatingIn;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isHintBodyAnimatingOut;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isHintBodyAnimatingIn;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isFinalizingCoverAnimatingIn;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isFinalizingCoverAnimatingOut;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isFlashEnabled;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController$onViewCreated$3", f = "BasicSelfieCaptureViewController.kt", l = {105}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36064t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: xp.q$a$a, reason: collision with other inner class name */
        public static final class C0661a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f36066a;

            public C0661a(q qVar) {
                this.f36066a = qVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, mt.b<? super Unit> bVar) {
                q qVar = this.f36066a;
                TextView realTimeHint = qVar.binding.f36893v;
                Intrinsics.checkNotNullExpressionValue(realTimeHint, "realTimeHint");
                q.d0(qVar, realTimeHint, str, 0, 2, null);
                return Unit.f22894a;
            }
        }

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return q.this.new a(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f36064t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.h l10 = mu.j.l(q.this.realTimeHintFlow, 300L);
                C0661a c0661a = new C0661a(q.this);
                this.f36064t = 1;
                if (l10.collect(c0661a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public q(@NotNull Context context, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.confirmHapticFeedbackConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
        yp.c c10 = yp.c.c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        this.binding = c10;
        this.realTimeHintFlow = mu.r0.a(null);
        Context context2 = c10.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.lifecycleScope = android.view.t.a(hq.g.i(context2));
    }

    public static final void I(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void J(Function0 function0, View view) {
        function0.invoke();
    }

    public static final void K(q qVar, yp.c cVar) {
        qVar.isCameraCoverAnimatingOut = false;
        cVar.f36878g.setVisibility(8);
    }

    public static final void L(yp.c cVar, Function0 function0, View view) {
        cVar.f36876e.setEnabled(false);
        function0.invoke();
    }

    public static final Unit N(q qVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space topSpace = qVar.binding.F;
        Intrinsics.checkNotNullExpressionValue(topSpace, "topSpace");
        ViewGroup.LayoutParams layoutParams = topSpace.getLayoutParams();
        if (layoutParams == null) {
            throw new gt.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.top;
        topSpace.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit O(q qVar, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Space bottomSpace = qVar.binding.f36875d;
        Intrinsics.checkNotNullExpressionValue(bottomSpace, "bottomSpace");
        ViewGroup.LayoutParams layoutParams = bottomSpace.getLayoutParams();
        if (layoutParams == null) {
            throw new gt.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = insetsIgnoringVisibility.bottom;
        bottomSpace.setLayoutParams(layoutParams);
        return Unit.f22894a;
    }

    public static final Unit P(yp.c cVar) {
        cVar.f36897z.setIntensity(0.0f);
        return Unit.f22894a;
    }

    public static final Unit Q(q qVar, String str, String str2, Function0 function0) {
        qVar.isPlayingSuccessAnimation = false;
        qVar.e0(str, str2);
        function0.invoke();
        return Unit.f22894a;
    }

    public static final Unit R() {
        return Unit.f22894a;
    }

    public static final Unit S() {
        return Unit.f22894a;
    }

    public static final void U(q qVar) {
        qVar.isFinalizingCoverAnimatingIn = false;
    }

    public static final void V(q qVar, FrameLayout frameLayout) {
        qVar.isFinalizingCoverAnimatingOut = false;
        frameLayout.setVisibility(8);
    }

    public static final void X(q qVar) {
        qVar.isHintBodyAnimatingOut = false;
    }

    public static final void Y(q qVar) {
        qVar.isHintBodyAnimatingIn = false;
    }

    public static final void a0(q qVar) {
        qVar.isHintTitleAnimatingOut = false;
    }

    public static final void b0(q qVar) {
        qVar.isHintTitleAnimatingIn = false;
    }

    public static /* synthetic */ void d0(q qVar, TextView textView, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        qVar.c0(textView, str, i10);
    }

    @Override // xp.r0
    @NotNull
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public PreviewView b() {
        PreviewView previewviewSelfieCamera = this.binding.f36891t;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        return previewviewSelfieCamera;
    }

    public final void T(boolean finalizingCoverVisible) {
        final FrameLayout finalizingCover = this.binding.f36883l;
        Intrinsics.checkNotNullExpressionValue(finalizingCover, "finalizingCover");
        if (!finalizingCoverVisible) {
            if (finalizingCover.getVisibility() == 8 || this.isFinalizingCoverAnimatingOut) {
                return;
            }
            this.isFinalizingCoverAnimatingIn = false;
            this.isFinalizingCoverAnimatingOut = true;
            finalizingCover.animate().cancel();
            finalizingCover.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: xp.e
                @Override // java.lang.Runnable
                public final void run() {
                    q.V(q.this, finalizingCover);
                }
            });
            return;
        }
        if (finalizingCover.getVisibility() == 0 || this.isFinalizingCoverAnimatingIn) {
            return;
        }
        this.isFinalizingCoverAnimatingIn = true;
        this.isFinalizingCoverAnimatingOut = false;
        finalizingCover.setVisibility(0);
        finalizingCover.setAlpha(0.0f);
        finalizingCover.animate().cancel();
        finalizingCover.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: xp.d
            @Override // java.lang.Runnable
            public final void run() {
                q.U(q.this);
            }
        });
    }

    public final void W(String messageBody) {
        yp.c cVar = this.binding;
        if (messageBody == null || StringsKt.p0(messageBody)) {
            if (cVar.f36884m.getAlpha() == 0.0f || this.isHintBodyAnimatingOut) {
                return;
            }
            this.isHintBodyAnimatingIn = false;
            this.isHintBodyAnimatingOut = true;
            cVar.f36884m.animate().cancel();
            cVar.f36884m.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: xp.b
                @Override // java.lang.Runnable
                public final void run() {
                    q.X(q.this);
                }
            });
            return;
        }
        cVar.f36884m.setText(messageBody);
        if (cVar.f36884m.getAlpha() == 1.0f || this.isHintBodyAnimatingIn) {
            return;
        }
        this.isHintBodyAnimatingIn = true;
        this.isHintBodyAnimatingOut = false;
        cVar.f36884m.animate().cancel();
        cVar.f36884m.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: xp.c
            @Override // java.lang.Runnable
            public final void run() {
                q.Y(q.this);
            }
        });
    }

    public final void Z(String messageTitle) {
        yp.c cVar = this.binding;
        if (messageTitle == null || StringsKt.p0(messageTitle)) {
            if (cVar.f36885n.getAlpha() == 0.0f || this.isHintTitleAnimatingOut) {
                return;
            }
            this.isHintTitleAnimatingIn = false;
            this.isHintTitleAnimatingOut = true;
            cVar.f36885n.animate().cancel();
            cVar.f36885n.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: xp.f
                @Override // java.lang.Runnable
                public final void run() {
                    q.a0(q.this);
                }
            });
            return;
        }
        cVar.f36885n.setText(messageTitle);
        if (cVar.f36885n.getAlpha() == 1.0f || this.isHintTitleAnimatingIn) {
            return;
        }
        this.isHintTitleAnimatingIn = true;
        this.isHintTitleAnimatingOut = false;
        cVar.f36885n.animate().cancel();
        cVar.f36885n.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: xp.g
            @Override // java.lang.Runnable
            public final void run() {
                q.b0(q.this);
            }
        });
    }

    @Override // xp.r0
    public void a() {
        Space topSpace = this.binding.F;
        Intrinsics.checkNotNullExpressionValue(topSpace, "topSpace");
        uq.g.g(topSpace, new Function1() { // from class: xp.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit N;
                N = q.N(q.this, (WindowInsetsCompat) obj);
                return N;
            }
        });
        Space bottomSpace = this.binding.f36875d;
        Intrinsics.checkNotNullExpressionValue(bottomSpace, "bottomSpace");
        uq.g.g(bottomSpace, new Function1() { // from class: xp.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit O;
                O = q.O(q.this, (WindowInsetsCompat) obj);
                return O;
            }
        });
        ju.k.d(this.lifecycleScope, null, null, new a(null), 3, null);
    }

    @Override // xp.r0
    public void c() {
        this.binding.f36896y.setVisibility(0);
    }

    public final void c0(TextView textView, String str, int i10) {
        if (str == null || StringsKt.p0(str)) {
            textView.setVisibility(i10);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    @Override // xp.r0
    public void d(@Nullable final String nextHintMessage, @Nullable final String nextHintDescription, @NotNull final Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        final yp.c cVar = this.binding;
        ConstraintLayout root = cVar.getRoot();
        root.setHapticFeedbackEnabled(true);
        root.performHapticFeedback(this.confirmHapticFeedbackConst, 2);
        cVar.f36897z.setIntensity(1.0f);
        this.isPlayingSuccessAnimation = true;
        View cover = cVar.f36881j;
        Intrinsics.checkNotNullExpressionValue(cover, "cover");
        v.g(cover, new Function0() { // from class: xp.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit P;
                P = q.P(yp.c.this);
                return P;
            }
        }, new Function0() { // from class: xp.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit Q;
                Q = q.Q(q.this, nextHintMessage, nextHintDescription, onComplete);
                return Q;
            }
        });
        TextView captureSuccess = cVar.f36879h;
        Intrinsics.checkNotNullExpressionValue(captureSuccess, "captureSuccess");
        v.g(captureSuccess, new Function0() { // from class: xp.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit R;
                R = q.R();
                return R;
            }
        }, new Function0() { // from class: xp.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit S;
                S = q.S();
                return S;
            }
        });
    }

    @Override // xp.r0
    public void e(int countdownNumber) {
        yp.c cVar = this.binding;
        if (Intrinsics.c(cVar.f36880i.getTag(), Integer.valueOf(countdownNumber))) {
            return;
        }
        TextView countdown = cVar.f36880i;
        Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
        v.e(countdown);
        cVar.f36880i.setText(String.valueOf(countdownNumber));
        cVar.f36880i.setTag(Integer.valueOf(countdownNumber));
    }

    public final void e0(String hintMessage, String hintDescription) {
        if (this.isPlayingSuccessAnimation) {
            Z(null);
            W(null);
        } else {
            Z(hintMessage);
            W(hintDescription);
        }
    }

    @Override // xp.r0
    public void f(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // xp.r0
    public void g(@Nullable tq.a systemUiController, @Nullable String titleText, @Nullable String autoCaptureText, @Nullable String realTimeHintText, @Nullable String hintMessage, @Nullable String hintDescription, @Nullable String captureSuccessText, @Nullable String disclaimerText, @Nullable String hintAutoCaptureTimeoutText, @Nullable String hintVerifyingText, boolean isAutoCaptureOn, boolean isFlashEnabled, boolean mirrorPreview, boolean isInitializing, boolean showCameraCover, boolean isFinalizing, @Nullable String nextCameraContentDescription, boolean isNextCameraButtonVisible, boolean isNextCameraButtonEnabled, boolean isToggleFlashButtonVisible, boolean isToggleFlashButtonEnabled, boolean isCaptureButtonVisible, boolean isCaptureButtonEnabled, boolean isCountingDown, boolean isCapturing, @NotNull NavigationState navigationState, @Nullable String navBarTitle, @Nullable TextBasedComponentStyle navBarTitleStyle, @NotNull SelfieOverlayView.e overlayState, float poseScore, @Nullable SelfieBrightnessInfo brightnessInfo, @Nullable String watermarkText, @Nullable StepStyles.SelfieStepStyle styles, @NotNull final Function0<Unit> onNextCameraClick, @NotNull final Function0<Unit> onToggleFlashClick, @NotNull Function0<Unit> onBackClick, @NotNull Function0<Unit> onCancelClick, @Nullable final Function0<Unit> onCaptureClick) {
        int i10;
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(overlayState, "overlayState");
        Intrinsics.checkNotNullParameter(onNextCameraClick, "onNextCameraClick");
        Intrinsics.checkNotNullParameter(onToggleFlashClick, "onToggleFlashClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        final yp.c cVar = this.binding;
        TextView title = cVar.C;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        d0(this, title, titleText, 0, 2, null);
        TextView autoCaptureDisclaimer = cVar.b;
        Intrinsics.checkNotNullExpressionValue(autoCaptureDisclaimer, "autoCaptureDisclaimer");
        c0(autoCaptureDisclaimer, autoCaptureText, 4);
        TextView selfieCaptureDisclaimer = cVar.f36895x;
        Intrinsics.checkNotNullExpressionValue(selfieCaptureDisclaimer, "selfieCaptureDisclaimer");
        d0(this, selfieCaptureDisclaimer, disclaimerText, 0, 2, null);
        this.realTimeHintFlow.setValue(realTimeHintText);
        e0(hintMessage, hintDescription);
        if (isAutoCaptureOn) {
            cVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(wp.q.b, 0, 0, 0);
            cVar.f36874c.setVisibility(0);
        } else {
            cVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(wp.q.f34650a, 0, 0, 0);
            cVar.f36874c.setVisibility(8);
        }
        if (captureSuccessText == null || StringsKt.p0(captureSuccessText)) {
            cVar.f36879h.setCompoundDrawablePadding(0);
            cVar.f36879h.setText((CharSequence) null);
        } else {
            cVar.f36879h.setCompoundDrawablePadding((int) hq.j.a(16.0d));
            cVar.f36879h.setText(captureSuccessText);
        }
        if (this.isFlashEnabled != isFlashEnabled || cVar.E.getContentDescription() == null) {
            this.isFlashEnabled = isFlashEnabled;
            if (isFlashEnabled) {
                cVar.E.setImageResource(tp.d.b);
                cVar.E.setContentDescription(cVar.getRoot().getContext().getString(tp.g.X));
            } else {
                cVar.E.setImageResource(tp.d.f32366a);
                cVar.E.setContentDescription(cVar.getRoot().getContext().getString(tp.g.Y));
            }
        }
        if (nextCameraContentDescription != null) {
            cVar.f36888q.setContentDescription(nextCameraContentDescription);
        }
        cVar.f36888q.setOnClickListener(new View.OnClickListener() { // from class: xp.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.I(Function0.this, view);
            }
        });
        cVar.E.setOnClickListener(new View.OnClickListener() { // from class: xp.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.J(Function0.this, view);
            }
        });
        cVar.f36897z.setIsPreviewMirrored(mirrorPreview);
        cVar.f36897z.setCameraStreamBrightnessInfo(brightnessInfo);
        if (!this.isPlayingSuccessAnimation) {
            cVar.f36897z.setIntensity(poseScore);
        }
        SelfieOverlayView.E(cVar.f36897z, overlayState, false, 2, null);
        if (isInitializing) {
            cVar.f36886o.setVisibility(0);
        } else {
            cVar.f36886o.setVisibility(8);
        }
        Pi2NavigationBar navigationBar = cVar.f36887p;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = cVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        gr.c.e(navigationState, onBackClick, onCancelClick, null, navigationBar, root, styles != null ? cr.h.h(styles) : null, navBarTitle, navBarTitleStyle, 8, null);
        if (showCameraCover) {
            cVar.f36878g.setVisibility(0);
            cVar.f36878g.setAlpha(1.0f);
        } else if (!this.isCameraCoverAnimatingOut) {
            this.isCameraCoverAnimatingOut = true;
            cVar.f36878g.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: xp.o
                @Override // java.lang.Runnable
                public final void run() {
                    q.K(q.this, cVar);
                }
            });
        }
        T(isFinalizing);
        if (isNextCameraButtonVisible) {
            i10 = 0;
            cVar.f36888q.setVisibility(0);
        } else {
            i10 = 0;
            cVar.f36888q.setVisibility(4);
        }
        if (isToggleFlashButtonVisible) {
            cVar.E.setVisibility(i10);
        } else {
            cVar.E.setVisibility(4);
        }
        if (isCaptureButtonVisible) {
            cVar.f36876e.setVisibility(i10);
        } else {
            cVar.f36876e.setVisibility(4);
        }
        cVar.f36888q.setEnabled(isNextCameraButtonEnabled);
        cVar.E.setEnabled(isToggleFlashButtonEnabled);
        cVar.f36876e.setEnabled(isCaptureButtonEnabled);
        if (onCaptureClick != null) {
            cVar.f36876e.setOnClickListener(new View.OnClickListener() { // from class: xp.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q.L(yp.c.this, onCaptureClick, view);
                }
            });
        }
        if (watermarkText == null || StringsKt.p0(watermarkText)) {
            cVar.G.setVisibility(8);
        } else {
            cVar.G.setText(watermarkText);
            cVar.G.setVisibility(0);
        }
    }

    @Override // xp.r0
    @NotNull
    public View getRoot() {
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // xp.r0
    public void h(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // xp.r0
    @NotNull
    public Camera2PreviewView i() {
        Camera2PreviewView camera2Preview = this.binding.f36877f;
        Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
        return camera2Preview;
    }

    @Override // xp.r0
    @NotNull
    public PreviewView j() {
        PreviewView previewviewSelfieCamera = this.binding.f36891t;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        return previewviewSelfieCamera;
    }

    @Override // xp.r0
    public void k(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // xp.r0
    public void l() {
        this.binding.f36896y.setVisibility(8);
    }

    @Override // xp.r0
    public void m(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }

    @Override // xp.r0
    public void n(@NotNull StepStyles.SelfieStepStyle styles, @Nullable tq.a systemUiController) {
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        StyleElements.SimpleElementColor base3;
        StyleElements.SimpleElementColorValue base4;
        Integer value;
        Intrinsics.checkNotNullParameter(styles, "styles");
        yp.c cVar = this.binding;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView hintMessageTitle = cVar.f36885n;
            Intrinsics.checkNotNullExpressionValue(hintMessageTitle, "hintMessageTitle");
            hr.h0.k(hintMessageTitle, titleStyleValue, kotlin.collections.p0.c(hr.e0.f19692c));
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView hintMessageBody = cVar.f36884m;
            Intrinsics.checkNotNullExpressionValue(hintMessageBody, "hintMessageBody");
            hr.h0.k(hintMessageBody, textStyleValue, kotlin.collections.p0.c(hr.e0.f19692c));
            Integer textColorValue = textStyleValue.getTextColorValue();
            if (textColorValue != null) {
                int intValue = textColorValue.intValue();
                cVar.E.setImageTintList(ColorStateList.valueOf(intValue));
                cVar.f36888q.setImageTintList(ColorStateList.valueOf(intValue));
            }
        }
        TextBasedComponentStyle selfieSmallText = styles.getSelfieSmallText();
        if (selfieSmallText != null) {
            TextView autoCaptureDisclaimer = cVar.b;
            Intrinsics.checkNotNullExpressionValue(autoCaptureDisclaimer, "autoCaptureDisclaimer");
            hr.h0.k(autoCaptureDisclaimer, selfieSmallText, kotlin.collections.p0.c(hr.e0.f19692c));
            AttributeStyles.TextBasedTextColorStyle textColor = selfieSmallText.getTextColor();
            if (textColor != null && (base3 = textColor.getBase()) != null && (base4 = base3.getBase()) != null && (value = base4.getValue()) != null) {
                cVar.b.setCompoundDrawableTintList(ColorStateList.valueOf(value.intValue()));
            }
        }
        TextBasedComponentStyle selfieCaptureDisclaimerTextStyle = styles.getSelfieCaptureDisclaimerTextStyle();
        if (selfieCaptureDisclaimerTextStyle != null) {
            TextView selfieCaptureDisclaimer = cVar.f36895x;
            Intrinsics.checkNotNullExpressionValue(selfieCaptureDisclaimer, "selfieCaptureDisclaimer");
            hr.h0.l(selfieCaptureDisclaimer, selfieCaptureDisclaimerTextStyle, null, 2, null);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int intValue2 = backgroundColorValue.intValue();
            cVar.A.setBackgroundColor(intValue2);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.a(context, intValue2);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable a10 = jr.d.a(styles, context2);
        if (a10 != null) {
            cVar.A.setBackground(a10);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f36887p.setControlsColor(headerButtonColorValue.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.B.setGuidelineBegin((int) hq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f36882k.setGuidelineEnd((int) hq.j.a(dp2.doubleValue()));
    }

    @Override // xp.r0
    @NotNull
    public s0 o(boolean strictSelfie) {
        return new s0(strictSelfie ? 0.45d : 0.35d, 0.8d);
    }

    @Override // xp.r0
    public void p(@NotNull Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        onComplete.invoke();
    }
}
