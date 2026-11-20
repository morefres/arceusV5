package com.withpersona.sdk2.inquiry.tracking.network;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;", "", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "trackingEventsServiceApi", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)V", "", "sessionToken", "Lgt/n;", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "getPublicKey-gIAlu-s$tracking_events_release", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "getPublicKey", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "request", "", "sendEvents-0E7RQCE$tracking_events_release", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lmt/b;)Ljava/lang/Object;", "sendEvents", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrackingEventsService {

    @NotNull
    private final TrackingEventsServiceApi trackingEventsServiceApi;

    public TrackingEventsService(@NotNull TrackingEventsServiceApi trackingEventsServiceApi) {
        trackingEventsServiceApi.getClass();
        this.trackingEventsServiceApi = trackingEventsServiceApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x004d, B:14:0x0055, B:16:0x005d, B:19:0x0062, B:21:0x0074, B:26:0x003c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x004d, B:14:0x0055, B:16:0x005d, B:19:0x0062, B:21:0x0074, B:26:0x003c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: getPublicKey-gIAlu-s$tracking_events_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m71getPublicKeygIAlus$tracking_events_release(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$getPublicKey$1
            if (r0 == 0) goto L13
            r0 = r7
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$getPublicKey$1 r0 = (com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$getPublicKey$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$getPublicKey$1 r0 = new com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$getPublicKey$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            java.lang.String r3 = "Failed to get public key: "
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r7)     // Catch: java.lang.Exception -> L2f
            goto L4d
        L2f:
            r6 = move-exception
            goto L97
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            gt.o.b(r7)
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceApi r7 = r5.trackingEventsServiceApi     // Catch: java.lang.Exception -> L2f
            java.lang.Object r2 = ot.l.a(r6)     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r2     // Catch: java.lang.Exception -> L2f
            r0.label = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r7 = r7.getPublicKey(r6, r0)     // Catch: java.lang.Exception -> L2f
            if (r7 != r1) goto L4d
            return r1
        L4d:
            iv.x r7 = (iv.x) r7     // Catch: java.lang.Exception -> L2f
            boolean r6 = r7.g()     // Catch: java.lang.Exception -> L2f
            if (r6 == 0) goto L74
            java.lang.Object r6 = r7.a()     // Catch: java.lang.Exception -> L2f
            com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse r6 = (com.withpersona.sdk2.inquiry.tracking.network.PublicKeyResponse) r6     // Catch: java.lang.Exception -> L2f
            if (r6 == 0) goto L62
            java.lang.Object r6 = gt.n.b(r6)     // Catch: java.lang.Exception -> L2f
            return r6
        L62:
            gt.n$a r6 = gt.n.INSTANCE     // Catch: java.lang.Exception -> L2f
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = "Empty response body from /public-key"
            r6.<init>(r7)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r6 = gt.o.a(r6)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r6 = gt.n.b(r6)     // Catch: java.lang.Exception -> L2f
            return r6
        L74:
            gt.n$a r6 = gt.n.INSTANCE     // Catch: java.lang.Exception -> L2f
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L2f
            int r7 = r7.b()     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r0.<init>()     // Catch: java.lang.Exception -> L2f
            r0.append(r3)     // Catch: java.lang.Exception -> L2f
            r0.append(r7)     // Catch: java.lang.Exception -> L2f
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Exception -> L2f
            r6.<init>(r7)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r6 = gt.o.a(r6)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r6 = gt.n.b(r6)     // Catch: java.lang.Exception -> L2f
            return r6
        L97:
            gt.n$a r7 = gt.n.INSTANCE
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r6 = gt.a.b(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            java.lang.Object r6 = gt.o.a(r7)
            java.lang.Object r6 = gt.n.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService.m71getPublicKeygIAlus$tracking_events_release(java.lang.String, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:11:0x002f, B:12:0x0057, B:14:0x005f, B:17:0x0068, B:22:0x0040), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:11:0x002f, B:12:0x0057, B:14:0x005f, B:17:0x0068, B:22:0x0040), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: sendEvents-0E7RQCE$tracking_events_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m72sendEvents0E7RQCE$tracking_events_release(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull com.withpersona.sdk2.inquiry.tracking.network.EncryptedTrackingEventsRequest r7, @org.jetbrains.annotations.NotNull mt.b<? super gt.n<kotlin.Unit>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$sendEvents$1
            if (r0 == 0) goto L13
            r0 = r8
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$sendEvents$1 r0 = (com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$sendEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$sendEvents$1 r0 = new com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService$sendEvents$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.label
            java.lang.String r3 = "Failed to send events: "
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 != r4) goto L35
            java.lang.Object r6 = r0.L$1
            com.withpersona.sdk2.inquiry.tracking.network.EncryptedTrackingEventsRequest r6 = (com.withpersona.sdk2.inquiry.tracking.network.EncryptedTrackingEventsRequest) r6
            java.lang.Object r6 = r0.L$0
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r8)     // Catch: java.lang.Exception -> L33
            goto L57
        L33:
            r6 = move-exception
            goto L8b
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            gt.o.b(r8)
            com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceApi r8 = r5.trackingEventsServiceApi     // Catch: java.lang.Exception -> L33
            java.lang.Object r2 = ot.l.a(r6)     // Catch: java.lang.Exception -> L33
            r0.L$0 = r2     // Catch: java.lang.Exception -> L33
            java.lang.Object r2 = ot.l.a(r7)     // Catch: java.lang.Exception -> L33
            r0.L$1 = r2     // Catch: java.lang.Exception -> L33
            r0.label = r4     // Catch: java.lang.Exception -> L33
            java.lang.Object r8 = r8.sendEvents(r6, r7, r0)     // Catch: java.lang.Exception -> L33
            if (r8 != r1) goto L57
            return r1
        L57:
            iv.x r8 = (iv.x) r8     // Catch: java.lang.Exception -> L33
            boolean r6 = r8.g()     // Catch: java.lang.Exception -> L33
            if (r6 == 0) goto L68
            gt.n$a r6 = gt.n.INSTANCE     // Catch: java.lang.Exception -> L33
            kotlin.Unit r6 = kotlin.Unit.f22894a     // Catch: java.lang.Exception -> L33
            java.lang.Object r6 = gt.n.b(r6)     // Catch: java.lang.Exception -> L33
            return r6
        L68:
            gt.n$a r6 = gt.n.INSTANCE     // Catch: java.lang.Exception -> L33
            java.lang.Exception r6 = new java.lang.Exception     // Catch: java.lang.Exception -> L33
            int r7 = r8.b()     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r8.<init>()     // Catch: java.lang.Exception -> L33
            r8.append(r3)     // Catch: java.lang.Exception -> L33
            r8.append(r7)     // Catch: java.lang.Exception -> L33
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Exception -> L33
            r6.<init>(r7)     // Catch: java.lang.Exception -> L33
            java.lang.Object r6 = gt.o.a(r6)     // Catch: java.lang.Exception -> L33
            java.lang.Object r6 = gt.n.b(r6)     // Catch: java.lang.Exception -> L33
            return r6
        L8b:
            gt.n$a r7 = gt.n.INSTANCE
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r6 = gt.a.b(r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            java.lang.Object r6 = gt.o.a(r7)
            java.lang.Object r6 = gt.n.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService.m72sendEvents0E7RQCE$tracking_events_release(java.lang.String, com.withpersona.sdk2.inquiry.tracking.network.EncryptedTrackingEventsRequest, mt.b):java.lang.Object");
    }
}
