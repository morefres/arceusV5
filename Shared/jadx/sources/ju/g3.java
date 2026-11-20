package ju;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\f\u0010\t\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001aY\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lju/p0;", "Lmt/b;", "", "block", "c", "(JLkotlin/jvm/functions/Function2;Lmt/b;)Ljava/lang/Object;", "Lkotlin/time/a;", "timeout", rl.d.f30696a, "e", "U", "Lju/f3;", "coroutine", j6.b.f21518e, "(Lju/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lju/y0;", "delay", "Lju/d2;", "Lju/e3;", ve.a.f33391e, "(JLju/y0;Lju/d2;)Lju/e3;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g3 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
    public static final class a<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public long f22086t;

        /* renamed from: u, reason: collision with root package name */
        public Object f22087u;

        /* renamed from: v, reason: collision with root package name */
        public Object f22088v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f22089w;

        /* renamed from: x, reason: collision with root package name */
        public int f22090x;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22089w = obj;
            this.f22090x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return g3.e(0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == null) goto L9;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ju.e3 a(long r2, @org.jetbrains.annotations.NotNull ju.y0 r4, @org.jetbrains.annotations.NotNull ju.d2 r5) {
        /*
            boolean r0 = r4 instanceof ju.a1
            if (r0 == 0) goto L7
            ju.a1 r4 = (ju.a1) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            kotlin.time.a$a r0 = kotlin.time.a.INSTANCE
            iu.b r0 = iu.b.f21120d
            long r0 = kotlin.time.b.q(r2, r0)
            java.lang.String r4 = r4.s(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            ju.e3 r2 = new ju.e3
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ju.g3.a(long, ju.y0, ju.d2):ju.e3");
    }

    public static final <U, T extends U> Object b(f3<U, ? super T> f3Var, Function2<? super p0, ? super mt.b<? super T>, ? extends Object> function2) {
        g2.e(f3Var, z0.d(f3Var.uCont.getContext()).h(f3Var.time, f3Var, f3Var.getContext()));
        return qu.b.e(f3Var, f3Var, function2);
    }

    @Nullable
    public static final <T> Object c(long j10, @NotNull Function2<? super p0, ? super mt.b<? super T>, ? extends Object> function2, @NotNull mt.b<? super T> bVar) {
        if (j10 <= 0) {
            throw new e3("Timed out immediately");
        }
        Object b = b(new f3(j10, bVar), function2);
        if (b == nt.c.e()) {
            ot.h.c(bVar);
        }
        return b;
    }

    @Nullable
    public static final <T> Object d(long j10, @NotNull Function2<? super p0, ? super mt.b<? super T>, ? extends Object> function2, @NotNull mt.b<? super T> bVar) {
        return c(z0.e(j10), function2, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ju.f3] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super ju.p0, ? super mt.b<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull mt.b<? super T> r10) {
        /*
            boolean r0 = r10 instanceof ju.g3.a
            if (r0 == 0) goto L13
            r0 = r10
            ju.g3$a r0 = (ju.g3.a) r0
            int r1 = r0.f22090x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22090x = r1
            goto L18
        L13:
            ju.g3$a r0 = new ju.g3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f22089w
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f22090x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f22088v
            kotlin.jvm.internal.c0 r7 = (kotlin.jvm.internal.c0) r7
            java.lang.Object r8 = r0.f22087u
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            gt.o.b(r10)     // Catch: ju.e3 -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            gt.o.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.c0 r10 = new kotlin.jvm.internal.c0
            r10.<init>()
            r0.f22087u = r9     // Catch: ju.e3 -> L68
            r0.f22088v = r10     // Catch: ju.e3 -> L68
            r0.f22086t = r7     // Catch: ju.e3 -> L68
            r0.f22090x = r4     // Catch: ju.e3 -> L68
            ju.f3 r2 = new ju.f3     // Catch: ju.e3 -> L68
            r2.<init>(r7, r0)     // Catch: ju.e3 -> L68
            r10.f22963a = r2     // Catch: ju.e3 -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: ju.e3 -> L68
            java.lang.Object r8 = nt.c.e()     // Catch: ju.e3 -> L68
            if (r7 != r8) goto L6b
            ot.h.c(r0)     // Catch: ju.e3 -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            ju.d2 r9 = r8.coroutine
            T r7 = r7.f22963a
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ju.g3.e(long, kotlin.jvm.functions.Function2, mt.b):java.lang.Object");
    }
}
