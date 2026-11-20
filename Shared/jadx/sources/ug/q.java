package ug;

import android.content.Context;
import androidx.core.view.MotionEventCompat;
import com.roblox.client.RobloxApplication;
import com.roblox.client.db.RobloxDatabase;
import ju.g1;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lug/q;", "", "<init>", "()V", "", "notificationId", "", ve.a.f33391e, "(Ljava/lang/String;)V", "Lkh/i;", j6.b.f21518e, "()Lkh/i;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f32821a = new q();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.analytics.NotificationMonitoring$checkDuplicateNotificationId$1$1", f = "NotificationMonitoring.kt", l = {25, 31, MotionEventCompat.AXIS_GENERIC_2}, m = "invokeSuspend", v = 1)
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f32822t;

        /* renamed from: u, reason: collision with root package name */
        public int f32823u;

        /* renamed from: v, reason: collision with root package name */
        public int f32824v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ kh.i f32825w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f32826x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kh.i iVar, String str, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f32825w = iVar;
            this.f32826x = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f32825w, this.f32826x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
        
            if (r9 != r0) goto L26;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r8.f32824v
                java.lang.String r2 = "NotificationMonitoring"
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L26
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                gt.o.b(r9)
                goto L9a
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                long r4 = r8.f32822t
                gt.o.b(r9)
                goto L83
            L26:
                long r5 = r8.f32822t
                gt.o.b(r9)
                goto L43
            L2c:
                gt.o.b(r9)
                long r6 = java.lang.System.currentTimeMillis()
                kh.i r9 = r8.f32825w
                java.lang.String r1 = r8.f32826x
                r8.f32822t = r6
                r8.f32824v = r5
                java.lang.Object r9 = r9.b(r1, r8)
                if (r9 != r0) goto L42
                goto L99
            L42:
                r5 = r6
            L43:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L6a
                java.lang.String r9 = r8.f32826x
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "Duplicate notification id: "
                r1.append(r7)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                ek.q.h(r2, r9)
                ti.g r9 = ti.g.b()
                java.lang.String r1 = "Event-Upload-Received-Duplicate-Notification-Id"
                r9.q(r1)
            L6a:
                kh.i r9 = r8.f32825w
                lh.b r1 = new lh.b
                java.lang.String r7 = r8.f32826x
                r1.<init>(r7, r5)
                lh.b[] r1 = new lh.NotificationId[]{r1}
                r8.f32822t = r5
                r8.f32824v = r4
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L82
                goto L99
            L82:
                r4 = r5
            L83:
                rh.i r9 = rh.h.a()
                int r9 = r9.j1()
                kh.i r1 = r8.f32825w
                r8.f32822t = r4
                r8.f32823u = r9
                r8.f32824v = r3
                java.lang.Object r9 = r1.e(r9, r8)
                if (r9 != r0) goto L9a
            L99:
                return r0
            L9a:
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                if (r9 <= 0) goto Lbb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Deleted "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = " oldest notification ids"
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                ek.q.h(r2, r9)
            Lbb:
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ug.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final void a(@NotNull String notificationId) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        kh.i b = f32821a.b();
        if (b != null) {
            ju.k.d(q0.a(g1.b()), null, null, new a(b, notificationId, null), 3, null);
        }
    }

    public final kh.i b() {
        jh.c cVar = jh.c.f21761a;
        Context f10 = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(f10, "getAppContext(...)");
        RobloxDatabase b = cVar.b(f10);
        if (b != null) {
            return b.Y();
        }
        return null;
    }
}
