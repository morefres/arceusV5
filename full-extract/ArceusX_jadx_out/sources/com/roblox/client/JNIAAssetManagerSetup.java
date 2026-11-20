package com.roblox.client;

import android.content.Context;
import android.content.res.AssetManager;
import ek.q;

/* loaded from: classes2.dex */
public class JNIAAssetManagerSetup {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8940a = "JNIAAssetManagerSetup";

    public static void a(Context context) {
        q.b(f8940a, "Initialize Android AssetReader");
        initNative(context.getAssets());
    }

    private static native void initNative(AssetManager assetManager);
}
