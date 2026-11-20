package com.roblox.protocols.externalidentityplatforminterface.generated;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes2.dex */
public final class ExternalIdentityCapabilities {
    final boolean apple;
    final boolean google;

    public ExternalIdentityCapabilities(boolean z10, boolean z11) {
        this.google = z10;
        this.apple = z11;
    }

    public boolean getApple() {
        return this.apple;
    }

    public boolean getGoogle() {
        return this.google;
    }

    public String toString() {
        return "ExternalIdentityCapabilities{google=" + this.google + ",apple=" + this.apple + "}";
    }
}
