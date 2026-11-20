package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFa1lSDK {
    void d(@NotNull Map<String, ? extends Object> map);

    void registerClient();

    @NotNull
    Map<String, Object> unregisterClient();
}
