package com.appsflyer.internal;

import com.appsflyer.sdk_base.exception_manager.ExceptionManagerConfiguration;
import gt.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFh1gSDK {

    @Nullable
    public AFi1zSDK AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ExceptionManagerConfiguration f5432d;

    @Nullable
    public AFh1cSDK unregisterClient;

    public AFh1gSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.unregisterClient = d(jSONObject);
        this.f5432d = unregisterClient(jSONObject);
        this.AFKeystoreWrapper = registerClient(jSONObject);
    }

    private static AFh1cSDK d(JSONObject jSONObject) {
        Object b;
        AFh1cSDK aFh1cSDK;
        List k10;
        try {
            n.Companion companion = gt.n.INSTANCE;
            JSONObject unregisterClient = unregisterClient(jSONObject, "r_debugger");
            if (unregisterClient != null) {
                long j10 = unregisterClient.getLong("ttl");
                int i10 = unregisterClient.getInt("counter");
                String optString = unregisterClient.optString("app_ver", "");
                String optString2 = unregisterClient.optString("sdk_ver", "");
                float optDouble = (float) unregisterClient.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = unregisterClient.optJSONArray("tags");
                if (optJSONArray != null) {
                    k10 = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String string = optJSONArray.getString(i11);
                        Intrinsics.checkNotNull(string);
                        k10.add(string);
                    }
                } else {
                    k10 = kotlin.collections.p.k();
                }
                List list = k10;
                Intrinsics.checkNotNull(optString);
                Intrinsics.checkNotNull(optString2);
                aFh1cSDK = new AFh1cSDK(j10, optDouble, list, i10, optString, optString2);
            } else {
                aFh1cSDK = null;
            }
            b = gt.n.b(aFh1cSDK);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        return (AFh1cSDK) (gt.n.g(b) ? null : b);
    }

    private static AFi1zSDK registerClient(JSONObject jSONObject) {
        Object b;
        try {
            n.Companion companion = gt.n.INSTANCE;
            JSONObject unregisterClient = unregisterClient(jSONObject, "meta_data");
            b = gt.n.b(unregisterClient != null ? new AFi1zSDK(unregisterClient.optDouble("send_rate", 1.0d)) : null);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        return (AFi1zSDK) (gt.n.g(b) ? null : b);
    }

    private static ExceptionManagerConfiguration unregisterClient(JSONObject jSONObject) {
        Object b;
        ExceptionManagerConfiguration exceptionManagerConfiguration;
        try {
            n.Companion companion = gt.n.INSTANCE;
            JSONObject unregisterClient = unregisterClient(jSONObject, "exc_mngr");
            if (unregisterClient != null) {
                String string = unregisterClient.getString("sdk_ver");
                int optInt = unregisterClient.optInt("min", -1);
                int optInt2 = unregisterClient.optInt("expire", -1);
                long optLong = unregisterClient.optLong("ttl", -1L);
                Intrinsics.checkNotNull(string);
                exceptionManagerConfiguration = new ExceptionManagerConfiguration(string, optInt, optInt2, optLong);
            } else {
                exceptionManagerConfiguration = null;
            }
            b = gt.n.b(exceptionManagerConfiguration);
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b = gt.n.b(gt.o.a(th2));
        }
        return (ExceptionManagerConfiguration) (gt.n.g(b) ? null : b);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.c(AFh1gSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "");
        AFh1gSDK aFh1gSDK = (AFh1gSDK) obj;
        return Intrinsics.c(this.f5432d, aFh1gSDK.f5432d) && Intrinsics.c(this.AFKeystoreWrapper, aFh1gSDK.AFKeystoreWrapper) && Intrinsics.c(this.unregisterClient, aFh1gSDK.unregisterClient);
    }

    public final int hashCode() {
        ExceptionManagerConfiguration exceptionManagerConfiguration = this.f5432d;
        int hashCode = (exceptionManagerConfiguration != null ? exceptionManagerConfiguration.hashCode() : 0) * 31;
        AFi1zSDK aFi1zSDK = this.AFKeystoreWrapper;
        int hashCode2 = (hashCode + (aFi1zSDK != null ? aFi1zSDK.hashCode() : 0)) * 31;
        AFh1cSDK aFh1cSDK = this.unregisterClient;
        return hashCode2 + (aFh1cSDK != null ? aFh1cSDK.hashCode() : 0);
    }

    private static JSONObject unregisterClient(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
