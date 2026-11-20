package g6;

import android.content.Context;
import android.os.PowerManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", ve.a.f33391e, "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f18348a;

    static {
        String i10 = x5.w.i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(...)");
        f18348a = i10;
    }

    @NotNull
    public static final PowerManager.WakeLock a(@NotNull Context context, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        b0 b0Var = b0.f18350a;
        synchronized (b0Var) {
            b0Var.a().put(newWakeLock, str);
        }
        Intrinsics.checkNotNull(newWakeLock);
        return newWakeLock;
    }
}
