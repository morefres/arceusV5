package hq;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/Window;", "", "backgroundColor", "", ve.a.f33391e, "(Landroid/view/Window;I)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p0 {
    public static final void a(@NotNull Window window, int i10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        int rgb = Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
        double d10 = androidx.core.graphics.c.d(-1, rgb);
        double d11 = androidx.core.graphics.c.d(ViewCompat.MEASURED_STATE_MASK, rgb);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        l1 l1Var = new l1(window, decorView);
        l1Var.d(d10 < d11);
        l1Var.c(d10 < d11);
    }
}
