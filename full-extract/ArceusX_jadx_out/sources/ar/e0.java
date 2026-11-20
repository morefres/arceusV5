package ar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;", "config", "Landroidx/constraintlayout/widget/ConstraintLayout;", "g", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Landroidx/constraintlayout/widget/ConstraintLayout;", "other", "f", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "", "e", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;)Z", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e0 {
    public static final boolean e(InputAddress inputAddress) {
        InputAddress.Attributes attributes = inputAddress.getAttributes();
        String prefillAddressStreet1 = attributes != null ? attributes.getPrefillAddressStreet1() : null;
        if (prefillAddressStreet1 != null && !StringsKt.p0(prefillAddressStreet1)) {
            return false;
        }
        InputAddress.Attributes attributes2 = inputAddress.getAttributes();
        String prefillAddressStreet2 = attributes2 != null ? attributes2.getPrefillAddressStreet2() : null;
        if (prefillAddressStreet2 != null && !StringsKt.p0(prefillAddressStreet2)) {
            return false;
        }
        InputAddress.Attributes attributes3 = inputAddress.getAttributes();
        String prefillAddressCity = attributes3 != null ? attributes3.getPrefillAddressCity() : null;
        if (prefillAddressCity != null && !StringsKt.p0(prefillAddressCity)) {
            return false;
        }
        InputAddress.Attributes attributes4 = inputAddress.getAttributes();
        String prefillAddressPostalCode = attributes4 != null ? attributes4.getPrefillAddressPostalCode() : null;
        if (prefillAddressPostalCode != null && !StringsKt.p0(prefillAddressPostalCode)) {
            return false;
        }
        InputAddress.Attributes attributes5 = inputAddress.getAttributes();
        String prefillAddressSubdivision = attributes5 != null ? attributes5.getPrefillAddressSubdivision() : null;
        return prefillAddressSubdivision == null || StringsKt.p0(prefillAddressSubdivision);
    }

    public static final InputAddressComponent f(InputAddressComponent inputAddressComponent, InputAddressComponent inputAddressComponent2) {
        inputAddressComponent.L(inputAddressComponent2.getIsAddressFieldCollapsed());
        inputAddressComponent.P(inputAddressComponent2.getTextControllerForAddressStreet1());
        inputAddressComponent.Q(inputAddressComponent2.getTextControllerForAddressStreet2());
        inputAddressComponent.N(inputAddressComponent2.getTextControllerForAddressCity());
        inputAddressComponent.R(inputAddressComponent2.getTextControllerForAddressSubdivision());
        inputAddressComponent.O(inputAddressComponent2.getTextControllerForAddressPostalCode());
        return inputAddressComponent;
    }

    @NotNull
    public static final ConstraintLayout g(@NotNull final InputAddressComponent inputAddressComponent, @NotNull y4 uiComponentHelper, @NotNull final InputAddress config) {
        Intrinsics.checkNotNullParameter(inputAddressComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final er.d c10 = er.d.c(uiComponentHelper.getLayoutInflater());
        InputAddress.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            ym.r textControllerForAddressStreet1 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText = c10.f16198d.getEditText();
            Intrinsics.checkNotNull(editText);
            ym.s.b(textControllerForAddressStreet1, editText);
            ym.r textControllerForAddressStreet12 = inputAddressComponent.getTextControllerForAddressStreet1();
            EditText editText2 = c10.f16200f.getEditText();
            Intrinsics.checkNotNull(editText2);
            ym.s.b(textControllerForAddressStreet12, editText2);
            ym.r textControllerForAddressStreet2 = inputAddressComponent.getTextControllerForAddressStreet2();
            EditText editText3 = c10.f16208n.getEditText();
            Intrinsics.checkNotNull(editText3);
            ym.s.b(textControllerForAddressStreet2, editText3);
            ym.r textControllerForAddressCity = inputAddressComponent.getTextControllerForAddressCity();
            EditText editText4 = c10.b.getEditText();
            Intrinsics.checkNotNull(editText4);
            ym.s.b(textControllerForAddressCity, editText4);
            ym.r textControllerForAddressSubdivision = inputAddressComponent.getTextControllerForAddressSubdivision();
            EditText editText5 = c10.f16207m.getEditText();
            Intrinsics.checkNotNull(editText5);
            ym.s.b(textControllerForAddressSubdivision, editText5);
            ym.r textControllerForAddressPostalCode = inputAddressComponent.getTextControllerForAddressPostalCode();
            EditText editText6 = c10.f16206l.getEditText();
            Intrinsics.checkNotNull(editText6);
            ym.s.b(textControllerForAddressPostalCode, editText6);
            String placeholderAutocomplete = attributes.getPlaceholderAutocomplete();
            if (placeholderAutocomplete != null) {
                c10.f16198d.setHint(placeholderAutocomplete);
            }
            String placeholderAddressStreet1 = attributes.getPlaceholderAddressStreet1();
            if (placeholderAddressStreet1 != null) {
                c10.f16200f.setHint(placeholderAddressStreet1);
            }
            String placeholderAddressStreet2 = attributes.getPlaceholderAddressStreet2();
            if (placeholderAddressStreet2 != null) {
                c10.f16208n.setHint(placeholderAddressStreet2);
            }
            String placeholderAddressCity = attributes.getPlaceholderAddressCity();
            if (placeholderAddressCity != null) {
                c10.b.setHint(placeholderAddressCity);
            }
            boolean c11 = Intrinsics.c(attributes.getSelectedCountryCode(), "US");
            c10.f16207m.setHint(c11 ? attributes.getPlaceholderAddressSubdivisionUs() : attributes.getPlaceholderAddressSubdivision());
            c10.f16206l.setHint(c11 ? attributes.getPlaceholderAddressPostalCodeUs() : attributes.getPlaceholderAddressPostalCode());
            String label = attributes.getLabel();
            if (label != null) {
                c10.f16205k.setText(label);
            }
            String editAddressManuallyPrompt = attributes.getEditAddressManuallyPrompt();
            if (editAddressManuallyPrompt != null) {
                c10.f16197c.setText(editAddressManuallyPrompt);
            }
        }
        c10.getRoot().setTag(c10);
        uiComponentHelper.d(new Function0() { // from class: ar.c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit i10;
                i10 = e0.i(InputAddress.this, c10);
                return i10;
            }
        });
        c10.f16197c.setOnClickListener(new View.OnClickListener() { // from class: ar.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e0.h(InputAddressComponent.this, view);
            }
        });
        c10.getRoot().setTag(c10);
        ConstraintLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void h(InputAddressComponent inputAddressComponent, View view) {
        inputAddressComponent.K(Boolean.FALSE);
        cr.p isAddressFieldCollapsed = inputAddressComponent.getIsAddressFieldCollapsed();
        Boolean isAddressComponentsCollapsed = inputAddressComponent.getIsAddressComponentsCollapsed();
        isAddressFieldCollapsed.c(isAddressComponentsCollapsed != null ? isAddressComponentsCollapsed.booleanValue() : false);
    }

    public static final Unit i(InputAddress inputAddress, er.d dVar) {
        InputTextBasedComponentStyle inputTextStyle;
        TextBasedComponentStyle expandComponentsButtonStyle;
        InputAddress.AddressComponentStyle styles = inputAddress.getStyles();
        if (styles != null && (expandComponentsButtonStyle = styles.getExpandComponentsButtonStyle()) != null) {
            TextView addressExpandComponentsButton = dVar.f16197c;
            Intrinsics.checkNotNullExpressionValue(addressExpandComponentsButton, "addressExpandComponentsButton");
            hr.h0.l(addressExpandComponentsButton, expandComponentsButtonStyle, null, 2, null);
        }
        InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
        if (styles2 != null && (inputTextStyle = styles2.getInputTextStyle()) != null) {
            TextView addressLabel = dVar.f16205k;
            Intrinsics.checkNotNullExpressionValue(addressLabel, "addressLabel");
            hr.h0.l(addressLabel, inputTextStyle.getLabelTextBasedStyle(), null, 2, null);
            TextInputLayout addressFieldCollapsed = dVar.f16198d;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            hr.d0.k(addressFieldCollapsed, inputTextStyle);
            TextInputLayout addressFieldExpanded = dVar.f16200f;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            hr.d0.k(addressFieldExpanded, inputTextStyle);
            TextInputLayout addressSuite = dVar.f16208n;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            hr.d0.k(addressSuite, inputTextStyle);
            TextInputLayout addressCity = dVar.b;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            hr.d0.k(addressCity, inputTextStyle);
            TextInputLayout addressSubdivision = dVar.f16207m;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            hr.d0.k(addressSubdivision, inputTextStyle);
            TextInputLayout addressPostalCode = dVar.f16206l;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            hr.d0.k(addressPostalCode, inputTextStyle);
        }
        return Unit.f22894a;
    }
}
