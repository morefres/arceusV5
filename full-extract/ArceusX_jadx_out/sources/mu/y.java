package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0086@¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"T", "Lmu/h;", j6.b.f21518e, "(Lmu/h;Lmt/b;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lmt/b;", "", "", "predicate", ve.a.f33391e, "(Lmu/h;Lkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class y {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/y$a", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0 f25249a;

        public a(kotlin.jvm.internal.c0 c0Var) {
            this.f25249a = c0Var;
        }

        @Override // mu.i
        public Object emit(T t8, mt.b<? super Unit> bVar) {
            this.f25249a.f22963a = t8;
            throw new kotlin.a(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/y$b", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f25250a;
        public final /* synthetic */ kotlin.jvm.internal.c0 b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {132}, m = "emit")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public Object f25251t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f25252u;

            /* renamed from: v, reason: collision with root package name */
            public int f25253v;

            /* renamed from: x, reason: collision with root package name */
            public Object f25255x;

            public a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25252u = obj;
                this.f25253v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, kotlin.jvm.internal.c0 c0Var) {
            this.f25250a = function2;
            this.b = c0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // mu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object emit(T r5, mt.b<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof mu.y.b.a
                if (r0 == 0) goto L13
                r0 = r6
                mu.y$b$a r0 = (mu.y.b.a) r0
                int r1 = r0.f25253v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25253v = r1
                goto L18
            L13:
                mu.y$b$a r0 = new mu.y$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f25252u
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25253v
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f25255x
                java.lang.Object r0 = r0.f25251t
                mu.y$b r0 = (mu.y.b) r0
                gt.o.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                gt.o.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f25250a
                r0.f25251t = r4
                r0.f25255x = r5
                r0.f25253v = r3
                r2 = 6
                kotlin.jvm.internal.l.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.l.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            L5d:
                kotlin.jvm.internal.c0 r6 = r0.b
                r6.f22963a = r5
                nu.a r5 = new nu.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.y.b.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class c<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25256t;

        /* renamed from: u, reason: collision with root package name */
        public Object f25257u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f25258v;

        /* renamed from: w, reason: collision with root package name */
        public int f25259w;

        public c(mt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25258v = obj;
            this.f25259w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return j.u(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "first")
    public static final class d<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25260t;

        /* renamed from: u, reason: collision with root package name */
        public Object f25261u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f25262v;

        /* renamed from: w, reason: collision with root package name */
        public int f25263w;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25262v = obj;
            this.f25263w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return j.t(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mu/y$e", "Lmu/i;", "value", "", "emit", "(Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements i<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.c0 f25264a;

        public e(kotlin.jvm.internal.c0 c0Var) {
            this.f25264a = c0Var;
        }

        @Override // mu.i
        public Object emit(T t8, mt.b<? super Unit> bVar) {
            this.f25264a.f22963a = t8;
            throw new kotlin.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
    public static final class f<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25265t;

        /* renamed from: u, reason: collision with root package name */
        public Object f25266u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f25267v;

        /* renamed from: w, reason: collision with root package name */
        public int f25268w;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25267v = obj;
            this.f25268w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return j.v(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@org.jetbrains.annotations.NotNull mu.h<? extends T> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super T, ? super mt.b<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull mt.b<? super T> r6) {
        /*
            boolean r0 = r6 instanceof mu.y.d
            if (r0 == 0) goto L13
            r0 = r6
            mu.y$d r0 = (mu.y.d) r0
            int r1 = r0.f25263w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25263w = r1
            goto L18
        L13:
            mu.y$d r0 = new mu.y$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25262v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25263w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f25261u
            mu.y$b r4 = (mu.y.b) r4
            java.lang.Object r5 = r0.f25260t
            kotlin.jvm.internal.c0 r5 = (kotlin.jvm.internal.c0) r5
            gt.o.b(r6)     // Catch: kotlin.a -> L31
            goto L69
        L31:
            r6 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            gt.o.b(r6)
            kotlin.jvm.internal.c0 r6 = new kotlin.jvm.internal.c0
            r6.<init>()
            pu.e0 r2 = kotlin.t.f27442a
            r6.f22963a = r2
            mu.y$b r2 = new mu.y$b
            r2.<init>(r5, r6)
            r0.f25260t = r6     // Catch: kotlin.a -> L5b
            r0.f25261u = r2     // Catch: kotlin.a -> L5b
            r0.f25263w = r3     // Catch: kotlin.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlin.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r5 = r6
            goto L69
        L5b:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            kotlin.p.a(r6, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            ju.g2.g(r4)
        L69:
            T r4 = r5.f22963a
            pu.e0 r5 = kotlin.t.f27442a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.y.a(mu.h, kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull mu.h<? extends T> r4, @org.jetbrains.annotations.NotNull mt.b<? super T> r5) {
        /*
            boolean r0 = r5 instanceof mu.y.c
            if (r0 == 0) goto L13
            r0 = r5
            mu.y$c r0 = (mu.y.c) r0
            int r1 = r0.f25259w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25259w = r1
            goto L18
        L13:
            mu.y$c r0 = new mu.y$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25258v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25259w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f25257u
            mu.y$a r4 = (mu.y.a) r4
            java.lang.Object r1 = r0.f25256t
            kotlin.jvm.internal.c0 r1 = (kotlin.jvm.internal.c0) r1
            gt.o.b(r5)     // Catch: kotlin.a -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            gt.o.b(r5)
            kotlin.jvm.internal.c0 r5 = new kotlin.jvm.internal.c0
            r5.<init>()
            pu.e0 r2 = kotlin.t.f27442a
            r5.f22963a = r2
            mu.y$a r2 = new mu.y$a
            r2.<init>(r5)
            r0.f25256t = r5     // Catch: kotlin.a -> L5b
            r0.f25257u = r2     // Catch: kotlin.a -> L5b
            r0.f25259w = r3     // Catch: kotlin.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlin.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlin.p.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            ju.g2.g(r4)
        L69:
            T r4 = r1.f22963a
            pu.e0 r5 = kotlin.t.f27442a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.y.b(mu.h, mt.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@org.jetbrains.annotations.NotNull mu.h<? extends T> r4, @org.jetbrains.annotations.NotNull mt.b<? super T> r5) {
        /*
            boolean r0 = r5 instanceof mu.y.f
            if (r0 == 0) goto L13
            r0 = r5
            mu.y$f r0 = (mu.y.f) r0
            int r1 = r0.f25268w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25268w = r1
            goto L18
        L13:
            mu.y$f r0 = new mu.y$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f25267v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25268w
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f25266u
            mu.y$e r4 = (mu.y.e) r4
            java.lang.Object r1 = r0.f25265t
            kotlin.jvm.internal.c0 r1 = (kotlin.jvm.internal.c0) r1
            gt.o.b(r5)     // Catch: kotlin.a -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            gt.o.b(r5)
            kotlin.jvm.internal.c0 r5 = new kotlin.jvm.internal.c0
            r5.<init>()
            mu.y$e r2 = new mu.y$e
            r2.<init>(r5)
            r0.f25265t = r5     // Catch: kotlin.a -> L57
            r0.f25266u = r2     // Catch: kotlin.a -> L57
            r0.f25268w = r3     // Catch: kotlin.a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlin.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            kotlin.p.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            ju.g2.g(r4)
        L65:
            T r4 = r1.f22963a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.y.c(mu.h, mt.b):java.lang.Object");
    }
}
