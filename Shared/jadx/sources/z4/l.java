package z4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.f0;
import x4.g0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aBQ\u0012@\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0082@¢\u0006\u0004\b\u001c\u0010\u0018RQ\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00060#j\u0002`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"¨\u0006+"}, d2 = {"Lz4/l;", "Lx4/g0;", "Lz4/q;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lmt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "Lf5/b;", "delegate", "<init>", "(Lkotlin/jvm/functions/Function2;Lf5/b;)V", "R", "", "sql", "Lf5/d;", "block", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "Lx4/g0$a;", Payload.TYPE, "Lx4/f0;", j6.b.f21518e, "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "g", "Lkotlin/jvm/functions/Function2;", "getTransactionWrapper", "()Lkotlin/jvm/functions/Function2;", "Lf5/b;", "f", "()Lf5/b;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nestedTransactionCount", rl.d.f30696a, "Lx4/g0$a;", "currentTransactionType", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements g0, q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function2<Function1<? super mt.b<Object>, ? extends Object>, mt.b<Object>, Object> transactionWrapper;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f5.b delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AtomicInteger nestedTransactionCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public g0.a currentTransactionType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz4/l$a;", "T", "Lx4/f0;", "Lz4/q;", "<init>", "(Lz4/l;)V", "R", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "block", "c", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "Lf5/b;", rl.d.f30696a, "()Lf5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a<T> implements f0<T>, q {
        public a() {
        }

        @Override // x4.m
        @Nullable
        public <R> Object c(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull mt.b<? super R> bVar) {
            return l.this.c(str, function1, bVar);
        }

        @Override // z4.q
        @NotNull
        /* renamed from: d */
        public f5.b getDelegate() {
            return l.this.getDelegate();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37808a;

        static {
            int[] iArr = new int[g0.a.values().length];
            try {
                iArr[g0.a.f35073a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.a.f35074c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37808a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {127}, m = "transaction")
    public static final class c<R> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public int f37809t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f37810u;

        /* renamed from: w, reason: collision with root package name */
        public int f37812w;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37810u = obj;
            this.f37812w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {89, 91}, m = "usePrepared")
    public static final class d<R> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f37813t;

        /* renamed from: u, reason: collision with root package name */
        public Object f37814u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37815v;

        /* renamed from: x, reason: collision with root package name */
        public int f37817x;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37815v = obj;
            this.f37817x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l.this.c(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", f = "PassthroughConnectionPool.kt", l = {}, m = "invokeSuspend")
    public static final class e extends ot.m implements Function1<mt.b<? super Object>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f37818t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f37820v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function1<f5.d, R> f37821w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, Function1<? super f5.d, ? extends R> function1, mt.b<? super e> bVar) {
            super(1, bVar);
            this.f37820v = str;
            this.f37821w = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return l.this.new e(this.f37820v, this.f37821w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f37818t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            f5.d r32 = l.this.f().r3(this.f37820v);
            try {
                Object invoke = this.f37821w.invoke(r32);
                wt.a.a(r32, null);
                return invoke;
            } finally {
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<Object> bVar) {
            return ((e) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", f = "PassthroughConnectionPool.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend")
    public static final class f extends ot.m implements Function1<mt.b<? super Object>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f37822t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g0.a f37824v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Function2<f0<R>, mt.b<? super R>, Object> f37825w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(g0.a aVar, Function2<? super f0<R>, ? super mt.b<? super R>, ? extends Object> function2, mt.b<? super f> bVar) {
            super(1, bVar);
            this.f37824v = aVar;
            this.f37825w = function2;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return l.this.new f(this.f37824v, this.f37825w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f37822t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            l lVar = l.this;
            g0.a aVar = this.f37824v;
            Function2<f0<R>, mt.b<? super R>, Object> function2 = this.f37825w;
            this.f37822t = 1;
            Object g10 = lVar.g(aVar, function2, this);
            return g10 == e10 ? e10 : g10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<Object> bVar) {
            return ((f) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Nullable Function2<? super Function1<? super mt.b<Object>, ? extends Object>, ? super mt.b<Object>, ? extends Object> function2, @NotNull f5.b delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.transactionWrapper = function2;
        this.delegate = delegate;
        this.nestedTransactionCount = new AtomicInteger(0);
    }

    @Override // x4.g0
    @Nullable
    public Object a(@NotNull mt.b<? super Boolean> bVar) {
        return ot.b.a(this.currentTransactionType != null || this.delegate.D());
    }

    @Override // x4.g0
    @Nullable
    public <R> Object b(@NotNull g0.a aVar, @NotNull Function2<? super f0<R>, ? super mt.b<? super R>, ? extends Object> function2, @NotNull mt.b<? super R> bVar) {
        Function2<Function1<? super mt.b<Object>, ? extends Object>, mt.b<Object>, Object> function22 = this.transactionWrapper;
        if (function22 == null) {
            return g(aVar, function2, bVar);
        }
        Object invoke = function22.invoke(new f(aVar, function2, null), bVar);
        nt.c.e();
        return invoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004e, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // x4.m
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object c(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super f5.d, ? extends R> r7, @org.jetbrains.annotations.NotNull mt.b<? super R> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z4.l.d
            if (r0 == 0) goto L13
            r0 = r8
            z4.l$d r0 = (z4.l.d) r0
            int r1 = r0.f37817x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37817x = r1
            goto L18
        L13:
            z4.l$d r0 = new z4.l$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f37815v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f37817x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            gt.o.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f37814u
            r7 = r6
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r6 = r0.f37813t
            java.lang.String r6 = (java.lang.String) r6
            gt.o.b(r8)
            goto L51
        L41:
            gt.o.b(r8)
            r0.f37813t = r6
            r0.f37814u = r7
            r0.f37817x = r4
            java.lang.Object r8 = r5.a(r0)
            if (r8 != r1) goto L51
            goto L6f
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L71
            kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function1<? super mt.b<java.lang.Object>, ? extends java.lang.Object>, mt.b<java.lang.Object>, java.lang.Object> r8 = r5.transactionWrapper
            if (r8 == 0) goto L71
            z4.l$e r4 = new z4.l$e
            r4.<init>(r6, r7, r2)
            r0.f37813t = r2
            r0.f37814u = r2
            r0.f37817x = r3
            java.lang.Object r6 = r8.invoke(r4, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            return r6
        L71:
            f5.b r8 = r5.delegate
            f5.d r6 = r8.r3(r6)
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L7f
            wt.a.a(r6, r2)
            return r7
        L7f:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L81
        L81:
            r8 = move-exception
            wt.a.a(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.l.c(java.lang.String, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    @Override // z4.q
    @NotNull
    /* renamed from: d, reason: from getter */
    public f5.b getDelegate() {
        return this.delegate;
    }

    @NotNull
    public final f5.b f() {
        return this.delegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object g(x4.g0.a r8, kotlin.jvm.functions.Function2<? super x4.f0<R>, ? super mt.b<? super R>, ? extends java.lang.Object> r9, mt.b<? super R> r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.l.g(x4.g0$a, kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }
}
