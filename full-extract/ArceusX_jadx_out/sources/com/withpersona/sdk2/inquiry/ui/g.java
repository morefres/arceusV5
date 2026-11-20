package com.withpersona.sdk2.inquiry.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.t;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.u0;
import androidx.core.widget.NestedScrollView;
import ar.f2;
import ar.p1;
import ar.v3;
import ar.w1;
import ar.w3;
import ar.x;
import br.n;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LinkButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.ui.mdoc.MdocRequestMetadata;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.g;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import e3.k0;
import e3.l0;
import e3.n0;
import e3.o;
import er.w;
import hq.g0;
import hq.z;
import hr.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ju.p0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import mr.a2;
import mr.m1;
import mr.q1;
import mr.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import ym.ViewEnvironment;
import ym.a0;
import ym.e0;
import yq.ComponentView;
import yq.s;
import yt.o;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0087\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJG\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jk\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J9\u0010'\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010*J%\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0002¢\u0006\u0004\b0\u00101J'\u00106\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u0002082\u0006\u0010\u001c\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J)\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020<0#H\u0002¢\u0006\u0004\b>\u0010?JE\u0010D\u001a\u00020\u000b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020<0#H\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020F*\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010HJ\u0013\u0010K\u001a\u00020J*\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020M*\b\u0012\u0004\u0012\u00020\u000f0#H\u0002¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000eH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010m\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010pR(\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010|\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\"\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010{R%\u0010\u0082\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010{R#\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "Lnr/a;", "binding", "initialRendering", "<init>", "(Lnr/a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V", "rendering", "Lym/y;", "viewEnvironment", "", "x0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lym/y;)V", "", "", "", "componentParams", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "errors", "t0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lym/y;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "component", "o1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lym/y;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Landroid/view/View;", "view", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToConfig", "H0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lym/y;Ljava/util/Map;)V", "q0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V", "", "components", "", "isLoading", "f0", "(Ljava/util/List;Ljava/util/Map;Z)V", "c0", "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V", "e0", "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V", "d0", "Lyq/g;", "result", "g0", "(Lyq/g;Ljava/util/List;)V", "", "firstBelowTheFoldChildIndex", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "footerComponent", "u0", "(Lyq/g;ILcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "r0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lyq/a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "h0", "(Ljava/util/List;)Ljava/util/Map;", "initialComponentValues", "", "outMap", "componentViews", "p0", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "E0", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "D0", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "F0", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "G0", "(Ljava/util/Map;)Ljava/util/Map;", j6.b.f21518e, "Lnr/a;", "c", "Ljava/util/Map;", "componentNameToView", rl.d.f30696a, "e", "Ljava/lang/String;", "navBarTitle", "Lfr/j;", "f", "Lfr/j;", "inputSelectBottomSheetController", "Lmr/a2;", "g", "Lmr/a2;", "signatureBottomSheetController", "Lmr/q1;", "h", "Lmr/q1;", "nestedUiBottomSheetController", "Lbr/n;", "i", "Lbr/n;", "helpBottomSheetController", "j", "Z", "hasScrolledToBottom", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "onComplete", "l", "onCancel", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "onClick", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "n", "Lkotlin/jvm/functions/Function1;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "o", "launchJpMyNumberNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "p", "onVerifyPersonaClick", "i0", "()Ljava/util/Map;", "uiStateValues", "q", ve.a.f33391e, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"ResourceType"})
/* loaded from: classes3.dex */
public final class g implements ym.k<UiWorkflow.c.a> {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final nr.a binding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, View> componentNameToView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, UiComponentConfig> componentNameToConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String navBarTitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fr.j inputSelectBottomSheetController;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a2 signatureBottomSheetController;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final q1 nestedUiBottomSheetController;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n helpBottomSheetController;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean hasScrolledToBottom;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> onComplete;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> onCancel;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function2<? super UiComponent, ? super Boolean, Unit> onClick;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super VerifyPersonaButtonComponent, Unit> onVerifyPersonaClick;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g$a;", "Lym/a0;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "<init>", "()V", "initialRendering", "Lym/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", rl.d.f30696a, "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lym/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lgu/c;", "getType", "()Lgu/c;", Payload.TYPE, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.ui.g$a, reason: from kotlin metadata */
    public static final class Companion implements a0<UiWorkflow.c.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ym.f<UiWorkflow.c.a> f13916a;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.ui.g$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0258a extends kotlin.jvm.internal.k implements Function2<UiWorkflow.c.a, ViewEnvironment, Unit> {
            public C0258a(Object obj) {
                super(2, obj, g.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(UiWorkflow.c.a p02, ViewEnvironment p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                ((g) this.receiver).b(p02, p12);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(UiWorkflow.c.a aVar, ViewEnvironment viewEnvironment) {
                d(aVar, viewEnvironment);
                return Unit.f22894a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(UiWorkflow.c.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            Context context2;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                context2 = context;
            }
            nr.a c10 = nr.a.c(LayoutInflater.from(context2).cloneInContext(context));
            CoordinatorLayout root = c10.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            Intrinsics.checkNotNull(c10);
            e0.a(root, initialRendering, initialViewEnvironment, new C0258a(new g(c10, initialRendering)));
            CoordinatorLayout root2 = c10.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "let(...)");
            return root2;
        }

        @Override // ym.a0
        @NotNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull UiWorkflow.c.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f13916a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // ym.a0
        @NotNull
        public gu.c<? super UiWorkflow.c.a> getType() {
            return this.f13916a.getType();
        }

        public Companion() {
            this.f13916a = new ym.f<>(d0.b(UiWorkflow.c.a.class), new o() { // from class: mr.z3
                @Override // yt.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    View c10;
                    c10 = g.Companion.c((UiWorkflow.c.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                    return c10;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/withpersona/sdk2/inquiry/ui/g$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", j6.b.f21518e, "(Landroid/view/View;F)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {
        public final /* synthetic */ BottomSheetBehavior<NestedScrollView> b;

        public b(BottomSheetBehavior<NestedScrollView> bottomSheetBehavior) {
            this.b = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            g.this.binding.f27326j.setPadding(g.this.binding.f27326j.getPaddingLeft(), g.this.binding.f27326j.getPaddingTop(), g.this.binding.f27326j.getPaddingRight(), this.b.u0() + ((int) (slideOffset * (g.this.binding.f27324h.getHeight() - this.b.u0()))));
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.ui.UiScreenRunner$updateRendering$15$1$1", f = "UiScreenRunner.kt", l = {845}, m = "invokeSuspend")
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f13918t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e3.o f13919u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ View f13920v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ MdocRequestMetadata f13921w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ UiComponent f13922x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3.o oVar, View view, MdocRequestMetadata mdocRequestMetadata, UiComponent uiComponent, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f13919u = oVar;
            this.f13920v = view;
            this.f13921w = mdocRequestMetadata;
            this.f13922x = uiComponent;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f13919u, this.f13920v, this.f13921w, this.f13922x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f13918t;
            try {
                if (i10 == 0) {
                    gt.o.b(obj);
                    e3.o oVar = this.f13919u;
                    Context context = this.f13920v.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    k0 k0Var = new k0(kotlin.collections.o.d(new n0(((MdocRequestMetadata.GoogleWalletRequestMetadata) this.f13921w).getRequestJson())), null, false, null, false, 30, null);
                    this.f13918t = 1;
                    obj = oVar.b(context, k0Var, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                String a10 = m1.a(((l0) obj).getCredential());
                if (a10 != null) {
                    ((MdocComponent) this.f13922x).getMdocDataController().c(a10);
                } else {
                    ((MdocComponent) this.f13922x).getErrorTextController().c(((MdocComponent) this.f13922x).getErrorRetrievingMdocText());
                }
            } catch (f3.n unused) {
                ((MdocComponent) this.f13922x).getErrorTextController().c(((MdocComponent) this.f13922x).getErrorRetrievingMdocText());
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Function1<SubmitButtonComponent, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f13923a = new d();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public g(@NotNull nr.a binding, @NotNull final UiWorkflow.c.a initialRendering) {
        Map<String, UiComponentConfig> j10;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        this.binding = binding;
        this.navBarTitle = initialRendering.getNavBarTitle();
        CoordinatorLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.inputSelectBottomSheetController = new fr.j(root);
        CoordinatorLayout root2 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        this.signatureBottomSheetController = new a2(root2);
        CoordinatorLayout root3 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        this.nestedUiBottomSheetController = new q1(root3);
        CoordinatorLayout root4 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
        this.helpBottomSheetController = new n(root4);
        this.onComplete = new Function0() { // from class: mr.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit n02;
                n02 = com.withpersona.sdk2.inquiry.ui.g.n0();
                return n02;
            }
        };
        this.onCancel = new Function0() { // from class: mr.o2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit l02;
                l02 = com.withpersona.sdk2.inquiry.ui.g.l0();
                return l02;
            }
        };
        this.onClick = new Function2() { // from class: mr.z2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit m02;
                m02 = com.withpersona.sdk2.inquiry.ui.g.m0((UiComponent) obj, ((Boolean) obj2).booleanValue());
                return m02;
            }
        };
        this.launchNfcScan = new Function1() { // from class: mr.k3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit k02;
                k02 = com.withpersona.sdk2.inquiry.ui.g.k0((GovernmentIdNfcScanComponent) obj);
                return k02;
            }
        };
        this.launchJpMyNumberNfcScan = new Function1() { // from class: mr.t3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit j02;
                j02 = com.withpersona.sdk2.inquiry.ui.g.j0((JpMyNumberNfcScanComponent) obj);
                return j02;
            }
        };
        this.onVerifyPersonaClick = new Function1() { // from class: mr.u3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit o02;
                o02 = com.withpersona.sdk2.inquiry.ui.g.o0((VerifyPersonaButtonComponent) obj);
                return o02;
            }
        };
        Context context = binding.getRoot().getContext();
        s sVar = s.f37035a;
        Intrinsics.checkNotNull(context);
        List<UiComponent> f10 = initialRendering.f();
        List<UiComponentConfig> d10 = initialRendering.d();
        final yq.g h10 = s.h(sVar, context, new UiComponentScreen(f10, d10 == null ? p.k() : d10, initialRendering.getStyles()), initialRendering.getIsLoading(), false, false, 16, null);
        Integer c10 = initialRendering.c();
        if (c10 != null) {
            binding.f27327k.setBackgroundColor(c10.intValue());
        }
        Drawable a10 = initialRendering.a(context);
        if (a10 != null) {
            binding.f27327k.setBackground(a10);
            binding.f27319c.setBackgroundColor(0);
        }
        Integer h11 = initialRendering.h();
        if (h11 != null) {
            binding.f27325i.setControlsColor(h11.intValue());
        }
        List<UiComponentConfig> d11 = initialRendering.d();
        this.componentNameToConfig = (d11 == null || (j10 = com.withpersona.sdk2.inquiry.steps.ui.components.b.j(d11)) == null) ? kotlin.collections.k0.j() : j10;
        Set<Map.Entry<String, ComponentView>> entrySet = h10.getViewBindings().a().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a11 = gt.s.a(entry.getKey(), ((ComponentView) entry.getValue()).d());
            linkedHashMap.put(a11.c(), a11.d());
        }
        this.componentNameToView = linkedHashMap;
        this.binding.f27328l.addView(h10.getContentView());
        if (initialRendering.y() == StyleElements.PositionType.CENTER) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.f(this.binding.b);
            cVar.h(this.binding.f27328l.getId(), 4, this.binding.b.getId(), 4);
            cVar.c(this.binding.b);
        }
        FrameLayout uiStepContainer = this.binding.f27328l;
        Intrinsics.checkNotNullExpressionValue(uiStepContainer, "uiStepContainer");
        hr.p.b(uiStepContainer, initialRendering.getStyles(), false, false, 6, null);
        if (h10.getFooterView() != null) {
            g0(h10, initialRendering.f());
        }
        CoordinatorLayout root5 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root5, "getRoot(...)");
        uq.g.g(root5, new Function1() { // from class: mr.v3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit X;
                X = com.withpersona.sdk2.inquiry.ui.g.X(yq.g.this, this, (WindowInsetsCompat) obj);
                return X;
            }
        });
        this.binding.f27326j.setOnScrollChangeListener(new NestedScrollView.e() { // from class: mr.w3
            @Override // androidx.core.widget.NestedScrollView.e
            public final void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
                com.withpersona.sdk2.inquiry.ui.g.Y(com.withpersona.sdk2.inquiry.ui.g.this, initialRendering, nestedScrollView, i10, i11, i12, i13);
            }
        });
        this.binding.f27326j.post(new Runnable() { // from class: mr.x3
            @Override // java.lang.Runnable
            public final void run() {
                com.withpersona.sdk2.inquiry.ui.g.Z(com.withpersona.sdk2.inquiry.ui.g.this, initialRendering);
            }
        });
    }

    public static final Unit A0(UiWorkflow.c.a aVar, g gVar) {
        if (aVar.getHelpBottomSheetViewModel() != null) {
            gVar.helpBottomSheetController.x(aVar.getStyles(), aVar.getHelpBottomSheetViewModel(), aVar.v(), aVar.j(), aVar.m());
        }
        return Unit.f22894a;
    }

    public static final Unit B0(UiWorkflow.c.a aVar, g gVar, List list, UiComponent tappedComponent, boolean z10) {
        Intrinsics.checkNotNullParameter(tappedComponent, "tappedComponent");
        aVar.r().invoke(tappedComponent, Boolean.valueOf(z10), gVar.h0(list));
        return Unit.f22894a;
    }

    public static final Unit C0(UiWorkflow.c.a aVar, g gVar, List list, VerifyPersonaButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.x().invoke(it, gVar.h0(list));
        return Unit.f22894a;
    }

    public static final void I0(g gVar, View view) {
        gVar.onComplete.invoke();
    }

    public static final void J0(g gVar, UiComponent uiComponent, View view, View view2) {
        gVar.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final void K0(g gVar, UiComponent uiComponent, View view, View view2) {
        gVar.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final void L0(UiComponent uiComponent, ButtonWithLoadingIndicator buttonWithLoadingIndicator, View view) {
        try {
            buttonWithLoadingIndicator.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((LinkButtonComponent) uiComponent).getLink())));
        } catch (Exception unused) {
        }
    }

