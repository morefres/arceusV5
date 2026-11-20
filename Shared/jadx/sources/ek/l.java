package ek;

import android.content.Context;
import android.util.Log;
import gt.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lek/l;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", j6.b.f21518e, "(Landroid/content/Context;)Z", "", "minVersionCode", ve.a.f33391e, "(Landroid/content/Context;I)Z", "utils_googleRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f16042a = new l();

    public static final boolean a(@NotNull Context context, int minVersionCode) {
        Object b;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            n.Companion companion = gt.n.INSTANCE;
            int h10 = j9.c.o().h(context, minVersionCode);
            boolean z10 = h10 == 0;
            q.b("GooglePlayServices", "Google Play Services status for minVersionCode=" + minVersionCode + ": " + h10 + ", available=" + z10);
            b = gt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            Log.w("GooglePlayServices", "Failed to query Google Play Services version", e10);
            b = Boolean.FALSE;
        }
        return ((Boolean) b).booleanValue();
    }

    public static final boolean b(@Nullable Context context) {
        Object b;
        if (context == null) {
            return false;
        }
        try {
            n.Companion companion = gt.n.INSTANCE;
            int g10 = j9.c.o().g(context);
            boolean z10 = g10 == 0;
            q.b("GooglePlayServices", "Google Play Services availability status: " + g10 + ", available=" + z10);
            b = gt.n.b(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        Throwable e10 = gt.n.e(b);
        if (e10 != null) {
            Log.w("GooglePlayServices", "Failed to query Google Play Services availability", e10);
        }
        Boolean bool = Boolean.FALSE;
        if (gt.n.g(b)) {
            b = bool;
        }
        return ((Boolean) b).booleanValue();
    }
}
