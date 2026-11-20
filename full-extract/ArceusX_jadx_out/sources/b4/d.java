package b4;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3756a;
    public c.f b;

    public static class a extends c.f {

        /* renamed from: a, reason: collision with root package name */
        public final Reference<TextView> f3757a;
        public final Reference<d> b;

        public a(TextView textView, d dVar) {
            this.f3757a = new WeakReference(textView);
            this.b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            CharSequence text;
            CharSequence p8;
            super.b();
            TextView textView = this.f3757a.get();
            if (c(textView, this.b.get()) && textView.isAttachedToWindow() && text != (p8 = androidx.emoji2.text.c.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(p8);
                int selectionEnd = Selection.getSelectionEnd(p8);
                textView.setText(p8);
                if (p8 instanceof Spannable) {
                    d.b((Spannable) p8, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(@NonNull TextView textView) {
        this.f3756a = textView;
    }

    public static void b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    public final c.f a() {
        if (this.b == null) {
            this.b = new a(this.f3756a, this);
        }
        return this.b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f3756a.isInEditMode()) {
            return charSequence;
        }
        int e10 = androidx.emoji2.text.c.c().e();
        if (e10 != 0) {
            if (e10 == 1) {
                if ((i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f3756a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return androidx.emoji2.text.c.c().q(charSequence, 0, charSequence.length());
            }
            if (e10 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.c.c().t(a());
        return charSequence;
    }
}
