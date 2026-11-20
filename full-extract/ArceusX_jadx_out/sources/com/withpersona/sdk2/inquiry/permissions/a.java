package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import gt.n;
import ju.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.i;
import mu.j;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import tr.h;
import wm.o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u000e\u0012B!\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "Ltr/h;", "Lg/c;", "Landroidx/activity/result/IntentSenderRequest;", "resolvableApiLauncher", "Landroid/content/Context;", "context", "<init>", "(Lg/c;Landroid/content/Context;)V", "Lmu/h;", "run", "()Lmu/h;", j6.b.f21518e, "Lg/c;", "c", "Landroid/content/Context;", ve.a.f33391e, "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements o<b>, h<b> {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<IntentSenderRequest> resolvableApiLauncher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/a;", ve.a.f33391e, "()Lcom/withpersona/sdk2/inquiry/permissions/a;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.a$a, reason: collision with other inner class name */
    public interface InterfaceC0230a {
        @NotNull
        a a();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "", "<init>", "()V", "c", j6.b.f21518e, ve.a.f33391e, "Lcom/withpersona/sdk2/inquiry/permissions/a$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b$c;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$a;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.permissions.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C0231a extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0231a f12347a = new C0231a();

            public C0231a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0231a);
            }

            public int hashCode() {
                return -588562023;
            }

            @NotNull
            public String toString() {
                return "Denied";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$b;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.permissions.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0232b extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0232b f12348a = new C0232b();

            public C0232b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0232b);
            }

            public int hashCode() {
                return 726963865;
            }

            @NotNull
            public String toString() {
                return "NotSupported";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b$c;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f12349a = new c();

            public c() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -190170683;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1", f = "DeviceFeatureRequestWorker.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS, 62, 68, 77, 85}, m = "invokeSuspend")
    public static final class c extends m implements Function2<i<? super b>, mt.b<? super Unit>, Object> {
        public int A;
        public /* synthetic */ Object B;

        /* renamed from: t, reason: collision with root package name */
        public Object f12350t;

        /* renamed from: u, reason: collision with root package name */
        public Object f12351u;

        /* renamed from: v, reason: collision with root package name */
        public Object f12352v;

        /* renamed from: w, reason: collision with root package name */
        public Object f12353w;

        /* renamed from: x, reason: collision with root package name */
        public Object f12354x;

        /* renamed from: y, reason: collision with root package name */
        public Object f12355y;

        /* renamed from: z, reason: collision with root package name */
        public int f12356z;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.permissions.a$c$a, reason: collision with other inner class name */
        public static final class C0233a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i<b> f12357a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0233a(i<? super b> iVar) {
                this.f12357a = iVar;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(ActivityResult activityResult, mt.b<? super Unit> bVar) {
                if (activityResult == null || activityResult.getResultCode() != -1) {
                    Object emit = this.f12357a.emit(b.C0231a.f12347a, bVar);
                    return emit == nt.c.e() ? emit : Unit.f22894a;
                }
                Object emit2 = this.f12357a.emit(b.c.f12349a, bVar);
                return emit2 == nt.c.e() ? emit2 : Unit.f22894a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b implements Function1<lb.g, Unit> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<gt.n<? extends lb.g>> f12358a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(n<? super gt.n<? extends lb.g>> nVar) {
                this.f12358a = nVar;
            }

            public final void a(lb.g gVar) {
                this.f12358a.resumeWith(gt.n.b(gt.n.a(gt.n.b(gVar))));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(lb.g gVar) {
                a(gVar);
                return Unit.f22894a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: com.withpersona.sdk2.inquiry.permissions.a$c$c, reason: collision with other inner class name */
        public static final class C0234c implements sb.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n<gt.n<? extends lb.g>> f12359a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0234c(n<? super gt.n<? extends lb.g>> nVar) {
                this.f12359a = nVar;
            }

            @Override // sb.f
            public final void onFailure(Exception exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                n<gt.n<? extends lb.g>> nVar = this.f12359a;
                n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(gt.n.a(gt.n.b(gt.o.a(exception)))));
            }
        }

        public c(mt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = a.this.new c(bVar);
            cVar.B = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0233, code lost:
        
            if (r0.emit(r8, r13) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0155, code lost:
        
            if (r0.emit(r3, r13) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0190, code lost:
        
            if (r0.emit(r3, r13) == r1) goto L50;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 569
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.permissions.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super b> iVar, mt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements sb.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f12360a;

        public d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f12360a = function;
        }

        @Override // sb.g
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f12360a.invoke(obj);
        }
    }

    public a(@NotNull g.c<IntentSenderRequest> resolvableApiLauncher, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resolvableApiLauncher, "resolvableApiLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.resolvableApiLauncher = resolvableApiLauncher;
        this.context = context;
    }

    @Override // tr.h
    public boolean a(@NotNull h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // wm.o, tr.h
    @NotNull
    public mu.h<b> run() {
        return j.w(new c(null));
    }
}
