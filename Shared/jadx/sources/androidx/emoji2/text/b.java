package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.NonNull;
import androidx.emoji2.text.c;

/* loaded from: classes.dex */
public class b implements c.e {
    public static final ThreadLocal<StringBuilder> b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f2219a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f2219a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.e
    public boolean a(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder b10 = b();
        b10.setLength(0);
        while (i10 < i11) {
            b10.append(charSequence.charAt(i10));
            i10++;
        }
        return androidx.core.graphics.d.a(this.f2219a, b10.toString());
    }
}
