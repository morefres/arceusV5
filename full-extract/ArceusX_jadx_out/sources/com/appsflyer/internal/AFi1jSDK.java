package com.appsflyer.internal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/appsflyer/internal/AFi1jSDK;", "", "<init>", "(Ljava/lang/String;I)V", "AFLogger", "AFKeystoreWrapper", rl.d.f30696a}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFi1jSDK {
    public static final AFi1jSDK AFKeystoreWrapper;
    public static final AFi1jSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public static final AFi1jSDK f5460d;
    private static final /* synthetic */ AFi1jSDK[] registerClient;

    static {
        AFi1jSDK aFi1jSDK = new AFi1jSDK("FACEBOOK", 0);
        AFLogger = aFi1jSDK;
        AFi1jSDK aFi1jSDK2 = new AFi1jSDK("INSTAGRAM", 1);
        AFKeystoreWrapper = aFi1jSDK2;
        AFi1jSDK aFi1jSDK3 = new AFi1jSDK("FACEBOOK_LITE", 2);
        f5460d = aFi1jSDK3;
        AFi1jSDK[] aFi1jSDKArr = {aFi1jSDK, aFi1jSDK2, aFi1jSDK3};
        registerClient = aFi1jSDKArr;
        pt.b.a(aFi1jSDKArr);
    }

    private AFi1jSDK(String str, int i10) {
    }

    public static AFi1jSDK valueOf(String str) {
        return (AFi1jSDK) Enum.valueOf(AFi1jSDK.class, str);
    }

    public static AFi1jSDK[] values() {
        return (AFi1jSDK[]) registerClient.clone();
    }
}
