package pr;

import android.content.Context;
import android.graphics.Bitmap;
import ar.m4;
import ar.n4;
import ar.o4;
import ar.s4;
import ar.w3;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.PhoneNumberSna;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig;
import com.withpersona.sdk2.inquiry.sna.SilentNetworkAuthConfig;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.ui.UiComponentErrorInfo;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.h;
import com.withpersona.sdk2.inquiry.ui.network.b;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or.a;
import org.jetbrains.annotations.NotNull;
import tr.FlowWorkflowWorker;
import xq.a;
import xq.c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJG\u0010)\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lpr/e0;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lor/a$a;", "addressDetailsWorker", "Lxq/a$a;", "silentNetworkAuthWorker", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lor/a$a;Lxq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V", "", "isFieldBlank", "", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "", "subComponentName", "F", "(ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", "name", "E", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "Ltr/f;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "context", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "", "setOutput", "H", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Ltr/f;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lkotlin/jvm/functions/Function1;)V", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lor/a$a;", rl.d.f30696a, "Lxq/a$a;", "e", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b.a addressAutocompleteWorker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.C0492a addressDetailsWorker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a.C0662a silentNetworkAuthWorker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h.a fileSelectWorkerFactory;

    public e0(@NotNull Context applicationContext, @NotNull b.a addressAutocompleteWorker, @NotNull a.C0492a addressDetailsWorker, @NotNull a.C0662a silentNetworkAuthWorker, @NotNull h.a fileSelectWorkerFactory) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(addressAutocompleteWorker, "addressAutocompleteWorker");
        Intrinsics.checkNotNullParameter(addressDetailsWorker, "addressDetailsWorker");
        Intrinsics.checkNotNullParameter(silentNetworkAuthWorker, "silentNetworkAuthWorker");
        Intrinsics.checkNotNullParameter(fileSelectWorkerFactory, "fileSelectWorkerFactory");
        this.applicationContext = applicationContext;
        this.addressAutocompleteWorker = addressAutocompleteWorker;
        this.addressDetailsWorker = addressDetailsWorker;
        this.silentNetworkAuthWorker = silentNetworkAuthWorker;
        this.fileSelectWorkerFactory = fileSelectWorkerFactory;
    }

    public static /* synthetic */ List G(e0 e0Var, boolean z10, List list, UiComponent uiComponent, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return e0Var.F(z10, list, uiComponent, str);
    }

    public static final Unit I(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((o4) uiComponent).a(newText)), null, G(e0Var, newText.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit J(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputPhoneNumberComponent) uiComponent).u((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit K(tr.f fVar, UiComponent uiComponent, Object obj) {
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        UiComponent g10 = com.withpersona.sdk2.inquiry.steps.ui.components.b.g(displaying.getComponents(), ((InputAddressComponent) uiComponent).getName());
        InputAddressComponent inputAddressComponent = g10 instanceof InputAddressComponent ? (InputAddressComponent) g10 : null;
        if (inputAddressComponent == null) {
            return Unit.f22894a;
        }
        if (obj instanceof b.AbstractC0262b.C0263b) {
            fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), inputAddressComponent, inputAddressComponent.U(((b.AbstractC0262b.C0263b) obj).a()).T(null).V(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        }
        return Unit.f22894a;
    }

    public static final Unit L(tr.f fVar, UiComponent uiComponent, Function1 function1, a.b response) {
        Intrinsics.checkNotNullParameter(response, "response");
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        UiComponent g10 = com.withpersona.sdk2.inquiry.steps.ui.components.b.g(displaying.getComponents(), ((InputAddressComponent) uiComponent).getName());
        InputAddressComponent inputAddressComponent = g10 instanceof InputAddressComponent ? (InputAddressComponent) g10 : null;
        if (inputAddressComponent == null) {
            return Unit.f22894a;
        }
        if (response instanceof a.b.C0494b) {
            Boolean bool = Boolean.FALSE;
            a.b.C0494b c0494b = (a.b.C0494b) response;
            InputAddressComponent q10 = inputAddressComponent.o(bool).q(c0494b.getResult().getAddressStreet1());
            String addressStreet2 = c0494b.getResult().getAddressStreet2();
            if (addressStreet2 == null) {
                addressStreet2 = "";
            }
            InputAddressComponent S = q10.j(addressStreet2).k(c0494b.getResult().getAddressCity()).s(c0494b.getResult().getAddressSubdivision()).p(c0494b.getResult().getAddressPostalCode()).T(null).V(null).S(bool);
            fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), inputAddressComponent, S), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
            S.getTextControllerForAddressStreet1().c(S.getStreet1());
            S.getTextControllerForAddressStreet2().c(S.getStreet2());
            S.getTextControllerForAddressCity().c(S.getCity());
            S.getTextControllerForAddressSubdivision().c(S.getSubdivision());
            S.getTextControllerForAddressPostalCode().c(S.getPostalCode());
        } else {
            if (!(response instanceof a.b.C0493a)) {
                throw new gt.l();
            }
            function1.invoke(new UiWorkflow.b.d("Couldn't load address.", ((a.b.C0493a) response).getCause()));
        }
        return Unit.f22894a;
    }

    public static final Unit M(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, boolean z10) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((m4) uiComponent).a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit N(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List selectedOptions) {
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((w3) uiComponent).k(selectedOptions)), null, G(e0Var, selectedOptions.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit O(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, Number number) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((n4) uiComponent).a(number)), null, G(e0Var, number == null, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit P(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.c) uiComponent).f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit Q(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String str) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.l) uiComponent).a(str)), null, G(e0Var, str == null || str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit R(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).q(newValue)), null, e0Var.F(newValue.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit S(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).s(newValue)), null, e0Var.F(newValue.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit T(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String str) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).r(str)), null, e0Var.F(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit U(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String str) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).t(str)), null, e0Var.F(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit V(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit W(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).A((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit X(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, List newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).C((Option) CollectionsKt.firstOrNull(newText))), null, G(e0Var, newText.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit Y(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, Set stringSet) {
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((s4) uiComponent).a(stringSet)), null, G(e0Var, stringSet.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit Z(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).D(newText)), null, G(e0Var, newText.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit a0(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((JpMyNumberNfcScanComponent) uiComponent).m(jpMyNumberNfcScanResult)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit b0(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((MdocComponent) uiComponent).p(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit c0(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        MdocComponent mdocComponent = (MdocComponent) uiComponent;
        fVar.p(com.withpersona.sdk2.inquiry.ui.b.b(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, mdocComponent.q(newValue)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f22894a;
    }

    public static final Unit d0(UiComponent uiComponent, tr.f fVar, UiState.Displaying displaying, Object obj) {
        PhoneNumberSnaComponent m10;
        if (obj instanceof c.b.C0664b) {
            m10 = ((PhoneNumberSnaComponent) uiComponent).m(((c.b.C0664b) obj).a(), null, null);
        } else {
            if (!(obj instanceof c.b.Error)) {
                return Unit.f22894a;
            }
            c.b.Error error = (c.b.Error) obj;
            m10 = ((PhoneNumberSnaComponent) uiComponent).m(null, error.getErrorName(), error.getErrorMessage());
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, m10), null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(m10, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f22894a;
    }

    public static final Unit e0(tr.f fVar, UiState.Displaying displaying, UiComponent uiComponent, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.p(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) uiComponent).getName(), displaying.getFilePickRequestId() + 1, 65535, null));
        return Unit.f22894a;
    }

    public static final Unit f0(UiComponent uiComponent, tr.f fVar, UiState.Displaying displaying, h.b output) {
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof h.b.Success) {
            fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputFileUploadComponent) uiComponent).m(((h.b.Success) output).a())), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        } else {
            if (!(output instanceof h.b.a) && !(output instanceof h.b.C0260b)) {
                throw new gt.l();
            }
            fVar.p(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        }
        return Unit.f22894a;
    }

    public static final Unit g0(tr.f fVar, UiComponent uiComponent, boolean z10) {
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final Unit h0(tr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).q(newText).T(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit i0(tr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).j(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit j0(tr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).k(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit k0(tr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).s(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit l0(tr.f fVar, UiComponent uiComponent, e0 e0Var, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        WorkflowState i10 = fVar.i();
        UiState.Displaying displaying = i10 instanceof UiState.Displaying ? (UiState.Displaying) i10 : null;
        if (displaying == null) {
            return Unit.f22894a;
        }
        fVar.p(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).p(newText)), null, e0Var.F(newText.length() == 0, displaying.x(), uiComponent, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public final UiComponentConfig E(List<? extends UiComponentConfig> configs, String name) {
        UiComponentConfig E;
        if (configs == null) {
            return null;
        }
        for (UiComponentConfig uiComponentConfig : configs) {
            if (Intrinsics.c(uiComponentConfig.getName(), name)) {
                return uiComponentConfig;
            }
            if ((uiComponentConfig instanceof UiComponentContainerConfig) && (E = E(((UiComponentContainerConfig) uiComponentConfig).getChildren(), name)) != null) {
                return E;
            }
        }
        return null;
    }

    public final List<UiComponentErrorInfo> F(boolean isFieldBlank, List<UiComponentErrorInfo> componentErrors, UiComponent component, String subComponentName) {
        Object obj;
        List<UiComponentErrorInfo> list = componentErrors;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.c(((UiComponentErrorInfo) obj).getName(), component.getName())) {
                break;
            }
        }
        UiComponentErrorInfo uiComponentErrorInfo = (UiComponentErrorInfo) obj;
        if (isFieldBlank) {
            return componentErrors;
        }
        UiComponentError a10 = uiComponentErrorInfo != null ? uiComponentErrorInfo.a(component.getLastValueUpdateTs()) : null;
        if (a10 instanceof UiComponentError.UiGovernmentIdNfcScanComponentError) {
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) a10;
            Map<String, String> message = uiGovernmentIdNfcScanComponentError.getMessage();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : message.entrySet()) {
                if (!Intrinsics.c(entry.getKey(), subComponentName)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            uiGovernmentIdNfcScanComponentError.setMessage(linkedHashMap);
            return componentErrors;
        }
        if (!(a10 instanceof UiComponentError.UiInputAddressComponentError)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!Intrinsics.c(((UiComponentErrorInfo) obj2).getName(), component.getName())) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) a10;
        Map<String, String> message2 = uiInputAddressComponentError.getMessage();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry2 : message2.entrySet()) {
            if (!Intrinsics.c(entry2.getKey(), subComponentName)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        uiInputAddressComponentError.setMessage(linkedHashMap2);
        return componentErrors;
    }

    public final void H(@NotNull UiWorkflow.Input renderProps, @NotNull final UiState.Displaying renderState, @NotNull final tr.f<UiState> context, @NotNull final UiComponent component, @NotNull final Function1<? super UiWorkflow.b, Unit> setOutput) {
        String[] strArr;
        InputFileUpload.Attributes attributes;
        Integer fileUploadLimit;
        InputFileUpload.Attributes attributes2;
        List<String> allowedFileTypes;
        String str;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(setOutput, "setOutput");
        if (component instanceof o4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((o4) component).getTextController().a()), new Function1() { // from class: pr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit I;
                    I = e0.I(tr.f.this, renderState, component, this, (String) obj);
                    return I;
                }
            });
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                context.n(new FlowWorkflowWorker(inputPhoneNumberComponent.getName() + ":country", inputPhoneNumberComponent.getCountryCodeOptionsController().a()), new Function1() { // from class: pr.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit J;
                        J = e0.J(tr.f.this, renderState, component, this, (List) obj);
                        return J;
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof w3) {
            context.n(new FlowWorkflowWorker(component.getName(), ((w3) component).getSelectedOptionsController().a()), new Function1() { // from class: pr.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit N;
                    N = e0.N(tr.f.this, renderState, component, this, (List) obj);
                    return N;
                }
            });
            return;
        }
        if (component instanceof s4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((s4) component).getStringSetController().a()), new Function1() { // from class: pr.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Y;
                    Y = e0.Y(tr.f.this, renderState, component, this, (Set) obj);
                    return Y;
                }
            });
            return;
        }
        if (component instanceof ar.b) {
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateCollapsedState", ((ar.b) component).getIsAddressFieldCollapsed().a()), new Function1() { // from class: pr.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit g02;
                    g02 = e0.g0(tr.f.this, component, ((Boolean) obj).booleanValue());
                    return g02;
                }
            });
            ar.b bVar = (ar.b) component;
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet1", bVar.getTextControllerForAddressStreet1().a()), new Function1() { // from class: pr.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit h02;
                    h02 = e0.h0(tr.f.this, component, this, (String) obj);
                    return h02;
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressStreet2", bVar.getTextControllerForAddressStreet2().a()), new Function1() { // from class: pr.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit i02;
                    i02 = e0.i0(tr.f.this, component, this, (String) obj);
                    return i02;
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressCity", bVar.getTextControllerForAddressCity().a()), new Function1() { // from class: pr.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit j02;
                    j02 = e0.j0(tr.f.this, component, this, (String) obj);
                    return j02;
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressSubdivision", bVar.getTextControllerForAddressSubdivision().a()), new Function1() { // from class: pr.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit k02;
                    k02 = e0.k0(tr.f.this, component, this, (String) obj);
                    return k02;
                }
            });
            context.n(new FlowWorkflowWorker(component.getName() + "UpdateAddressPostalCode", bVar.getTextControllerForAddressPostalCode().a()), new Function1() { // from class: pr.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit l02;
                    l02 = e0.l0(tr.f.this, component, this, (String) obj);
                    return l02;
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == cr.b.f14158a) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        context.n(tr.g.a(this.addressAutocompleteWorker.a(renderProps.getSessionToken(), component, searchQuery), "autocomplete_" + inputAddressComponent.getName()), new Function1() { // from class: pr.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit K;
                                K = e0.K(tr.f.this, component, obj);
                                return K;
                            }
                        });
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        context.n(this.addressDetailsWorker.a(renderProps.getSessionToken(), selectedSearchResultId), new Function1() { // from class: pr.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit L;
                                L = e0.L(tr.f.this, component, setOutput, (a.b) obj);
                                return L;
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof m4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((m4) component).getTwoStateViewController().a()), new Function1() { // from class: pr.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit M;
                    M = e0.M(tr.f.this, renderState, component, ((Boolean) obj).booleanValue());
                    return M;
                }
            });
            return;
        }
        if (component instanceof n4) {
            context.n(new FlowWorkflowWorker(component.getName(), ((n4) component).getNumberController().a()), new Function1() { // from class: pr.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit O;
                    O = e0.O(tr.f.this, renderState, component, this, (Number) obj);
                    return O;
                }
            });
            return;
        }
        if (component instanceof ar.c) {
            context.n(new FlowWorkflowWorker(component.getName(), ((ar.c) component).getBitmapController().a()), new Function1() { // from class: pr.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit P;
                    P = e0.P(tr.f.this, renderState, component, (Bitmap) obj);
                    return P;
                }
            });
            return;
        }
        if (component instanceof ar.l) {
            context.n(new FlowWorkflowWorker(component.getName(), ((ar.l) component).getDateController().e()), new Function1() { // from class: pr.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Q;
                    Q = e0.Q(tr.f.this, renderState, component, this, (String) obj);
                    return Q;
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber", governmentIdNfcScanComponent.getCardAccessNumberController().a()), new Function1() { // from class: pr.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit R;
                    R = e0.R(tr.f.this, renderState, component, this, (String) obj);
                    return R;
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", governmentIdNfcScanComponent.getDocumentNumberController().a()), new Function1() { // from class: pr.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit S;
                    S = e0.S(tr.f.this, renderState, component, this, (String) obj);
                    return S;
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", governmentIdNfcScanComponent.getDateOfBirthController().e()), new Function1() { // from class: pr.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit T;
                    T = e0.T(tr.f.this, renderState, component, this, (String) obj);
                    return T;
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", governmentIdNfcScanComponent.getExpirationDateController().e()), new Function1() { // from class: pr.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit U;
                    U = e0.U(tr.f.this, renderState, component, this, (String) obj);
                    return U;
                }
            });
            context.n(new FlowWorkflowWorker(governmentIdNfcScanComponent.getName(), governmentIdNfcScanComponent.getNfcDataController().a()), new Function1() { // from class: pr.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit V;
                    V = e0.V(tr.f.this, renderState, component, (GovernmentIdNfcData) obj);
                    return V;
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":country", inputInternationalDbComponent.getCountryOptionsController().a()), new Function1() { // from class: pr.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit W;
                    W = e0.W(tr.f.this, renderState, component, this, (List) obj);
                    return W;
                }
            });
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idType", inputInternationalDbComponent.getIdTypeOptionsController().a()), new Function1() { // from class: pr.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit X;
                    X = e0.X(tr.f.this, renderState, component, this, (List) obj);
                    return X;
                }
            });
            context.n(new FlowWorkflowWorker(inputInternationalDbComponent.getName() + ":idValue", inputInternationalDbComponent.getIdValueController().a()), new Function1() { // from class: pr.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Z;
                    Z = e0.Z(tr.f.this, renderState, component, this, (String) obj);
                    return Z;
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            context.n(new FlowWorkflowWorker(jpMyNumberNfcScanComponent.getName() + ":scanResult", jpMyNumberNfcScanComponent.getScanResultController().a()), new Function1() { // from class: pr.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit a02;
                    a02 = e0.a0(tr.f.this, renderState, component, (JpMyNumberNfcScanResult) obj);
                    return a02;
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            context.n(new FlowWorkflowWorker(mdocComponent.getName() + ":error", mdocComponent.getErrorTextController().a()), new Function1() { // from class: pr.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit b02;
                    b02 = e0.b0(tr.f.this, renderState, component, (String) obj);
                    return b02;
                }
            });
            context.n(new FlowWorkflowWorker(mdocComponent.getName() + ":data", mdocComponent.getMdocDataController().a()), new Function1() { // from class: pr.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit c02;
                    c02 = e0.c0(tr.f.this, renderState, component, (String) obj);
                    return c02;
                }
            });
            return;
        }
        if (component instanceof PhoneNumberSnaComponent) {
            PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) component;
            PhoneNumberSna.Attributes attributes3 = phoneNumberSnaComponent.getConfig().getAttributes();
            if (attributes3 == null || (str = attributes3.getCheckUrl()) == null) {
                str = "";
            }
            context.n(tr.g.a(this.silentNetworkAuthWorker.a(this.applicationContext, new SilentNetworkAuthConfig(str, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), phoneNumberSnaComponent.getName()), new Function1() { // from class: pr.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit d02;
                    d02 = e0.d0(UiComponent.this, context, renderState, obj);
                    return d02;
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            context.n(new FlowWorkflowWorker(inputFileUploadComponent.getName() + "_pick_request", inputFileUploadComponent.getFileUploadController().a()), new Function1() { // from class: pr.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit e02;
                    e02 = e0.e0(tr.f.this, renderState, component, (Unit) obj);
                    return e02;
                }
            });
            if (Intrinsics.c(renderState.getFilePickComponentName(), inputFileUploadComponent.getName())) {
                UiComponentConfig E = E(renderProps.getComponents(), inputFileUploadComponent.getName());
                InputFileUpload inputFileUpload = E instanceof InputFileUpload ? (InputFileUpload) E : null;
                int i10 = 1;
                if (inputFileUpload == null || (attributes2 = inputFileUpload.getAttributes()) == null || (allowedFileTypes = attributes2.getAllowedFileTypes()) == null || (strArr = (String[]) allowedFileTypes.toArray(new String[0])) == null) {
                    strArr = new String[]{"*/*"};
                }
                if (inputFileUpload != null && (attributes = inputFileUpload.getAttributes()) != null && (fileUploadLimit = attributes.getFileUploadLimit()) != null) {
                    i10 = fileUploadLimit.intValue();
                }
                context.n(this.fileSelectWorkerFactory.b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, i10), new Function1() { // from class: pr.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit f02;
                        f02 = e0.f0(UiComponent.this, context, renderState, (h.b) obj);
                        return f02;
                    }
                });
            }
        }
    }
}
