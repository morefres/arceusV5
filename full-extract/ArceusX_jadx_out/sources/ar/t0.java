package ar;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputCurrency;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;", "Lar/y4;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;", "config", "Lcom/google/android/material/textfield/TextInputLayout;", j6.b.f21518e, "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;Lar/y4;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputCurrency;)Lcom/google/android/material/textfield/TextInputLayout;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t0 {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ar/t0$a", "Landroid/text/TextWatcher;", "", "s", "", "start", "count", "after", "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0<String> f3583a;
        public final /* synthetic */ er.l b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Currency f3584c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ NumberFormat f3585d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ NumberFormat f3586e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InputCurrencyComponent f3587f;

        public a(kotlin.jvm.internal.c0<String> c0Var, er.l lVar, Currency currency, NumberFormat numberFormat, NumberFormat numberFormat2, InputCurrencyComponent inputCurrencyComponent) {
            this.f3583a = c0Var;
            this.b = lVar;
            this.f3584c = currency;
            this.f3585d = numberFormat;
            this.f3586e = numberFormat2;
            this.f3587f = inputCurrencyComponent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.CharSequence, java.lang.String] */
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            if (Intrinsics.c(String.valueOf(s8), this.f3583a.f22963a) || s8 == null || StringsKt.p0(s8)) {
                return;
            }
            this.b.b.removeTextChangedListener(this);
            String quote = Pattern.quote(this.f3584c.getSymbol());
            Intrinsics.checkNotNullExpressionValue(quote, "quote(...)");
            String replace = new Regex(quote).replace(s8, "");
            StringBuilder sb2 = new StringBuilder();
            int length = replace.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = replace.charAt(i10);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            Number parse = this.f3585d.parse(sb2.toString());
            if (parse != null) {
                double doubleValue = parse.doubleValue() / 100.0d;
                ?? format = this.f3586e.format(doubleValue);
                this.f3583a.f22963a = format;
                this.b.b.setText((CharSequence) format);
                this.b.b.setSelection(format.length());
                this.b.b.addTextChangedListener(this);
                this.f3587f.getNumberController().c(Double.valueOf(doubleValue));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s8, int start, int before, int count) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final TextInputLayout b(@NotNull InputCurrencyComponent inputCurrencyComponent, @NotNull y4 uiComponentHelper, @NotNull final InputCurrency config) {
        Intrinsics.checkNotNullParameter(inputCurrencyComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final er.l c10 = er.l.c(uiComponentHelper.getLayoutInflater());
        InputCurrency.Attributes attributes = config.getAttributes();
        String str = "USD";
        if (attributes != null) {
            String label = attributes.getLabel();
            if (label != null) {
                c10.f16240c.setHint(label);
            }
            String placeholder = attributes.getPlaceholder();
            if (placeholder != null) {
                c10.f16240c.setPlaceholderText(placeholder);
                TextInputLayout inputLayout = c10.f16240c;
                Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
                uq.s.a(inputLayout);
            }
            String currencyCode = attributes.getCurrencyCode();
            if (currencyCode != null) {
                str = currencyCode;
            }
        }
        Currency currency = Currency.getInstance(str);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(currency);
        NumberFormat numberFormat = NumberFormat.getInstance();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        Editable text = c10.b.getText();
        c0Var.f22963a = text != null ? text.toString() : 0;
        a aVar = new a(c0Var, c10, currency, numberFormat, currencyInstance, inputCurrencyComponent);
        if (inputCurrencyComponent.getValue() != null) {
            try {
                c10.b.setText(currencyInstance.format(inputCurrencyComponent.getValue().doubleValue()));
            } catch (Exception unused) {
            }
        }
        c10.b.addTextChangedListener(aVar);
        uiComponentHelper.d(new Function0() { // from class: ar.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c11;
                c11 = t0.c(InputCurrency.this, c10);
                return c11;
            }
        });
        TextInputLayout root = c10.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    public static final Unit c(InputCurrency inputCurrency, er.l lVar) {
        InputTextBasedComponentStyle styles = inputCurrency.getStyles();
        if (styles != null) {
            TextInputLayout inputLayout = lVar.f16240c;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            hr.d0.k(inputLayout, styles);
        }
        return Unit.f22894a;
    }
}
