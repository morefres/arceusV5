package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmu/o0;", "Lmu/m0;", "<init>", "()V", "Lmu/p0;", "", "subscriptionCount", "Lmu/h;", "Lmu/k0;", ve.a.f33391e, "(Lmu/p0;)Lmu/h;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class o0 implements m0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmu/i;", "Lmu/k0;", "", "<anonymous>", "(Lmu/i;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<i<? super k0>, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f25104t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f25105u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p0<Integer> f25106v;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mu.o0$a$a, reason: collision with other inner class name */
        public static final class C0441a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.y f25107a;
            public final /* synthetic */ i<k0> b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @ot.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            /* renamed from: mu.o0$a$a$a, reason: collision with other inner class name */
            public static final class C0442a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f25108t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C0441a<T> f25109u;

                /* renamed from: v, reason: collision with root package name */
                public int f25110v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0442a(C0441a<? super T> c0441a, mt.b<? super C0442a> bVar) {
                    super(bVar);
                    this.f25109u = c0441a;
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f25108t = obj;
                    this.f25110v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return this.f25109u.b(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0441a(kotlin.jvm.internal.y yVar, i<? super k0> iVar) {
                this.f25107a = yVar;
                this.b = iVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(int r5, mt.b<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof mu.o0.a.C0441a.C0442a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mu.o0$a$a$a r0 = (mu.o0.a.C0441a.C0442a) r0
                    int r1 = r0.f25110v
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f25110v = r1
                    goto L18
                L13:
                    mu.o0$a$a$a r0 = new mu.o0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f25108t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f25110v
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    gt.o.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    gt.o.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.y r5 = r4.f25107a
                    boolean r6 = r5.f22979a
                    if (r6 != 0) goto L4e
                    r5.f22979a = r3
                    mu.i<mu.k0> r5 = r4.b
                    mu.k0 r6 = mu.k0.f25082a
                    r0.f25110v = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r5 = kotlin.Unit.f22894a
                    return r5
                L4e:
                    kotlin.Unit r5 = kotlin.Unit.f22894a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.o0.a.C0441a.b(int, mt.b):java.lang.Object");
            }

            @Override // mu.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, mt.b bVar) {
                return b(((Number) obj).intValue(), bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0<Integer> p0Var, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f25106v = p0Var;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            a aVar = new a(this.f25106v, bVar);
            aVar.f25105u = obj;
            return aVar;
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f25104t;
            if (i10 == 0) {
                gt.o.b(obj);
                i iVar = (i) this.f25105u;
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                p0<Integer> p0Var = this.f25106v;
                C0441a c0441a = new C0441a(yVar, iVar);
                this.f25104t = 1;
                if (p0Var.collect(c0441a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super k0> iVar, mt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Override // mu.m0
    @NotNull
    public h<k0> a(@NotNull p0<Integer> subscriptionCount) {
        return j.w(new a(subscriptionCount, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
