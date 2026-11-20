package com.appsflyer.internal;

/* loaded from: classes.dex */
public final class AFh1fSDK extends AFh1pSDK {
    @Override // com.appsflyer.internal.AFh1pSDK
    public final AFe1zSDK AFKeystoreWrapper() {
        return this.afWarnLog == 1 ? AFd1bSDK.registerClient : AFd1bSDK.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean AFLogger() {
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean registerClient() {
        return true;
    }
}
