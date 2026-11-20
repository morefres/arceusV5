package kotlin;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import backtraceio.library.services.BacktraceMetrics;
import gt.o;
import ju.d2;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.c0;
import mt.b;
import mu.h;
import nt.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.d;
import ot.f;
import ot.m;
import yt.n;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bc\u0012.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0094@¢\u0006\u0004\b\u0018\u0010\u0019R<\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnu/i;", "T", "R", "Lnu/g;", "Lkotlin/Function3;", "Lmu/i;", "Lmt/b;", "", "", "transform", "Lmu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Llu/a;", "onBufferOverflow", "<init>", "(Lyt/n;Lmu/h;Lkotlin/coroutines/CoroutineContext;ILlu/a;)V", "Lnu/e;", "e", "(Lkotlin/coroutines/CoroutineContext;ILlu/a;)Lnu/e;", "collector", "q", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "Lyt/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i<T, R> extends g<T, R> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n<mu.i<? super R>, T, b<? super Unit>, Object> transform;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {MotionEventCompat.AXIS_BRAKE}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f27397t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f27398u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i<T, R> f27399v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ mu.i<R> f27400w;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: nu.i$a$a, reason: collision with other inner class name */
        public static final class C0473a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c0<d2> f27401a;
            public final /* synthetic */ p0 b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T, R> f27402c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ mu.i<R> f27403d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {BacktraceMetrics.defaultTimeIntervalInMin}, m = "invokeSuspend")
            /* renamed from: nu.i$a$a$a, reason: collision with other inner class name */
            public static final class C0474a extends m implements Function2<p0, mt.b<? super Unit>, Object> {

                /* renamed from: t, reason: collision with root package name */
                public int f27404t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ i<T, R> f27405u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ mu.i<R> f27406v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ T f27407w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0474a(i<T, R> iVar, mu.i<? super R> iVar2, T t8, mt.b<? super C0474a> bVar) {
                    super(2, bVar);
                    this.f27405u = iVar;
                    this.f27406v = iVar2;
                    this.f27407w = t8;
                }

                @Override // ot.a
                public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                    return new C0474a(this.f27405u, this.f27406v, this.f27407w, bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    Object e10 = c.e();
                    int i10 = this.f27404t;
                    if (i10 == 0) {
                        o.b(obj);
                        n nVar = this.f27405u.transform;
                        mu.i<R> iVar = this.f27406v;
                        T t8 = this.f27407w;
                        this.f27404t = 1;
                        if (nVar.invoke(iVar, t8, this) == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj);
                    }
                    return Unit.f22894a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
                    return ((C0474a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {MotionEventCompat.AXIS_SCROLL}, m = "emit")
            /* renamed from: nu.i$a$a$b */
            public static final class b extends d {

                /* renamed from: t, reason: collision with root package name */
                public Object f27408t;

                /* renamed from: u, reason: collision with root package name */
                public Object f27409u;

                /* renamed from: v, reason: collision with root package name */
                public Object f27410v;

                /* renamed from: w, reason: collision with root package name */
                public /* synthetic */ Object f27411w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ C0473a<T> f27412x;

                /* renamed from: y, reason: collision with root package name */
                public int f27413y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0473a<? super T> c0473a, mt.b<? super b> bVar) {
                    super(bVar);
                    this.f27412x = c0473a;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f27411w = obj;
                    this.f27413y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f27412x.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0473a(c0<d2> c0Var, p0 p0Var, i<T, R> iVar, mu.i<? super R> iVar2) {
                this.f27401a = c0Var;
                this.b = p0Var;
                this.f27402c = iVar;
                this.f27403d = iVar2;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, mt.b<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof nu.i.a.C0473a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    nu.i$a$a$b r0 = (nu.i.a.C0473a.b) r0
                    int r1 = r0.f27413y
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f27413y = r1
                    goto L18
                L13:
                    nu.i$a$a$b r0 = new nu.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f27411w
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f27413y
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f27410v
                    ju.d2 r8 = (ju.d2) r8
                    java.lang.Object r8 = r0.f27409u
                    java.lang.Object r0 = r0.f27408t
                    nu.i$a$a r0 = (nu.i.a.C0473a) r0
                    gt.o.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    gt.o.b(r9)
                    kotlin.jvm.internal.c0<ju.d2> r9 = r7.f27401a
                    T r9 = r9.f22963a
                    ju.d2 r9 = (ju.d2) r9
                    if (r9 == 0) goto L5d
                    nu.k r2 = new nu.k
                    r2.<init>()
                    r9.c(r2)
                    r0.f27408t = r7
                    r0.f27409u = r8
                    r0.f27410v = r9
                    r0.f27413y = r3
                    java.lang.Object r9 = r9.j(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.c0<ju.d2> r9 = r0.f27401a
                    ju.p0 r1 = r0.b
                    ju.r0 r3 = ju.r0.f22145d
                    nu.i$a$a$a r4 = new nu.i$a$a$a
                    nu.i<T, R> r2 = r0.f27402c
                    mu.i<R> r0 = r0.f27403d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    ju.d2 r8 = ju.i.d(r1, r2, r3, r4, r5, r6)
                    r9.f22963a = r8
                    kotlin.Unit r8 = kotlin.Unit.f22894a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: nu.i.a.C0473a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<T, R> iVar, mu.i<? super R> iVar2, b<? super a> bVar) {
            super(2, bVar);
            this.f27399v = iVar;
            this.f27400w = iVar2;
        }

        @Override // ot.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            a aVar = new a(this.f27399v, this.f27400w, bVar);
            aVar.f27398u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = c.e();
            int i10 = this.f27397t;
            if (i10 == 0) {
                o.b(obj);
                p0 p0Var = (p0) this.f27398u;
                c0 c0Var = new c0();
                i<T, R> iVar = this.f27399v;
                h<S> hVar = iVar.flow;
                C0473a c0473a = new C0473a(c0Var, p0Var, iVar, this.f27400w);
                this.f27397t = 1;
                if (hVar.collect(c0473a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public /* synthetic */ i(n nVar, h hVar, CoroutineContext coroutineContext, int i10, lu.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, hVar, (i11 & 4) != 0 ? e.f22936a : coroutineContext, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? lu.a.f23848a : aVar);
    }

    @Override // kotlin.e
    @NotNull
    public e<R> e(@NotNull CoroutineContext context, int capacity, @NotNull lu.a onBufferOverflow) {
        return new i(this.transform, this.flow, context, capacity, onBufferOverflow);
    }

    @Override // kotlin.g
    @Nullable
    public Object q(@NotNull mu.i<? super R> iVar, @NotNull b<? super Unit> bVar) {
        Object g10 = q0.g(new a(this, iVar, null), bVar);
        return g10 == c.e() ? g10 : Unit.f22894a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@NotNull n<? super mu.i<? super R>, ? super T, ? super b<? super Unit>, ? extends Object> nVar, @NotNull h<? extends T> hVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull lu.a aVar) {
        super(hVar, coroutineContext, i10, aVar);
        this.transform = nVar;
    }
}
