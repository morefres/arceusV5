package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1jSDK;
import com.appsflyer.sdk_base.logger.LogTag;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* loaded from: classes.dex */
public final class AFd1sSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afErrorLog = 1;
    private static char force = 61826;

    /* renamed from: i, reason: collision with root package name */
    private static int f5325i = -234967815;

    /* renamed from: v, reason: collision with root package name */
    private static long f5326v = -6857616994649640574L;

    /* renamed from: w, reason: collision with root package name */
    private static int f5327w;
    private final AFj1mSDK AFKeystoreWrapper;
    private final AFd1xSDK AFLogger;

    /* renamed from: d, reason: collision with root package name */
    private final AFj1cSDK f5328d;

    /* renamed from: e, reason: collision with root package name */
    private final AFf1fSDK f5329e;
    private final AFc1iSDK registerClient;
    private final AFd1jSDK unregisterClient;

    public AFd1sSDK(AFd1xSDK aFd1xSDK, AFc1iSDK aFc1iSDK, AFd1jSDK aFd1jSDK, AFj1mSDK aFj1mSDK, AFj1cSDK aFj1cSDK, AFf1fSDK aFf1fSDK) {
        this.AFLogger = aFd1xSDK;
        this.registerClient = aFc1iSDK;
        this.unregisterClient = aFd1jSDK;
        this.AFKeystoreWrapper = aFj1mSDK;
        this.f5328d = aFj1cSDK;
        this.f5329e = aFf1fSDK;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, char c10, int i10, String str2, String str3, Object[] objArr) {
        char[] cArr;
        int i11 = $10 + 69;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (str3 != 0) {
            cArr = str3.toCharArray();
            $11 = ($10 + 69) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        int length = charArray2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray2, 0, cArr3, 0, length);
        System.arraycopy(charArray, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c10);
        cArr4[2] = (char) (cArr4[2] + ((char) i10));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFk1pSDK.AFKeystoreWrapper = 0;
        $11 = ($10 + HttpStatusCodesKt.HTTP_EARLY_HINTS) % 128;
        while (true) {
            int i12 = aFk1pSDK.AFKeystoreWrapper;
            if (i12 >= length3) {
                objArr[0] = new String(cArr5);
                return;
            }
            $10 = ($11 + 113) % 128;
            int i13 = (i12 + 3) % 4;
            int i14 = cArr3[i12 % 4] * 32718;
            char c11 = cArr4[(i12 + 2) % 4];
            char c12 = (char) ((i14 + c11) % 65535);
            aFk1pSDK.AFLogger = c12;
            cArr4[i13] = (char) (((cArr3[i13] * 32718) + c11) / 65535);
            cArr3[i13] = c12;
            cArr5[i12] = (char) ((((cArr2[i12] ^ c12) ^ (f5326v ^ (-6857616994649640574L))) ^ ((int) (f5325i ^ (-6857616994649640574L)))) ^ ((char) (force ^ (-6857616994649640574L))));
            aFk1pSDK.AFKeystoreWrapper = i12 + 1;
        }
    }

    public static /* synthetic */ Object d(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i10 * 530) + 1058 + (i11 * 530) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (((~(i10 | i12)) | (~i11)) * 529);
        return i13 != 1 ? i13 != 2 ? registerClient(objArr) : unregisterClient(objArr) : AFKeystoreWrapper(objArr);
    }

    public final AFd1pSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str) {
        byte[] bArr;
        String d10;
        int i10 = afErrorLog + 65;
        f5327w = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1bSDK.getInstance;
                    Object obj = map2.get(1360275338);
                    if (obj == null) {
                        obj = ((Class) AFa1bSDK.AFLogger((char) ((-1) - TextUtils.lastIndexOf("", '0')), 197 - Process.getGidForName(""), 35 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("unregisterClient", Map.class, String.class);
                        map2.put(1360275338, obj);
                    }
                    bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                    byte[] bArr2 = bArr;
                    AFj1mSDK aFj1mSDK = this.AFKeystoreWrapper;
                    d10 = aFj1mSDK.d(aFj1mSDK.unregisterClient(AFj1mSDK.i()), false);
                    AFd1pSDK<String> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(d10, bArr2, "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
                    afErrorLog = (f5327w + 71) % 128;
                    return aFd1pSDK;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1bSDK.getInstance;
                Object obj2 = map3.get(1360275338);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1bSDK.AFLogger((char) KeyEvent.getDeadChar(0, 0), ExpandableListView.getPackedPositionType(0L) + 198, 35 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("unregisterClient", Map.class, String.class);
                    map3.put(1360275338, obj2);
                }
                bArr = (byte[]) ((Method) obj2).invoke(null, objArr2);
                int i11 = 76 / 0;
                byte[] bArr22 = bArr;
                AFj1mSDK aFj1mSDK2 = this.AFKeystoreWrapper;
                d10 = aFj1mSDK2.d(aFj1mSDK2.unregisterClient(AFj1mSDK.i()), false);
                AFd1pSDK<String> aFd1pSDK2 = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(d10, bArr22, "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
                afErrorLog = (f5327w + 71) % 128;
                return aFd1pSDK2;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
            return null;
        }
    }

    public final AFd1pSDK<String> AFLogger(Map<String, Object> map, String str) {
        int i10 = afErrorLog + 77;
        f5327w = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                try {
                    Object[] objArr = {map, str};
                    Map map2 = AFa1bSDK.getInstance;
                    Object obj = map2.get(1360275338);
                    if (obj == null) {
                        obj = ((Class) AFa1bSDK.AFLogger((char) Color.green(0), 199 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 35)).getMethod("unregisterClient", Map.class, String.class);
                        map2.put(1360275338, obj);
                    }
                    return (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(this.AFKeystoreWrapper.unregisterClient(AFj1mSDK.force()), (byte[]) ((Method) obj).invoke(null, objArr), "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            try {
                Object[] objArr2 = {map, str};
                Map map3 = AFa1bSDK.getInstance;
                Object obj2 = map3.get(1360275338);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1bSDK.AFLogger((char) View.MeasureSpec.makeMeasureSpec(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 198, 35 - Drawable.resolveOpacity(0, 0))).getMethod("unregisterClient", Map.class, String.class);
                    map3.put(1360275338, obj2);
                }
                throw null;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
            return null;
        }
        AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th4, false, false);
        return null;
    }

    public final AFd1pSDK<String> registerClient(Map<String, Object> map, String str) {
        f5327w = (afErrorLog + 73) % 128;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1bSDK.getInstance;
            Object obj = map2.get(1360275338);
            if (obj == null) {
                obj = ((Class) AFa1bSDK.AFLogger((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 198, 35 - Color.blue(0))).getMethod("unregisterClient", Map.class, String.class);
                map2.put(1360275338, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            f5327w = (afErrorLog + 79) % 128;
            return (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(this.AFKeystoreWrapper.unregisterClient(AFj1mSDK.e()), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(LogTag.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    public final AFd1pSDK<String> unregisterClient(Map<String, Object> map, String str) {
        String d10;
        afErrorLog = (f5327w + 61) % 128;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1bSDK.getInstance;
            Object obj = map2.get(1360275338);
            if (obj == null) {
                obj = ((Class) AFa1bSDK.AFLogger((char) Color.green(0), KeyEvent.keyCodeFromString("") + 198, 34 - TextUtils.lastIndexOf("", '0'))).getMethod("unregisterClient", Map.class, String.class);
                map2.put(1360275338, obj);
            }
            byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
            afErrorLog = (f5327w + 93) % 128;
            AFj1mSDK aFj1mSDK = this.AFKeystoreWrapper;
            d10 = aFj1mSDK.d(aFj1mSDK.unregisterClient(AFj1mSDK.v()), false);
            return (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(d10, bArr, "POST", Collections.EMPTY_MAP, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        } catch (Throwable th2) {
            try {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            } catch (Throwable th3) {
                AFLogger.INSTANCE.e(LogTag.ENGAGEMENT, "AFFinalizer: reflection init failed.", th3, false, false);
                return null;
            }
        }
    }

    public final AFd1pSDK<Map<String, String>> d(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String obj = uuid.toString();
        Map<String, Object> registerClient = registerClient();
        String valueOf = String.valueOf(registerClient.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf);
        hashMap.put("Af-Meta-Counter", String.valueOf(registerClient.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(registerClient.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(registerClient.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(registerClient.get("sdk")));
        Object[] objArr = new Object[1];
        a("羅˓鷐ᜃ", (char) (ViewConfiguration.getFadingEdgeLength() >> 16), Color.red(0), "\u0000\u0000\u0000\u0000", "\u0a53ꊲꗖ잢͓䎯샌齶肋瑴⩂⒃", objArr);
        hashMap.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, "GET", obj, str, str2, valueOf));
        AFd1pSDK<Map<String, String>> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(AFj1mSDK.AFKeystoreWrapper(str, str2), null, "GET", hashMap, false), new AFd1hSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        int i10 = afErrorLog + 57;
        f5327w = i10 % 128;
        if (i10 % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFd1sSDK aFd1sSDK = (AFd1sSDK) objArr[0];
        AFd1oSDK aFd1oSDK = (AFd1oSDK) objArr[1];
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[2];
        f5327w = (afErrorLog + 33) % 128;
        AFd1pSDK d10 = aFd1sSDK.d(aFd1oSDK, aFd1iSDK, aFd1sSDK.AFLogger());
        int i10 = afErrorLog + 49;
        f5327w = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return d10;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        String str;
        String str2;
        String str3;
        AFd1sSDK aFd1sSDK = (AFd1sSDK) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str4 = (String) objArr[3];
        ((Number) objArr[4]).intValue();
        AFd1jSDK aFd1jSDK = aFd1sSDK.unregisterClient;
        Intrinsics.checkNotNullParameter(str4, "");
        if (booleanValue) {
            int i10 = afErrorLog + 113;
            f5327w = i10 % 128;
            if (i10 % 2 == 0) {
                str = AFd1jSDK.unregisterClient;
            } else {
                AFd1jSDK.Companion companion = AFd1jSDK.INSTANCE;
                throw null;
            }
        } else {
            str = AFd1jSDK.AFLogger;
        }
        if (booleanValue2) {
            int i11 = f5327w + 13;
            afErrorLog = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            str2 = "stg";
        } else {
            afErrorLog = (f5327w + 77) % 128;
            str2 = "";
        }
        kotlin.jvm.internal.g0 g0Var = kotlin.jvm.internal.g0.f22970a;
        Locale locale = Locale.US;
        if (AFd1jSDK.AFKeystoreWrapper()) {
            f5327w = (afErrorLog + 3) % 128;
            str3 = (String) aFd1jSDK.w.getValue();
        } else {
            str3 = "";
        }
        String format = String.format(locale, str, Arrays.copyOf(new Object[]{str3, str2, aFd1jSDK.d(), str4}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFd1oSDK aFd1oSDK = new AFd1oSDK(format, "GET");
        aFd1oSDK.f5322v = 1500;
        return (AFd1pSDK) d(new Object[]{aFd1sSDK, aFd1oSDK, new AFd1lSDK()}, -1128782579, 1128782579, System.identityHashCode(aFd1sSDK));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        if (r11.f5440v == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
    
        r1 = r11 instanceof com.appsflyer.internal.AFh1lSDK;
        r2 = r11 instanceof com.appsflyer.internal.AFh1kSDK;
        r4 = r11 instanceof com.appsflyer.internal.AFg1uSDK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        if ((r11 instanceof com.appsflyer.internal.AFh1hSDK) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
    
        com.appsflyer.internal.AFd1sSDK.afErrorLog = (com.appsflyer.internal.AFd1sSDK.f5327w + 117) % 128;
        r13 = com.appsflyer.internal.AFj1mSDK.afInfoLog();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00cf, code lost:
    
        r11 = (com.appsflyer.internal.AFd1pSDK) d(new java.lang.Object[]{r10, new com.appsflyer.internal.AFd1oSDK(r0.d(com.appsflyer.internal.AFj1mSDK.AFKeystoreWrapper(r0.unregisterClient(r13), r1), r4), r6, "POST", r11.registerClient, r11.unregisterClient), new com.appsflyer.internal.AFd1kSDK()}, -1128782579, 1128782579, java.lang.System.identityHashCode(r10));
        r13 = com.appsflyer.internal.AFd1sSDK.f5327w + 13;
        com.appsflyer.internal.AFd1sSDK.afErrorLog = r13 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0108, code lost:
    
        if ((r13 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
    
        r13 = 65 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x010d, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (r2 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a0, code lost:
    
        r13 = com.appsflyer.internal.AFj1mSDK.registerClient();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r1 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r13 = com.appsflyer.internal.AFj1mSDK.AFLogger();
        com.appsflyer.internal.AFd1sSDK.afErrorLog = (com.appsflyer.internal.AFd1sSDK.f5327w + 113) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        r13 = com.appsflyer.internal.AFj1mSDK.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        if (r13 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r11.afWarnLog >= 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r13 = com.appsflyer.internal.AFj1mSDK.unregisterClient();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r13 = com.appsflyer.internal.AFj1mSDK.AFKeystoreWrapper();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        r13 = com.appsflyer.internal.AFj1mSDK.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r11.f5441w != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        if (r11.f5440v == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1pSDK<java.lang.String> AFLogger(com.appsflyer.internal.AFh1pSDK r11, java.lang.String r12, com.appsflyer.internal.AFd1zSDK r13) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1sSDK.AFLogger(com.appsflyer.internal.AFh1pSDK, java.lang.String, com.appsflyer.internal.AFd1zSDK):com.appsflyer.internal.AFd1pSDK");
    }

    private Map<String, Object> registerClient() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "7.0.1");
        hashMap.put("counter", Integer.valueOf(this.registerClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        a("偫蛄昿쿮", (char) (61030 - KeyEvent.keyCodeFromString("")), Color.argb(0, 0, 0, 0) + 1065796688, "\u0000\u0000\u0000\u0000", "\ud9b1׆䒺솧\udbec", objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        hashMap.put("app_version_name", this.registerClient.r_().versionName);
        hashMap.put("app_id", this.registerClient.f5296d.f5343d.getPackageName());
        hashMap.put("platformextension", this.f5328d.unregisterClient());
        int i10 = f5327w + 17;
        afErrorLog = i10 % 128;
        if (i10 % 2 != 0) {
            return hashMap;
        }
        throw null;
    }

    public final AFd1pSDK<Map<String, Object>> AFKeystoreWrapper(String str, String str2) {
        f5327w = (afErrorLog + 7) % 128;
        AFd1pSDK<Map<String, Object>> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, AFd1qSDK.unregisterClient(this.AFKeystoreWrapper.AFKeystoreWrapper(str), this.registerClient.f5296d.f5343d.getPackageName(), AFb1jSDK.AFLogger(this.registerClient.AFKeystoreWrapper), str, str2), AFd1rSDK.INSTANCE}, -1128782579, 1128782579, System.identityHashCode(this));
        int i10 = afErrorLog + 57;
        f5327w = i10 % 128;
        if (i10 % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    public final AFd1pSDK<String> d(@NonNull String str) {
        AFd1oSDK aFd1oSDK = new AFd1oSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1oSDK.f5322v = BacktraceMetrics.defaultTimeBetweenRetriesMs;
        aFd1oSDK.f5323w = false;
        AFd1pSDK<String> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, aFd1oSDK, new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        f5327w = (afErrorLog + 45) % 128;
        return aFd1pSDK;
    }

    public final AFd1vSDK d(Map<String, Object> map, String str) {
        afErrorLog = (f5327w + 31) % 128;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1bSDK.getInstance;
                Object obj = map2.get(1360275338);
                if (obj == null) {
                    obj = ((Class) AFa1bSDK.AFLogger((char) View.MeasureSpec.getSize(0), KeyEvent.getDeadChar(0, 0) + 198, 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("unregisterClient", Map.class, String.class);
                    map2.put(1360275338, obj);
                }
                byte[] bArr = (byte[]) ((Method) obj).invoke(null, objArr);
                if (bArr != null) {
                    return new AFd1vSDK(this.registerClient, bArr);
                }
                AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                f5327w = (afErrorLog + 61) % 128;
                return null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "AFFinalizer: reflection init failed.", th3, false, false);
            return null;
        }
    }

    private static String AFKeystoreWrapper(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String join = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("v2");
        String d10 = AFj1nSDK.d(join, sb2.toString());
        int i10 = f5327w + 109;
        afErrorLog = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 82 / 0;
        }
        return d10;
    }

    private <T> AFd1pSDK<T> d(AFd1oSDK aFd1oSDK, AFd1iSDK<T> aFd1iSDK, boolean z10) {
        aFd1oSDK.force = z10;
        AFd1xSDK aFd1xSDK = this.AFLogger;
        AFd1pSDK<T> aFd1pSDK = new AFd1pSDK<>(aFd1oSDK, aFd1xSDK.f5342d, aFd1xSDK.AFLogger, aFd1iSDK);
        afErrorLog = (f5327w + 11) % 128;
        return aFd1pSDK;
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFd1sSDK aFd1sSDK = (AFd1sSDK) objArr[0];
        AFa1oSDK aFa1oSDK = (AFa1oSDK) objArr[1];
        AFd1pSDK aFd1pSDK = (AFd1pSDK) d(new Object[]{aFd1sSDK, new AFd1oSDK(aFa1oSDK.f5439i, AFg1dSDK.d(aFa1oSDK.f5437d).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1oSDK.unregisterClient), new AFa1jSDK()}, -1128782579, 1128782579, System.identityHashCode(aFd1sSDK));
        int i10 = afErrorLog + 11;
        f5327w = i10 % 128;
        if (i10 % 2 == 0) {
            return aFd1pSDK;
        }
        throw null;
    }

    public final AFd1pSDK<String> unregisterClient(@NonNull String str, @NonNull Map<String, String> map, String str2, @NonNull UUID uuid, @NonNull String str3) {
        String AFKeystoreWrapper;
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", registerClient());
        if (str2 != null) {
            f5327w = (afErrorLog + 5) % 128;
            hashMap.put("brand_domain", str2);
            f5327w = (afErrorLog + 87) % 128;
        }
        String jSONObject = AFg1dSDK.d(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        a("羅˓鷐ᜃ", (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), ViewConfiguration.getKeyRepeatTimeout() >> 16, "\u0000\u0000\u0000\u0000", "\u0a53ꊲꗖ잢͓䎯샌齶肋瑴⩂⒃", objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, "POST", jSONObject));
        AFj1mSDK aFj1mSDK = this.AFKeystoreWrapper;
        Intrinsics.checkNotNullParameter(str, "");
        AFKeystoreWrapper = AFj1mSDK.AFKeystoreWrapper(str, (String) null);
        return d(new AFd1oSDK(AFKeystoreWrapper, jSONObject.getBytes(Charset.defaultCharset()), "POST", hashMap2, false), new AFd1kSDK(), true);
    }

    @NonNull
    public final AFd1pSDK<DdlResponse> registerClient(AFa1oSDK aFa1oSDK) {
        return (AFd1pSDK) d(new Object[]{this, aFa1oSDK}, 232910799, -232910798, System.identityHashCode(this));
    }

    @NonNull
    public final AFd1pSDK<AFh1aSDK> registerClient(boolean z10, boolean z11, @NonNull String str, int i10) {
        return (AFd1pSDK) d(new Object[]{this, Boolean.valueOf(z10), Boolean.valueOf(z11), str, Integer.valueOf(i10)}, 1895390539, -1895390537, i10);
    }

    private boolean AFLogger() {
        boolean z10;
        String AFLogger = this.registerClient.AFLogger("AF_ENABLE_HTTP_CACHE");
        if (AFLogger != null) {
            afErrorLog = (f5327w + 1) % 128;
            z10 = Boolean.parseBoolean(AFLogger);
        } else {
            z10 = true;
        }
        if (z10) {
            return false;
        }
        int i10 = afErrorLog + 15;
        f5327w = i10 % 128;
        return i10 % 2 == 0;
    }

    public final AFd1pSDK<String> unregisterClient(AFh1nSDK aFh1nSDK) {
        AFd1pSDK<String> aFd1pSDK = (AFd1pSDK) d(new Object[]{this, new AFd1oSDK(aFh1nSDK.f5439i, aFh1nSDK.force, "POST", aFh1nSDK.registerClient, true), new AFd1kSDK()}, -1128782579, 1128782579, System.identityHashCode(this));
        int i10 = afErrorLog + 111;
        f5327w = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 67 / 0;
        }
        return aFd1pSDK;
    }

    private void AFLogger(AFh1pSDK aFh1pSDK, byte[] bArr) {
        boolean z10;
        int i10 = f5327w + 95;
        afErrorLog = i10 % 128;
        if (i10 % 2 != 0) {
            String AFLogger = this.registerClient.AFLogger("com.appsflyer.security.enable");
            if (AFLogger != null) {
                z10 = Boolean.parseBoolean(AFLogger);
                f5327w = (afErrorLog + 85) % 128;
            } else {
                z10 = false;
            }
            if (aFh1pSDK.d() && z10) {
                int i11 = f5327w + 109;
                afErrorLog = i11 % 128;
                if (i11 % 2 != 0) {
                    if (AFf1fSDK.d(aFh1pSDK, this.registerClient)) {
                        AFf1fSDK.registerClient(aFh1pSDK, bArr);
                        AFLogger.INSTANCE.d(LogTag.SECURITY_SDK, "the module works properly");
                        return;
                    }
                    return;
                }
                AFf1fSDK.d(aFh1pSDK, this.registerClient);
                throw null;
            }
            return;
        }
        this.registerClient.AFLogger("com.appsflyer.security.enable");
        throw null;
    }

    private <T> AFd1pSDK<T> AFLogger(AFd1oSDK aFd1oSDK, AFd1iSDK<T> aFd1iSDK) {
        return (AFd1pSDK) d(new Object[]{this, aFd1oSDK, aFd1iSDK}, -1128782579, 1128782579, System.identityHashCode(this));
    }
}
