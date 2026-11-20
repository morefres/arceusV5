package ar;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputPhoneNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", "c", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputPhoneNumber;)Lcom/google/android/material/textfield/TextInputLayout;", "Ler/m;", "binding", "Lkotlin/Function0;", "", "onCountryInputClick", "e", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Ler/m;Lkotlin/jvm/functions/Function0;)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p1 {
    @NotNull
    public static final TextInputLayout c(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull y4 uiComponentHelper, @NotNull final InputPhoneNumber config) {
        EditText editText;
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final er.m c10 = er.m.c(uiComponentHelper.getLayoutInflater());
        InputPhoneNumber.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            String prefill = attributes.getPrefill();
            if (prefill != null && (editText = c10.b.getEditText()) != null) {
                editText.setText(prefill);
            }
            String label = attributes.getLabel();
            if (label != null) {
                c10.b.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                c10.b.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = c10.b;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                uq.s.a(inputLayout);
            }
            EditText editText2 = c10.b.getEditText();
            if (editText2 != null) {
                ym.s.b(inputPhoneNumberComponent.getTextController(), editText2);
                hq.h0.a(editText2, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
            }
        }
        uiComponentHelper.d(new Function0() { // from class: ar.o1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit d10;
                d10 = p1.d(InputPhoneNumber.this, c10);
                return d10;
            }
        });
        c10.getRoot().setTag(c10);
        TextInputLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit d(InputPhoneNumber inputPhoneNumber, er.m mVar) {
        InputTextBasedComponentStyle styles = inputPhoneNumber.getStyles();
        if (styles != null) {
            TextView prefixTextView = mVar.b.getPrefixTextView();
            Intrinsics.checkNotNullExpressionValue(prefixTextView, "getPrefixTextView(...)");
            hr.h0.l(prefixTextView, styles.getTextBasedStyle(), null, 2, null);
            TextInputLayout inputLayout = mVar.b;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            hr.d0.k(inputLayout, styles);
        }
        return Unit.f22894a;
    }

    public static final void e(@NotNull InputPhoneNumberComponent inputPhoneNumberComponent, @NotNull er.m binding, @NotNull final Function0<Unit> onCountryInputClick) {
        Intrinsics.checkNotNullParameter(inputPhoneNumberComponent, "<this>");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onCountryInputClick, "onCountryInputClick");
        binding.b.setPrefixText(cr.f.f14165a.i((Option) CollectionsKt.d0(inputPhoneNumberComponent.getCountryCodeOptionsController().b())));
        String selectedCountryCode = inputPhoneNumberComponent.getSelectedCountryCode();
        List<Option> m10 = inputPhoneNumberComponent.m();
        if (selectedCountryCode == null && m10.size() == 1) {
            inputPhoneNumberComponent.getCountryCodeOptionsController().c(kotlin.collections.o.d(CollectionsKt.d0(m10)));
        }
        if (inputPhoneNumberComponent.getDisableCountryCodeSelection()) {
            binding.b.getPrefixTextView().setOnClickListener(null);
            binding.b.getPrefixTextView().setClickable(false);
        } else {
            binding.b.getPrefixTextView().setOnClickListener(new View.OnClickListener() { // from class: ar.n1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p1.f(Function0.this, view);
                }
            });
        }
        TextView prefixTextView = binding.b.getPrefixTextView();
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        prefixTextView.setBackground(cr.h.b(context, binding.b.getPrefixTextView().getTextColors().getDefaultColor(), (int) binding.b.getPrefixTextView().getPaint().measureText(String.valueOf(binding.b.getPrefixText())), inputPhoneNumberComponent.getActiveOptionBackgroundColor()));
        EditText editText = binding.b.getEditText();
        if (editText != null) {
            hq.h0.a(editText, new PhoneNumberFormattingTextWatcher(inputPhoneNumberComponent.getSelectedCountryCode()));
        }
    }

    public static final void f(Function0 function0, View view) {
        function0.invoke();
    }
}
