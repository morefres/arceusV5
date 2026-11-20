package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmu/d;", "T", "Lmu/c;", "Lmu/h;", "flow", "<init>", "(Lmu/h;)V", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lmu/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<T> flow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f25042a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @ot.f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {278}, m = "emit")
        /* renamed from: mu.d$a$a, reason: collision with other inner class name */
        public static final class C0439a extends ot.d {

            /* renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f25043t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f25044u;

            /* renamed from: v, reason: collision with root package name */
            public int f25045v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0439a(a<? super T> aVar, mt.b<? super C0439a> bVar) {
                super(bVar);
                this.f25044u = aVar;
            }

            @Override // ot.a
            public final Object invokeSuspend(Object obj) {
                this.f25043t = obj;
                this.f25045v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return this.f25044u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super T> iVar) {
            this.f25042a = iVar;
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
                boolean r0 = r6 instanceof mu.d.a.C0439a
                if (r0 == 0) goto L13
                r0 = r6
                mu.d$a$a r0 = (mu.d.a.C0439a) r0
                int r1 = r0.f25045v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25045v = r1
                goto L18
            L13:
                mu.d$a$a r0 = new mu.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f25043t
                java.lang.Object r1 = nt.c.e()
                int r2 = r0.f25045v
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                gt.o.b(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                gt.o.b(r6)
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                ju.g2.g(r6)
                mu.i<T> r6 = r4.f25042a
                r0.f25045v = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.Unit r5 = kotlin.Unit.f22894a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.d.a.emit(java.lang.Object, mt.b):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull h<? extends T> hVar) {
        this.flow = hVar;
    }

    @Override // mu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull mt.b<? super Unit> bVar) {
        Object collect = this.flow.collect(new a(iVar), bVar);
        return collect == nt.c.e() ? collect : Unit.f22894a;
    }
}
