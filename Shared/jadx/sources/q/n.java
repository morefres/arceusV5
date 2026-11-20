package q;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f29359a;

    @NonNull
    public final b4.f b;

    public n(@NonNull TextView textView) {
        this.f29359a = textView;
        this.b = new b4.f(textView, false);
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    public boolean b() {
        return this.b.b();
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f29359a.getContext().obtainStyledAttributes(attributeSet, i.j.f19970i0, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(i.j.f20040w0) ? obtainStyledAttributes.getBoolean(i.j.f20040w0, true) : true;
            obtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void d(boolean z10) {
        this.b.c(z10);
    }

    public void e(boolean z10) {
        this.b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.b.e(transformationMethod);
    }
}
