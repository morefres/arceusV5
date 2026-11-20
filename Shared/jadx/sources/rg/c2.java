package rg;

import android.content.res.Configuration;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lrg/c2;", "", "<init>", "()V", "Landroid/view/Window;", "window", "", j6.b.f21518e, "(Landroid/view/Window;)V", "c", "Landroid/content/res/Configuration;", "config", ve.a.f33391e, "(Landroid/view/Window;Landroid/content/res/Configuration;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c2 f30278a = new c2();

    public static final void a(@NotNull Window window, @NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.orientation == 2) {
            b(window);
        } else {
            c(window);
        }
    }

    public static final void b(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        androidx.core.view.l1 a10 = androidx.core.view.c1.a(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(a10, "getInsetsController(...)");
        a10.a(WindowInsetsCompat.Type.systemBars());
        a10.a(WindowInsetsCompat.Type.displayCutout());
        a10.e(2);
    }

    public static final void c(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        androidx.core.view.l1 a10 = androidx.core.view.c1.a(window, window.getDecorView());
        Intrinsics.checkNotNullExpressionValue(a10, "getInsetsController(...)");
        a10.f(WindowInsetsCompat.Type.systemBars());
        a10.f(WindowInsetsCompat.Type.displayCutout());
    }
}
