package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/appsflyer/internal/AFd1tSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "registerClient", "Ljava/lang/String;", "unregisterClient", "AFKeystoreWrapper", rl.d.f30696a, "AFLogger", "w", "i", "v", "e"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1tSDK {
    private static AFd1tSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public static final AFd1tSDK f5330d;

    /* renamed from: e, reason: collision with root package name */
    private static AFd1tSDK f5331e;
    private static final /* synthetic */ AFd1tSDK[] force;

    /* renamed from: i, reason: collision with root package name */
    private static AFd1tSDK f5332i;

    /* renamed from: v, reason: collision with root package name */
    private static AFd1tSDK f5333v;

    /* renamed from: w, reason: collision with root package name */
    private static AFd1tSDK f5334w;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    public final String unregisterClient;
    private static AFd1tSDK AFKeystoreWrapper = new AFd1tSDK("TEXT", 0, "text/plain");
    private static AFd1tSDK unregisterClient = new AFd1tSDK("JSON", 1, "application/json");

    static {
        AFd1tSDK aFd1tSDK = new AFd1tSDK("OCTET_STREAM", 2, "application/octet-stream");
        f5330d = aFd1tSDK;
        AFLogger = new AFd1tSDK("XML", 3, "application/xml");
        f5334w = new AFd1tSDK("HTML", 4, "text/html");
        f5332i = new AFd1tSDK("FORM", 5, "application/x-www-form-urlencoded");
        f5333v = new AFd1tSDK("IMAGE_JPEG", 6, "image/jpeg");
        AFd1tSDK aFd1tSDK2 = new AFd1tSDK("IMAGE_PNG", 7, "image/png");
        f5331e = aFd1tSDK2;
        AFd1tSDK[] aFd1tSDKArr = {AFKeystoreWrapper, unregisterClient, aFd1tSDK, AFLogger, f5334w, f5332i, f5333v, aFd1tSDK2};
        force = aFd1tSDKArr;
        pt.b.a(aFd1tSDKArr);
    }

    private AFd1tSDK(String str, int i10, String str2) {
        this.unregisterClient = str2;
    }

    public static AFd1tSDK valueOf(String str) {
        return (AFd1tSDK) Enum.valueOf(AFd1tSDK.class, str);
    }

    public static AFd1tSDK[] values() {
        return (AFd1tSDK[]) force.clone();
    }
}
