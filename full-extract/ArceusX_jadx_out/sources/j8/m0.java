package j8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b8.i;
import e8.a;
import e8.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import k8.b;

/* loaded from: classes.dex */
public class m0 implements j8.d, k8.b, j8.c {

    /* renamed from: f, reason: collision with root package name */
    public static final y7.c f21552f = y7.c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final t0 f21553a;
    public final l8.a b;

    /* renamed from: c, reason: collision with root package name */
    public final l8.a f21554c;

    /* renamed from: d, reason: collision with root package name */
    public final e f21555d;

    /* renamed from: e, reason: collision with root package name */
    public final ft.a<String> f21556e;

    public interface b<T, U> {
        U apply(T t8);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f21557a;
        public final String b;

        public c(String str, String str2) {
            this.f21557a = str;
            this.b = str2;
        }
    }

    public interface d<T> {
        T a();
    }

    public m0(l8.a aVar, l8.a aVar2, e eVar, t0 t0Var, ft.a<String> aVar3) {
        this.f21553a = t0Var;
        this.b = aVar;
        this.f21554c = aVar2;
        this.f21555d = eVar;
        this.f21556e = aVar3;
    }

    public static /* synthetic */ Object B(Throwable th2) {
        throw new k8.a("Timed out while trying to acquire the lock.", th2);
    }

