package com.roblox.universalapp.linking;

import android.content.Context;

/* loaded from: classes2.dex */
public class JNIWebLoginProtocol {
    public static native void init(Context context);

    public static native boolean maybeHandleColdStartProtocolLaunch(String str);
}
