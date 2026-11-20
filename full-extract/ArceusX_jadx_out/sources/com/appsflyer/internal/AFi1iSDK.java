package com.appsflyer.internal;

import com.appsflyer.sdk_base.referrer.Referrer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFi1iSDK extends Referrer {

    @Nullable
    private String AFKeystoreWrapper;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFc1iSDK f5459d;

    @NotNull
    private final AFi1jSDK registerClient;

    @NotNull
    private final Runnable unregisterClient;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[AFi1jSDK.values().length];
            try {
                iArr[AFi1jSDK.AFLogger.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFi1jSDK.AFKeystoreWrapper.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFi1jSDK.f5460d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFKeystoreWrapper = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AFi1iSDK(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFc1iSDK r3, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFi1jSDK r4, @org.jetbrains.annotations.NotNull com.appsflyer.sdk_base.referrer.ReferrerProp r5, @org.jetbrains.annotations.NotNull java.lang.Runnable r6) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int[] r0 = com.appsflyer.internal.AFi1fSDK.AFa1tSDK.AFKeystoreWrapper
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L28
            r1 = 3
            if (r0 != r1) goto L22
            java.lang.String r0 = "facebook_lite"
            goto L2d
        L22:
            gt.l r3 = new gt.l
            r3.<init>()
            throw r3
        L28:
            java.lang.String r0 = "instagram"
            goto L2d
        L2b:
            java.lang.String r0 = "facebook"
        L2d:
            java.lang.String r1 = "app"
            r2.<init>(r1, r0, r5)
            r2.f5459d = r3
            r2.registerClient = r4
            r2.unregisterClient = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.<init>(com.appsflyer.internal.AFc1iSDK, com.appsflyer.internal.AFi1jSDK, com.appsflyer.sdk_base.referrer.ReferrerProp, java.lang.Runnable):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0237, code lost:
    
        if (r19 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0222, code lost:
    
        r19.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0220, code lost:
    
        if (r19 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0267, code lost:
    
        if (r19 == null) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0101 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #2 {all -> 0x005a, blocks: (B:3:0x0014, B:7:0x0028, B:9:0x0034, B:15:0x0101, B:79:0x0062, B:81:0x0074, B:82:0x0079, B:83:0x007a, B:85:0x0086, B:86:0x00ab, B:87:0x00bb, B:89:0x00c7, B:90:0x00ec), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.appsflyer.internal.AFi1iSDK r25, android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.d(com.appsflyer.internal.AFi1iSDK, android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        com.appsflyer.sdk_base.logger.AFLoggerBase.d$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.sdk_base.logger.LogTag.META_REFERRER, "Referrer collection disallowed by missing content providers.", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d0, code lost:
    
        getProp().getBackgroundExecutor().execute(new com.appsflyer.internal.e1(r10, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        if (r11.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null) goto L50;
     */
    @Override // com.appsflyer.sdk_base.referrer.Referrer
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(@org.jetbrains.annotations.NotNull final android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1iSDK.start(android.content.Context):void");
    }
}
