package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFc1aSDK;
import com.appsflyer.internal.AFe1pSDK;
import com.appsflyer.internal.AFj1fSDK;
import com.appsflyer.internal.AFj1lSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class LinkGenerator {
    String AFKeystoreWrapper;
    private String AFLogger;
    private final Map<String, String> afDebugLog = new HashMap();
    private String afErrorLog;
    private String afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private final String f5574d;

    /* renamed from: e, reason: collision with root package name */
    private String f5575e;
    private String force;

    /* renamed from: i, reason: collision with root package name */
    private String f5576i;
    private String registerClient;
    String unregisterClient;

    /* renamed from: v, reason: collision with root package name */
    private String f5577v;

    /* renamed from: w, reason: collision with root package name */
    private String f5578w;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public LinkGenerator(String str) {
        this.f5574d = str;
    }

    private Map<String, String> AFLogger() {
        HashMap hashMap = new HashMap();
        hashMap.put("pid", this.f5574d);
        String str = this.force;
        if (str != null) {
            hashMap.put("af_referrer_uid", str);
        }
        String str2 = this.registerClient;
        if (str2 != null) {
            hashMap.put(AFInAppEventParameterName.AF_CHANNEL, str2);
        }
        String str3 = this.f5577v;
        if (str3 != null) {
            hashMap.put("af_referrer_customer_id", str3);
        }
        String str4 = this.AFLogger;
        if (str4 != null) {
            hashMap.put("c", str4);
        }
        String str5 = this.f5578w;
        if (str5 != null) {
            hashMap.put("af_referrer_name", str5);
        }
        String str6 = this.f5576i;
        if (str6 != null) {
            hashMap.put("af_referrer_image_url", str6);
        }
        if (this.afErrorLog != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.afErrorLog);
            String str7 = this.f5575e;
            if (str7 != null) {
                this.f5575e = str7.replaceFirst("^[/]", "");
                sb2.append(this.afErrorLog.endsWith("/") ? "" : "/");
                sb2.append(this.f5575e);
            }
            hashMap.put("af_dp", sb2.toString());
        }
        for (Map.Entry<String, String> entry : this.afDebugLog.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return AFj1lSDK.AFKeystoreWrapper(hashMap);
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.afDebugLog.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.afDebugLog.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.AFKeystoreWrapper;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(Locale.US, AFj1fSDK.f5476d, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName()));
        } else {
            sb2.append(this.AFKeystoreWrapper);
        }
        if (this.unregisterClient != null) {
            sb2.append('/');
            sb2.append(this.unregisterClient);
        }
        Map<String, String> AFLogger = AFLogger();
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry<String, String> entry : AFLogger.entrySet()) {
            if (sb3.length() == 0) {
                sb3.append('?');
            } else {
                sb3.append('&');
            }
            sb3.append(entry.getKey());
            sb3.append('=');
            sb3.append(entry.getValue());
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public String getBrandDomain() {
        return this.afInfoLog;
    }

    public String getCampaign() {
        return this.AFLogger;
    }

    public String getChannel() {
        return this.registerClient;
    }

    public String getMediaSource() {
        return this.f5574d;
    }

    public Map<String, String> getUserParams() {
        return new HashMap(this.afDebugLog);
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.afErrorLog = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            Locale locale = Locale.US;
            this.AFKeystoreWrapper = String.format(locale, "https://%s/%s", String.format(locale, "%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName()), str3);
            return this;
        }
        if (str2 == null || str2.length() < 5) {
            str2 = "go.onelink.me";
        }
        this.AFKeystoreWrapper = String.format(Locale.US, "https://%s/%s", str2, str);
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.afInfoLog = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.AFLogger = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.registerClient = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.f5575e = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.f5577v = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.f5576i = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.f5578w = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.force = str;
        return this;
    }

    public void generateLink(Context context, ResponseListener responseListener) {
        String str = AFa1tSDK.d().AFKeystoreWrapper.setAndroidIdData().AppsFlyerLib;
        if (str == null) {
            AFLogger.INSTANCE.w(LogTag.PUBLIC_API, "generateLink: OneLink ID not set. Call setAppInviteOneLink(...) first. Falling back to long link.");
            if (responseListener != null) {
                responseListener.onResponseError(generateLink());
                return;
            }
            return;
        }
        String str2 = this.afInfoLog;
        Map<String, String> AFLogger = AFLogger();
        AFc1aSDK aFc1aSDK = AFa1tSDK.d().AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5278d.f5343d = context.getApplicationContext();
        }
        AFc1aSDK aFc1aSDK2 = AFa1tSDK.d().AFKeystoreWrapper;
        aFc1aSDK2.afWarnLog().d(new AFe1pSDK(aFc1aSDK2, UUID.randomUUID(), str, AFLogger, str2, responseListener, this));
    }
}
