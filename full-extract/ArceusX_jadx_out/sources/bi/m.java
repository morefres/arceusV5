package bi;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.core.view.MotionEventCompat;
import ek.c0;
import ek.n;
import gt.o;
import jg.u;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 &2\u00020\u0001:\u0001\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0013\u0010\u000eJ\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lbi/m;", "", "Landroid/content/SharedPreferences;", "sharedPref", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "streakIntervalMs", "Lek/c0;", "clock", "<init>", "(Landroid/content/SharedPreferences;Lkotlin/coroutines/CoroutineContext;JLek/c0;)V", "", "i", "(Lmt/b;)Ljava/lang/Object;", "", "m", "l", "Lbi/c;", "k", "", "streakKey", "j", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "elapsedTimeStreak", "currentTimeNow", "h", "(Lbi/c;J)Lbi/c;", "g", "()J", ve.a.f33391e, "Landroid/content/SharedPreferences;", j6.b.f21518e, "Lkotlin/coroutines/CoroutineContext;", "c", "J", rl.d.f30696a, "Lek/c0;", "e", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SharedPreferences sharedPref;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineContext coroutineContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long streakIntervalMs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0 clock;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)I"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.StreakTracker$getStreak$2", f = "StreakTracker.kt", l = {MotionEventCompat.AXIS_GENERIC_8}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Integer>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4271t;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return m.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Object e10 = nt.c.e();
            int i11 = this.f4271t;
            if (i11 == 0) {
                o.b(obj);
                m mVar = m.this;
                this.f4271t = 1;
                obj = mVar.k(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            LoginStreak loginStreak = (LoginStreak) obj;
            if (loginStreak != null) {
                m mVar2 = m.this;
                i10 = ((int) ((mVar2.g() - loginStreak.getStreakStartTimestamp()) / mVar2.streakIntervalMs)) + 1;
            } else {
                i10 = 0;
            }
            return ot.b.c(i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Integer> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lbi/c;", "<anonymous>", "(Lju/p0;)Lbi/c;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.StreakTracker$readStreak$3", f = "StreakTracker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function2<p0, mt.b<? super LoginStreak>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4273t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f4275v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f4275v = str;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return m.this.new c(this.f4275v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f4273t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            String string = m.this.sharedPref.getString(this.f4275v, null);
            if (string != null) {
                try {
                    return n.b().j(string, LoginStreak.class);
                } catch (u e10) {
                    Log.e("rbx.achievements.streak_tracker", "Failed to parse login streak from shared preferences", e10);
                }
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super LoginStreak> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.StreakTracker$updateLastActive$2", f = "StreakTracker.kt", l = {99}, m = "invokeSuspend", v = 1)
    public static final class d extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f4276t;

        /* renamed from: u, reason: collision with root package name */
        public int f4277u;

        public d(mt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return m.this.new d(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            long g10;
            Object e10 = nt.c.e();
            int i10 = this.f4277u;
            if (i10 == 0) {
                o.b(obj);
                g10 = m.this.g();
                m mVar = m.this;
                this.f4276t = g10;
                this.f4277u = 1;
                obj = mVar.k(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = this.f4276t;
                o.b(obj);
                g10 = j10;
            }
            LoginStreak loginStreak = (LoginStreak) obj;
            if (loginStreak != null) {
                Log.i("rbx.achievements.streak_tracker", "Continuing existing streak started at " + loginStreak.getStreakStartTimestamp());
                LoginStreak b = LoginStreak.b(loginStreak, 0L, g10, 1, null);
                SharedPreferences.Editor edit = m.this.sharedPref.edit();
                edit.putString("login_streak_current_time", n.c(b));
                edit.apply();
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.googleplaygames.StreakTracker$updateStreak$2", f = "StreakTracker.kt", l = {52, 55}, m = "invokeSuspend", v = 1)
    public static final class e extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f4279t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4280u;

        /* renamed from: v, reason: collision with root package name */
        public int f4281v;

        public e(mt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return m.this.new e(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        
            if (r2 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x004a, code lost:
        
            if (r2 == r1) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0184  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 397
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bi.m.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public m(@NotNull SharedPreferences sharedPref, @NotNull CoroutineContext coroutineContext, long j10, @NotNull c0 clock) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.sharedPref = sharedPref;
        this.coroutineContext = coroutineContext;
        this.streakIntervalMs = j10;
        this.clock = clock;
    }

    public final long g() {
        return this.clock.a();
    }

    public final LoginStreak h(LoginStreak elapsedTimeStreak, long currentTimeNow) {
        long b10 = this.clock.b();
        if (b10 < elapsedTimeStreak.getLastActiveTimestamp() || b10 > elapsedTimeStreak.getLastActiveTimestamp() + this.streakIntervalMs) {
            Log.i("rbx.achievements.streak_tracker", "Elapsed time streak invalid or expired");
            return null;
        }
        long streakStartTimestamp = b10 - elapsedTimeStreak.getStreakStartTimestamp();
        Log.i("rbx.achievements.streak_tracker", "Migrating streak from elapsed time to current time at " + currentTimeNow + ", streak duration is " + streakStartTimestamp + "ms");
        return new LoginStreak(currentTimeNow - streakStartTimestamp, currentTimeNow);
    }

    @Nullable
    public final Object i(@NotNull mt.b<? super Integer> bVar) {
        return ju.i.g(this.coroutineContext, new b(null), bVar);
    }

    public final Object j(String str, mt.b<? super LoginStreak> bVar) {
        return ju.i.g(this.coroutineContext, new c(str, null), bVar);
    }

    public final Object k(mt.b<? super LoginStreak> bVar) {
        return j("login_streak_current_time", bVar);
    }

    @Nullable
    public final Object l(@NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(this.coroutineContext, new d(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    @Nullable
    public final Object m(@NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(this.coroutineContext, new e(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }
}
