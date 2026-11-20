package mu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.share.attribution.RequestError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "T", "Lmu/h;", ve.a.f33391e, "(Lmu/h;)Lmu/h;", "Lkotlin/Function2;", "Lmt/b;", "", "action", j6.b.f21518e, "(Lmu/h;Lkotlin/jvm/functions/Function2;)Lmu/h;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f25024a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: mu.a0$a$a, reason: collision with other inner class name */
        public static final class C0436a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f25025a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @ot.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
            /* renamed from: mu.a0$a$a$a, reason: collision with other inner class name */
            public static final class C0437a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f25026t;

                /* renamed from: u, reason: collision with root package name */
                public int f25027u;

                public C0437a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f25026t = obj;
                    this.f25027u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C0436a.this.emit(null, this);
                }
            }

            public C0436a(i iVar) {
                this.f25025a = iVar;
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
                    boolean r0 = r6 instanceof mu.a0.a.C0436a.C0437a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mu.a0$a$a$a r0 = (mu.a0.a.C0436a.C0437a) r0
                    int r1 = r0.f25027u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f25027u = r1
                    goto L18
                L13:
                    mu.a0$a$a$a r0 = new mu.a0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f25026t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f25027u
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    gt.o.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    gt.o.b(r6)
                    mu.i r6 = r4.f25025a
                    if (r5 == 0) goto L41
                    r0.f25027u = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.Unit r5 = kotlin.Unit.f22894a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.a0.a.C0436a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public a(h hVar) {
            this.f25024a = hVar;
        }

        @Override // mu.h
        public Object collect(i iVar, mt.b bVar) {
            Object collect = this.f25024a.collect(new C0436a(iVar), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/h;", "Lmu/i;", "collector", "", "collect", "(Lmu/i;Lmt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f25029a;
        public final /* synthetic */ Function2 b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f25030a;
            public final /* synthetic */ Function2 b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @ot.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {RequestError.RESPONSE_CODE_FAILURE, 51}, m = "emit")
            /* renamed from: mu.a0$b$a$a, reason: collision with other inner class name */
            public static final class C0438a extends ot.d {

                /* renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f25031t;

                /* renamed from: u, reason: collision with root package name */
                public int f25032u;

                /* renamed from: w, reason: collision with root package name */
                public Object f25034w;

                /* renamed from: x, reason: collision with root package name */
                public Object f25035x;

                public C0438a(mt.b bVar) {
                    super(bVar);
                }

                @Override // ot.a
                public final Object invokeSuspend(Object obj) {
                    this.f25031t = obj;
                    this.f25032u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(i iVar, Function2 function2) {
                this.f25030a = iVar;
                this.b = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
            
                if (r6.emit(r2, r0) != r1) goto L23;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            @Override // mu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, mt.b<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof mu.a0.b.a.C0438a
                    if (r0 == 0) goto L13
                    r0 = r7
                    mu.a0$b$a$a r0 = (mu.a0.b.a.C0438a) r0
                    int r1 = r0.f25032u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f25032u = r1
                    goto L18
                L13:
                    mu.a0$b$a$a r0 = new mu.a0$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f25031t
                    java.lang.Object r1 = nt.c.e()
                    int r2 = r0.f25032u
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    gt.o.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f25035x
                    mu.i r6 = (mu.i) r6
                    java.lang.Object r2 = r0.f25034w
                    gt.o.b(r7)
                    goto L5c
                L3e:
                    gt.o.b(r7)
                    mu.i r7 = r5.f25030a
                    kotlin.jvm.functions.Function2 r2 = r5.b
                    r0.f25034w = r6
                    r0.f25035x = r7
                    r0.f25032u = r4
                    r4 = 6
                    kotlin.jvm.internal.l.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.l.c(r4)
                    if (r2 != r1) goto L5a
                    goto L69
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f25034w = r7
                    r0.f25035x = r7
                    r0.f25032u = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.f22894a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.a0.b.a.emit(java.lang.Object, mt.b):java.lang.Object");
            }
        }

        public b(h hVar, Function2 function2) {
            this.f25029a = hVar;
            this.b = function2;
        }

        @Override // mu.h
        public Object collect(i iVar, mt.b bVar) {
            Object collect = this.f25029a.collect(new a(iVar, this.b), bVar);
            return collect == nt.c.e() ? collect : Unit.f22894a;
        }
    }

    @NotNull
    public static final <T> h<T> a(@NotNull h<? extends T> hVar) {
        return new a(hVar);
    }

    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super mt.b<? super Unit>, ? extends Object> function2) {
        return new b(hVar, function2);
    }
}
