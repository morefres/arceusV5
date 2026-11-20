package d6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import b6.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.w;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\n*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "Ld6/h;", "Lb6/h;", ve.a.f33391e, "(Landroid/content/Context;Lh6/b;)Ld6/h;", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "isBlocked", "c", "(Landroid/net/ConnectivityManager;Z)Lb6/h;", "", "Ljava/lang/String;", "TAG", rl.d.f30696a, "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f14404a;

    static {
        String i10 = w.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(...)");
        f14404a = i10;
    }

    @NotNull
    public static final h<NetworkState> a(@NotNull Context context, @NotNull h6.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new k(context, taskExecutor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0.isRoaming() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[Catch: SecurityException -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x0017, blocks: (B:28:0x000d, B:9:0x0027), top: B:27:0x000d }] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b6.NetworkState c(@org.jetbrains.annotations.NotNull android.net.ConnectivityManager r7, boolean r8) {
        /*
            java.lang.String r0 = "connectivityManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.net.NetworkInfo r0 = r7.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L3a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            boolean r3 = r0.isConnected()     // Catch: java.lang.SecurityException -> L17
            if (r3 == 0) goto L1b
            r3 = r1
            r1 = r2
            r4 = r1
            goto L1d
        L17:
            r0 = move-exception
            r7 = r0
            r5 = r8
            goto L3d
        L1b:
            r3 = r1
            r4 = r2
        L1d:
            boolean r2 = d(r7)     // Catch: java.lang.SecurityException -> L3a
            boolean r7 = t2.a.a(r7)     // Catch: java.lang.SecurityException -> L3a
            if (r0 == 0) goto L2e
            boolean r0 = r0.isRoaming()     // Catch: java.lang.SecurityException -> L17
            if (r0 != 0) goto L2e
            goto L2f
        L2e:
            r4 = r3
        L2f:
            b6.h r0 = new b6.h     // Catch: java.lang.SecurityException -> L3a
            r3 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.SecurityException -> L37
            return r0
        L37:
            r0 = move-exception
        L38:
            r7 = r0
            goto L3d
        L3a:
            r0 = move-exception
            r5 = r8
            goto L38
        L3d:
            x5.w r8 = x5.w.e()
            java.lang.String r0 = d6.j.f14404a
            java.lang.String r1 = "Unable to get active network state"
            r8.d(r0, r1, r7)
            b6.h r1 = new b6.h
            r4 = 0
            r6 = r5
            r5 = 1
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.j.c(android.net.ConnectivityManager, boolean):b6.h");
    }

    public static final boolean d(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            w.e().d(f14404a, "Unable to validate active network", e10);
            return false;
        }
    }
}
