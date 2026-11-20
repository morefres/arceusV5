package hr;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "styles", "", "i", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V", "", "bottomBorderWidth", "h", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {
    public static final void h(TextInputLayout textInputLayout, int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setStroke(i10, textInputLayout.getBoxStrokeColor());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable});
        int i11 = -i10;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        layerDrawable.setLayerInset(0, i11, i11, i11, marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
        textInputLayout.setBackground(layerDrawable);
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [T, hr.h] */
    public static final void i(@NotNull final TextInputLayout textInputLayout, @NotNull InputSelectComponentStyle styles) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int intValue = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue = styles.getFocusedBackgroundColorValue();
            final int intValue2 = focusedBackgroundColorValue != null ? focusedBackgroundColorValue.intValue() : intValue;
            Integer disabledBackgroundColorValue = styles.getDisabledBackgroundColorValue();
            final int intValue3 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : intValue;
            Integer errorBackgroundColorValue = styles.getErrorBackgroundColorValue();
            final int intValue4 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : intValue;
            textInputLayout.setBoxBackgroundMode(2);
            d0.i(textInputLayout, textInputLayout.hasFocus(), intValue, intValue2, intValue3);
            c0Var.f22963a = new Function1() { // from class: hr.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit n10;
                    n10 = o.n(TextInputLayout.this, intValue, intValue2, intValue3, ((Boolean) obj).booleanValue());
                    return n10;
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.i
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    o.o(TextInputLayout.this, intValue4, intValue, intValue2, intValue3, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int intValue5 = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = styles.getFocusedBorderColorValue();
            int intValue6 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : intValue5;
            Integer disabledBorderColorValue = styles.getDisabledBorderColorValue();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue5, intValue6, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : intValue5}));
            Integer errorBorderColorValue = styles.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                intValue5 = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue5, intValue5, intValue5}));
        }
        Double topBorderWidthValue = styles.getTopBorderWidthValue();
        if (topBorderWidthValue != null) {
            double doubleValue = topBorderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(hq.j.a(doubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(hq.j.a(doubleValue)));
        }
        if (textInputLayout.getBoxStrokeWidth() == 0) {
            Double bottomBorderWidthValue = styles.getBottomBorderWidthValue();
            if ((bottomBorderWidthValue != null ? bottomBorderWidthValue.doubleValue() : 0.0d) > 0.0d) {
                Double bottomBorderWidthValue2 = styles.getBottomBorderWidthValue();
                h(textInputLayout, (int) Math.ceil(bottomBorderWidthValue2 != null ? hq.j.a(bottomBorderWidthValue2.doubleValue()) : 0.0d));
            }
        }
        Integer chevronColor = styles.getChevronColor();
        if (chevronColor != null) {
            int intValue7 = chevronColor.intValue();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842908}, new int[]{R.attr.state_hovered}, new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{intValue7, intValue7, intValue7, intValue7, intValue7, intValue7}));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double doubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.a0((float) hq.j.a(doubleValue2), (float) hq.j.a(doubleValue2), (float) hq.j.a(doubleValue2), (float) hq.j.a(doubleValue2));
        }
        StyleElements.SizeSet inputSelectBoxMargins = styles.getInputSelectBoxMargins();
        if (inputSelectBoxMargins != null) {
            kr.d.c(textInputLayout, inputSelectBoxMargins);
        }
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            h0.l(editText, styles.getTextBasedStyle(), null, 2, null);
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            kr.d.c(editText2, new StyleElements.SizeSet(new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d)));
        }
        Integer baseTextColor = styles.getBaseTextColor();
        if (baseTextColor != null) {
            int intValue8 = baseTextColor.intValue();
            Integer valueFocusedTextColor = styles.getValueFocusedTextColor();
            int intValue9 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : intValue8;
            Integer valueDisabledTextColor = styles.getValueDisabledTextColor();
            int intValue10 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : intValue8;
            Integer valueErrorTextColor = styles.getValueErrorTextColor();
            final int intValue11 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : intValue8;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue8, intValue9, intValue10, intValue8});
            EditText editText3 = textInputLayout.getEditText();
            if (editText3 != null) {
                editText3.setTextColor(colorStateList);
            }
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.j
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    o.p(TextInputLayout.this, intValue11, colorStateList, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer errorBaseTextColor = styles.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int intValue12 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = styles.getErrorErrorTextColor();
            int intValue13 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : intValue12;
            Integer errorFocusedTextColor = styles.getErrorFocusedTextColor();
            int intValue14 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : intValue12;
            Integer errorDisabledTextColor = styles.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                intValue12 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue13, intValue14, intValue12, intValue13}));
        }
        Integer labelBaseTextColor = styles.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int intValue15 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = styles.getLabelFocusedTextColor();
            int intValue16 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : intValue15;
            Integer labelDisabledTextColor = styles.getLabelDisabledTextColor();
            int intValue17 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : intValue15;
            Integer labelErrorTextColor = styles.getLabelErrorTextColor();
            int intValue18 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : intValue15;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue15, intValue16, intValue17, intValue15});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue18, intValue18, intValue18, intValue18});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.k
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    o.j(TextInputLayout.this, colorStateList3, colorStateList2, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer placeholderBaseTextColor = styles.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int intValue19 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = styles.getPlaceholderFocusedTextColor();
            int intValue20 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : intValue19;
            Integer placeholderErrorTextColor = styles.getPlaceholderErrorTextColor();
            int intValue21 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : intValue19;
            Integer placeholderDisabledTextColor = styles.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue19, intValue20, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : intValue19, intValue19});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue21, intValue21, intValue21, intValue21});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.l
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    o.k(TextInputLayout.this, colorStateList5, colorStateList4, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        EditText editText4 = textInputLayout.getEditText();
        if (editText4 != null) {
            editText4.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hr.m
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    o.l(TextInputLayout.this, c0Var, view, z10);
                }
            });
        }
    }

    public static final void j(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        }
    }

    public static final void k(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
    }

    public static final void l(TextInputLayout textInputLayout, final kotlin.jvm.internal.c0 c0Var, View view, final boolean z10) {
        textInputLayout.post(new Runnable() { // from class: hr.n
            @Override // java.lang.Runnable
            public final void run() {
                o.m(kotlin.jvm.internal.c0.this, z10);
            }
        });
    }

    public static final void m(kotlin.jvm.internal.c0 c0Var, boolean z10) {
        Function1 function1 = (Function1) c0Var.f22963a;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
    }

    public static final Unit n(TextInputLayout textInputLayout, int i10, int i11, int i12, boolean z10) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            d0.i(textInputLayout, z10, i10, i11, i12);
        }
        return Unit.f22894a;
    }

    public static final void o(TextInputLayout textInputLayout, int i10, int i11, int i12, int i13, View view, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            d0.i(textInputLayout, textInputLayout.hasFocus(), i11, i12, i13);
        } else {
            textInputLayout.setBoxBackgroundColor(i10);
        }
    }

    public static final void p(TextInputLayout textInputLayout, int i10, ColorStateList colorStateList, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(colorStateList);
                return;
            }
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(i10);
        }
    }
}
