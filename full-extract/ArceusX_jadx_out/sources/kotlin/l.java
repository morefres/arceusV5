package kotlin;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import backtraceio.library.services.BacktraceMetrics;
import gt.o;
import java.util.concurrent.atomic.AtomicInteger;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import lu.g;
import lu.y;
import mt.b;
import mu.h;
import mu.i;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;
import ot.m;
import yt.n;

@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008a\u0001\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000624\u0010\f\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0081@¢\u0006\u0004\b\r\u0010\u000e*\u001c\b\u0002\u0010\u0010\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f2\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f¨\u0006\u0011"}, d2 = {"R", "T", "Lmu/i;", "", "Lmu/h;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lmt/b;", "", "", "transform", ve.a.f33391e, "(Lmu/i;[Lmu/h;Lkotlin/jvm/functions/Function0;Lyt/n;Lmt/b;)Ljava/lang/Object;", "Lkotlin/collections/IndexedValue;", "Update", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {
        public final /* synthetic */ Function0<T[]> A;
        public final /* synthetic */ n<i<? super R>, T[], b<? super Unit>, Object> B;
        public final /* synthetic */ i<R> C;

        /* renamed from: t, reason: collision with root package name */
        public Object f27418t;

        /* renamed from: u, reason: collision with root package name */
        public Object f27419u;

        /* renamed from: v, reason: collision with root package name */
        public int f27420v;

        /* renamed from: w, reason: collision with root package name */
        public int f27421w;

        /* renamed from: x, reason: collision with root package name */
        public int f27422x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f27423y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T>[] f27424z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {MotionEventCompat.AXIS_RELATIVE_Y}, m = "invokeSuspend")
        /* renamed from: nu.l$a$a, reason: collision with other inner class name */
        public static final class C0475a extends m implements Function2<p0, b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f27425t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h<T>[] f27426u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ int f27427v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f27428w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g<IndexedValue<Object>> f27429x;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: nu.l$a$a$a, reason: collision with other inner class name */
            public static final class C0476a<T> implements i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ g<IndexedValue<Object>> f27430a;
                public final /* synthetic */ int b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, BacktraceMetrics.defaultTimeIntervalInMin}, m = "emit")
                /* renamed from: nu.l$a$a$a$a, reason: collision with other inner class name */
                public static final class C0477a extends d {

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f27431t;

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0476a<T> f27432u;

                    /* renamed from: v, reason: collision with root package name */
                    public int f27433v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0477a(C0476a<? super T> c0476a, b<? super C0477a> bVar) {
                        super(bVar);
                        this.f27432u = c0476a;
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        this.f27431t = obj;
                        this.f27433v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return this.f27432u.emit(null, this);
                    }
                }

                public C0476a(g<IndexedValue<Object>> gVar, int i10) {
                    this.f27430a = gVar;
                    this.b = i10;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
                
                    if (ju.m3.a(r0) != r1) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
                
                    if (r8.E(r2, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // mu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, mt.b<? super kotlin.Unit> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof nu.l.a.C0475a.C0476a.C0477a
                        if (r0 == 0) goto L13
                        r0 = r8
                        nu.l$a$a$a$a r0 = (nu.l.a.C0475a.C0476a.C0477a) r0
                        int r1 = r0.f27433v
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f27433v = r1
                        goto L18
                    L13:
                        nu.l$a$a$a$a r0 = new nu.l$a$a$a$a
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.f27431t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f27433v
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        gt.o.b(r8)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        gt.o.b(r8)
                        goto L4d
                    L38:
                        gt.o.b(r8)
                        lu.g<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f27430a
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.b
                        r2.<init>(r5, r7)
                        r0.f27433v = r4
                        java.lang.Object r7 = r8.E(r2, r0)
                        if (r7 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f27433v = r3
                        java.lang.Object r7 = ju.m3.a(r0)
                        if (r7 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f22894a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: nu.l.a.C0475a.C0476a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0475a(h<? extends T>[] hVarArr, int i10, AtomicInteger atomicInteger, g<IndexedValue<Object>> gVar, b<? super C0475a> bVar) {
                super(2, bVar);
                this.f27426u = hVarArr;
                this.f27427v = i10;
                this.f27428w = atomicInteger;
                this.f27429x = gVar;
            }

            @Override // ot.a
            public final b<Unit> create(Object obj, b<?> bVar) {
                return new C0475a(this.f27426u, this.f27427v, this.f27428w, this.f27429x, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                Object e10 = c.e();
                int i10 = this.f27425t;
                try {
                    if (i10 == 0) {
                        o.b(obj);
                        h[] hVarArr = this.f27426u;
                        int i11 = this.f27427v;
                        h hVar = hVarArr[i11];
                        C0476a c0476a = new C0476a(this.f27429x, i11);
                        this.f27425t = 1;
                        if (hVar.collect(c0476a, this) == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        y.a.a(this.f27429x, null, 1, null);
                    }
                    return Unit.f22894a;
                } finally {
                    if (this.f27428w.decrementAndGet() == 0) {
                        y.a.a(this.f27429x, null, 1, null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
                return ((C0475a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h<? extends T>[] hVarArr, Function0<T[]> function0, n<? super i<? super R>, ? super T[], ? super b<? super Unit>, ? extends Object> nVar, i<? super R> iVar, b<? super a> bVar) {
            super(2, bVar);
            this.f27424z = hVarArr;
            this.A = function0;
            this.B = nVar;
            this.C = iVar;
        }

        @Override // ot.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f27424z, this.A, this.B, this.C, bVar);
            aVar.f27423y = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0106, code lost:
        
            if (r10.invoke(r11, r9, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
        
            if (r11.invoke(r12, r10, r21) == r1) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
        
            if (r6 != 0) goto L44;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00c1 A[LOOP:0: B:18:0x00c1->B:33:?, LOOP_START, PHI: r6 r10
  0x00c1: PHI (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v12 kotlin.collections.IndexedValue) binds: [B:15:0x00bc, B:33:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0106 -> B:10:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0126 -> B:10:0x0129). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: nu.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Nullable
    public static final <R, T> Object a(@NotNull i<? super R> iVar, @NotNull h<? extends T>[] hVarArr, @NotNull Function0<T[]> function0, @NotNull n<? super i<? super R>, ? super T[], ? super b<? super Unit>, ? extends Object> nVar, @NotNull b<? super Unit> bVar) {
        Object a10 = o.a(new a(hVarArr, function0, nVar, iVar, null), bVar);
        return a10 == c.e() ? a10 : Unit.f22894a;
    }
}
