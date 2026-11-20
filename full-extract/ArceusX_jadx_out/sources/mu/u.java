package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u001aM\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\t\u001aU\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000120\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\\\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000320\u0010\u0007\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Lmu/h;", "Lkotlin/Function2;", "Lmu/i;", "Lmt/b;", "", "", "action", "e", "(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;", "Lkotlin/Function3;", "", rl.d.f30696a, "(Lmu/h;Lyt/n;)Lmu/h;", j6.b.f21518e, "(Lmu/i;)V", "cause", "c", "(Lmu/i;Lyt/n;Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
    public static final class a<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25157t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25158u;

        /* renamed from: v, reason: collision with root package name */
        public int f25159v;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25158u = obj;
            this.f25159v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return u.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/u$b", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f25160a;
        public final /* synthetic */ yt.n b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, 117, 124}, m = "collect")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25161t;

            /* renamed from: u, reason: collision with root package name */
            public int f25162u;

            /* renamed from: w, reason: collision with root package name */
            public Object f25164w;

            /* renamed from: x, reason: collision with root package name */
            public Object f25165x;

            public a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25161t = obj;
                this.f25162u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return b.this.collect(null, this);
            }
        }

        public b(h hVar, yt.n nVar) {
            this.f25160a = hVar;
            this.b = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(mu.i<? super T> r9, mt.b<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof mu.u.b.a
                if (r0 == 0) goto L13
                r0 = r10
                mu.u$b$a r0 = (mu.u.b.a) r0
                int r1 = r0.f25162u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25162u = r1
                goto L18
            L13:
                mu.u$b$a r0 = new mu.u$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f25161t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25162u
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L55
                if (r2 == r5) goto L47
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f25164w
                nu.v r9 = (kotlin.v) r9
                gt.o.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L89
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f25164w
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                gt.o.b(r10)
                goto Lad
            L47:
                java.lang.Object r9 = r0.f25165x
                mu.i r9 = (mu.i) r9
                java.lang.Object r2 = r0.f25164w
                mu.u$b r2 = (mu.u.b) r2
                gt.o.b(r10)     // Catch: java.lang.Throwable -> L53
                goto L68
            L53:
                r9 = move-exception
                goto L99
            L55:
                gt.o.b(r10)
                mu.h r10 = r8.f25160a     // Catch: java.lang.Throwable -> L97
                r0.f25164w = r8     // Catch: java.lang.Throwable -> L97
                r0.f25165x = r9     // Catch: java.lang.Throwable -> L97
                r0.f25162u = r5     // Catch: java.lang.Throwable -> L97
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L97
                if (r10 != r1) goto L67
                goto Lac
            L67:
                r2 = r8
            L68:
                nu.v r10 = new nu.v
                kotlin.coroutines.CoroutineContext r4 = r0.getContext()
                r10.<init>(r9, r4)
                yt.n r9 = r2.b     // Catch: java.lang.Throwable -> L8f
                r0.f25164w = r10     // Catch: java.lang.Throwable -> L8f
                r0.f25165x = r6     // Catch: java.lang.Throwable -> L8f
                r0.f25162u = r3     // Catch: java.lang.Throwable -> L8f
                r2 = 6
                kotlin.jvm.internal.l.c(r2)     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
                r0 = 7
                kotlin.jvm.internal.l.c(r0)     // Catch: java.lang.Throwable -> L8f
                if (r9 != r1) goto L88
                goto Lac
            L88:
                r9 = r10
            L89:
                r9.releaseIntercepted()
                kotlin.Unit r9 = kotlin.Unit.f22894a
                return r9
            L8f:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L93:
                r9.releaseIntercepted()
                throw r10
            L97:
                r9 = move-exception
                r2 = r8
            L99:
                mu.u0 r10 = new mu.u0
                r10.<init>(r9)
                yt.n r2 = r2.b
                r0.f25164w = r9
                r0.f25165x = r6
                r0.f25162u = r4
                java.lang.Object r10 = mu.u.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lad
            Lac:
                return r1
            Lad:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.u.b.collect(mu.i, mt.b):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/u$c", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2 f25166a;
        public final /* synthetic */ h b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
        public static final class a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25167t;

            /* renamed from: u, reason: collision with root package name */
            public int f25168u;

            /* renamed from: w, reason: collision with root package name */
            public Object f25170w;

            /* renamed from: x, reason: collision with root package name */
            public Object f25171x;

            /* renamed from: y, reason: collision with root package name */
            public Object f25172y;

            public a(mt.b bVar) {
                super(bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25167t = obj;
                this.f25168u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, h hVar) {
            this.f25166a = function2;
            this.b = hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
        
            if (r7.collect(r2, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // mu.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(mu.i<? super T> r7, mt.b<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof mu.u.c.a
                if (r0 == 0) goto L13
                r0 = r8
                mu.u$c$a r0 = (mu.u.c.a) r0
                int r1 = r0.f25168u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25168u = r1
                goto L18
            L13:
                mu.u$c$a r0 = new mu.u$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f25167t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25168u
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                gt.o.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f25172y
                nu.v r7 = (kotlin.v) r7
                java.lang.Object r2 = r0.f25171x
                mu.i r2 = (mu.i) r2
                java.lang.Object r4 = r0.f25170w
                mu.u$c r4 = (mu.u.c) r4
                gt.o.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                gt.o.b(r8)
                nu.v r8 = new nu.v
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.f25166a     // Catch: java.lang.Throwable -> L86
                r0.f25170w = r6     // Catch: java.lang.Throwable -> L86
                r0.f25171x = r7     // Catch: java.lang.Throwable -> L86
                r0.f25172y = r8     // Catch: java.lang.Throwable -> L86
                r0.f25168u = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.l.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.l.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                mu.h r7 = r4.b
                r8 = 0
                r0.f25170w = r8
                r0.f25171x = r8
                r0.f25172y = r8
                r0.f25168u = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                kotlin.Unit r7 = kotlin.Unit.f22894a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.u.c.collect(mu.i, mt.b):java.lang.Object");
        }
    }

    public static final void b(@NotNull i<?> iVar) {
        if (iVar instanceof u0) {
            throw ((u0) iVar).e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(mu.i<? super T> r4, yt.n<? super mu.i<? super T>, ? super java.lang.Throwable, ? super mt.b<? super kotlin.Unit>, ? extends java.lang.Object> r5, java.lang.Throwable r6, mt.b<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof mu.u.a
            if (r0 == 0) goto L13
            r0 = r7
            mu.u$a r0 = (mu.u.a) r0
            int r1 = r0.f25159v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25159v = r1
            goto L18
        L13:
            mu.u$a r0 = new mu.u$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25158u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25159v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f25157t
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            gt.o.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            gt.o.b(r7)
            r0.f25157t = r6     // Catch: java.lang.Throwable -> L2e
            r0.f25159v = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r4 = kotlin.Unit.f22894a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            gt.a.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.u.c(mu.i, yt.n, java.lang.Throwable, mt.b):java.lang.Object");
    }

    @NotNull
    public static final <T> h<T> d(@NotNull h<? extends T> hVar, @NotNull yt.n<? super i<? super T>, ? super Throwable, ? super mt.b<? super Unit>, ? extends Object> nVar) {
        return new b(hVar, nVar);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, @NotNull Function2<? super i<? super T>, ? super mt.b<? super Unit>, ? extends Object> function2) {
        return new c(function2, hVar);
    }
}
