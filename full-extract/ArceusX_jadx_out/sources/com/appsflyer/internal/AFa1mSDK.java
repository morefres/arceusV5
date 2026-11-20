package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rj\u0002\b\u000fj\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/appsflyer/internal/AFa1mSDK;", "", "", "p0", "Lkotlin/Function1;", "", "", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "registerClient", "Ljava/lang/String;", "AFLogger", "Lkotlin/jvm/functions/Function1;", "unregisterClient", rl.d.f30696a, "AFKeystoreWrapper", "w", "e", "v"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1mSDK {
    private static final /* synthetic */ AFa1mSDK[] force;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ pt.a f5257i;

    /* renamed from: v, reason: collision with root package name */
    private static AFa1mSDK f5258v;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public Function1<Object, Unit> unregisterClient;

    @NotNull
    final String registerClient;

    /* renamed from: d, reason: collision with root package name */
    private static AFa1mSDK f5255d = new AFa1mSDK("DebugLog", 0, "debug_mode", new Function1() { // from class: com.appsflyer.internal.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit registerClient;
            registerClient = AFa1mSDK.registerClient(obj);
            return registerClient;
        }
    });
    private static AFa1mSDK unregisterClient = new AFa1mSDK("DisableAdvertisingIdentifiers", 1, "disable_advertising_identifiers", new Function1() { // from class: com.appsflyer.internal.b
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit d10;
            d10 = AFa1mSDK.d(obj);
            return d10;
        }
    });
    private static AFa1mSDK AFKeystoreWrapper = new AFa1mSDK("MinTimeBetweenSessions", 2, "min_time_between_sessions", new Function1() { // from class: com.appsflyer.internal.c
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit AFKeystoreWrapper2;
            AFKeystoreWrapper2 = AFa1mSDK.AFKeystoreWrapper(obj);
            return AFKeystoreWrapper2;
        }
    });

    /* renamed from: w, reason: collision with root package name */
    private static AFa1mSDK f5259w = new AFa1mSDK("CurrencyCode", 3, "currency_code", new Function1() { // from class: com.appsflyer.internal.d
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit AFLogger;
            AFLogger = AFa1mSDK.AFLogger(obj);
            return AFLogger;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    private static AFa1mSDK f5256e = new AFa1mSDK("Host", 4, "host", new Function1() { // from class: com.appsflyer.internal.e
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit unregisterClient2;
            unregisterClient2 = AFa1mSDK.unregisterClient(obj);
            return unregisterClient2;
        }
    });

    static {
        AFa1mSDK aFa1mSDK = new AFa1mSDK("DdlTimeout", 5, "ddlTimeout", new Function1() { // from class: com.appsflyer.internal.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit i10;
                i10 = AFa1mSDK.i(obj);
                return i10;
            }
        });
        f5258v = aFa1mSDK;
        AFa1mSDK[] aFa1mSDKArr = {f5255d, unregisterClient, AFKeystoreWrapper, f5259w, f5256e, aFa1mSDK};
        force = aFa1mSDKArr;
        f5257i = pt.b.a(aFa1mSDKArr);
    }

    private AFa1mSDK(String str, int i10, String str2, Function1 function1) {
        this.registerClient = str2;
        this.unregisterClient = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFKeystoreWrapper(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.d().setMinTimeBetweenSessions(((Integer) obj).intValue());
        return Unit.f22894a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFLogger(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.d().setCurrencyCode(obj.toString());
        return Unit.f22894a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.d().setDisableAdvertisingIdentifiers(((Boolean) obj).booleanValue());
        return Unit.f22894a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AppsFlyerLib.getInstance().setDeepLinkTimeout(((Integer) obj).intValue());
        return Unit.f22894a;
    }

    @NotNull
    public static pt.a<AFa1mSDK> registerClient() {
        return f5257i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unregisterClient(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("host");
        Object obj3 = hashMap.get("prefix");
        if (obj2 == null) {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Unsupported/Missing values - host value is mandatory for setHost method", false, 4, null);
        } else if (obj3 == null) {
            AFa1tSDK.d().setHost(null, obj2.toString());
        } else {
            AFa1tSDK.d().setHost(obj3.toString(), obj2.toString());
        }
        return Unit.f22894a;
    }

    public static AFa1mSDK valueOf(String str) {
        return (AFa1mSDK) Enum.valueOf(AFa1mSDK.class, str);
    }

    public static AFa1mSDK[] values() {
        return (AFa1mSDK[]) force.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        AFa1tSDK.d().setDebugLog(((Boolean) obj).booleanValue());
        return Unit.f22894a;
    }
}
