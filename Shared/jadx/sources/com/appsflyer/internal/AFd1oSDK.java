package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AFd1oSDK {

    @NonNull
    final String AFKeystoreWrapper;

    @NonNull
    public final Map<String, String> AFLogger;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final String f5319d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f5320e;
    public boolean force;

    /* renamed from: i, reason: collision with root package name */
    boolean f5321i;
    final boolean registerClient;
    public final byte[] unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    public int f5322v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5323w;

    public AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10) {
        this(str, bArr, str2, map, z10, (byte) 0);
    }

    private AFd1oSDK(@NonNull String str, byte[] bArr, @NonNull String str2, @NonNull Map<String, String> map, boolean z10, byte b) {
        this.f5321i = true;
        this.force = false;
        this.f5323w = true;
        this.f5322v = -1;
        this.f5319d = str;
        this.unregisterClient = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = map;
        this.registerClient = z10;
        this.f5320e = true;
    }

    public AFd1oSDK(@NonNull String str, @NonNull String str2) {
        this(str, null, str2, new HashMap(), false);
    }
}
