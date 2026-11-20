package mu;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Lmu/i;", "Llu/x;", "channel", "", j6.b.f21518e, "(Lmu/i;Llu/x;Lmt/b;)Ljava/lang/Object;", "", "consume", "c", "(Lmu/i;Llu/x;ZLmt/b;)Ljava/lang/Object;", "Lmu/h;", "e", "(Llu/x;)Lmu/h;", "Lju/p0;", "scope", rl.d.f30696a, "(Lmu/h;Lju/p0;)Llu/x;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, MotionEventCompat.AXIS_GENERIC_2}, m = "emitAllImpl$FlowKt__ChannelsKt")
    public static final class a<T> extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f25086t;

        /* renamed from: u, reason: collision with root package name */
        public Object f25087u;

        /* renamed from: v, reason: collision with root package name */
        public Object f25088v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f25089w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f25090x;

        /* renamed from: y, reason: collision with root package name */
        public int f25091y;

        public a(mt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25090x = obj;
            this.f25091y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return l.c(null, null, false, this);
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull i<? super T> iVar, @NotNull lu.x<? extends T> xVar, @NotNull mt.b<? super Unit> bVar) {
        Object c10 = c(iVar, xVar, true, bVar);
        return c10 == nt.c.e() ? c10 : Unit.f22894a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:20:0x0077, B:22:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mu.i] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(mu.i<? super T> r6, lu.x<? extends T> r7, boolean r8, mt.b<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof mu.l.a
            if (r0 == 0) goto L13
            r0 = r9
            mu.l$a r0 = (mu.l.a) r0
            int r1 = r0.f25091y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25091y = r1
            goto L18
        L13:
            mu.l$a r0 = new mu.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25090x
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f25091y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f25089w
            java.lang.Object r6 = r0.f25088v
            lu.i r6 = (lu.i) r6
            java.lang.Object r7 = r0.f25087u
            lu.x r7 = (lu.x) r7
            java.lang.Object r2 = r0.f25086t
            mu.i r2 = (mu.i) r2
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f25089w
            java.lang.Object r6 = r0.f25088v
            lu.i r6 = (lu.i) r6
            java.lang.Object r7 = r0.f25087u
            lu.x r7 = (lu.x) r7
            java.lang.Object r2 = r0.f25086t
            mu.i r2 = (mu.i) r2
            gt.o.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            gt.o.b(r9)
            mu.j.r(r6)
            lu.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f25086t = r6     // Catch: java.lang.Throwable -> L3c
            r0.f25087u = r7     // Catch: java.lang.Throwable -> L3c
            r0.f25088v = r9     // Catch: java.lang.Throwable -> L3c
            r0.f25089w = r8     // Catch: java.lang.Throwable -> L3c
            r0.f25091y = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f25086t = r2     // Catch: java.lang.Throwable -> L3c
            r0.f25087u = r7     // Catch: java.lang.Throwable -> L3c
            r0.f25088v = r6     // Catch: java.lang.Throwable -> L3c
            r0.f25089w = r8     // Catch: java.lang.Throwable -> L3c
            r0.f25091y = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            lu.n.a(r7, r6)
        L9a:
            kotlin.Unit r6 = kotlin.Unit.f22894a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            lu.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.l.c(mu.i, lu.x, boolean, mt.b):java.lang.Object");
    }

    @NotNull
    public static final <T> lu.x<T> d(@NotNull h<? extends T> hVar, @NotNull ju.p0 p0Var) {
        return kotlin.f.b(hVar).m(p0Var);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull lu.x<? extends T> xVar) {
        return new e(xVar, false, null, 0, null, 28, null);
    }
}
