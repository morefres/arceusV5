package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFe1gSDK extends AFe1rSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1gSDK(@NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.values, new AFe1zSDK[]{AFd1bSDK.f5306d, AFd1bSDK.AFKeystoreWrapper}, aFc1bSDK, map, purchaseValidationCallback);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFd1bSDK aFd1bSDK = AFd1bSDK.registerClient;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @Nullable
    public final AFd1pSDK<String> d(@NotNull Map<String, Object> map, @NotNull String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return getRl.d.a java.lang.String().unregisterClient(map, str);
    }
}
