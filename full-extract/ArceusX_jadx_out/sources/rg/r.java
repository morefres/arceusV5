package rg;

import androidx.profileinstaller.d;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lrg/r;", "", "<init>", "()V", "", "c", j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f30522a = new r();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.BaselineProfileVerifier$logCompilationStatus$1", f = "BaselineProfileVerifier.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f30523t;

        public a(mt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f30523t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            try {
                d.c cVar = androidx.profileinstaller.d.a().get();
                ek.q.h("rbx.baselineprofile", "Baseline profile status: resultCode=" + cVar.a() + ", compiledWithProfile=" + cVar.c() + ", enqueuedForCompilation=" + cVar.b());
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                ek.q.k("rbx.baselineprofile", "Interrupted reading baseline profile compilation status: " + e10);
            } catch (ExecutionException e11) {
                ek.q.k("rbx.baselineprofile", "Failed to read baseline profile compilation status: " + e11);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"rg/r$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements android.view.f {
        @Override // android.view.f
        public /* bridge */ void onCreate(android.view.s sVar) {
            super.onCreate(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onDestroy(android.view.s sVar) {
            super.onDestroy(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onPause(android.view.s sVar) {
            super.onPause(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onResume(android.view.s sVar) {
            super.onResume(sVar);
        }

        @Override // android.view.f
        public void onStart(android.view.s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            android.view.h0.INSTANCE.a().a().d(this);
            r.f30522a.b();
        }

        @Override // android.view.f
        public /* bridge */ void onStop(android.view.s sVar) {
            super.onStop(sVar);
        }
    }

    public static final void c() {
        if (rh.h.a().v4()) {
            android.view.h0.INSTANCE.a().a().a(new b());
        }
    }

    public final void b() {
        ju.k.d(ju.q0.a(ju.g1.b()), null, null, new a(null), 3, null);
    }
}
