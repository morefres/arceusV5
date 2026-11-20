package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import androidx.core.view.MotionEventCompat;
import com.appsflyer.share.attribution.RequestError;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import pp.i0;
import tr.h;
import wm.o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0018\u0011B1\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "Ltr/h;", "Lg/c;", "", "requestPermissionsLauncher", "Landroid/content/Context;", "context", "Lpp/i0;", "permission", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Lg/c;Landroid/content/Context;Lpp/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "otherWorker", "", ve.a.f33391e, "(Ltr/h;)Z", "c", "(Lwm/o;)Z", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lg/c;", "Landroid/content/Context;", rl.d.f30696a, "Lpp/i0;", "e", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements o<b>, h<b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<String> requestPermissionsLauncher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i0 permission;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$a;", "", "Landroid/content/Context;", "context", "Lg/c;", "", "requestPermissionsLauncher", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "<init>", "(Landroid/content/Context;Lg/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "Lpp/i0;", "permission", "Lcom/withpersona/sdk2/inquiry/permissions/d;", ve.a.f33391e, "(Lpp/i0;)Lcom/withpersona/sdk2/inquiry/permissions/d;", "Landroid/content/Context;", j6.b.f21518e, "Lg/c;", "c", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.c<String> requestPermissionsLauncher;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TrackingEventsLogger trackingEventsLogger;

        public a(@NotNull Context context, @NotNull g.c<String> requestPermissionsLauncher, @NotNull TrackingEventsLogger trackingEventsLogger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
            Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
            this.context = context;
            this.requestPermissionsLauncher = requestPermissionsLauncher;
            this.trackingEventsLogger = trackingEventsLogger;
        }

        @NotNull
        public final d a(@NotNull i0 permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            return new d(this.requestPermissionsLauncher, this.context, permission, this.trackingEventsLogger);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "", "<init>", "()V", j6.b.f21518e, ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f12368a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -16139474;
            }

            @NotNull
            public String toString() {
                return "Denied";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/d$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.permissions.d$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0235b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0235b f12369a = new C0235b();

            public C0235b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0235b);
            }

            public int hashCode() {
                return 375059152;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/permissions/d$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker$run$1", f = "PermissionRequestDialogWorker.kt", l = {MotionEventCompat.AXIS_GENERIC_15, RequestError.RESPONSE_CODE_FAILURE}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f12370t;

        /* renamed from: u, reason: collision with root package name */
        public int f12371u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f12372v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<b> f12374a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super b> iVar) {
                this.f12374a = iVar;
            }

            public final Object b(boolean z10, mt.b<? super Unit> bVar) {
                if (z10) {
                    Object emit = this.f12374a.emit(b.C0235b.f12369a, bVar);
                    return emit == nt.c.e() ? emit : Unit.f22894a;
                }
                Object emit2 = this.f12374a.emit(b.a.f12368a, bVar);
                return emit2 == nt.c.e() ? emit2 : Unit.f22894a;
            }

            @Override // mu.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, mt.b bVar) {
                return b(((Boolean) obj).booleanValue(), bVar);
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = d.this.new c(bVar);
            cVar.f12372v = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
        
            if (r0.emit(r12, r11) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        
            if (r12.collect(r2, r11) == r1) goto L22;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f12372v
                mu.i r0 = (mu.i) r0
                java.lang.Object r1 = nt.c.e()
                int r2 = r11.f12371u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1f
                if (r2 == r3) goto L1a
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                gt.o.b(r12)
                goto Lbf
            L1f:
                gt.o.b(r12)
                goto L8a
            L23:
                gt.o.b(r12)
                com.withpersona.sdk2.inquiry.permissions.d r12 = com.withpersona.sdk2.inquiry.permissions.d.this
                com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger r12 = com.withpersona.sdk2.inquiry.permissions.d.g(r12)
                com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData r5 = new com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData
                com.withpersona.sdk2.inquiry.permissions.d r2 = com.withpersona.sdk2.inquiry.permissions.d.this
                pp.i0 r2 = com.withpersona.sdk2.inquiry.permissions.d.e(r2)
                java.lang.String r6 = pp.n1.c(r2)
                r9 = 4
                r10 = 0
                java.lang.String r7 = "requested"
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r2 = 0
                r6 = 0
                com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger.logPermissionEvent$default(r12, r5, r2, r3, r6)
                com.withpersona.sdk2.inquiry.permissions.d r12 = com.withpersona.sdk2.inquiry.permissions.d.this
                g.c r12 = com.withpersona.sdk2.inquiry.permissions.d.f(r12)
                h.a r12 = r12.a()
                com.withpersona.sdk2.inquiry.permissions.d r2 = com.withpersona.sdk2.inquiry.permissions.d.this
                android.content.Context r2 = com.withpersona.sdk2.inquiry.permissions.d.d(r2)
                com.withpersona.sdk2.inquiry.permissions.d r5 = com.withpersona.sdk2.inquiry.permissions.d.this
                pp.i0 r5 = com.withpersona.sdk2.inquiry.permissions.d.e(r5)
                java.lang.String r5 = pp.n1.c(r5)
                h.a$a r12 = r12.getSynchronousResult(r2, r5)
                if (r12 == 0) goto L69
                java.lang.Object r6 = r12.a()
            L69:
                java.lang.Boolean r12 = ot.b.a(r4)
                boolean r12 = kotlin.jvm.internal.Intrinsics.c(r6, r12)
                if (r12 == 0) goto L8d
                com.withpersona.sdk2.inquiry.permissions.d$b$b r12 = com.withpersona.sdk2.inquiry.permissions.d.b.C0235b.f12369a
                java.lang.Object r2 = ot.l.a(r0)
                r11.f12372v = r2
                java.lang.Object r2 = ot.l.a(r6)
                r11.f12370t = r2
                r11.f12371u = r4
                java.lang.Object r12 = r0.emit(r12, r11)
                if (r12 != r1) goto L8a
                goto Lbe
            L8a:
                kotlin.Unit r12 = kotlin.Unit.f22894a
                return r12
            L8d:
                com.withpersona.sdk2.inquiry.permissions.d r12 = com.withpersona.sdk2.inquiry.permissions.d.this
                g.c r12 = com.withpersona.sdk2.inquiry.permissions.d.f(r12)
                com.withpersona.sdk2.inquiry.permissions.d r2 = com.withpersona.sdk2.inquiry.permissions.d.this
                pp.i0 r2 = com.withpersona.sdk2.inquiry.permissions.d.e(r2)
                java.lang.String r2 = pp.n1.c(r2)
                r12.b(r2)
                kp.b0 r12 = new kp.b0
                r12.<init>()
                com.withpersona.sdk2.inquiry.permissions.d$c$a r2 = new com.withpersona.sdk2.inquiry.permissions.d$c$a
                r2.<init>(r0)
                java.lang.Object r0 = ot.l.a(r0)
                r11.f12372v = r0
                java.lang.Object r0 = ot.l.a(r6)
                r11.f12370t = r0
                r11.f12371u = r3
                java.lang.Object r12 = r12.collect(r2, r11)
                if (r12 != r1) goto Lbf
            Lbe:
                return r1
            Lbf:
                gt.d r12 = new gt.d
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.permissions.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public d(@NotNull g.c<String> requestPermissionsLauncher, @NotNull Context context, @NotNull i0 permission, @NotNull TrackingEventsLogger trackingEventsLogger) {
        Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        this.requestPermissionsLauncher = requestPermissionsLauncher;
        this.context = context;
        this.permission = permission;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof d) && ((d) otherWorker).permission == this.permission;
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof d) && ((d) otherWorker).permission == this.permission;
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return j.w(new c(null));
    }
}
