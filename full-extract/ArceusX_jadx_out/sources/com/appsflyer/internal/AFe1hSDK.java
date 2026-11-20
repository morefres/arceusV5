package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\t\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\t\u0010\u000fJ-\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u000bj\u0002`\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFe1hSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;", "p0", "Lcom/appsflyer/internal/AFi1vSDK;", "p1", "", "unregisterClient", "(Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;Lcom/appsflyer/internal/AFi1vSDK;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "", "(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V", "p2", "AFLogger", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1hSDK {

    @NotNull
    public static final AFe1hSDK INSTANCE = new AFe1hSDK();

    private AFe1hSDK() {
    }

    private static void AFLogger(StringBuilder p02, String p12, String p22) {
        if (p12 == null || p12.length() == 0) {
            return;
        }
        p02.append("; ");
        p02.append(p22);
        p02.append(p12);
    }

    @NotNull
    public static final String unregisterClient(@NotNull HttpException p02, @Nullable AFi1vSDK p12) {
        String obj;
        Intrinsics.checkNotNullParameter(p02, "");
        StringBuilder sb2 = new StringBuilder();
        AFe1hSDK aFe1hSDK = INSTANCE;
        sb2.append("Network error: ");
        Throwable cause = p02.getCause();
        if (cause != null) {
            aFe1hSDK.unregisterClient(sb2, cause);
        } else {
            String message = p02.getMessage();
            if (message != null) {
                if (message.length() <= 0) {
                    message = null;
                }
                if (message != null) {
                    sb2.append(message);
                }
            }
        }
        sb2.append("; httpLatencyMs=");
        sb2.append(p02.getMetrics().registerClient);
        if (p12 != null) {
            AFi1ySDK aFi1ySDK = p12.f5467d;
            NetworkTroubleshootingData AFKeystoreWrapper = aFi1ySDK != null ? aFi1ySDK.AFKeystoreWrapper() : null;
            if (AFKeystoreWrapper != null) {
                sb2.append("; networkType=");
                sb2.append(AFKeystoreWrapper.networkType);
                Boolean bool = AFKeystoreWrapper.hasInternetCapability;
                if (bool != null) {
                    sb2.append("; ");
                    sb2.append("hasInternetCapability=");
                    sb2.append(bool.booleanValue());
                }
                Boolean bool2 = AFKeystoreWrapper.hasValidatedCapability;
                if (bool2 != null) {
                    sb2.append("; ");
                    sb2.append("hasValidatedCapability=");
                    sb2.append(bool2.booleanValue());
                }
                AFLogger(sb2, AFKeystoreWrapper.dataState, "dataState=");
                Boolean valueOf = Boolean.valueOf(AFKeystoreWrapper.isVpnEnabled);
                sb2.append("; ");
                sb2.append("vpnEnabled=");
                String obj2 = valueOf.toString();
                String str = "null";
                if (obj2 == null) {
                    obj2 = "null";
                }
                sb2.append(obj2);
                AFLogger(sb2, AFKeystoreWrapper.vpnUnderlyingTransport, "vpnUnderlyingTransport=");
                if (AFKeystoreWrapper.isVpnEnabled) {
                    AFLogger(sb2, AFKeystoreWrapper.devicePrivateVpnAddress, "devicePrivateVpnAddress=");
                }
                Boolean bool3 = AFKeystoreWrapper.customDnsEnabled;
                sb2.append("; ");
                sb2.append("customDnsEnabled=");
                if (bool3 != null && (obj = bool3.toString()) != null) {
                    str = obj;
                }
                sb2.append(str);
                if (Intrinsics.c(AFKeystoreWrapper.customDnsEnabled, Boolean.TRUE)) {
                    AFLogger(sb2, AFKeystoreWrapper.customDnsServerName, "customDnsServerName=");
                }
            }
        }
        String obj3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(obj3, "");
        return obj3;
    }

    private final void unregisterClient(StringBuilder p02, Throwable p12) {
        p02.append(p12.getClass().getSimpleName());
        String message = p12.getMessage();
        if (message != null) {
            if (message.length() <= 0) {
                message = null;
            }
            if (message != null) {
                p02.append(": ");
                p02.append(message);
            }
        }
        Throwable cause = p12.getCause();
        if (cause == null || Intrinsics.c(cause, p12)) {
            return;
        }
        p02.append(" (caused by: ");
        unregisterClient(p02, cause);
        p02.append(')');
    }
}
