package nt;

import gt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.h;
import ot.j;
import zl.t;

@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aS\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aW\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lmt/b;", "", "receiver", "completion", rl.d.f30696a, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lmt/b;)Ljava/lang/Object;", "", ve.a.f33391e, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lmt/b;)Lmt/b;", "c", "(Lmt/b;)Lmt/b;", j6.b.f21518e, "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* loaded from: classes2.dex */
public class b {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"nt/b$a", "Lot/j;", "Lgt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", t.f38095d, "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends j {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        public int label;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2 f27367u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f27368v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mt.b bVar, Function2 function2, Object obj) {
            super(bVar);
            this.f27367u = function2;
            this.f27368v = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ot.a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                o.b(result);
                Intrinsics.d(this.f27367u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) h0.e(this.f27367u, 2)).invoke(this.f27368v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            o.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"nt/b$b", "Lot/d;", "Lgt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", t.f38095d, "I", "label", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: nt.b$b, reason: collision with other inner class name */
    public static final class C0472b extends ot.d {

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        public int label;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2 f27370u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Object f27371v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0472b(mt.b bVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(bVar, coroutineContext);
            this.f27370u = function2;
            this.f27371v = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ot.a
        public Object invokeSuspend(Object result) {
            int i10 = this.label;
            if (i10 == 0) {
                this.label = 1;
                o.b(result);
                Intrinsics.d(this.f27370u, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) h0.e(this.f27370u, 2)).invoke(this.f27371v, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.label = 2;
            o.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nt/b$c", "Lot/j;", "Lgt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mt.b<? super T> bVar) {
            super(bVar);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ot.a
        public Object invokeSuspend(Object result) {
            o.b(result);
            return result;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"nt/b$d", "Lot/d;", "Lgt/n;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends ot.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mt.b<? super T> bVar, CoroutineContext coroutineContext) {
            super(bVar, coroutineContext);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // ot.a
        public Object invokeSuspend(Object result) {
            o.b(result);
            return result;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <R, T> mt.b<Unit> a(@NotNull Function2<? super R, ? super mt.b<? super T>, ? extends Object> function2, R r8, @NotNull mt.b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        mt.b<?> a10 = h.a(completion);
        if (function2 instanceof ot.a) {
            return ((ot.a) function2).create(r8, a10);
        }
        CoroutineContext context = a10.getContext();
        return context == e.f22936a ? new a(a10, function2, r8) : new C0472b(a10, context, function2, r8);
    }

    public static final <T> mt.b<T> b(mt.b<? super T> bVar) {
        CoroutineContext context = bVar.getContext();
        return context == e.f22936a ? new c(bVar) : new d(bVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static <T> mt.b<T> c(@NotNull mt.b<? super T> bVar) {
        mt.b<T> bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        ot.d dVar = bVar instanceof ot.d ? (ot.d) bVar : null;
        return (dVar == null || (bVar2 = (mt.b<T>) dVar.intercepted()) == null) ? bVar : bVar2;
    }

    @Nullable
    public static <R, T> Object d(@NotNull Function2<? super R, ? super mt.b<? super T>, ? extends Object> function2, R r8, @NotNull mt.b<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) h0.e(function2, 2)).invoke(r8, b(h.a(completion)));
    }
}
