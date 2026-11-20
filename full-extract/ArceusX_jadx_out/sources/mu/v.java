package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import ju.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000124\u0010\u000e\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\r*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"T", "Lmu/h;", "Lkotlin/Function3;", "Lmu/i;", "", "Lmt/b;", "", "", "action", ve.a.f33391e, "(Lmu/h;Lyt/n;)Lmu/h;", "Lkotlin/Function4;", "", "", "predicate", "e", "(Lmu/h;Lyt/o;)Lmu/h;", "collector", j6.b.f21518e, "(Lmu/h;Lmu/i;Lmt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "c", "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", rl.d.f30696a, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class v {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/v$a", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f25174a;
        public final /* synthetic */ yt.n b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
        /* renamed from: mu.v$a$a, reason: collision with other inner class name */
        public static final class C0447a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25175t;

            /* renamed from: u, reason: collision with root package name */
            public int f25176u;

            /* renamed from: w, reason: collision with root package name */
            public Object f25178w;

            /* renamed from: x, reason: collision with root package name */
            public Object f25179x;

            public C0447a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25175t = obj;
                this.f25176u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return a.this.collect(null, this);
            }
        }

        public a(h hVar, yt.n nVar) {
            this.f25174a = hVar;
            this.b = nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(mu.i<? super T> r6, mt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof mu.v.a.C0447a
                if (r0 == 0) goto L13
                r0 = r7
                mu.v$a$a r0 = (mu.v.a.C0447a) r0
                int r1 = r0.f25176u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25176u = r1
                goto L18
            L13:
                mu.v$a$a r0 = new mu.v$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f25175t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25176u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                gt.o.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f25179x
                mu.i r6 = (mu.i) r6
                java.lang.Object r2 = r0.f25178w
                mu.v$a r2 = (mu.v.a) r2
                gt.o.b(r7)
                goto L53
            L40:
                gt.o.b(r7)
                mu.h r7 = r5.f25174a
                r0.f25178w = r5
                r0.f25179x = r6
                r0.f25176u = r4
                java.lang.Object r7 = mu.j.g(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                yt.n r2 = r2.b
                r4 = 0
                r0.f25178w = r4
                r0.f25179x = r4
                r0.f25176u = r3
                r3 = 6
                kotlin.jvm.internal.l.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.l.c(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.v.a.collect(mu.i, mt.b):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    public static final class b<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25180t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25181u;

        /* renamed from: v, reason: collision with root package name */
        public int f25182v;

        public b(mt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25181u = obj;
            this.f25182v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return j.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f25183a;
        public final /* synthetic */ kotlin.jvm.internal.c0<Throwable> b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public Object f25184t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f25185u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ c<T> f25186v;

            /* renamed from: w, reason: collision with root package name */
            public int f25187w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, mt.b<? super a> bVar) {
                super(bVar);
                this.f25186v = cVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25185u = obj;
                this.f25187w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f25186v.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(i<? super T> iVar, kotlin.jvm.internal.c0<Throwable> c0Var) {
            this.f25183a = iVar;
            this.b = c0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // mu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, mt.b<? super kotlin.Unit> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof mu.v.c.a
                if (r0 == 0) goto L13
                r0 = r6
                mu.v$c$a r0 = (mu.v.c.a) r0
                int r1 = r0.f25187w
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25187w = r1
                goto L18
            L13:
                mu.v$c$a r0 = new mu.v$c$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f25185u
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25187w
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f25184t
                mu.v$c r5 = (mu.v.c) r5
                gt.o.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                gt.o.b(r6)
                mu.i<T> r6 = r4.f25183a     // Catch: java.lang.Throwable -> L4a
                r0.f25184t = r4     // Catch: java.lang.Throwable -> L4a
                r0.f25187w = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.c0<java.lang.Throwable> r5 = r5.b
                r5.f22963a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.v.c.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/v$d", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f25188a;
        public final /* synthetic */ yt.o b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
        public static final class a extends ot.d {
            public int A;

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25189t;

            /* renamed from: u, reason: collision with root package name */
            public int f25190u;

            /* renamed from: w, reason: collision with root package name */
            public Object f25192w;

            /* renamed from: x, reason: collision with root package name */
            public Object f25193x;

            /* renamed from: y, reason: collision with root package name */
            public Object f25194y;

            /* renamed from: z, reason: collision with root package name */
            public long f25195z;

            public a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25189t = obj;
                this.f25190u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return d.this.collect(null, this);
            }
        }

        public d(h hVar, yt.o oVar) {
            this.f25188a = hVar;
            this.b = oVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0076 -> B:14:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0097 -> B:11:0x009a). Please report as a decompilation issue!!! */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(mu.i<? super T> r12, mt.b<? super kotlin.Unit> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof mu.v.d.a
                if (r0 == 0) goto L13
                r0 = r13
                mu.v$d$a r0 = (mu.v.d.a) r0
                int r1 = r0.f25190u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25190u = r1
                goto L18
            L13:
                mu.v$d$a r0 = new mu.v$d$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f25189t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25190u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f25195z
                java.lang.Object r12 = r0.f25194y
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f25193x
                mu.i r2 = (mu.i) r2
                java.lang.Object r7 = r0.f25192w
                mu.v$d r7 = (mu.v.d) r7
                gt.o.b(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.A
                long r5 = r0.f25195z
                java.lang.Object r2 = r0.f25193x
                mu.i r2 = (mu.i) r2
                java.lang.Object r7 = r0.f25192w
                mu.v$d r7 = (mu.v.d) r7
                gt.o.b(r13)
                goto L74
            L52:
                gt.o.b(r13)
                r5 = 0
                r13 = r11
            L58:
                mu.h r2 = r13.f25188a
                r0.f25192w = r13
                r0.f25193x = r12
                r7 = 0
                r0.f25194y = r7
                r0.f25195z = r5
                r7 = 0
                r0.A = r7
                r0.f25190u = r4
                java.lang.Object r2 = mu.j.g(r2, r12, r0)
                if (r2 != r1) goto L6f
                goto L96
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La6
                yt.o r12 = r7.b
                java.lang.Long r8 = ot.b.d(r5)
                r0.f25192w = r7
                r0.f25193x = r2
                r0.f25194y = r13
                r0.f25195z = r5
                r0.f25190u = r3
                r9 = 6
                kotlin.jvm.internal.l.c(r9)
                java.lang.Object r12 = r12.e(r2, r13, r8, r0)
                r8 = 7
                kotlin.jvm.internal.l.c(r8)
                if (r12 != r1) goto L97
            L96:
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            La6:
                r13 = r7
                goto La9
            La8:
                throw r12
            La9:
                if (r12 != 0) goto Lae
                kotlin.Unit r12 = kotlin.Unit.f22894a
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.v.d.collect(mu.i, mt.b):java.lang.Object");
        }
    }

    @NotNull
    public static final <T> h<T> a(@NotNull h<? extends T> hVar, @NotNull yt.n<? super i<? super T>, ? super Throwable, ? super mt.b<? super Unit>, ? extends Object> nVar) {
        return new a(hVar, nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull mu.h<? extends T> r4, @org.jetbrains.annotations.NotNull mu.i<? super T> r5, @org.jetbrains.annotations.NotNull mt.b<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof mu.v.b
            if (r0 == 0) goto L13
            r0 = r6
            mu.v$b r0 = (mu.v.b) r0
            int r1 = r0.f25182v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25182v = r1
            goto L18
        L13:
            mu.v$b r0 = new mu.v$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f25181u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25182v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f25180t
            kotlin.jvm.internal.c0 r4 = (kotlin.jvm.internal.c0) r4
            gt.o.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            gt.o.b(r6)
            kotlin.jvm.internal.c0 r6 = new kotlin.jvm.internal.c0
            r6.<init>()
            mu.v$c r2 = new mu.v$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f25180t = r6     // Catch: java.lang.Throwable -> L51
            r0.f25182v = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.f22963a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            gt.a.a(r4, r5)
            throw r4
        L72:
            gt.a.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.v.b(mu.h, mu.i, mt.b):java.lang.Object");
    }

    public static final boolean c(Throwable th2, CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.get(d2.INSTANCE);
        if (d2Var == null || !d2Var.isCancelled()) {
            return false;
        }
        return d(th2, d2Var.m());
    }

    public static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && Intrinsics.c(th3, th2);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, @NotNull yt.o<? super i<? super T>, ? super Throwable, ? super Long, ? super mt.b<? super Boolean>, ? extends Object> oVar) {
        return new d(hVar, oVar);
    }
}
