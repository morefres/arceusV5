package com.appsflyer.internal;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/appsflyer/internal/AFd1cSDK;", "", "<init>", "(Ljava/lang/String;I)V", rl.d.f30696a, "registerClient", "unregisterClient"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1cSDK {
    private static final /* synthetic */ AFd1cSDK[] AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public static final AFd1cSDK f5311d;
    public static final AFd1cSDK registerClient;
    public static final AFd1cSDK unregisterClient;

    static {
        AFd1cSDK aFd1cSDK = new AFd1cSDK("SUCCESS", 0);
        f5311d = aFd1cSDK;
        AFd1cSDK aFd1cSDK2 = new AFd1cSDK("FAILURE", 1);
        registerClient = aFd1cSDK2;
        AFd1cSDK aFd1cSDK3 = new AFd1cSDK(Payload.RESPONSE_TIMEOUT, 2);
        unregisterClient = aFd1cSDK3;
        AFd1cSDK[] aFd1cSDKArr = {aFd1cSDK, aFd1cSDK2, aFd1cSDK3};
        AFLogger = aFd1cSDKArr;
        pt.b.a(aFd1cSDKArr);
    }

    private AFd1cSDK(String str, int i10) {
    }

    public static AFd1cSDK valueOf(String str) {
        return (AFd1cSDK) Enum.valueOf(AFd1cSDK.class, str);
    }

    public static AFd1cSDK[] values() {
        return (AFd1cSDK[]) AFLogger.clone();
    }
}
