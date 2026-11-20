package b4;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f3763a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public c.f f3764c;

    /* renamed from: d, reason: collision with root package name */
    public int f3765d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f3766e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3767f = true;

    public static class a extends c.f {

        /* renamed from: a, reason: collision with root package name */
        public final Reference<EditText> f3768a;

        public a(EditText editText) {
            this.f3768a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            super.b();
            g.b(this.f3768a.get(), 1);
        }
    }

    public g(EditText editText, boolean z10) {
        this.f3763a = editText;
        this.b = z10;
    }

    public static void b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.c().p(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final c.f a() {
        if (this.f3764c == null) {
            this.f3764c = new a(this.f3763a);
        }
        return this.f3764c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void c(boolean z10) {
        if (this.f3767f != z10) {
            if (this.f3764c != null) {
                androidx.emoji2.text.c.c().u(this.f3764c);
            }
            this.f3767f = z10;
            if (z10) {
                b(this.f3763a, androidx.emoji2.text.c.c().e());
            }
        }
    }

    public final boolean d() {
        if (this.f3767f) {
            return (this.b || androidx.emoji2.text.c.i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f3763a.isInEditMode() || d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int e10 = androidx.emoji2.text.c.c().e();
        if (e10 != 0) {
            if (e10 == 1) {
                androidx.emoji2.text.c.c().s((Spannable) charSequence, i10, i10 + i12, this.f3765d, this.f3766e);
                return;
            } else if (e10 != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.c().t(a());
    }
}
