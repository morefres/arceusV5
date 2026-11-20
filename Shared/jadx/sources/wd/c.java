package wd;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class c {
    @NonNull
    public static b a(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new com.google.android.play.core.review.b(new g(context));
    }
}
