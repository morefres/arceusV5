package po;

import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfigForCountry;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017JQ\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lpo/i;", "", "Lsq/a;", "navigationStateManager", "<init>", "(Lsq/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "renderState", "Ltr/f;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "workflowContext", "Lso/l;", "videoCaptureHelper", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "", "onOutput", "Luq/l;", "transition", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "i", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Ltr/f;Lso/l;Lkotlin/jvm/functions/Function1;Luq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "m", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Ltr/f;Lso/l;Lkotlin/jvm/functions/Function1;Luq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", ve.a.f33391e, "Lsq/a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sq.a navigationStateManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28755a;

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
            f28755a = iArr;
        }
    }

    public i(@NotNull sq.a navigationStateManager) {
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.navigationStateManager = navigationStateManager;
    }

    public static final Unit j(tr.f fVar) {
        String str;
        String str2;
        WorkflowState i10 = fVar.i();
        GovernmentIdState.AutoClassificationError autoClassificationError = i10 instanceof GovernmentIdState.AutoClassificationError ? (GovernmentIdState.AutoClassificationError) i10 : null;
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
        fVar.p(new GovernmentIdState.AutoClassificationManualSelect(autoClassificationError.getCurrentPart(), autoClassificationError.E(), autoClassificationError.D(), autoClassificationError.getPartIndex(), oo.e.e(fVar, true), autoClassificationError.getCountryCode(), autoClassificationError.I(), new CameraProperties(null, null, null, 0, 0, 31, null), autoClassificationError.L(), str, str2));
        return Unit.f22894a;
    }

    public static final Unit k(tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar, Function1 function1) {
        oo.e.p(fVar, input, lVar, function1);
        return Unit.f22894a;
    }

    public static final Unit l(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit n(tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar, Function1 function1) {
        oo.e.p(fVar, input, lVar, function1);
        return Unit.f22894a;
    }

    public static final Unit o(Function1 function1) {
        function1.invoke(GovernmentIdWorkflow.a.b.f10714a);
        return Unit.f22894a;
    }

    public static final Unit p(tr.f fVar, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState i10 = fVar.i();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = i10 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) i10 : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22894a;
        }
        fVar.p(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, it.getValue(), null, 1535, null));
        return Unit.f22894a;
    }

    public static final Unit q(tr.f fVar, Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WorkflowState i10 = fVar.i();
        GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect = i10 instanceof GovernmentIdState.AutoClassificationManualSelect ? (GovernmentIdState.AutoClassificationManualSelect) i10 : null;
        if (autoClassificationManualSelect == null) {
            return Unit.f22894a;
        }
        fVar.p(GovernmentIdState.AutoClassificationManualSelect.J(autoClassificationManualSelect, null, null, null, 0, null, null, null, null, null, null, it.getValue(), 1023, null));
        return Unit.f22894a;
    }

    public static final Unit r(IdConfig idConfig, GovernmentIdState.AutoClassificationManualSelect autoClassificationManualSelect, tr.f fVar, GovernmentIdWorkflow.Input input, so.l lVar) {
        if (idConfig == null) {
            return Unit.f22894a;
        }
        oo.e.s(autoClassificationManualSelect, fVar, input, null, idConfig, lVar, autoClassificationManualSelect.getCameraProperties(), false, idConfig.f(), -1, null, autoClassificationManualSelect.getSelectedCountryCode(), 1152, null);
        return Unit.f22894a;
    }

    @NotNull
    public final Screen.d i(@NotNull final GovernmentIdWorkflow.Input renderProps, @NotNull GovernmentIdState.AutoClassificationError renderState, @NotNull final tr.f<GovernmentIdState> workflowContext, @NotNull final so.l videoCaptureHelper, @NotNull final Function1<? super GovernmentIdWorkflow.a, Unit> onOutput, @NotNull uq.l transition) {
        String idClassRejectedTitle;
        String idClassRejectedContinueButtonText;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(workflowContext, "workflowContext");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(onOutput, "onOutput");
        Intrinsics.checkNotNullParameter(transition, "transition");
        go.b errorType = renderState.getErrorType();
        int[] iArr = a.f28755a;
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
        Function0 function0 = new Function0() { // from class: po.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit j10;
                j10 = i.j(tr.f.this);
                return j10;
            }
        };
        Function0 function02 = new Function0() { // from class: po.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit k10;
                k10 = i.k(tr.f.this, renderProps, videoCaptureHelper, onOutput);
                return k10;
            }
        };
        Function0 function03 = new Function0() { // from class: po.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l10;
                l10 = i.l(Function1.this);
                return l10;
            }
        };
        boolean c10 = videoCaptureHelper.c(renderProps);
        String autoClassificationPageNavBarTitle = renderProps.getStrings().getAutoClassificationPageNavBarTitle();
        if (autoClassificationPageNavBarTitle == null) {
            autoClassificationPageNavBarTitle = renderProps.getStrings().getCapturePageNavBarTitle();
        }
        return new Screen.d(idClassRejectedTitle, str, styles, b, function0, function02, function03, c10, autoClassificationPageNavBarTitle, transition);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0095, code lost:
    
        r12 = po.j.b(r12, r27.getSelectedCountryCode(), r10.getIdClassKey(), "selectPage");
     */
    /* JADX WARN: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withpersona.sdk2.inquiry.governmentid.Screen m(@org.jetbrains.annotations.NotNull final com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.Input r26, @org.jetbrains.annotations.NotNull final com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.AutoClassificationManualSelect r27, @org.jetbrains.annotations.NotNull final tr.f<com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState> r28, @org.jetbrains.annotations.NotNull final so.l r29, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow.a, kotlin.Unit> r30, @org.jetbrains.annotations.NotNull uq.l r31) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.i.m(com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow$Input, com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState$AutoClassificationManualSelect, tr.f, so.l, kotlin.jvm.functions.Function1, uq.l):com.withpersona.sdk2.inquiry.governmentid.Screen");
    }
}
