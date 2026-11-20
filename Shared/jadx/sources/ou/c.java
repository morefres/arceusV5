package ou;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import ju.d2;
import ju.r1;
import ju.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T", "Lju/w0;", "Ljava/util/concurrent/CompletableFuture;", "c", "(Lju/w0;)Ljava/util/concurrent/CompletableFuture;", "Lju/d2;", "future", "", "e", "(Lju/d2;Ljava/util/concurrent/CompletableFuture;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d2 f28156a;

        public a(d2 d2Var) {
            this.f28156a = d2Var;
        }

        public final void a(Object obj, Throwable th2) {
            d2 d2Var = this.f28156a;
            if (th2 != null) {
                r0 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
                if (r0 == null) {
                    r0 = r1.a("CompletableFuture was completed exceptionally", th2);
                }
            }
            d2Var.c(r0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(obj, (Throwable) obj2);
            return Unit.f22894a;
        }
    }

    @NotNull
    public static final <T> CompletableFuture<T> c(@NotNull final w0<? extends T> w0Var) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        e(w0Var, completableFuture);
        w0Var.o(new Function1() { // from class: ou.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit d10;
                d10 = c.d(completableFuture, w0Var, (Throwable) obj);
                return d10;
            }
        });
        return completableFuture;
    }

    public static final Unit d(CompletableFuture completableFuture, w0 w0Var, Throwable th2) {
        try {
            completableFuture.complete(w0Var.g());
        } catch (Throwable th3) {
            completableFuture.completeExceptionally(th3);
        }
        return Unit.f22894a;
    }

    public static final void e(d2 d2Var, CompletableFuture<?> completableFuture) {
        final a aVar = new a(d2Var);
        completableFuture.handle(new BiFunction() { // from class: ou.b
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Unit f10;
                f10 = c.f(Function2.this, obj, (Throwable) obj2);
                return f10;
            }
        });
    }

    public static final Unit f(Function2 function2, Object obj, Throwable th2) {
        return (Unit) function2.invoke(obj, th2);
    }
}
