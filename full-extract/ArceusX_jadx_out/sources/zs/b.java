package zs;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f38155a;

    public b(float f10) {
        this.f38155a = f10;
    }

    @NonNull
    public static b a(@NonNull Context context) {
        return new b(context.getResources().getDisplayMetrics().density);
    }

    public int b(int i10) {
        return (int) ((i10 * this.f38155a) + 0.5f);
    }
}
