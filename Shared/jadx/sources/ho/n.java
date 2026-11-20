package ho;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wm.k;
import wm.r;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00152&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lho/n;", "", "Lsq/a;", "navigationStateManager", "<init>", "(Lsq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "context", "Lso/l;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "n", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lwm/k$a;Lso/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", zl.t.f38095d, "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lwm/k$a;Lso/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", ve.a.f33391e, "Lsq/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19514a;

        static {
            int[] iArr = new int[go.b.values().length];
            try {
                iArr[go.b.f18568a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[go.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19514a = iArr;
        }
    }

    public n(@NotNull sq.a navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit A(k.a aVar) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: ho.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B;
                B = n.B((r.c) obj);
                return B;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit B(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit o(k.a aVar) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: ho.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit p8;
                p8 = n.p((r.c) obj);
                return p8;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit p(r.c action) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.AutoClassificationError autoClassificationError = c10 instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) c10 : null;
        if (autoClassificationError == null) {
            return Unit.f22894a;
        }
        if (autoClassificationError.L().size() == 1) {
            IdConfigForCountry idConfigForCountry = (IdConfigForCountry) CollectionsKt.d0(autoClassificationError.L());
            String idClassKey = idConfigForCountry.g().size() == 1 ? ((IdConfig) CollectionsKt.d0(idConfigForCountry.g())).getIdClassKey() : null;
            str = idConfigForCountry.getCountryCode();
            str2 = idClassKey;
        } else {
            str = null;
            str2 = null;
        }
        action.e(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.E(), autoClassificationError.D(), autoClassificationError.getPartIndex(), com.withpersona.sdk2.inquiry.governmentid.n.x(action, true), autoClassificationError.getCountryCode(), autoClassificationError.I(), new CameraProperties(null, null, null, 0, 0, 31, null), autoClassificationError.L(), str, str2));
        return Unit.f22894a;
    }

    public static final Unit q(k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22894a;
    }

    public static final Unit r(k.a aVar) {
        wm.r c10;
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: ho.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit s8;
                s8 = n.s((r.c) obj);
                return s8;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit s(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit u(k.a aVar, final Option it) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: ho.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit v5;
                v5 = n.v(Option.this, (r.c) obj);
                return v5;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit v(Option option, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = c10 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) c10 : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22894a;
        }
        action.e(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, option.getValue(), null, 1535, null));
        return Unit.f22894a;
    }

    public static final Unit w(k.a aVar, final Option it) {
        wm.r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        wm.h d10 = aVar.d();
        c10 = wm.b0.c(null, new Function1() { // from class: ho.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit x10;
                x10 = n.x(Option.this, (r.c) obj);
                return x10;
            }
        }, 1, null);
        d10.a(c10);
        return Unit.f22894a;
    }

    public static final Unit x(Option option, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object c10 = action.c();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = c10 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) c10 : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22894a;
        }
        action.e(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, option.getValue(), 1023, null));
        return Unit.f22894a;
    }

    public static final Unit y(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, k.a aVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        if (idConfig == null) {
            return Unit.f22894a;
        }
        com.withpersona.sdk2.inquiry.governmentid.n.W(autoClassificationManualSelect, aVar, input, null, idConfig, lVar, autoClassificationManualSelect.getCameraProperties(), (r26 & 128) != 0, (r26 & 256) != 0 ? autoClassificationManualSelect.D() : idConfig.f(), (r26 & 512) != 0 ? autoClassificationManualSelect.getPartIndex() : -1, (r26 & 1024) != 0 ? null : null, (r26 & 2048) != 0 ? autoClassificationManualSelect.getCountryCode() : autoClassificationManualSelect.getSelectedCountryCode());
        return Unit.f22894a;
    }

    public static final Unit z(k.a aVar, so.l lVar) {
        com.withpersona.sdk2.inquiry.governmentid.n.S(aVar, lVar);
        return Unit.f22894a;
    }

    @NotNull
    public final Screen.d n(@NotNull GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.AutoClassificationError renderState, @NotNull final wm.k<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.a, ? extends Object>.a context, @NotNull final so.l videoCaptureHelper) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        go.b errorType = renderState.getErrorType();
        int[] iArr = a.f19514a;
        int i10 = iArr[errorType.ordinal()];
        if (i10 == 1) {
            idClassRejectedTitle = renderProps.getStrings().getIdClassRejectedTitle();
        } else {
            if (i10 != 2) {
                throw new gt.l();
            }
            idClassRejectedTitle = renderProps.getStrings().getUnableToClassifyDocumentTitle();
        }
        int i11 = iArr[renderState.getErrorType().ordinal()];
        if (i11 == 1) {
            idClassRejectedContinueButtonText = renderProps.getStrings().getIdClassRejectedContinueButtonText();
        } else {
            if (i11 != 2) {
                throw new gt.l();
            }
            idClassRejectedContinueButtonText = renderProps.getStrings().getUnableToClassifyDocumentContinueButtonText();
        }
        String str = idClassRejectedContinueButtonText;
        StepStyles.GovernmentIdStepStyle styles = renderProps.getStyles();
        NavigationState b = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: ho.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit o8;
                o8 = n.o(k.a.this);
                return o8;
            }
        };
        Function0 function02 = new Function0() { // from class: ho.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit q10;
                q10 = n.q(k.a.this, videoCaptureHelper);
                return q10;
            }
        };
        Function0 function03 = new Function0() { // from class: ho.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit r8;
                r8 = n.r(k.a.this);
                return r8;
            }
        };
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.d(idClassRejectedTitle, str, styles, b, function0, function02, function03, false, autoClassificationPageNavBarTitle, null, 640, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0087, code lost:
    
        r11 = ho.o.b(r11, r28.getSelectedCountryCode(), r9.getIdClassKey(), "selectPage");
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withpersona.sdk2.inquiry.governmentid.Screen t(@org.jetbrains.annotations.NotNull final com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input r27, @org.jetbrains.annotations.NotNull final com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.AutoClassificationManualSelect r28, @org.jetbrains.annotations.NotNull final wm.k<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState, ? extends com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.a, ? extends java.lang.Object>.a r29, @org.jetbrains.annotations.NotNull final so.l r30) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ho.n.t(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$AutoClassificationManualSelect, wm.k$a, so.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }
}
