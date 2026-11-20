package com.appsflyer.internal;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.mlkit.common.MlKitException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFf1ySDK {
    private static final long AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    private static final int f5404d;

    @NotNull
    private static final IntRange unregisterClient;

    static {
        a.Companion companion = kotlin.time.a.INSTANCE;
        iu.b bVar = iu.b.f21121e;
        AFKeystoreWrapper = kotlin.time.a.w(kotlin.time.b.p(60, bVar));
        f5404d = (int) kotlin.time.a.w(kotlin.time.b.p(2, bVar));
        unregisterClient = new IntRange(MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE, 305);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Object> x_(Uri uri) {
        String headerField;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        AFLoggerBase.d$default(aFLogger, logTag, "ESP deeplink resolving is started: " + uri, false, 4, null);
        HttpURLConnection httpURLConnection = null;
        try {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            Intrinsics.d(openConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection;
            httpURLConnection2.setInstanceFollowRedirects(false);
            int i10 = f5404d;
            httpURLConnection2.setReadTimeout(i10);
            httpURLConnection2.setConnectTimeout(i10);
            httpURLConnection2.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
            httpURLConnection2.setRequestProperty("af-esp", "7.0.1");
            try {
                int responseCode = httpURLConnection2.getResponseCode();
                linkedHashMap.put(NotificationCompat.CATEGORY_STATUS, Integer.valueOf(responseCode));
                IntRange intRange = unregisterClient;
                int first = intRange.getFirst();
                if (responseCode <= intRange.getLast() && first <= responseCode && (headerField = httpURLConnection2.getHeaderField("Location")) != null) {
                    linkedHashMap.put("res", headerField);
                }
                AFLoggerBase.d$default(aFLogger, logTag, "ESP deeplink resolving is finished", false, 4, null);
                httpURLConnection2.disconnect();
                return linkedHashMap;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                Throwable th3 = th;
                try {
                    String localizedMessage = th3.getLocalizedMessage();
                    if (localizedMessage != null) {
                        linkedHashMap.put("error", localizedMessage);
                    }
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    LogTag logTag2 = LogTag.DDL;
                    String message = th3.getMessage();
                    if (message == null) {
                        message = "Error resolving ESP deeplink";
                    }
                    AFLoggerBase.e$default(aFLogger2, logTag2, message, th3, false, false, false, false, 120, null);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return linkedHashMap;
                } finally {
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
