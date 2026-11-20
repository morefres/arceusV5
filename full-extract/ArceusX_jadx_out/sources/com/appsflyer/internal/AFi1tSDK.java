package com.appsflyer.internal;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public interface AFi1tSDK {
    @Nullable
    String AFLogger(@Nullable Activity activity);

    @NotNull
    String registerClient(@Nullable Activity activity);
}
