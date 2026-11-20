package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class AFb1uSDK {
    public static Uri g_(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1sSDK aFj1sSDK = new AFj1sSDK(intent);
        Uri uri = (Uri) aFj1sSDK.S_("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String registerClient = aFj1sSDK.registerClient("android.intent.extra.REFERRER_NAME");
        if (registerClient != null) {
            return Uri.parse(registerClient);
        }
        return null;
    }
}
