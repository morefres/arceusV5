package kh;

import androidx.core.app.NotificationCompat;
import androidx.core.view.MotionEventCompat;
import backtraceio.library.services.BacktraceMetrics;
import gt.o;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import lh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bg\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\n\u0010\tJ$\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000b\"\u00020\u0007H\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lkh/a;", "", "", "g", "(Lmt/b;)Ljava/lang/Object;", "batchSize", "", "Llh/a;", "c", "(ILmt/b;)Ljava/lang/Object;", "h", "", "events", "", rl.d.f30696a, "([Llh/a;Lmt/b;)Ljava/lang/Object;", "", "k", ve.a.f33391e, "(Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "j", NotificationCompat.CATEGORY_EVENT, "i", "(Llh/a;Lmt/b;)Ljava/lang/Object;", "l", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f22621a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkh/a$a;", "", "<init>", "()V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kh.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f22621a = new Companion();
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeDeleteEvent$2", f = "AnalyticEventDao.kt", l = {MotionEventCompat.AXIS_GENERIC_11}, m = "invokeSuspend", v = 1)
    public static final class b extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22622t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent f22624v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AnalyticEvent analyticEvent, mt.b<? super b> bVar) {
            super(1, bVar);
            this.f22624v = analyticEvent;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return a.this.new b(this.f22624v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22622t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent analyticEvent = this.f22624v;
                this.f22622t = 1;
                if (aVar.i(analyticEvent, this) == e10) {
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

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Llh/a;", "<anonymous>", "()Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeGetEventsBatch$2", f = "AnalyticEventDao.kt", l = {MotionEventCompat.AXIS_DISTANCE}, m = "invokeSuspend", v = 1)
    public static final class c extends ot.m implements Function1<mt.b<? super List<? extends AnalyticEvent>>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22625t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f22627v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, mt.b<? super c> bVar) {
            super(1, bVar);
            this.f22627v = i10;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return a.this.new c(this.f22627v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22625t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            a aVar = a.this;
            int i11 = this.f22627v;
            this.f22625t = 1;
            Object c10 = aVar.c(i11, this);
            return c10 == e10 ? e10 : c10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super List<AnalyticEvent>> bVar) {
            return ((c) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeInsertEvents$2", f = "AnalyticEventDao.kt", l = {BacktraceMetrics.defaultTimeIntervalInMin}, m = "invokeSuspend", v = 1)
    public static final class d extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22628t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ AnalyticEvent[] f22630v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AnalyticEvent[] analyticEventArr, mt.b<? super d> bVar) {
            super(1, bVar);
            this.f22630v = analyticEventArr;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return a.this.new d(this.f22630v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22628t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                AnalyticEvent[] analyticEventArr = this.f22630v;
                AnalyticEvent[] analyticEventArr2 = (AnalyticEvent[]) Arrays.copyOf(analyticEventArr, analyticEventArr.length);
                this.f22628t = 1;
                if (aVar.d(analyticEventArr2, this) == e10) {
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

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.db.dao.AnalyticEventDao$safeUpdateEvents$2", f = "AnalyticEventDao.kt", l = {MotionEventCompat.AXIS_GENERIC_5}, m = "invokeSuspend", v = 1)
    public static final class e extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f22631t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<AnalyticEvent> f22633v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<AnalyticEvent> list, mt.b<? super e> bVar) {
            super(1, bVar);
            this.f22633v = list;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return a.this.new e(this.f22633v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f22631t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                List<AnalyticEvent> list = this.f22633v;
                this.f22631t = 1;
                if (aVar.a(list, this) == e10) {
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

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super Unit> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static /* synthetic */ Object b(a aVar, int i10, mt.b<? super List<AnalyticEvent>> bVar) {
        return h.a("AnalyticEventDao", aVar.new c(i10, null), bVar);
    }

    static /* synthetic */ Object e(a aVar, AnalyticEvent analyticEvent, mt.b<? super Unit> bVar) {
        Object c10 = h.c("AnalyticEventDao", aVar.new b(analyticEvent, null), bVar);
        return c10 == nt.c.e() ? c10 : Unit.f22894a;
    }

    static /* synthetic */ Object f(a aVar, AnalyticEvent[] analyticEventArr, mt.b<? super Boolean> bVar) {
        return h.b("AnalyticEventDao", aVar.new d(analyticEventArr, null), bVar);
    }

    static /* synthetic */ Object m(a aVar, List<AnalyticEvent> list, mt.b<? super Unit> bVar) {
        Object c10 = h.c("AnalyticEventDao", aVar.new e(list, null), bVar);
        return c10 == nt.c.e() ? c10 : Unit.f22894a;
    }

    @Nullable
    Object a(@NotNull List<AnalyticEvent> list, @NotNull mt.b<? super Unit> bVar);

    @Nullable
    Object c(int i10, @NotNull mt.b<? super List<AnalyticEvent>> bVar);

    @Nullable
    Object d(@NotNull AnalyticEvent[] analyticEventArr, @NotNull mt.b<? super Unit> bVar);

    @Nullable
    Object g(@NotNull mt.b<? super Integer> bVar);

    @Nullable
    default Object h(int i10, @NotNull mt.b<? super List<AnalyticEvent>> bVar) {
        return b(this, i10, bVar);
    }

    @Nullable
    Object i(@NotNull AnalyticEvent analyticEvent, @NotNull mt.b<? super Unit> bVar);

    @Nullable
    default Object j(@NotNull List<AnalyticEvent> list, @NotNull mt.b<? super Unit> bVar) {
        return m(this, list, bVar);
    }

    @Nullable
    default Object k(@NotNull AnalyticEvent[] analyticEventArr, @NotNull mt.b<? super Boolean> bVar) {
        return f(this, analyticEventArr, bVar);
    }

    @Nullable
    default Object l(@NotNull AnalyticEvent analyticEvent, @NotNull mt.b<? super Unit> bVar) {
        return e(this, analyticEvent, bVar);
    }
}
