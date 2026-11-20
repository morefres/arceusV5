package com.withpersona.sdk2.inquiry.ui;

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
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.h;
import com.withpersona.sdk2.inquiry.ui.network.b;
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
import kotlin.jvm.internal.d0;
import kotlin.reflect.KTypeProjection;
import or.a;
import org.jetbrains.annotations.NotNull;
import wm.TypedWorker;
import wm.b0;
import wm.o;
import wm.r;
import wm.w;
import xq.a;
import xq.c;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2&\u0010'\u001a\"0\"R\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00010$j\u0002`#2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "addressAutocompleteWorker", "Lor/a$a;", "addressDetailsWorker", "Lxq/a$a;", "silentNetworkAuthWorker", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "fileSelectWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/ui/network/b$a;Lor/a$a;Lxq/a$a;Lcom/withpersona/sdk2/inquiry/ui/h$a;)V", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "configs", "", "name", "k0", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "", "isFieldBlank", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "componentErrors", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "component", "subComponentName", "l0", "(ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/lang/String;)Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;", "renderProps", "Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;", "renderState", "Lwm/k$a;", "Lcom/withpersona/sdk2/inquiry/ui/RenderContext;", "Lwm/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiState;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$b;", "context", "", "n0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Lcom/withpersona/sdk2/inquiry/ui/UiState$Displaying;Lwm/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V", ve.a.f33391e, "Landroid/content/Context;", j6.b.f21518e, "Lcom/withpersona/sdk2/inquiry/ui/network/b$a;", "c", "Lor/a$a;", rl.d.f30696a, "Lxq/a$a;", "e", "Lcom/withpersona/sdk2/inquiry/ui/h$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

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

    public a(@NotNull Context applicationContext, @NotNull b.a addressAutocompleteWorker, @NotNull a.C0492a addressDetailsWorker, @NotNull a.C0662a silentNetworkAuthWorker, @NotNull h.a fileSelectWorkerFactory) {
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

    public static final r A0(final UiState.Displaying displaying, final UiComponent uiComponent, final b.AbstractC0262b response) {
        r c10;
        Intrinsics.checkNotNullParameter(response, "response");
        c10 = b0.c(null, new Function1() { // from class: mr.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit B0;
                B0 = com.withpersona.sdk2.inquiry.ui.a.B0(b.AbstractC0262b.this, displaying, uiComponent, (r.c) obj);
                return B0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit B0(b.AbstractC0262b abstractC0262b, UiState.Displaying displaying, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (abstractC0262b instanceof b.AbstractC0262b.C0263b) {
            action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputAddressComponent) uiComponent).U(((b.AbstractC0262b.C0263b) abstractC0262b).a()).T(null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        } else if (!(abstractC0262b instanceof b.AbstractC0262b.a)) {
            throw new gt.l();
        }
        return Unit.f22894a;
    }

    public static final r C0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit D0;
                D0 = com.withpersona.sdk2.inquiry.ui.a.D0(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return D0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit D0(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputPhoneNumberComponent) uiComponent).u((Option) CollectionsKt.firstOrNull(list))), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r E0(final UiComponent uiComponent, final UiState.Displaying displaying, final a.b response) {
        r c10;
        r c11;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response instanceof a.b.C0494b) {
            c11 = b0.c(null, new Function1() { // from class: mr.o0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit F0;
                    F0 = com.withpersona.sdk2.inquiry.ui.a.F0(UiComponent.this, response, displaying, (r.c) obj);
                    return F0;
                }
            }, 1, null);
            return c11;
        }
        if (!(response instanceof a.b.C0493a)) {
            throw new gt.l();
        }
        c10 = b0.c(null, new Function1() { // from class: mr.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit G0;
                G0 = com.withpersona.sdk2.inquiry.ui.a.G0(a.b.this, (r.c) obj);
                return G0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit F0(UiComponent uiComponent, a.b bVar, UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Boolean bool = Boolean.FALSE;
        a.b.C0494b c0494b = (a.b.C0494b) bVar;
        InputAddressComponent q10 = ((InputAddressComponent) uiComponent).o(bool).q(c0494b.getResult().getAddressStreet1());
        String addressStreet2 = c0494b.getResult().getAddressStreet2();
        if (addressStreet2 == null) {
            addressStreet2 = "";
        }
        InputAddressComponent S = q10.j(addressStreet2).k(c0494b.getResult().getAddressCity()).s(c0494b.getResult().getAddressSubdivision()).p(c0494b.getResult().getAddressPostalCode()).V(null).S(bool);
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, S), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        S.getTextControllerForAddressStreet1().c(S.getStreet1());
        S.getTextControllerForAddressStreet2().c(S.getStreet2());
        S.getTextControllerForAddressCity().c(S.getCity());
        S.getTextControllerForAddressSubdivision().c(S.getSubdivision());
        S.getTextControllerForAddressPostalCode().c(S.getPostalCode());
        return Unit.f22894a;
    }

    public static final Unit G0(a.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(new UiWorkflow.b.d("Couldn't load address.", ((a.b.C0493a) bVar).getCause()));
        return Unit.f22894a;
    }

    public static final r H0(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z10) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit I0;
                I0 = com.withpersona.sdk2.inquiry.ui.a.I0(UiState.Displaying.this, uiComponent, z10, (r.c) obj);
                return I0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit I0(UiState.Displaying displaying, UiComponent uiComponent, boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((m4) uiComponent).a(z10)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final r J0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final Number number) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit K0;
                K0 = com.withpersona.sdk2.inquiry.ui.a.K0(UiState.Displaying.this, uiComponent, number, aVar, (r.c) obj);
                return K0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit K0(UiState.Displaying displaying, UiComponent uiComponent, Number number, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((n4) uiComponent).a(number)), null, m0(aVar, number == null, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r L0(final UiState.Displaying displaying, final UiComponent uiComponent, final Bitmap bitmap) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit M0;
                M0 = com.withpersona.sdk2.inquiry.ui.a.M0(UiState.Displaying.this, uiComponent, bitmap, (r.c) obj);
                return M0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit M0(UiState.Displaying displaying, UiComponent uiComponent, Bitmap bitmap, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.c) uiComponent).f(bitmap)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final r N0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String str) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.v0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit O0;
                O0 = com.withpersona.sdk2.inquiry.ui.a.O0(UiState.Displaying.this, uiComponent, str, aVar, (r.c) obj);
                return O0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit O0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.l) uiComponent).a(str)), null, m0(aVar, str == null || str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r P0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newValue) {
        r c10;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c10 = b0.c(null, new Function1() { // from class: mr.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Q0;
                Q0 = com.withpersona.sdk2.inquiry.ui.a.Q0(UiState.Displaying.this, uiComponent, newValue, aVar, (r.c) obj);
                return Q0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit Q0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).q(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.cardAccessNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r R0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newValue) {
        r c10;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c10 = b0.c(null, new Function1() { // from class: mr.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit S0;
                S0 = com.withpersona.sdk2.inquiry.ui.a.S0(UiState.Displaying.this, uiComponent, newValue, aVar, (r.c) obj);
                return S0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit S0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).s(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.documentNumberName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r T0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String str) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit U0;
                U0 = com.withpersona.sdk2.inquiry.ui.a.U0(UiState.Displaying.this, uiComponent, str, aVar, (r.c) obj);
                return U0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit U0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).r(str)), null, aVar.l0(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.dateOfBirthName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r V0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String str) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit W0;
                W0 = com.withpersona.sdk2.inquiry.ui.a.W0(UiState.Displaying.this, uiComponent, str, aVar, (r.c) obj);
                return W0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit W0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).t(str)), null, aVar.l0(str == null || str.length() == 0, displaying.x(), uiComponent, GovernmentIdNfcScan.expirationDateName), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r X0(final UiState.Displaying displaying, final UiComponent uiComponent, final GovernmentIdNfcData governmentIdNfcData) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Y0;
                Y0 = com.withpersona.sdk2.inquiry.ui.a.Y0(UiState.Displaying.this, uiComponent, governmentIdNfcData, (r.c) obj);
                return Y0;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit Y0(UiState.Displaying displaying, UiComponent uiComponent, GovernmentIdNfcData governmentIdNfcData, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((GovernmentIdNfcScanComponent) uiComponent).u(governmentIdNfcData)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final r Z0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List selectedOptions) {
        r c10;
        Intrinsics.checkNotNullParameter(selectedOptions, "selectedOptions");
        c10 = b0.c(null, new Function1() { // from class: mr.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a12;
                a12 = com.withpersona.sdk2.inquiry.ui.a.a1(UiState.Displaying.this, uiComponent, selectedOptions, aVar, (r.c) obj);
                return a12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit a1(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((w3) uiComponent).k(list)), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r b1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c12;
                c12 = com.withpersona.sdk2.inquiry.ui.a.c1(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return c12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit c1(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).A((Option) CollectionsKt.firstOrNull(list))), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r d1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final List newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit e12;
                e12 = com.withpersona.sdk2.inquiry.ui.a.e1(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return e12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit e1(UiState.Displaying displaying, UiComponent uiComponent, List list, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).C((Option) CollectionsKt.firstOrNull(list))), null, m0(aVar, list.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r f1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit g12;
                g12 = com.withpersona.sdk2.inquiry.ui.a.g1(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return g12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit g1(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((InputInternationalDbComponent) uiComponent).D(str)), null, m0(aVar, str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r h1(final UiState.Displaying displaying, final UiComponent uiComponent, final JpMyNumberNfcScanResult jpMyNumberNfcScanResult) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit i12;
                i12 = com.withpersona.sdk2.inquiry.ui.a.i1(UiState.Displaying.this, uiComponent, jpMyNumberNfcScanResult, (r.c) obj);
                return i12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit i1(UiState.Displaying displaying, UiComponent uiComponent, JpMyNumberNfcScanResult jpMyNumberNfcScanResult, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((JpMyNumberNfcScanComponent) uiComponent).m(jpMyNumberNfcScanResult)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final r j1(final UiState.Displaying displaying, final UiComponent uiComponent, final String newValue) {
        r c10;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c10 = b0.c(null, new Function1() { // from class: mr.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit k12;
                k12 = com.withpersona.sdk2.inquiry.ui.a.k1(UiState.Displaying.this, uiComponent, newValue, (r.c) obj);
                return k12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit k1(UiState.Displaying displaying, UiComponent uiComponent, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((MdocComponent) uiComponent).p(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final r l1(final UiState.Displaying displaying, final UiComponent uiComponent, final String newValue) {
        r c10;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        c10 = b0.c(null, new Function1() { // from class: mr.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit m12;
                m12 = com.withpersona.sdk2.inquiry.ui.a.m1(UiState.Displaying.this, uiComponent, newValue, (r.c) obj);
                return m12;
            }
        }, 1, null);
        return c10;
    }

    public static /* synthetic */ List m0(a aVar, boolean z10, List list, UiComponent uiComponent, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str = null;
        }
        return aVar.l0(z10, list, uiComponent, str);
    }

    public static final Unit m1(UiState.Displaying displaying, UiComponent uiComponent, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        MdocComponent mdocComponent = (MdocComponent) uiComponent;
        action.e(b.b(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, mdocComponent.q(str)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null), mdocComponent.getSuccessfulMdocRetrievalTransitionComponentName()));
        return Unit.f22894a;
    }

    public static final r n1(final UiComponent uiComponent, final UiState.Displaying displaying, c.b output) {
        final PhoneNumberSnaComponent m10;
        r c10;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof c.b.C0664b) {
            m10 = ((PhoneNumberSnaComponent) uiComponent).m(((c.b.C0664b) output).a(), null, null);
        } else {
            if (!(output instanceof c.b.Error)) {
                throw new gt.l();
            }
            c.b.Error error = (c.b.Error) output;
            m10 = ((PhoneNumberSnaComponent) uiComponent).m(null, error.getErrorName(), error.getErrorMessage());
        }
        c10 = b0.c(null, new Function1() { // from class: mr.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o12;
                o12 = com.withpersona.sdk2.inquiry.ui.a.o1(UiState.Displaying.this, uiComponent, m10, (r.c) obj);
                return o12;
            }
        }, 1, null);
        return c10;
    }

    public static final r o0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit p02;
                p02 = com.withpersona.sdk2.inquiry.ui.a.p0(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return p02;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit o1(UiState.Displaying displaying, UiComponent uiComponent, PhoneNumberSnaComponent phoneNumberSnaComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, phoneNumberSnaComponent), null, null, null, null, null, null, new UiState.Displaying.AutoSubmit(phoneNumberSnaComponent, 0, null), null, false, false, null, null, null, false, 0, null, 0, 262014, null));
        return Unit.f22894a;
    }

    public static final Unit p0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((o4) uiComponent).a(str)), null, m0(aVar, str.length() == 0, displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r p1(final UiState.Displaying displaying, final UiComponent uiComponent, Unit it) {
        r c10;
        Intrinsics.checkNotNullParameter(it, "it");
        c10 = b0.c(null, new Function1() { // from class: mr.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q12;
                q12 = com.withpersona.sdk2.inquiry.ui.a.q1(UiState.Displaying.this, uiComponent, (r.c) obj);
                return q12;
            }
        }, 1, null);
        return c10;
    }

    public static final r q0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit r02;
                r02 = com.withpersona.sdk2.inquiry.ui.a.r0(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return r02;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit q1(UiState.Displaying displaying, UiComponent uiComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, ((InputFileUploadComponent) uiComponent).getName(), displaying.getFilePickRequestId() + 1, 65535, null));
        return Unit.f22894a;
    }

    public static final Unit r0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).q(str).T(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "street_1"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r r1(final UiComponent uiComponent, final UiState.Displaying displaying, h.b output) {
        r c10;
        r c11;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof h.b.Success) {
            final InputFileUploadComponent m10 = ((InputFileUploadComponent) uiComponent).m(((h.b.Success) output).a());
            c11 = b0.c(null, new Function1() { // from class: mr.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit s12;
                    s12 = com.withpersona.sdk2.inquiry.ui.a.s1(UiState.Displaying.this, uiComponent, m10, (r.c) obj);
                    return s12;
                }
            }, 1, null);
            return c11;
        }
        if (!(output instanceof h.b.a) && !(output instanceof h.b.C0260b)) {
            throw new gt.l();
        }
        c10 = b0.c(null, new Function1() { // from class: mr.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t12;
                t12 = com.withpersona.sdk2.inquiry.ui.a.t1(UiState.Displaying.this, (r.c) obj);
                return t12;
            }
        }, 1, null);
        return c10;
    }

    public static final r s0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit t02;
                t02 = com.withpersona.sdk2.inquiry.ui.a.t0(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return t02;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit s1(UiState.Displaying displaying, UiComponent uiComponent, InputFileUploadComponent inputFileUploadComponent, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, inputFileUploadComponent), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196606, null));
        return Unit.f22894a;
    }

    public static final Unit t0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).j(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "street_2"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit t1(UiState.Displaying displaying, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 196607, null));
        return Unit.f22894a;
    }

    public static final r u0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit v02;
                v02 = com.withpersona.sdk2.inquiry.ui.a.v0(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return v02;
            }
        }, 1, null);
        return c10;
    }

    public static final r u1(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final Set stringSet) {
        r c10;
        Intrinsics.checkNotNullParameter(stringSet, "stringSet");
        c10 = b0.c(null, new Function1() { // from class: mr.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit v12;
                v12 = com.withpersona.sdk2.inquiry.ui.a.v1(UiState.Displaying.this, uiComponent, stringSet, aVar, (r.c) obj);
                return v12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit v0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).k(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "city"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit v1(UiState.Displaying displaying, UiComponent uiComponent, Set set, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((s4) uiComponent).a(set)), null, m0(aVar, set.isEmpty(), displaying.x(), uiComponent, null, 8, null), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final r w0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.x0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit x02;
                x02 = com.withpersona.sdk2.inquiry.ui.a.x0(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return x02;
            }
        }, 1, null);
        return c10;
    }

    public static final r w1(final UiState.Displaying displaying, final UiComponent uiComponent, final boolean z10) {
        r c10;
        c10 = b0.c(null, new Function1() { // from class: mr.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit x12;
                x12 = com.withpersona.sdk2.inquiry.ui.a.x1(UiState.Displaying.this, uiComponent, z10, (r.c) obj);
                return x12;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit x0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).s(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "subdivision"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public static final Unit x1(UiState.Displaying displaying, UiComponent uiComponent, boolean z10, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).o(Boolean.valueOf(z10))), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f22894a;
    }

    public static final r y0(final UiState.Displaying displaying, final UiComponent uiComponent, final a aVar, final String newText) {
        r c10;
        Intrinsics.checkNotNullParameter(newText, "newText");
        c10 = b0.c(null, new Function1() { // from class: mr.d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit z02;
                z02 = com.withpersona.sdk2.inquiry.ui.a.z0(UiState.Displaying.this, uiComponent, newText, aVar, (r.c) obj);
                return z02;
            }
        }, 1, null);
        return c10;
    }

    public static final Unit z0(UiState.Displaying displaying, UiComponent uiComponent, String str, a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(UiState.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.b.m(displaying.getComponents(), uiComponent, ((ar.b) uiComponent).p(str)), null, aVar.l0(str.length() == 0, displaying.x(), uiComponent, "postal_code"), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262138, null));
        return Unit.f22894a;
    }

    public final UiComponentConfig k0(List<? extends UiComponentConfig> configs, String name) {
        UiComponentConfig k02;
        if (configs == null) {
            return null;
        }
        for (UiComponentConfig uiComponentConfig : configs) {
            if (Intrinsics.c(uiComponentConfig.getName(), name)) {
                return uiComponentConfig;
            }
            if ((uiComponentConfig instanceof UiComponentContainerConfig) && (k02 = k0(((UiComponentContainerConfig) uiComponentConfig).getChildren(), name)) != null) {
                return k02;
            }
        }
        return null;
    }

    public final List<UiComponentErrorInfo> l0(boolean isFieldBlank, List<UiComponentErrorInfo> componentErrors, UiComponent component, String subComponentName) {
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

    public final void n0(@NotNull UiWorkflow.Input renderProps, @NotNull final UiState.Displaying renderState, @NotNull wm.k<? super UiWorkflow.Input, UiState, ? extends UiWorkflow.b, ? extends Object>.a context, @NotNull final UiComponent component) {
        String[] strArr;
        InputFileUpload.Attributes attributes;
        Integer fileUploadLimit;
        InputFileUpload.Attributes attributes2;
        List<String> allowedFileTypes;
        String checkUrl;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(component, "component");
        if (component instanceof o4) {
            TypedWorker typedWorker = new TypedWorker(d0.k(String.class), ((o4) component).getTextController().a());
            String name = component.getName();
            Function1 function1 = new Function1() { // from class: mr.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r o02;
                    o02 = com.withpersona.sdk2.inquiry.ui.a.o0(UiState.Displaying.this, component, this, (String) obj);
                    return o02;
                }
            };
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            w.l(context, typedWorker, d0.l(o.class, companion.a(d0.k(String.class))), name, function1);
            if (component instanceof InputPhoneNumberComponent) {
                InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                w.l(context, new TypedWorker(d0.l(List.class, companion.a(d0.k(Option.class))), inputPhoneNumberComponent.getCountryCodeOptionsController().a()), d0.l(o.class, companion.a(d0.l(List.class, companion.a(d0.k(Option.class))))), inputPhoneNumberComponent.getName() + ":country", new Function1() { // from class: mr.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wm.r C0;
                        C0 = com.withpersona.sdk2.inquiry.ui.a.C0(UiState.Displaying.this, component, this, (List) obj);
                        return C0;
                    }
                });
                return;
            }
            return;
        }
        if (component instanceof w3) {
            mu.h<List<Option>> a10 = ((w3) component).getSelectedOptionsController().a();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            w.l(context, new TypedWorker(d0.l(List.class, companion2.a(d0.k(Option.class))), a10), d0.l(o.class, companion2.a(d0.l(List.class, companion2.a(d0.k(Option.class))))), component.getName(), new Function1() { // from class: mr.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r Z0;
                    Z0 = com.withpersona.sdk2.inquiry.ui.a.Z0(UiState.Displaying.this, component, this, (List) obj);
                    return Z0;
                }
            });
            return;
        }
        if (component instanceof s4) {
            mu.h<Set<String>> a11 = ((s4) component).getStringSetController().a();
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            w.l(context, new TypedWorker(d0.l(Set.class, companion3.a(d0.k(String.class))), a11), d0.l(o.class, companion3.a(d0.l(Set.class, companion3.a(d0.k(String.class))))), component.getName(), new Function1() { // from class: mr.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r u12;
                    u12 = com.withpersona.sdk2.inquiry.ui.a.u1(UiState.Displaying.this, component, this, (Set) obj);
                    return u12;
                }
            });
            return;
        }
        boolean z10 = component instanceof ar.b;
        Class cls = Boolean.TYPE;
        if (z10) {
            TypedWorker typedWorker2 = new TypedWorker(d0.k(cls), ((ar.b) component).getIsAddressFieldCollapsed().a());
            String str = component.getName() + "UpdateCollapsedState";
            Function1 function12 = new Function1() { // from class: mr.q
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r w12;
                    w12 = com.withpersona.sdk2.inquiry.ui.a.w1(UiState.Displaying.this, component, ((Boolean) obj).booleanValue());
                    return w12;
                }
            };
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            w.l(context, typedWorker2, d0.l(o.class, companion4.a(d0.k(cls))), str, function12);
            ar.b bVar = (ar.b) component;
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressStreet1().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressStreet1", new Function1() { // from class: mr.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r q02;
                    q02 = com.withpersona.sdk2.inquiry.ui.a.q0(UiState.Displaying.this, component, this, (String) obj);
                    return q02;
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressStreet2().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressStreet2", new Function1() { // from class: mr.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r s02;
                    s02 = com.withpersona.sdk2.inquiry.ui.a.s0(UiState.Displaying.this, component, this, (String) obj);
                    return s02;
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressCity().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressCity", new Function1() { // from class: mr.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r u02;
                    u02 = com.withpersona.sdk2.inquiry.ui.a.u0(UiState.Displaying.this, component, this, (String) obj);
                    return u02;
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressSubdivision().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressSubdivision", new Function1() { // from class: mr.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r w02;
                    w02 = com.withpersona.sdk2.inquiry.ui.a.w0(UiState.Displaying.this, component, this, (String) obj);
                    return w02;
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), bVar.getTextControllerForAddressPostalCode().a()), d0.l(o.class, companion4.a(d0.k(String.class))), component.getName() + "UpdateAddressPostalCode", new Function1() { // from class: mr.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r y02;
                    y02 = com.withpersona.sdk2.inquiry.ui.a.y0(UiState.Displaying.this, component, this, (String) obj);
                    return y02;
                }
            });
            if (component instanceof InputAddressComponent) {
                InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                if (inputAddressComponent.getAutocompleteMethod() == cr.b.f14158a) {
                    String searchQuery = inputAddressComponent.getSearchQuery();
                    if (searchQuery != null) {
                        w.l(context, this.addressAutocompleteWorker.a(renderProps.getSessionToken(), component, searchQuery), d0.k(com.withpersona.sdk2.inquiry.ui.network.b.class), inputAddressComponent.getName(), new Function1() { // from class: mr.l
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                wm.r A0;
                                A0 = com.withpersona.sdk2.inquiry.ui.a.A0(UiState.Displaying.this, component, (b.AbstractC0262b) obj);
                                return A0;
                            }
                        });
                        Unit unit = Unit.f22894a;
                    }
                    String selectedSearchResultId = inputAddressComponent.getSelectedSearchResultId();
                    if (selectedSearchResultId != null) {
                        w.l(context, this.addressDetailsWorker.a(renderProps.getSessionToken(), selectedSearchResultId), d0.k(or.a.class), "", new Function1() { // from class: mr.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                wm.r E0;
                                E0 = com.withpersona.sdk2.inquiry.ui.a.E0(UiComponent.this, renderState, (a.b) obj);
                                return E0;
                            }
                        });
                        Unit unit2 = Unit.f22894a;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (component instanceof m4) {
            w.l(context, new TypedWorker(d0.k(cls), ((m4) component).getTwoStateViewController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.k(cls))), component.getName(), new Function1() { // from class: mr.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r H0;
                    H0 = com.withpersona.sdk2.inquiry.ui.a.H0(UiState.Displaying.this, component, ((Boolean) obj).booleanValue());
                    return H0;
                }
            });
            return;
        }
        if (component instanceof n4) {
            w.l(context, new TypedWorker(d0.e(Number.class), ((n4) component).getNumberController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(Number.class))), component.getName(), new Function1() { // from class: mr.s0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r J0;
                    J0 = com.withpersona.sdk2.inquiry.ui.a.J0(UiState.Displaying.this, component, this, (Number) obj);
                    return J0;
                }
            });
            return;
        }
        if (component instanceof ar.c) {
            w.l(context, new TypedWorker(d0.e(Bitmap.class), ((ar.c) component).getBitmapController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(Bitmap.class))), component.getName(), new Function1() { // from class: mr.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r L0;
                    L0 = com.withpersona.sdk2.inquiry.ui.a.L0(UiState.Displaying.this, component, (Bitmap) obj);
                    return L0;
                }
            });
            return;
        }
        if (component instanceof ar.l) {
            w.l(context, new TypedWorker(d0.e(String.class), ((ar.l) component).getDateController().e()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(String.class))), component.getName(), new Function1() { // from class: mr.g1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r N0;
                    N0 = com.withpersona.sdk2.inquiry.ui.a.N0(UiState.Displaying.this, component, this, (String) obj);
                    return N0;
                }
            });
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            TypedWorker typedWorker3 = new TypedWorker(d0.k(String.class), governmentIdNfcScanComponent.getCardAccessNumberController().a());
            String str2 = governmentIdNfcScanComponent.getName() + "UpdateCardAccessNumber";
            Function1 function13 = new Function1() { // from class: mr.h1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r P0;
                    P0 = com.withpersona.sdk2.inquiry.ui.a.P0(UiState.Displaying.this, component, this, (String) obj);
                    return P0;
                }
            };
            KTypeProjection.Companion companion5 = KTypeProjection.INSTANCE;
            w.l(context, typedWorker3, d0.l(o.class, companion5.a(d0.k(String.class))), str2, function13);
            w.l(context, new TypedWorker(d0.k(String.class), governmentIdNfcScanComponent.getDocumentNumberController().a()), d0.l(o.class, companion5.a(d0.k(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDocumentNumber", new Function1() { // from class: mr.i1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r R0;
                    R0 = com.withpersona.sdk2.inquiry.ui.a.R0(UiState.Displaying.this, component, this, (String) obj);
                    return R0;
                }
            });
            w.l(context, new TypedWorker(d0.e(String.class), governmentIdNfcScanComponent.getDateOfBirthController().e()), d0.l(o.class, companion5.a(d0.e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateDateOfBirth", new Function1() { // from class: mr.j1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r T0;
                    T0 = com.withpersona.sdk2.inquiry.ui.a.T0(UiState.Displaying.this, component, this, (String) obj);
                    return T0;
                }
            });
            w.l(context, new TypedWorker(d0.e(String.class), governmentIdNfcScanComponent.getExpirationDateController().e()), d0.l(o.class, companion5.a(d0.e(String.class))), governmentIdNfcScanComponent.getName() + "UpdateExpirationDate", new Function1() { // from class: mr.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r V0;
                    V0 = com.withpersona.sdk2.inquiry.ui.a.V0(UiState.Displaying.this, component, this, (String) obj);
                    return V0;
                }
            });
            w.l(context, new TypedWorker(d0.e(GovernmentIdNfcData.class), governmentIdNfcScanComponent.getNfcDataController().a()), d0.l(o.class, companion5.a(d0.e(GovernmentIdNfcData.class))), governmentIdNfcScanComponent.getName(), new Function1() { // from class: mr.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r X0;
                    X0 = com.withpersona.sdk2.inquiry.ui.a.X0(UiState.Displaying.this, component, (GovernmentIdNfcData) obj);
                    return X0;
                }
            });
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
            mu.h<List<Option>> a12 = inputInternationalDbComponent.getCountryOptionsController().a();
            KTypeProjection.Companion companion6 = KTypeProjection.INSTANCE;
            w.l(context, new TypedWorker(d0.l(List.class, companion6.a(d0.k(Option.class))), a12), d0.l(o.class, companion6.a(d0.l(List.class, companion6.a(d0.k(Option.class))))), inputInternationalDbComponent.getName() + ":country", new Function1() { // from class: mr.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r b12;
                    b12 = com.withpersona.sdk2.inquiry.ui.a.b1(UiState.Displaying.this, component, this, (List) obj);
                    return b12;
                }
            });
            w.l(context, new TypedWorker(d0.l(List.class, companion6.a(d0.k(Option.class))), inputInternationalDbComponent.getIdTypeOptionsController().a()), d0.l(o.class, companion6.a(d0.l(List.class, companion6.a(d0.k(Option.class))))), inputInternationalDbComponent.getName() + ":idType", new Function1() { // from class: mr.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r d12;
                    d12 = com.withpersona.sdk2.inquiry.ui.a.d1(UiState.Displaying.this, component, this, (List) obj);
                    return d12;
                }
            });
            w.l(context, new TypedWorker(d0.k(String.class), inputInternationalDbComponent.getIdValueController().a()), d0.l(o.class, companion6.a(d0.k(String.class))), inputInternationalDbComponent.getName() + ":idValue", new Function1() { // from class: mr.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r f12;
                    f12 = com.withpersona.sdk2.inquiry.ui.a.f1(UiState.Displaying.this, component, this, (String) obj);
                    return f12;
                }
            });
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
            w.l(context, new TypedWorker(d0.e(JpMyNumberNfcScanResult.class), jpMyNumberNfcScanComponent.getScanResultController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.e(JpMyNumberNfcScanResult.class))), jpMyNumberNfcScanComponent.getName() + ":scanResult", new Function1() { // from class: mr.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r h12;
                    h12 = com.withpersona.sdk2.inquiry.ui.a.h1(UiState.Displaying.this, component, (JpMyNumberNfcScanResult) obj);
                    return h12;
                }
            });
            return;
        }
        if (component instanceof MdocComponent) {
            MdocComponent mdocComponent = (MdocComponent) component;
            TypedWorker typedWorker4 = new TypedWorker(d0.k(String.class), mdocComponent.getErrorTextController().a());
            String str3 = mdocComponent.getName() + ":error";
            Function1 function14 = new Function1() { // from class: mr.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r j12;
                    j12 = com.withpersona.sdk2.inquiry.ui.a.j1(UiState.Displaying.this, component, (String) obj);
                    return j12;
                }
            };
            KTypeProjection.Companion companion7 = KTypeProjection.INSTANCE;
            w.l(context, typedWorker4, d0.l(o.class, companion7.a(d0.k(String.class))), str3, function14);
            w.l(context, new TypedWorker(d0.k(String.class), mdocComponent.getMdocDataController().a()), d0.l(o.class, companion7.a(d0.k(String.class))), mdocComponent.getName() + ":data", new Function1() { // from class: mr.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r l12;
                    l12 = com.withpersona.sdk2.inquiry.ui.a.l1(UiState.Displaying.this, component, (String) obj);
                    return l12;
                }
            });
            return;
        }
        if (component instanceof PhoneNumberSnaComponent) {
            PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) component;
            PhoneNumberSna.Attributes attributes3 = phoneNumberSnaComponent.getConfig().getAttributes();
            w.l(context, this.silentNetworkAuthWorker.a(this.applicationContext, new SilentNetworkAuthConfig((attributes3 == null || (checkUrl = attributes3.getCheckUrl()) == null) ? "" : checkUrl, 0, 0L, 6, null), attributes3 != null ? attributes3.getTimeoutSeconds() : 10), d0.k(xq.a.class), phoneNumberSnaComponent.getName(), new Function1() { // from class: mr.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r n12;
                    n12 = com.withpersona.sdk2.inquiry.ui.a.n1(UiComponent.this, renderState, (c.b) obj);
                    return n12;
                }
            });
            return;
        }
        if (component instanceof InputFileUploadComponent) {
            InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
            w.l(context, new TypedWorker(d0.k(Unit.class), inputFileUploadComponent.getFileUploadController().a()), d0.l(o.class, KTypeProjection.INSTANCE.a(d0.k(Unit.class))), inputFileUploadComponent.getName() + "_pick_request", new Function1() { // from class: mr.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    wm.r p12;
                    p12 = com.withpersona.sdk2.inquiry.ui.a.p1(UiState.Displaying.this, component, (Unit) obj);
                    return p12;
                }
            });
            if (Intrinsics.c(renderState.getFilePickComponentName(), inputFileUploadComponent.getName())) {
                UiComponentConfig k02 = k0(renderProps.getComponents(), inputFileUploadComponent.getName());
                InputFileUpload inputFileUpload = k02 instanceof InputFileUpload ? (InputFileUpload) k02 : null;
                int i10 = 1;
                if (inputFileUpload == null || (attributes2 = inputFileUpload.getAttributes()) == null || (allowedFileTypes = attributes2.getAllowedFileTypes()) == null || (strArr = (String[]) allowedFileTypes.toArray(new String[0])) == null) {
                    strArr = new String[]{"*/*"};
                }
                if (inputFileUpload != null && (attributes = inputFileUpload.getAttributes()) != null && (fileUploadLimit = attributes.getFileUploadLimit()) != null) {
                    i10 = fileUploadLimit.intValue();
                }
                w.l(context, this.fileSelectWorkerFactory.b(inputFileUploadComponent.getName() + "_" + renderState.getFilePickRequestId(), strArr, i10), d0.k(h.class), "", new Function1() { // from class: mr.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        wm.r r12;
                        r12 = com.withpersona.sdk2.inquiry.ui.a.r1(UiComponent.this, renderState, (h.b) obj);
                        return r12;
                    }
                });
            }
        }
    }
}
