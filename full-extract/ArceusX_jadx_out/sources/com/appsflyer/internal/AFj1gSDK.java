package com.appsflyer.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/appsflyer/internal/AFj1gSDK;", "", "<init>", "(Ljava/lang/String;I)V", "AFKeystoreWrapper", "registerClient", "AFLogger"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class AFj1gSDK {
    public static final AFj1gSDK AFKeystoreWrapper;
    public static final AFj1gSDK AFLogger;
    public static final AFj1gSDK registerClient;
    private static final /* synthetic */ AFj1gSDK[] unregisterClient;

    static {
        AFj1gSDK aFj1gSDK = new AFj1gSDK("UNDETERMINED", 0);
        AFKeystoreWrapper = aFj1gSDK;
        AFj1gSDK aFj1gSDK2 = new AFj1gSDK("NOT_PRESENT", 1);
        registerClient = aFj1gSDK2;
        AFj1gSDK aFj1gSDK3 = new AFj1gSDK("PRESENT", 2);
        AFLogger = aFj1gSDK3;
        AFj1gSDK[] aFj1gSDKArr = {aFj1gSDK, aFj1gSDK2, aFj1gSDK3};
        unregisterClient = aFj1gSDKArr;
        pt.b.a(aFj1gSDKArr);
    }

    private AFj1gSDK(String str, int i10) {
    }

    public static AFj1gSDK valueOf(String str) {
        return (AFj1gSDK) Enum.valueOf(AFj1gSDK.class, str);
    }

    public static AFj1gSDK[] values() {
        return (AFj1gSDK[]) unregisterClient.clone();
    }
}
