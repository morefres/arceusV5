package com.google.android.material.timepicker;

import ad.n;
import ad.r;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import ic.f;
import ic.h;

/* loaded from: classes2.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f8359a;
    public final TextInputLayout b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f8360c;

    /* renamed from: d, reason: collision with root package name */
    public TextWatcher f8361d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f8362e;

    public class b extends n {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f8359a.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String c10 = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f8359a;
            if (TextUtils.isEmpty(c10)) {
                c10 = ChipTextInputComboView.this.c("00");
            }
            chip.setText(c10);
        }
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String c(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    public final void d() {
        this.f8360c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f8359a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f8359a.setChecked(z10);
        this.f8360c.setVisibility(z10 ? 0 : 4);
        this.f8359a.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            r.m(this.f8360c, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8359a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f8359a.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f8359a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.f20513j, (ViewGroup) this, false);
        this.f8359a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.f20514k, (ViewGroup) this, false);
        this.b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f8360c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f8361d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f8362e = (TextView) findViewById(f.f20492p);
        editText.setId(o0.k());
        o0.z0(this.f8362e, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
