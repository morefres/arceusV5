package com.appsflyer.internal;

import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFe1pSDK extends AFe1kSDK<String> {

    @Nullable
    private final String AFLoggerLogLevel;

    @NotNull
    private final LinkGenerator afDebugLog;

    @Nullable
    private final LinkGenerator.ResponseListener afErrorLog;

    @NotNull
    private final Map<String, String> afInfoLog;

    @NotNull
    private final UUID force;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final String f5359v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1pSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull UUID uuid, @NotNull String str, @NotNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener, @NotNull LinkGenerator linkGenerator) {
        super(AFd1bSDK.f5308i, new AFe1zSDK[]{AFd1bSDK.f5306d}, aFc1bSDK, uuid.toString());
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(linkGenerator, "");
        this.force = uuid;
        this.f5359v = str;
        this.AFLoggerLogLevel = str2;
        this.afErrorLog = responseListener;
        this.afDebugLog = linkGenerator;
        this.afInfoLog = kotlin.collections.k0.v(map);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<String> AFLogger(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFd1pSDK<String> unregisterClient = getRl.d.a java.lang.String().unregisterClient(this.f5359v, this.afInfoLog, this.AFLoggerLogLevel, this.force, str);
        Intrinsics.checkNotNullExpressionValue(unregisterClient, "");
        return unregisterClient;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final long d() {
        long j10;
        j10 = AFe1oSDK.AFKeystoreWrapper;
        return j10;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        LinkGenerator.ResponseListener responseListener = this.afErrorLog;
        if (responseListener != null) {
            ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
            if (this.e != AFd1cSDK.f5311d || responseNetwork == null) {
                responseListener.onResponseError(this.afDebugLog.generateLink());
            } else {
                responseListener.onResponse((String) responseNetwork.getBody());
            }
        }
    }
}
