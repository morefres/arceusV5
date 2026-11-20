package ju;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\n\u0010\u0007\u001a\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"", ve.a.f33391e, "(Lmt/b;)Ljava/lang/Object;", "", "timeMillis", "", j6.b.f21518e, "(JLmt/b;)Ljava/lang/Object;", "Lkotlin/time/a;", "duration", "c", "e", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lju/y0;", rl.d.f30696a, "(Lkotlin/coroutines/CoroutineContext;)Lju/y0;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class z0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", l = {160}, m = "awaitCancellation")
    public static final class a extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f22162t;

        /* renamed from: u, reason: collision with root package name */
        public int f22163u;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22162t = obj;
            this.f22163u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return z0.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull mt.b<?> r4) {
        /*
            boolean r0 = r4 instanceof ju.z0.a
            if (r0 == 0) goto L13
            r0 = r4
            ju.z0$a r0 = (ju.z0.a) r0
            int r1 = r0.f22163u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22163u = r1
            goto L18
        L13:
            ju.z0$a r0 = new ju.z0$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f22162t
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22163u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2d:
            gt.o.b(r4)
            goto L52
        L31:
            gt.o.b(r4)
            r0.f22163u = r3
            ju.p r4 = new ju.p
            mt.b r2 = nt.b.c(r0)
            r4.<init>(r2, r3)
            r4.F()
            java.lang.Object r4 = r4.z()
            java.lang.Object r2 = nt.c.e()
            if (r4 != r2) goto L4f
            ot.h.c(r0)
        L4f:
            if (r4 != r1) goto L52
            return r1
        L52:
            gt.d r4 = new gt.d
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ju.z0.a(mt.b):java.lang.Object");
    }

    @Nullable
    public static final Object b(long j10, @NotNull mt.b<? super Unit> bVar) {
        if (j10 <= 0) {
            return Unit.f22894a;
        }
        p pVar = new p(nt.b.c(bVar), 1);
        pVar.F();
        if (j10 < Long.MAX_VALUE) {
            d(pVar.getContext()).f(j10, pVar);
        }
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10 == nt.c.e() ? z10 : Unit.f22894a;
    }

    @Nullable
    public static final Object c(long j10, @NotNull mt.b<? super Unit> bVar) {
        Object b = b(e(j10), bVar);
        return b == nt.c.e() ? b : Unit.f22894a;
    }

    @NotNull
    public static final y0 d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.INSTANCE);
        y0 y0Var = element instanceof y0 ? (y0) element : null;
        return y0Var == null ? v0.a() : y0Var;
    }

    public static final long e(long j10) {
        boolean K = kotlin.time.a.K(j10);
        if (K) {
            return kotlin.time.a.w(kotlin.time.a.M(j10, kotlin.time.b.q(999999L, iu.b.b)));
        }
        if (K) {
            throw new gt.l();
        }
        return 0L;
    }
}
