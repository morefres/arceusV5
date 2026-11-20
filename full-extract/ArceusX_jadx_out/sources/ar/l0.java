package ar;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckbox;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCheckboxGroup;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.OptionWithDescription;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;", "config", "Landroid/widget/LinearLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCheckboxGroup;)Landroid/widget/LinearLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l0 {
    @NotNull
    public static final LinearLayout c(@NotNull final InputCheckboxGroupComponent inputCheckboxGroupComponent, @NotNull y4 uiComponentHelper, @NotNull final InputCheckboxGroup config) {
        List<OptionWithDescription> k10;
        String str;
        TextBasedComponentStyle errorTextStyle;
        boolean z10;
        JsonLogicBoolean jsonLogicBoolean;
        JsonLogicBoolean jsonLogicBoolean2;
        List<String> prefill;
        Intrinsics.checkNotNullParameter(inputCheckboxGroupComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final er.j c10 = er.j.c(uiComponentHelper.getLayoutInflater());
        InputCheckboxGroup.Attributes attributes = config.getAttributes();
        final ArrayList arrayList = new ArrayList();
        Set Q0 = (attributes == null || (prefill = attributes.getPrefill()) == null) ? null : CollectionsKt.Q0(prefill);
        if (attributes == null || (k10 = attributes.getOptions()) == null) {
            k10 = kotlin.collections.p.k();
        }
        for (OptionWithDescription optionWithDescription : k10) {
            String value = optionWithDescription.getValue();
            Boolean valueOf = Boolean.valueOf(Q0 != null && Q0.contains(optionWithDescription.getValue()));
            String text = optionWithDescription.getText();
            String descriptionText = optionWithDescription.getDescriptionText();
            JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
            if (attributes != null) {
                z10 = true;
                jsonLogicBoolean = hidden;
                jsonLogicBoolean2 = attributes.getDisabled();
            } else {
                z10 = true;
                jsonLogicBoolean = hidden;
                jsonLogicBoolean2 = null;
            }
            InputCheckbox inputCheckbox = new InputCheckbox(value, new InputCheckbox.Attributes(valueOf, text, descriptionText, jsonLogicBoolean, jsonLogicBoolean2), config.getStyles());
            InputCheckboxComponent inputCheckboxComponent = new InputCheckboxComponent(inputCheckbox, (Q0 == null || Q0.contains(optionWithDescription.getValue()) != z10) ? false : z10);
            er.i d10 = er.i.d(uiComponentHelper.getLayoutInflater(), c10.b, false);
            Intrinsics.checkNotNullExpressionValue(d10, "inflate(...)");
            c10.b.addView(i0.e(inputCheckboxComponent, uiComponentHelper, d10, inputCheckbox));
            d10.b.setTag(optionWithDescription.getValue());
            if (inputCheckboxGroupComponent.getStringSetController().b().contains(optionWithDescription.getValue())) {
                d10.b.setChecked(z10);
            }
            MaterialCheckBox checkbox = d10.b;
            Intrinsics.checkNotNullExpressionValue(checkbox, "checkbox");
            arrayList.add(checkbox);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((MaterialCheckBox) obj).c(new MaterialCheckBox.b() { // from class: ar.j0
                @Override // com.google.android.material.checkbox.MaterialCheckBox.b
                public final void a(MaterialCheckBox materialCheckBox, int i11) {
                    l0.d(InputCheckboxGroupComponent.this, arrayList, materialCheckBox, i11);
                }
            });
        }
        InputCheckbox.InputCheckboxComponentStyle styles = config.getStyles();
        if (styles == null || (errorTextStyle = styles.getErrorTextStyle()) == null) {
            str = null;
        } else {
            TextView checkboxGroupError = c10.f16233c;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupError, "checkboxGroupError");
            str = null;
            hr.h0.l(checkboxGroupError, errorTextStyle, null, 2, null);
        }
        String label = attributes != null ? attributes.getLabel() : str;
        if (label == null || label.length() == 0) {
            c10.f16234d.setVisibility(8);
        } else {
            c10.f16234d.setVisibility(0);
            c10.f16234d.setText(label);
            uiComponentHelper.d(new Function0() { // from class: ar.k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit e10;
                    e10 = l0.e(InputCheckboxGroup.this, c10);
                    return e10;
                }
            });
        }
        c10.getRoot().setTag(c10);
        LinearLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final void d(InputCheckboxGroupComponent inputCheckboxGroupComponent, List list, MaterialCheckBox checkBox, int i10) {
        Intrinsics.checkNotNullParameter(checkBox, "checkBox");
        f(inputCheckboxGroupComponent, list);
    }

    public static final Unit e(InputCheckboxGroup inputCheckboxGroup, er.j jVar) {
        TextBasedComponentStyle textBasedStyle;
        InputCheckbox.InputCheckboxComponentStyle styles = inputCheckboxGroup.getStyles();
        if (styles != null && (textBasedStyle = styles.getTextBasedStyle()) != null) {
            TextView checkboxGroupLabel = jVar.f16234d;
            Intrinsics.checkNotNullExpressionValue(checkboxGroupLabel, "checkboxGroupLabel");
            hr.h0.l(checkboxGroupLabel, textBasedStyle, null, 2, null);
        }
        return Unit.f22894a;
    }

    public static final void f(InputCheckboxGroupComponent inputCheckboxGroupComponent, List<MaterialCheckBox> list) {
        String str;
        cr.n stringSetController = inputCheckboxGroupComponent.getStringSetController();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MaterialCheckBox materialCheckBox : list) {
            if (materialCheckBox.isChecked()) {
                Object tag = materialCheckBox.getTag();
                Intrinsics.d(tag, "null cannot be cast to non-null type kotlin.String");
                str = (String) tag;
            } else {
                str = null;
            }
            if (str != null) {
                linkedHashSet.add(str);
            }
        }
        stringSetController.c(linkedHashSet);
    }
}
