package mu;

import ju.d2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"T", "Lmu/h;", "Lju/p0;", "scope", "Lmu/m0;", "started", "", "replay", "Lmu/g0;", rl.d.f30696a, "(Lmu/h;Lju/p0;Lmu/m0;I)Lmu/g0;", "Lmu/l0;", j6.b.f21518e, "(Lmu/h;I)Lmu/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "upstream", "Lmu/b0;", "shared", "initialValue", "Lju/d2;", "c", "(Lju/p0;Lkotlin/coroutines/CoroutineContext;Lmu/h;Lmu/b0;Lmu/m0;Ljava/lang/Object;)Lju/d2;", "Lmu/p0;", "f", "(Lmu/h;Lju/p0;Lmu/m0;Ljava/lang/Object;)Lmu/p0;", "Lmu/c0;", ve.a.f33391e, "(Lmu/c0;)Lmu/p0;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f25269t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ m0 f25270u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h<T> f25271v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b0<T> f25272w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ T f25273x;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: mu.z$a$a, reason: collision with other inner class name */
        public static final class C0449a extends ot.m implements Function2<Integer, mt.b<? super Boolean>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f25274t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ int f25275u;

            public C0449a(mt.b<? super C0449a> bVar) {
                super(2, bVar);
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                C0449a c0449a = new C0449a(bVar);
                c0449a.f25275u = ((Number) obj).intValue();
                return c0449a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, mt.b<? super Boolean> bVar) {
                return o(num.intValue(), bVar);
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                nt.c.e();
                if (this.f25274t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return ot.b.a(this.f25275u > 0);
            }

            public final Object o(int i10, mt.b<? super Boolean> bVar) {
                return ((C0449a) create(Integer.valueOf(i10), bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/k0;", "it", "", "<anonymous>", "(Lmu/k0;)V"}, k = 3, mv = {2, 1, 0})
        @ot.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
        public static final class b extends ot.m implements Function2<k0, mt.b<? super Unit>, Object> {

            /* renamed from: t, reason: collision with root package name */
            public int f25276t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f25277u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ h<T> f25278v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ b0<T> f25279w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ T f25280x;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: mu.z$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0450a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f25281a;

                static {
                    int[] iArr = new int[k0.values().length];
                    try {
                        iArr[k0.f25082a.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k0.b.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[k0.f25083c.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f25281a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(h<? extends T> hVar, b0<T> b0Var, T t8, mt.b<? super b> bVar) {
                super(2, bVar);
                this.f25278v = hVar;
                this.f25279w = b0Var;
                this.f25280x = t8;
            }

            @Override // ot.a
            public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
                b bVar2 = new b(this.f25278v, this.f25279w, this.f25280x, bVar);
                bVar2.f25277u = obj;
                return bVar2;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                Object e10 = nt.c.e();
                int i10 = this.f25276t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    int i11 = C0450a.f25281a[((k0) this.f25277u).ordinal()];
                    if (i11 == 1) {
                        h<T> hVar = this.f25278v;
                        i iVar = this.f25279w;
                        this.f25276t = 1;
                        if (hVar.collect(iVar, this) == e10) {
                            return e10;
                        }
                    } else if (i11 != 2) {
                        if (i11 != 3) {
                            throw new gt.l();
                        }
                        T t8 = this.f25280x;
                        if (t8 == i0.f25079a) {
                            this.f25279w.j();
                        } else {
                            ot.b.a(this.f25279w.a(t8));
                        }
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
            public final Object invoke(k0 k0Var, mt.b<? super Unit> bVar) {
                return ((b) create(k0Var, bVar)).invokeSuspend(Unit.f22894a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(m0 m0Var, h<? extends T> hVar, b0<T> b0Var, T t8, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f25270u = m0Var;
            this.f25271v = hVar;
            this.f25272w = b0Var;
            this.f25273x = t8;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f25270u, this.f25271v, this.f25272w, this.f25273x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (mu.j.t(r8, r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        
            if (mu.j.j(r8, r1, r7) == r0) goto L28;
         */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r7.f25269t
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                gt.o.b(r8)
                goto L5c
            L21:
                gt.o.b(r8)
                goto L8d
            L25:
                gt.o.b(r8)
                mu.m0 r8 = r7.f25270u
                mu.m0$a r1 = mu.m0.INSTANCE
                mu.m0 r6 = r1.a()
                if (r8 != r6) goto L3f
                mu.h<T> r8 = r7.f25271v
                mu.b0<T> r1 = r7.f25272w
                r7.f25269t = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                mu.m0 r8 = r7.f25270u
                mu.m0 r1 = r1.b()
                r5 = 0
                if (r8 != r1) goto L69
                mu.b0<T> r8 = r7.f25272w
                mu.p0 r8 = r8.g()
                mu.z$a$a r1 = new mu.z$a$a
                r1.<init>(r5)
                r7.f25269t = r4
                java.lang.Object r8 = mu.j.t(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                mu.h<T> r8 = r7.f25271v
                mu.b0<T> r1 = r7.f25272w
                r7.f25269t = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                mu.m0 r8 = r7.f25270u
                mu.b0<T> r1 = r7.f25272w
                mu.p0 r1 = r1.g()
                mu.h r8 = r8.a(r1)
                mu.h r8 = mu.j.m(r8)
                mu.z$a$b r1 = new mu.z$a$b
                mu.h<T> r3 = r7.f25271v
                mu.b0<T> r4 = r7.f25272w
                T r6 = r7.f25273x
                r1.<init>(r3, r4, r6, r5)
                r7.f25269t = r2
                java.lang.Object r8 = mu.j.j(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r8 = kotlin.Unit.f22894a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.z.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @NotNull
    public static final <T> p0<T> a(@NotNull c0<T> c0Var) {
        return new e0(c0Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r3 == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> mu.l0<T> b(mu.h<? extends T> r7, int r8) {
        /*
            lu.g$b r0 = lu.g.INSTANCE
            int r0 = r0.a()
            int r0 = kotlin.ranges.d.c(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlin.e
            if (r1 == 0) goto L3c
            r1 = r7
            nu.e r1 = (kotlin.e) r1
            mu.h r2 = r1.f()
            if (r2 == 0) goto L3c
            mu.l0 r7 = new mu.l0
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            lu.a r4 = r1.onBufferOverflow
            lu.a r5 = lu.a.f23848a
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = r6
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            lu.a r8 = r1.onBufferOverflow
            kotlin.coroutines.CoroutineContext r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            mu.l0 r8 = new mu.l0
            lu.a r1 = lu.a.f23848a
            kotlin.coroutines.e r2 = kotlin.coroutines.e.f22936a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mu.z.b(mu.h, int):mu.l0");
    }

    public static final <T> d2 c(ju.p0 p0Var, CoroutineContext coroutineContext, h<? extends T> hVar, b0<T> b0Var, m0 m0Var, T t8) {
        return ju.i.c(p0Var, coroutineContext, Intrinsics.c(m0Var, m0.INSTANCE.a()) ? ju.r0.f22143a : ju.r0.f22145d, new a(m0Var, hVar, b0Var, t8, null));
    }

    @NotNull
    public static final <T> g0<T> d(@NotNull h<? extends T> hVar, @NotNull ju.p0 p0Var, @NotNull m0 m0Var, int i10) {
        l0 b = b(hVar, i10);
        b0 a10 = i0.a(i10, b.extraBufferCapacity, b.onBufferOverflow);
        return new d0(a10, c(p0Var, b.context, b.upstream, a10, m0Var, i0.f25079a));
    }

    public static /* synthetic */ g0 e(h hVar, ju.p0 p0Var, m0 m0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return j.J(hVar, p0Var, m0Var, i10);
    }

    @NotNull
    public static final <T> p0<T> f(@NotNull h<? extends T> hVar, @NotNull ju.p0 p0Var, @NotNull m0 m0Var, T t8) {
        l0 b = b(hVar, 1);
        c0 a10 = r0.a(t8);
        return new e0(a10, c(p0Var, b.context, b.upstream, a10, m0Var, t8));
    }
}
