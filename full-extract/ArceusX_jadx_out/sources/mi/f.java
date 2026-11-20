package mi;

import androidx.core.view.MotionEventCompat;
import gt.n;
import gt.o;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lmi/f;", "", "<init>", "()V", "", "conversationId", "", "conversationGuid", "message", "Lmi/f$a;", "onFailed", "", rl.d.f30696a, "(JLjava/lang/String;Ljava/lang/String;Lmi/f$a;)V", "c", "(JLjava/lang/String;)V", "userId", j6.b.f21518e, "(J)V", ve.a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f24531a = new f();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lmi/f$a;", "", "", "resultType", "", "isModerated", "", ve.a.f33391e, "(Ljava/lang/String;Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        void a(@NotNull String resultType, boolean isModerated);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchAvatarHeadshotsAsync$1", f = "JobDispatcherBridge.kt", l = {48}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24532t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24533u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f24533u = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f24533u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f24532t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24533u;
                this.f24532t = 1;
                if (g.a(j10, this) == e10) {
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
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.job.JobDispatcherBridge$fetchUserAndHeadshotAsync$1", f = "JobDispatcherBridge.kt", l = {41}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24534t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24535u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f24535u = j10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f24535u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f24534t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24535u;
                this.f24534t = 1;
                if (g.c(j10, this) == e10) {
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
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.job.JobDispatcherBridge$markAsReadAsync$1", f = "JobDispatcherBridge.kt", l = {MotionEventCompat.AXIS_GENERIC_3}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24536t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24537u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f24538v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, String str, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f24537u = j10;
            this.f24538v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f24537u, this.f24538v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f24536t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24537u;
                String str = this.f24538v;
                this.f24536t = 1;
                if (mi.d.a(j10, str, this) == e10) {
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

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.job.JobDispatcherBridge$sendChatMessageAsync$1", f = "JobDispatcherBridge.kt", l = {20}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f24539t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f24540u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f24541v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f24542w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f24543x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, String str, String str2, a aVar, mt.b<? super e> bVar) {
            super(1, bVar);
            this.f24540u = j10;
            this.f24541v = str;
            this.f24542w = str2;
            this.f24543x = aVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new e(this.f24540u, this.f24541v, this.f24542w, this.f24543x, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            Object e10 = nt.c.e();
            int i10 = this.f24539t;
            if (i10 == 0) {
                o.b(obj);
                long j10 = this.f24540u;
                String str = this.f24541v;
                String str2 = this.f24542w;
                this.f24539t = 1;
                b = mi.d.b(j10, str, str2, this);
                if (b == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                b = ((n) obj).getValue();
            }
            a aVar = this.f24543x;
            Throwable e11 = n.e(b);
            if (e11 != null && (e11 instanceof mi.e) && aVar != null) {
                mi.e eVar = (mi.e) e11;
                aVar.a(eVar.getResultType(), Intrinsics.c("moderated", eVar.getResultType()));
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final void a(long userId) {
        mi.c.f24511a.f(new b(userId, null));
    }

    public static final void b(long userId) {
        mi.c.f24511a.f(new c(userId, null));
    }

    public static final void c(long conversationId, @Nullable String conversationGuid) {
        mi.c.f24511a.f(new d(conversationId, conversationGuid, null));
    }

    public static final void d(long conversationId, @Nullable String conversationGuid, @NotNull String message, @Nullable a onFailed) {
        Intrinsics.checkNotNullParameter(message, "message");
        mi.c.f24511a.c(conversationGuid == null ? String.valueOf(conversationId) : conversationGuid, new e(conversationId, conversationGuid, message, onFailed, null));
    }
}
