package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ot.f;
import ot.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
@f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$logEvent$1", f = "RealTrackingEventsLogger.kt", l = {549, 551, 553, 555}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RealTrackingEventsLogger$logEvent$1 extends m implements Function2<p0, mt.b<? super Unit>, Object> {
    final /* synthetic */ TrackingEvent $event;
    final /* synthetic */ boolean $force;
    int I$0;
    int label;
    final /* synthetic */ RealTrackingEventsLogger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTrackingEventsLogger$logEvent$1(RealTrackingEventsLogger realTrackingEventsLogger, TrackingEvent trackingEvent, boolean z10, mt.b<? super RealTrackingEventsLogger$logEvent$1> bVar) {
        super(2, bVar);
        this.this$0 = realTrackingEventsLogger;
        this.$event = trackingEvent;
        this.$force = z10;
    }

    @Override // ot.a
    public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
        return new RealTrackingEventsLogger$logEvent$1(this.this$0, this.$event, this.$force, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        if (r8 == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[Catch: Exception -> 0x007e, TRY_LEAVE, TryCatch #0 {Exception -> 0x007e, blocks: (B:11:0x001d, B:12:0x0065, B:15:0x0071, B:20:0x0021, B:21:0x0025, B:22:0x0045, B:24:0x0049, B:27:0x0054, B:29:0x005c, B:34:0x002c, B:36:0x0034), top: B:2:0x000a }] */
    @Override // ot.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = nt.c.e()
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            gt.o.b(r8)     // Catch: java.lang.Exception -> L7e
            goto L65
        L21:
            gt.o.b(r8)     // Catch: java.lang.Exception -> L7e
            goto L7e
        L25:
            gt.o.b(r8)     // Catch: java.lang.Exception -> L7e
            goto L45
        L29:
            gt.o.b(r8)
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$Companion r8 = com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.INSTANCE     // Catch: java.lang.Exception -> L7e
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache r8 = r8.getInstance()     // Catch: java.lang.Exception -> L7e
            if (r8 == 0) goto L45
            com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger r1 = r7.this$0     // Catch: java.lang.Exception -> L7e
            java.lang.String r1 = com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.access$getId$p(r1)     // Catch: java.lang.Exception -> L7e
            com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent r6 = r7.$event     // Catch: java.lang.Exception -> L7e
            r7.label = r5     // Catch: java.lang.Exception -> L7e
            java.lang.Object r8 = r8.add(r1, r6, r7)     // Catch: java.lang.Exception -> L7e
            if (r8 != r0) goto L45
            goto L7d
        L45:
            boolean r8 = r7.$force     // Catch: java.lang.Exception -> L7e
            if (r8 == 0) goto L54
            com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger r8 = r7.this$0     // Catch: java.lang.Exception -> L7e
            r7.label = r4     // Catch: java.lang.Exception -> L7e
            java.lang.Object r8 = com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.access$flush(r8, r7)     // Catch: java.lang.Exception -> L7e
            if (r8 != r0) goto L7e
            goto L7d
        L54:
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$Companion r8 = com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.INSTANCE     // Catch: java.lang.Exception -> L7e
            com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache r8 = r8.getInstance()     // Catch: java.lang.Exception -> L7e
            if (r8 == 0) goto L6c
            r7.label = r3     // Catch: java.lang.Exception -> L7e
            java.lang.Object r8 = r8.currentCount(r7)     // Catch: java.lang.Exception -> L7e
            if (r8 != r0) goto L65
            goto L7d
        L65:
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Exception -> L7e
            int r8 = r8.intValue()     // Catch: java.lang.Exception -> L7e
            goto L6d
        L6c:
            r8 = 0
        L6d:
            r1 = 10
            if (r8 < r1) goto L7e
            com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger r1 = r7.this$0     // Catch: java.lang.Exception -> L7e
            r7.I$0 = r8     // Catch: java.lang.Exception -> L7e
            r7.label = r2     // Catch: java.lang.Exception -> L7e
            java.lang.Object r8 = com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger.access$flush(r1, r7)     // Catch: java.lang.Exception -> L7e
            if (r8 != r0) goto L7e
        L7d:
            return r0
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f22894a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$logEvent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
        return ((RealTrackingEventsLogger$logEvent$1) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
    }
}
