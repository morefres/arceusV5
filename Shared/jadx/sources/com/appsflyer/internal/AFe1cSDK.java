package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFe1cSDK {

    @NotNull
    private final AFd1uSDK registerClient;

    public AFe1cSDK(@NotNull AFd1uSDK aFd1uSDK) {
        Intrinsics.checkNotNullParameter(aFd1uSDK, "");
        this.registerClient = aFd1uSDK;
    }

    private static String AFLogger(String str) {
        Regex regex;
        if (str == null) {
            throw new NullPointerException("JSON toString of eventParams map returns null");
        }
        regex = AFe1bSDK.AFKeystoreWrapper;
        return regex.replace(str, "*Non-printing character*");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void registerClient(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.Nullable com.appsflyer.internal.AFd1pSDK<java.lang.String> r21, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> r22) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1cSDK.registerClient(java.lang.String, com.appsflyer.internal.AFd1pSDK, java.util.Map):void");
    }
}
