package com.roblox.protocols.designfoundationsplatforminterface.generated;

import androidx.annotation.Keep;
import java.util.HashMap;

@Keep
/* loaded from: classes2.dex */
public final class DesignTokens {
    final HashMap<String, ColorTokenVariants> colorTokens;

    public DesignTokens(HashMap<String, ColorTokenVariants> hashMap) {
        this.colorTokens = hashMap;
    }

    public HashMap<String, ColorTokenVariants> getColorTokens() {
        return this.colorTokens;
    }

    public String toString() {
        return "DesignTokens{colorTokens=" + this.colorTokens + "}";
    }
}
