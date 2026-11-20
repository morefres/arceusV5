package hr;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "styles", "", "k", "(Lcom/google/android/material/textfield/TextInputLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;)V", "", "hasFocus", "", "baseBackgroundColor", "focusedColor", "disabledColor", "i", "(Lcom/google/android/material/textfield/TextInputLayout;ZIII)V", "color", "j", "(Lcom/google/android/material/textfield/TextInputLayout;I)V", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d0 {
    public static final void i(@NotNull TextInputLayout textInputLayout, boolean z10, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        if (z10) {
            textInputLayout.setBoxBackgroundColor(i11);
        } else if (textInputLayout.isEnabled()) {
            textInputLayout.setBoxBackgroundColor(i10);
        } else {
            textInputLayout.setBoxBackgroundColor(i12);
        }
    }

    public static final void j(TextInputLayout textInputLayout, int i10) {
        EditText editText;
        Drawable textCursorDrawable;
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT < 29 || (editText = textInputLayout.getEditText()) == null || (textCursorDrawable = editText.getTextCursorDrawable()) == null) {
            return;
        }
        t.a();
        blendMode = BlendMode.SRC_ATOP;
        textCursorDrawable.setColorFilter(s.a(i10, blendMode));
    }

    /* JADX WARN: Type inference failed for: r0v59, types: [T, hr.w] */
    public static final void k(@NotNull final TextInputLayout textInputLayout, @NotNull InputTextBasedComponentStyle styles) {
        Integer focusedBackgroundColorValue;
        Double valueLineHeightValue;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(styles, "styles");
        Integer baseBorderColorValue = styles.getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            int intValue = baseBorderColorValue.intValue();
            Integer focusedBorderColorValue = styles.getFocusedBorderColorValue();
            int intValue2 = focusedBorderColorValue != null ? focusedBorderColorValue.intValue() : intValue;
            Integer disabledBorderColorValue = styles.getDisabledBorderColorValue();
            textInputLayout.setBoxStrokeColorStateList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue, intValue2, disabledBorderColorValue != null ? disabledBorderColorValue.intValue() : intValue}));
            Integer errorBorderColorValue = styles.getErrorBorderColorValue();
            if (errorBorderColorValue != null) {
                intValue = errorBorderColorValue.intValue();
            }
            textInputLayout.setBoxStrokeErrorColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}}, new int[]{intValue, intValue, intValue}));
        }
        final kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        Integer baseBackgroundColorValue = styles.getBaseBackgroundColorValue();
        if (baseBackgroundColorValue != null) {
            final int intValue3 = baseBackgroundColorValue.intValue();
            Integer focusedBackgroundColorValue2 = styles.getFocusedBackgroundColorValue();
            final int intValue4 = focusedBackgroundColorValue2 != null ? focusedBackgroundColorValue2.intValue() : intValue3;
            Integer disabledBackgroundColorValue = styles.getDisabledBackgroundColorValue();
            final int intValue5 = disabledBackgroundColorValue != null ? disabledBackgroundColorValue.intValue() : intValue3;
            Integer errorBackgroundColorValue = styles.getErrorBackgroundColorValue();
            final int intValue6 = errorBackgroundColorValue != null ? errorBackgroundColorValue.intValue() : intValue3;
            textInputLayout.setBoxBackgroundMode(2);
            i(textInputLayout, textInputLayout.hasFocus(), intValue3, intValue4, intValue5);
            c0Var.f22963a = new Function1() { // from class: hr.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit q10;
                    q10 = d0.q(TextInputLayout.this, intValue3, intValue4, intValue5, ((Boolean) obj).booleanValue());
                    return q10;
                }
            };
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.x
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.r(TextInputLayout.this, intValue6, intValue3, intValue4, intValue5, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Double borderWidthValue = styles.getBorderWidthValue();
        if (borderWidthValue != null) {
            double doubleValue = borderWidthValue.doubleValue();
            textInputLayout.setBoxStrokeWidth((int) Math.ceil(hq.j.a(doubleValue)));
            textInputLayout.setBoxStrokeWidthFocused((int) Math.ceil(hq.j.a(doubleValue)));
        }
        Double borderRadiusValue = styles.getBorderRadiusValue();
        if (borderRadiusValue != null) {
            double doubleValue2 = borderRadiusValue.doubleValue();
            textInputLayout.a0((float) hq.j.a(doubleValue2), (float) hq.j.a(doubleValue2), (float) hq.j.a(doubleValue2), (float) hq.j.a(doubleValue2));
        }
        Double valueFontSizeValue = styles.getValueFontSizeValue();
        if (valueFontSizeValue != null) {
            double doubleValue3 = valueFontSizeValue.doubleValue();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextSize((float) doubleValue3);
            }
        }
        Double valueLetterSpacingValue = styles.getValueLetterSpacingValue();
        if (valueLetterSpacingValue != null) {
            double doubleValue4 = valueLetterSpacingValue.doubleValue() / (textInputLayout.getEditText() != null ? r0.getTextSize() : 12.0f);
            EditText editText2 = textInputLayout.getEditText();
            if (editText2 != null) {
                editText2.setLetterSpacing((float) doubleValue4);
            }
        }
        EditText editText3 = textInputLayout.getEditText();
        if (editText3 != null) {
            String baseFontFamilyValue = styles.getBaseFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue = styles.getValueFontWeightValue();
            if (valueFontWeightValue == null) {
                valueFontWeightValue = StyleElements.FontWeight.NORMAL;
            }
            h0.h(editText3, baseFontFamilyValue, valueFontWeightValue, new Function1() { // from class: hr.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit s8;
                    s8 = d0.s(TextInputLayout.this, (Typeface) obj);
                    return s8;
                }
            });
        }
        EditText editText4 = textInputLayout.getEditText();
        textInputLayout.setTypeface(editText4 != null ? editText4.getTypeface() : null);
        EditText editText5 = textInputLayout.getEditText();
        if (editText5 != null) {
            String valueFontFamilyValue = styles.getValueFontFamilyValue();
            StyleElements.FontWeight valueFontWeightValue2 = styles.getValueFontWeightValue();
            if (valueFontWeightValue2 == null) {
                valueFontWeightValue2 = StyleElements.FontWeight.NORMAL;
            }
            h0.i(editText5, valueFontFamilyValue, valueFontWeightValue2, null, 4, null);
        }
        if (Build.VERSION.SDK_INT >= 28 && (valueLineHeightValue = styles.getValueLineHeightValue()) != null) {
            double doubleValue5 = valueLineHeightValue.doubleValue();
            EditText editText6 = textInputLayout.getEditText();
            if (editText6 != null) {
                editText6.setLineHeight((int) hq.j.a(doubleValue5));
            }
        }
        Integer baseTextColor = styles.getBaseTextColor();
        if (baseTextColor != null) {
            int intValue7 = baseTextColor.intValue();
            Integer valueFocusedTextColor = styles.getValueFocusedTextColor();
            final int intValue8 = valueFocusedTextColor != null ? valueFocusedTextColor.intValue() : intValue7;
            Integer valueDisabledTextColor = styles.getValueDisabledTextColor();
            int intValue9 = valueDisabledTextColor != null ? valueDisabledTextColor.intValue() : intValue7;
            Integer valueErrorTextColor = styles.getValueErrorTextColor();
            final int intValue10 = valueErrorTextColor != null ? valueErrorTextColor.intValue() : intValue7;
            final ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue7, intValue8, intValue9, intValue7});
            EditText editText7 = textInputLayout.getEditText();
            if (editText7 != null) {
                editText7.setTextColor(colorStateList);
            }
            j(textInputLayout, intValue8);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.z
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.l(TextInputLayout.this, intValue10, colorStateList, intValue8, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        Integer errorBaseTextColor = styles.getErrorBaseTextColor();
        if (errorBaseTextColor != null) {
            int intValue11 = errorBaseTextColor.intValue();
            Integer errorErrorTextColor = styles.getErrorErrorTextColor();
            int intValue12 = errorErrorTextColor != null ? errorErrorTextColor.intValue() : intValue11;
            Integer errorFocusedTextColor = styles.getErrorFocusedTextColor();
            int intValue13 = errorFocusedTextColor != null ? errorFocusedTextColor.intValue() : intValue11;
            Integer errorDisabledTextColor = styles.getErrorDisabledTextColor();
            if (errorDisabledTextColor != null) {
                intValue11 = errorDisabledTextColor.intValue();
            }
            textInputLayout.setErrorTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue12, intValue13, intValue11, intValue12}));
        }
        Integer labelBaseTextColor = styles.getLabelBaseTextColor();
        if (labelBaseTextColor != null) {
            int intValue14 = labelBaseTextColor.intValue();
            Integer labelFocusedTextColor = styles.getLabelFocusedTextColor();
            int intValue15 = labelFocusedTextColor != null ? labelFocusedTextColor.intValue() : intValue14;
            Integer labelDisabledTextColor = styles.getLabelDisabledTextColor();
            int intValue16 = labelDisabledTextColor != null ? labelDisabledTextColor.intValue() : intValue14;
            Integer labelErrorTextColor = styles.getLabelErrorTextColor();
            int intValue17 = labelErrorTextColor != null ? labelErrorTextColor.intValue() : intValue14;
            final ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue14, intValue15, intValue16, intValue14});
            final ColorStateList colorStateList3 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue17, intValue17, intValue17, intValue17});
            textInputLayout.setDefaultHintTextColor(colorStateList2);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.a0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.m(TextInputLayout.this, colorStateList3, colorStateList2, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        EditText editText8 = textInputLayout.getEditText();
        MaterialAutoCompleteTextView materialAutoCompleteTextView = editText8 instanceof MaterialAutoCompleteTextView ? (MaterialAutoCompleteTextView) editText8 : null;
        if (materialAutoCompleteTextView != null && (focusedBackgroundColorValue = styles.getFocusedBackgroundColorValue()) != null) {
            materialAutoCompleteTextView.setDropDownBackgroundDrawable(new ColorDrawable(focusedBackgroundColorValue.intValue()));
        }
        StyleElements.SizeSet inputTextBoxMargins = styles.getInputTextBoxMargins();
        if (inputTextBoxMargins != null) {
            kr.d.c(textInputLayout, inputTextBoxMargins);
        }
        Integer placeholderBaseTextColor = styles.getPlaceholderBaseTextColor();
        if (placeholderBaseTextColor != null) {
            int intValue18 = placeholderBaseTextColor.intValue();
            Integer placeholderFocusedTextColor = styles.getPlaceholderFocusedTextColor();
            int intValue19 = placeholderFocusedTextColor != null ? placeholderFocusedTextColor.intValue() : intValue18;
            Integer placeholderErrorTextColor = styles.getPlaceholderErrorTextColor();
            int intValue20 = placeholderErrorTextColor != null ? placeholderErrorTextColor.intValue() : intValue18;
            Integer placeholderDisabledTextColor = styles.getPlaceholderDisabledTextColor();
            final ColorStateList colorStateList4 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue18, intValue19, placeholderDisabledTextColor != null ? placeholderDisabledTextColor.intValue() : intValue18, intValue18});
            final ColorStateList colorStateList5 = new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue20, intValue20, intValue20, intValue20});
            textInputLayout.setPlaceholderTextColor(colorStateList4);
            textInputLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: hr.b0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    d0.n(TextInputLayout.this, colorStateList5, colorStateList4, view, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        EditText editText9 = textInputLayout.getEditText();
        if (editText9 != null) {
            editText9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: hr.c0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    d0.o(TextInputLayout.this, c0Var, view, z10);
                }
            });
        }
        Integer baseMaskToggleColor = styles.getBaseMaskToggleColor();
        if (baseMaskToggleColor != null) {
            int intValue21 = baseMaskToggleColor.intValue();
            Integer focusedMaskToggleColor = styles.getFocusedMaskToggleColor();
            int intValue22 = focusedMaskToggleColor != null ? focusedMaskToggleColor.intValue() : intValue21;
            Integer disabledMaskToggleColor = styles.getDisabledMaskToggleColor();
            textInputLayout.setEndIconTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_active}, new int[]{R.attr.state_focused}, new int[]{-16842910}, new int[]{-16842914}}, new int[]{intValue21, intValue22, disabledMaskToggleColor != null ? disabledMaskToggleColor.intValue() : intValue21, intValue21}));
        }
    }

    public static final void l(TextInputLayout textInputLayout, int i10, ColorStateList colorStateList, int i11, View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setTextColor(colorStateList);
            }
            j(textInputLayout, i11);
            return;
        }
        EditText editText2 = textInputLayout.getEditText();
        if (editText2 != null) {
            editText2.setTextColor(i10);
        }
        j(textInputLayout, i10);
    }

    public static final void m(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            textInputLayout.setDefaultHintTextColor(colorStateList2);
        } else {
            textInputLayout.setDefaultHintTextColor(colorStateList);
        }
    }

    public static final void n(TextInputLayout textInputLayout, ColorStateList colorStateList, ColorStateList colorStateList2, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            textInputLayout.setPlaceholderTextColor(colorStateList2);
        } else {
            textInputLayout.setPlaceholderTextColor(colorStateList);
        }
    }

    public static final void o(TextInputLayout textInputLayout, final kotlin.jvm.internal.c0 c0Var, View view, final boolean z10) {
        textInputLayout.post(new Runnable() { // from class: hr.v
            @Override // java.lang.Runnable
            public final void run() {
                d0.p(kotlin.jvm.internal.c0.this, z10);
            }
        });
    }

    public static final void p(kotlin.jvm.internal.c0 c0Var, boolean z10) {
        Function1 function1 = (Function1) c0Var.f22963a;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z10));
        }
    }

    public static final Unit q(TextInputLayout textInputLayout, int i10, int i11, int i12, boolean z10) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            i(textInputLayout, z10, i10, i11, i12);
        }
        return Unit.f22894a;
    }

    public static final void r(TextInputLayout textInputLayout, int i10, int i11, int i12, int i13, View view, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        CharSequence error = textInputLayout.getError();
        if (error == null || !kotlin.text.c0.t1(error)) {
            i(textInputLayout, textInputLayout.hasFocus(), i11, i12, i13);
        } else {
            textInputLayout.setBoxBackgroundColor(i10);
        }
    }

    public static final Unit s(TextInputLayout textInputLayout, Typeface it) {
        Intrinsics.checkNotNullParameter(it, "it");
        textInputLayout.setTypeface(it);
        return Unit.f22894a;
    }
}
