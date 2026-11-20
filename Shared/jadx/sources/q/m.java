package q;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final EditText f29358a;

    @NonNull
    public final b4.a b;

    public m(@NonNull EditText editText) {
        this.f29358a = editText;
        this.b = new b4.a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f29358a.getContext().obtainStyledAttributes(attributeSet, i.j.f19970i0, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(i.j.f20040w0) ? obtainStyledAttributes.getBoolean(i.j.f20040w0, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public InputConnection d(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.b.b(inputConnection, editorInfo);
    }

    public void e(boolean z10) {
        this.b.c(z10);
    }
}
