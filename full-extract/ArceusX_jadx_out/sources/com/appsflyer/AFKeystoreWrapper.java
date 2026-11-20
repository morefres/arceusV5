package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context AFKeystoreWrapper;
    public KeyStore registerClient;
    public final Object AFLogger = new Object();

    /* renamed from: d, reason: collision with root package name */
    public String f5234d = "";
    public int unregisterClient = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        AFLogger.INSTANCE.i(LogTag.SECURITY, "Initializing KeyStore");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.registerClient = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.INSTANCE.e(LogTag.SECURITY, "Couldn't load keystore instance of type: AndroidKeyStore", e10);
        }
    }

    public final void AFKeystoreWrapper(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.SECURITY;
        aFLogger.i(logTag, "Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Locale locale = Locale.US;
            Calendar calendar = Calendar.getInstance(locale);
            Calendar calendar2 = Calendar.getInstance(locale);
            calendar2.add(1, 5);
            synchronized (this.AFLogger) {
                try {
                    if (this.registerClient.containsAlias(str)) {
                        aFLogger.i(logTag, "Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(build);
                        keyPairGenerator.generateKeyPair();
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.SECURITY;
            StringBuilder sb2 = new StringBuilder("Exception occurred while creating key: ");
            sb2.append(th2.getMessage() != null ? th2.getMessage() : "unknown error");
            aFLogger2.e(logTag2, sb2.toString(), th2);
        }
    }

    public final String AFLogger() {
        String str;
        synchronized (this.AFLogger) {
            str = this.f5234d;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0022, code lost:
    
        r1 = r3.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r1.length != 3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        com.appsflyer.AFLogger.INSTANCE.i(com.appsflyer.sdk_base.logger.LogTag.SECURITY, "Found a matching AF key with alias:\n".concat(r3));
        r2 = true;
        r3 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r3.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r1.length != 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r7.f5234d = r3[1].trim();
        r7.unregisterClient = java.lang.Integer.parseInt(r1[1].trim());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.AFLogger
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.registerClient     // Catch: java.lang.Throwable -> L8d
            r2 = 0
            if (r1 == 0) goto L8f
            java.util.Enumeration r1 = r1.aliases()     // Catch: java.lang.Throwable -> L6e
        Lc:
            boolean r3 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r1.nextElement()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto Lc
            java.lang.String r4 = "com.appsflyer"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto Lc
            java.lang.String r1 = ","
            java.lang.String[] r1 = r3.split(r1)     // Catch: java.lang.Throwable -> L6e
            int r4 = r1.length     // Catch: java.lang.Throwable -> L6e
            r5 = 3
            if (r4 != r5) goto L8f
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L6e
            com.appsflyer.sdk_base.logger.LogTag r5 = com.appsflyer.sdk_base.logger.LogTag.SECURITY     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = "Found a matching AF key with alias:\n"
            java.lang.String r3 = r6.concat(r3)     // Catch: java.lang.Throwable -> L6e
            r4.i(r5, r3)     // Catch: java.lang.Throwable -> L6e
            r2 = 1
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L6e
            r4 = 2
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L6e
            int r5 = r3.length     // Catch: java.lang.Throwable -> L6e
            if (r5 != r4) goto L8f
            int r5 = r1.length     // Catch: java.lang.Throwable -> L6e
            if (r5 != r4) goto L8f
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L6e
            r7.f5234d = r3     // Catch: java.lang.Throwable -> L6e
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L6e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L6e
            r7.unregisterClient = r1     // Catch: java.lang.Throwable -> L6e
            goto L8f
        L6e:
            r1 = move-exception
            com.appsflyer.AFLogger r3 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L8d
            com.appsflyer.sdk_base.logger.LogTag r4 = com.appsflyer.sdk_base.logger.LogTag.SECURITY     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = "Couldn't list KeyStore aliases: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Class r6 = r1.getClass()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L8d
            r5.append(r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            r3.e(r4, r5, r1)     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L8d:
            r1 = move-exception
            goto L91
        L8f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8d
            return r2
        L91:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.d():boolean");
    }

    public final int registerClient() {
        int i10;
        synchronized (this.AFLogger) {
            i10 = this.unregisterClient;
        }
        return i10;
    }

    public final String AFKeystoreWrapper() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appsflyer,");
        synchronized (this.AFLogger) {
            sb2.append("KSAppsFlyerId=");
            sb2.append(this.f5234d);
            sb2.append(",");
            sb2.append("KSAppsFlyerRICounter=");
            sb2.append(this.unregisterClient);
        }
        return sb2.toString();
    }
}
