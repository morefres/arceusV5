package iv;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import gt.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "Liv/d;", ve.a.f33391e, "(Liv/d;Lmt/b;)Ljava/lang/Object;", j6.b.f21518e, "", rl.d.f30696a, "Liv/x;", "c", "", "", "e", "(Ljava/lang/Throwable;Lmt/b;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iv.d<T> f21168a;

        public a(iv.d<T> dVar) {
            this.f21168a = dVar;
        }

        public final void a(Throwable th2) {
            this.f21168a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"iv/p$b", "Liv/f;", "Liv/d;", NotificationCompat.CATEGORY_CALL, "Liv/x;", Payload.RESPONSE, "", j6.b.f21518e, "(Liv/d;Liv/x;)V", "", zl.t.f38095d, ve.a.f33391e, "(Liv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements iv.f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ju.n<T> f21169a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ju.n<? super T> nVar) {
            this.f21169a = nVar;
        }

        @Override // iv.f
        public void a(iv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            ju.n<T> nVar = this.f21169a;
            n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(gt.o.a(t8)));
        }

        @Override // iv.f
        public void b(iv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.g()) {
                ju.n<T> nVar = this.f21169a;
                n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(gt.o.a(new m(response))));
                return;
            }
            T a10 = response.a();
            if (a10 != null) {
                this.f21169a.resumeWith(gt.n.b(a10));
                return;
            }
            Object tag = call.request().tag(o.class);
            Intrinsics.checkNotNull(tag);
            o oVar = (o) tag;
            gt.e eVar = new gt.e("Response from " + oVar.b().getName() + '.' + oVar.a().getName() + " was null but response body type was declared as non-null");
            ju.n<T> nVar2 = this.f21169a;
            n.Companion companion2 = gt.n.INSTANCE;
            nVar2.resumeWith(gt.n.b(gt.o.a(eVar)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iv.d<T> f21170a;

        public c(iv.d<T> dVar) {
            this.f21170a = dVar;
        }

        public final void a(Throwable th2) {
            this.f21170a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"iv/p$d", "Liv/f;", "Liv/d;", NotificationCompat.CATEGORY_CALL, "Liv/x;", Payload.RESPONSE, "", j6.b.f21518e, "(Liv/d;Liv/x;)V", "", zl.t.f38095d, ve.a.f33391e, "(Liv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements iv.f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ju.n<T> f21171a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ju.n<? super T> nVar) {
            this.f21171a = nVar;
        }

        @Override // iv.f
        public void a(iv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            ju.n<T> nVar = this.f21171a;
            n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(gt.o.a(t8)));
        }

        @Override // iv.f
        public void b(iv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.g()) {
                ju.n<T> nVar = this.f21171a;
                n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(response.a()));
            } else {
                ju.n<T> nVar2 = this.f21171a;
                n.Companion companion2 = gt.n.INSTANCE;
                nVar2.resumeWith(gt.n.b(gt.o.a(new m(response))));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iv.d<T> f21172a;

        public e(iv.d<T> dVar) {
            this.f21172a = dVar;
        }

        public final void a(Throwable th2) {
            this.f21172a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"iv/p$f", "Liv/f;", "Liv/d;", NotificationCompat.CATEGORY_CALL, "Liv/x;", Payload.RESPONSE, "", j6.b.f21518e, "(Liv/d;Liv/x;)V", "", zl.t.f38095d, ve.a.f33391e, "(Liv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements iv.f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ju.n<x<T>> f21173a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(ju.n<? super x<T>> nVar) {
            this.f21173a = nVar;
        }

        @Override // iv.f
        public void a(iv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            ju.n<x<T>> nVar = this.f21173a;
            n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(gt.o.a(t8)));
        }

        @Override // iv.f
        public void b(iv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f21173a.resumeWith(gt.n.b(response));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @ot.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    public static final class g extends ot.d {

        /* renamed from: t, reason: collision with root package name */
        public Object f21174t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f21175u;

        /* renamed from: v, reason: collision with root package name */
        public int f21176v;

        public g(mt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21175u = obj;
            this.f21176v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return p.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mt.b<?> f21177a;
        public final /* synthetic */ Throwable b;

        public h(mt.b<?> bVar, Throwable th2) {
            this.f21177a = bVar;
            this.b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mt.b c10 = nt.b.c(this.f21177a);
            n.Companion companion = gt.n.INSTANCE;
            c10.resumeWith(gt.n.b(gt.o.a(this.b)));
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull iv.d<T> dVar, @NotNull mt.b<? super T> bVar) {
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        pVar.k(new a(dVar));
        dVar.F(new b(pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10;
    }

    @Nullable
    public static final <T> Object b(@NotNull iv.d<T> dVar, @NotNull mt.b<? super T> bVar) {
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        pVar.k(new c(dVar));
        dVar.F(new d(pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10;
    }

    @Nullable
    public static final <T> Object c(@NotNull iv.d<T> dVar, @NotNull mt.b<? super x<T>> bVar) {
        ju.p pVar = new ju.p(nt.b.c(bVar), 1);
        pVar.F();
        pVar.k(new e(dVar));
        dVar.F(new f(pVar));
        Object z10 = pVar.z();
        if (z10 == nt.c.e()) {
            ot.h.c(bVar);
        }
        return z10;
    }

    @Nullable
    public static final Object d(@NotNull iv.d<Unit> dVar, @NotNull mt.b<? super Unit> bVar) {
        Intrinsics.d(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(@org.jetbrains.annotations.NotNull java.lang.Throwable r4, @org.jetbrains.annotations.NotNull mt.b<?> r5) {
        /*
            boolean r0 = r5 instanceof iv.p.g
            if (r0 == 0) goto L13
            r0 = r5
            iv.p$g r0 = (iv.p.g) r0
            int r1 = r0.f21176v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21176v = r1
            goto L18
        L13:
            iv.p$g r0 = new iv.p$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f21175u
            java.lang.Object r1 = nt.c.e()
            int r2 = r0.f21176v
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f21174t
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            gt.o.b(r5)
            goto L5c
        L35:
            gt.o.b(r5)
            r0.f21174t = r4
            r0.f21176v = r3
            ju.l0 r5 = ju.g1.a()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            iv.p$h r3 = new iv.p$h
            r3.<init>(r0, r4)
            r5.y(r2, r3)
            java.lang.Object r4 = nt.c.e()
            java.lang.Object r5 = nt.c.e()
            if (r4 != r5) goto L59
            ot.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            gt.d r4 = new gt.d
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: iv.p.e(java.lang.Throwable, mt.b):java.lang.Object");
    }
}
