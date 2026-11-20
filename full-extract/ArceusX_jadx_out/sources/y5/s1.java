package y5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"T", "Lne/x;", "Landroidx/work/c;", "worker", rl.d.f30696a, "(Lne/x;Landroidx/work/c;Lmt/b;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "e", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "f", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", ve.a.f33391e, "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f36479a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f36480a;
        public final /* synthetic */ ne.x<T> b;

        public a(androidx.work.c cVar, ne.x<T> xVar) {
            this.f36480a = cVar;
            this.b = xVar;
        }

        public final void a(Throwable th2) {
            if (th2 instanceof h1) {
                this.f36480a.stop(((h1) th2).getReason());
            }
            this.b.cancel(false);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22894a;
        }
    }

    static {
        String i10 = x5.w.i("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(...)");
        f36479a = i10;
    }

    @Nullable
    public static final <T> Object d(@NotNull ne.x<T> xVar, @NotNull androidx.work.c cVar, @NotNull mt.b<? super T> bVar) {
        try {
            if (xVar.isDone()) {
                return e(xVar);
            }
            ju.p pVar = new ju.p(nt.b.c(bVar), 1);
            pVar.F();
            xVar.a(new c0(xVar, pVar), x5.h.f35278a);
            pVar.k(new a(cVar, xVar));
            Object z10 = pVar.z();
            if (z10 == nt.c.e()) {
                ot.h.c(bVar);
            }
            return z10;
        } catch (ExecutionException e10) {
            throw f(e10);
        }
    }

    public static final <V> V e(Future<V> future) {
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                v5 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v5;
    }

    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}
