package ar;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputSelect;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextInputLayout;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputSelect;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y1 {
    @NotNull
    public static final TextInputLayout b(@NotNull InputSelectComponent inputSelectComponent, @NotNull y4 uiComponentHelper, @NotNull final InputSelect config) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputSelectComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final er.s c10 = er.s.c(uiComponentHelper.getLayoutInflater());
        InputSelect.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null && !StringsKt.p0(placeholder)) {
                c10.getRoot().setPlaceholderText(attributes.getPlaceholder());
                c10.getRoot().setExpandedHintEnabled(false);
                PersonaTextInputLayout root = c10.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                uq.s.a(root);
            }
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = c10.getRoot().getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                c10.getRoot().setHint(label);
            }
        }
        uiComponentHelper.d(new Function0() { // from class: ar.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c11;
                c11 = y1.c(InputSelect.this, c10);
                return c11;
            }
        });
        PersonaTextInputLayout root2 = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        return root2;
    }

    public static final Unit c(InputSelect inputSelect, er.s sVar) {
        InputSelectComponentStyle styles = inputSelect.getStyles();
        if (styles != null) {
            PersonaTextInputLayout listSelector = sVar.b;
            Intrinsics.checkNotNullExpressionValue(listSelector, "listSelector");
            hr.o.i(listSelector, styles);
        }
        return Unit.f22894a;
    }
}