    public static byte[] C0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object F(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) M0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: j8.y
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.getCount() > 0);
                return valueOf;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object H(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer I(final m0 m0Var, long j10, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        String[] strArr = {String.valueOf(j10)};
        M0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: j8.s
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.l(m0.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static y7.c J0(String str) {
        return str == null ? f21552f : y7.c.b(str);
    }

    public static /* synthetic */ Object L(m0 m0Var, List list, b8.o oVar, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = b8.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new b8.h(J0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new b8.h(J0(cursor.getString(4)), m0Var.F0(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    public static String L0(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static /* synthetic */ Object M(m0 m0Var, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m0Var.b.a()).execute();
        return null;
    }

    public static <T> T M0(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ e8.a P(final m0 m0Var, String str, final Map map, final a.C0296a c0296a, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        return (e8.a) M0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: j8.a0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.s(m0.this, map, c0296a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long U(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ e8.f W(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (e8.f) M0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: j8.d0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.e(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ e8.f e(long j10, Cursor cursor) {
        cursor.moveToNext();
        return e8.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ List f(m0 m0Var, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        List<k> x02 = m0Var.x0(sQLiteDatabase, oVar, m0Var.f21555d.d());
        for (y7.e eVar : y7.e.values()) {
            if (eVar != oVar.d()) {
                int d10 = m0Var.f21555d.d() - x02.size();
                if (d10 <= 0) {
                    break;
                }
                x02.addAll(m0Var.x0(sQLiteDatabase, oVar.f(eVar), d10));
            }
        }
        return m0Var.w0(x02, m0Var.B0(sQLiteDatabase, x02));
    }

    public static /* synthetic */ List g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(b8.o.a().b(cursor.getString(1)).d(m8.a.b(cursor.getInt(2))).c(C0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object h(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.d(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase j(Throwable th2) {
        throw new k8.a("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Object l(m0 m0Var, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            m0Var.d(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object m(final m0 m0Var, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m0Var.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        M0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: j8.v
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.h(m0.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean n(m0 m0Var, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long q02 = m0Var.q0(sQLiteDatabase, oVar);
        return q02 == null ? Boolean.FALSE : (Boolean) M0(m0Var.c0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{q02.toString()}), new b() { // from class: j8.u
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object o(long j10, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m8.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(m8.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] q(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List r(SQLiteDatabase sQLiteDatabase) {
        return (List) M0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: j8.k0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.g((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ e8.a s(m0 m0Var, Map map, a.C0296a c0296a, Cursor cursor) {
        m0Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b X = m0Var.X(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(e8.c.c().c(X).b(j10).a());
        }
        m0Var.D0(c0296a, map);
        c0296a.e(m0Var.o0());
        c0296a.d(m0Var.e0());
        c0296a.c(m0Var.f21556e.get());
        return c0296a.b();
    }

    public static /* synthetic */ Long w(m0 m0Var, b8.i iVar, b8.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m0Var.v0()) {
            m0Var.d(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long Z = m0Var.Z(sQLiteDatabase, oVar);
        int e10 = m0Var.f21555d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(Z));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ Object x(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long y(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public final Map<Long, Set<c>> B0(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        M0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: j8.z
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.H(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    public final void D0(a.C0296a c0296a, Map<String, List<e8.c>> map) {
        for (Map.Entry<String, List<e8.c>> entry : map.entrySet()) {
            c0296a.a(e8.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    public final byte[] F0(long j10) {
        return (byte[]) M0(c0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: j8.b0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.q((Cursor) obj);
            }
        });
    }

    public final <T> T H0(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f21554c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f21554c.a() >= this.f21555d.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // j8.d
    public void J(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            c0().compileStatement("DELETE FROM events WHERE _id in " + L0(iterable)).execute();
        }
    }

    @Override // j8.d
    public boolean K(final b8.o oVar) {
        return ((Boolean) u0(new b() { // from class: j8.o
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.n(m0.this, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // j8.d
    public k S0(final b8.o oVar, final b8.i iVar) {
        f8.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) u0(new b() { // from class: j8.i0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.w(m0.this, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, oVar, iVar);
    }

    public final c.b X(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        f8.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    public final void Y(final SQLiteDatabase sQLiteDatabase) {
        H0(new d() { // from class: j8.l
            @Override // j8.m0.d
            public final Object a() {
                return m0.x(sQLiteDatabase);
            }
        }, new b() { // from class: j8.w
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.B((Throwable) obj);
            }
        });
    }

    public final long Z(SQLiteDatabase sQLiteDatabase, b8.o oVar) {
        Long q02 = q0(sQLiteDatabase, oVar);
        if (q02 != null) {
            return q02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(m8.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // j8.c
    public void a() {
        u0(new b() { // from class: j8.q
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.M(m0.this, (SQLiteDatabase) obj);
            }
        });
    }

    public long a0() {
        return g0() * j0();
    }

    @Override // k8.b
    public <T> T b(b.a<T> aVar) {
        SQLiteDatabase c02 = c0();
        Y(c02);
        try {
            T execute = aVar.execute();
            c02.setTransactionSuccessful();
            return execute;
        } finally {
            c02.endTransaction();
        }
    }

    @Override // j8.c
    public e8.a c() {
        final a.C0296a e10 = e8.a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (e8.a) u0(new b() { // from class: j8.t
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.P(m0.this, str, hashMap, e10, (SQLiteDatabase) obj);
            }
        });
    }

    public SQLiteDatabase c0() {
        final t0 t0Var = this.f21553a;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) H0(new d() { // from class: j8.e0
            @Override // j8.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, new b() { // from class: j8.f0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.j((Throwable) obj);
            }
        });
    }

    @Override // j8.d
    public Iterable<k> c1(final b8.o oVar) {
        return (Iterable) u0(new b() { // from class: j8.m
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.f(m0.this, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // j8.d
    public int cleanUp() {
        final long a10 = this.b.a() - this.f21555d.c();
        return ((Integer) u0(new b() { // from class: j8.j0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.I(m0.this, a10, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21553a.close();
    }

    @Override // j8.c
    public void d(final long j10, final c.b bVar, final String str) {
        u0(new b() { // from class: j8.r
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.F(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    public final e8.b e0() {
        return e8.b.b().b(e8.e.c().b(a0()).c(e.f21539a.f()).a()).a();
    }

    @Override // j8.d
    public Iterable<b8.o> f0() {
        return (Iterable) u0(new b() { // from class: j8.g0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.r((SQLiteDatabase) obj);
            }
        });
    }

    public final long g0() {
        return c0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long j0() {
        return c0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    @Override // j8.d
    public void n2(final b8.o oVar, final long j10) {
        u0(new b() { // from class: j8.p
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.o(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final e8.f o0() {
        final long a10 = this.b.a();
        return (e8.f) u0(new b() { // from class: j8.c0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.W(a10, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long q0(SQLiteDatabase sQLiteDatabase, b8.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(m8.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) M0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: j8.n
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.y((Cursor) obj);
            }
        });
    }

    @Override // j8.d
    public void r1(Iterable<k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + L0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            u0(new b() { // from class: j8.l0
                @Override // j8.m0.b
                public final Object apply(Object obj) {
                    return m0.m(m0.this, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // j8.d
    public long s0(b8.o oVar) {
        return ((Long) M0(c0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(m8.a.a(oVar.d()))}), new b() { // from class: j8.h0
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.U((Cursor) obj);
            }
        })).longValue();
    }

    public <T> T u0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase c02 = c0();
        c02.beginTransaction();
        try {
            T apply = bVar.apply(c02);
            c02.setTransactionSuccessful();
            return apply;
        } finally {
            c02.endTransaction();
        }
    }

    public final boolean v0() {
        return g0() * j0() >= this.f21555d.f();
    }

    public final List<k> w0(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f21557a, cVar.b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    public final List<k> x0(SQLiteDatabase sQLiteDatabase, final b8.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long q02 = q0(sQLiteDatabase, oVar);
        if (q02 == null) {
            return arrayList;
        }
        M0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{q02.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: j8.x
            @Override // j8.m0.b
            public final Object apply(Object obj) {
                return m0.L(m0.this, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }
}
