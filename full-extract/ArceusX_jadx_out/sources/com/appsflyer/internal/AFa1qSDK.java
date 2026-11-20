package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.deeplink.DeepLink;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1qSDK {
    public String AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, String> f5262d;
    public String[] force;
    public DeepLinkListener unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private final AFc1bSDK f5263v;

    @NonNull
    public List<List<String>> registerClient = new ArrayList();
    public long AFKeystoreWrapper = 3000;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final List<String> f5264w = new ArrayList();

    public AFa1qSDK(@NonNull AFc1bSDK aFc1bSDK) {
        this.f5263v = aFc1bSDK;
    }

    private Uri d_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e10) {
                AFLogger.INSTANCE.e(LogTag.DDL, "Failed to parse deeplink from recursive JSON search", e10, false, false);
                return null;
            }
        }
        return null;
    }

    private static String registerClient(String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        int indexOf = str.indexOf(63);
        String substring = indexOf == -1 ? "" : str.substring(indexOf);
        if (substring.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (substring.contains("&")) {
            arrayList = new ArrayList(Arrays.asList(substring.split("&")));
        } else {
            arrayList.add(substring);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.contains("access_token")) {
                it.remove();
            } else {
                if (sb2.length() != 0) {
                    sb2.append("&");
                } else if (!str2.startsWith("?")) {
                    sb2.append("?");
                }
                sb2.append(str2);
            }
        }
        return str.replace(substring, sb2.toString());
    }

    public final void AFLogger(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.unregisterClient != null) {
            try {
                try {
                    deepLinkResult = new DeepLinkResult(DeepLink.parseFromOaoa(map).setDeferred(false), null);
                } catch (JSONException e10) {
                    AFLogger.INSTANCE.e(LogTag.DDL, "Error occurred", e10, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                d(deepLinkResult);
            } catch (Throwable th2) {
                d(new DeepLinkResult(null, null));
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:0: B:32:0x005d->B:44:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b_(com.appsflyer.internal.AFa1kSDK r10, android.content.Intent r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1qSDK.b_(com.appsflyer.internal.AFa1kSDK, android.content.Intent, android.content.Context):void");
    }

    public final void c_(AFa1kSDK aFa1kSDK, Uri uri) {
        if (this.f5263v.valueOf().f5343d != null) {
            if (this.f5264w.isEmpty()) {
                f_(aFa1kSDK, uri, null);
            } else {
                this.f5263v.afWarnLog().d(new AFf1zSDK(this, aFa1kSDK, uri, this.f5264w));
            }
        }
    }

    public final void d(String str, DeepLinkResult.Error error) {
        if (this.unregisterClient != null) {
            AFLogger.INSTANCE.d(LogTag.DDL, "Error occurred: ".concat(String.valueOf(str)));
            d(new DeepLinkResult(null, error));
        }
    }

    public final boolean e_(Intent intent) {
        if (intent == null) {
            return false;
        }
        return ("android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) || !this.registerClient.isEmpty();
    }

    public final void f_(AFa1kSDK aFa1kSDK, Uri uri, Uri uri2) {
        Intrinsics.checkNotNullParameter("af_deeplink", "");
        if (!aFa1kSDK.rl.d.a java.lang.String.containsKey("af_deeplink")) {
            String registerClient = registerClient(uri.toString());
            String str = this.AFLogger;
            if (str != null && this.f5262d != null && registerClient.contains(str)) {
                Uri.Builder buildUpon = Uri.parse(registerClient).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.f5262d.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                registerClient = buildUpon.build().toString();
                String encodedQuery = buildUpon2.build().getEncodedQuery();
                Intrinsics.checkNotNullParameter("appended_query_params", "");
                aFa1kSDK.rl.d.a java.lang.String.put("appended_query_params", encodedQuery);
                AFa1lSDK aFa1lSDK = aFa1kSDK.AFKeystoreWrapper;
                if (aFa1lSDK != null) {
                    aFa1lSDK.d(aFa1kSDK.rl.d.a java.lang.String);
                }
            }
            Intrinsics.checkNotNullParameter("af_deeplink", "");
            aFa1kSDK.rl.d.a java.lang.String.put("af_deeplink", registerClient);
            AFa1lSDK aFa1lSDK2 = aFa1kSDK.AFKeystoreWrapper;
            if (aFa1lSDK2 != null) {
                aFa1lSDK2.d(aFa1kSDK.rl.d.a java.lang.String);
            }
        }
        AFLogger();
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFj1qSDK.W_(this.f5263v.AFLogger().r_(), hashMap, uri);
        AFe1aSDK aFe1aSDK = new AFe1aSDK(this.f5263v, UUID.randomUUID(), uri);
        if (aFe1aSDK.f5344v) {
            Boolean bool = Boolean.TRUE;
            Intrinsics.checkNotNullParameter("isBrandedDomain", "");
            aFa1kSDK.rl.d.a java.lang.String.put("isBrandedDomain", bool);
            AFa1lSDK aFa1lSDK3 = aFa1kSDK.AFKeystoreWrapper;
            if (aFa1lSDK3 != null) {
                aFa1lSDK3.d(aFa1kSDK.rl.d.a java.lang.String);
            }
        }
        if (!aFe1aSDK.values()) {
            AFLogger(hashMap);
        } else {
            aFe1aSDK.force = new AFe1aSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1qSDK.5
                @Override // com.appsflyer.internal.AFe1aSDK.AFa1ySDK
                public final void d(String str2) {
                    AFa1qSDK.this.d(str2, DeepLinkResult.Error.NETWORK);
                }

                @Override // com.appsflyer.internal.AFe1aSDK.AFa1ySDK
                public final void unregisterClient(Map<String, String> map) {
                    for (String str2 : map.keySet()) {
                        hashMap.put(str2, map.get(str2));
                    }
                    AFa1qSDK.this.AFLogger(hashMap);
                }
            };
            this.f5263v.afWarnLog().d(aFe1aSDK);
        }
    }

    public final void d(DeepLinkResult deepLinkResult) {
        if (this.unregisterClient != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DDL;
            StringBuilder sb2 = new StringBuilder("Calling onDeepLinking with:\n");
            sb2.append(deepLinkResult.toString());
            aFLogger.d(logTag, sb2.toString());
            try {
                this.unregisterClient.onDeepLinking(deepLinkResult);
                return;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(LogTag.DDL, th2.getLocalizedMessage() != null ? th2.getLocalizedMessage() : "Error in onDeepLinking callback execution", th2);
                return;
            }
        }
        AFLogger.INSTANCE.d(LogTag.DDL, "skipping, no callback registered");
    }

    private void AFLogger() {
        try {
            this.f5263v.setAppInviteOneLink().d();
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DDL;
            StringBuilder sb2 = new StringBuilder("Could not notify deeplink extraction finished: ");
            sb2.append(th2.getMessage());
            aFLogger.d(logTag, sb2.toString());
        }
    }
}
