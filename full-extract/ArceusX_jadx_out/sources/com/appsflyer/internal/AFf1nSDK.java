package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class AFf1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 0;
    private static byte[] AFLogger = null;

    /* renamed from: d, reason: collision with root package name */
    private static int f5390d = 0;
    private static int force = 0;
    private static int registerClient = 0;
    private static short[] unregisterClient = null;

    /* renamed from: v, reason: collision with root package name */
    private static int f5391v = 1;

    static {
        registerClient();
        Process.myTid();
        SystemClock.uptimeMillis();
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getScrollBarFadeDuration();
        int i10 = force + 95;
        f5391v = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @NonNull
    private static AFi1uSDK AFLogger(@NonNull AFh1aSDK aFh1aSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFi1uSDK(aFh1aSDK.unregisterClient == AFh1iSDK.DEFAULT, AFh1dSDK.NA);
        }
        String str4 = "";
        Object[] objArr = new Object[1];
        a((-75) - ExpandableListView.getPackedPositionType(0L), (short) TextUtils.getTrimmedLength(""), (byte) ((ViewConfiguration.getTouchSlop() >> 8) - 36), 2002986226 - TextUtils.indexOf((CharSequence) "", '0', 0), (-426765741) - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFh1aSDK.unregisterClient == AFh1iSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = intern;
        }
        boolean equals = d(new StringBuilder(str3).reverse().toString(), aFh1aSDK.f5426d, "android", "v1", str4).equals(str);
        return new AFi1uSDK(equals, equals ? AFh1dSDK.SUCCESS : AFh1dSDK.FAILURE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
    
        if (r2 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r12, short r13, byte r14, int r15, int r16, java.lang.Object[] r17) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1nSDK.a(int, short, byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        r8 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r7.length() < 14) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        return r7.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r8 = com.appsflyer.internal.AFf1nSDK.force + 33;
        com.appsflyer.internal.AFf1nSDK.f5391v = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if ((r8 % 2) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String d(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r0 = com.appsflyer.internal.AFf1nSDK.f5391v
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1nSDK.force = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 12
            java.lang.String r3 = "\u2063"
            java.lang.String r4 = ""
            r5 = 0
            if (r0 == 0) goto L32
            r0 = 5
            java.lang.String[] r6 = new java.lang.String[r0]
            r6[r5] = r8
            r6[r5] = r9
            r6[r0] = r10
            r8 = 4
            r6[r8] = r11
            r6[r1] = r4
            java.lang.String r8 = android.text.TextUtils.join(r3, r6)
            java.lang.String r7 = com.appsflyer.internal.AFj1nSDK.d(r8, r7)
            int r8 = r7.length()
            r9 = 14
            if (r8 >= r9) goto L53
            goto L44
        L32:
            java.lang.String[] r8 = new java.lang.String[]{r8, r9, r10, r11, r4}
            java.lang.String r8 = android.text.TextUtils.join(r3, r8)
            java.lang.String r7 = com.appsflyer.internal.AFj1nSDK.d(r8, r7)
            int r8 = r7.length()
            if (r8 >= r2) goto L53
        L44:
            int r8 = com.appsflyer.internal.AFf1nSDK.force
            int r8 = r8 + 33
            int r9 = r8 % 128
            com.appsflyer.internal.AFf1nSDK.f5391v = r9
            int r8 = r8 % r1
            if (r8 != 0) goto L52
            r8 = 56
            int r8 = r8 / r5
        L52:
            return r7
        L53:
            java.lang.String r7 = r7.substring(r5, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1nSDK.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void registerClient() {
        f5390d = -1732147492;
        registerClient = -2119275717;
        AFKeystoreWrapper = 154316849;
        AFLogger = new byte[]{-121, -94, 82, 82, 82, -82, 92, -89, -85, 82, 86, -83, -83, -87, 82, 80, -82, -84, -81, 87, 91, -95, 93, -94, 82, -81, 89, -90, -81, 82, 82, -83, -88, 81, -81, 80, 95, -67, -87, 81, 81, -87, 86, -86, 80, -84, 83, -87, -83, 83, -83, -81, 84, -81, 83, -85, 80, 82, -84, -82, -83, 81, -87, -83};
    }

    @NonNull
    public final AFi1uSDK AFKeystoreWrapper(@NonNull AFh1aSDK aFh1aSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (aFh1aSDK != null && str2 != null && str3 != null) {
            force = (f5391v + 73) % 128;
            return AFLogger(aFh1aSDK, str, str2, str3);
        }
        AFi1uSDK aFi1uSDK = new AFi1uSDK(false, AFh1dSDK.INTERNAL_ERROR);
        force = (f5391v + 33) % 128;
        return aFi1uSDK;
    }
}
