package qh;

import android.content.Context;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqh/j;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", ve.a.f33391e, "(Landroid/content/Context;)V", j6.b.f21518e, "", "", "c", "(Landroid/content/Context;)Ljava/util/Set;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f29861a = new j();

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        zd.a.a(context);
    }

    public static final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        zd.a.b(context);
    }

    @NotNull
    public static final Set<String> c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ae.b a10 = ae.c.a(context);
        Intrinsics.checkNotNullExpressionValue(a10, "create(...)");
        Set<String> e10 = a10.e();
        Intrinsics.checkNotNullExpressionValue(e10, "getInstalledModules(...)");
        return e10;
    }
}
