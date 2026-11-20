package ug;

import android.content.Context;
import ju.g1;
import ju.p0;
import ju.q0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yj.w0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lug/i;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", ve.a.f33391e, "(Landroid/content/Context;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f32751a = new i();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.analytics.BacktraceInitializer$initEarlyIfEnabled$1", f = "BacktraceInitializer.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends ot.m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f32752t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f32753u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ BacktraceInitValues f32754v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, BacktraceInitValues backtraceInitValues, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f32753u = context;
            this.f32754v = backtraceInitValues;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f32753u, this.f32754v, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f32752t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            try {
                e.h().k(this.f32753u, this.f32754v);
            } catch (Throwable th2) {
                ek.q.k("rbx.backtrace", "Early Backtrace init failed due to " + th2);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (w0.i(context)) {
            ju.k.d(q0.a(g1.a()), null, null, new a(context, g.c(context), null), 3, null);
        }
    }
}
