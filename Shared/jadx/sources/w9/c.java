package w9;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class c {
    public static final c b = new c();

    /* renamed from: a, reason: collision with root package name */
    public b f34170a = null;

    @NonNull
    public static b a(@NonNull Context context) {
        return b.b(context);
    }

    @NonNull
    public final synchronized b b(@NonNull Context context) {
        try {
            if (this.f34170a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f34170a = new b(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f34170a;
    }
}
