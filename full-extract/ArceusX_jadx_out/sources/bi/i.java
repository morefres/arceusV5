package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.h0;
import android.view.j0;
import android.view.l;
import android.view.s;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.tasks.Task;
import com.roblox.client.RobloxApplication;
import ek.d0;
import gt.n;
import gt.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import ju.d2;
import ju.g1;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql.Achievement;
import ql.w;
import zl.t;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0087@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tH\u0082@¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b*\u0010&R!\u00101\u001a\u00020+8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lbi/i;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "l", "(Landroid/content/Context;)Z", "", "q", "(Landroid/content/Context;)V", "", "btid", "n", "(Landroid/content/Context;J)V", "m", "Le4/q;", "activity", "o", "(Le4/q;)V", "p", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "Lql/w;", "replicator", "", "r", "(Lql/w;Lmt/b;)Ljava/lang/Object;", "Lda/e;", "signInClient", "Lgt/n;", "k", "(Lda/e;Lmt/b;)Ljava/lang/Object;", t.f38095d, "(Lmt/b;)Ljava/lang/Object;", "s", "()Z", "i", "v", "Lbi/m;", j6.b.f21518e, "Lgt/h;", "j", "()Lbi/m;", "getStreakTracker$annotations", "streakTracker", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasUnlockedAllStreaks", rl.d.f30696a, "Z", "observerAttached", "Lju/d2;", "e", "Lju/d2;", "achievementsInitJob", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i implements android.view.f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f4189a = new i();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h streakTracker = gt.i.b(new Function0() { // from class: bi.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            m u8;
            u8 = i.u();
            return u8;
        }
    });

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static AtomicBoolean hasUnlockedAllStreaks = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean observerAttached;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static d2 achievementsInitJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$checkUnlockedAllStreaks$2", f = "PlayGamesIntegration.kt", l = {258}, m = "invokeSuspend", v = 1)
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f4193t;

        /* renamed from: u, reason: collision with root package name */
        public int f4194u;

        /* renamed from: v, reason: collision with root package name */
        public int f4195v;

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4195v;
            if (i10 == 0) {
                o.b(obj);
                if (i.hasUnlockedAllStreaks.get()) {
                    Log.i("rbx.achievements.playgames", "Already unlocked all streak achievements, skipping check");
                    return Unit.f22894a;
                }
                ql.b a10 = com.roblox.universalapp.achievement.b.f9827a.a();
                if (a10 != null) {
                    this.f4193t = ot.l.a(a10);
                    this.f4194u = 0;
                    this.f4195v = 1;
                    obj = a10.h(this);
                    if (obj == e10) {
                        return e10;
                    }
                }
                return Unit.f22894a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(q.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((Achievement) it.next()).getCodeName());
            }
            Set Q0 = CollectionsKt.Q0(arrayList);
            List<Achievement> a11 = bi.b.a();
            ArrayList arrayList2 = new ArrayList(q.u(a11, 10));
            Iterator<T> it2 = a11.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Achievement) it2.next()).getRobloxId());
            }
            List u02 = CollectionsKt.u0(arrayList2, Q0);
            Log.i("rbx.achievements.playgames", "Locked streak achievements: " + u02);
            i.hasUnlockedAllStreaks.set(u02.isEmpty());
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {231}, m = "isPgsAuthenticated-gIAlu-s", v = 1)
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f4196t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4197u;

        /* renamed from: w, reason: collision with root package name */
        public int f4199w;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4197u = obj;
            this.f4199w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object k10 = i.this.k(null, this);
            return k10 == nt.c.e() ? k10 : n.a(k10);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lgt/n;", "", "<anonymous>", "(Lju/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$isPgsAuthenticated$2", f = "PlayGamesIntegration.kt", l = {233}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super n<? extends Boolean>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f4200t;

        /* renamed from: u, reason: collision with root package name */
        public int f4201u;

        /* renamed from: v, reason: collision with root package name */
        public int f4202v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f4203w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ da.e f4204x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(da.e eVar, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f4204x = eVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            c cVar = new c(this.f4204x, bVar);
            cVar.f4203w = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super n<? extends Boolean>> bVar) {
            return invoke2(p0Var, (mt.b<? super n<Boolean>>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object b;
            p0 p0Var = (p0) this.f4203w;
            Object e10 = nt.c.e();
            int i10 = this.f4202v;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    da.e eVar = this.f4204x;
                    n.Companion companion = n.INSTANCE;
                    Task<da.c> a10 = eVar.a();
                    Intrinsics.checkNotNullExpressionValue(a10, "isAuthenticated(...)");
                    this.f4203w = ot.l.a(p0Var);
                    this.f4200t = ot.l.a(p0Var);
                    this.f4201u = 0;
                    this.f4202v = 1;
                    obj = uu.b.a(a10, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                b = n.b(ot.b.a(((da.c) obj).a()));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                b = n.b(o.a(th2));
            }
            n a11 = n.a(b);
            Object value = a11.getValue();
            if (n.g(value)) {
                value = null;
            }
            Boolean bool = (Boolean) value;
            Log.i("rbx.achievements.playgames", "PGS isAuthenticated: " + (bool != null ? bool.booleanValue() : false));
            return a11;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<? super n<Boolean>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onAppCreate$1", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4205t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f4206u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, mt.b<? super d> bVar) {
            super(2, bVar);
            this.f4206u = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new d(this.f4206u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f4205t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Context context = this.f4206u;
            Intrinsics.checkNotNull(context);
            com.roblox.universalapp.achievement.b.b(context);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1", f = "PlayGamesIntegration.kt", l = {163}, m = "invokeSuspend", v = 1)
    public static final class e extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4207t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ j.b f4208u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ql.b f4209v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1", f = "PlayGamesIntegration.kt", l = {164, 197}, m = "invokeSuspend", v = 1)
        public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {
            public final /* synthetic */ j.b A;
            public final /* synthetic */ ql.b B;

            /* renamed from: t, reason: collision with root package name */
            public Object f4210t;

            /* renamed from: u, reason: collision with root package name */
            public Object f4211u;

            /* renamed from: v, reason: collision with root package name */
            public Object f4212v;

            /* renamed from: w, reason: collision with root package name */
            public boolean f4213w;

            /* renamed from: x, reason: collision with root package name */
            public int f4214x;

            /* renamed from: y, reason: collision with root package name */
            public int f4215y;

            /* renamed from: z, reason: collision with root package name */
            public /* synthetic */ Object f4216z;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$1", f = "PlayGamesIntegration.kt", l = {182, 193}, m = "invokeSuspend", v = 1)
            /* renamed from: bi.i$e$a$a, reason: collision with other inner class name */
            public static final class C0083a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public Object f4217t;

                /* renamed from: u, reason: collision with root package name */
                public Object f4218u;

                /* renamed from: v, reason: collision with root package name */
                public int f4219v;

                /* renamed from: w, reason: collision with root package name */
                public int f4220w;

                /* renamed from: x, reason: collision with root package name */
                public /* synthetic */ Object f4221x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ w f4222y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0083a(w wVar, mt.b<? super C0083a> bVar) {
                    super(2, bVar);
                    this.f4222y = wVar;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    C0083a c0083a = new C0083a(this.f4222y, bVar);
                    c0083a.f4221x = obj;
                    return c0083a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
                
                    if (r5.i(r9) == r1) goto L33;
                 */
                @Override // ot.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = r9.f4221x
                        ju.p0 r0 = (ju.p0) r0
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r9.f4220w
                        r3 = 2
                        r4 = 0
                        java.lang.String r5 = "rbx.achievements.playgames"
                        r6 = 1
                        if (r2 == 0) goto L30
                        if (r2 == r6) goto L26
                        if (r2 != r3) goto L1e
                        java.lang.Object r0 = r9.f4218u
                        java.io.Serializable r0 = (java.io.Serializable) r0
                        gt.o.b(r10)
                        goto Lb8
                    L1e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L26:
                        java.lang.Object r2 = r9.f4217t
                        ju.p0 r2 = (ju.p0) r2
                        gt.o.b(r10)     // Catch: java.lang.Throwable -> L2e
                        goto L53
                    L2e:
                        r10 = move-exception
                        goto L5a
                    L30:
                        gt.o.b(r10)
                        java.lang.String r10 = "starting one time remote to local sync"
                        android.util.Log.i(r5, r10)
                        ql.w r10 = r9.f4222y
                        gt.n$a r2 = gt.n.INSTANCE     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r2 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L2e
                        r9.f4221x = r2     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r2 = ot.l.a(r0)     // Catch: java.lang.Throwable -> L2e
                        r9.f4217t = r2     // Catch: java.lang.Throwable -> L2e
                        r9.f4219v = r4     // Catch: java.lang.Throwable -> L2e
                        r9.f4220w = r6     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r10 = r10.d(r9)     // Catch: java.lang.Throwable -> L2e
                        if (r10 != r1) goto L53
                        goto Lb7
                    L53:
                        java.io.Serializable r10 = (java.io.Serializable) r10     // Catch: java.lang.Throwable -> L2e
                        java.lang.Object r10 = gt.n.b(r10)     // Catch: java.lang.Throwable -> L2e
                        goto L64
                    L5a:
                        gt.n$a r2 = gt.n.INSTANCE
                        java.lang.Object r10 = gt.o.a(r10)
                        java.lang.Object r10 = gt.n.b(r10)
                    L64:
                        java.lang.Throwable r2 = gt.n.e(r10)
                        java.lang.String r7 = "local"
                        if (r2 == 0) goto L80
                        java.lang.String r8 = "unable to sync remote to local"
                        android.util.Log.w(r5, r8, r2)
                        rh.i r2 = rh.h.a()
                        boolean r2 = r2.C()
                        if (r2 == 0) goto L80
                        ql.t r2 = ql.t.f29898a
                        r2.o(r7, r4)
                    L80:
                        boolean r2 = gt.n.h(r10)
                        if (r2 == 0) goto Lb8
                        r2 = r10
                        java.io.Serializable r2 = (java.io.Serializable) r2
                        java.lang.String r8 = "remote to local sync completed"
                        android.util.Log.i(r5, r8)
                        rh.i r5 = rh.h.a()
                        boolean r5 = r5.C()
                        if (r5 == 0) goto L9d
                        ql.t r5 = ql.t.f29898a
                        r5.o(r7, r6)
                    L9d:
                        bi.i r5 = bi.i.f4189a
                        java.lang.Object r0 = ot.l.a(r0)
                        r9.f4221x = r0
                        r9.f4217t = r10
                        java.lang.Object r10 = ot.l.a(r2)
                        r9.f4218u = r10
                        r9.f4219v = r4
                        r9.f4220w = r3
                        java.lang.Object r10 = bi.i.b(r5, r9)
                        if (r10 != r1) goto Lb8
                    Lb7:
                        return r1
                    Lb8:
                        kotlin.Unit r10 = kotlin.Unit.f22894a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: bi.i.e.a.C0083a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((C0083a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2", f = "PlayGamesIntegration.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f4223t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f4224u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ w f4225v;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
                @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$2$1", f = "PlayGamesIntegration.kt", l = {198}, m = "invokeSuspend", v = 1)
                /* renamed from: bi.i$e$a$b$a, reason: collision with other inner class name */
                public static final class C0084a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

                    /* renamed from: t, reason: collision with root package name */
                    public int f4226t;

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ w f4227u;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0084a(w wVar, mt.b<? super C0084a> bVar) {
                        super(2, bVar);
                        this.f4227u = wVar;
                    }

                    @Override // ot.a
                    public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                        return new C0084a(this.f4227u, bVar);
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        Object e10 = nt.c.e();
                        int i10 = this.f4226t;
                        if (i10 == 0) {
                            o.b(obj);
                            i iVar = i.f4189a;
                            w wVar = this.f4227u;
                            this.f4226t = 1;
                            if (iVar.r(wVar, this) == e10) {
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
                        return ((C0084a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(w wVar, mt.b<? super b> bVar) {
                    super(2, bVar);
                    this.f4225v = wVar;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    b bVar2 = new b(this.f4225v, bVar);
                    bVar2.f4224u = obj;
                    return bVar2;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    p0 p0Var = (p0) this.f4224u;
                    nt.c.e();
                    if (this.f4223t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    ju.k.d(p0Var, null, null, new C0084a(this.f4225v, null), 3, null);
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j.b bVar, ql.b bVar2, mt.b<? super a> bVar3) {
                super(2, bVar3);
                this.A = bVar;
                this.B = bVar2;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(this.A, this.B, bVar);
                aVar.f4216z = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
            
                if (r15 == r0) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:9:0x00d2  */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = r14.f4216z
                    r1 = r0
                    ju.p0 r1 = (ju.p0) r1
                    java.lang.Object r0 = nt.c.e()
                    int r2 = r14.f4215y
                    java.lang.String r7 = "rbx.achievements.playgames"
                    r8 = 2
                    r3 = 1
                    if (r2 == 0) goto L36
                    if (r2 == r3) goto L2c
                    if (r2 != r8) goto L24
                    java.lang.Object r0 = r14.f4212v
                    ql.w r0 = (ql.w) r0
                    java.lang.Object r0 = r14.f4211u
                    bi.k r0 = (bi.k) r0
                    java.lang.Object r0 = r14.f4210t
                    gt.o.b(r15)
                    goto Lc1
                L24:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L2c:
                    gt.o.b(r15)
                    gt.n r15 = (gt.n) r15
                    java.lang.Object r15 = r15.getValue()
                    goto L51
                L36:
                    gt.o.b(r15)
                    bi.i r15 = bi.i.f4189a
                    j.b r2 = r14.A
                    da.e r2 = da.g.b(r2)
                    java.lang.String r4 = "getGamesSignInClient(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
                    r14.f4216z = r1
                    r14.f4215y = r3
                    java.lang.Object r15 = bi.i.e(r15, r2, r14)
                    if (r15 != r0) goto L51
                    goto Lbf
                L51:
                    j.b r9 = r14.A
                    ql.b r2 = r14.B
                    boolean r3 = gt.n.h(r15)
                    if (r3 == 0) goto Lcc
                    r3 = r15
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r10 = r3.booleanValue()
                    rh.i r3 = rh.h.a()
                    boolean r3 = r3.C()
                    if (r3 == 0) goto L75
                    java.lang.String r3 = bi.g.a()
                    ql.t r4 = ql.t.f29898a
                    r4.m(r10, r3)
                L75:
                    if (r10 == 0) goto Lc3
                    bi.k r11 = new bi.k
                    da.a r3 = da.g.a(r9)
                    java.lang.String r4 = "getAchievementsClient(...)"
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                    r11.<init>(r3)
                    ql.w r12 = new ql.w
                    r12.<init>(r2, r11)
                    bi.i$e$a$a r4 = new bi.i$e$a$a
                    r13 = 0
                    r4.<init>(r12, r13)
                    r5 = 3
                    r6 = 0
                    r2 = 0
                    r3 = 0
                    ju.i.d(r1, r2, r3, r4, r5, r6)
                    androidx.lifecycle.l$b r2 = androidx.lifecycle.l.b.f2630e
                    bi.i$e$a$b r3 = new bi.i$e$a$b
                    r3.<init>(r12, r13)
                    java.lang.Object r1 = ot.l.a(r1)
                    r14.f4216z = r1
                    r14.f4210t = r15
                    java.lang.Object r1 = ot.l.a(r11)
                    r14.f4211u = r1
                    java.lang.Object r1 = ot.l.a(r12)
                    r14.f4212v = r1
                    r14.f4213w = r10
                    r1 = 0
                    r14.f4214x = r1
                    r14.f4215y = r8
                    java.lang.Object r1 = android.view.j0.b(r9, r2, r3, r14)
                    if (r1 != r0) goto Lc0
                Lbf:
                    return r0
                Lc0:
                    r0 = r15
                Lc1:
                    r15 = r0
                    goto Lcc
                Lc3:
                    java.lang.String r0 = "PGS is not authenticated."
                    int r0 = android.util.Log.w(r7, r0)
                    ot.b.c(r0)
                Lcc:
                    java.lang.Throwable r15 = gt.n.e(r15)
                    if (r15 == 0) goto Ld7
                    java.lang.String r0 = "GooglePlayGames signIn failed exceptionally"
                    android.util.Log.w(r7, r0, r15)
                Ld7:
                    kotlin.Unit r15 = kotlin.Unit.f22894a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: bi.i.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j.b bVar, ql.b bVar2, mt.b<? super e> bVar3) {
            super(2, bVar3);
            this.f4208u = bVar;
            this.f4209v = bVar2;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new e(this.f4208u, this.f4209v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4207t;
            if (i10 == 0) {
                o.b(obj);
                j.b bVar = this.f4208u;
                l.b bVar2 = l.b.f2628c;
                a aVar = new a(bVar, this.f4209v, null);
                this.f4207t = 1;
                if (j0.b(bVar, bVar2, aVar, this) == e10) {
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
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageInteractive$1", f = "PlayGamesIntegration.kt", l = {124}, m = "invokeSuspend", v = 1)
    public static final class f extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4228t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e4.q f4229u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e4.q qVar, mt.b<? super f> bVar) {
            super(2, bVar);
            this.f4229u = qVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(this.f4229u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4228t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = i.achievementsInitJob;
                if (d2Var != null) {
                    this.f4228t = 1;
                    if (d2Var.j(this) == e10) {
                        return e10;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f4229u.a().a(i.f4189a);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onHomePageLoaded$1", f = "PlayGamesIntegration.kt", l = {148}, m = "invokeSuspend", v = 1)
    public static final class g extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4230t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e4.q f4231u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e4.q qVar, mt.b<? super g> bVar) {
            super(2, bVar);
            this.f4231u = qVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new g(this.f4231u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4230t;
            if (i10 == 0) {
                o.b(obj);
                d2 d2Var = i.achievementsInitJob;
                if (d2Var != null) {
                    this.f4230t = 1;
                    if (d2Var.j(this) == e10) {
                        return e10;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            this.f4231u.a().a(i.f4189a);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onStop$1", f = "PlayGamesIntegration.kt", l = {212}, m = "invokeSuspend", v = 1)
    public static final class h extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4232t;

        public h(mt.b<? super h> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new h(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4232t;
            if (i10 == 0) {
                o.b(obj);
                m j10 = i.f4189a.j();
                this.f4232t = 1;
                if (j10.l(this) == e10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Ljava/lang/Object;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$repeatOnResumed$2", f = "PlayGamesIntegration.kt", l = {219, 220}, m = "invokeSuspend", v = 1)
    /* renamed from: bi.i$i, reason: collision with other inner class name */
    public static final class C0085i extends ot.m implements Function2<p0, mt.b<? super Object>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4233t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w f4234u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0085i(w wVar, mt.b<? super C0085i> bVar) {
            super(2, bVar);
            this.f4234u = wVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new C0085i(this.f4234u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, mt.b<? super Object> bVar) {
            return invoke2(p0Var, (mt.b<Object>) bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4233t;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    i iVar = i.f4189a;
                    this.f4233t = 1;
                    if (iVar.t(this) == e10) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                        return obj;
                    }
                    o.b(obj);
                }
                w wVar = this.f4234u;
                this.f4233t = 2;
                Object c10 = wVar.c(this);
                return c10 == e10 ? e10 : c10;
            } catch (CancellationException e11) {
                throw e11;
            } catch (Exception e12) {
                Log.w("rbx.achievements.playgames", "unable to continue achievement sync", e12);
                if (rh.h.a().C()) {
                    ql.t.f29898a.o("remote", false);
                }
                return Unit.f22894a;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(p0 p0Var, mt.b<Object> bVar) {
            return ((C0085i) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration", f = "PlayGamesIntegration.kt", l = {241, 244}, m = "startStreakTracker", v = 1)
    public static final class j extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public long f4235t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f4236u;

        /* renamed from: w, reason: collision with root package name */
        public int f4238w;

        public j(mt.b<? super j> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4236u = obj;
            this.f4238w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return i.this.t(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.PlayGamesIntegration$updateAndGrantStreak$2", f = "PlayGamesIntegration.kt", l = {273, 275, 279, 283, 287}, m = "invokeSuspend", v = 1)
    public static final class k extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f4239t;

        /* renamed from: u, reason: collision with root package name */
        public int f4240u;

        /* renamed from: v, reason: collision with root package name */
        public int f4241v;

        /* renamed from: w, reason: collision with root package name */
        public int f4242w;

        public k(mt.b<? super k> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new k(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0125, code lost:
        
            if (r5.f(r13, r12) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
        
            if (r1.f(r9, r12) == r0) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        
            if (r13.m(r12) == r0) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.i.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final boolean l(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (rh.h.a().J5()) {
            return true;
        }
        if (rh.h.a().I1() && bi.f.f4188a.b()) {
            return true;
        }
        if (rh.h.a().A0() && rh.h.a().s3()) {
            return bi.d.e(context);
        }
        return false;
    }

    public static final void m(@NotNull Context context) {
        d2 d10;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onAppCreate");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        d10 = ju.k.d(android.view.t.a(h0.INSTANCE.a()), g1.b(), null, new d(applicationContext, null), 2, null);
        achievementsInitJob = d10;
        da.h.a(applicationContext);
    }

    public static final void n(@NotNull Context context, long btid) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onBtidObtained");
        } else if (rh.h.a().A0()) {
            bi.d.f(context, btid);
        }
    }

    public static final void o(@NotNull e4.q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageInteractive");
        } else {
            observerAttached = true;
            ju.k.d(android.view.t.a(activity), null, null, new f(activity, null), 3, null);
        }
    }

    public static final void p(@NotNull e4.q activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!l(activity)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onHomePageLoaded");
        } else if (observerAttached) {
            ju.k.d(android.view.t.a(activity), null, null, new g(activity, null), 3, null);
        }
    }

    public static final void q(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!l(context)) {
            Log.i("rbx.achievements.playgames", "PGS is not enabled - onSettingsLoaded");
            return;
        }
        if (rh.h.a().A0()) {
            bi.d.g(context);
        }
        m(context);
    }

    public static final m u() {
        SharedPreferences sharedPreferences = RobloxApplication.f().getSharedPreferences("play_games_streak", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return new m(sharedPreferences, g1.b(), rh.h.a().s2() ? RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS : 86400000L, new d0());
    }

    public final Object i(mt.b<? super Unit> bVar) {
        return ju.i.g(g1.b(), new a(null), bVar);
    }

    @NotNull
    public final m j() {
        return (m) streakTracker.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(da.e r6, mt.b<? super gt.n<java.lang.Boolean>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof bi.i.b
            if (r0 == 0) goto L13
            r0 = r7
            bi.i$b r0 = (bi.i.b) r0
            int r1 = r0.f4199w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4199w = r1
            goto L18
        L13:
            bi.i$b r0 = new bi.i$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4197u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4199w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f4196t
            da.e r6 = (da.e) r6
            gt.o.b(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            gt.o.b(r7)
            ju.l0 r7 = ju.g1.b()
            bi.i$c r2 = new bi.i$c
            r4 = 0
            r2.<init>(r6, r4)
            java.lang.Object r6 = ot.l.a(r6)
            r0.f4196t = r6
            r0.f4199w = r3
            java.lang.Object r7 = ju.i.g(r7, r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            gt.n r7 = (gt.n) r7
            java.lang.Object r6 = r7.getValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.i.k(da.e, mt.b):java.lang.Object");
    }

    @Override // android.view.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        j.b bVar = owner instanceof j.b ? (j.b) owner : null;
        if (bVar == null) {
            return;
        }
        ql.b a10 = com.roblox.universalapp.achievement.b.f9827a.a();
        if (a10 == null) {
            Log.w("rbx.achievements.playgames", "no local achievement storage - google play games disabled");
        } else {
            ju.k.d(android.view.t.a(bVar), null, null, new e(bVar, a10, null), 3, null);
        }
    }

    @Override // android.view.f
    public /* bridge */ void onDestroy(@NotNull s sVar) {
        super.onDestroy(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // android.view.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // android.view.f
    public void onStop(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        ju.k.d(android.view.t.a(owner), null, null, new h(null), 3, null);
    }

    @Nullable
    public final Object r(@NotNull w wVar, @NotNull mt.b<Object> bVar) {
        return ju.i.g(g1.b(), new C0085i(wVar, null), bVar);
    }

    public final boolean s() {
        return !hasUnlockedAllStreaks.get() && dk.e.f14964a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(mt.b<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof bi.i.j
            if (r0 == 0) goto L13
            r0 = r8
            bi.i$j r0 = (bi.i.j) r0
            int r1 = r0.f4238w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4238w = r1
            goto L18
        L13:
            bi.i$j r0 = new bi.i$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4236u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f4238w
            java.lang.String r3 = "rbx.achievements.playgames"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            gt.o.b(r8)
            return r8
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            gt.o.b(r8)
            goto L4d
        L3a:
            gt.o.b(r8)
            java.lang.String r8 = "Waiting for valid user id to update streak"
            android.util.Log.i(r3, r8)
            dk.e r8 = dk.e.f14964a
            r0.f4238w = r5
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L4d
            goto L76
        L4d:
            java.lang.Number r8 = (java.lang.Number) r8
            long r5 = r8.longValue()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "User id "
            r8.append(r2)
            r8.append(r5)
            java.lang.String r2 = " signed in, updating streak"
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            android.util.Log.i(r3, r8)
            r0.f4235t = r5
            r0.f4238w = r4
            java.lang.Object r8 = r7.v(r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.i.t(mt.b):java.lang.Object");
    }

    public final Object v(mt.b<? super Unit> bVar) {
        return ju.i.g(g1.b(), new k(null), bVar);
    }
}
