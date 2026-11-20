package yj;

import android.content.Context;
import android.os.SystemClock;
import com.roblox.universalapp.logging.LoggingProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Lyj/r0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", ve.a.f33391e, "(Landroid/content/Context;)V", j6.b.f21518e, "c", rl.d.f30696a, "Lju/p0;", "Lju/p0;", "workScope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r0 f36686a = new r0();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ju.p0 workScope = ju.q0.a(ju.g1.b());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.startup.LibLoadParallelWorkManager$warmSharedPreferences$1", f = "LibLoadParallelWorkManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends ot.m implements Function2<ju.p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f36687t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f36688u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, mt.b<? super a> bVar) {
            super(2, bVar);
            this.f36688u = context;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return new a(this.f36688u, bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f36687t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
            ek.z e10 = ek.z.e(this.f36688u);
            e10.c("DeviceInstallPreferences");
            e10.c("prefs");
            LoggingProtocol.m("early_shared_prefs_end", null, 2, null);
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r0 r0Var = f36686a;
        r0Var.b();
        r0Var.c(context);
        r0Var.d(context);
    }

    public final void b() {
        if (rh.h.a().y2()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            kk.c.INSTANCE.c().q();
            LoggingProtocol.l("early_asset_dir_setup_begin", Long.valueOf(elapsedRealtime));
        }
    }

    public final void c(Context context) {
        if (rh.h.a().c1()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            pl.j.j().i(context);
            LoggingProtocol.l("early_play_integrity_begin", Long.valueOf(elapsedRealtime));
        }
    }

    public final void d(Context context) {
        if (rh.h.a().U4()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ju.k.d(workScope, null, null, new a(context, null), 3, null);
            LoggingProtocol.l("early_shared_prefs_begin", Long.valueOf(elapsedRealtime));
        }
    }
}
