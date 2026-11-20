package kh;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.u;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0015\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lkh/g;", "Lkh/a;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "", "Llh/a;", "events", "", rl.d.f30696a, "([Llh/a;Lmt/b;)Ljava/lang/Object;", NotificationCompat.CATEGORY_EVENT, "i", "(Llh/a;Lmt/b;)Ljava/lang/Object;", "", ve.a.f33391e, "(Ljava/util/List;Lmt/b;)Ljava/lang/Object;", "", "g", "(Lmt/b;)Ljava/lang/Object;", "batchSize", "c", "(ILmt/b;)Ljava/lang/Object;", j6.b.f21518e, "Lx4/u;", "Lx4/f;", "Lx4/f;", "__insertAdapterOfAnalyticEvent", "Lx4/e;", "Lx4/e;", "__deleteAdapterOfAnalyticEvent", "e", "__updateAdapterOfAnalyticEvent", "f", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g implements kh.a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final u __db;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.f<AnalyticEvent> __insertAdapterOfAnalyticEvent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.e<AnalyticEvent> __deleteAdapterOfAnalyticEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x4.e<AnalyticEvent> __updateAdapterOfAnalyticEvent;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"kh/g$a", "Lx4/f;", "Llh/a;", "", j6.b.f21518e, "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Llh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends x4.f<AnalyticEvent> {
        @Override // x4.f
        public String b() {
            return "INSERT OR ABORT INTO `analytic_event` (`id`,`serialized_event`,`event_name`,`event_context`,`serialized_params`,`retry_attempt_count`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        @Override // x4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.z(1, entity.getId());
            statement.i0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.C(3);
            } else {
                statement.i0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.C(4);
            } else {
                statement.i0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.C(5);
            } else {
                statement.i0(5, serializedParams);
            }
            if (entity.getRetryAttemptCount() == null) {
                statement.C(6);
            } else {
                statement.z(6, r5.intValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"kh/g$b", "Lx4/e;", "Llh/a;", "", j6.b.f21518e, "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Llh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends x4.e<AnalyticEvent> {
        @Override // x4.e
        public String b() {
            return "DELETE FROM `analytic_event` WHERE `id` = ?";
        }

        @Override // x4.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.z(1, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"kh/g$c", "Lx4/e;", "Llh/a;", "", j6.b.f21518e, "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "e", "(Lf5/d;Llh/a;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends x4.e<AnalyticEvent> {
        @Override // x4.e
        public String b() {
            return "UPDATE OR ABORT `analytic_event` SET `id` = ?,`serialized_event` = ?,`event_name` = ?,`event_context` = ?,`serialized_params` = ?,`retry_attempt_count` = ? WHERE `id` = ?";
        }

        @Override // x4.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, AnalyticEvent entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.z(1, entity.getId());
            statement.i0(2, entity.getSerializedEvent());
            String eventName = entity.getEventName();
            if (eventName == null) {
                statement.C(3);
            } else {
                statement.i0(3, eventName);
            }
            String eventContext = entity.getEventContext();
            if (eventContext == null) {
                statement.C(4);
            } else {
                statement.i0(4, eventContext);
            }
            String serializedParams = entity.getSerializedParams();
            if (serializedParams == null) {
                statement.C(5);
            } else {
                statement.i0(5, serializedParams);
            }
            if (entity.getRetryAttemptCount() == null) {
                statement.C(6);
            } else {
                statement.z(6, r0.intValue());
            }
            statement.z(7, entity.getId());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkh/g$d;", "", "<init>", "()V", "", "Lgu/c;", ve.a.f33391e, "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: kh.g$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<gu.c<?>> a() {
            return p.k();
        }

        public Companion() {
        }
    }

    public g(@NotNull u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfAnalyticEvent = new a();
        this.__deleteAdapterOfAnalyticEvent = new b();
        this.__updateAdapterOfAnalyticEvent = new c();
    }

    public static final Unit s(g gVar, AnalyticEvent analyticEvent, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__deleteAdapterOfAnalyticEvent.c(_connection, analyticEvent);
        return Unit.f22894a;
    }

    public static final List t(String str, int i10, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, i10);
            int c10 = c5.j.c(r32, "id");
            int c11 = c5.j.c(r32, "serialized_event");
            int c12 = c5.j.c(r32, "event_name");
            int c13 = c5.j.c(r32, "event_context");
            int c14 = c5.j.c(r32, "serialized_params");
            int c15 = c5.j.c(r32, "retry_attempt_count");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                arrayList.add(new AnalyticEvent((int) r32.getLong(c10), r32.F2(c11), r32.isNull(c12) ? null : r32.F2(c12), r32.isNull(c13) ? null : r32.F2(c13), r32.isNull(c14) ? null : r32.F2(c14), r32.isNull(c15) ? null : Integer.valueOf((int) r32.getLong(c15))));
            }
            return arrayList;
        } finally {
            r32.close();
        }
    }

    public static final int u(String str, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            return r32.i3() ? (int) r32.getLong(0) : 0;
        } finally {
            r32.close();
        }
    }

    public static final Unit v(g gVar, AnalyticEvent[] analyticEventArr, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__insertAdapterOfAnalyticEvent.e(_connection, analyticEventArr);
        return Unit.f22894a;
    }

    public static final Unit w(g gVar, List list, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        gVar.__updateAdapterOfAnalyticEvent.d(_connection, list);
        return Unit.f22894a;
    }

    @Override // kh.a
    @Nullable
    public Object a(@NotNull final List<AnalyticEvent> list, @NotNull mt.b<? super Unit> bVar) {
        Object e10 = c5.a.e(this.__db, false, true, new Function1() { // from class: kh.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit w5;
                w5 = g.w(g.this, list, (f5.b) obj);
                return w5;
            }
        }, bVar);
        return e10 == nt.c.e() ? e10 : Unit.f22894a;
    }

    @Override // kh.a
    @Nullable
    public Object c(final int i10, @NotNull mt.b<? super List<AnalyticEvent>> bVar) {
        final String str = "SELECT * FROM analytic_event LIMIT ?";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: kh.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List t8;
                t8 = g.t(str, i10, (f5.b) obj);
                return t8;
            }
        }, bVar);
    }

    @Override // kh.a
    @Nullable
    public Object d(@NotNull final AnalyticEvent[] analyticEventArr, @NotNull mt.b<? super Unit> bVar) {
        Object e10 = c5.a.e(this.__db, false, true, new Function1() { // from class: kh.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit v5;
                v5 = g.v(g.this, analyticEventArr, (f5.b) obj);
                return v5;
            }
        }, bVar);
        return e10 == nt.c.e() ? e10 : Unit.f22894a;
    }

    @Override // kh.a
    @Nullable
    public Object g(@NotNull mt.b<? super Integer> bVar) {
        final String str = "SELECT COUNT(*) FROM analytic_event";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: kh.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int u8;
                u8 = g.u(str, (f5.b) obj);
                return Integer.valueOf(u8);
            }
        }, bVar);
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object h(int i10, @NotNull mt.b<? super List<AnalyticEvent>> bVar) {
        return super.h(i10, bVar);
    }

    @Override // kh.a
    @Nullable
    public Object i(@NotNull final AnalyticEvent analyticEvent, @NotNull mt.b<? super Unit> bVar) {
        Object e10 = c5.a.e(this.__db, false, true, new Function1() { // from class: kh.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit s8;
                s8 = g.s(g.this, analyticEvent, (f5.b) obj);
                return s8;
            }
        }, bVar);
        return e10 == nt.c.e() ? e10 : Unit.f22894a;
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object j(@NotNull List<AnalyticEvent> list, @NotNull mt.b<? super Unit> bVar) {
        return super.j(list, bVar);
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object k(@NotNull AnalyticEvent[] analyticEventArr, @NotNull mt.b<? super Boolean> bVar) {
        return super.k(analyticEventArr, bVar);
    }

    @Override // kh.a
    @Nullable
    public /* bridge */ Object l(@NotNull AnalyticEvent analyticEvent, @NotNull mt.b<? super Unit> bVar) {
        return super.l(analyticEvent, bVar);
    }
}
