package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import iv.x;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class NetworkUtilsKt {
    private static final int NUM_RETRIES = 3;

    @NotNull
    public static final String SUBSYSTEM = "com.withpersona.sdk2.inquiry.network";

    @Nullable
    public static final <T> Object enqueueRetriableRequestWithRetry(@NotNull Function1<? super mt.b<? super x<T>>, ? extends Object> function1, @NotNull mt.b<? super NetworkCallResult<T>> bVar) {
        return enqueueWithRetryWhen(function1, new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean isRecoverable;
                isRecoverable = ((InternalErrorInfo.NetworkErrorInfo) obj).isRecoverable();
                return Boolean.valueOf(isRecoverable);
            }
        }, bVar);
    }

    @Nullable
    public static final <T> Object enqueueVerificationRequestWithRetry(@NotNull Function1<? super mt.b<? super x<T>>, ? extends Object> function1, @NotNull mt.b<? super NetworkCallResult<T>> bVar) {
        return enqueueWithRetryWhen(function1, new Function1() { // from class: com.withpersona.sdk2.inquiry.network.core.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean enqueueVerificationRequestWithRetry$lambda$3;
                enqueueVerificationRequestWithRetry$lambda$3 = NetworkUtilsKt.enqueueVerificationRequestWithRetry$lambda$3((InternalErrorInfo.NetworkErrorInfo) obj);
                return Boolean.valueOf(enqueueVerificationRequestWithRetry$lambda$3);
            }
        }, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enqueueVerificationRequestWithRetry$lambda$3(InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        int code = networkErrorInfo.getCode();
        return (code == 0 || code == 409 || code == 413 || code == 422) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0066 -> B:10:0x0069). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object enqueueWithRetryWhen(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mt.b<? super iv.x<T>>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo, java.lang.Boolean> r7, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.network.core.NetworkCallResult<T>> r8) {
        /*
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = (com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1 r0 = new com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt$enqueueWithRetryWhen$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$2
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r7 = (com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo) r7
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            gt.o.b(r8)
            r5 = r0
            r0 = r7
            r7 = r2
            r2 = r5
            goto L69
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            gt.o.b(r8)
            r8 = 0
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r0
        L4c:
            r0 = r8
            r8 = r5
            r4 = 3
            if (r6 >= r4) goto L90
            r2.L$0 = r7
            r2.L$1 = r8
            java.lang.Object r0 = ot.l.a(r0)
            r2.L$2 = r0
            r2.I$0 = r6
            r2.label = r3
            java.lang.Object r0 = r7.invoke(r2)
            if (r0 != r1) goto L66
            return r1
        L66:
            r5 = r0
            r0 = r8
            r8 = r5
        L69:
            iv.x r8 = (iv.x) r8
            boolean r4 = r8.g()
            if (r4 == 0) goto L7b
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success r6 = new com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Success
            java.lang.Object r7 = r8.a()
            r6.<init>(r7)
            return r6
        L7b:
            com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r8 = toErrorInfo(r8)
            java.lang.Object r4 = r0.invoke(r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L8d
            r0 = r8
            goto L90
        L8d:
            int r6 = r6 + r3
            r5 = r0
            goto L4c
        L90:
            com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure r6 = new com.withpersona.sdk2.inquiry.network.core.NetworkCallResult$Failure
            if (r0 == 0) goto L98
            r6.<init>(r0)
            return r6
        L98:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.enqueueWithRetryWhen(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    @NotNull
    public static final <T> NetworkCallResult<T> onFailure(@NotNull NetworkCallResult<T> networkCallResult, @NotNull Function1<? super InternalErrorInfo.NetworkErrorInfo, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Failure) {
            function1.invoke(((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo());
        }
        return networkCallResult;
    }

    @NotNull
    public static final <T> NetworkCallResult<T> onSuccess(@NotNull NetworkCallResult<T> networkCallResult, @NotNull Function1<? super T, Unit> function1) {
        if (networkCallResult instanceof NetworkCallResult.Success) {
            function1.invoke((Object) ((NetworkCallResult.Success) networkCallResult).getResponse());
        }
        return networkCallResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014b  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo.NetworkErrorInfo toErrorInfo(@org.jetbrains.annotations.NotNull iv.x<?> r8) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(iv.x):com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo");
    }

    @NotNull
    public static final InternalErrorInfo.NetworkErrorInfo toSocketTimeoutErrorInfo(@NotNull SocketTimeoutException socketTimeoutException) {
        return new InternalErrorInfo.NetworkErrorInfo(0, socketTimeoutException.getLocalizedMessage(), true, null, 8, null);
    }
}
