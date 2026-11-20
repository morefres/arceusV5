package c5;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.c0;
import x4.f0;
import x4.g0;
import x4.u;
import z4.q;
import z4.r;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"R", "Lx4/u;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Lf5/b;", "block", rl.d.f30696a, "(Lx4/u;ZZLkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lmt/b;", "", "c", "(Lx4/u;Lkotlin/jvm/functions/Function1;Lmt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", ve.a.f33391e, "(Lx4/u;ZLmt/b;)Ljava/lang/Object;", "Ljava/io/File;", "databaseFile", "", "e", "(Ljava/io/File;)I", "room-runtime"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
/* loaded from: classes.dex */
public final /* synthetic */ class c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", l = {72}, m = "invokeSuspend")
    public static final class a<R> extends ot.m implements Function2<p0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4670t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f4671u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ u f4672v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4673w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4674x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<f5.b, R> f4675y;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
        /* renamed from: c5.c$a$a, reason: collision with other inner class name */
        public static final class C0096a extends ot.m implements Function2<p0, mt.b<? super R>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f4676t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ u f4677u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ boolean f4678v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f4679w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Function1<f5.b, R> f4680x;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
            /* renamed from: c5.c$a$a$a, reason: collision with other inner class name */
            public static final class C0097a extends ot.m implements Function2<g0, mt.b<? super R>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public Object f4681t;

                /* renamed from: u, reason: collision with root package name */
                public int f4682u;

                /* renamed from: v, reason: collision with root package name */
                public /* synthetic */ Object f4683v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f4684w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f4685x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ u f4686y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ Function1 f4687z;

                @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
                @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
                /* renamed from: c5.c$a$a$a$a, reason: collision with other inner class name */
                public static final class C0098a extends ot.m implements Function2<f0<R>, mt.b<? super R>, Object> {

                    /* renamed from: t, reason: collision with root package name */
                    public int f4688t;

                    /* renamed from: u, reason: collision with root package name */
                    public /* synthetic */ Object f4689u;

                    /* renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ Function1 f4690v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0098a(mt.b bVar, Function1 function1) {
                        super(2, bVar);
                        this.f4690v = function1;
                    }

                    @Override // ot.a
                    public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                        C0098a c0098a = new C0098a(bVar, this.f4690v);
                        c0098a.f4689u = obj;
                        return c0098a;
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        nt.c.e();
                        if (this.f4688t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj);
                        f0 f0Var = (f0) this.f4689u;
                        Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return this.f4690v.invoke(((q) f0Var).getDelegate());
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(f0<R> f0Var, mt.b<? super R> bVar) {
                        return ((C0098a) create(f0Var, bVar)).invokeSuspend(Unit.f22894a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0097a(boolean z10, boolean z11, u uVar, mt.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f4684w = z10;
                    this.f4685x = z11;
                    this.f4686y = uVar;
                    this.f4687z = function1;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    C0097a c0097a = new C0097a(this.f4684w, this.f4685x, this.f4686y, bVar, this.f4687z);
                    c0097a.f4683v = obj;
                    return c0097a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
                
                    if (r8 != r0) goto L37;
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
                @Override // ot.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        Method dump skipped, instructions count: 216
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: c5.c.a.C0096a.C0097a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(g0 g0Var, mt.b<? super R> bVar) {
                    return ((C0097a) create(g0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0096a(u uVar, boolean z10, boolean z11, Function1<? super f5.b, ? extends R> function1, mt.b<? super C0096a> bVar) {
                super(2, bVar);
                this.f4677u = uVar;
                this.f4678v = z10;
                this.f4679w = z11;
                this.f4680x = function1;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                return new C0096a(this.f4677u, this.f4678v, this.f4679w, this.f4680x, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f4676t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                boolean z10 = !(this.f4677u.F() && this.f4677u.G()) && this.f4678v;
                u uVar = this.f4677u;
                boolean z11 = this.f4679w;
                C0097a c0097a = new C0097a(z10, z11, uVar, null, this.f4680x);
                this.f4676t = 1;
                Object W = uVar.W(z11, c0097a, this);
                return W == e10 ? e10 : W;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, mt.b<? super R> bVar) {
                return ((C0096a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, u uVar, boolean z10, boolean z11, Function1<? super f5.b, ? extends R> function1, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f4671u = coroutineContext;
            this.f4672v = uVar;
            this.f4673w = z10;
            this.f4674x = z11;
            this.f4675y = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f4671u, this.f4672v, this.f4673w, this.f4674x, this.f4675y, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4670t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            CoroutineContext coroutineContext = this.f4671u;
            C0096a c0096a = new C0096a(this.f4672v, this.f4673w, this.f4674x, this.f4675y, null);
            this.f4670t = 1;
            Object g10 = ju.i.g(coroutineContext, c0096a, this);
            return g10 == e10 ? e10 : g10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super R> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    public static final class b<R> extends ot.m implements Function2<p0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4691t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4692u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1 f4693v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mt.b bVar, u uVar, Function1 function1) {
            super(2, bVar);
            this.f4692u = uVar;
            this.f4693v = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new b(bVar, this.f4692u, this.f4693v);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4691t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            u uVar = this.f4692u;
            e eVar = new e(true, false, uVar, null, this.f4693v);
            this.f4691t = 1;
            Object W = uVar.W(false, eVar, this);
            return W == e10 ? e10 : W;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
    /* renamed from: c5.c$c, reason: collision with other inner class name */
    public static final class C0099c<R> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f4694t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4695u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4696v;

        /* renamed from: w, reason: collision with root package name */
        public int f4697w;

        public C0099c(mt.b<? super C0099c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4696v = obj;
            this.f4697w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c5.a.d(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", f = "DBUtil.android.kt", l = {260}, m = "invokeSuspend")
    public static final class d<R> extends ot.m implements Function1<mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4698t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4699u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function1<mt.b<? super R>, Object> f4700v;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<g0, mt.b<? super R>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f4701t;

            /* renamed from: u, reason: collision with root package name */
            public int f4702u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f4703v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ boolean f4704w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ boolean f4705x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ u f4706y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Function1 f4707z;

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
            @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
            /* renamed from: c5.c$d$a$a, reason: collision with other inner class name */
            public static final class C0100a extends ot.m implements Function2<f0<R>, mt.b<? super R>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f4708t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f4709u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ Function1 f4710v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0100a(mt.b bVar, Function1 function1) {
                    super(2, bVar);
                    this.f4710v = function1;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    C0100a c0100a = new C0100a(bVar, this.f4710v);
                    c0100a.f4709u = obj;
                    return c0100a;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    Object e10 = nt.c.e();
                    int i10 = this.f4708t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj);
                        return obj;
                    }
                    gt.o.b(obj);
                    Function1 function1 = this.f4710v;
                    this.f4708t = 1;
                    kotlin.jvm.internal.l.c(6);
                    Object invoke = function1.invoke(this);
                    kotlin.jvm.internal.l.c(7);
                    return invoke == e10 ? e10 : invoke;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final Object invoke(f0<R> f0Var, mt.b<? super R> bVar) {
                    return ((C0100a) create(f0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, boolean z11, u uVar, mt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4704w = z10;
                this.f4705x = z11;
                this.f4706y = uVar;
                this.f4707z = function1;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(this.f4704w, this.f4705x, this.f4706y, bVar, this.f4707z);
                aVar.f4703v = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
            
                if (r9 == r0) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
            
                if (r9.A(r8) == r0) goto L51;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    Method dump skipped, instructions count: 224
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: c5.c.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g0 g0Var, mt.b<? super R> bVar) {
                return ((a) create(g0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(u uVar, Function1<? super mt.b<? super R>, ? extends Object> function1, mt.b<? super d> bVar) {
            super(1, bVar);
            this.f4699u = uVar;
            this.f4700v = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(mt.b<?> bVar) {
            return new d(this.f4699u, this.f4700v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4698t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            u uVar = this.f4699u;
            a aVar = new a(true, false, uVar, null, this.f4700v);
            this.f4698t = 1;
            Object W = uVar.W(false, aVar, this);
            return W == e10 ? e10 : W;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mt.b<? super R> bVar) {
            return ((d) create(bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60, 172}, m = "invokeSuspend")
    public static final class e<R> extends ot.m implements Function2<g0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f4711t;

        /* renamed from: u, reason: collision with root package name */
        public int f4712u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4713v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4714w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4715x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f4716y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f4717z;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {60}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<f0<R>, mt.b<? super R>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f4718t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f4719u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f4720v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4720v = function1;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(bVar, this.f4720v);
                aVar.f4719u = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f4718t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    return obj;
                }
                gt.o.b(obj);
                Function1 function1 = this.f4720v;
                this.f4718t = 1;
                kotlin.jvm.internal.l.c(6);
                Object invoke = function1.invoke(this);
                kotlin.jvm.internal.l.c(7);
                return invoke == e10 ? e10 : invoke;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, mt.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, boolean z11, u uVar, mt.b bVar, Function1 function1) {
            super(2, bVar);
            this.f4714w = z10;
            this.f4715x = z11;
            this.f4716y = uVar;
            this.f4717z = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            e eVar = new e(this.f4714w, this.f4715x, this.f4716y, bVar, this.f4717z);
            eVar.f4713v = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        
            if (r9 == r0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
        
            if (r9.A(r8) == r0) goto L51;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, mt.b<? super R> bVar) {
            return ((e) create(g0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
    public static final class f<R> extends ot.m implements Function2<p0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f4721t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ u f4722u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f4723v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4724w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Function1 f4725x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mt.b bVar, u uVar, boolean z10, boolean z11, Function1 function1) {
            super(2, bVar);
            this.f4722u = uVar;
            this.f4723v = z10;
            this.f4724w = z11;
            this.f4725x = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new f(bVar, this.f4722u, this.f4723v, this.f4724w, this.f4725x);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f4721t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            u uVar = this.f4722u;
            boolean z10 = this.f4723v;
            h hVar = new h(this.f4724w, z10, uVar, null, this.f4725x);
            this.f4721t = 1;
            Object W = uVar.W(z10, hVar, this);
            return W == e10 ? e10 : W;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super R> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
    public static final class g<R> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f4726t;

        /* renamed from: u, reason: collision with root package name */
        public Object f4727u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f4728v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f4729w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f4730x;

        /* renamed from: y, reason: collision with root package name */
        public int f4731y;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4730x = obj;
            this.f4731y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return c5.a.e(null, false, false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", f = "DBUtil.android.kt", l = {56, 57, 59, 60}, m = "invokeSuspend")
    public static final class h<R> extends ot.m implements Function2<g0, mt.b<? super R>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f4732t;

        /* renamed from: u, reason: collision with root package name */
        public int f4733u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f4734v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f4735w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ boolean f4736x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ u f4737y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Function1 f4738z;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, d2 = {"R", "Lx4/f0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", l = {}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<f0<R>, mt.b<? super R>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f4739t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f4740u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Function1 f4741v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mt.b bVar, Function1 function1) {
                super(2, bVar);
                this.f4741v = function1;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(bVar, this.f4741v);
                aVar.f4740u = obj;
                return aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f4739t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                f0 f0Var = (f0) this.f4740u;
                Intrinsics.d(f0Var, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f4741v.invoke(((q) f0Var).getDelegate());
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(f0<R> f0Var, mt.b<? super R> bVar) {
                return ((a) create(f0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, boolean z11, u uVar, mt.b bVar, Function1 function1) {
            super(2, bVar);
            this.f4735w = z10;
            this.f4736x = z11;
            this.f4737y = uVar;
            this.f4738z = function1;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            h hVar = new h(this.f4735w, this.f4736x, this.f4737y, bVar, this.f4738z);
            hVar.f4734v = obj;
            return hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
        
            if (r8 != r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00bb  */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(g0 g0Var, mt.b<? super R> bVar) {
            return ((h) create(g0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final Object a(@NotNull u uVar, boolean z10, @NotNull mt.b<? super CoroutineContext> bVar) {
        c0 c0Var = (c0) bVar.getContext().get(c0.INSTANCE);
        CoroutineContext transactionDispatcher = c0Var != null ? c0Var.getTransactionDispatcher() : null;
        if (uVar.F()) {
            return transactionDispatcher != null ? uVar.v().plus(transactionDispatcher) : z10 ? uVar.C() : uVar.v();
        }
        CoroutineContext v5 = uVar.v();
        if (transactionDispatcher == null) {
            transactionDispatcher = kotlin.coroutines.e.f22936a;
        }
        return v5.plus(transactionDispatcher);
    }

    public static final <R> R b(@NotNull u db2, boolean z10, boolean z11, @NotNull Function1<? super f5.b, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        db2.g();
        db2.h();
        CoroutineContext coroutineContext = db2.B().get();
        if (coroutineContext == null) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        return (R) r.a(new a(coroutineContext, db2, z11, z10, block, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object c(@org.jetbrains.annotations.NotNull x4.u r11, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super mt.b<? super R>, ? extends java.lang.Object> r12, @org.jetbrains.annotations.NotNull mt.b<? super R> r13) {
        /*
            boolean r1 = r13 instanceof c5.c.C0099c
            if (r1 == 0) goto L14
            r1 = r13
            c5.c$c r1 = (c5.c.C0099c) r1
            int r2 = r1.f4697w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r2 & r4
            if (r6 == 0) goto L14
            int r2 = r2 - r4
            r1.f4697w = r2
        L12:
            r6 = r1
            goto L1a
        L14:
            c5.c$c r1 = new c5.c$c
            r1.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r0 = r6.f4696v
            java.lang.Object r7 = nt.c.e()
            int r1 = r6.f4697w
            r2 = 4
            r4 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L51
            if (r1 == r9) goto L4d
            if (r1 == r8) goto L49
            if (r1 == r4) goto L3d
            if (r1 != r2) goto L35
            gt.o.b(r0)
            return r0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            java.lang.Object r1 = r6.f4695u
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r3 = r6.f4694t
            x4.u r3 = (x4.u) r3
            gt.o.b(r0)
            goto L9f
        L49:
            gt.o.b(r0)
            return r0
        L4d:
            gt.o.b(r0)
            return r0
        L51:
            gt.o.b(r0)
            boolean r0 = r11.F()
            if (r0 == 0) goto L69
            c5.c$d r0 = new c5.c$d
            r0.<init>(r11, r12, r10)
            r6.f4697w = r9
            java.lang.Object r0 = x4.v.e(r11, r0, r6)
            if (r0 != r7) goto L68
            goto Lb2
        L68:
            return r0
        L69:
            boolean r0 = r11.F()
            if (r0 == 0) goto L90
            boolean r0 = r11.M()
            if (r0 == 0) goto L90
            boolean r0 = r11.G()
            if (r0 == 0) goto L90
            c5.c$e r0 = new c5.c$e
            r2 = 0
            r4 = 0
            r1 = 1
            r3 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f4697w = r8
            r1 = 0
            java.lang.Object r0 = r11.W(r1, r0, r6)
            if (r0 != r7) goto L8f
            goto Lb2
        L8f:
            return r0
        L90:
            r6.f4694t = r11
            r6.f4695u = r12
            r6.f4697w = r4
            java.lang.Object r0 = c5.a.b(r11, r9, r6)
            if (r0 != r7) goto L9d
            goto Lb2
        L9d:
            r3 = r11
            r1 = r12
        L9f:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            c5.c$b r4 = new c5.c$b
            r4.<init>(r10, r3, r1)
            r6.f4694t = r10
            r6.f4695u = r10
            r6.f4697w = r2
            java.lang.Object r0 = ju.i.g(r0, r4, r6)
            if (r0 != r7) goto Lb3
        Lb2:
            return r7
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c.c(x4.u, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object d(@org.jetbrains.annotations.NotNull x4.u r14, boolean r15, boolean r16, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super f5.b, ? extends R> r17, @org.jetbrains.annotations.NotNull mt.b<? super R> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof c5.c.g
            if (r1 == 0) goto L16
            r1 = r0
            c5.c$g r1 = (c5.c.g) r1
            int r2 = r1.f4731y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f4731y = r2
        L14:
            r6 = r1
            goto L1c
        L16:
            c5.c$g r1 = new c5.c$g
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f4730x
            java.lang.Object r7 = nt.c.e()
            int r1 = r6.f4731y
            r2 = 3
            r3 = 2
            r8 = 1
            if (r1 == 0) goto L53
            if (r1 == r8) goto L4f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            gt.o.b(r0)
            return r0
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            boolean r14 = r6.f4729w
            boolean r15 = r6.f4728v
            java.lang.Object r1 = r6.f4727u
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r3 = r6.f4726t
            x4.u r3 = (x4.u) r3
            gt.o.b(r0)
            r12 = r14
            r13 = r1
            r10 = r3
        L4d:
            r11 = r15
            goto L99
        L4f:
            gt.o.b(r0)
            return r0
        L53:
            gt.o.b(r0)
            boolean r0 = r14.F()
            if (r0 == 0) goto L7f
            boolean r0 = r14.M()
            if (r0 == 0) goto L7f
            boolean r0 = r14.G()
            if (r0 == 0) goto L7f
            c5.c$h r0 = new c5.c$h
            r4 = 0
            r3 = r14
            r2 = r15
            r1 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r0
            r6.f4731y = r8
            java.lang.Object r14 = r14.W(r15, r2, r6)
            if (r14 != r7) goto L7e
            goto Lae
        L7e:
            return r14
        L7f:
            r4 = r16
            r6.f4726t = r14
            r5 = r17
            r6.f4727u = r5
            r6.f4728v = r15
            r6.f4729w = r4
            r6.f4731y = r3
            java.lang.Object r3 = c5.a.b(r14, r4, r6)
            if (r3 != r7) goto L94
            goto Lae
        L94:
            r10 = r14
            r0 = r3
            r12 = r4
            r13 = r5
            goto L4d
        L99:
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            c5.c$f r8 = new c5.c$f
            r9 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14 = 0
            r6.f4726t = r14
            r6.f4727u = r14
            r6.f4731y = r2
            java.lang.Object r14 = ju.i.g(r0, r8, r6)
            if (r14 != r7) goto Laf
        Lae:
            return r7
        Laf:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c.d(x4.u, boolean, boolean, kotlin.jvm.functions.Function1, mt.b):java.lang.Object");
    }

    public static final int e(@NotNull File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i10 = allocate.getInt();
            tt.c.a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                tt.c.a(channel, th2);
                throw th3;
            }
        }
    }
}
