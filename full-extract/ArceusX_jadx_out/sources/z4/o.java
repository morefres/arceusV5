package z4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\f2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b$\u0010 R\u0018\u0010(\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lz4/o;", "", "", "capacity", "Lkotlin/Function0;", "Lf5/b;", "connectionFactory", "preparedStatementCacheSize", "<init>", "(ILkotlin/jvm/functions/Function0;I)V", "Lkotlin/time/a;", "timeout", "", "onTimeout", "Lz4/j;", j6.b.f21518e, "(JLkotlin/jvm/functions/Function0;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "connection", "e", "(Lz4/j;)V", "c", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", rl.d.f30696a, "(Ljava/lang/StringBuilder;)V", "f", "I", "getCapacity", "()I", "Lkotlin/jvm/functions/Function0;", "getConnectionFactory", "()Lkotlin/jvm/functions/Function0;", "getPreparedStatementCacheSize", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "size", "", "Z", "isClosed", "", "g", "[Lz4/j;", "connections", "Ltu/h;", "h", "Ltu/h;", "connectionPermits", "Lkotlin/collections/i;", "i", "Lkotlin/collections/i;", "availableConnections", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<f5.b> connectionFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int preparedStatementCacheSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j[] connections;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tu.h connectionPermits;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<j> availableConnections;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {253}, m = "acquire")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f37842t;

        /* renamed from: v, reason: collision with root package name */
        public int f37844v;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37842t = obj;
            this.f37844v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return o.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquireWithTimeout-KLykuaI")
    public static final class b extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public long f37845t;

        /* renamed from: u, reason: collision with root package name */
        public Object f37846u;

        /* renamed from: v, reason: collision with root package name */
        public Object f37847v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f37848w;

        /* renamed from: y, reason: collision with root package name */
        public int f37850y;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37848w = obj;
            this.f37850y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return o.this.b(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {231}, m = "invokeSuspend")
    public static final class c extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f37851t;

        /* renamed from: u, reason: collision with root package name */
        public int f37852u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<j> f37853v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ o f37854w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0<j> c0Var, o oVar, mt.b<? super c> bVar) {
            super(2, bVar);
            this.f37853v = c0Var;
            this.f37854w = oVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new c(this.f37853v, this.f37854w, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            c0<j> c0Var;
            T t8;
            Object e10 = nt.c.e();
            int i10 = this.f37852u;
            if (i10 == 0) {
                gt.o.b(obj);
                c0<j> c0Var2 = this.f37853v;
                o oVar = this.f37854w;
                this.f37851t = c0Var2;
                this.f37852u = 1;
                Object a10 = oVar.a(this);
                if (a10 == e10) {
                    return e10;
                }
                c0Var = c0Var2;
                t8 = a10;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (c0) this.f37851t;
                gt.o.b(obj);
                t8 = obj;
            }
            c0Var.f22963a = t8;
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(int i10, @NotNull Function0<? extends f5.b> connectionFactory, int i11) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.capacity = i10;
        this.connectionFactory = connectionFactory;
        this.preparedStatementCacheSize = i11;
        this.lock = new ReentrantLock();
        this.connections = new j[i10];
        this.connectionPermits = tu.l.b(i10, 0, 2, null);
        this.availableConnections = new kotlin.collections.i<>(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0044, B:15:0x0048, B:17:0x0050, B:18:0x0056, B:22:0x0064, B:23:0x0070), top: B:12:0x0044, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #1 {all -> 0x0054, blocks: (B:13:0x0044, B:15:0x0048, B:17:0x0050, B:18:0x0056, B:22:0x0064, B:23:0x0070), top: B:12:0x0044, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull mt.b<? super z4.j> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z4.o.a
            if (r0 == 0) goto L13
            r0 = r5
            z4.o$a r0 = (z4.o.a) r0
            int r1 = r0.f37844v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37844v = r1
            goto L18
        L13:
            z4.o$a r0 = new z4.o$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f37842t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f37844v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            gt.o.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            gt.o.b(r5)
            tu.h r5 = r4.connectionPermits
            r0.f37844v = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.concurrent.locks.ReentrantLock r5 = r4.lock     // Catch: java.lang.Throwable -> L62
            r5.lock()     // Catch: java.lang.Throwable -> L62
            boolean r0 = r4.isClosed     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L64
            kotlin.collections.i<z4.j> r0 = r4.availableConnections     // Catch: java.lang.Throwable -> L54
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L56
            r4.f()     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r0 = move-exception
            goto L71
        L56:
            kotlin.collections.i<z4.j> r0 = r4.availableConnections     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L54
            z4.j r0 = (z4.j) r0     // Catch: java.lang.Throwable -> L54
            r5.unlock()     // Catch: java.lang.Throwable -> L62
            return r0
        L62:
            r5 = move-exception
            goto L75
        L64:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            f5.a.b(r1, r0)     // Catch: java.lang.Throwable -> L54
            gt.d r0 = new gt.d     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L54
        L71:
            r5.unlock()     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L75:
            tu.h r0 = r4.connectionPermits
            r0.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.o.a(mt.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r11 = r11;
        r10 = r10;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:14:0x006b, B:16:0x006f, B:30:0x0077, B:33:0x007e), top: B:13:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:12:0x005c). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r10, @org.jetbrains.annotations.NotNull mt.b<? super z4.j> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof z4.o.b
            if (r0 == 0) goto L13
            r0 = r11
            z4.o$b r0 = (z4.o.b) r0
            int r1 = r0.f37850y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37850y = r1
            goto L18
        L13:
            z4.o$b r0 = new z4.o$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f37848w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f37850y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r8 = r0.f37845t
            java.lang.Object r10 = r0.f37847v
            kotlin.jvm.internal.c0 r10 = (kotlin.jvm.internal.c0) r10
            java.lang.Object r2 = r0.f37846u
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            gt.o.b(r11)     // Catch: java.lang.Throwable -> L34
            goto L5c
        L34:
            r11 = move-exception
            goto L66
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            gt.o.b(r11)
        L41:
            kotlin.jvm.internal.c0 r11 = new kotlin.jvm.internal.c0
            r11.<init>()
            z4.o$c r2 = new z4.o$c     // Catch: java.lang.Throwable -> L61
            r2.<init>(r11, r7, r4)     // Catch: java.lang.Throwable -> L61
            r0.f37846u = r10     // Catch: java.lang.Throwable -> L61
            r0.f37847v = r11     // Catch: java.lang.Throwable -> L61
            r0.f37845t = r8     // Catch: java.lang.Throwable -> L61
            r0.f37850y = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = ju.g3.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L61
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r2 = r10
            r10 = r11
        L5c:
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r4
            goto L6b
        L61:
            r2 = move-exception
            r6 = r2
            r2 = r10
            r10 = r11
            r11 = r6
        L66:
            r6 = r11
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r6
        L6b:
            boolean r5 = r0 instanceof ju.e3     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            r10.invoke()     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r8 = move-exception
            goto L7f
        L75:
            if (r0 != 0) goto L7e
            T r11 = r11.f22963a     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L7c
            return r11
        L7c:
            r0 = r2
            goto L41
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L7f:
            T r9 = r11.f22963a
            z4.j r9 = (z4.j) r9
            if (r9 == 0) goto L88
            r7.e(r9)
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.o.b(long, kotlin.jvm.functions.Function0, mt.b):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (j jVar : this.connections) {
                if (jVar != null) {
                    jVar.close();
                }
            }
            Unit unit = Unit.f22894a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List c10 = kotlin.collections.o.c();
            int size = this.availableConnections.size();
            for (int i10 = 0; i10 < size; i10++) {
                c10.add(this.availableConnections.get(i10));
            }
            List a10 = kotlin.collections.o.a(c10);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.b() + ", ");
            builder.append("queue=(size=" + a10.size() + ")[" + CollectionsKt.m0(a10, null, null, null, 0, null, null, 63, null) + ']');
            builder.append(")");
            builder.append('\n');
            j[] jVarArr = this.connections;
            int length = jVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                j jVar = jVarArr[i12];
                i11++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i11);
                sb2.append("] - ");
                sb2.append(jVar != null ? jVar.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (jVar != null) {
                    jVar.b(builder);
                }
            }
            Unit unit = Unit.f22894a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(@NotNull j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connection);
            Unit unit = Unit.f22894a;
            reentrantLock.unlock();
            this.connectionPermits.a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void f() {
        if (this.size >= this.capacity) {
            return;
        }
        j jVar = new j(this.connectionFactory.invoke(), null, this.preparedStatementCacheSize, 2, null);
        j[] jVarArr = this.connections;
        int i10 = this.size;
        this.size = i10 + 1;
        jVarArr[i10] = jVar;
        this.availableConnections.addLast(jVar);
    }
}
