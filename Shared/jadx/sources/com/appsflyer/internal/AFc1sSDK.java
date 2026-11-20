package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1sSDK {
    String AFKeystoreWrapper;
    public AFe1zSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f5301d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f5302e;
    public String registerClient;
    public String unregisterClient;

    public AFc1sSDK(String str, byte[] bArr, String str2, AFe1zSDK aFe1zSDK, Map<String, String> map) {
        this.unregisterClient = str;
        this.f5301d = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = aFe1zSDK;
        this.f5302e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1sSDK.class == obj.getClass()) {
            AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
            if (Objects.equals(this.AFKeystoreWrapper, aFc1sSDK.AFKeystoreWrapper) && Arrays.equals(this.f5301d, aFc1sSDK.f5301d) && Objects.equals(this.unregisterClient, aFc1sSDK.unregisterClient) && Objects.equals(this.registerClient, aFc1sSDK.registerClient) && Objects.equals(this.f5302e, aFc1sSDK.f5302e) && this.AFLogger == aFc1sSDK.AFLogger) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.f5301d)) * 31;
        String str2 = this.unregisterClient;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.registerClient;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1zSDK aFe1zSDK = this.AFLogger;
        int hashCode4 = (hashCode3 + (aFe1zSDK != null ? aFe1zSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.f5302e;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public AFc1sSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                String nextLine = scanner.nextLine();
                if (nextLine.startsWith("url=")) {
                    this.unregisterClient = nextLine.substring(4).trim();
                } else if (nextLine.startsWith("version=")) {
                    this.AFKeystoreWrapper = nextLine.substring(8).trim();
                } else if (nextLine.startsWith("headers=")) {
                    try {
                        this.f5302e = JsonUtils.toStringMap(new JSONObject(new String(Base64.decode(nextLine.substring(8).trim(), 2), Charset.defaultCharset())));
                    } catch (Exception e10) {
                        AFLogger.INSTANCE.e(LogTag.CACHE, "Error parsing headers", e10);
                        this.f5302e = new HashMap();
                    }
                } else if (nextLine.startsWith("data=")) {
                    this.f5301d = Base64.decode(nextLine.substring(5).trim(), 2);
                } else if (nextLine.startsWith("type=")) {
                    String trim = nextLine.substring(5).trim();
                    AFd1bSDK registerClient = AFd1bSDK.registerClient(trim);
                    if (registerClient != null) {
                        this.AFLogger = registerClient;
                    } else {
                        AFLogger.INSTANCE.d(LogTag.CACHE, "Unknown task type: ".concat(String.valueOf(trim)));
                    }
                }
            } catch (Throwable th2) {
                try {
                    scanner.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        scanner.close();
    }
}
