package z4;

import android.database.SQLException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.g0;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJB\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u001a0-j\b\u0012\u0004\u0012\u00020\u001a`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lz4/h;", "Lz4/c;", "Lf5/c;", "driver", "", "fileName", "", "preparedStatementCacheSize", "<init>", "(Lf5/c;Ljava/lang/String;I)V", "maxNumOfReaders", "maxNumOfWriters", "(Lf5/c;Ljava/lang/String;III)V", "R", "", "isReadOnly", "Lkotlin/Function2;", "Lx4/g0;", "Lmt/b;", "", "block", "b2", "(ZLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "", "close", "()V", "Lz4/p;", "connection", "Lkotlin/coroutines/CoroutineContext;", "h", "(Lz4/p;)Lkotlin/coroutines/CoroutineContext;", "j", "(Z)V", ve.a.f33391e, "Lf5/c;", "Lz4/o;", j6.b.f21518e, "Lz4/o;", "readers", "c", "writers", "Lz4/b;", rl.d.f30696a, "Lz4/b;", "connectionElementKey", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "e", "Ljava/lang/ThreadLocal;", "connectionThreadLocal", "f", "Z", "isClosed", "Lkotlin/time/a;", "g", "J", "getTimeout-UwyO8pc$room_runtime", "()J", "setTimeout-LRDsOJo$room_runtime", "(J)V", "timeout", "I", "getOnTimeout$room_runtime", "()I", "setOnTimeout$room_runtime", "(I)V", "onTimeout", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h implements z4.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f5.c driver;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final o readers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o writers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z4.b connectionElementKey;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadLocal<p> connectionThreadLocal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isClosed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long timeout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int onTimeout;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {131, 135, 154, 159}, m = "useConnection")
    public static final class a<R> extends ot.d {
        public /* synthetic */ Object A;
        public int C;

        /* renamed from: t, reason: collision with root package name */
        public boolean f37775t;

        /* renamed from: u, reason: collision with root package name */
        public Object f37776u;

        /* renamed from: v, reason: collision with root package name */
        public Object f37777v;

        /* renamed from: w, reason: collision with root package name */
        public Object f37778w;

        /* renamed from: x, reason: collision with root package name */
        public Object f37779x;

        /* renamed from: y, reason: collision with root package name */
        public Object f37780y;

        /* renamed from: z, reason: collision with root package name */
        public Object f37781z;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return h.this.b2(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {132}, m = "invokeSuspend")
    public static final class b<R> extends ot.m implements Function2<p0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f37782t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2<g0, mt.b<? super R>, Object> f37783u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p f37784v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super g0, ? super mt.b<? super R>, ? extends Object> function2, p pVar, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f37783u = function2;
            this.f37784v = pVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(this.f37783u, this.f37784v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f37782t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            Function2<g0, mt.b<? super R>, Object> function2 = this.f37783u;
            p pVar = this.f37784v;
            this.f37782t = 1;
            Object invoke = function2.invoke(pVar, this);
            return invoke == e10 ? e10 : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {159}, m = "invokeSuspend")
    public static final class c<R> extends ot.m implements Function2<p0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f37785t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2<g0, mt.b<? super R>, Object> f37786u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<p> f37787v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super g0, ? super mt.b<? super R>, ? extends Object> function2, c0<p> c0Var, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f37786u = function2;
            this.f37787v = c0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f37786u, this.f37787v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f37785t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            Function2<g0, mt.b<? super R>, Object> function2 = this.f37786u;
            p pVar = this.f37787v.f22963a;
            this.f37785t = 1;
            Object invoke = function2.invoke(pVar, this);
            return invoke == e10 ? e10 : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super R> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public h(@NotNull final f5.c driver, @NotNull final String fileName, int i10) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new z4.b();
        this.connectionThreadLocal = new ThreadLocal<>();
        a.Companion companion = kotlin.time.a.INSTANCE;
        this.timeout = kotlin.time.b.p(30, iu.b.f21121e);
        this.onTimeout = 2;
        this.driver = driver;
        o oVar = new o(1, new Function0() { // from class: z4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                f5.b e10;
                e10 = h.e(f5.c.this, fileName);
                return e10;
            }
        }, i10);
        this.readers = oVar;
        this.writers = oVar;
    }

    public static final f5.b e(f5.c cVar, String str) {
        return cVar.a(str);
    }

    public static final f5.b f(f5.c cVar, String str) {
        f5.b a10 = cVar.a(str);
        f5.a.a(a10, "PRAGMA query_only = 1");
        return a10;
    }

    public static final f5.b g(f5.c cVar, String str) {
        return cVar.a(str);
    }

    public static final Unit l(h hVar, boolean z10) {
        hVar.j(z10);
        return Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:45:0x0121, B:49:0x0131, B:51:0x013c, B:55:0x017a, B:56:0x0181), top: B:44:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #2 {all -> 0x0176, blocks: (B:45:0x0121, B:49:0x0131, B:51:0x013c, B:55:0x017a, B:56:0x0181), top: B:44:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, z4.p] */
    @Override // z4.c
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object b2(boolean r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super x4.g0, ? super mt.b<? super R>, ? extends java.lang.Object> r19, @org.jetbrains.annotations.NotNull mt.b<? super R> r20) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.h.b2(boolean, kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }

    @Override // z4.c, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.readers.c();
        this.writers.c();
    }

    public final CoroutineContext h(p connection) {
        return new z4.a(this.connectionElementKey, connection).plus(y4.d.a(this.connectionThreadLocal, connection));
    }

    public final void j(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.d(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.d(sb2);
        try {
            f5.a.b(5, sb2.toString());
            throw new gt.d();
        } catch (SQLException e10) {
            int i10 = this.onTimeout;
            if (i10 == 1) {
                throw e10;
            }
            if (i10 != 2) {
                return;
            }
            e10.printStackTrace();
        }
    }

    public h(@NotNull final f5.c driver, @NotNull final String fileName, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new z4.b();
        this.connectionThreadLocal = new ThreadLocal<>();
        a.Companion companion = kotlin.time.a.INSTANCE;
        this.timeout = kotlin.time.b.p(30, iu.b.f21121e);
        this.onTimeout = 2;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.driver = driver;
            this.readers = new o(i10, new Function0() { // from class: z4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    f5.b f10;
                    f10 = h.f(f5.c.this, fileName);
                    return f10;
                }
            }, i12);
            this.writers = new o(i11, new Function0() { // from class: z4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    f5.b g10;
                    g10 = h.g(f5.c.this, fileName);
                    return g10;
                }
            }, i12);
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
