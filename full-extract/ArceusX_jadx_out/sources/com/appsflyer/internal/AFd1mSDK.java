package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1mSDK {
    private final int AFKeystoreWrapper;

    public AFd1mSDK(int i10) {
        this.AFKeystoreWrapper = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[SYNTHETIC] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String AFLogger(java.net.HttpURLConnection r11) {
        /*
            java.lang.String r1 = ""
            r2 = 0
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.lang.Throwable -> L8 java.lang.Exception -> Ld
            goto L2b
        L8:
            r0 = move-exception
            r11 = r0
            r0 = r2
            goto L6a
        Ld:
            r0 = move-exception
            r6 = r0
            java.io.InputStream r11 = r11.getErrorStream()     // Catch: java.lang.Throwable -> L8
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8
            com.appsflyer.sdk_base.logger.LogTag r4 = com.appsflyer.sdk_base.logger.LogTag.HTTP_CLIENT     // Catch: java.lang.Throwable -> L8
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto L23
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L8
            r5 = r0
            goto L24
        L23:
            r5 = r1
        L24:
            r9 = 0
            r10 = 0
            r7 = 0
            r8 = 0
            r3.e(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8
        L2b:
            if (r11 != 0) goto L2e
            return r1
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8
            r0.<init>()     // Catch: java.lang.Throwable -> L8
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Throwable -> L8
            r1.<init>(r11, r3)     // Catch: java.lang.Throwable -> L8
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L66
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r2 = 1
        L42:
            java.lang.String r3 = r11.readLine()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L5b
            if (r2 != 0) goto L56
            r2 = 10
            r0.append(r2)     // Catch: java.lang.Throwable -> L50
            goto L56
        L50:
            r0 = move-exception
            r2 = r0
            r0 = r11
            r11 = r2
        L54:
            r2 = r1
            goto L6a
        L56:
            r0.append(r3)     // Catch: java.lang.Throwable -> L50
            r2 = 0
            goto L42
        L5b:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L50
            r1.close()
            r11.close()
            return r0
        L66:
            r0 = move-exception
            r11 = r0
            r0 = r2
            goto L54
        L6a:
            if (r2 == 0) goto L6f
            r2.close()
        L6f:
            if (r0 == 0) goto L74
            r0.close()
        L74:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.AFLogger(java.net.HttpURLConnection):java.lang.String");
    }

    public final AFd1fSDK<String> registerClient(AFd1oSDK aFd1oSDK) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        BufferedOutputStream bufferedOutputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArr = aFd1oSDK.unregisterClient;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(aFd1oSDK.AFKeystoreWrapper);
            sb2.append(":");
            sb2.append(aFd1oSDK.f5319d);
            StringBuilder sb3 = new StringBuilder(sb2.toString());
            byte[] bArr2 = aFd1oSDK.unregisterClient;
            if (aFd1oSDK.f5320e && bArr2 != null) {
                try {
                    String str = aFd1oSDK.registerClient ? "<encrypted>" : new String(bArr2, Charset.defaultCharset());
                    sb3.append("\n payload: ");
                    sb3.append(str);
                } catch (Throwable th3) {
                    httpURLConnection = null;
                    th2 = th3;
                    try {
                        AFd1nSDK aFd1nSDK = new AFd1nSDK(System.currentTimeMillis() - currentTimeMillis);
                        StringBuilder sb4 = new StringBuilder("error: ");
                        sb4.append(th2);
                        sb4.append("\n took ");
                        sb4.append(aFd1nSDK.registerClient);
                        sb4.append("ms");
                        String obj = sb4.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.HTTP_CLIENT;
                        StringBuilder sb5 = new StringBuilder("[");
                        sb5.append(aFd1oSDK.hashCode());
                        sb5.append("] ");
                        sb5.append(obj);
                        aFLogger.e(logTag, sb5.toString(), th2, false, false, false);
                        throw new HttpException(th2, aFd1nSDK);
                    } catch (Throwable th4) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th4;
                    }
                }
            }
            for (Map.Entry<String, String> entry : aFd1oSDK.AFLogger.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
            StringBuilder sb6 = new StringBuilder("[");
            sb6.append(aFd1oSDK.hashCode());
            sb6.append("] ");
            sb6.append((Object) sb3);
            AFLogger.INSTANCE.d(LogTag.HTTP_CLIENT, sb6.toString());
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFd1oSDK.f5319d).openConnection();
            try {
                httpURLConnection2.setRequestMethod(aFd1oSDK.AFKeystoreWrapper);
                if (aFd1oSDK.force) {
                    httpURLConnection2.setUseCaches(false);
                }
                if (!aFd1oSDK.f5323w) {
                    httpURLConnection2.setInstanceFollowRedirects(false);
                }
            } catch (Throwable th5) {
                th = th5;
            }
            try {
                int i10 = this.AFKeystoreWrapper;
                int i11 = aFd1oSDK.f5322v;
                if (i11 != -1) {
                    i10 = i11;
                }
                httpURLConnection2.setConnectTimeout(i10);
                httpURLConnection2.setReadTimeout(i10);
                httpURLConnection2.addRequestProperty("Content-Type", aFd1oSDK.registerClient ? "application/octet-stream" : "application/json");
                for (Map.Entry<String, String> entry2 : aFd1oSDK.AFLogger.entrySet()) {
                    httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                }
                if (bArr != null) {
                    httpURLConnection2.setDoOutput(true);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(bArr.length);
                    httpURLConnection2.setRequestProperty("Content-Length", sb7.toString());
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream2.write(bArr);
                            bufferedOutputStream2.close();
                        } catch (Throwable th6) {
                            th = th6;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedOutputStream = null;
                    }
                }
                boolean z10 = httpURLConnection2.getResponseCode() / 100 == 2;
                String AFLogger = aFd1oSDK.f5321i ? AFLogger(httpURLConnection2) : "";
                AFd1nSDK aFd1nSDK2 = new AFd1nSDK(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb8 = new StringBuilder("response code:");
                sb8.append(httpURLConnection2.getResponseCode());
                sb8.append(" ");
                sb8.append(httpURLConnection2.getResponseMessage());
                sb8.append("\n body:");
                sb8.append(AFLogger);
                sb8.append("\n took ");
                sb8.append(aFd1nSDK2.registerClient);
                sb8.append("ms");
                String obj2 = sb8.toString();
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.HTTP_CLIENT;
                StringBuilder sb9 = new StringBuilder("[");
                sb9.append(aFd1oSDK.hashCode());
                sb9.append("] ");
                sb9.append(obj2);
                aFLogger2.d(logTag2, sb9.toString());
                HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                hashMap.remove(null);
                AFd1fSDK<String> aFd1fSDK = new AFd1fSDK<>(AFLogger, httpURLConnection2.getResponseCode(), z10, hashMap, aFd1nSDK2);
                httpURLConnection2.disconnect();
                return aFd1fSDK;
            } catch (Throwable th8) {
                th = th8;
                th2 = th;
                httpURLConnection = httpURLConnection2;
                AFd1nSDK aFd1nSDK3 = new AFd1nSDK(System.currentTimeMillis() - currentTimeMillis);
                StringBuilder sb42 = new StringBuilder("error: ");
                sb42.append(th2);
                sb42.append("\n took ");
                sb42.append(aFd1nSDK3.registerClient);
                sb42.append("ms");
                String obj3 = sb42.toString();
                AFLogger aFLogger3 = AFLogger.INSTANCE;
                LogTag logTag3 = LogTag.HTTP_CLIENT;
                StringBuilder sb52 = new StringBuilder("[");
                sb52.append(aFd1oSDK.hashCode());
                sb52.append("] ");
                sb52.append(obj3);
                aFLogger3.e(logTag3, sb52.toString(), th2, false, false, false);
                throw new HttpException(th2, aFd1nSDK3);
            }
        } catch (Throwable th9) {
            th2 = th9;
            httpURLConnection = null;
        }
    }
}
