package jj;

import androidx.core.view.inputmethod.EditorInfoCompat;
import ek.t;
import gt.o;
import hj.r;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.z2;
import kj.PushNotificationMetadataResponse;
import kj.RegisterDeviceResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;
import rg.y;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJR\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011H\u0086@¢\u0006\u0004\b\"\u0010#JI\u0010$\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)JO\u0010*\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b*\u0010+J/\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00101R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103¨\u00065"}, d2 = {"Ljj/a;", "", "Lju/l0;", "ioDispatcher", "mainDispatcher", "Lxk/j;", "notificationPlatform", "Lrg/y;", "implementations", "", "deviceName", "<init>", "(Lju/l0;Lju/l0;Lxk/j;Lrg/y;Ljava/lang/String;)V", "token", "oldToken", "", "authorizeForPush", "Lkotlin/Function1;", "Lkj/k0;", "", "onSuccess", "Lkotlin/Function0;", "onFailure", "Liv/d;", "Lokhttp3/ResponseBody;", "regCall", "g", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Liv/d;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "(Lkotlin/jvm/functions/Function0;Lmt/b;)Ljava/lang/Object;", "platform", "notificationId", "Lkj/g0;", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lhj/r$c;", "deregistrationListener", ve.a.f33391e, "(Lhj/r$c;)V", rl.d.f30696a, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "c", "(Ljava/lang/String;ZLjava/lang/String;)Liv/d;", "Lju/l0;", "Lxk/j;", "Lrg/y;", "Ljava/lang/String;", "Lju/p0;", "Lju/p0;", "serviceScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final xk.j notificationPlatform;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y implementations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 serviceScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDevice$1", f = "PushNotificationService.kt", l = {161}, m = "invokeSuspend", v = 1)
    /* renamed from: jj.a$a, reason: collision with other inner class name */
    public static final class C0383a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21786t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ r.c f21788v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: jj.a$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0384a extends kotlin.jvm.internal.k implements Function0<Unit> {
            public C0384a(Object obj) {
                super(0, obj, r.c.class, "onSuccessfullyDeregistered", "onSuccessfullyDeregistered()V", 0);
            }

            public final void d() {
                ((r.c) this.receiver).a();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                d();
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0383a(r.c cVar, mt.b<? super C0383a> bVar) {
            super(2, bVar);
            this.f21788v = cVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new C0383a(this.f21788v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f21786t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                C0384a c0384a = new C0384a(this.f21788v);
                this.f21786t = 1;
                if (aVar.b(c0384a, this) == e10) {
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
            return ((C0383a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {84, 86}, m = "deregisterCurrentDeviceSuspend", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f21789t;

        /* renamed from: u, reason: collision with root package name */
        public Object f21790u;

        /* renamed from: v, reason: collision with root package name */
        public int f21791v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f21792w;

        /* renamed from: y, reason: collision with root package name */
        public int f21794y;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21792w = obj;
            this.f21794y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$deregisterCurrentDeviceSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21795t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21796u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f21796u = function0;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f21796u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21795t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21796u.invoke();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCall$1", f = "PushNotificationService.kt", l = {181}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21797t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f21799v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f21800w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f21801x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f21802y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f21803z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, String str2, String str3, Function1<? super PushNotificationMetadataResponse, Unit> function1, Function1<? super Integer, Unit> function12, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f21799v = str;
            this.f21800w = str2;
            this.f21801x = str3;
            this.f21802y = function1;
            this.f21803z = function12;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new d(this.f21799v, this.f21800w, this.f21801x, this.f21802y, this.f21803z, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f21797t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f21799v;
                String str2 = this.f21800w;
                String str3 = this.f21801x;
                Function1<PushNotificationMetadataResponse, Unit> function1 = this.f21802y;
                Function1<Integer, Unit> function12 = this.f21803z;
                this.f21797t = 1;
                if (aVar.e(str, str2, str3, function1, function12, this) == e10) {
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
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {108, 116, 123}, m = "makeNotificationMetadataApiCallSuspend", v = 1)
    public static final class e extends ot.d {
        public Object A;
        public int B;
        public /* synthetic */ Object C;
        public int E;

        /* renamed from: t, reason: collision with root package name */
        public Object f21804t;

        /* renamed from: u, reason: collision with root package name */
        public Object f21805u;

        /* renamed from: v, reason: collision with root package name */
        public Object f21806v;

        /* renamed from: w, reason: collision with root package name */
        public Object f21807w;

        /* renamed from: x, reason: collision with root package name */
        public Object f21808x;

        /* renamed from: y, reason: collision with root package name */
        public Object f21809y;

        /* renamed from: z, reason: collision with root package name */
        public Object f21810z;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.C = obj;
            this.E |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.e(null, null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21811t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<PushNotificationMetadataResponse, Unit> f21812u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ PushNotificationMetadataResponse f21813v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super PushNotificationMetadataResponse, Unit> function1, PushNotificationMetadataResponse pushNotificationMetadataResponse, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f21812u = function1;
            this.f21813v = pushNotificationMetadataResponse;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f21812u, this.f21813v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21811t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21812u.invoke(this.f21813v);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$makeNotificationMetadataApiCallSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21814t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Unit> f21815u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Integer, Unit> function1, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f21815u = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new g(this.f21815u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21814t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21815u.invoke(null);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbx$1", f = "PushNotificationService.kt", l = {145}, m = "invokeSuspend", v = 1)
    public static final class h extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21816t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f21818v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f21819w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f21820x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f21821y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21822z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String str, String str2, boolean z10, Function1<? super RegisterDeviceResponse, Unit> function1, Function0<Unit> function0, mt.b<? super h> bVar) {
            super(2, bVar);
            this.f21818v = str;
            this.f21819w = str2;
            this.f21820x = z10;
            this.f21821y = function1;
            this.f21822z = function0;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return a.this.new h(this.f21818v, this.f21819w, this.f21820x, this.f21821y, this.f21822z, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f21816t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String str = this.f21818v;
                String str2 = this.f21819w;
                boolean z10 = this.f21820x;
                Function1<RegisterDeviceResponse, Unit> function1 = this.f21821y;
                Function0<Unit> function0 = this.f21822z;
                this.f21816t = 1;
                if (a.h(aVar, str, str2, z10, function1, function0, null, this, 32, null) == e10) {
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
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService", f = "PushNotificationService.kt", l = {60, 68, 71, 75}, m = "sendNotificationTokenToRbxSuspend", v = 1)
    public static final class i extends ot.d {
        public Object A;
        public boolean B;
        public int C;
        public /* synthetic */ Object D;
        public int F;

        /* renamed from: t, reason: collision with root package name */
        public Object f21823t;

        /* renamed from: u, reason: collision with root package name */
        public Object f21824u;

        /* renamed from: v, reason: collision with root package name */
        public Object f21825v;

        /* renamed from: w, reason: collision with root package name */
        public Object f21826w;

        /* renamed from: x, reason: collision with root package name */
        public Object f21827x;

        /* renamed from: y, reason: collision with root package name */
        public Object f21828y;

        /* renamed from: z, reason: collision with root package name */
        public Object f21829z;

        public i(mt.b<? super i> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.D = obj;
            this.F |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return a.this.g(null, null, false, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class j extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21830t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function1<RegisterDeviceResponse, Unit> f21831u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ RegisterDeviceResponse f21832v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super RegisterDeviceResponse, Unit> function1, RegisterDeviceResponse registerDeviceResponse, mt.b<? super j> bVar) {
            super(2, bVar);
            this.f21831u = function1;
            this.f21832v = registerDeviceResponse;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new j(this.f21831u, this.f21832v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21830t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21831u.invoke(this.f21832v);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$3$2", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class k extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21833t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21834u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0<Unit> function0, mt.b<? super k> bVar) {
            super(2, bVar);
            this.f21834u = function0;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new k(this.f21834u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21833t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21834u.invoke();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.pushnotification.http.PushNotificationService$sendNotificationTokenToRbxSuspend$4$1", f = "PushNotificationService.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f21835t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f21836u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0<Unit> function0, mt.b<? super l> bVar) {
            super(2, bVar);
            this.f21836u = function0;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new l(this.f21836u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f21835t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            this.f21836u.invoke();
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public a() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Object h(a aVar, String str, String str2, boolean z10, Function1 function1, Function0 function0, iv.d dVar, mt.b bVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            dVar = aVar.c(str, z10, str2);
        }
        return aVar.g(str, str2, z10, function1, function0, dVar, bVar);
    }

    public final void a(@NotNull r.c deregistrationListener) {
        Intrinsics.checkNotNullParameter(deregistrationListener, "deregistrationListener");
        ju.k.d(this.serviceScope, null, null, new C0383a(deregistrationListener, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|14|(1:16)|17|18)(2:21|22))(2:23|24))(3:33|34|(2:36|30))|25|26|(1:28)(5:31|14|(0)|17|18)))|41|6|7|(0)(0)|25|26|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        if (ju.i.g(r2, r5, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0035, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        r9 = gt.n.INSTANCE;
        r8 = gt.n.b(gt.o.a(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        r2 = gt.n.INSTANCE;
        r9 = gt.n.b(gt.o.a(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[Catch: all -> 0x0035, TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0031, B:13:0x00a4, B:28:0x0083), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r8, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jj.a.b
            if (r0 == 0) goto L13
            r0 = r9
            jj.a$b r0 = (jj.a.b) r0
            int r1 = r0.f21794y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21794y = r1
            goto L18
        L13:
            jj.a$b r0 = new jj.a$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f21792w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f21794y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r8 = r0.f21790u
            iv.x r8 = (iv.x) r8
            java.lang.Object r8 = r0.f21789t
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L35
            goto La4
        L35:
            r8 = move-exception
            goto Lab
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            java.lang.Object r8 = r0.f21790u
            iv.d r8 = (iv.d) r8
            java.lang.Object r8 = r0.f21789t
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L4c
            goto L6c
        L4c:
            r9 = move-exception
            goto L73
        L4e:
            gt.o.b(r9)
            xk.j r9 = r7.notificationPlatform
            iv.d r9 = r9.h()
            gt.n$a r2 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L4c
            r0.f21789t = r8     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r2 = ot.l.a(r9)     // Catch: java.lang.Throwable -> L4c
            r0.f21790u = r2     // Catch: java.lang.Throwable -> L4c
            r0.f21791v = r3     // Catch: java.lang.Throwable -> L4c
            r0.f21794y = r5     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = iv.p.c(r9, r0)     // Catch: java.lang.Throwable -> L4c
            if (r9 != r1) goto L6c
            goto La3
        L6c:
            iv.x r9 = (iv.x) r9     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r9 = gt.n.b(r9)     // Catch: java.lang.Throwable -> L4c
            goto L7d
        L73:
            gt.n$a r2 = gt.n.INSTANCE
            java.lang.Object r9 = gt.o.a(r9)
            java.lang.Object r9 = gt.n.b(r9)
        L7d:
            boolean r2 = gt.n.h(r9)
            if (r2 == 0) goto Lb6
            iv.x r9 = (iv.x) r9     // Catch: java.lang.Throwable -> L35
            ju.l0 r2 = r7.mainDispatcher     // Catch: java.lang.Throwable -> L35
            jj.a$c r5 = new jj.a$c     // Catch: java.lang.Throwable -> L35
            r6 = 0
            r5.<init>(r8, r6)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = ot.l.a(r8)     // Catch: java.lang.Throwable -> L35
            r0.f21789t = r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = ot.l.a(r9)     // Catch: java.lang.Throwable -> L35
            r0.f21790u = r8     // Catch: java.lang.Throwable -> L35
            r0.f21791v = r3     // Catch: java.lang.Throwable -> L35
            r0.f21794y = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = ju.i.g(r2, r5, r0)     // Catch: java.lang.Throwable -> L35
            if (r8 != r1) goto La4
        La3:
            return r1
        La4:
            kotlin.Unit r8 = kotlin.Unit.f22894a     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = gt.n.b(r8)     // Catch: java.lang.Throwable -> L35
            goto Lba
        Lab:
            gt.n$a r9 = gt.n.INSTANCE
            java.lang.Object r8 = gt.o.a(r8)
            java.lang.Object r8 = gt.n.b(r8)
            goto Lba
        Lb6:
            java.lang.Object r8 = gt.n.b(r9)
        Lba:
            java.lang.Throwable r8 = gt.n.e(r8)
            if (r8 == 0) goto Lda
            java.lang.String r9 = r8.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "deregisterCurrentDevice failed: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "rbx.push"
            ek.q.f(r0, r9, r8)
        Lda:
            kotlin.Unit r8 = kotlin.Unit.f22894a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.b(kotlin.jvm.functions.Function0, mt.b):java.lang.Object");
    }

    public final iv.d<ResponseBody> c(String token, boolean authorizeForPush, String oldToken) {
        yk.d dVar = new yk.d(token, authorizeForPush, oldToken, this.deviceName);
        iv.d<ResponseBody> n10 = this.implementations.n(dVar);
        return n10 == null ? t.f() ? this.notificationPlatform.i(dVar) : this.notificationPlatform.f(dVar) : n10;
    }

    public final void d(@NotNull String platform, @NotNull String token, @NotNull String notificationId, @NotNull Function1<? super PushNotificationMetadataResponse, Unit> onSuccess, @NotNull Function1<? super Integer, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        ju.k.d(this.serviceScope, null, null, new d(platform, token, notificationId, onSuccess, onFailure, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|(1:(1:(1:(3:11|12|13)(2:15|16))(9:17|18|19|20|21|22|(1:24)|12|13))(4:30|31|32|33))(11:58|59|60|61|62|63|64|65|66|(1:68)|26)|34|35|36|37|38|(10:41|42|(2:44|(2:46|26))(1:48)|47|20|21|22|(0)|12|13)(5:40|22|(0)|12|13)))|77|6|(0)(0)|34|35|36|37|38|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01ea, code lost:
    
        if (ju.i.g(r5, r7, r2) == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kj.PushNotificationMetadataResponse, kotlin.Unit> r20, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.e(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    public final void f(@NotNull String token, @Nullable String oldToken, boolean authorizeForPush, @NotNull Function1<? super RegisterDeviceResponse, Unit> onSuccess, @NotNull Function0<Unit> onFailure) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        ju.k.d(this.serviceScope, null, null, new h(token, oldToken, authorizeForPush, onSuccess, onFailure, null), 3, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:(1:(3:12|13|14)(2:16|17))(1:18))(1:37)|19|20|21|22|23|24|(1:26)|13|14) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(10:(1:(1:(3:12|13|14)(2:16|17))(1:18))(1:37)|19|20|21|22|23|24|(1:26)|13|14)(4:38|39|40|41))(17:63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|(1:79)|29)|42|43|44|45|(10:48|49|(9:51|(3:53|28|29)|54|22|23|24|(0)|13|14)(1:55)|35|36|23|24|(0)|13|14)(5:47|24|(0)|13|14)))|96|6|(0)(0)|42|43|44|45|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x022d, code lost:
    
        if (r0 == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c7, code lost:
    
        if (ju.i.g(r6, r7, r2) == r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ju.l0, kotlin.coroutines.CoroutineContext] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.Nullable java.lang.String r20, boolean r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kj.RegisterDeviceResponse, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r23, @org.jetbrains.annotations.NotNull iv.d<okhttp3.ResponseBody> r24, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.g(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, iv.d, mt.b):java.lang.Object");
    }

    public a(@NotNull l0 ioDispatcher, @NotNull l0 mainDispatcher, @NotNull xk.j notificationPlatform, @NotNull y implementations, @NotNull String deviceName) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(notificationPlatform, "notificationPlatform");
        Intrinsics.checkNotNullParameter(implementations, "implementations");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        this.mainDispatcher = mainDispatcher;
        this.notificationPlatform = notificationPlatform;
        this.implementations = implementations;
        this.deviceName = deviceName;
        this.serviceScope = q0.a(z2.b(null, 1, null).plus(ioDispatcher));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(ju.l0 r1, ju.l0 r2, xk.j r3, rg.y r4, java.lang.String r5, int r6, kotlin.jvm.internal.DefaultConstructorMarker r7) {
        /*
            r0 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L8
            ju.l0 r1 = ju.g1.b()
        L8:
            r7 = r6 & 2
            if (r7 == 0) goto L10
            ju.n2 r2 = ju.g1.c()
        L10:
            r7 = r6 & 4
            if (r7 == 0) goto L21
            tk.d r3 = tk.g.d()
            xk.j r3 = r3.f()
            java.lang.String r7 = "notifications(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r7)
        L21:
            r7 = r6 & 8
            if (r7 == 0) goto L2e
            rg.y r4 = rg.y.h()
            java.lang.String r7 = "getInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r7)
        L2e:
            r6 = r6 & 16
            if (r6 == 0) goto L3c
            r5 = 0
            java.lang.String r5 = cl.a.b(r5)
            java.lang.String r6 = "getDeviceName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
        L3c:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jj.a.<init>(ju.l0, ju.l0, xk.j, rg.y, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
