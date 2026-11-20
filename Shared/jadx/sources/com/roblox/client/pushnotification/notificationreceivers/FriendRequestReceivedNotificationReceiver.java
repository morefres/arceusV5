package com.roblox.client.pushnotification.notificationreceivers;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.Toast;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import ek.q;
import gt.o;
import ju.d2;
import ju.g1;
import ju.k;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.z2;
import k2.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import rg.n0;
import zl.t;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010 \u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/roblox/client/pushnotification/notificationreceivers/FriendRequestReceivedNotificationReceiver;", "Llj/a;", "Lju/l0;", "ioDispatcher", "mainDispatcher", "Lkotlin/Function0;", "Lxk/f;", "friendsInterfaceProvider", "<init>", "(Lju/l0;Lju/l0;Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "bundle", "k", "(Landroid/content/Intent;Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "u", "(Landroid/content/Intent;Landroid/content/Context;Lmt/b;)Ljava/lang/Object;", "v", "Lkotlin/time/a;", "delayDuration", "z", "(Landroid/content/Context;J)V", "", "userErrorLabelResId", "", "reportingContext", "actionTaken", "w", "(Landroid/content/Context;Landroid/content/Intent;ILjava/lang/String;Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Lju/l0;", "c", "Lkotlin/jvm/functions/Function0;", "Lju/p0;", rl.d.f30696a, "Lju/p0;", "broadcastScope", t.f38095d, "()Lxk/f;", "friendsInterface", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FriendRequestReceivedNotificationReceiver extends lj.a {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<xk.f> friendsInterfaceProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 broadcastScope;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {87, 100, 110, 120}, m = "markFriendRequestAsAccepted", v = 1)
    public static final class a extends ot.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: t, reason: collision with root package name */
        public Object f9307t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9308u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9309v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9310w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9311x;

        /* renamed from: y, reason: collision with root package name */
        public long f9312y;

        /* renamed from: z, reason: collision with root package name */
        public int f9313z;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FriendRequestReceivedNotificationReceiver.this.u(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$markFriendRequestAsAccepted$5$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9314t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f9316v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Intent f9317w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, Intent intent, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f9316v = context;
            this.f9317w = intent;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new b(this.f9316v, this.f9317w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f9314t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            FriendRequestReceivedNotificationReceiver.this.g(this.f9316v, this.f9317w);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {131, 147, 160}, m = "markFriendRequestAsIgnored", v = 1)
    public static final class c extends ot.d {
        public int A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: t, reason: collision with root package name */
        public Object f9318t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9319u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9320v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9321w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9322x;

        /* renamed from: y, reason: collision with root package name */
        public long f9323y;

        /* renamed from: z, reason: collision with root package name */
        public int f9324z;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FriendRequestReceivedNotificationReceiver.this.v(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver", f = "FriendRequestReceivedNotificationReceiver.kt", l = {210}, m = "notifyAndReportError", v = 1)
    public static final class d extends ot.d {
        public int A;

        /* renamed from: t, reason: collision with root package name */
        public Object f9325t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9326u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9327v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9328w;

        /* renamed from: x, reason: collision with root package name */
        public int f9329x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9330y;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9330y = obj;
            this.A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return FriendRequestReceivedNotificationReceiver.this.w(null, null, 0, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$notifyAndReportError$2", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9332t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f9333u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f9334v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i10, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f9333u = context;
            this.f9334v = i10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f9333u, this.f9334v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f9332t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Toast.makeText(this.f9333u, this.f9334v, 0).show();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {57, 58}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9335t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Intent f9337v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f9338w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$1$1", f = "FriendRequestReceivedNotificationReceiver.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f9339t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ FriendRequestReceivedNotificationReceiver f9340u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Context f9341v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f9342w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, Intent intent, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f9340u = friendRequestReceivedNotificationReceiver;
                this.f9341v = context;
                this.f9342w = intent;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new a(this.f9340u, this.f9341v, this.f9342w, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f9339t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                this.f9340u.g(this.f9341v, this.f9342w);
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Intent intent, Context context, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f9337v = intent;
            this.f9338w = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new f(this.f9337v, this.f9338w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (ju.i.g(r8, r1, r7) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        
            if (r8.u(r1, r4, r7) == r0) goto L15;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r7.f9335t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r8)
                goto L4b
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                gt.o.b(r8)
                goto L30
            L1e:
                gt.o.b(r8)
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.this
                android.content.Intent r1 = r7.f9337v
                android.content.Context r4 = r7.f9338w
                r7.f9335t = r3
                java.lang.Object r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.q(r8, r1, r4, r7)
                if (r8 != r0) goto L30
                goto L4a
            L30:
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.this
                ju.l0 r8 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.p(r8)
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$f$a r1 = new com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$f$a
                com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver r3 = com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.this
                android.content.Context r4 = r7.f9338w
                android.content.Intent r5 = r7.f9337v
                r6 = 0
                r1.<init>(r3, r4, r5, r6)
                r7.f9335t = r2
                java.lang.Object r8 = ju.i.g(r8, r1, r7)
                if (r8 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$onReceive$3", f = "FriendRequestReceivedNotificationReceiver.kt", l = {74}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9343t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Intent f9345v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f9346w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Intent intent, Context context, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f9345v = intent;
            this.f9346w = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return FriendRequestReceivedNotificationReceiver.this.new g(this.f9345v, this.f9346w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f9343t;
            if (i10 == 0) {
                o.b(obj);
                FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver = FriendRequestReceivedNotificationReceiver.this;
                Intent intent = this.f9345v;
                Context context = this.f9346w;
                this.f9343t = 1;
                if (friendRequestReceivedNotificationReceiver.v(intent, context, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public FriendRequestReceivedNotificationReceiver() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ void A(FriendRequestReceivedNotificationReceiver friendRequestReceivedNotificationReceiver, Context context, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = lj.g.f23474a;
        }
        friendRequestReceivedNotificationReceiver.z(context, j10);
    }

    public static final xk.f o() {
        return tk.g.d().b();
    }

    public static final Unit x(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f22894a;
    }

    public static final Unit y(BroadcastReceiver.PendingResult pendingResult, Throwable th2) {
        pendingResult.finish();
        return Unit.f22894a;
    }

    @Override // lj.a
    @NotNull
    public Intent k(@NotNull Intent intent, @NotNull Context context, @NotNull Intent bundle) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestReceived");
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", bundle.getLongExtra("EXTRA_NOTIFICATION_USER_ID", -1L));
        return intent;
    }

    @Override // lj.a, rg.w0, android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @Nullable Intent intent) {
        d2 d10;
        d2 d11;
        Intrinsics.checkNotNullParameter(context, "context");
        super.onReceive(context, intent);
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -918752603) {
                if (action.equals("friend_request_received_ignored")) {
                    h("FriendRequestReceived", context, intent, "Decline");
                    final BroadcastReceiver.PendingResult goAsync = goAsync();
                    d10 = k.d(this.broadcastScope, null, null, new g(intent, context, null), 3, null);
                    d10.o(new Function1() { // from class: lj.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit y10;
                            y10 = FriendRequestReceivedNotificationReceiver.y(goAsync, (Throwable) obj);
                            return y10;
                        }
                    });
                    return;
                }
                return;
            }
            if (hashCode == 946611252 && action.equals("friend_request_received_accepted")) {
                q.i("rbx.push", "FRRNR.onReceive() INTENT_ACTION_RECEIVED_FRIEND_REQUEST_ACCEPTED");
                h("FriendRequestReceived", context, intent, "Accept");
                a(context, 0);
                final BroadcastReceiver.PendingResult goAsync2 = goAsync();
                d11 = k.d(this.broadcastScope, null, null, new f(intent, context, null), 3, null);
                d11.o(new Function1() { // from class: lj.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit x10;
                        x10 = FriendRequestReceivedNotificationReceiver.x(goAsync2, (Throwable) obj);
                        return x10;
                    }
                });
            }
        }
    }

    public final xk.f t() {
        return this.friendsInterfaceProvider.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01b7, code lost:
    
        if (ju.i.g(r4, r5, r7) != r8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(android.content.Intent r18, android.content.Context r19, mt.b<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.u(android.content.Intent, android.content.Context, mt.b):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0149, code lost:
    
        if (r1.w(r2, r3, r9, r5, "Decline", r7) == r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        if (r1.w(r2, r3, r4, "client_failure", "Decline", r7) == r8) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(android.content.Intent r17, android.content.Context r18, mt.b<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.v(android.content.Intent, android.content.Context, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(android.content.Context r11, android.content.Intent r12, int r13, java.lang.String r14, java.lang.String r15, mt.b<? super kotlin.Unit> r16) {
        /*
            r10 = this;
            r3 = r16
            boolean r4 = r3 instanceof com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.d
            if (r4 == 0) goto L15
            r4 = r3
            com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$d r4 = (com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.d) r4
            int r5 = r4.A
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L15
            int r5 = r5 - r6
            r4.A = r5
            goto L1a
        L15:
            com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$d r4 = new com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$d
            r4.<init>(r3)
        L1a:
            java.lang.Object r3 = r4.f9330y
            java.lang.Object r5 = nt.c.e()
            int r6 = r4.A
            r7 = 1
            if (r6 == 0) goto L47
            if (r6 != r7) goto L3f
            java.lang.Object r1 = r4.f9328w
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.f9327v
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r5 = r4.f9326u
            android.content.Intent r5 = (android.content.Intent) r5
            java.lang.Object r4 = r4.f9325t
            android.content.Context r4 = (android.content.Context) r4
            gt.o.b(r3)
            r7 = r1
            r1 = r2
            r2 = r4
            r3 = r5
            goto L6a
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L47:
            gt.o.b(r3)
            ju.l0 r3 = r10.mainDispatcher
            com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$e r6 = new com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver$e
            r8 = 0
            r6.<init>(r11, r13, r8)
            r4.f9325t = r11
            r4.f9326u = r12
            r4.f9327v = r14
            r9 = r15
            r4.f9328w = r9
            r4.f9329x = r13
            r4.A = r7
            java.lang.Object r2 = ju.i.g(r3, r6, r4)
            if (r2 != r5) goto L66
            return r5
        L66:
            r2 = r11
            r3 = r12
            r1 = r14
            r7 = r9
        L6a:
            java.lang.String r5 = "FriendRequestReceived"
            java.lang.String r6 = "base2"
            r4 = 1
            r0 = r10
            r0.d(r1, r2, r3, r4, r5, r6, r7)
            kotlin.Unit r0 = kotlin.Unit.f22894a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver.w(android.content.Context, android.content.Intent, int, java.lang.String, java.lang.String, mt.b):java.lang.Object");
    }

    public final void z(Context context, long delayDuration) {
        k.f f10 = new k.f(context, "channel_general").z(rg.l0.f30328c).i(new RemoteViews(context.getPackageName(), n0.f30420o)).D(kotlin.time.a.w(delayDuration)).f(true);
        Intrinsics.checkNotNullExpressionValue(f10, "setAutoCancel(...)");
        NotificationManager notificationManager = (NotificationManager) l2.b.k(context, NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.notify(0, f10.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendRequestReceivedNotificationReceiver(@NotNull l0 ioDispatcher, @NotNull l0 mainDispatcher, @NotNull Function0<? extends xk.f> friendsInterfaceProvider) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(friendsInterfaceProvider, "friendsInterfaceProvider");
        this.mainDispatcher = mainDispatcher;
        this.friendsInterfaceProvider = friendsInterfaceProvider;
        this.broadcastScope = q0.a(z2.b(null, 1, null).plus(ioDispatcher));
    }

    public /* synthetic */ FriendRequestReceivedNotificationReceiver(l0 l0Var, l0 l0Var2, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.b() : l0Var, (i10 & 2) != 0 ? g1.c() : l0Var2, (i10 & 4) != 0 ? new Function0() { // from class: lj.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                xk.f o8;
                o8 = FriendRequestReceivedNotificationReceiver.o();
                return o8;
            }
        } : function0);
    }
}
