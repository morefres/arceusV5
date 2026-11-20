package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFc1pSDK {
    final int AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    final String f5299d;

    @NotNull
    final List<AFe1zSDK> unregisterClient;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1pSDK(@NotNull String str, @NotNull List<? extends AFe1zSDK> list, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f5299d = str;
        this.unregisterClient = list;
        this.AFKeystoreWrapper = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1pSDK)) {
            return false;
        }
        AFc1pSDK aFc1pSDK = (AFc1pSDK) obj;
        return Intrinsics.c(this.f5299d, aFc1pSDK.f5299d) && Intrinsics.c(this.unregisterClient, aFc1pSDK.unregisterClient) && this.AFKeystoreWrapper == aFc1pSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return (((this.f5299d.hashCode() * 31) + this.unregisterClient.hashCode()) * 31) + Integer.hashCode(this.AFKeystoreWrapper);
    }

    @NotNull
    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.f5299d + ", eventTypes=" + this.unregisterClient + ", maxCapacity=" + this.AFKeystoreWrapper + ")";
    }
}
