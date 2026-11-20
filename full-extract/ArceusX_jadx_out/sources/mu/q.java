package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.mlkit.common.MlKitException;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import ju.e3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lu.k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a-\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, d2 = {"T", "Lmu/h;", "", "timeoutMillis", j6.b.f21518e, "(Lmu/h;J)Lmu/h;", "Lkotlin/Function1;", "timeoutMillisSelector", rl.d.f30696a, "(Lmu/h;Lkotlin/jvm/functions/Function1;)Lmu/h;", "Lkotlin/time/a;", "timeout", "e", "f", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lju/p0;", "Lmu/i;", "downstream", "", "<anonymous>", "(Lju/p0;Lmu/i;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
    public static final class a<T> extends ot.m implements yt.n<ju.p0, i<? super T>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f25112t;

        /* renamed from: u, reason: collision with root package name */
        public Object f25113u;

        /* renamed from: v, reason: collision with root package name */
        public int f25114v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f25115w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f25116x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Long> f25117y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ h<T> f25118z;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
        /* renamed from: mu.q$a$a, reason: collision with other inner class name */
        public static final class C0443a extends ot.m implements Function1<mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f25119t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i<T> f25120u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<Object> f25121v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0443a(i<? super T> iVar, kotlin.jvm.internal.c0<Object> c0Var, mt.b<? super C0443a> bVar) {
                super(1, bVar);
                this.f25120u = iVar;
                this.f25121v = c0Var;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new C0443a(this.f25120u, this.f25121v, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f25119t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    i<T> iVar = this.f25120u;
                    pu.e0 e0Var = kotlin.t.f27442a;
                    T t8 = this.f25121v.f22963a;
                    if (t8 == e0Var) {
                        t8 = null;
                    }
                    this.f25119t = 1;
                    if (iVar.emit(t8, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                this.f25121v.f22963a = null;
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<? super Unit> bVar) {
                return ((C0443a) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Llu/k;", "", "value", "", "<anonymous>", "(Llu/k;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<lu.k<? extends Object>, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public Object f25122t;

            /* renamed from: u, reason: collision with root package name */
            public int f25123u;

            /* renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f25124v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.c0<Object> f25125w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ i<T> f25126x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(kotlin.jvm.internal.c0<Object> c0Var, i<? super T> iVar, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f25125w = c0Var;
                this.f25126x = iVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                b bVar2 = new b(this.f25125w, this.f25126x, bVar);
                bVar2.f25124v = obj;
                return bVar2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(lu.k<? extends Object> kVar, mt.b<? super Unit> bVar) {
                return o(kVar.getHolder(), bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                kotlin.jvm.internal.c0<Object> c0Var;
                kotlin.jvm.internal.c0<Object> c0Var2;
                Object e10 = nt.c.e();
                int i10 = this.f25123u;
                if (i10 == 0) {
                    gt.o.b(obj);
                    T t8 = (T) ((lu.k) this.f25124v).getHolder();
                    c0Var = this.f25125w;
                    boolean z10 = t8 instanceof k.c;
                    if (!z10) {
                        c0Var.f22963a = t8;
                    }
                    i<T> iVar = this.f25126x;
                    if (z10) {
                        Throwable e11 = lu.k.e(t8);
                        if (e11 != null) {
                            throw e11;
                        }
                        Object obj2 = c0Var.f22963a;
                        if (obj2 != null) {
                            if (obj2 == kotlin.t.f27442a) {
                                obj2 = null;
                            }
                            this.f25124v = t8;
                            this.f25122t = c0Var;
                            this.f25123u = 1;
                            if (iVar.emit(obj2, this) == e10) {
                                return e10;
                            }
                            c0Var2 = c0Var;
                        }
                        c0Var.f22963a = (T) kotlin.t.f27443c;
                    }
                    return Unit.f22894a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var2 = (kotlin.jvm.internal.c0) this.f25122t;
                gt.o.b(obj);
                c0Var = c0Var2;
                c0Var.f22963a = (T) kotlin.t.f27443c;
                return Unit.f22894a;
            }

            public final Object o(Object obj, mt.b<? super Unit> bVar) {
                return ((b) create(lu.k.b(obj), bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/v;", "", "", "<anonymous>", "(Llu/v;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
        public static final class c extends ot.m implements Function2<lu.v<? super Object>, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f25127t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f25128u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f25129v;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: mu.q$a$c$a, reason: collision with other inner class name */
            public static final class C0444a<T> implements i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ lu.v<Object> f25130a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "emit")
                /* renamed from: mu.q$a$c$a$a, reason: collision with other inner class name */
                public static final class C0445a extends ot.d {

                    /* renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f25131t;

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ C0444a<T> f25132u;

                    /* renamed from: v, reason: collision with root package name */
                    public int f25133v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0445a(C0444a<? super T> c0444a, mt.b<? super C0445a> bVar) {
                        super(bVar);
                        this.f25132u = c0444a;
                    }

                    @Override // ot.a
                    public final Object invokeSuspend(Object obj) {
                        this.f25131t = obj;
                        this.f25133v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        return this.f25132u.emit(null, this);
                    }
                }

                public C0444a(lu.v<Object> vVar) {
                    this.f25130a = vVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // mu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r5, mt.b<? super kotlin.Unit> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof mu.q.a.c.C0444a.C0445a
                        if (r0 == 0) goto L13
                        r0 = r6
                        mu.q$a$c$a$a r0 = (mu.q.a.c.C0444a.C0445a) r0
                        int r1 = r0.f25133v
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f25133v = r1
                        goto L18
                    L13:
                        mu.q$a$c$a$a r0 = new mu.q$a$c$a$a
                        r0.<init>(r4, r6)
                    L18:
                        java.lang.Object r6 = r0.f25131t
                        java.lang.Object r1 = nt.c.e()
                        int r2 = r0.f25133v
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        gt.o.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        gt.o.b(r6)
                        lu.v<java.lang.Object> r6 = r4.f25130a
                        if (r5 != 0) goto L3a
                        pu.e0 r5 = kotlin.t.f27442a
                    L3a:
                        r0.f25133v = r3
                        java.lang.Object r5 = r6.E(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f22894a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: mu.q.a.c.C0444a.emit(java.lang.Object, mt.b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(h<? extends T> hVar, mt.b<? super c> bVar) {
                super(2, bVar);
                this.f25129v = hVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                c cVar = new c(this.f25129v, bVar);
                cVar.f25128u = obj;
                return cVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f25127t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    lu.v vVar = (lu.v) this.f25128u;
                    h<T> hVar = this.f25129v;
                    C0444a c0444a = new C0444a(vVar);
                    this.f25127t = 1;
                    if (hVar.collect(c0444a, this) == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22894a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(lu.v<Object> vVar, mt.b<? super Unit> bVar) {
                return ((c) create(vVar, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, Long> function1, h<? extends T> hVar, mt.b<? super a> bVar) {
            super(3, bVar);
            this.f25117y = function1;
            this.f25118z = hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
        
            if (r7.emit(r15, r14) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
        
            if (r7.o(r14) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e2 -> B:6:0x001e). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // yt.n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ju.p0 p0Var, i<? super T> iVar, mt.b<? super Unit> bVar) {
            a aVar = new a(this.f25117y, this.f25118z, bVar);
            aVar.f25115w = p0Var;
            aVar.f25116x = iVar;
            return aVar.invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lju/p0;", "Lmu/i;", "downStream", "", "<anonymous>", "(Lju/p0;Lmu/i;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {HttpStatusCode.PAYLOAD_TOO_LARGE_413}, m = "invokeSuspend")
    public static final class b<T> extends ot.m implements yt.n<ju.p0, i<? super T>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public long f25134t;

        /* renamed from: u, reason: collision with root package name */
        public int f25135u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f25136v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f25137w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ long f25138x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ h<T> f25139y;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Llu/k;", "value", "", "<anonymous>", "(Llu/k;)Z"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
        public static final class a extends ot.m implements Function2<lu.k<? extends T>, mt.b<? super Boolean>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f25140t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f25141u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ i<T> f25142v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, mt.b<? super a> bVar) {
                super(2, bVar);
                this.f25142v = iVar;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                a aVar = new a(this.f25142v, bVar);
                aVar.f25141u = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, mt.b<? super Boolean> bVar) {
                return o(((lu.k) obj).getHolder(), bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
            @Override // ot.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = nt.c.e()
                    int r1 = r4.f25140t
                    r2 = 1
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    java.lang.Object r0 = r4.f25141u
                    gt.o.b(r5)
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    gt.o.b(r5)
                    java.lang.Object r5 = r4.f25141u
                    lu.k r5 = (lu.k) r5
                    java.lang.Object r5 = r5.getHolder()
                    mu.i<T> r1 = r4.f25142v
                    boolean r3 = r5 instanceof lu.k.c
                    if (r3 != 0) goto L37
                    r4.f25141u = r5
                    r4.f25140t = r2
                    java.lang.Object r1 = r1.emit(r5, r4)
                    if (r1 != r0) goto L35
                    return r0
                L35:
                    r0 = r5
                L36:
                    r5 = r0
                L37:
                    boolean r0 = r5 instanceof lu.k.Closed
                    if (r0 == 0) goto L49
                    java.lang.Throwable r5 = lu.k.e(r5)
                    if (r5 != 0) goto L48
                    r5 = 0
                    java.lang.Boolean r5 = ot.b.a(r5)
                    return r5
                L48:
                    throw r5
                L49:
                    java.lang.Boolean r5 = ot.b.a(r2)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.q.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            public final Object o(Object obj, mt.b<? super Boolean> bVar) {
                return ((a) create(lu.k.b(obj), bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
        /* renamed from: mu.q$b$b, reason: collision with other inner class name */
        public static final class C0446b extends ot.m implements Function1<mt.b<?>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f25143t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f25144u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0446b(long j10, mt.b<? super C0446b> bVar) {
                super(1, bVar);
                this.f25144u = j10;
            }

            @Override // ot.a
            public final mt.b<Unit> create(mt.b<?> bVar) {
                return new C0446b(this.f25144u, bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f25143t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                throw new e3("Timed out waiting for " + ((Object) kotlin.time.a.R(this.f25144u)));
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(mt.b<?> bVar) {
                return ((C0446b) create(bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j10, h<? extends T> hVar, mt.b<? super b> bVar) {
            super(3, bVar);
            this.f25138x = j10;
            this.f25139y = hVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0076 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0074 -> B:5:0x0077). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r9.f25135u
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.f25134t
                java.lang.Object r1 = r9.f25137w
                lu.x r1 = (lu.x) r1
                java.lang.Object r6 = r9.f25136v
                mu.i r6 = (mu.i) r6
                gt.o.b(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                gt.o.b(r10)
                java.lang.Object r10 = r9.f25136v
                ju.p0 r10 = (ju.p0) r10
                java.lang.Object r1 = r9.f25137w
                mu.i r1 = (mu.i) r1
                long r4 = r9.f25138x
                kotlin.time.a$a r6 = kotlin.time.a.INSTANCE
                long r6 = r6.b()
                int r4 = kotlin.time.a.j(r4, r6)
                if (r4 <= 0) goto L82
                mu.h<T> r4 = r9.f25139y
                r5 = 0
                r6 = 2
                mu.h r4 = mu.j.c(r4, r5, r3, r6, r3)
                lu.x r10 = mu.j.G(r4, r10)
                long r4 = r9.f25138x
                r6 = r1
                r1 = r10
            L4b:
                su.k r10 = new su.k
                kotlin.coroutines.CoroutineContext r7 = r9.getContext()
                r10.<init>(r7)
                su.h r7 = r1.z()
                mu.q$b$a r8 = new mu.q$b$a
                r8.<init>(r6, r3)
                r10.a(r7, r8)
                mu.q$b$b r7 = new mu.q$b$b
                r7.<init>(r4, r3)
                su.c.b(r10, r4, r7)
                r9.f25136v = r6
                r9.f25137w = r1
                r9.f25134t = r4
                r9.f25135u = r2
                java.lang.Object r10 = r10.o(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                kotlin.Unit r10 = kotlin.Unit.f22894a
                return r10
            L82:
                ju.e3 r10 = new ju.e3
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.q.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // yt.n
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ju.p0 p0Var, i<? super T> iVar, mt.b<? super Unit> bVar) {
            b bVar2 = new b(this.f25138x, this.f25139y, bVar);
            bVar2.f25136v = p0Var;
            bVar2.f25137w = iVar;
            return bVar2.invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, final long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? hVar : d(hVar, new Function1() { // from class: mu.p
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    long c10;
                    c10 = q.c(j10, obj);
                    return Long.valueOf(c10);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final long c(long j10, Object obj) {
        return j10;
    }

    public static final <T> h<T> d(h<? extends T> hVar, Function1<? super T, Long> function1) {
        return kotlin.o.b(new a(function1, hVar, null));
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar, long j10) {
        return f(hVar, j10);
    }

    public static final <T> h<T> f(h<? extends T> hVar, long j10) {
        return kotlin.o.b(new b(j10, hVar, null));
    }
}
