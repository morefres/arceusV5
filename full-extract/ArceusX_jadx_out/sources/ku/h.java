package ku;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import gt.n;
import gt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroid/os/Looper;", "", "async", "Landroid/os/Handler;", ve.a.f33391e, "(Landroid/os/Looper;Z)Landroid/os/Handler;", "Lku/g;", "Lku/g;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public static final g f23164a;

    @Nullable
    private static volatile Choreographer choreographer;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object b;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            n.Companion companion = n.INSTANCE;
            b = n.b(new f(a(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            b = n.b(o.a(th2));
        }
        f23164a = (g) (n.g(b) ? null : b);
    }

    @NotNull
    public static final Handler a(@NotNull Looper looper, boolean z10) {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.d(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