    public static final void M0(g gVar, View view) {
        gVar.onCancel.invoke();
    }

    public static final void N0(g gVar, UiComponent uiComponent, View view) {
        gVar.onVerifyPersonaClick.invoke(uiComponent);
    }

    public static final Unit O0(View view, UiWorkflow.c.a aVar, g gVar) {
        if (dr.a.f15385a.b(view)) {
            SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) cr.h.a(aVar.f(), d0.b(SubmitButtonComponent.class), d.f13923a);
            if (submitButtonComponent != null) {
                gVar.onClick.invoke(submitButtonComponent, Boolean.valueOf(view.getVisibility() == 0));
            }
        }
        return Unit.f22894a;
    }

    public static final void P0(final MaterialAutoCompleteTextView materialAutoCompleteTextView, zq.a aVar, final List<? extends TextInputLayout> list, final er.d dVar, final UiWorkflow.c.a aVar2, final UiComponent uiComponent, final List<Suggestion> list2) {
        materialAutoCompleteTextView.setAdapter(aVar);
        aVar.notifyDataSetChanged();
        materialAutoCompleteTextView.setThreshold(1);
        materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: mr.p3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                com.withpersona.sdk2.inquiry.ui.g.Q0(list, dVar, materialAutoCompleteTextView, aVar2, uiComponent, list2, adapterView, view, i10, j10);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Q0(List list, er.d dVar, MaterialAutoCompleteTextView materialAutoCompleteTextView, UiWorkflow.c.a aVar, UiComponent uiComponent, List list2, AdapterView adapterView, View view, int i10, long j10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(false);
        }
        dVar.f16213s.setVisibility(0);
        Context context = materialAutoCompleteTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hq.g.d(context);
        aVar.w().invoke(uiComponent, ((Suggestion) list2.get(i10)).getId());
    }

    public static final void R0(g gVar, TextInputLayout textInputLayout, w1 w1Var, w3 w3Var, View view) {
        m1(gVar, textInputLayout, w1Var, w3Var);
    }

    public static final void S0(g gVar, TextInputLayout textInputLayout, w1 w1Var, w3 w3Var, View view) {
        m1(gVar, textInputLayout, w1Var, w3Var);
    }

    public static final CharSequence T0(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    public static final void U0(UiComponent uiComponent, View view, View view2) {
        android.view.m a10;
        MdocRequestMetadata mdocRequestMetadata = ((MdocComponent) uiComponent).getMdocRequestMetadata();
        if (!(mdocRequestMetadata instanceof MdocRequestMetadata.GoogleWalletRequestMetadata)) {
            throw new gt.l();
        }
        o.Companion companion = e3.o.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e3.o a11 = companion.a(context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        j.b a12 = hq.g.a(context2);
        if (a12 == null || (a10 = t.a(a12)) == null) {
            return;
        }
        ju.k.d(a10, null, null, new c(a11, view, mdocRequestMetadata, uiComponent, null), 3, null);
    }

    public static final void V0(g gVar, UiComponent uiComponent, View view, View view2) {
        gVar.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final Unit W0(final UiComponent uiComponent, g gVar) {
        a1(gVar, ((InputInternationalDbComponent) uiComponent).getCountrySelectComponent(), new Function1() { // from class: mr.q3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit X0;
                X0 = com.withpersona.sdk2.inquiry.ui.g.X0(UiComponent.this, (List) obj);
                return X0;
            }
        });
        return Unit.f22894a;
    }

    public static final Unit X(yq.g gVar, g gVar2, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i10 = insets2.bottom;
        int i11 = insetsIgnoringVisibility.top;
        int max = Integer.max(insetsIgnoringVisibility.bottom, i10);
        int i12 = insetsIgnoringVisibility.left;
        int i13 = insetsIgnoringVisibility.right;
        View footerView = gVar.getFooterView();
        if (footerView == null) {
            gVar2.binding.f27326j.setPadding(i12, i11, i13, max);
        } else {
            ShadowedNestedScrollView nestedScroll = gVar2.binding.f27326j;
            Intrinsics.checkNotNullExpressionValue(nestedScroll, "nestedScroll");
            nestedScroll.setPadding(i12, i11, i13, nestedScroll.getPaddingBottom());
            footerView.setPadding(i12, footerView.getPaddingTop(), i13, max);
        }
        MaterialDivider footerDivider = gVar2.binding.f27320d;
        Intrinsics.checkNotNullExpressionValue(footerDivider, "footerDivider");
        ViewGroup.LayoutParams layoutParams = footerDivider.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = insetsIgnoringVisibility.bottom;
        footerDivider.setLayoutParams(marginLayoutParams);
        CoordinatorLayout footerSheetCoordinatorLayout = gVar2.binding.f27322f;
        Intrinsics.checkNotNullExpressionValue(footerSheetCoordinatorLayout, "footerSheetCoordinatorLayout");
        footerSheetCoordinatorLayout.setPadding(i12, footerSheetCoordinatorLayout.getPaddingTop(), i13, max);
        return Unit.f22894a;
    }

    public static final Unit X0(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        inputInternationalDbComponent.getCountryOptionsController().c(it);
        inputInternationalDbComponent.getIdTypeOptionsController().c(p.k());
        inputInternationalDbComponent.getIdValueController().c("");
        return Unit.f22894a;
    }

    public static final void Y(g gVar, UiWorkflow.c.a aVar, NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        a0(gVar, aVar);
    }

    public static final Unit Y0(final UiComponent uiComponent, g gVar) {
        a1(gVar, ((InputInternationalDbComponent) uiComponent).t(), new Function1() { // from class: mr.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Z0;
                Z0 = com.withpersona.sdk2.inquiry.ui.g.Z0(UiComponent.this, (List) obj);
                return Z0;
            }
        });
        return Unit.f22894a;
    }

    public static final void Z(g gVar, UiWorkflow.c.a aVar) {
        a0(gVar, aVar);
    }

    public static final Unit Z0(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        inputInternationalDbComponent.getIdTypeOptionsController().c(it);
        inputInternationalDbComponent.getIdValueController().c("");
        return Unit.f22894a;
    }

    public static final void a0(g gVar, UiWorkflow.c.a aVar) {
        if (gVar.hasScrolledToBottom || gVar.binding.f27326j.canScrollVertically(1)) {
            return;
        }
        gVar.hasScrolledToBottom = true;
        gVar.q0(aVar);
    }

    public static final void a1(final g gVar, w1 w1Var, final Function1<? super List<Option>, Unit> function1) {
        if (w1Var == null) {
            return;
        }
        gVar.binding.f27325i.getBackButton().setEnabled(false);
        gVar.binding.f27325i.setImportantForAccessibility(4);
        gVar.binding.f27328l.setImportantForAccessibility(4);
        gVar.inputSelectBottomSheetController.t(w1Var, new Function1() { // from class: mr.s3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit b12;
                b12 = com.withpersona.sdk2.inquiry.ui.g.b1(com.withpersona.sdk2.inquiry.ui.g.this, function1, (List) obj);
                return b12;
            }
        });
    }

    public static final Unit b1(g gVar, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        gVar.binding.f27325i.getBackButton().setEnabled(true);
        gVar.binding.f27325i.setImportantForAccessibility(1);
        gVar.binding.f27328l.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.f22894a;
    }

