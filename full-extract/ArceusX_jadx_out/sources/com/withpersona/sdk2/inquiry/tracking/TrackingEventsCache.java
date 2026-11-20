package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.app.NotificationCompat;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tu.g;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "", "<init>", "()V", "", "loggerId", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", NotificationCompat.CATEGORY_EVENT, "", "add", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Lmt/b;)Ljava/lang/Object;", "", "currentCount", "(Lmt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;", "beginFlush", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "flushToken", "", "isSuccess", "onFlushFinished", "(Ljava/lang/String;ZLmt/b;)Ljava/lang/Object;", "Ltu/a;", "mutex", "Ltu/a;", "", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;", "events", "Ljava/util/List;", "Companion", "TrackingEventData", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingEventsCache {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile TrackingEventsCache INSTANCE;
    public static final int NO_FLUSH_TOKEN = 0;

    @NotNull
    private final tu.a mutex = g.b(false, 1, null);

    @NotNull
    private final List<TrackingEventData> events = new ArrayList();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;", "", "<init>", "()V", "NO_FLUSH_TOKEN", "", "INSTANCE", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "setInstance", "", "cache", "getInstance", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TrackingEventsCache getInstance() {
            return TrackingEventsCache.INSTANCE;
        }

        public final void setInstance(@NotNull TrackingEventsCache cache) {
            cache.getClass();
            TrackingEventsCache.INSTANCE = cache;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onFlushFinished$lambda$7$lambda$5(String str, TrackingEventData trackingEventData) {
        trackingEventData.getClass();
        return Intrinsics.c(trackingEventData.getFlushToken(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object add(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent r13, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$add$1
            if (r0 == 0) goto L13
            r0 = r14
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$add$1 r0 = (com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$add$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$add$1 r0 = new com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$add$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r12 = r0.L$2
            tu.a r12 = (tu.a) r12
            java.lang.Object r13 = r0.L$1
            com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent r13 = (com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent) r13
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            gt.o.b(r14)
            r6 = r0
        L36:
            r7 = r13
            goto L5a
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            gt.o.b(r14)
            tu.a r14 = r11.mutex
            r0.L$0 = r12
            r0.L$1 = r13
            r0.L$2 = r14
            r2 = 0
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r0 = r14.c(r4, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            r6 = r12
            r12 = r14
            goto L36
        L5a:
            java.util.List<com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData> r13 = r11.events     // Catch: java.lang.Throwable -> L6d
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData r5 = new com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData     // Catch: java.lang.Throwable -> L6d
            r9 = 4
            r10 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6d
            r13.add(r5)     // Catch: java.lang.Throwable -> L6d
            r12.f(r4)
            kotlin.Unit r12 = kotlin.Unit.f22894a
            return r12
        L6d:
            r0 = move-exception
            r13 = r0
            r12.f(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.add(java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:11:0x0051, B:12:0x0066, B:14:0x006c, B:17:0x007c, B:20:0x0082, B:26:0x008f), top: B:10:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object beginFlush(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull mt.b<? super com.withpersona.sdk2.inquiry.tracking.TrackingEventFlushSession> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$beginFlush$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$beginFlush$1 r0 = (com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$beginFlush$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$beginFlush$1 r0 = new com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$beginFlush$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$1
            tu.a r7 = (tu.a) r7
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            gt.o.b(r8)
            goto L51
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            gt.o.b(r8)
            tu.a r8 = r6.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r2 = 0
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r0 = r8.c(r4, r0)
            if (r0 != r1) goto L4f
            return r1
        L4f:
            r0 = r7
            r7 = r8
        L51:
            java.util.UUID r8 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8d
            r8.getClass()     // Catch: java.lang.Throwable -> L8d
            java.util.List r1 = kotlin.collections.o.c()     // Catch: java.lang.Throwable -> L8d
            java.util.List<com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData> r2 = r6.events     // Catch: java.lang.Throwable -> L8d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8d
        L66:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8d
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData r3 = (com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.TrackingEventData) r3     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = r3.getLoggerId()     // Catch: java.lang.Throwable -> L8d
            boolean r5 = kotlin.jvm.internal.Intrinsics.c(r5, r0)     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L66
            boolean r5 = r3.isFlushing()     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L66
            r3.setFlushToken(r8)     // Catch: java.lang.Throwable -> L8d
            com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent r3 = r3.getEvent()     // Catch: java.lang.Throwable -> L8d
            r1.add(r3)     // Catch: java.lang.Throwable -> L8d
            goto L66
        L8d:
            r8 = move-exception
            goto L9c
        L8f:
            java.util.List r0 = kotlin.collections.o.a(r1)     // Catch: java.lang.Throwable -> L8d
            com.withpersona.sdk2.inquiry.tracking.TrackingEventFlushSession r1 = new com.withpersona.sdk2.inquiry.tracking.TrackingEventFlushSession     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r0, r8)     // Catch: java.lang.Throwable -> L8d
            r7.f(r4)
            return r1
        L9c:
            r7.f(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.beginFlush(java.lang.String, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:11:0x004a, B:13:0x0050, B:16:0x0077, B:21:0x0059, B:22:0x005d, B:24:0x0063, B:27:0x006f, B:30:0x0073), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object currentCount(@org.jetbrains.annotations.NotNull mt.b<? super java.lang.Integer> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$currentCount$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$currentCount$1 r0 = (com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$currentCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$currentCount$1 r0 = new com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$currentCount$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.L$0
            tu.a r0 = (tu.a) r0
            gt.o.b(r7)
            goto L4a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            gt.o.b(r7)
            tu.a r7 = r6.mutex
            r0.L$0 = r7
            r0.I$0 = r3
            r0.label = r4
            java.lang.Object r0 = r7.c(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r7
        L4a:
            java.util.List<com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData> r7 = r6.events     // Catch: java.lang.Throwable -> L57
            boolean r1 = r7 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L59
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L59
            goto L77
        L57:
            r7 = move-exception
            goto L7f
        L59:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L57
        L5d:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r1 == 0) goto L77
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L57
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData r1 = (com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.TrackingEventData) r1     // Catch: java.lang.Throwable -> L57
            boolean r1 = r1.isFlushing()     // Catch: java.lang.Throwable -> L57
            if (r1 != 0) goto L5d
            int r3 = r3 + 1
            if (r3 >= 0) goto L5d
            kotlin.collections.p.s()     // Catch: java.lang.Throwable -> L57
            goto L5d
        L77:
            java.lang.Integer r7 = ot.b.c(r3)     // Catch: java.lang.Throwable -> L57
            r0.f(r5)
            return r7
        L7f:
            r0.f(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.currentCount(mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #0 {all -> 0x0066, blocks: (B:13:0x0059, B:17:0x0068, B:18:0x006c, B:20:0x0072, B:23:0x0082, B:28:0x0086), top: B:11:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:13:0x0059, B:17:0x0068, B:18:0x006c, B:20:0x0072, B:23:0x0082, B:28:0x0086), top: B:11:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onFlushFinished(@org.jetbrains.annotations.NotNull final java.lang.String r6, boolean r7, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$onFlushFinished$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$onFlushFinished$1 r0 = (com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$onFlushFinished$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$onFlushFinished$1 r0 = new com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$onFlushFinished$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r7 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            tu.a r6 = (tu.a) r6
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            gt.o.b(r8)
            r8 = r6
            r6 = r0
            goto L55
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            gt.o.b(r8)
            tu.a r8 = r5.mutex
            r0.L$0 = r6
            r0.L$1 = r8
            r0.Z$0 = r7
            r2 = 0
            r0.I$0 = r2
            r0.label = r3
            java.lang.Object r0 = r8.c(r4, r0)
            if (r0 != r1) goto L55
            return r1
        L55:
            java.util.List<com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData> r0 = r5.events
            if (r7 == 0) goto L68
            com.withpersona.sdk2.inquiry.tracking.b r7 = new com.withpersona.sdk2.inquiry.tracking.b     // Catch: java.lang.Throwable -> L66
            r7.<init>()     // Catch: java.lang.Throwable -> L66
            boolean r6 = kotlin.collections.u.F(r0, r7)     // Catch: java.lang.Throwable -> L66
            ot.b.a(r6)     // Catch: java.lang.Throwable -> L66
            goto L88
        L66:
            r6 = move-exception
            goto L8e
        L68:
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L66
        L6c:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L86
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L66
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$TrackingEventData r0 = (com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.TrackingEventData) r0     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r0.getFlushToken()     // Catch: java.lang.Throwable -> L66
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r6)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L6c
            r0.setFlushToken(r4)     // Catch: java.lang.Throwable -> L66
            goto L6c
        L86:
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L66
        L88:
            r8.f(r4)
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L8e:
            r8.f(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.onFlushFinished(java.lang.String, boolean, mt.b):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;", "", "loggerId", "", NotificationCompat.CATEGORY_EVENT, "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "flushToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Ljava/lang/String;)V", "getLoggerId", "()Ljava/lang/String;", "getEvent", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "getFlushToken", "setFlushToken", "(Ljava/lang/String;)V", "isFlushing", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackingEventData {

        @NotNull
        private final TrackingEvent event;

        @Nullable
        private String flushToken;

        @NotNull
        private final String loggerId;

        public TrackingEventData(@NotNull String str, @NotNull TrackingEvent trackingEvent, @Nullable String str2) {
            str.getClass();
            trackingEvent.getClass();
            this.loggerId = str;
            this.event = trackingEvent;
            this.flushToken = str2;
        }

        public static /* synthetic */ TrackingEventData copy$default(TrackingEventData trackingEventData, String str, TrackingEvent trackingEvent, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = trackingEventData.loggerId;
            }
            if ((i10 & 2) != 0) {
                trackingEvent = trackingEventData.event;
            }
            if ((i10 & 4) != 0) {
                str2 = trackingEventData.flushToken;
            }
            return trackingEventData.copy(str, trackingEvent, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLoggerId() {
            return this.loggerId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TrackingEvent getEvent() {
            return this.event;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getFlushToken() {
            return this.flushToken;
        }

        @NotNull
        public final TrackingEventData copy(@NotNull String loggerId, @NotNull TrackingEvent event, @Nullable String flushToken) {
            loggerId.getClass();
            event.getClass();
            return new TrackingEventData(loggerId, event, flushToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingEventData)) {
                return false;
            }
            TrackingEventData trackingEventData = (TrackingEventData) other;
            return Intrinsics.c(this.loggerId, trackingEventData.loggerId) && Intrinsics.c(this.event, trackingEventData.event) && Intrinsics.c(this.flushToken, trackingEventData.flushToken);
        }

        @NotNull
        public final TrackingEvent getEvent() {
            return this.event;
        }

        @Nullable
        public final String getFlushToken() {
            return this.flushToken;
        }

        @NotNull
        public final String getLoggerId() {
            return this.loggerId;
        }

        public int hashCode() {
            int hashCode = (this.event.hashCode() + (this.loggerId.hashCode() * 31)) * 31;
            String str = this.flushToken;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isFlushing() {
            return this.flushToken != null;
        }

        public final void setFlushToken(@Nullable String str) {
            this.flushToken = str;
        }

        @NotNull
        public String toString() {
            return "TrackingEventData(loggerId=" + this.loggerId + ", event=" + this.event + ", flushToken=" + this.flushToken + ")";
        }

        public /* synthetic */ TrackingEventData(String str, TrackingEvent trackingEvent, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, trackingEvent, (i10 & 4) != 0 ? null : str2);
        }
    }
}
