package com.roblox.client;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.widget.TextView;
import androidx.core.view.MotionEventCompat;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import dh.e;
import ek.q;
import q.l;
import rg.a1;
import rg.e2;
import rg.t0;
import rh.h;

/* loaded from: classes2.dex */
public class RbxKeyboard extends l {

    /* renamed from: g, reason: collision with root package name */
    public final String f8947g;

    /* renamed from: h, reason: collision with root package name */
    public long f8948h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8949i;

    /* renamed from: j, reason: collision with root package name */
    public int f8950j;

    /* renamed from: k, reason: collision with root package name */
    public AutofillManager f8951k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8952l;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            q.b("rbx.glview.text", "onTextChanged() text:" + ((Object) charSequence));
            RbxKeyboard.this.k();
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), charSequence.toString(), false, i10 + i12);
        }
    }

    public class b implements TextView.OnEditorActionListener {
        public b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            q.b("rbx.glview.text", "onEditorAction() text:" + ((Object) textView.getText()));
            RbxKeyboard.this.k();
            NativeGLInterface.nativeReturnPressedFromOnScreenKeyboard(RbxKeyboard.this.getCurrentTextBox());
            if (RbxKeyboard.this.g()) {
                return true;
            }
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), textView.getText().toString(), true, textView.getSelectionStart());
            RbxKeyboard.this.e();
            return true;
        }
    }

    public RbxKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8947g = "rbx.glview.text";
    }

    @Override // android.widget.TextView, android.view.View
    public void autofill(AutofillValue autofillValue) {
        super.autofill(autofillValue);
        if (h.a().I3()) {
            t0.c("autofillActivated", null, null, this.f8950j + "");
        }
    }

    public void e() {
        setCurrentTextBox(0L);
        e2.i(getContext(), this);
        setVisibility(8);
    }

    public void f() {
        if (h.a().F2()) {
            this.f8951k = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        }
        addTextChangedListener(new a());
        setOnEditorActionListener(new b());
    }

    public boolean g() {
        return this.f8949i;
    }

    public long getCurrentTextBox() {
        return this.f8948h;
    }

    public void h() {
        q.h("rbx.glview.text", "onVrSessionForeground");
        if (a1.q0()) {
            q.b("rbx.glview.text", "Maquettes keyboard release focus only hide triggered.");
            NativeGLInterface.nativeReleaseFocus(this.f8948h);
            this.f8948h = 0L;
        }
    }

    public void i(NativeTextBoxInfo nativeTextBoxInfo, String str) {
        AutofillManager autofillManager;
        if (!h.a().F2() || (autofillManager = this.f8951k) == null) {
            return;
        }
        autofillManager.cancel();
        boolean z10 = nativeTextBoxInfo != null && (nativeTextBoxInfo.textInputType == 5 || ((h.a().Q0() && nativeTextBoxInfo.textInputType == 6) || ((h.a().x0() && nativeTextBoxInfo.textInputType == 9) || (h.a().Q0() && h.a().x0() && nativeTextBoxInfo.textInputType == 10))));
        if (str.isEmpty() && z10) {
            this.f8951k.requestAutofill(this);
        }
    }

    public void j(long j10) {
        NativeGLInterface.nativeReleaseFocus(j10);
    }

    public void k() {
        String obj = getText().toString();
        int selectionStart = getSelectionStart();
        q.b("rbx.glview.text", "syncTextboxTextAndCursorPosition() text:" + obj + " pos:" + selectionStart);
        NativeGLInterface.syncTextboxTextAndCursorPosition2(obj, selectionStart);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.roblox.engine.jni.model.NativeTextBoxInfo r8) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.RbxKeyboard.l(com.roblox.engine.jni.model.NativeTextBoxInfo):void");
    }

    public void m(int i10, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        if (e.e(this, getContext(), i10)) {
            f12 = e.b(i10, getContext());
        } else {
            if (i10 == 4) {
                e.d(this, getContext(), "SourceSansPro-Bold.ttf");
                f13 = 0.04f;
            } else if (i10 != 5) {
                e.d(this, getContext(), "SourceSansPro-Regular.ttf");
            } else {
                e.d(this, getContext(), "SourceSansPro-Light.ttf");
            }
            f12 = 0.795f;
        }
        setTextSize(0, f10 * f11 * f12);
        q.b("rbx.glview.text", "using letter spacing = " + f13);
        setLetterSpacing(f13);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        k();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 4) {
            switch (keyCode) {
                case 19:
                case 20:
                case MotionEventCompat.AXIS_WHEEL /* 21 */:
                case MotionEventCompat.AXIS_GAS /* 22 */:
                case MotionEventCompat.AXIS_BRAKE /* 23 */:
                    return false;
            }
        }
        if (keyEvent.getAction() == 1) {
            j(this.f8948h);
            this.f8948h = 0L;
            setVisibility(8);
            setText("");
            e2.i(getContext(), this);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i10, int i11) {
        if (isInEditMode()) {
            return;
        }
        k();
    }

    @Override // q.l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (h.a().h0() && this.f8952l && (i10 == 16908322 || i10 == 16908337 || i10 == 16908320)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    public void setCurrentTextBox(long j10) {
        this.f8948h = j10;
    }

    public void setManualFocusRelease(boolean z10) {
        this.f8949i = z10;
    }
}
