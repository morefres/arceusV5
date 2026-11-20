package b4;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3753a = new Object();
    public static volatile Editable.Factory b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f3754c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f3754c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (f3753a) {
                try {
                    if (b == null) {
                        b = new b();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f3754c;
        return cls != null ? z3.h.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
