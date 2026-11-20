package com.appsflyer.internal;

import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFd1wSDK implements AFd1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFLoggerLogLevel = null;
    private static int afInfoLog = 1;
    private static int afWarnLog;

    /* renamed from: d, reason: collision with root package name */
    private static final int f5337d;
    private int AFKeystoreWrapper;

    /* renamed from: e, reason: collision with root package name */
    private final AFc1bSDK f5338e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5339i;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5340v;

    /* renamed from: w, reason: collision with root package name */
    private AppsFlyerProperties f5341w;
    private List<String> AFLogger = new ArrayList();
    private boolean unregisterClient = true;

    @NonNull
    private final Map<String, Object> registerClient = new HashMap();
    private SecureRandom force = new SecureRandom();

    static {
        force();
        f5337d = 98166;
        int i10 = afWarnLog + 43;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public AFd1wSDK(AFc1bSDK aFc1bSDK) {
        this.f5341w = aFc1bSDK.registerClient();
        String AFLogger = aFc1bSDK.AFLogger().AFLogger("AF_DISABLE_REMOTE_DEBUGGER");
        this.f5340v = true ^ (AFLogger != null ? Boolean.parseBoolean(AFLogger) : false);
        this.AFKeystoreWrapper = 0;
        this.f5339i = false;
        this.f5338e = aFc1bSDK;
    }

    @NonNull
    private synchronized Map<String, Object> AFLoggerLogLevel() {
        Map<String, Object> map;
        int i10 = afWarnLog + 101;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            this.registerClient.put("data", this.AFLogger);
            afDebugLog();
            throw null;
        }
        this.registerClient.put("data", this.AFLogger);
        afDebugLog();
        map = this.registerClient;
        afInfoLog = (afWarnLog + 59) % 128;
        return map;
    }

    private static void a(int[] iArr, int i10, Object[] objArr) {
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AFLoggerLogLevel;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            loop0: while (true) {
                int i11 = 0;
                while (i11 < length) {
                    int i12 = $11 + 115;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        break;
                    }
                    iArr3[i11] = (int) (iArr2[i11] ^ 8546810173735754695L);
                    i11++;
                }
                iArr3[i11] = (int) (iArr2[i11] * 8546810173735754695L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFLoggerLogLevel;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                iArr6[i13] = (int) (iArr5[i13] ^ 8546810173735754695L);
                i13++;
                $11 = ($10 + 51) % 128;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1oSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i14 = aFk1oSDK.AFKeystoreWrapper;
            if (i14 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            $10 = ($11 + 3) % 128;
            int i15 = iArr[i14];
            char c10 = (char) (i15 >> 16);
            cArr[0] = c10;
            char c11 = (char) i15;
            cArr[1] = c11;
            char c12 = (char) (iArr[i14 + 1] >> 16);
            cArr[2] = c12;
            char c13 = (char) iArr[i14 + 1];
            cArr[3] = c13;
            aFk1oSDK.AFLogger = (c10 << 16) + c11;
            aFk1oSDK.f5493d = (c12 << 16) + c13;
            AFk1oSDK.unregisterClient(iArr4);
            for (int i16 = 0; i16 < 16; i16++) {
                $11 = ($10 + 33) % 128;
                int i17 = aFk1oSDK.AFLogger ^ iArr4[i16];
                aFk1oSDK.AFLogger = i17;
                int d10 = AFk1oSDK.d(i17) ^ aFk1oSDK.f5493d;
                int i18 = aFk1oSDK.AFLogger;
                aFk1oSDK.AFLogger = d10;
                aFk1oSDK.f5493d = i18;
            }
            int i19 = aFk1oSDK.AFLogger;
            int i20 = aFk1oSDK.f5493d;
            aFk1oSDK.AFLogger = i20;
            aFk1oSDK.f5493d = i19;
            int i21 = i19 ^ iArr4[16];
            aFk1oSDK.f5493d = i21;
            int i22 = i20 ^ iArr4[17];
            aFk1oSDK.AFLogger = i22;
            cArr[0] = (char) (i22 >>> 16);
            cArr[1] = (char) i22;
            cArr[2] = (char) (i21 >>> 16);
            cArr[3] = (char) i21;
            AFk1oSDK.unregisterClient(iArr4);
            int i23 = aFk1oSDK.AFKeystoreWrapper;
            cArr2[i23 * 2] = cArr[0];
            cArr2[(i23 * 2) + 1] = cArr[1];
            cArr2[(i23 * 2) + 2] = cArr[2];
            cArr2[(i23 * 2) + 3] = cArr[3];
            aFk1oSDK.AFKeystoreWrapper = i23 + 2;
        }
    }

    private synchronized void afDebugLog() {
        this.AFLogger = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i10 = afWarnLog + 19;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private boolean afErrorLog() {
        if (!this.f5340v || (!this.unregisterClient && !this.f5339i)) {
            afWarnLog = (afInfoLog + 95) % 128;
            return false;
        }
        int i10 = afWarnLog + 15;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 43 / 0;
        }
        return true;
    }

    private boolean afInfoLog() {
        afInfoLog = (afWarnLog + 81) % 128;
        boolean AFKeystoreWrapper = this.f5338e.AFKeystoreWrapper().AFKeystoreWrapper("participantInProxy");
        int i10 = afInfoLog + 125;
        afWarnLog = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 49 / 0;
        }
        return AFKeystoreWrapper;
    }

    private void afWarnLog() {
        registerClient(new Object[]{this}, -811614036, 811614038, System.identityHashCode(this));
    }

    private synchronized void e() {
        afWarnLog = (afInfoLog + 11) % 128;
        if (this.f5339i) {
            return;
        }
        this.f5339i = true;
        try {
            AFLogger("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            afInfoLog = (afWarnLog + 13) % 128;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(LogTag.PROXY, "Error while starting remote debugger", th2, true, true, true);
        }
    }

    public static void force() {
        AFLoggerLogLevel = new int[]{-568377693, 1688322947, 854413037, -687779850, -1810683974, 1583969886, -2000849430, -146928909, 707207527, -2090776958, -563356009, 1806852058, -1348460850, 177728571, -1217440324, -910513204, -1775435922, 1154080255};
    }

    public static /* synthetic */ Object registerClient(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (i10 * 50) + (i11 * (-97)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (((~(i14 | (~i10))) | i13 | (~(i10 | i12))) * (-49)) + (((~(i10 | i11)) | (~(i12 | i13))) * 49);
        int i16 = 1;
        if (i15 == 1) {
            return d(objArr);
        }
        if (i15 == 2) {
            AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
            afWarnLog = (afInfoLog + 39) % 128;
            aFd1wSDK.f5338e.AFKeystoreWrapper().AFLogger("participantInProxy");
            afWarnLog = (afInfoLog + 59) % 128;
            return null;
        }
        if (i15 != 3) {
            AFd1wSDK aFd1wSDK2 = (AFd1wSDK) objArr[0];
            float floatValue = ((Number) objArr[1]).floatValue();
            afWarnLog = (afInfoLog + 61) % 128;
            double d10 = floatValue;
            if (d10 >= 1.0d) {
                return Boolean.TRUE;
            }
            if (d10 <= 0.0d) {
                return Boolean.FALSE;
            }
            if (aFd1wSDK2.w() > floatValue) {
                return Boolean.FALSE;
            }
            afInfoLog = (afWarnLog + 115) % 128;
            return Boolean.TRUE;
        }
        String str = (String) objArr[0];
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objArr[1];
        int i17 = (afInfoLog + 123) % 128;
        afWarnLog = i17;
        if (stackTraceElementArr == null) {
            int i18 = i17 + 57;
            afInfoLog = i18 % 128;
            if (i18 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        while (i16 < stackTraceElementArr.length) {
            int i19 = afWarnLog + 73;
            afInfoLog = i19 % 128;
            if (i19 % 2 == 0) {
                strArr2[i16] = stackTraceElementArr[i16].toString();
                i16 += 50;
            } else {
                strArr2[i16] = stackTraceElementArr[i16].toString();
                i16++;
            }
        }
        return strArr2;
    }

    private static String v() {
        int i10 = (afWarnLog + 57) % 128;
        afInfoLog = i10;
        int i11 = i10 + 13;
        afWarnLog = i11 % 128;
        if (i11 % 2 == 0) {
            return "7.0.1";
        }
        throw null;
    }

    private float w() {
        float nextFloat;
        int i10 = afWarnLog + 91;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            nextFloat = this.force.nextFloat();
            int i11 = 72 / 0;
        } else {
            nextFloat = this.force.nextFloat();
        }
        int i12 = afWarnLog + 33;
        afInfoLog = i12 % 128;
        if (i12 % 2 != 0) {
            return nextFloat;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper(String str, String str2) {
        afWarnLog = (afInfoLog + 115) % 128;
        AFLogger("server_request", str, str2);
        int i10 = afInfoLog + 51;
        afWarnLog = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFLogger() {
        afInfoLog = (afWarnLog + 23) % 128;
        boolean d10 = d(AFKeystoreWrapper(this.f5338e.i().unregisterClient.AFLogger), AFKeystoreWrapper(this.f5338e.i().unregisterClient.f5388d));
        if (!d10) {
            registerClient();
            d();
            afWarnLog = (afInfoLog + 25) % 128;
            return d10;
        }
        int i10 = afInfoLog + 49;
        afWarnLog = i10 % 128;
        if (i10 % 2 == 0) {
            e();
            return d10;
        }
        e();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r8.unregisterClient == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0 + 17;
        com.appsflyer.internal.AFd1wSDK.afInfoLog = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r8.unregisterClient == false) goto L18;
     */
    @Override // com.appsflyer.internal.AFd1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = com.appsflyer.internal.AFd1wSDK.afWarnLog     // Catch: java.lang.Throwable -> L22
            int r1 = r0 + 81
            int r1 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r1     // Catch: java.lang.Throwable -> L22
            boolean r1 = r8.f5339i     // Catch: java.lang.Throwable -> L22
            r2 = 0
            if (r1 != 0) goto L36
            int r1 = r0 + 123
            int r3 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r3     // Catch: java.lang.Throwable -> L22
            int r1 = r1 % 2
            if (r1 != 0) goto L24
            boolean r1 = r8.unregisterClient     // Catch: java.lang.Throwable -> L22
            r3 = 80
            int r3 = r3 / r2
            if (r1 != 0) goto L36
            goto L28
        L20:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L22
        L22:
            r0 = move-exception
            goto L70
        L24:
            boolean r1 = r8.unregisterClient     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L36
        L28:
            int r0 = r0 + 17
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r1     // Catch: java.lang.Throwable -> L22
            int r0 = r0 % 2
            if (r0 == 0) goto L34
            monitor-exit(r8)
            return
        L34:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L20
        L36:
            r8.f5339i = r2     // Catch: java.lang.Throwable -> L22
            r8.unregisterClient = r2     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = "r_debugging_off"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L60
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ssZ"
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L60
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L60
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L60
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r1.format(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L60
            r8.AFLogger(r0, r1, r2)     // Catch: java.lang.Throwable -> L60
            int r0 = com.appsflyer.internal.AFd1wSDK.afInfoLog     // Catch: java.lang.Throwable -> L22
            int r0 = r0 + 31
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1wSDK.afWarnLog = r0     // Catch: java.lang.Throwable -> L22
            monitor-exit(r8)
            return
        L60:
            r0 = move-exception
            r4 = r0
            com.appsflyer.AFLogger r1 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L22
            com.appsflyer.sdk_base.logger.LogTag r2 = com.appsflyer.sdk_base.logger.LogTag.PROXY     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "Error while stopping remote debugger"
            r6 = 1
            r7 = 1
            r5 = 1
            r1.e(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r8)
            return
        L70:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L22
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.d():void");
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean i() {
        int i10 = (afWarnLog + 61) % 128;
        afInfoLog = i10;
        boolean z10 = this.f5339i;
        afWarnLog = (i10 + 63) % 128;
        return z10;
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final synchronized void unregisterClient() {
        try {
            int i10 = afInfoLog + 13;
            afWarnLog = i10 % 128;
            if (i10 % 2 != 0) {
                this.registerClient.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 1;
            } else {
                this.registerClient.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r7 == null) goto L11;
     */
    @Override // com.appsflyer.internal.AFd1uSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v_(java.lang.String r7, android.content.pm.PackageManager r8) {
        /*
            r6 = this;
            int r8 = com.appsflyer.internal.AFd1wSDK.afWarnLog
            int r8 = r8 + 73
            int r0 = r8 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r0
            int r8 = r8 % 2
            r0 = 1660886871(0x62ff1f57, float:2.353089E21)
            r1 = -1660886869(0xffffffff9d00e0ab, float:-1.705681E-21)
            r2 = -1483898606(0xffffffffa78d8112, float:-3.92753E-15)
            r3 = 1483898607(0x58727eef, float:1.06650796E15)
            if (r8 != 0) goto L4f
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = registerClient(r7, r3, r2, r8)     // Catch: java.lang.Throwable -> L4b
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r8 = r6.f5338e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFf1fSDK r8 = r8.AppsFlyerLib()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r2 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r8 = com.appsflyer.internal.AFf1fSDK.unregisterClient(r2, r1, r0, r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r0 = r6.f5338e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1sSDK r0 = r0.unregisterClient()     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1vSDK r7 = r0.d(r7, r8)     // Catch: java.lang.Throwable -> L4b
            r8 = 40
            int r8 = r8 / 0
            if (r7 != 0) goto L90
            goto L7d
        L4b:
            r0 = move-exception
            r7 = r0
            r3 = r7
            goto La7
        L4f:
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r6)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = registerClient(r7, r3, r2, r8)     // Catch: java.lang.Throwable -> L4b
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r8 = r6.f5338e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFf1fSDK r8 = r8.AppsFlyerLib()     // Catch: java.lang.Throwable -> L4b
            java.lang.Object[] r2 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L4b
            int r8 = java.lang.System.identityHashCode(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r8 = com.appsflyer.internal.AFf1fSDK.unregisterClient(r2, r1, r0, r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFc1bSDK r0 = r6.f5338e     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1sSDK r0 = r0.unregisterClient()     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.AFd1vSDK r7 = r0.d(r7, r8)     // Catch: java.lang.Throwable -> L4b
            if (r7 != 0) goto L90
        L7d:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.sdk_base.logger.LogTag r1 = com.appsflyer.sdk_base.logger.LogTag.PROXY     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "Could not send proxy data: request is null"
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r7 = "request was null"
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L4b
            r4 = 0
            r5 = 0
            r0.e(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4b
            return
        L90:
            com.appsflyer.internal.AFc1bSDK r8 = r6.f5338e     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.ExecutorService r8 = r8.d()     // Catch: java.lang.Throwable -> L4b
            com.appsflyer.internal.e0 r0 = new com.appsflyer.internal.e0     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            r8.execute(r0)     // Catch: java.lang.Throwable -> L4b
            int r7 = com.appsflyer.internal.AFd1wSDK.afWarnLog
            int r7 = r7 + 17
            int r7 = r7 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r7
            return
        La7:
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.sdk_base.logger.LogTag r1 = com.appsflyer.sdk_base.logger.LogTag.PROXY
            r4 = 0
            r5 = 0
            java.lang.String r2 = "Could not send proxy data"
            r0.e(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.v_(java.lang.String, android.content.pm.PackageManager):void");
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper(String str, int i10, String str2) {
        int i11 = afInfoLog + 123;
        afWarnLog = i11 % 128;
        if (i11 % 2 != 0) {
            String[] strArr = new String[5];
            strArr[0] = String.valueOf(i10);
            strArr[0] = str2;
            AFLogger("server_response", str, strArr);
        } else {
            AFLogger("server_response", str, String.valueOf(i10), str2);
        }
        int i12 = afInfoLog + 119;
        afWarnLog = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 52 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper() {
        int i10 = (afInfoLog + 105) % 128;
        afWarnLog = i10;
        this.f5340v = false;
        int i11 = i10 + 71;
        afInfoLog = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void unregisterClient(boolean z10) {
        afInfoLog = (afWarnLog + 121) % 128;
        this.f5338e.AFKeystoreWrapper().registerClient("participantInProxy", z10);
        int i10 = afWarnLog + 89;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 31 / 0;
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.registerClient;
            Object[] objArr = new Object[1];
            a(new int[]{579646829, 1366893693, -1057920183, -376234262}, 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.registerClient.put("model", Build.MODEL);
            this.registerClient.put("platform", "Android");
            this.registerClient.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    afInfoLog = (afWarnLog + 121) % 128;
                    if (str.length() > 0) {
                        int i10 = afWarnLog + 119;
                        afInfoLog = i10 % 128;
                        if (i10 % 2 == 0) {
                            this.registerClient.put("advertiserId", str);
                            int i11 = 57 / 0;
                        } else {
                            this.registerClient.put("advertiserId", str);
                        }
                    }
                } finally {
                }
            }
            if (str2 != null && str2.length() > 0) {
                int i12 = afWarnLog + 37;
                afInfoLog = i12 % 128;
                if (i12 % 2 != 0) {
                    this.registerClient.put("imei", str2);
                } else {
                    this.registerClient.put("imei", str2);
                    throw null;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.registerClient.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void d(String str, String... strArr) {
        int i10 = afWarnLog + 87;
        afInfoLog = i10 % 128;
        if (i10 % 2 != 0) {
            AFLogger("public_api_call", str, strArr);
            afInfoLog = (afWarnLog + 97) % 128;
        } else {
            AFLogger("public_api_call", str, strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFLogger(String str, String str2) {
        int i10 = afWarnLog + 115;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            AFLogger(null, str, str2);
        } else {
            AFLogger(null, str, str2);
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        int i10 = afWarnLog + 5;
        afInfoLog = i10 % 128;
        if (i10 % 2 != 0) {
            aFd1wSDK.d(str, aFd1wSDK.f5338e.setAndroidIdData());
            return aFd1wSDK.AFLoggerLogLevel();
        }
        aFd1wSDK.d(str, aFd1wSDK.f5338e.setAndroidIdData());
        aFd1wSDK.AFLoggerLogLevel();
        throw null;
    }

    private synchronized void AFLogger(String str, String str2, String str3, String str4) {
        int i10 = afWarnLog + 117;
        afInfoLog = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.registerClient.put("sdk_version", str);
                if (str2 != null) {
                    int i11 = afWarnLog + 119;
                    afInfoLog = i11 % 128;
                    if (i11 % 2 != 0) {
                        if (str2.length() > 0) {
                            this.registerClient.put("devkey", str2);
                        }
                    } else {
                        str2.length();
                        throw null;
                    }
                }
                if (str3 != null) {
                    int i12 = afInfoLog + 81;
                    afWarnLog = i12 % 128;
                    if (i12 % 2 == 0) {
                        if (str3.length() > 0) {
                            this.registerClient.put("originalAppsFlyerId", str3);
                        }
                    } else {
                        str3.length();
                        throw null;
                    }
                }
                if (str4 != null) {
                    afWarnLog = (afInfoLog + 89) % 128;
                    if (str4.length() > 0) {
                        this.registerClient.put("uid", str4);
                    }
                }
            } else {
                this.registerClient.put("sdk_version", str);
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void registerClient(Throwable th2) {
        String message;
        Throwable cause = th2.getCause();
        String simpleName = th2.getClass().getSimpleName();
        if (cause == null) {
            int i10 = afInfoLog + 121;
            afWarnLog = i10 % 128;
            if (i10 % 2 == 0) {
                message = th2.getMessage();
            } else {
                th2.getMessage();
                throw null;
            }
        } else {
            message = cause.getMessage();
        }
        AFLogger("exception", simpleName, (String[]) registerClient(new Object[]{message, cause == null ? th2.getStackTrace() : cause.getStackTrace()}, -1008260537, 1008260540, (int) System.currentTimeMillis()));
        int i11 = afInfoLog + 17;
        afWarnLog = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private synchronized void d(String str, String str2, String str3, String str4) {
        try {
            if (str != null) {
                int i10 = afInfoLog + 9;
                afWarnLog = i10 % 128;
                if (i10 % 2 != 0) {
                    str.length();
                    throw null;
                }
                if (str.length() > 0) {
                    afInfoLog = (afWarnLog + 3) % 128;
                    this.registerClient.put("app_id", str);
                    afWarnLog = (afInfoLog + 27) % 128;
                }
            }
            if (str2 != null) {
                int i11 = afWarnLog + 55;
                afInfoLog = i11 % 128;
                if (i11 % 2 != 0) {
                    if (str2.length() > 0) {
                        this.registerClient.put("app_version", str2);
                    }
                } else {
                    throw null;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.registerClient.put("channel", str3);
                afWarnLog = (afInfoLog + 53) % 128;
            }
            if (str4 != null) {
                int i12 = afWarnLog + 107;
                afInfoLog = i12 % 128;
                if (i12 % 2 != 0) {
                    if (str4.length() > 0) {
                        this.registerClient.put("preInstall", str4);
                    }
                } else {
                    throw null;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean AFKeystoreWrapper(String str) {
        int i10 = (afInfoLog + 5) % 128;
        afWarnLog = i10;
        if (str == null) {
            return true;
        }
        afInfoLog = (i10 + 25) % 128;
        if (str.trim().length() == 0) {
            return true;
        }
        return str.equals(this.f5338e.AFLogger().r_().versionName);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final synchronized void registerClient() {
        afInfoLog = (afWarnLog + 51) % 128;
        this.unregisterClient = false;
        unregisterClient();
        afDebugLog();
        afWarnLog = (afInfoLog + 63) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r4 = r4.unregisterClient;
        r2 = r2 + 51;
        com.appsflyer.internal.AFd1wSDK.afWarnLog = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        r4 = r4.registerClient;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r4 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.appsflyer.internal.AFh1cSDK AFKeystoreWrapper(com.appsflyer.internal.AFh1aSDK r4) {
        /*
            int r0 = com.appsflyer.internal.AFd1wSDK.afWarnLog
            int r1 = r0 + 93
            int r2 = r1 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r2
            int r1 = r1 % 2
            r3 = 0
            if (r1 != 0) goto L14
            r1 = 20
            int r1 = r1 / 0
            if (r4 == 0) goto L28
            goto L16
        L14:
            if (r4 == 0) goto L28
        L16:
            com.appsflyer.internal.AFh1gSDK r4 = r4.registerClient
            if (r4 == 0) goto L28
            com.appsflyer.internal.AFh1cSDK r4 = r4.unregisterClient
            int r2 = r2 + 51
            int r0 = r2 % 128
            com.appsflyer.internal.AFd1wSDK.afWarnLog = r0
            int r2 = r2 % 2
            if (r2 != 0) goto L27
            return r4
        L27:
            throw r3
        L28:
            int r0 = r0 + 1
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1wSDK.afInfoLog = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper(com.appsflyer.internal.AFh1aSDK):com.appsflyer.internal.AFh1cSDK");
    }

    private synchronized void AFLogger(String str, String str2, String... strArr) {
        String obj;
        if (afErrorLog()) {
            int i10 = afWarnLog + 79;
            afInfoLog = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_7.0.1 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(join);
                        obj = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(currentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_7.0.1 ");
                        sb3.append(join);
                        obj = sb3.toString();
                    }
                    int length = this.AFKeystoreWrapper + (obj.length() << 1);
                    int i11 = f5337d;
                    boolean z10 = false;
                    if (length > i11) {
                        obj = obj.substring(0, (i11 - this.AFKeystoreWrapper) / 2);
                        z10 = true;
                    }
                    this.AFLogger.add(obj);
                    this.AFKeystoreWrapper += obj.length() << 1;
                    if (z10) {
                        afInfoLog = (afWarnLog + 49) % 128;
                        this.AFLogger.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private Map<String, Object> registerClient(String str) {
        return (Map) registerClient(new Object[]{this, str}, 1483898607, -1483898606, System.identityHashCode(this));
    }

    private synchronized void d(String str, AFc1eSDK aFc1eSDK) {
        try {
            String string = this.f5341w.getString("remote_debug_static_data");
            this.registerClient.clear();
            if (string != null) {
                try {
                    this.registerClient.putAll(AFg1dSDK.unregisterClient(new JSONObject(string)));
                    afInfoLog = (afWarnLog + 121) % 128;
                } catch (Throwable unused) {
                }
            } else {
                AFKeystoreWrapper(this.f5338e.AFLogger().AFLogger(), aFc1eSDK.AFLoggerLogLevel, aFc1eSDK.force);
                StringBuilder sb2 = new StringBuilder("7.0.1.");
                sb2.append(AFa1tSDK.unregisterClient);
                String obj = sb2.toString();
                AFf1fSDK AppsFlyerLib = this.f5338e.AppsFlyerLib();
                AFLogger(obj, (String) AFf1fSDK.unregisterClient(new Object[]{AppsFlyerLib}, -1660886869, 1660886871, System.identityHashCode(AppsFlyerLib)), this.f5341w.getString("KSAppsFlyerId"), AFb1jSDK.AFLogger(this.f5338e.AFLogger().AFKeystoreWrapper));
                try {
                    int i10 = this.f5338e.AFLogger().r_().versionCode;
                    String AFLogger = this.f5338e.AFLogger().AFLogger("CHANNEL");
                    if (AFLogger != null) {
                        int i11 = afInfoLog + 15;
                        afWarnLog = i11 % 128;
                        if (i11 % 2 == 0) {
                            if (AFLogger.equals("")) {
                                AFLogger = null;
                            }
                        } else {
                            AFLogger.equals("");
                            throw null;
                        }
                    }
                    d(str, String.valueOf(i10), AFLogger, this.f5341w.getString("preInstallName"));
                    afWarnLog = (afInfoLog + 77) % 128;
                } catch (Throwable unused2) {
                }
                this.f5341w.set("remote_debug_static_data", new JSONObject(this.registerClient).toString());
            }
            this.registerClient.put("launch_counter", String.valueOf(this.f5338e.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0)));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean AFLogger(@NonNull AFh1cSDK aFh1cSDK, AFh1cSDK aFh1cSDK2) {
        if (aFh1cSDK.equals(aFh1cSDK2)) {
            afWarnLog = (afInfoLog + 79) % 128;
            return afInfoLog();
        }
        boolean booleanValue = ((Boolean) registerClient(new Object[]{this, Float.valueOf(aFh1cSDK.AFKeystoreWrapper)}, 830139978, -830139978, System.identityHashCode(this))).booleanValue();
        unregisterClient(booleanValue);
        afInfoLog = (afWarnLog + 33) % 128;
        return booleanValue;
    }

    private synchronized boolean d(AFh1cSDK aFh1cSDK, AFh1cSDK aFh1cSDK2) {
        if (aFh1cSDK == null) {
            registerClient(new Object[]{this}, -811614036, 811614038, System.identityHashCode(this));
            return false;
        }
        if (TimeUnit.SECONDS.toMillis(aFh1cSDK.AFLogger) <= AFh1cSDK.registerClient()) {
            return false;
        }
        afInfoLog = (afWarnLog + 93) % 128;
        if (this.f5338e.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) > aFh1cSDK.unregisterClient) {
            return false;
        }
        if (!AFLogger(aFh1cSDK, aFh1cSDK2)) {
            afWarnLog = (afInfoLog + 45) % 128;
            return false;
        }
        if (!AFKeystoreWrapper(aFh1cSDK.rl.d.a java.lang.String)) {
            return false;
        }
        if (!d(aFh1cSDK.i)) {
            afInfoLog = (afWarnLog + 57) % 128;
            return false;
        }
        int i10 = afWarnLog + 73;
        afInfoLog = i10 % 128;
        if (i10 % 2 != 0) {
            return true;
        }
        int i11 = 72 / 0;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r2.trim().length() != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        new com.appsflyer.internal.AFd1ySDK();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        return com.appsflyer.internal.AFd1ySDK.registerClient(v(), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0012, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(java.lang.String r2) {
        /*
            int r0 = com.appsflyer.internal.AFd1wSDK.afInfoLog
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.appsflyer.internal.AFd1wSDK.afWarnLog = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L12
            r0 = 7
            int r0 = r0 / 0
            if (r2 == 0) goto L2d
            goto L14
        L12:
            if (r2 == 0) goto L2d
        L14:
            java.lang.String r0 = r2.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L1f
            goto L2d
        L1f:
            com.appsflyer.internal.AFd1ySDK r0 = new com.appsflyer.internal.AFd1ySDK
            r0.<init>()
            java.lang.String r0 = v()
            boolean r2 = com.appsflyer.internal.AFd1ySDK.registerClient(r0, r2)
            return r2
        L2d:
            int r2 = com.appsflyer.internal.AFd1wSDK.afInfoLog
            int r2 = r2 + 41
            int r0 = r2 % 128
            com.appsflyer.internal.AFd1wSDK.afWarnLog = r0
            int r2 = r2 % 2
            r0 = 1
            if (r2 == 0) goto L3e
            r2 = 68
            int r2 = r2 / 0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1wSDK.d(java.lang.String):boolean");
    }

    private boolean d(float f10) {
        return ((Boolean) registerClient(new Object[]{this, Float.valueOf(f10)}, 830139978, -830139978, System.identityHashCode(this))).booleanValue();
    }

    private static String[] d(String str, StackTraceElement[] stackTraceElementArr) {
        return (String[]) registerClient(new Object[]{str, stackTraceElementArr}, -1008260537, 1008260540, (int) System.currentTimeMillis());
    }
}
