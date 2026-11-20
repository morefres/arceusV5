package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFi1qSDK implements AFi1tSDK {
    @Override // com.appsflyer.internal.AFi1tSDK
    @Nullable
    public final String AFLogger(@Nullable Activity activity) {
        Uri g_ = AFb1uSDK.g_(activity != null ? activity.getIntent() : null);
        String obj = g_ != null ? g_.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (kotlin.text.x.T(obj, "android-app://", false, 2, null)) {
            return null;
        }
        return obj;
    }

    @Override // com.appsflyer.internal.AFi1tSDK
    @NotNull
    public final String registerClient(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String obj = referrer != null ? referrer.toString() : null;
        return obj == null ? "" : obj;
    }
}
