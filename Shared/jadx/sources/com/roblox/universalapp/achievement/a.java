package com.roblox.universalapp.achievement;

import c5.n;
import gt.l;
import gt.o;
import gu.c;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mu.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ql.Achievement;
import ql.LocalAchievement;
import ql.RemoteAchievement;
import ql.j;
import ql.m;
import x4.f;
import x4.u;
import z4.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010!\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u00062"}, d2 = {"Lcom/roblox/universalapp/achievement/a;", "Lql/b;", "Lx4/u;", "__db", "<init>", "(Lx4/u;)V", "Lql/l;", "localAchievement", "", "f", "(Lql/l;Lmt/b;)Ljava/lang/Object;", "", "Lql/u;", "remoteAchievements", "", "e", "(Ljava/util/List;Lmt/b;)Ljava/lang/Object;", rl.d.f30696a, "Lql/a;", "h", "(Lmt/b;)Ljava/lang/Object;", "", "highWatermarkId", "Lmu/h;", "c", "(I)Lmu/h;", "", "codeName", "g", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "codeNames", "Ljava/time/Instant;", "syncedAt", ve.a.f33391e, "(Ljava/util/List;Ljava/time/Instant;Lmt/b;)Ljava/lang/Object;", "Lql/m;", "_value", "p", "(Lql/m;)Ljava/lang/String;", "q", "(Ljava/lang/String;)Lql/m;", "Lx4/u;", "Lx4/f;", j6.b.f21518e, "Lx4/f;", "__insertAdapterOfLocalAchievementAsAchievement", "Lql/j;", "Lql/j;", "__converters", "__insertAdapterOfRemoteAchievementAsAchievement", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements ql.b {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final u __db;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f<LocalAchievement> __insertAdapterOfLocalAchievementAsAchievement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j __converters;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f<RemoteAchievement> __insertAdapterOfRemoteAchievementAsAchievement;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/roblox/universalapp/achievement/a$a", "Lx4/f;", "Lql/l;", "", j6.b.f21518e, "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lql/l;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.universalapp.achievement.a$a, reason: collision with other inner class name */
    public static final class C0159a extends f<LocalAchievement> {
        public C0159a() {
        }

        @Override // x4.f
        public String b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`created_ts`,`origin`) VALUES (?,?,?)";
        }

        @Override // x4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, LocalAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.i0(1, entity.getCodeName());
            Long b = a.this.__converters.b(entity.getCreatedTs());
            if (b == null) {
                statement.C(2);
            } else {
                statement.z(2, b.longValue());
            }
            statement.i0(3, a.this.p(entity.getOrigin()));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/roblox/universalapp/achievement/a$b", "Lx4/f;", "Lql/u;", "", j6.b.f21518e, "()Ljava/lang/String;", "Lf5/d;", "statement", "entity", "", "g", "(Lf5/d;Lql/u;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends f<RemoteAchievement> {
        public b() {
        }

        @Override // x4.f
        public String b() {
            return "INSERT OR IGNORE INTO `achievements` (`code_name`,`synced_ts`,`origin`,`created_ts`) VALUES (?,?,?,?)";
        }

        @Override // x4.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void a(f5.d statement, RemoteAchievement entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.i0(1, entity.getCodeName());
            Long b = a.this.__converters.b(entity.getSyncedTs());
            if (b == null) {
                statement.C(2);
            } else {
                statement.z(2, b.longValue());
            }
            statement.i0(3, a.this.p(entity.getOrigin()));
            Long b10 = a.this.__converters.b(entity.getCreatedTs());
            if (b10 == null) {
                statement.C(4);
            } else {
                statement.z(4, b10.longValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/roblox/universalapp/achievement/a$c;", "", "<init>", "()V", "", "Lgu/c;", ve.a.f33391e, "()Ljava/util/List;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.universalapp.achievement.a$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<c<?>> a() {
            return p.k();
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9823a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.f29895a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9823a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.universalapp.achievement.AchievementDao_Impl$replicateRemoteAchievements$2", f = "AchievementDao_Impl.kt", l = {87}, m = "invokeSuspend", v = 1)
    public static final class e extends ot.m implements Function1<mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f9824t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ List<RemoteAchievement> f9826v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<RemoteAchievement> list, mt.b<? super e> bVar) {
            super(1, bVar);
            this.f9826v = list;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return a.this.new e(this.f9826v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f9824t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                List<RemoteAchievement> list = this.f9826v;
                this.f9824t = 1;
                if (a.super.d(list, this) == e10) {
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

    public a(@NotNull u __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new j();
        this.__db = __db;
        this.__insertAdapterOfLocalAchievementAsAchievement = new C0159a();
        this.__insertAdapterOfRemoteAchievementAsAchievement = new b();
    }

    public static final long u(a aVar, LocalAchievement localAchievement, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        return aVar.__insertAdapterOfLocalAchievementAsAchievement.f(_connection, localAchievement);
    }

    public static final Unit v(a aVar, List list, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        aVar.__insertAdapterOfRemoteAchievementAsAchievement.c(_connection, list);
        return Unit.f22894a;
    }

    public static final Achievement w(String str, String str2, a aVar, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.i0(1, str2);
            int c10 = c5.j.c(r32, "Id");
            int c11 = c5.j.c(r32, "code_name");
            int c12 = c5.j.c(r32, "origin");
            int c13 = c5.j.c(r32, "created_ts");
            int c14 = c5.j.c(r32, "synced_ts");
            Achievement achievement = null;
            Long valueOf = null;
            if (r32.i3()) {
                int i10 = (int) r32.getLong(c10);
                String F2 = r32.F2(c11);
                m q10 = aVar.q(r32.F2(c12));
                Instant a10 = aVar.__converters.a(r32.isNull(c13) ? null : Long.valueOf(r32.getLong(c13)));
                if (a10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!r32.isNull(c14)) {
                    valueOf = Long.valueOf(r32.getLong(c14));
                }
                achievement = new Achievement(i10, F2, q10, a10, aVar.__converters.a(valueOf));
            }
            r32.close();
            return achievement;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List x(String str, a aVar, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            int c10 = c5.j.c(r32, "Id");
            int c11 = c5.j.c(r32, "code_name");
            int c12 = c5.j.c(r32, "origin");
            int c13 = c5.j.c(r32, "created_ts");
            int c14 = c5.j.c(r32, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                int i10 = (int) r32.getLong(c10);
                String F2 = r32.F2(c11);
                m q10 = aVar.q(r32.F2(c12));
                Long l10 = null;
                Instant a10 = aVar.__converters.a(r32.isNull(c13) ? null : Long.valueOf(r32.getLong(c13)));
                if (a10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!r32.isNull(c14)) {
                    l10 = Long.valueOf(r32.getLong(c14));
                }
                arrayList.add(new Achievement(i10, F2, q10, a10, aVar.__converters.a(l10)));
            }
            r32.close();
            return arrayList;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final Unit y(String str, a aVar, Instant instant, List list, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            Long b10 = aVar.__converters.b(instant);
            if (b10 == null) {
                r32.C(1);
            } else {
                r32.z(1, b10.longValue());
            }
            Iterator it = list.iterator();
            int i10 = 2;
            while (it.hasNext()) {
                r32.i0(i10, (String) it.next());
                i10++;
            }
            r32.i3();
            r32.close();
            return Unit.f22894a;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    public static final List z(String str, int i10, a aVar, f5.b _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        f5.d r32 = _connection.r3(str);
        try {
            r32.z(1, i10);
            int c10 = c5.j.c(r32, "Id");
            int c11 = c5.j.c(r32, "code_name");
            int c12 = c5.j.c(r32, "origin");
            int c13 = c5.j.c(r32, "created_ts");
            int c14 = c5.j.c(r32, "synced_ts");
            ArrayList arrayList = new ArrayList();
            while (r32.i3()) {
                int i11 = (int) r32.getLong(c10);
                String F2 = r32.F2(c11);
                m q10 = aVar.q(r32.F2(c12));
                Long l10 = null;
                Instant a10 = aVar.__converters.a(r32.isNull(c13) ? null : Long.valueOf(r32.getLong(c13)));
                if (a10 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                }
                if (!r32.isNull(c14)) {
                    l10 = Long.valueOf(r32.getLong(c14));
                }
                arrayList.add(new Achievement(i11, F2, q10, a10, aVar.__converters.a(l10)));
            }
            r32.close();
            return arrayList;
        } catch (Throwable th2) {
            r32.close();
            throw th2;
        }
    }

    @Override // ql.b
    @Nullable
    public Object a(@NotNull final List<String> list, @NotNull final Instant instant, @NotNull mt.b<? super Unit> bVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE achievements SET synced_ts = ");
        sb2.append("?");
        sb2.append(" WHERE code_name in (");
        n.a(sb2, list.size());
        sb2.append(") and synced_ts IS NULL");
        final String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        Object e10 = c5.a.e(this.__db, false, true, new Function1() { // from class: ql.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit y10;
                y10 = com.roblox.universalapp.achievement.a.y(sb3, this, instant, list, (f5.b) obj);
                return y10;
            }
        }, bVar);
        return e10 == nt.c.e() ? e10 : Unit.f22894a;
    }

    @Override // ql.b
    @NotNull
    public h<List<Achievement>> c(final int highWatermarkId) {
        final String str = "SELECT * FROM achievements where id > ? and synced_ts IS NULL";
        return k.a(this.__db, false, new String[]{"achievements"}, new Function1() { // from class: ql.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List z10;
                z10 = com.roblox.universalapp.achievement.a.z(str, highWatermarkId, this, (f5.b) obj);
                return z10;
            }
        });
    }

    @Override // ql.b
    @Nullable
    public Object d(@NotNull List<RemoteAchievement> list, @NotNull mt.b<? super Unit> bVar) {
        Object d10 = c5.a.d(this.__db, new e(list, null), bVar);
        return d10 == nt.c.e() ? d10 : Unit.f22894a;
    }

    @Override // ql.b
    @Nullable
    public Object e(@NotNull final List<RemoteAchievement> list, @NotNull mt.b<? super Unit> bVar) {
        Object e10 = c5.a.e(this.__db, false, true, new Function1() { // from class: ql.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit v5;
                v5 = com.roblox.universalapp.achievement.a.v(com.roblox.universalapp.achievement.a.this, list, (f5.b) obj);
                return v5;
            }
        }, bVar);
        return e10 == nt.c.e() ? e10 : Unit.f22894a;
    }

    @Override // ql.b
    @Nullable
    public Object f(@NotNull final LocalAchievement localAchievement, @NotNull mt.b<? super Long> bVar) {
        return c5.a.e(this.__db, false, true, new Function1() { // from class: ql.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long u8;
                u8 = com.roblox.universalapp.achievement.a.u(com.roblox.universalapp.achievement.a.this, localAchievement, (f5.b) obj);
                return Long.valueOf(u8);
            }
        }, bVar);
    }

    @Override // ql.b
    @Nullable
    public Object g(@NotNull final String str, @NotNull mt.b<? super Achievement> bVar) {
        final String str2 = "SELECT * from achievements WHERE code_name = ?";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: ql.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Achievement w5;
                w5 = com.roblox.universalapp.achievement.a.w(str2, str, this, (f5.b) obj);
                return w5;
            }
        }, bVar);
    }

    @Override // ql.b
    @Nullable
    public Object h(@NotNull mt.b<? super List<Achievement>> bVar) {
        final String str = "SELECT * FROM achievements";
        return c5.a.e(this.__db, true, false, new Function1() { // from class: ql.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List x10;
                x10 = com.roblox.universalapp.achievement.a.x(str, this, (f5.b) obj);
                return x10;
            }
        }, bVar);
    }

    public final String p(m _value) {
        int i10 = d.f9823a[_value.ordinal()];
        if (i10 == 1) {
            return "LOCAL";
        }
        if (i10 == 2) {
            return "REMOTE";
        }
        throw new l();
    }

    public final m q(String _value) {
        if (Intrinsics.c(_value, "LOCAL")) {
            return m.f29895a;
        }
        if (Intrinsics.c(_value, "REMOTE")) {
            return m.b;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
}
