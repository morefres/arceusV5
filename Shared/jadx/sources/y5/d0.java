package y5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lju/p0;", "Landroid/content/Context;", "appContext", "Landroidx/work/a;", "configuration", "Landroidx/work/impl/WorkDatabase;", "db", "", "c", "(Lju/p0;Landroid/content/Context;Landroidx/work/a;Landroidx/work/impl/WorkDatabase;)V", "", ve.a.f33391e, "Ljava/lang/String;", "TAG", "", j6.b.f21518e, "J", "MAX_DELAY_MS", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f36358a;
    public static final long b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmu/i;", "", "", "throwable", "", "attempt", "<anonymous>", "(Lmu/i;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend")
    public static final class a extends ot.m implements yt.o<mu.i<? super Boolean>, Throwable, Long, mt.b<? super Boolean>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36359t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f36360u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ long f36361v;

        public a(mt.b<? super a> bVar) {
            super(4, bVar);
        }

        @Override // yt.o
        public /* bridge */ /* synthetic */ Object e(mu.i<? super Boolean> iVar, Throwable th2, Long l10, mt.b<? super Boolean> bVar) {
            return o(iVar, th2, l10.longValue(), bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f36359t;
            if (i10 == 0) {
                gt.o.b(obj);
                Throwable th2 = (Throwable) this.f36360u;
                long j10 = this.f36361v;
                x5.w.e().d(d0.f36358a, "Cannot check for unfinished work", th2);
                long min = Math.min(j10 * 30000, d0.b);
                this.f36359t = 1;
                if (ju.z0.b(min, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            return ot.b.a(true);
        }

        public final Object o(mu.i<? super Boolean> iVar, Throwable th2, long j10, mt.b<? super Boolean> bVar) {
            a aVar = new a(bVar);
            aVar.f36360u = th2;
            aVar.f36361v = j10;
            return aVar.invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "hasUnfinishedWork", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", l = {}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<Boolean, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36362t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ boolean f36363u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f36364v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f36364v = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            b bVar2 = new b(this.f36364v, bVar);
            bVar2.f36363u = ((Boolean) obj).booleanValue();
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, mt.b<? super Unit> bVar) {
            return o(bool.booleanValue(), bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f36362t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            g6.v.c(this.f36364v, RescheduleReceiver.class, this.f36363u);
            return Unit.f22894a;
        }

        public final Object o(boolean z10, mt.b<? super Unit> bVar) {
            return ((b) create(Boolean.valueOf(z10), bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        String i10 = x5.w.i("UnfinishedWorkListener");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(...)");
        f36358a = i10;
        b = TimeUnit.HOURS.toMillis(1L);
    }

    public static final void c(@NotNull ju.p0 p0Var, @NotNull Context appContext, @NotNull androidx.work.a configuration, @NotNull WorkDatabase db2) {
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(db2, "db");
        if (g6.x.b(appContext, configuration)) {
            mu.j.z(mu.j.E(mu.j.m(mu.j.k(mu.j.I(db2.c0().s(), new a(null)))), new b(appContext, null)), p0Var);
        }
    }
}
