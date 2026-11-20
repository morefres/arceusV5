package lu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import gt.n;
import ju.j0;
import ju.p0;
import ju.r0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0093\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u00182*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Llu/v;", "Lkotlin/Function0;", "", "block", ve.a.f33391e, "(Llu/v;Lkotlin/jvm/functions/Function0;Lmt/b;)Ljava/lang/Object;", "E", "Lju/p0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lmt/b;", "", "Llu/x;", j6.b.f21518e, "(Lju/p0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Llu/x;", "Llu/a;", "onBufferOverflow", "Lju/r0;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lju/p0;Lkotlin/coroutines/CoroutineContext;ILlu/a;Lju/r0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Llu/x;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class t {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f23915t;

        /* renamed from: u, reason: collision with root package name */
        public Object f23916u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f23917v;

        /* renamed from: w, reason: collision with root package name */
        public int f23918w;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23917v = obj;
            this.f23918w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return t.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ju.n<Unit> f23919a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ju.n<? super Unit> nVar) {
            this.f23919a = nVar;
        }

        public final void a(Throwable th2) {
            ju.n<Unit> nVar = this.f23919a;
            n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(Unit.f22894a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull lu.v<?> r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r5, @org.jetbrains.annotations.NotNull mt.b<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof lu.t.a
            if (r0 == 0) goto L13
            r0 = r6
            lu.t$a r0 = (lu.t.a) r0
            int r1 = r0.f23918w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23918w = r1
            goto L18
        L13:
            lu.t$a r0 = new lu.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f23917v
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f23918w
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f23916u
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f23915t
            lu.v r4 = (lu.v) r4
            gt.o.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            gt.o.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            ju.d2$b r2 = ju.d2.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f23915t = r4     // Catch: java.lang.Throwable -> L32
            r0.f23916u = r5     // Catch: java.lang.Throwable -> L32
            r0.f23918w = r3     // Catch: java.lang.Throwable -> L32
            ju.p r6 = new ju.p     // Catch: java.lang.Throwable -> L32
            mt.b r2 = nt.b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.F()     // Catch: java.lang.Throwable -> L32
            lu.t$b r2 = new lu.t$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.s(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.z()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = nt.c.e()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            ot.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f22894a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.t.a(lu.v, kotlin.jvm.functions.Function0, mt.b):java.lang.Object");
    }

    @NotNull
    public static final <E> x<E> b(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull Function2<? super v<? super E>, ? super mt.b<? super Unit>, ? extends Object> function2) {
        return c(p0Var, coroutineContext, i10, lu.a.f23848a, r0.f22143a, null, function2);
    }

    @NotNull
    public static final <E> x<E> c(@NotNull p0 p0Var, @NotNull CoroutineContext coroutineContext, int i10, @NotNull lu.a aVar, @NotNull r0 r0Var, @Nullable Function1<? super Throwable, Unit> function1, @NotNull Function2<? super v<? super E>, ? super mt.b<? super Unit>, ? extends Object> function2) {
        u uVar = new u(j0.j(p0Var, coroutineContext), j.b(i10, aVar, null, 4, null));
        if (function1 != null) {
            uVar.o(function1);
        }
        uVar.W0(r0Var, uVar, function2);
        return uVar;
    }

    public static /* synthetic */ x d(p0 p0Var, CoroutineContext coroutineContext, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return b(p0Var, coroutineContext, i10, function2);
    }

    public static /* synthetic */ x e(p0 p0Var, CoroutineContext coroutineContext, int i10, lu.a aVar, r0 r0Var, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f22936a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = lu.a.f23848a;
        }
        if ((i11 & 8) != 0) {
            r0Var = r0.f22143a;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return c(p0Var, coroutineContext, i10, aVar, r0Var, function12, function2);
    }
}
