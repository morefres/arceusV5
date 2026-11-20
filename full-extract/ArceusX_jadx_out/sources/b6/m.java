package b6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import d6.n;
import f6.j0;
import gt.o;
import java.util.List;
import ju.d2;
import ju.l0;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.w;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016*$\b\u0002\u0010\u001b\"\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00182\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¨\u0006\u001c"}, d2 = {"Lb6/l;", "Lf6/j0;", "spec", "Lju/l0;", "dispatcher", "Lb6/i;", "listener", "Lju/d2;", "e", "(Lb6/l;Lf6/j0;Lju/l0;Lb6/i;)Lju/d2;", "Ld6/n;", "trackers", "", "Lc6/e;", rl.d.f30696a, "(Ld6/n;)Ljava/util/List;", "Landroid/content/Context;", "context", "Lb6/g;", ve.a.f33391e, "(Landroid/content/Context;)Lb6/g;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Lb6/b;", "", "OnConstraintState", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f3844a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    @ot.f(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {69}, m = "invokeSuspend")
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f3845t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l f3846u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ j0 f3847v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i f3848w;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: b6.m$a$a, reason: collision with other inner class name */
        public static final class C0076a<T> implements mu.i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f3849a;
            public final /* synthetic */ j0 b;

            public C0076a(i iVar, j0 j0Var) {
                this.f3849a = iVar;
                this.b = j0Var;
            }

            @Override // mu.i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, mt.b<? super Unit> bVar2) {
                this.f3849a.e(this.b, bVar);
                return Unit.f22894a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, j0 j0Var, i iVar, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f3846u = lVar;
            this.f3847v = j0Var;
            this.f3848w = iVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f3846u, this.f3847v, this.f3848w, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = nt.c.e();
            int i10 = this.f3845t;
            if (i10 == 0) {
                o.b(obj);
                mu.h<b> a10 = this.f3846u.a(this.f3847v);
                C0076a c0076a = new C0076a(this.f3848w, this.f3847v);
                this.f3845t = 1;
                if (a10.collect(c0076a, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    static {
        String i10 = w.i("WorkConstraintsTracker");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(...)");
        f3844a = i10;
    }

    @NotNull
    public static final g a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new g((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final List<c6.e> d(n nVar) {
        List<c6.e> p8 = p.p(new c6.c(nVar.a()), new c6.d(nVar.getBatteryNotLowTracker()), new c6.j(nVar.e()));
        if (Build.VERSION.SDK_INT >= 28) {
            p8.add(a(nVar.getContext()));
            return p8;
        }
        d6.h<NetworkState> d10 = nVar.d();
        Intrinsics.checkNotNull(d10);
        p8.addAll(p.n(new c6.f(d10), new c6.i(nVar.d()), new c6.h(nVar.d()), new c6.g(nVar.d())));
        return p8;
    }

    @NotNull
    public static final d2 e(@NotNull l lVar, @NotNull j0 spec, @NotNull l0 dispatcher, @NotNull i listener) {
        d2 d10;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(listener, "listener");
        d10 = ju.k.d(q0.a(dispatcher), null, null, new a(lVar, spec, listener, null), 3, null);
        return d10;
    }
}
