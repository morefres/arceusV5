package com.roblox.protocols.appagesignalsplatforminterface.generated;

import androidx.annotation.Keep;
import java.util.HashMap;

@Keep
/* loaded from: classes2.dex */
public final class AppAgeSignalsPlatformSuccess {
    final HashMap<String, String> payload;
    final AppAgeSignalsProvider provider;

    public AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider appAgeSignalsProvider, HashMap<String, String> hashMap) {
        this.provider = appAgeSignalsProvider;
        this.payload = hashMap;
    }

    public HashMap<String, String> getPayload() {
        return this.payload;
    }

    public AppAgeSignalsProvider getProvider() {
        return this.provider;
    }

    public String toString() {
        return "AppAgeSignalsPlatformSuccess{provider=" + this.provider + ",payload=" + this.payload + "}";
    }
}
