package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BI\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lmu/g;", "T", "Lmu/h;", "upstream", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "<init>", "(Lmu/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lmu/h;", j6.b.f21518e, "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<T> upstream;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<T, Object> keySelector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function2<Object, Object, Boolean> areEquivalent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g<T> f25055a;
        public final /* synthetic */ kotlin.jvm.internal.c0<Object> b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T> f25056c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        /* renamed from: mu.g$a$a, reason: collision with other inner class name */
        public static final class C0440a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25057t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f25058u;

            /* renamed from: v, reason: collision with root package name */
            public int f25059v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0440a(a<? super T> aVar, mt.b<? super C0440a> bVar) {
                super(bVar);
                this.f25058u = aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25057t = obj;
                this.f25059v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f25058u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(g<T> gVar, kotlin.jvm.internal.c0<Object> c0Var, i<? super T> iVar) {
            this.f25055a = gVar;
            this.b = c0Var;
            this.f25056c = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // mu.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, mt.b<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof mu.g.a.C0440a
                if (r0 == 0) goto L13
                r0 = r7
                mu.g$a$a r0 = (mu.g.a.C0440a) r0
                int r1 = r0.f25059v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25059v = r1
                goto L18
            L13:
                mu.g$a$a r0 = new mu.g$a$a
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.f25057t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25059v
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                gt.o.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                gt.o.b(r7)
                mu.g<T> r7 = r5.f25055a
                kotlin.jvm.functions.Function1<T, java.lang.Object> r7 = r7.keySelector
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.c0<java.lang.Object> r2 = r5.b
                T r2 = r2.f22963a
                pu.e0 r4 = kotlin.t.f27442a
                if (r2 == r4) goto L58
                mu.g<T> r4 = r5.f25055a
                kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.areEquivalent
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            L58:
                kotlin.jvm.internal.c0<java.lang.Object> r2 = r5.b
                r2.f22963a = r7
                mu.i<T> r7 = r5.f25056c
                r0.f25059v = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.g.a.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull h<? extends T> hVar, @NotNull Function1<? super T, ? extends Object> function1, @NotNull Function2<Object, Object, Boolean> function2) {
        this.upstream = hVar;
        this.keySelector = function1;
        this.areEquivalent = function2;
    }

    @Override // mu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull mt.b<? super Unit> bVar) {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f22963a = (T) kotlin.t.f27442a;
        Object collect = this.upstream.collect(new a(this, c0Var, iVar), bVar);
        return collect == nt.c.e() ? collect : Unit.f22894a;
    }
}
