package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\b"}, d2 = {"Lcom/appsflyer/internal/AFd1dSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AFKeystoreWrapper", "Ljava/lang/String;", "unregisterClient", "registerClient", rl.d.f30696a}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1dSDK {
    private static final /* synthetic */ AFd1dSDK[] AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public static final AFd1dSDK f5312d;
    public static final AFd1dSDK registerClient;
    public static final AFd1dSDK unregisterClient;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final String unregisterClient;

    static {
        AFd1dSDK aFd1dSDK = new AFd1dSDK("API", 0, "api");
        registerClient = aFd1dSDK;
        AFd1dSDK aFd1dSDK2 = new AFd1dSDK("RC", 1, "rc");
        f5312d = aFd1dSDK2;
        AFd1dSDK aFd1dSDK3 = new AFd1dSDK("DEFAULT", 2, "");
        unregisterClient = aFd1dSDK3;
        AFd1dSDK[] aFd1dSDKArr = {aFd1dSDK, aFd1dSDK2, aFd1dSDK3};
        AFLogger = aFd1dSDKArr;
        pt.b.a(aFd1dSDKArr);
    }

    private AFd1dSDK(String str, int i10, String str2) {
        this.unregisterClient = str2;
    }

    public static AFd1dSDK valueOf(String str) {
        return (AFd1dSDK) Enum.valueOf(AFd1dSDK.class, str);
    }

    public static AFd1dSDK[] values() {
        return (AFd1dSDK[]) AFLogger.clone();
    }
}
