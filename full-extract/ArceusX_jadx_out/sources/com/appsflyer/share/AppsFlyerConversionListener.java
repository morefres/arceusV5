package com.appsflyer.share;

import java.util.Map;

/* loaded from: classes.dex */
public interface AppsFlyerConversionListener {
    void onConversionDataFail(String str);

    void onConversionDataSuccess(Map<String, Object> map);
}
