package ad;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.c1;

/* loaded from: classes2.dex */
public class d {
    public static void a(@NonNull Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int b = uc.a.b(window.getContext(), R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
            if (z11) {
                num = Integer.valueOf(b);
            }
            if (z12) {
                num2 = Integer.valueOf(b);
            }
        }
        c1.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b10 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b10);
        f(window, d(c10, uc.a.h(num.intValue())));
        e(window, d(b10, uc.a.h(num2.intValue())));
    }

    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.c.l(uc.a.b(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
        }
        if (z10) {
            return 0;
        }
        return uc.a.b(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    @TargetApi(MotionEventCompat.AXIS_WHEEL)
    public static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return uc.a.b(context, R.attr.statusBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    public static boolean d(int i10, boolean z10) {
        if (uc.a.h(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void e(@NonNull Window window, boolean z10) {
        c1.a(window, window.getDecorView()).c(z10);
    }

    public static void f(@NonNull Window window, boolean z10) {
        c1.a(window, window.getDecorView()).d(z10);
    }
}
