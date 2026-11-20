package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H%¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0018H\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0005¢\u0006\u0004\b\u001b\u0010\bR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u001e\u0010\r\u001a\u0004\u0018\u00010\u001e8\u0005@\u0004X\u0085\f¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#"}, d2 = {"Lcom/appsflyer/internal/AFi1ySDK;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "AFLogger", "()Ljava/lang/String;", "", "registerClient", "()Z", "Lcom/appsflyer/internal/AFi1xSDK;", "unregisterClient", "()Lcom/appsflyer/internal/AFi1xSDK;", "Lcom/appsflyer/internal/AFi1rSDK;", "AFKeystoreWrapper", "()Lcom/appsflyer/internal/AFi1rSDK;", "Landroid/net/NetworkCapabilities;", "L_", "()Landroid/net/NetworkCapabilities;", "Landroid/net/Network;", "K_", "()Landroid/net/Network;", "Lkotlin/Pair;", "v", "()Lkotlin/Pair;", "e", "Landroid/content/Context;", rl.d.f30696a, "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "E_", "()Landroid/net/ConnectivityManager;", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/TelephonyManager;", "AFa1uSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFi1ySDK {

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @Nullable
    private final TelephonyManager AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private ConnectivityManager unregisterClient;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final Context d;

    public AFi1ySDK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.d = context;
        Object systemService = context.getSystemService("connectivity");
        this.unregisterClient = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        Object systemService2 = context.getSystemService("phone");
        this.AFKeystoreWrapper = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    @Nullable
    private String e() {
        try {
            TelephonyManager telephonyManager = this.AFKeystoreWrapper;
            if (telephonyManager == null) {
                return null;
            }
            int dataState = telephonyManager.getDataState();
            if (dataState == 0) {
                return "DISCONNECTED";
            }
            if (dataState == 1) {
                return "CONNECTING";
            }
            if (dataState == 2) {
                return "CONNECTED";
            }
            if (dataState == 3) {
                return "SUSPENDED";
            }
            return "UNKNOWN(" + dataState + ")";
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting data state. ", th2, false, false, false, false, 120, null);
            return null;
        }
    }

    @NotNull
    private Pair<Boolean, Boolean> v() {
        try {
            ConnectivityManager connectivityManager = this.unregisterClient;
            if (connectivityManager == null) {
                return new Pair<>(null, null);
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                Boolean bool = Boolean.FALSE;
                return new Pair<>(bool, bool);
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                Boolean bool2 = Boolean.FALSE;
                return new Pair<>(bool2, bool2);
            }
            return new Pair<>(Boolean.valueOf(networkCapabilities.hasCapability(12)), Boolean.valueOf(networkCapabilities.hasCapability(16)));
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting internet capabilities. ", th2, false, false, false, false, 120, null);
            return new Pair<>(null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x006f  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.NetworkTroubleshootingData AFKeystoreWrapper() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1ySDK.AFKeystoreWrapper():com.appsflyer.internal.AFi1rSDK");
    }

    @NotNull
    public abstract String AFLogger();

    @Nullable
    /* renamed from: E_, reason: from getter */
    public final ConnectivityManager getUnregisterClient() {
        return this.unregisterClient;
    }

    @Nullable
    public Network K_() {
        return null;
    }

    @Nullable
    public NetworkCapabilities L_() {
        return null;
    }

    public abstract boolean registerClient();

    @NotNull
    public final AFi1xSDK unregisterClient() {
        Throwable th2;
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = null;
        try {
            telephonyManager = this.AFKeystoreWrapper;
        } catch (Throwable th3) {
            th2 = th3;
            str = null;
        }
        if (telephonyManager != null) {
            str2 = telephonyManager.getSimOperatorName();
            try {
                str3 = telephonyManager.getNetworkOperatorName();
                if (str3 != null) {
                    if (str3.length() == 0) {
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
                str = str3;
                str3 = str2;
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Exception while collecting network info", th2, false, false, false, false, 120, null);
                str2 = str3;
                str3 = str;
                return new AFi1xSDK(AFLogger(), str3, str2, registerClient());
            }
            if (telephonyManager.getPhoneType() == 2) {
                str = "CDMA";
                str3 = str;
            }
        } else {
            str2 = null;
        }
        return new AFi1xSDK(AFLogger(), str3, str2, registerClient());
    }
}
