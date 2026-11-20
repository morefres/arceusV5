package mu;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import ju.g2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f\u001a[\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u00028\u00000\u000120\b\u0001\u0010\u0017\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "Lmu/h;", "", "count", j6.b.f21518e, "(Lmu/h;I)Lmu/h;", "Lkotlin/Function2;", "Lmt/b;", "", "", "predicate", "c", "(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;", "e", "Lmu/i;", "value", "ownershipMarker", "", rl.d.f30696a, "(Lmu/i;Ljava/lang/Object;Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "f", "R", "Lkotlin/Function3;", "transform", "g", "(Lmu/h;Lyt/n;)Lmu/h;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class w {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/w$a", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements mu.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f25196a;
        public final /* synthetic */ int b;

        public a(mu.h hVar, int i10) {
            this.f25196a = hVar;
            this.b = i10;
        }

        @Override // mu.h
        public Object collect(mu.i<? super T> iVar, mt.b<? super Unit> bVar) {
            Object collect = this.f25196a.collect(new b(new kotlin.jvm.internal.a0(), this.b, iVar), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements mu.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f25197a;
        public final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mu.i<T> f25198c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {MotionEventCompat.AXIS_GAS}, m = "emit")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25199t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ b<T> f25200u;

            /* renamed from: v, reason: collision with root package name */
            public int f25201v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, mt.b<? super a> bVar2) {
                super(bVar2);
                this.f25200u = bVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25199t = obj;
                this.f25201v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f25200u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.jvm.internal.a0 a0Var, int i10, mu.i<? super T> iVar) {
            this.f25197a = a0Var;
            this.b = i10;
            this.f25198c = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // mu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, mt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof mu.w.b.a
                if (r0 == 0) goto L13
                r0 = r7
                mu.w$b$a r0 = (mu.w.b.a) r0
                int r1 = r0.f25201v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25201v = r1
                goto L18
            L13:
                mu.w$b$a r0 = new mu.w$b$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f25199t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25201v
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                gt.o.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                gt.o.b(r7)
                kotlin.jvm.internal.a0 r7 = r5.f25197a
                int r2 = r7.f22960a
                int r4 = r5.b
                if (r2 < r4) goto L4a
                mu.i<T> r7 = r5.f25198c
                r0.f25201v = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f22960a = r2
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.w.b.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/w$c", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements mu.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f25202a;
        public final /* synthetic */ Function2 b;

        public c(mu.h hVar, Function2 function2) {
            this.f25202a = hVar;
            this.b = function2;
        }

        @Override // mu.h
        public Object collect(mu.i<? super T> iVar, mt.b<? super Unit> bVar) {
            Object collect = this.f25202a.collect(new d(new kotlin.jvm.internal.y(), iVar, this.b), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements mu.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.y f25203a;
        public final /* synthetic */ mu.i<T> b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function2<T, mt.b<? super Boolean>, Object> f25204c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {MotionEventCompat.AXIS_GENERIC_3, 35, MotionEventCompat.AXIS_GENERIC_6}, m = "emit")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public Object f25205t;

            /* renamed from: u, reason: collision with root package name */
            public Object f25206u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f25207v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d<T> f25208w;

            /* renamed from: x, reason: collision with root package name */
            public int f25209x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, mt.b<? super a> bVar) {
                super(bVar);
                this.f25208w = dVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25207v = obj;
                this.f25209x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f25208w.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(kotlin.jvm.internal.y yVar, mu.i<? super T> iVar, Function2<? super T, ? super mt.b<? super Boolean>, ? extends Object> function2) {
            this.f25203a = yVar;
            this.b = iVar;
            this.f25204c = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // mu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, mt.b<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mu.w.d.a
                if (r0 == 0) goto L13
                r0 = r8
                mu.w$d$a r0 = (mu.w.d.a) r0
                int r1 = r0.f25209x
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25209x = r1
                goto L18
            L13:
                mu.w$d$a r0 = new mu.w$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f25207v
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25209x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                gt.o.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f25206u
                java.lang.Object r2 = r0.f25205t
                mu.w$d r2 = (mu.w.d) r2
                gt.o.b(r8)
                goto L6c
            L41:
                gt.o.b(r8)
                goto L59
            L45:
                gt.o.b(r8)
                kotlin.jvm.internal.y r8 = r6.f25203a
                boolean r8 = r8.f22979a
                if (r8 == 0) goto L5c
                mu.i<T> r8 = r6.b
                r0.f25209x = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            L5c:
                kotlin.jvm.functions.Function2<T, mt.b<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f25204c
                r0.f25205t = r6
                r0.f25206u = r7
                r0.f25209x = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.y r8 = r2.f25203a
                r8.f22979a = r5
                mu.i<T> r8 = r2.b
                r2 = 0
                r0.f25205t = r2
                r0.f25206u = r2
                r0.f25209x = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.w.d.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
    public static final class e<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25210t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25211u;

        /* renamed from: v, reason: collision with root package name */
        public int f25212v;

        public e(mt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25211u = obj;
            this.f25212v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return w.d(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/w$f", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements mu.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f25213a;
        public final /* synthetic */ int b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25214t;

            /* renamed from: u, reason: collision with root package name */
            public int f25215u;

            /* renamed from: w, reason: collision with root package name */
            public Object f25217w;

            public a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25214t = obj;
                this.f25215u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return f.this.collect(null, this);
            }
        }

        public f(mu.h hVar, int i10) {
            this.f25213a = hVar;
            this.b = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(mu.i<? super T> r9, mt.b<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof mu.w.f.a
                if (r0 == 0) goto L13
                r0 = r10
                mu.w$f$a r0 = (mu.w.f.a) r0
                int r1 = r0.f25215u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25215u = r1
                goto L18
            L13:
                mu.w$f$a r0 = new mu.w$f$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f25214t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25215u
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r9 = r0.f25217w
                gt.o.b(r10)     // Catch: kotlin.a -> L2b
                goto L5d
            L2b:
                r10 = move-exception
                goto L5a
            L2d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L35:
                gt.o.b(r10)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                kotlin.jvm.internal.a0 r2 = new kotlin.jvm.internal.a0
                r2.<init>()
                mu.h r4 = r8.f25213a     // Catch: kotlin.a -> L56
                mu.w$g r5 = new mu.w$g     // Catch: kotlin.a -> L56
                int r6 = r8.b     // Catch: kotlin.a -> L56
                r5.<init>(r2, r6, r9, r10)     // Catch: kotlin.a -> L56
                r0.f25217w = r10     // Catch: kotlin.a -> L56
                r0.f25215u = r3     // Catch: kotlin.a -> L56
                java.lang.Object r9 = r4.collect(r5, r0)     // Catch: kotlin.a -> L56
                if (r9 != r1) goto L5d
                return r1
            L56:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L5a:
                kotlin.p.a(r10, r9)
            L5d:
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.w.f.collect(mu.i, mt.b):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g<T> implements mu.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.a0 f25218a;
        public final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ mu.i<T> f25219c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f25220d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25221t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ g<T> f25222u;

            /* renamed from: v, reason: collision with root package name */
            public int f25223v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(g<? super T> gVar, mt.b<? super a> bVar) {
                super(bVar);
                this.f25222u = gVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25221t = obj;
                this.f25223v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f25222u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public g(kotlin.jvm.internal.a0 a0Var, int i10, mu.i<? super T> iVar, Object obj) {
            this.f25218a = a0Var;
            this.b = i10;
            this.f25219c = iVar;
            this.f25220d = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        
            if (mu.w.d(r7, r6, r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // mu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, mt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof mu.w.g.a
                if (r0 == 0) goto L13
                r0 = r7
                mu.w$g$a r0 = (mu.w.g.a) r0
                int r1 = r0.f25223v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25223v = r1
                goto L18
            L13:
                mu.w$g$a r0 = new mu.w$g$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f25221t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25223v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                gt.o.b(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                gt.o.b(r7)
                goto L51
            L38:
                gt.o.b(r7)
                kotlin.jvm.internal.a0 r7 = r5.f25218a
                int r2 = r7.f22960a
                int r2 = r2 + r4
                r7.f22960a = r2
                int r7 = r5.b
                if (r2 >= r7) goto L54
                mu.i<T> r7 = r5.f25219c
                r0.f25223v = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L60
            L51:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            L54:
                mu.i<T> r7 = r5.f25219c
                java.lang.Object r2 = r5.f25220d
                r0.f25223v = r3
                java.lang.Object r6 = mu.w.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.w.g.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/w$h", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h<T> implements mu.h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mu.h f25224a;
        public final /* synthetic */ Function2 b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25225t;

            /* renamed from: u, reason: collision with root package name */
            public int f25226u;

            /* renamed from: w, reason: collision with root package name */
            public Object f25228w;

            public a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25225t = obj;
                this.f25226u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return h.this.collect(null, this);
            }
        }

        public h(mu.h hVar, Function2 function2) {
            this.f25224a = hVar;
            this.b = function2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(mu.i<? super T> r6, mt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof mu.w.h.a
                if (r0 == 0) goto L13
                r0 = r7
                mu.w$h$a r0 = (mu.w.h.a) r0
                int r1 = r0.f25226u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25226u = r1
                goto L18
            L13:
                mu.w$h$a r0 = new mu.w$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f25225t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25226u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f25228w
                mu.w$i r6 = (mu.w.i) r6
                gt.o.b(r7)     // Catch: kotlin.a -> L2d
                goto L5a
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                gt.o.b(r7)
                mu.h r7 = r5.f25224a
                mu.w$i r2 = new mu.w$i
                kotlin.jvm.functions.Function2 r4 = r5.b
                r2.<init>(r4, r6)
                r0.f25228w = r2     // Catch: kotlin.a -> L4e
                r0.f25226u = r3     // Catch: kotlin.a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: kotlin.a -> L4e
                if (r6 != r1) goto L5a
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                kotlin.p.a(r7, r6)
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                ju.g2.g(r6)
            L5a:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.w.h.collect(mu.i, mt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/w$i", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i<T> implements mu.i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f25229a;
        public final /* synthetic */ mu.i b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public Object f25230t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f25231u;

            /* renamed from: v, reason: collision with root package name */
            public int f25232v;

            /* renamed from: x, reason: collision with root package name */
            public Object f25234x;

            public a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25231u = obj;
                this.f25232v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, mu.i iVar) {
            this.f25229a = function2;
            this.b = iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // mu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r8, mt.b<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof mu.w.i.a
                if (r0 == 0) goto L13
                r0 = r9
                mu.w$i$a r0 = (mu.w.i.a) r0
                int r1 = r0.f25232v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25232v = r1
                goto L18
            L13:
                mu.w$i$a r0 = new mu.w$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f25231u
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25232v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f25230t
                mu.w$i r8 = (mu.w.i) r8
                gt.o.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f25234x
                java.lang.Object r2 = r0.f25230t
                mu.w$i r2 = (mu.w.i) r2
                gt.o.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                gt.o.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f25229a
                r0.f25230t = r7
                r0.f25234x = r8
                r0.f25232v = r4
                r2 = 6
                kotlin.jvm.internal.l.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.l.c(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                mu.i r2 = r8.b
                r0.f25230t = r8
                r5 = 0
                r0.f25234x = r5
                r0.f25232v = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            L81:
                nu.a r9 = new nu.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.w.i.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lmu/i;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
    public static final class j<R> extends ot.m implements Function2<mu.i<? super R>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f25235t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25236u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ mu.h<T> f25237v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ yt.n<mu.i<? super R>, T, mt.b<? super Boolean>, Object> f25238w;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/w$j$a", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements mu.i<T> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ yt.n f25239a;
            public final /* synthetic */ mu.i b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @ot.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {132}, m = "emit")
            /* renamed from: mu.w$j$a$a, reason: collision with other inner class name */
            public static final class C0448a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public Object f25240t;

                /* renamed from: u, reason: collision with root package name */
                public /* synthetic */ Object f25241u;

                /* renamed from: v, reason: collision with root package name */
                public int f25242v;

                public C0448a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f25241u = obj;
                    this.f25242v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(yt.n nVar, mu.i iVar) {
                this.f25239a = nVar;
                this.b = iVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r5, mt.b<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof mu.w.j.a.C0448a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mu.w$j$a$a r0 = (mu.w.j.a.C0448a) r0
                    int r1 = r0.f25242v
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f25242v = r1
                    goto L18
                L13:
                    mu.w$j$a$a r0 = new mu.w$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f25241u
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f25242v
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f25240t
                    mu.w$j$a r5 = (mu.w.j.a) r5
                    gt.o.b(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    gt.o.b(r6)
                    yt.n r6 = r4.f25239a
                    mu.i r2 = r4.b
                    r0.f25240t = r4
                    r0.f25242v = r3
                    r3 = 6
                    kotlin.jvm.internal.l.c(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.l.c(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    kotlin.Unit r5 = kotlin.Unit.f22894a
                    return r5
                L5b:
                    nu.a r6 = new nu.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.w.j.a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(mu.h<? extends T> hVar, yt.n<? super mu.i<? super R>, ? super T, ? super mt.b<? super Boolean>, ? extends Object> nVar, mt.b<? super j> bVar) {
            super(2, bVar);
            this.f25237v = hVar;
            this.f25238w = nVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            j jVar = new j(this.f25237v, this.f25238w, bVar);
            jVar.f25236u = obj;
            return jVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object e10 = nt.c.e();
            int i10 = this.f25235t;
            if (i10 == 0) {
                gt.o.b(obj);
                mu.i iVar = (mu.i) this.f25236u;
                mu.h<T> hVar = this.f25237v;
                a aVar2 = new a(this.f25238w, iVar);
                try {
                    this.f25236u = aVar2;
                    this.f25235t = 1;
                    if (hVar.collect(aVar2, this) == e10) {
                        return e10;
                    }
                } catch (kotlin.a e11) {
                    e = e11;
                    aVar = aVar2;
                    kotlin.p.a(e, aVar);
                    g2.g(getContext());
                    return Unit.f22894a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.f25236u;
                try {
                    gt.o.b(obj);
                } catch (kotlin.a e12) {
                    e = e12;
                    kotlin.p.a(e, aVar);
                    g2.g(getContext());
                    return Unit.f22894a;
                }
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(mu.i<? super R> iVar, mt.b<? super Unit> bVar) {
            return ((j) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @NotNull
    public static final <T> mu.h<T> b(@NotNull mu.h<? extends T> hVar, int i10) {
        if (i10 >= 0) {
            return new a(hVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    @NotNull
    public static final <T> mu.h<T> c(@NotNull mu.h<? extends T> hVar, @NotNull Function2<? super T, ? super mt.b<? super Boolean>, ? extends Object> function2) {
        return new c(hVar, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(mu.i<? super T> r4, T r5, java.lang.Object r6, mt.b<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof mu.w.e
            if (r0 == 0) goto L13
            r0 = r7
            mu.w$e r0 = (mu.w.e) r0
            int r1 = r0.f25212v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25212v = r1
            goto L18
        L13:
            mu.w$e r0 = new mu.w$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25211u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25212v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f25210t
            gt.o.b(r7)
            goto L41
        L33:
            gt.o.b(r7)
            r0.f25210t = r6
            r0.f25212v = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            nu.a r4 = new nu.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.w.d(mu.i, java.lang.Object, java.lang.Object, mt.b):java.lang.Object");
    }

    @NotNull
    public static final <T> mu.h<T> e(@NotNull mu.h<? extends T> hVar, int i10) {
        if (i10 > 0) {
            return new f(hVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    @NotNull
    public static final <T> mu.h<T> f(@NotNull mu.h<? extends T> hVar, @NotNull Function2<? super T, ? super mt.b<? super Boolean>, ? extends Object> function2) {
        return new h(hVar, function2);
    }

    @NotNull
    public static final <T, R> mu.h<R> g(@NotNull mu.h<? extends T> hVar, @NotNull yt.n<? super mu.i<? super R>, ? super T, ? super mt.b<? super Boolean>, ? extends Object> nVar) {
        return mu.j.w(new j(hVar, nVar, null));
    }
}
