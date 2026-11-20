package h5;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yt.o;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010(\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u000b2\u0012\u0010'\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010&\u0018\u00010%H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0010\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010&0%H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u0010\u0019J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0011J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0011J\u0017\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0002H\u0000¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0019R\u0016\u0010:\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0019R(\u0010A\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0>\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lh5/e;", "Lg5/c;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "", "l", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "", "sql", "Lg5/g;", "R1", "(Ljava/lang/String;)Lg5/g;", "G", "()V", "r0", "W1", "h", "E0", "n0", "", "D", "()Z", "Lg5/f;", "query", "Landroid/database/Cursor;", "S1", "(Lg5/f;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "whereClause", "", "", "whereArgs", "q2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "R", "(Ljava/lang/String;)V", "bindArgs", "p0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "m0", "Q", "close", "sqLiteDatabase", "m", "(Landroid/database/sqlite/SQLiteDatabase;)Z", ve.a.f33391e, "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "getPath", "()Ljava/lang/String;", "path", "c3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "N", "()Ljava/util/List;", "attachedDbs", j6.b.f21518e, "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e implements g5.c {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String[] f18980c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String[] f18981d = new String[0];

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final gt.h<Method> f18982e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final gt.h<Method> f18983f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SQLiteDatabase delegate;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lh5/e$a;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "getThreadSessionMethod$delegate", "Lgt/h;", rl.d.f30696a, "()Ljava/lang/reflect/Method;", "getThreadSessionMethod", "beginTransactionMethod$delegate", "c", "beginTransactionMethod", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: h5.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Method c() {
            return (Method) e.f18983f.getValue();
        }

        public final Method d() {
            return (Method) e.f18982e.getValue();
        }

        public Companion() {
        }
    }

    static {
        gt.k kVar = gt.k.b;
        f18982e = gt.i.a(kVar, new Function0() { // from class: h5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Method j10;
                j10 = e.j();
                return j10;
            }
        });
        f18983f = gt.i.a(kVar, new Function0() { // from class: h5.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Method g10;
                g10 = e.g();
                return g10;
            }
        });
    }

    public e(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public static final Method g() {
        Class<?> returnType;
        try {
            Method d10 = INSTANCE.d();
            if (d10 == null || (returnType = d10.getReturnType()) == null) {
                return null;
            }
            Class cls = Integer.TYPE;
            return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Method j() {
        try {
            Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final SQLiteCursor n(g5.f fVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNull(sQLiteQuery);
        fVar.b(new j(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor o(o oVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return (Cursor) oVar.e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // g5.c
    public boolean D() {
        return this.delegate.inTransaction();
    }

    @Override // g5.c
    public void E0() {
        this.delegate.endTransaction();
    }

    @Override // g5.c
    public void G() {
        this.delegate.beginTransaction();
    }

    @Override // g5.c
    @Nullable
    public List<Pair<String, String>> N() {
        return this.delegate.getAttachedDbs();
    }

    @Override // g5.c
    public void Q() {
        this.delegate.disableWriteAheadLogging();
    }

    @Override // g5.c
    public void R(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.delegate.execSQL(sql);
    }

    @Override // g5.c
    @NotNull
    public g5.g R1(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "compileStatement(...)");
        return new k(compileStatement);
    }

    @Override // g5.c
    @NotNull
    public Cursor S1(@NotNull final g5.f query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final o oVar = new o() { // from class: h5.c
            @Override // yt.o
            public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                SQLiteCursor n10;
                n10 = e.n(g5.f.this, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
                return n10;
            }
        };
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: h5.d
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor o8;
                o8 = e.o(o.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return o8;
            }
        }, query.a(), f18981d, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    @Override // g5.c
    public void W1() {
        l(null);
    }

    @Override // g5.c
    public boolean c3() {
        return this.delegate.isWriteAheadLoggingEnabled();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // g5.c
    @Nullable
    public String getPath() {
        return this.delegate.getPath();
    }

    public void h(@NotNull SQLiteTransactionListener transactionListener) {
        Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // g5.c
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final void l(SQLiteTransactionListener transactionListener) {
        Companion companion = INSTANCE;
        if (companion.c() == null || companion.d() == null) {
            if (transactionListener != null) {
                h(transactionListener);
                return;
            } else {
                G();
                return;
            }
        }
        Method c10 = companion.c();
        Intrinsics.checkNotNull(c10);
        Method d10 = companion.d();
        Intrinsics.checkNotNull(d10);
        Object invoke = d10.invoke(this.delegate, null);
        if (invoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        c10.invoke(invoke, 0, transactionListener, 0, null);
    }

    public final boolean m(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.c(this.delegate, sqLiteDatabase);
    }

    @Override // g5.c
    public boolean m0() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // g5.c
    public void n0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // g5.c
    public void p0(@NotNull String sql, @NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // g5.c
    public int q2(@NotNull String table, int conflictAlgorithm, @NotNull ContentValues values, @Nullable String whereClause, @Nullable Object[] whereArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f18980c[conflictAlgorithm]);
        sb2.append(table);
        sb2.append(" SET ");
        int i10 = 0;
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? "," : "");
            sb2.append(str);
            objArr[i10] = values.get(str);
            sb2.append("=?");
            i10++;
        }
        if (whereArgs != null) {
            for (int i11 = size; i11 < length; i11++) {
                objArr[i11] = whereArgs[i11 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        g5.g R1 = R1(sb2.toString());
        g5.a.INSTANCE.b(R1, objArr);
        return R1.V();
    }

    @Override // g5.c
    public void r0() {
        this.delegate.beginTransactionNonExclusive();
    }
}
