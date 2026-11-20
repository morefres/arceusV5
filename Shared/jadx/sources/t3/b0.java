package t3;

import androidx.core.app.NotificationCompat;
import ju.d2;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lu.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lt3/b0;", "T", "", "Lju/p0;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lmt/b;", "consumeMessage", "<init>", "(Lju/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", NotificationCompat.CATEGORY_MESSAGE, "e", "(Ljava/lang/Object;)V", ve.a.f33391e, "Lju/p0;", j6.b.f21518e, "Lkotlin/jvm/functions/Function2;", "Llu/g;", "c", "Llu/g;", "messageQueue", "Lt3/b;", rl.d.f30696a, "Lt3/b;", "remainingMessages", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function2<T, mt.b<? super Unit>, Object> consumeMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.g<T> messageQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final t3.b remainingMessages;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "", ve.a.f33391e, "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function1<Throwable, Unit> f31731i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b0<T> f31732j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function2<T, Throwable, Unit> f31733k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1, b0<T> b0Var, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f31731i = function1;
            this.f31732j = b0Var;
            this.f31733k = function2;
        }

        public final void a(@Nullable Throwable th2) {
            Unit unit;
            this.f31731i.invoke(th2);
            this.f31732j.messageQueue.D(th2);
            do {
                Object f10 = lu.k.f(this.f31732j.messageQueue.A());
                if (f10 != null) {
                    this.f31733k.invoke(f10, th2);
                    unit = Unit.f22894a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {1, 8, 0})
    @ot.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    public static final class b extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public Object f31734t;

        /* renamed from: u, reason: collision with root package name */
        public int f31735u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ b0<T> f31736v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0<T> b0Var, mt.b<? super b> bVar) {
            super(2, bVar);
            this.f31736v = b0Var;
        }

        @Override // ot.a
        @NotNull
        public final mt.b<Unit> create(@Nullable Object obj, @NotNull mt.b<?> bVar) {
            return new b(this.f31736v, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
        
            if (r6 != r0) goto L15;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
        @Override // ot.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = nt.c.e()
                int r1 = r5.f31735u
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                gt.o.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f31734t
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                gt.o.b(r6)
                goto L51
            L22:
                gt.o.b(r6)
                t3.b0<T> r6 = r5.f31736v
                t3.b r6 = t3.b0.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                t3.b0<T> r6 = r5.f31736v
                ju.p0 r6 = t3.b0.d(r6)
                ju.q0.h(r6)
                t3.b0<T> r6 = r5.f31736v
                kotlin.jvm.functions.Function2 r1 = t3.b0.a(r6)
                t3.b0<T> r6 = r5.f31736v
                lu.g r6 = t3.b0.b(r6)
                r5.f31734t = r1
                r5.f31735u = r3
                java.lang.Object r6 = r6.C(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f31734t = r4
                r5.f31735u = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                t3.b0<T> r6 = r5.f31736v
                t3.b r6 = t3.b0.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                kotlin.Unit r6 = kotlin.Unit.f22894a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull p0 p0Var, @Nullable mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@NotNull p0 scope, @NotNull Function1<? super Throwable, Unit> onComplete, @NotNull Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, @NotNull Function2<? super T, ? super mt.b<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = lu.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new t3.b(0);
        d2 d2Var = (d2) scope.getCoroutineContext().get(d2.INSTANCE);
        if (d2Var != null) {
            d2Var.o(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(T msg) {
        Object v5 = this.messageQueue.v(msg);
        if (v5 instanceof k.Closed) {
            Throwable e10 = lu.k.e(v5);
            if (e10 != null) {
                throw e10;
            }
            throw new lu.r("Channel was closed normally");
        }
        if (!lu.k.i(v5)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.c() == 0) {
            ju.k.d(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}
