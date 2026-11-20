package com.appsflyer.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0001\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000bj\u0002\b\tj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d"}, d2 = {"Lcom/appsflyer/internal/AFd1bSDK;", "Lcom/appsflyer/internal/AFe1zSDK;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getEntries", "I", "AFLogger", "()I", "unregisterClient", "AFa1vSDK", rl.d.f30696a, "AFKeystoreWrapper", "registerClient", "v", "i", "force", "e", "w", "afDebugLog", "afInfoLog", "afErrorLog", "AFLoggerLogLevel", "afWarnLog", "values", "AppsFlyerLib", "getLevel", "valueOf"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFd1bSDK implements AFe1zSDK {
    public static final AFd1bSDK AFKeystoreWrapper;
    public static final AFd1bSDK AFLogger;
    public static final AFd1bSDK AFLoggerLogLevel;

    /* renamed from: AFa1vSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AFd1bSDK AppsFlyerLib;
    public static final AFd1bSDK afDebugLog;
    public static final AFd1bSDK afErrorLog;
    public static final AFd1bSDK afInfoLog;
    public static final AFd1bSDK afWarnLog;

    /* renamed from: d, reason: collision with root package name */
    public static final AFd1bSDK f5306d;

    /* renamed from: e, reason: collision with root package name */
    public static final AFd1bSDK f5307e;
    private static final /* synthetic */ AFd1bSDK[] enableTCFDataCollection;
    public static final AFd1bSDK force;
    private static final /* synthetic */ pt.a getInstance;
    public static final AFd1bSDK getLevel;

    /* renamed from: i, reason: collision with root package name */
    public static final AFd1bSDK f5308i;
    public static final AFd1bSDK registerClient;
    public static final AFd1bSDK unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    public static final AFd1bSDK f5309v;
    public static final AFd1bSDK valueOf;
    public static final AFd1bSDK values;

    /* renamed from: w, reason: collision with root package name */
    public static final AFd1bSDK f5310w;

    /* renamed from: getEntries, reason: from kotlin metadata */
    private final int unregisterClient;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;", "", "<init>", "()V", "", "p0", "Lcom/appsflyer/internal/AFd1bSDK;", "registerClient", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFd1bSDK$AFa1vSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public static AFd1bSDK registerClient(@NotNull String p02) {
            Object obj;
            Intrinsics.checkNotNullParameter(p02, "");
            Iterator<E> it = AFd1bSDK.registerClient().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.c(((AFd1bSDK) obj).name(), p02)) {
                    break;
                }
            }
            return (AFd1bSDK) obj;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AFd1bSDK aFd1bSDK = new AFd1bSDK("RC_CDN", 0, 1);
        f5306d = aFd1bSDK;
        AFd1bSDK aFd1bSDK2 = new AFd1bSDK("FETCH_ADVERTISING_ID", 1, 1);
        AFKeystoreWrapper = aFd1bSDK2;
        AFd1bSDK aFd1bSDK3 = new AFd1bSDK("LOAD_CACHE", 2, 2);
        unregisterClient = aFd1bSDK3;
        AFd1bSDK aFd1bSDK4 = new AFd1bSDK("CACHED_EVENT", 3, 2);
        AFLogger = aFd1bSDK4;
        AFd1bSDK aFd1bSDK5 = new AFd1bSDK("CONVERSION", 4, 2);
        registerClient = aFd1bSDK5;
        AFd1bSDK aFd1bSDK6 = new AFd1bSDK("PLAY_INTEGRITY_API", 5, 2);
        f5309v = aFd1bSDK6;
        AFd1bSDK aFd1bSDK7 = new AFd1bSDK("ONELINK", 6, 2);
        f5308i = aFd1bSDK7;
        AFd1bSDK aFd1bSDK8 = new AFd1bSDK("DLSDK", 7, 2);
        force = aFd1bSDK8;
        AFd1bSDK aFd1bSDK9 = new AFd1bSDK("RESOLVE_ESP", 8, 2);
        f5307e = aFd1bSDK9;
        AFd1bSDK aFd1bSDK10 = new AFd1bSDK("ATTR", 9, 2);
        f5310w = aFd1bSDK10;
        AFd1bSDK aFd1bSDK11 = new AFd1bSDK("GCDSDK", 10, 3);
        afDebugLog = aFd1bSDK11;
        AFd1bSDK aFd1bSDK12 = new AFd1bSDK("REGISTER", 11, 4);
        afInfoLog = aFd1bSDK12;
        AFd1bSDK aFd1bSDK13 = new AFd1bSDK("LAUNCH", 12, 4);
        afErrorLog = aFd1bSDK13;
        AFd1bSDK aFd1bSDK14 = new AFd1bSDK("INAPP", 13, 4);
        AFLoggerLogLevel = aFd1bSDK14;
        AFd1bSDK aFd1bSDK15 = new AFd1bSDK("MANUAL_PURCHASE_VALIDATION", 14, 4);
        afWarnLog = aFd1bSDK15;
        AFd1bSDK aFd1bSDK16 = new AFd1bSDK("PURCHASE_VALIDATE", 15, 4);
        values = aFd1bSDK16;
        AFd1bSDK aFd1bSDK17 = new AFd1bSDK("IMPRESSIONS", 16, 4);
        AppsFlyerLib = aFd1bSDK17;
        AFd1bSDK aFd1bSDK18 = new AFd1bSDK("ARS_VALIDATE", 17, 4);
        getLevel = aFd1bSDK18;
        AFd1bSDK aFd1bSDK19 = new AFd1bSDK("ADREVENUE", 18, 4);
        valueOf = aFd1bSDK19;
        AFd1bSDK[] aFd1bSDKArr = {aFd1bSDK, aFd1bSDK2, aFd1bSDK3, aFd1bSDK4, aFd1bSDK5, aFd1bSDK6, aFd1bSDK7, aFd1bSDK8, aFd1bSDK9, aFd1bSDK10, aFd1bSDK11, aFd1bSDK12, aFd1bSDK13, aFd1bSDK14, aFd1bSDK15, aFd1bSDK16, aFd1bSDK17, aFd1bSDK18, aFd1bSDK19};
        enableTCFDataCollection = aFd1bSDKArr;
        getInstance = pt.b.a(aFd1bSDKArr);
        INSTANCE = new Companion(null);
    }

    private AFd1bSDK(String str, int i10, int i11) {
        this.unregisterClient = i11;
    }

    @Nullable
    public static final AFd1bSDK registerClient(@NotNull String str) {
        return Companion.registerClient(str);
    }

    public static AFd1bSDK valueOf(String str) {
        return (AFd1bSDK) Enum.valueOf(AFd1bSDK.class, str);
    }

    public static AFd1bSDK[] values() {
        return (AFd1bSDK[]) enableTCFDataCollection.clone();
    }

    @Override // com.appsflyer.internal.AFe1zSDK
    /* renamed from: AFLogger, reason: from getter */
    public final int getUnregisterClient() {
        return this.unregisterClient;
    }

    @Override // com.appsflyer.internal.AFe1zSDK
    public final /* synthetic */ String unregisterClient() {
        return name();
    }

    @NotNull
    public static pt.a<AFd1bSDK> registerClient() {
        return getInstance;
    }
}