    public static final Unit c1(final UiComponent uiComponent, g gVar) {
        e1(gVar, ((InputPhoneNumberComponent) uiComponent).getCountryCodeSelectComponent(), new Function1() { // from class: mr.n3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d12;
                d12 = com.withpersona.sdk2.inquiry.ui.g.d1(UiComponent.this, (List) obj);
                return d12;
            }
        });
        return Unit.f22894a;
    }

    public static final Unit d1(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((InputPhoneNumberComponent) uiComponent).getCountryCodeOptionsController().c(it);
        return Unit.f22894a;
    }

    public static final void e1(final g gVar, w1 w1Var, final Function1<? super List<Option>, Unit> function1) {
        if (w1Var == null) {
            return;
        }
        gVar.binding.f27325i.getBackButton().setEnabled(false);
        gVar.binding.f27325i.setImportantForAccessibility(4);
        gVar.binding.f27328l.setImportantForAccessibility(4);
        gVar.inputSelectBottomSheetController.t(w1Var, new Function1() { // from class: mr.r3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit f12;
                f12 = com.withpersona.sdk2.inquiry.ui.g.f1(com.withpersona.sdk2.inquiry.ui.g.this, function1, (List) obj);
                return f12;
            }
        });
    }

    public static final Unit f1(g gVar, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        gVar.binding.f27325i.getBackButton().setEnabled(true);
        gVar.binding.f27325i.setImportantForAccessibility(1);
        gVar.binding.f27328l.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.f22894a;
    }

    public static final void g1(final g gVar, final UiComponent uiComponent, ESignature eSignature, UiWorkflow.c.a aVar, ViewEnvironment viewEnvironment, View view) {
        gVar.binding.f27325i.getBackButton().setEnabled(false);
        gVar.binding.f27325i.setImportantForAccessibility(4);
        gVar.binding.f27328l.setImportantForAccessibility(4);
        gVar.signatureBottomSheetController.p((ESignatureComponent) uiComponent, eSignature, aVar.getStyles(), viewEnvironment, new Function2() { // from class: mr.l3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit h12;
                h12 = com.withpersona.sdk2.inquiry.ui.g.h1(com.withpersona.sdk2.inquiry.ui.g.this, uiComponent, ((Boolean) obj).booleanValue(), (Bitmap) obj2);
                return h12;
            }
        });
    }

    public static final Unit h1(g gVar, UiComponent uiComponent, boolean z10, Bitmap bitmap) {
        gVar.binding.f27325i.getBackButton().setEnabled(true);
        gVar.binding.f27325i.setImportantForAccessibility(1);
        gVar.binding.f27328l.setImportantForAccessibility(1);
        if (!z10) {
            ((ESignatureComponent) uiComponent).getBitmapController().c(bitmap);
        }
        return Unit.f22894a;
    }

    public static final void i1(g gVar, UiComponent uiComponent, View view) {
        gVar.launchNfcScan.invoke(uiComponent);
    }

    public static final Unit j0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent) {
        Intrinsics.checkNotNullParameter(jpMyNumberNfcScanComponent, "<unused var>");
        return Unit.f22894a;
    }

    public static final void j1(UiWorkflow.c.a aVar, g gVar, View view) {
        if (aVar.getHelpBottomSheetViewModel() != null) {
            gVar.helpBottomSheetController.x(aVar.getStyles(), aVar.getHelpBottomSheetViewModel(), aVar.v(), aVar.j(), aVar.m());
        }
    }

    public static final Unit k0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
        Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "<unused var>");
        return Unit.f22894a;
    }

    public static final void k1(g gVar, UiComponent uiComponent, View view) {
        gVar.launchJpMyNumberNfcScan.invoke(uiComponent);
    }

    public static final Unit l0() {
        return Unit.f22894a;
    }

    public static final CharSequence l1(SelectedFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFileName();
    }

    public static final Unit m0(UiComponent uiComponent, boolean z10) {
        Intrinsics.checkNotNullParameter(uiComponent, "<unused var>");
        return Unit.f22894a;
    }

    public static final void m1(final g gVar, final TextInputLayout textInputLayout, w1 w1Var, final w3<?> w3Var) {
        gVar.binding.f27325i.getBackButton().setEnabled(false);
        textInputLayout.setEnabled(false);
        gVar.binding.f27325i.setImportantForAccessibility(4);
        gVar.binding.f27328l.setImportantForAccessibility(4);
        gVar.inputSelectBottomSheetController.t(w1Var, new Function1() { // from class: mr.m3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit n12;
                n12 = com.withpersona.sdk2.inquiry.ui.g.n1(com.withpersona.sdk2.inquiry.ui.g.this, textInputLayout, w3Var, (List) obj);
                return n12;
            }
        });
    }

    public static final Unit n0() {
        return Unit.f22894a;
    }

    public static final Unit n1(g gVar, TextInputLayout textInputLayout, w3 w3Var, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        gVar.binding.f27325i.getBackButton().setEnabled(true);
        textInputLayout.setEnabled(true);
        textInputLayout.requestLayout();
        gVar.binding.f27325i.setImportantForAccessibility(1);
        gVar.binding.f27328l.setImportantForAccessibility(1);
        w3Var.getSelectedOptionsController().c(selectedItems);
        return Unit.f22894a;
    }

    public static final Unit o0(VerifyPersonaButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit p1(UiWorkflow.c.a aVar, SheetComponent sheetComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.t().invoke(sheetComponent, it);
        return Unit.f22894a;
    }

    public static final Unit q1(g gVar, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gVar.nestedUiBottomSheetController.f();
        return Unit.f22894a;
    }

    public static final void r1(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final void s0(ClickableStackComponent clickableStackComponent, g gVar, ConstraintLayout constraintLayout, View view) {
        clickableStackComponent.k(true);
        gVar.onClick.invoke(clickableStackComponent, Boolean.valueOf(constraintLayout.getVisibility() == 0));
    }

    public static final void v0(g gVar, View view, BottomSheetBehavior bottomSheetBehavior, View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int bottom = gVar.binding.f27321e.getBottom();
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        gVar.binding.f27324h.offsetDescendantRectToMyCoords(view, rect);
        int u02 = bottomSheetBehavior.u0();
        bottomSheetBehavior.S0(rect.top);
        if (u02 != bottomSheetBehavior.u0()) {
            ShadowedNestedScrollView shadowedNestedScrollView = gVar.binding.f27326j;
            shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), gVar.binding.f27326j.getPaddingTop(), gVar.binding.f27326j.getPaddingRight(), bottomSheetBehavior.u0());
        }
        bottomSheetBehavior.Q0(bottom);
    }

    public static final void w0(g gVar, BottomSheetBehavior bottomSheetBehavior, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int bottom = gVar.binding.f27321e.getBottom();
        bottomSheetBehavior.S0(bottom);
        bottomSheetBehavior.Q0(bottom);
        ShadowedNestedScrollView shadowedNestedScrollView = gVar.binding.f27326j;
        shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), gVar.binding.f27326j.getPaddingTop(), gVar.binding.f27326j.getPaddingRight(), bottom);
    }

    public static final Unit y0(g gVar, UiWorkflow.c.a aVar) {
        if (!gVar.inputSelectBottomSheetController.l() && !gVar.signatureBottomSheetController.h() && !n.o(gVar.helpBottomSheetController, null, 1, null)) {
            if (aVar.getNavigationState().getShowBackButton()) {
                aVar.p().invoke();
            } else {
                aVar.q().invoke();
            }
        }
        return Unit.f22894a;
    }

    public static final Unit z0(UiWorkflow.c.a aVar) {
        aVar.q().invoke();
        return Unit.f22894a;
    }

    public final ComponentParam.ComponentNumber D0(Number number) {
        return new ComponentParam.ComponentNumber(number);
    }

    public final ComponentParam.ComponentString E0(String str) {
        return new ComponentParam.ComponentString(str);
    }

    public final ComponentParam.ComponentStringList F0(List<String> list) {
        return new ComponentParam.ComponentStringList(list);
    }

    public final Map<String, Object> G0(Map<String, ? extends ComponentParam> map) {
        Set<Map.Entry<String, ? extends ComponentParam>> entrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a10 = gt.s.a(entry.getKey(), com.withpersona.sdk2.inquiry.ui.network.a.a((ComponentParam) entry.getValue()));
            linkedHashMap.put(a10.c(), a10.d());
        }
        return linkedHashMap;
    }

    public final void H0(final UiWorkflow.c.a rendering, final UiComponent component, final View view, Map<String, ? extends Object> componentParams, Map<String, UiComponentErrorInfo> errors, final ViewEnvironment viewEnvironment, Map<String, ? extends UiComponentConfig> componentNameToConfig) {
        ArrayList arrayList;
        InputFileUpload.Attributes attributes;
        List<InputFileUpload.PrefillItem> prefill;
        InputTextBasedComponentStyle documentNumberStyle;
        InputTextBasedComponentStyle cardAccessNumberStyle;
        String str;
        InputTextBasedComponentStyle styles;
        Map<String, UiComponentErrorInfo> map;
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        Map<String, UiComponentErrorInfo> map2 = errors;
        if (component instanceof CompleteButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: mr.l2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.g.I0(com.withpersona.sdk2.inquiry.ui.g.this, view2);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof SubmitButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: mr.x2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.g.J0(com.withpersona.sdk2.inquiry.ui.g.this, component, view, view2);
                }
            });
            buttonWithLoadingIndicator.setIsLoading(rendering.getIsLoading() && ((SubmitButtonComponent) component).getWasTapped());
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof ActionButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator2.setOnClickListener(new View.OnClickListener() { // from class: mr.y2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.g.K0(com.withpersona.sdk2.inquiry.ui.g.this, component, view, view2);
                }
            });
            buttonWithLoadingIndicator2.setIsLoading(rendering.getIsLoading() && ((ActionButtonComponent) component).getWasTapped());
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof LinkButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            final ButtonWithLoadingIndicator buttonWithLoadingIndicator3 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator3.setOnClickListener(new View.OnClickListener() { // from class: mr.a3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.g.L0(UiComponent.this, buttonWithLoadingIndicator3, view2);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof CancelButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: mr.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.g.M0(com.withpersona.sdk2.inquiry.ui.g.this, view2);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof VerifyPersonaButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() { // from class: mr.c3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    com.withpersona.sdk2.inquiry.ui.g.N0(com.withpersona.sdk2.inquiry.ui.g.this, component, view2);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator4 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator4 != null) {
                buttonWithLoadingIndicator4.setIsLoading(rendering.getIsLoading() && ((VerifyPersonaButtonComponent) component).getWasTapped());
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit = Unit.f22894a;
            return;
        }
        if (component instanceof InputTextComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout = (TextInputLayout) view;
            UiComponentErrorInfo uiComponentErrorInfo = map2.get(component.getName());
            UiComponentError a10 = uiComponentErrorInfo != null ? uiComponentErrorInfo.a(component.getLastValueUpdateTs()) : null;
            if (!(a10 instanceof UiComponentError.UiInputComponentError)) {
                a10 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError = (UiComponentError.UiInputComponentError) a10;
            kr.d.d(textInputLayout, uiInputComponentError != null ? uiInputComponentError.getMessage() : null, ((InputTextComponent) component).getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit2 = Unit.f22894a;
            return;
        }
        if (component instanceof InputTextAreaComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout2 = (TextInputLayout) view;
            UiComponentErrorInfo uiComponentErrorInfo2 = map2.get(component.getName());
            UiComponentError a11 = uiComponentErrorInfo2 != null ? uiComponentErrorInfo2.a(component.getLastValueUpdateTs()) : null;
            if (!(a11 instanceof UiComponentError.UiInputComponentError)) {
                a11 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError2 = (UiComponentError.UiInputComponentError) a11;
            kr.d.d(textInputLayout2, uiInputComponentError2 != null ? uiInputComponentError2.getMessage() : null, ((InputTextAreaComponent) component).getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit3 = Unit.f22894a;
            return;
        }
        if (component instanceof InputConfirmationCodeComponent) {
            ((InputConfirmationCodeComponent) component).getSubmitCodeHelper().c(new Function0() { // from class: mr.d3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit O0;
                    O0 = com.withpersona.sdk2.inquiry.ui.g.O0(view, rendering, this);
                    return O0;
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit4 = Unit.f22894a;
            return;
        }
        if (component instanceof InputAddressComponent) {
            Object tag = view.getTag();
            Intrinsics.d(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding");
            er.d dVar = (er.d) tag;
            List<View> n10 = p.n(dVar.f16200f, dVar.f16208n, dVar.b, dVar.f16207m, dVar.f16206l);
            InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
            UiComponentConfig uiComponentConfig = componentNameToConfig.get(inputAddressComponent.getName());
            Intrinsics.d(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
            InputAddress inputAddress = (InputAddress) uiComponentConfig;
            UiComponentErrorInfo uiComponentErrorInfo3 = map2.get(component.getName());
            UiComponentError a12 = uiComponentErrorInfo3 != null ? uiComponentErrorInfo3.a(component.getLastValueUpdateTs()) : null;
            if (!(a12 instanceof UiComponentError.UiInputAddressComponentError)) {
                a12 = null;
            }
            UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) a12;
            List<Suggestion> A = inputAddressComponent.A();
            if (A == null) {
                A = p.k();
            }
            List<Suggestion> list = A;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List<Suggestion> list2 = list;
            ArrayList arrayList2 = new ArrayList(q.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Suggestion) it.next()).toString());
            }
            List M0 = CollectionsKt.M0(arrayList2);
            InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
            zq.a aVar = new zq.a(context, R.layout.simple_list_item_1, M0, (styles2 == null || (inputTextStyle2 = styles2.getInputTextStyle()) == null) ? null : inputTextStyle2.getFocusedTextBasedStyle());
            MaterialAutoCompleteTextView addressFieldExpandedTextView = dVar.f16201g;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpandedTextView, "addressFieldExpandedTextView");
            P0(addressFieldExpandedTextView, aVar, n10, dVar, rendering, component, list);
            MaterialAutoCompleteTextView addressFieldCollapsedTextView = dVar.f16199e;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsedTextView, "addressFieldCollapsedTextView");
            P0(addressFieldCollapsedTextView, aVar, n10, dVar, rendering, component, list);
            if (Intrinsics.c(inputAddressComponent.getIsAddressAutocompleteLoading(), Boolean.FALSE)) {
                Iterator it2 = n10.iterator();
                while (it2.hasNext()) {
                    ((TextInputLayout) it2.next()).setEnabled(true);
                }
                dVar.f16213s.setVisibility(8);
            }
            if (uiInputAddressComponentError != null) {
                inputAddressComponent.K(Boolean.FALSE);
            }
            if (Intrinsics.c(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.FALSE)) {
                dVar.f16203i.setVisibility(8);
                dVar.f16204j.setVisibility(0);
                dVar.f16205k.setLabelFor(dVar.f16204j.getId());
            } else if (Intrinsics.c(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.TRUE) || inputAddressComponent.getIsAddressComponentsCollapsed() == null) {
                dVar.f16203i.setVisibility(0);
                dVar.f16204j.setVisibility(8);
                dVar.f16205k.setLabelFor(dVar.f16203i.getId());
            }
            e0(view, componentParams, component);
            for (View view2 : n10) {
                Intrinsics.checkNotNull(view2);
                d0(view2, componentParams, component, rendering.getIsLoading());
            }
            InputAddress.AddressComponentStyle styles3 = inputAddress.getStyles();
            TextBasedComponentStyle errorTextStyle = (styles3 == null || (inputTextStyle = styles3.getInputTextStyle()) == null) ? null : inputTextStyle.getErrorTextStyle();
            TextInputLayout addressFieldCollapsed = dVar.f16198d;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            kr.d.d(addressFieldCollapsed, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressFieldExpanded = dVar.f16200f;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            kr.d.d(addressFieldExpanded, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressSuite = dVar.f16208n;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            kr.d.d(addressSuite, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_2") : null, errorTextStyle);
            TextInputLayout addressCity = dVar.b;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            kr.d.d(addressCity, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("city") : null, errorTextStyle);
            TextInputLayout addressSubdivision = dVar.f16207m;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            kr.d.d(addressSubdivision, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("subdivision") : null, errorTextStyle);
            TextInputLayout addressPostalCode = dVar.f16206l;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            kr.d.d(addressPostalCode, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("postal_code") : null, errorTextStyle);
            Unit unit5 = Unit.f22894a;
            return;
        }
        if ((component instanceof InputSelectComponent) || (component instanceof InputMultiSelectComponent)) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            final TextInputLayout textInputLayout3 = (TextInputLayout) view;
            Intrinsics.d(component, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent");
            final w1 w1Var = (w1) component;
            final w3 w3Var = (w3) component;
            textInputLayout3.setOnClickListener(new View.OnClickListener() { // from class: mr.e3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    com.withpersona.sdk2.inquiry.ui.g.R0(com.withpersona.sdk2.inquiry.ui.g.this, textInputLayout3, w1Var, w3Var, view3);
                }
            });
            EditText editText = textInputLayout3.getEditText();
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() { // from class: mr.f3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        com.withpersona.sdk2.inquiry.ui.g.S0(com.withpersona.sdk2.inquiry.ui.g.this, textInputLayout3, w1Var, w3Var, view3);
                    }
                });
                Unit unit6 = Unit.f22894a;
            }
            EditText editText2 = textInputLayout3.getEditText();
            if (editText2 != null) {
                editText2.setText(CollectionsKt.m0(w3Var.getSelectedOptionsController().b(), "\n", null, null, 0, null, new Function1() { // from class: mr.g3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CharSequence T0;
                        T0 = com.withpersona.sdk2.inquiry.ui.g.T0((Option) obj);
                        return T0;
                    }
                }, 30, null));
                Unit unit7 = Unit.f22894a;
            }
            Option option = (Option) CollectionsKt.firstOrNull(w3Var.getSelectedOptionsController().b());
            jr.c.h(textInputLayout3, option != null ? option.getLeadingImageUrl() : null);
            UiComponentErrorInfo uiComponentErrorInfo4 = map2.get(component.getName());
            UiComponentError a13 = uiComponentErrorInfo4 != null ? uiComponentErrorInfo4.a(component.getLastValueUpdateTs()) : null;
            if (!(a13 instanceof UiComponentError.UiInputComponentError)) {
                a13 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError3 = (UiComponentError.UiInputComponentError) a13;
            String message = uiInputComponentError3 != null ? uiInputComponentError3.getMessage() : null;
            InputSelectBoxComponentStyle f19529a = w1Var.getF19529a();
            kr.d.d(textInputLayout3, message, f19529a != null ? f19529a.getErrorTextStyle() : null);
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit8 = Unit.f22894a;
            return;
        }
        if (component instanceof InputRadioGroupComponent) {
            Object tag2 = view.getTag();
            Intrinsics.d(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding");
            er.n nVar = (er.n) tag2;
            UiComponentErrorInfo uiComponentErrorInfo5 = map2.get(component.getName());
            UiComponentError a14 = uiComponentErrorInfo5 != null ? uiComponentErrorInfo5.a(component.getLastValueUpdateTs()) : null;
            if (!(a14 instanceof UiComponentError.UiInputComponentError)) {
                a14 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError4 = (UiComponentError.UiInputComponentError) a14;
            String message2 = uiInputComponentError4 != null ? uiInputComponentError4.getMessage() : null;
            TextView radioGroupError = nVar.f16243c;
            Intrinsics.checkNotNullExpressionValue(radioGroupError, "radioGroupError");
            if (message2 == null || StringsKt.p0(message2)) {
                radioGroupError.setVisibility(8);
                radioGroupError.setText("");
            } else {
                radioGroupError.setVisibility(0);
                radioGroupError.setText(message2);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            View findViewById = view.findViewById(yq.d.f36976u0);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            Iterator<View> it3 = u0.a((ViewGroup) findViewById).iterator();
            while (it3.hasNext()) {
                d0(it3.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit9 = Unit.f22894a;
            return;
        }
        if (component instanceof UiComponentGroup) {
            for (UiComponent uiComponent : ((UiComponentGroup) component).getChildren()) {
                View view3 = this.componentNameToView.get(uiComponent.getName());
                if (view3 != null) {
                    Map<String, UiComponentErrorInfo> map3 = map2;
                    H0(rendering, uiComponent, view3, componentParams, map3, viewEnvironment, componentNameToConfig);
                    map = map3;
                } else {
                    map = map2;
                }
                map2 = map;
            }
            if ((component instanceof ClickableStackComponent) && (view instanceof ConstraintLayout)) {
                r0(rendering, (ClickableStackComponent) component, (ConstraintLayout) view);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit10 = Unit.f22894a;
            return;
        }
        if (component instanceof MdocComponent) {
            Object tag3 = view.getTag();
            Intrinsics.d(tag3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponentViewHolder");
            v3 v3Var = (v3) tag3;
            String errorText = ((MdocComponent) component).getErrorText();
            v3Var.getLaunchButton().setOnClickListener(new View.OnClickListener() { // from class: mr.m2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    com.withpersona.sdk2.inquiry.ui.g.U0(UiComponent.this, view, view4);
                }
            });
            c0(v3Var.getLaunchButton(), componentParams, component, rendering.getIsLoading());
            UiComponentErrorInfo uiComponentErrorInfo6 = map2.get(component.getName());
            UiComponentError a15 = uiComponentErrorInfo6 != null ? uiComponentErrorInfo6.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError5 = (UiComponentError.UiInputComponentError) (!(a15 instanceof UiComponentError.UiInputComponentError) ? null : a15);
            if (uiInputComponentError5 != null) {
                errorText = uiInputComponentError5.getMessage();
            }
            if (errorText == null || StringsKt.p0(errorText)) {
                v3Var.getErrorLabel().setVisibility(8);
                Unit unit11 = Unit.f22894a;
                return;
            } else {
                TextView errorLabel = v3Var.getErrorLabel();
                errorLabel.setText(errorText);
                errorLabel.setVisibility(0);
                return;
            }
        }
        if (component instanceof ButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() { // from class: mr.n2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    com.withpersona.sdk2.inquiry.ui.g.V0(com.withpersona.sdk2.inquiry.ui.g.this, component, view, view4);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator5 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator5 != null) {
                buttonWithLoadingIndicator5.setIsLoading(rendering.getIsLoading() && ((ButtonComponent) component).getWasTapped());
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit12 = Unit.f22894a;
            return;
        }
        if (component instanceof InputDateComponent) {
            Object tag4 = view.getTag();
            Intrinsics.d(tag4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
            er.f fVar = (er.f) tag4;
            UiComponentErrorInfo uiComponentErrorInfo7 = map2.get(component.getName());
            UiComponentError a16 = uiComponentErrorInfo7 != null ? uiComponentErrorInfo7.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError6 = (UiComponentError.UiInputComponentError) (!(a16 instanceof UiComponentError.UiInputComponentError) ? null : a16);
            if (uiInputComponentError6 != null) {
                fVar.f16220f.setError(uiInputComponentError6.getMessage());
                fVar.f16217c.setError(uiInputComponentError6.getMessage());
                fVar.f16222h.setError(uiInputComponentError6.getMessage());
                fVar.f16219e.setText(uiInputComponentError6.getMessage());
                fVar.f16219e.setVisibility(0);
            } else {
                fVar.f16220f.setError("");
                fVar.f16217c.setError("");
                fVar.f16222h.setError("");
                fVar.f16219e.setText("");
                fVar.f16219e.setVisibility(8);
            }
            e0(view, componentParams, component);
            View month = fVar.f16220f;
            Intrinsics.checkNotNullExpressionValue(month, "month");
            d0(month, componentParams, component, rendering.getIsLoading());
            View day = fVar.f16217c;
            Intrinsics.checkNotNullExpressionValue(day, "day");
            d0(day, componentParams, component, rendering.getIsLoading());
            View year = fVar.f16222h;
            Intrinsics.checkNotNullExpressionValue(year, "year");
            d0(year, componentParams, component, rendering.getIsLoading());
            Unit unit13 = Unit.f22894a;
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            Object tag5 = view.getTag();
            Intrinsics.d(tag5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding");
            er.q qVar = (er.q) tag5;
            UiComponentErrorInfo uiComponentErrorInfo8 = map2.get(component.getName());
            UiComponentError a17 = uiComponentErrorInfo8 != null ? uiComponentErrorInfo8.a(component.getLastValueUpdateTs()) : null;
            if (!(a17 instanceof UiComponentError.UiInputInternationalDbComponentError)) {
                a17 = null;
            }
            UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiComponentError.UiInputInternationalDbComponentError) a17;
            Map<String, String> message3 = uiInputInternationalDbComponentError != null ? uiInputInternationalDbComponentError.getMessage() : null;
            com.withpersona.sdk2.inquiry.steps.ui.components.a.n((InputInternationalDbComponent) component, qVar, new Function0() { // from class: mr.p2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit W0;
                    W0 = com.withpersona.sdk2.inquiry.ui.g.W0(UiComponent.this, this);
                    return W0;
                }
            }, new Function0() { // from class: mr.q2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit Y0;
                    Y0 = com.withpersona.sdk2.inquiry.ui.g.Y0(UiComponent.this, this);
                    return Y0;
                }
            }, message3 != null ? message3.get("idb_country") : null, message3 != null ? message3.get("idb_type") : null, message3 != null ? message3.get("idb_value") : null);
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit14 = Unit.f22894a;
            return;
        }
        if (component instanceof InputMaskedTextComponent) {
            UiComponentErrorInfo uiComponentErrorInfo9 = map2.get(component.getName());
            UiComponentError a18 = uiComponentErrorInfo9 != null ? uiComponentErrorInfo9.a(component.getLastValueUpdateTs()) : null;
            if (!(a18 instanceof UiComponentError.UiInputComponentError)) {
                a18 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError7 = (UiComponentError.UiInputComponentError) a18;
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout4 = (TextInputLayout) view;
            String message4 = uiInputComponentError7 != null ? uiInputComponentError7.getMessage() : null;
            InputTextBasedComponentStyle styles4 = ((InputMaskedTextComponent) component).getStyles();
            kr.d.d(textInputLayout4, message4, styles4 != null ? styles4.getErrorTextStyle() : null);
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit15 = Unit.f22894a;
            return;
        }
        if (component instanceof InputPhoneNumberComponent) {
            Object tag6 = view.getTag();
            Intrinsics.d(tag6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding");
            er.m mVar = (er.m) tag6;
            UiComponentErrorInfo uiComponentErrorInfo10 = map2.get(component.getName());
            UiComponentError a19 = uiComponentErrorInfo10 != null ? uiComponentErrorInfo10.a(component.getLastValueUpdateTs()) : null;
            if (!(a19 instanceof UiComponentError.UiInputComponentError)) {
                a19 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError8 = (UiComponentError.UiInputComponentError) a19;
            TextInputLayout inputLayout = mVar.b;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            String message5 = uiInputComponentError8 != null ? uiInputComponentError8.getMessage() : null;
            InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
            kr.d.d(inputLayout, message5, inputPhoneNumberComponent.getErrorTextStyle());
            p1.e(inputPhoneNumberComponent, mVar, new Function0() { // from class: mr.r2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit c12;
                    c12 = com.withpersona.sdk2.inquiry.ui.g.c1(UiComponent.this, this);
                    return c12;
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit16 = Unit.f22894a;
            return;
        }
        if (component instanceof InputNumberComponent) {
            UiComponentErrorInfo uiComponentErrorInfo11 = map2.get(component.getName());
            UiComponentError a20 = uiComponentErrorInfo11 != null ? uiComponentErrorInfo11.a(component.getLastValueUpdateTs()) : null;
            if (!(a20 instanceof UiComponentError.UiInputComponentError)) {
                a20 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError9 = (UiComponentError.UiInputComponentError) a20;
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout5 = (TextInputLayout) view;
            String message6 = uiInputComponentError9 != null ? uiInputComponentError9.getMessage() : null;
            UiComponentConfig uiComponentConfig2 = componentNameToConfig.get(((InputNumberComponent) component).getName());
            InputNumber inputNumber = uiComponentConfig2 instanceof InputNumber ? (InputNumber) uiComponentConfig2 : null;
            kr.d.d(textInputLayout5, message6, (inputNumber == null || (styles = inputNumber.getStyles()) == null) ? null : styles.getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit17 = Unit.f22894a;
            return;
        }
        if (component instanceof InputCurrencyComponent) {
            UiComponentErrorInfo uiComponentErrorInfo12 = map2.get(component.getName());
            UiComponentError a21 = uiComponentErrorInfo12 != null ? uiComponentErrorInfo12.a(component.getLastValueUpdateTs()) : null;
            if (!(a21 instanceof UiComponentError.UiInputComponentError)) {
                a21 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError10 = (UiComponentError.UiInputComponentError) a21;
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            kr.d.d((TextInputLayout) view, uiInputComponentError10 != null ? uiInputComponentError10.getMessage() : null, ((InputCurrencyComponent) component).getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit18 = Unit.f22894a;
            return;
        }
        if (component instanceof InputCheckboxComponent) {
            Object tag7 = view.getTag();
            Intrinsics.d(tag7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding");
            er.i iVar = (er.i) tag7;
            UiComponentErrorInfo uiComponentErrorInfo13 = map2.get(component.getName());
            UiComponentError a22 = uiComponentErrorInfo13 != null ? uiComponentErrorInfo13.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError11 = (UiComponentError.UiInputComponentError) (!(a22 instanceof UiComponentError.UiInputComponentError) ? null : a22);
            if (uiInputComponentError11 != null) {
                iVar.f16230d.setText(uiInputComponentError11.getMessage());
                iVar.f16230d.setVisibility(0);
            } else {
                iVar.f16230d.setText("");
                iVar.f16230d.setVisibility(8);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit19 = Unit.f22894a;
            return;
        }
        if (component instanceof InputCheckboxGroupComponent) {
            Object tag8 = view.getTag();
            Intrinsics.d(tag8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding");
            er.j jVar = (er.j) tag8;
            UiComponentErrorInfo uiComponentErrorInfo14 = map2.get(component.getName());
            UiComponentError a23 = uiComponentErrorInfo14 != null ? uiComponentErrorInfo14.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError12 = (UiComponentError.UiInputComponentError) (!(a23 instanceof UiComponentError.UiInputComponentError) ? null : a23);
            if (uiInputComponentError12 != null) {
                jVar.f16233c.setText(uiInputComponentError12.getMessage());
                jVar.f16233c.setVisibility(0);
            } else {
                jVar.f16233c.setText("");
                jVar.f16233c.setVisibility(8);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            View findViewById2 = view.findViewById(yq.d.f36969r);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            Iterator<View> it4 = u0.a((ViewGroup) findViewById2).iterator();
            while (it4.hasNext()) {
                d0(it4.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit20 = Unit.f22894a;
            return;
        }
        if (component instanceof ESignatureComponent) {
            Object tag9 = view.getTag();
            Intrinsics.d(tag9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            w wVar = (w) tag9;
            ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
            UiComponentConfig uiComponentConfig3 = componentNameToConfig.get(eSignatureComponent.getName());
            Intrinsics.d(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
            final ESignature eSignature = (ESignature) uiComponentConfig3;
            UiComponentErrorInfo uiComponentErrorInfo15 = map2.get(component.getName());
            UiComponentError a24 = uiComponentErrorInfo15 != null ? uiComponentErrorInfo15.a(component.getLastValueUpdateTs()) : null;
            if (!(a24 instanceof UiComponentError.UiInputComponentError)) {
                a24 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError13 = (UiComponentError.UiInputComponentError) a24;
            if (uiInputComponentError13 != null) {
                wVar.f16268d.setText(uiInputComponentError13.getMessage());
                wVar.f16268d.setVisibility(0);
            } else {
                wVar.f16268d.setText("");
                wVar.f16268d.setVisibility(8);
            }
            ESignature.Attributes attributes2 = eSignature.getAttributes();
            if ((attributes2 != null ? attributes2.getLabel() : null) != null) {
                TextView textView = wVar.f16269e;
                ESignature.Attributes attributes3 = eSignature.getAttributes();
                textView.setText(attributes3 != null ? attributes3.getLabel() : null);
                wVar.f16269e.setVisibility(0);
            } else {
                wVar.f16269e.setText("");
                wVar.f16269e.setVisibility(8);
            }
            Bitmap b10 = eSignatureComponent.getBitmapController().b();
            if (b10 == null) {
                Object tag10 = view.getTag();
                Intrinsics.d(tag10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((w) tag10).b.setVisibility(0);
                Object tag11 = view.getTag();
                Intrinsics.d(tag11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                TextView textView2 = ((w) tag11).b;
                ESignature.Attributes attributes4 = eSignature.getAttributes();
                if (attributes4 == null || (str = attributes4.getPlaceholder()) == null) {
                    str = "+ Add signature";
                }
                textView2.setText(str);
                Object tag12 = view.getTag();
                Intrinsics.d(tag12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((w) tag12).f16271g.setVisibility(8);
                Object tag13 = view.getTag();
                Intrinsics.d(tag13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((w) tag13).f16267c.setVisibility(8);
            } else {
                Object tag14 = view.getTag();
                Intrinsics.d(tag14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((w) tag14).f16271g.setImageBitmap(b10);
                Object tag15 = view.getTag();
                Intrinsics.d(tag15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((w) tag15).b.setVisibility(8);
                Object tag16 = view.getTag();
                Intrinsics.d(tag16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((w) tag16).f16271g.setVisibility(0);
                Object tag17 = view.getTag();
                Intrinsics.d(tag17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((w) tag17).f16267c.setVisibility(0);
            }
            wVar.f16270f.setOnClickListener(new View.OnClickListener() { // from class: mr.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    com.withpersona.sdk2.inquiry.ui.g.g1(com.withpersona.sdk2.inquiry.ui.g.this, component, eSignature, rendering, viewEnvironment, view4);
                }
            });
            e0(view, componentParams, component);
            View signatureContainer = wVar.f16270f;
            Intrinsics.checkNotNullExpressionValue(signatureContainer, "signatureContainer");
            d0(signatureContainer, componentParams, component, rendering.getIsLoading());
            Unit unit21 = Unit.f22894a;
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            Object tag18 = view.getTag();
            Intrinsics.d(tag18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder");
            ar.w wVar2 = (ar.w) tag18;
            ButtonWithLoadingIndicator launchButton = wVar2.getLaunchButton();
            launchButton.setIsLoading(rendering.getIsLoading() && ((GovernmentIdNfcScanComponent) component).getWasTapped());
            c0(launchButton, componentParams, component, rendering.getIsLoading());
            launchButton.setOnClickListener(new View.OnClickListener() { // from class: mr.t2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    com.withpersona.sdk2.inquiry.ui.g.i1(com.withpersona.sdk2.inquiry.ui.g.this, component, view4);
                }
            });
            View tipsButton = wVar2.getTipsButton();
            if (tipsButton != null) {
                tipsButton.setOnClickListener(new View.OnClickListener() { // from class: mr.u2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        com.withpersona.sdk2.inquiry.ui.g.j1(UiWorkflow.c.a.this, this, view4);
                    }
                });
                Unit unit22 = Unit.f22894a;
            }
            UiComponentErrorInfo uiComponentErrorInfo16 = map2.get(component.getName());
            UiComponentError a25 = uiComponentErrorInfo16 != null ? uiComponentErrorInfo16.a(component.getLastValueUpdateTs()) : null;
            if (a25 == null) {
                a25 = null;
            }
            if (a25 instanceof UiComponentError.UiInputComponentError) {
                TextView errorLabel2 = wVar2.getErrorLabel();
                errorLabel2.setText(((UiComponentError.UiInputComponentError) a25).getMessage());
                errorLabel2.setVisibility(0);
                return;
            }
            if (!(a25 instanceof UiComponentError.UiGovernmentIdNfcScanComponentError)) {
                wVar2.getErrorLabel().setVisibility(8);
                Unit unit23 = Unit.f22894a;
                return;
            }
            TextInputLayout cardAccessNumber = wVar2.getCardAccessNumber();
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) a25;
            String str2 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.cardAccessNumberName);
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = governmentIdNfcScanComponent.getConfig().getStyles();
            kr.d.d(cardAccessNumber, str2, (styles5 == null || (cardAccessNumberStyle = styles5.getCardAccessNumberStyle()) == null) ? null : cardAccessNumberStyle.getErrorTextStyle());
            TextInputLayout documentNumber = wVar2.getDocumentNumber();
            String str3 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.documentNumberName);
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles6 = governmentIdNfcScanComponent.getConfig().getStyles();
            kr.d.d(documentNumber, str3, (styles6 == null || (documentNumberStyle = styles6.getDocumentNumberStyle()) == null) ? null : documentNumberStyle.getErrorTextStyle());
            wVar2.getDateOfBirthBinding().f16219e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.dateOfBirthName));
            wVar2.getDateOfBirthBinding().f16219e.setVisibility(0);
            wVar2.getExpirationDateBinding().f16219e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.expirationDateName));
            wVar2.getExpirationDateBinding().f16219e.setVisibility(0);
            Unit unit24 = Unit.f22894a;
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            Object tag19 = view.getTag();
            Intrinsics.d(tag19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanViewHolder");
            f2 f2Var = (f2) tag19;
            ButtonWithLoadingIndicator scanButton = f2Var.getScanButton();
            scanButton.setIsLoading(rendering.getIsLoading() && ((JpMyNumberNfcScanComponent) component).getWasTapped());
            c0(scanButton, componentParams, component, rendering.getIsLoading());
            if (((JpMyNumberNfcScanComponent) component).getValidOperation() == null) {
                scanButton.setEnabled(false);
            } else {
                scanButton.setOnClickListener(new View.OnClickListener() { // from class: mr.v2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        com.withpersona.sdk2.inquiry.ui.g.k1(com.withpersona.sdk2.inquiry.ui.g.this, component, view4);
                    }
                });
            }
            UiComponentErrorInfo uiComponentErrorInfo17 = map2.get(component.getName());
            UiComponentError a26 = uiComponentErrorInfo17 != null ? uiComponentErrorInfo17.a(component.getLastValueUpdateTs()) : null;
            UiComponentError uiComponentError = a26 == null ? null : a26;
            if (!(uiComponentError instanceof UiComponentError.UiInputComponentError)) {
                f2Var.getErrorLabel().setVisibility(8);
                Unit unit25 = Unit.f22894a;
                return;
            } else {
                TextView errorLabel3 = f2Var.getErrorLabel();
                errorLabel3.setText(((UiComponentError.UiInputComponentError) uiComponentError).getMessage());
                errorLabel3.setVisibility(0);
                return;
            }
        }
        if ((component instanceof CreatePersonaSheetComponent) || (component instanceof ImagePreviewComponent) || (component instanceof LocalImageComponent) || (component instanceof PrivacyPolicyComponent) || (component instanceof QRCodeComponent) || (component instanceof RemoteImageComponent) || (component instanceof SpacerComponent) || (component instanceof TextComponent) || (component instanceof TitleComponent) || (component instanceof BrandingComponent)) {
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit26 = Unit.f22894a;
            return;
        }
        if (!(component instanceof InputFileUploadComponent)) {
            if (component instanceof PhoneNumberSnaComponent) {
                Unit unit27 = Unit.f22894a;
                return;
            } else {
                if (!(component instanceof HelpBottomSheetComponent)) {
                    throw new gt.l();
                }
                Unit unit28 = Unit.f22894a;
                return;
            }
        }
        Object tag20 = view.getTag();
        Intrinsics.d(tag20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputFileUploadBinding");
        er.k kVar = (er.k) tag20;
        InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
        UiComponentConfig uiComponentConfig4 = componentNameToConfig.get(inputFileUploadComponent.getName());
        InputFileUpload inputFileUpload = uiComponentConfig4 instanceof InputFileUpload ? (InputFileUpload) uiComponentConfig4 : null;
        if (!inputFileUploadComponent.k().isEmpty()) {
            kVar.f16236c.setText(CollectionsKt.m0(inputFileUploadComponent.k(), ", ", null, null, 0, null, new Function1() { // from class: mr.w2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence l12;
                    l12 = com.withpersona.sdk2.inquiry.ui.g.l1((SelectedFile) obj);
                    return l12;
                }
            }, 30, null));
            kVar.f16236c.setVisibility(0);
        } else if (inputFileUploadComponent.getHasPrefill()) {
            if (inputFileUpload == null || (attributes = inputFileUpload.getAttributes()) == null || (prefill = attributes.getPrefill()) == null) {
                arrayList = null;
            } else {
                List<InputFileUpload.PrefillItem> list3 = prefill;
                ArrayList arrayList3 = new ArrayList(q.u(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((InputFileUpload.PrefillItem) it5.next()).getFilename());
                }
                arrayList = arrayList3;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                kVar.f16236c.setText(tp.g.f32397o);
                kVar.f16236c.setVisibility(0);
            } else {
                kVar.f16236c.setText(CollectionsKt.m0(arrayList, ", ", null, null, 0, null, null, 62, null));
                kVar.f16236c.setVisibility(0);
            }
        } else {
            kVar.f16236c.setText(tp.g.f32397o);
            kVar.f16236c.setVisibility(0);
        }
        UiComponentErrorInfo uiComponentErrorInfo18 = map2.get(component.getName());
        UiComponentError a27 = uiComponentErrorInfo18 != null ? uiComponentErrorInfo18.a(component.getLastValueUpdateTs()) : null;
        UiComponentError.UiInputComponentError uiInputComponentError14 = (UiComponentError.UiInputComponentError) (!(a27 instanceof UiComponentError.UiInputComponentError) ? null : a27);
        if (uiInputComponentError14 != null) {
            kVar.f16237d.setText(uiInputComponentError14.getMessage());
            kVar.f16237d.setVisibility(0);
        } else {
            kVar.f16237d.setText("");
            kVar.f16237d.setVisibility(8);
        }
        c0(view, componentParams, component, rendering.getIsLoading());
        Unit unit29 = Unit.f22894a;
    }

    public final void c0(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z10) {
        e0(view, map, uiComponent);
        d0(view, map, uiComponent, z10);
    }

    public final void d0(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z10) {
        Boolean value;
        if (uiComponent instanceof ar.o) {
            JsonLogicBoolean disabled = ((ar.o) uiComponent).getDisabled();
            boolean z11 = false;
            boolean booleanValue = (disabled == null || (value = disabled.getValue(map, map.get(uiComponent.getName()), i0())) == null) ? false : value.booleanValue();
            if (!z10 && !booleanValue) {
                z11 = true;
            }
            view.setEnabled(z11);
            view.requestLayout();
        }
    }

    public final void e0(View view, Map<String, ? extends Object> map, UiComponent uiComponent) {
        Boolean value;
        if (uiComponent instanceof x) {
            x xVar = (x) uiComponent;
            JsonLogicBoolean hidden = xVar.getHidden();
            boolean z10 = ((hidden == null || (value = hidden.getValue(map, map.get(uiComponent.getName()), i0())) == null) ? false : value.booleanValue()) || ((uiComponent instanceof TitleComponent) && ((TitleComponent) uiComponent).getIsTextBlank());
            view.setVisibility(z10 ? 8 : 0);
            Iterator<T> it = xVar.i().iterator();
            while (it.hasNext()) {
                ((kr.a) it.next()).a(map, z10, i0());
            }
        }
    }

    public final void f0(List<? extends UiComponent> components, Map<String, ? extends Object> componentParams, boolean isLoading) {
        for (UiComponent uiComponent : components) {
            View view = this.componentNameToView.get(uiComponent.getName());
            if (view != null) {
                c0(view, componentParams, uiComponent, isLoading);
                if (uiComponent instanceof UiComponentGroup) {
                    f0(((UiComponentGroup) uiComponent).getChildren(), componentParams, isLoading);
                }
            }
        }
    }

    public final void g0(yq.g result, List<? extends UiComponent> components) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : components) {
            if (obj instanceof FooterComponent) {
                arrayList.add(obj);
            }
        }
        FooterComponent footerComponent = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        if (footerComponent == null) {
            return;
        }
        Integer firstBelowTheFoldChildIndex = footerComponent.getFirstBelowTheFoldChildIndex();
        if (firstBelowTheFoldChildIndex != null) {
            u0(result, firstBelowTheFoldChildIndex.intValue(), footerComponent);
        } else {
            this.binding.f27319c.addView(result.getFooterView());
        }
    }

    public final Map<String, ComponentParam> h0(List<ComponentView> components) {
        LinkedHashMap linkedHashMap;
        Map<String, ? extends Object> j10 = kotlin.collections.k0.j();
        int i10 = 0;
        while (true) {
            linkedHashMap = new LinkedHashMap();
            p0(j10, linkedHashMap, components);
            Map<String, ? extends Object> G0 = G0(linkedHashMap);
            if (Intrinsics.c(j10, G0) || i10 >= 20) {
                break;
            }
            i10++;
            j10 = G0;
        }
        return linkedHashMap;
    }

    public final Map<String, Object> i0() {
        return j0.g(gt.s.a("scrolled_to_bottom_of_screen", Boolean.valueOf(this.hasScrolledToBottom)));
    }

    public final void o1(final UiWorkflow.c.a rendering, ViewEnvironment viewEnvironment, final SheetComponent component, Map<String, ? extends Object> componentParams, Map<String, UiComponentErrorInfo> errors) {
        yq.h viewBindings;
        Map<String, ComponentView> a10;
        if (!(component instanceof CreatePersonaSheetComponent)) {
            throw new gt.l();
        }
        CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = ((CreatePersonaSheetComponent) component).getCtaCard().getComponentNameMapping();
        List<Pair<String, Function1<UiComponent, Unit>>> b10 = new NestedUiStep.a().a(componentNameMapping != null ? componentNameMapping.getStartButton() : null, new Function1() { // from class: mr.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit p12;
                p12 = com.withpersona.sdk2.inquiry.ui.g.p1(UiWorkflow.c.a.this, component, (UiComponent) obj);
                return p12;
            }
        }).a(componentNameMapping != null ? componentNameMapping.getDismissButton() : null, new Function1() { // from class: mr.j2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit q12;
                q12 = com.withpersona.sdk2.inquiry.ui.g.q1(com.withpersona.sdk2.inquiry.ui.g.this, (UiComponent) obj);
                return q12;
            }
        }).b();
        yq.g e10 = this.nestedUiBottomSheetController.e();
        if (e10 == null || (viewBindings = e10.getViewBindings()) == null || (a10 = viewBindings.a()) == null) {
            return;
        }
        for (Map.Entry<String, ComponentView> entry : a10.entrySet()) {
            H0(rendering, entry.getValue().c(), entry.getValue().d(), componentParams, errors, viewEnvironment, this.componentNameToConfig);
        }
        for (Pair<String, Function1<UiComponent, Unit>> pair : b10) {
            String c10 = pair.c();
            final Function1<UiComponent, Unit> d10 = pair.d();
            final ComponentView componentView = a10.get(c10);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: mr.k2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.withpersona.sdk2.inquiry.ui.g.r1(Function1.this, componentView, view);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(Map<String, ? extends Object> initialComponentValues, Map<String, ComponentParam> outMap, List<ComponentView> componentViews) {
        File a10;
        byte[] g10;
        File a11;
        byte[] g11;
        File a12;
        byte[] g12;
        Map<String, String> g13;
        Boolean value;
        for (ComponentView componentView : componentViews) {
            UiComponent component = componentView.getComponent();
            componentView.getView();
            r2 = null;
            LinkedHashMap linkedHashMap = null;
            r2 = null;
            r2 = null;
            String str = null;
            x xVar = component instanceof x ? (x) component : null;
            JsonLogicBoolean hidden = xVar != null ? xVar.getHidden() : null;
            if (!((hidden == null || (value = hidden.getValue(initialComponentValues, initialComponentValues.get(component.getName()), i0())) == null) ? false : value.booleanValue())) {
                if (component instanceof InputTextComponent) {
                    InputTextComponent inputTextComponent = (InputTextComponent) component;
                    outMap.put(inputTextComponent.getName(), E0(inputTextComponent.getTextController().b()));
                } else if (component instanceof InputTextAreaComponent) {
                    InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) component;
                    outMap.put(inputTextAreaComponent.getName(), E0(inputTextAreaComponent.getTextController().b()));
                } else if (component instanceof InputPhoneNumberComponent) {
                    InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                    String h10 = cr.f.f14165a.h((Option) CollectionsKt.d0(inputPhoneNumberComponent.getCountryCodeOptionsController().b()));
                    outMap.put(inputPhoneNumberComponent.getName(), E0(h10 + " " + inputPhoneNumberComponent.getTextController().b()));
                } else if (component instanceof InputConfirmationCodeComponent) {
                    InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) component;
                    outMap.put(inputConfirmationCodeComponent.getName(), E0(inputConfirmationCodeComponent.getTextController().b()));
                } else if (component instanceof InputDateComponent) {
                    InputDateComponent inputDateComponent = (InputDateComponent) component;
                    outMap.put(inputDateComponent.getName(), E0(inputDateComponent.getDateController().f()));
                } else if (component instanceof InputInternationalDbComponent) {
                    InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
                    outMap.put(inputInternationalDbComponent.getName(), new ComponentParam.InternationalDbParams(inputInternationalDbComponent.getSelectedCountry(), inputInternationalDbComponent.getSelectedIdType(), inputInternationalDbComponent.getIdValue()));
                } else if (component instanceof InputMaskedTextComponent) {
                    InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) component;
                    outMap.put(inputMaskedTextComponent.getName(), E0(inputMaskedTextComponent.getTextController().b()));
                } else if (component instanceof InputSelectComponent) {
                    InputSelectComponent inputSelectComponent = (InputSelectComponent) component;
                    if (!inputSelectComponent.m().isEmpty()) {
                        outMap.put(inputSelectComponent.getName(), E0(((Option) CollectionsKt.d0(inputSelectComponent.m())).getValue()));
                    }
                } else if (component instanceof InputMultiSelectComponent) {
                    InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) component;
                    if (!inputMultiSelectComponent.m().isEmpty()) {
                        String name = inputMultiSelectComponent.getName();
                        List<Option> m10 = inputMultiSelectComponent.m();
                        ArrayList arrayList = new ArrayList(q.u(m10, 10));
                        Iterator<T> it = m10.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Option) it.next()).getValue());
                        }
                        outMap.put(name, F0(arrayList));
                    }
                } else if (component instanceof InputAddressComponent) {
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                    outMap.put(inputAddressComponent.getName(), new ComponentParam.Address(inputAddressComponent.getTextControllerForAddressStreet1().b(), inputAddressComponent.getTextControllerForAddressStreet2().b(), inputAddressComponent.getTextControllerForAddressCity().b(), inputAddressComponent.getTextControllerForAddressSubdivision().b(), inputAddressComponent.getTextControllerForAddressPostalCode().b()));
                } else if (component instanceof UiComponentGroup) {
                    List<UiComponent> children = ((UiComponentGroup) component).getChildren();
                    ArrayList arrayList2 = new ArrayList();
                    for (UiComponent uiComponent : children) {
                        View view = this.componentNameToView.get(uiComponent.getName());
                        ComponentView componentView2 = view == null ? null : new ComponentView(uiComponent, view);
                        if (componentView2 != null) {
                            arrayList2.add(componentView2);
                        }
                    }
                    p0(initialComponentValues, outMap, arrayList2);
                } else if (component instanceof InputCheckboxComponent) {
                    InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) component;
                    outMap.put(inputCheckboxComponent.getName(), new ComponentParam.ComponentBoolean(inputCheckboxComponent.getTwoStateViewController().b()));
                } else if (component instanceof InputCheckboxGroupComponent) {
                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) component;
                    outMap.put(inputCheckboxGroupComponent.getName(), F0(CollectionsKt.M0(inputCheckboxGroupComponent.k())));
                } else if (component instanceof InputRadioGroupComponent) {
                    InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) component;
                    outMap.put(inputRadioGroupComponent.getName(), new ComponentParam.ComponentString(inputRadioGroupComponent.getTextController().b()));
                } else if (component instanceof InputNumberComponent) {
                    InputNumberComponent inputNumberComponent = (InputNumberComponent) component;
                    Number b10 = inputNumberComponent.getNumberController().b();
                    if (b10 != null) {
                        outMap.put(inputNumberComponent.getName(), D0(b10));
                    }
                } else if (component instanceof InputCurrencyComponent) {
                    InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) component;
                    Number b11 = inputCurrencyComponent.getNumberController().b();
                    if (b11 != null) {
                        outMap.put(inputCurrencyComponent.getName(), D0(b11));
                    }
                } else if (component instanceof ESignatureComponent) {
                    ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
                    Bitmap b12 = eSignatureComponent.getBitmapController().b();
                    outMap.put(eSignatureComponent.getName(), new ComponentParam.ESignature(b12 != null ? cr.h.g(b12) : null));
                } else if (component instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
                    GovernmentIdNfcData b13 = governmentIdNfcScanComponent.getNfcDataController().b();
                    if (b13 != null) {
                        Uri dg1Uri = b13.getDg1Uri();
                        String encodeToString = (dg1Uri == null || (a12 = t2.c.a(dg1Uri)) == null || (g12 = tt.i.g(a12)) == null) ? null : Base64.encodeToString(g12, 0);
                        Uri dg2Uri = b13.getDg2Uri();
                        String encodeToString2 = (dg2Uri == null || (a11 = t2.c.a(dg2Uri)) == null || (g11 = tt.i.g(a11)) == null) ? null : Base64.encodeToString(g11, 0);
                        Uri sodUri = b13.getSodUri();
                        if (sodUri != null && (a10 = t2.c.a(sodUri)) != null && (g10 = tt.i.g(a10)) != null) {
                            str = Base64.encodeToString(g10, 0);
                        }
                        outMap.put(governmentIdNfcScanComponent.getName(), new ComponentParam.GovernmentIdNfcScan(encodeToString, encodeToString2, str, b13.getChipAuthenticationStatus()));
                    }
                } else if (component instanceof JpMyNumberNfcScanComponent) {
                    JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
                    JpMyNumberNfcScanResult b14 = jpMyNumberNfcScanComponent.getScanResultController().b();
                    if (b14 != null && (g13 = b14.g()) != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry : g13.entrySet()) {
                            if ((entry.getValue().length() > 0) != false) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (!(linkedHashMap == null || linkedHashMap.isEmpty())) {
                        outMap.put(jpMyNumberNfcScanComponent.getName(), new ComponentParam.JpMyNumberNfcScanParams(linkedHashMap));
                    }
                } else if (component instanceof MdocComponent) {
                    MdocComponent mdocComponent = (MdocComponent) component;
                    String b15 = mdocComponent.getMdocDataController().b();
                    if (!StringsKt.p0(b15)) {
                        outMap.put(mdocComponent.getName(), E0(b15));
                    }
                } else if (component instanceof InputFileUploadComponent) {
                    InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
                    String name2 = inputFileUploadComponent.getName();
                    List<SelectedFile> k10 = inputFileUploadComponent.k();
                    ArrayList arrayList3 = new ArrayList(q.u(k10, 10));
                    Iterator<T> it2 = k10.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((SelectedFile) it2.next()).getUri());
                    }
                    outMap.put(name2, new ComponentParam.FileUpload(arrayList3, inputFileUploadComponent.getHasPrefill()));
                } else if (!(component instanceof ActionButtonComponent) && !(component instanceof CancelButtonComponent) && !(component instanceof CombinedStepButtonComponent) && !(component instanceof CompleteButtonComponent) && !(component instanceof LinkButtonComponent) && !(component instanceof SubmitButtonComponent) && !(component instanceof ImagePreviewComponent) && !(component instanceof LocalImageComponent) && !(component instanceof PrivacyPolicyComponent) && !(component instanceof QRCodeComponent) && !(component instanceof RemoteImageComponent) && !(component instanceof SpacerComponent) && !(component instanceof TextComponent) && !(component instanceof TitleComponent) && !(component instanceof BrandingComponent) && !(component instanceof CreatePersonaSheetComponent) && !(component instanceof VerifyPersonaButtonComponent) && !(component instanceof HelpBottomSheetComponent) && !(component instanceof PhoneNumberSnaComponent)) {
                    throw new gt.l();
                }
            }
        }
    }

    public final void q0(UiWorkflow.c.a rendering) {
        List<UiComponent> f10 = rendering.f();
        ArrayList arrayList = new ArrayList();
        for (UiComponent uiComponent : f10) {
            View view = this.componentNameToView.get(uiComponent.getName());
            ComponentView componentView = view == null ? null : new ComponentView(uiComponent, view);
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        f0(rendering.f(), G0(h0(arrayList)), rendering.getIsLoading());
    }

    public final void r0(UiWorkflow.c.a rendering, final ClickableStackComponent component, final ConstraintLayout view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: mr.o3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                com.withpersona.sdk2.inquiry.ui.g.s0(ClickableStackComponent.this, this, view, view2);
            }
        });
        if (component.getIsActive()) {
            r.a(view, component.getStyles());
        } else if (rendering.getIsLoading()) {
            r.d(view, component.getStyles());
        }
    }

    public final void t0(UiWorkflow.c.a rendering, ViewEnvironment viewEnvironment, Map<String, ? extends Object> componentParams, Map<String, UiComponentErrorInfo> errors) {
        Object obj;
        List<UiComponent> f10 = rendering.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : f10) {
            if (obj2 instanceof SheetComponent) {
                arrayList.add(obj2);
            }
        }
        SheetComponent currentSheetComponent = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        int i10 = 0;
        if (currentSheetComponent != null) {
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i11);
                i11++;
                if (Intrinsics.c(((SheetComponent) obj).getName(), currentSheetComponent.getName())) {
                    break;
                }
            }
            SheetComponent sheetComponent = (SheetComponent) obj;
            if (sheetComponent != null && !sheetComponent.getShowing()) {
                this.nestedUiBottomSheetController.f();
            }
        }
        if (this.nestedUiBottomSheetController.getCurrentSheetComponent() == null) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                SheetComponent sheetComponent2 = (SheetComponent) obj3;
                if (!sheetComponent2.getShown()) {
                    sheetComponent2.o2(true);
                    this.nestedUiBottomSheetController.g(sheetComponent2, viewEnvironment);
                    break;
                }
            }
        }
        SheetComponent currentSheetComponent2 = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        if (currentSheetComponent2 != null) {
            o1(rendering, viewEnvironment, currentSheetComponent2, componentParams, errors);
        }
    }

    public final void u0(yq.g result, int firstBelowTheFoldChildIndex, FooterComponent footerComponent) {
        this.binding.f27320d.setVisibility(0);
        this.binding.f27322f.setVisibility(0);
        View footerView = result.getFooterView();
        Drawable background = footerView != null ? footerView.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int color = colorDrawable != null ? colorDrawable.getColor() : 0;
        Drawable background2 = this.binding.f27324h.getBackground();
        LayerDrawable layerDrawable = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
        Drawable findDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(r1.f24915k) : null;
        GradientDrawable gradientDrawable = findDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        this.binding.f27321e.addView(result.getFooterView());
        UiComponent uiComponent = (UiComponent) CollectionsKt.f0(footerComponent.getChildren(), firstBelowTheFoldChildIndex);
        final View view = this.componentNameToView.get(uiComponent != null ? uiComponent.getName() : null);
        final BottomSheetBehavior q02 = BottomSheetBehavior.q0(this.binding.f27324h);
        Intrinsics.checkNotNullExpressionValue(q02, "from(...)");
        this.binding.f27326j.setVerticalFadingEdgeEnabled(false);
        if (view != null) {
            this.binding.f27323g.setVisibility(0);
            this.binding.f27321e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mr.h3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    com.withpersona.sdk2.inquiry.ui.g.v0(com.withpersona.sdk2.inquiry.ui.g.this, view, q02, view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        } else {
            this.binding.f27323g.setVisibility(4);
            this.binding.f27321e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mr.i3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    com.withpersona.sdk2.inquiry.ui.g.w0(com.withpersona.sdk2.inquiry.ui.g.this, q02, view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        q02.c0(new b(q02));
    }

    @Override // ym.k
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull final UiWorkflow.c.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        int d10;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        List<UiComponent> f10 = rendering.f();
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = f10.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UiComponent uiComponent = (UiComponent) it.next();
            View view = this.componentNameToView.get(uiComponent.getName());
            ComponentView componentView = view != null ? new ComponentView(uiComponent, view) : null;
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        Map<String, ComponentParam> h02 = h0(arrayList);
        Map<String, Object> G0 = G0(h02);
        List<UiComponentErrorInfo> e10 = rendering.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.d.c(j0.f(q.u(e10, 10)), 16));
        for (Object obj : e10) {
            linkedHashMap.put(((UiComponentErrorInfo) obj).getName(), obj);
        }
        Integer c10 = rendering.c();
        if (c10 == null || c10.intValue() == 0) {
            Intrinsics.checkNotNull(context);
            d10 = z.d(context, R.attr.colorBackground, null, false, 6, null);
        } else {
            d10 = c10.intValue();
        }
        Intrinsics.checkNotNull(context);
        tq.c.b(viewEnvironment, context, d10);
        this.launchNfcScan = rendering.l();
        this.launchJpMyNumberNfcScan = rendering.k();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ComponentView componentView2 = (ComponentView) arrayList.get(i10);
            H0(rendering, componentView2.getComponent(), componentView2.getView(), G0, linkedHashMap, viewEnvironment, this.componentNameToConfig);
        }
        NavigationState navigationState = rendering.getNavigationState();
        Pi2NavigationBar navigationBar = this.binding.f27325i;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        String str = this.navBarTitle;
        StepStyles.UiStepStyle styles = rendering.getStyles();
        Rect h10 = styles != null ? cr.h.h(styles) : null;
        StepStyles.UiStepStyle styles2 = rendering.getStyles();
        gr.c.d(navigationState, new Function0() { // from class: mr.y3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit y02;
                y02 = com.withpersona.sdk2.inquiry.ui.g.y0(com.withpersona.sdk2.inquiry.ui.g.this, rendering);
                return y02;
            }
        }, new Function0() { // from class: mr.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit z02;
                z02 = com.withpersona.sdk2.inquiry.ui.g.z0(UiWorkflow.c.a.this);
                return z02;
            }
        }, new Function0() { // from class: mr.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit A0;
                A0 = com.withpersona.sdk2.inquiry.ui.g.A0(UiWorkflow.c.a.this, this);
                return A0;
            }
        }, navigationBar, root, h10, str, styles2 != null ? styles2.getNavBarTitleStyleValue() : null);
        CoordinatorLayout root2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        g0.b(root2, rendering.getError(), rendering.u(), null, 0, 0, 56, null);
        this.onComplete = rendering.s();
        this.onCancel = rendering.q();
        this.onClick = new Function2() { // from class: mr.g2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit B0;
                B0 = com.withpersona.sdk2.inquiry.ui.g.B0(UiWorkflow.c.a.this, this, arrayList, (UiComponent) obj2, ((Boolean) obj3).booleanValue());
                return B0;
            }
        };
        this.onVerifyPersonaClick = new Function1() { // from class: mr.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit C0;
                C0 = com.withpersona.sdk2.inquiry.ui.g.C0(UiWorkflow.c.a.this, this, arrayList, (VerifyPersonaButtonComponent) obj2);
                return C0;
            }
        };
        UiWorkflow.c.a.AutoSubmit autoSubmit = rendering.getAutoSubmit();
        if (autoSubmit != null) {
            if (autoSubmit.getIsReadyToSubmit()) {
                AutoSubmitableComponent component = autoSubmit.getComponent();
                if ((component instanceof ActionButtonComponent) || (component instanceof SubmitButtonComponent)) {
                    Function2<? super UiComponent, ? super Boolean, Unit> function2 = this.onClick;
                    View view2 = this.componentNameToView.get(((ButtonComponent) component).getName());
                    if (view2 != null && view2.getVisibility() == 0) {
                        z10 = true;
                    }
                    function2.invoke(component, Boolean.valueOf(z10));
                } else if (component instanceof CancelButtonComponent) {
                    this.onCancel.invoke();
                } else if (component instanceof CompleteButtonComponent) {
                    this.onComplete.invoke();
                } else if (component instanceof PhoneNumberSnaComponent) {
                    PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) component;
                    rendering.r().invoke(component, Boolean.FALSE, j0.g(new Pair(phoneNumberSnaComponent.getName(), new ComponentParam.PhoneNumberSnaParams(phoneNumberSnaComponent.getCode(), phoneNumberSnaComponent.getErrorName(), phoneNumberSnaComponent.getErrorMessage()))));
                }
            } else if (autoSubmit.getCountdownText() != null) {
                View view3 = this.componentNameToView.get(autoSubmit.getComponent().getName());
                if (view3 instanceof ButtonWithLoadingIndicator) {
                    ((ButtonWithLoadingIndicator) view3).setText(autoSubmit.getCountdownText());
                } else if (view3 instanceof MaterialButton) {
                    ((MaterialButton) view3).setText(autoSubmit.getCountdownText());
                }
            }
        }
        t0(rendering, viewEnvironment, h02, linkedHashMap);
        if (!rendering.getShouldLaunchHelpBottomSheet() || rendering.getHelpBottomSheetViewModel() == null) {
            return;
        }
        this.helpBottomSheetController.x(rendering.getStyles(), rendering.getHelpBottomSheetViewModel(), rendering.v(), rendering.j(), rendering.m());
    }
}
