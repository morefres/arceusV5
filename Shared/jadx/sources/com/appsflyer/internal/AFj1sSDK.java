package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class AFj1sSDK {

    @NotNull
    private final Intent AFKeystoreWrapper;

    public AFj1sSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AFKeystoreWrapper = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AFKeystoreWrapper(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getStringExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Parcelable U_(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.getParcelableExtra(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent V_(AFj1sSDK aFj1sSDK, String str, long j10) {
        return aFj1sSDK.AFKeystoreWrapper.putExtra(str, j10);
    }

    public final boolean AFLogger(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFLogger(new Function0() { // from class: com.appsflyer.internal.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean registerClient;
                registerClient = AFj1sSDK.registerClient(AFj1sSDK.this, str);
                return Boolean.valueOf(registerClient);
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public final <T extends Parcelable> T S_(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AFLogger(new Function0() { // from class: com.appsflyer.internal.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Parcelable U_;
                U_ = AFj1sSDK.U_(AFj1sSDK.this, str);
                return U_;
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final Intent T_(@NotNull final String str, final long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFLogger(new Function0() { // from class: com.appsflyer.internal.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Intent V_;
                V_ = AFj1sSDK.V_(AFj1sSDK.this, str, j10);
                return V_;
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    @Nullable
    public final String registerClient(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFLogger(new Function0() { // from class: com.appsflyer.internal.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String AFKeystoreWrapper;
                AFKeystoreWrapper = AFj1sSDK.AFKeystoreWrapper(AFj1sSDK.this, str);
                return AFKeystoreWrapper;
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerClient(AFj1sSDK aFj1sSDK, String str) {
        return aFj1sSDK.AFKeystoreWrapper.hasExtra(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #3 {, blocks: (B:5:0x001b, B:8:0x0081, B:14:0x0088, B:30:0x0077, B:36:0x0011, B:4:0x0005), top: B:3:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final <T> T AFLogger(kotlin.jvm.functions.Function0<? extends T> r22, java.lang.String r23, T r24, boolean r25) {
        /*
            r21 = this;
            r1 = r21
            android.content.Intent r2 = r1.AFKeystoreWrapper
            monitor-enter(r2)
            gt.n$a r0 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r22.invoke()     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = gt.n.b(r0)     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r0 = move-exception
            gt.n$a r3 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = gt.o.a(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = gt.n.b(r0)     // Catch: java.lang.Throwable -> L9f
        L1b:
            java.lang.Class<java.util.ConcurrentModificationException> r3 = java.util.ConcurrentModificationException.class
            gu.c r3 = kotlin.jvm.internal.d0.b(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.Class<java.lang.ArrayIndexOutOfBoundsException> r4 = java.lang.ArrayIndexOutOfBoundsException.class
            gu.c r4 = kotlin.jvm.internal.d0.b(r4)     // Catch: java.lang.Throwable -> L9f
            r5 = 2
            gu.c[] r5 = new gu.c[r5]     // Catch: java.lang.Throwable -> L9f
            r6 = 0
            r5[r6] = r3     // Catch: java.lang.Throwable -> L9f
            r3 = 1
            r5[r3] = r4     // Catch: java.lang.Throwable -> L9f
            java.lang.Throwable r10 = gt.n.e(r0)     // Catch: java.lang.Throwable -> L9f
            if (r10 != 0) goto L39
            r4 = r24
            goto L81
        L39:
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Throwable -> L74
            gu.c r0 = kotlin.jvm.internal.d0.b(r0)     // Catch: java.lang.Throwable -> L74
            boolean r0 = kotlin.collections.m.G(r5, r0)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L71
            if (r25 == 0) goto L56
            r3 = r22
            r13 = r23
            r4 = r24
            java.lang.Object r0 = r1.AFLogger(r3, r13, r4, r6)     // Catch: java.lang.Throwable -> L54
            goto L6c
        L54:
            r0 = move-exception
            goto L77
        L56:
            r13 = r23
            r4 = r24
            com.appsflyer.AFLogger r7 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L54
            com.appsflyer.sdk_base.logger.LogTag r8 = com.appsflyer.sdk_base.logger.LogTag.GENERAL     // Catch: java.lang.Throwable -> L54
            r15 = 72
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r23
            com.appsflyer.sdk_base.logger.AFLoggerBase.e$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L54
            r0 = r4
        L6c:
            java.lang.Object r0 = gt.n.b(r0)     // Catch: java.lang.Throwable -> L54
            goto L81
        L71:
            r4 = r24
            throw r10     // Catch: java.lang.Throwable -> L54
        L74:
            r0 = move-exception
            r4 = r24
        L77:
            gt.n$a r3 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = gt.o.a(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = gt.n.b(r0)     // Catch: java.lang.Throwable -> L9f
        L81:
            java.lang.Throwable r14 = gt.n.e(r0)     // Catch: java.lang.Throwable -> L9f
            if (r14 != 0) goto L88
            goto L9d
        L88:
            com.appsflyer.AFLogger r11 = com.appsflyer.AFLogger.INSTANCE     // Catch: java.lang.Throwable -> L9f
            com.appsflyer.sdk_base.logger.LogTag r12 = com.appsflyer.sdk_base.logger.LogTag.GENERAL     // Catch: java.lang.Throwable -> L9f
            r19 = 72
            r20 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r13 = r23
            com.appsflyer.sdk_base.logger.AFLoggerBase.e$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L9f
            r0 = r4
        L9d:
            monitor-exit(r2)
            return r0
        L9f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1sSDK.AFLogger(kotlin.jvm.functions.Function0, java.lang.String, java.lang.Object, boolean):java.lang.Object");
    }
}
