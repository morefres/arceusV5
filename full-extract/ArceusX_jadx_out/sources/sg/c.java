package sg;

import android.view.h0;
import android.view.l;
import android.view.s;
import ek.q;
import gt.o;
import ju.g1;
import ju.l0;
import ju.p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.m;

@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u000f\u0018\u0000 \u00072\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lsg/c;", "", "Lju/l0;", "mainDispatcher", "<init>", "(Lju/l0;)V", "", rl.d.f30696a, "(Lmt/b;)Ljava/lang/Object;", ve.a.f33391e, "Lju/l0;", "", j6.b.f21518e, "Z", "registered", "sg/c$c", "c", "Lsg/c$c;", "observer", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 mainDispatcher;

    /* renamed from: b, reason: from kotlin metadata */
    public volatile boolean registered;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final C0553c observer;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.ads.GmaSdkBackgroundInstallScheduler$ensureScheduledOnBackground$2", f = "GmaSdkBackgroundInstallScheduler.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, mt.b<? super Unit>, Object> {

        /* renamed from: t, reason: collision with root package name */
        public int f31064t;

        public b(mt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return c.this.new b(bVar);
        }

        @Override // ot.a
        public final Object invokeSuspend(Object obj) {
            nt.c.e();
            if (this.f31064t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            android.view.l a10 = h0.INSTANCE.a().a();
            if (!a10.getState().b(l.b.f2629d)) {
                q.h("gmaads", "The App is already in background, trigger the gmasdk install worker");
                d.b();
            }
            if (!c.this.registered) {
                c.this.registered = true;
                q.h("gmaads", "Register the App lifecycle observer");
                a10.a(c.this.observer);
            }
            return Unit.f22894a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, mt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"sg/c$c", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStop", "(Landroidx/lifecycle/s;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: sg.c$c, reason: collision with other inner class name */
    public static final class C0553c implements android.view.f {
        @Override // android.view.f
        public /* bridge */ void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onDestroy(s sVar) {
            super.onDestroy(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onPause(s sVar) {
            super.onPause(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onResume(s sVar) {
            super.onResume(sVar);
        }

        @Override // android.view.f
        public /* bridge */ void onStart(s sVar) {
            super.onStart(sVar);
        }

        @Override // android.view.f
        public void onStop(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (qh.h.k("gmasdk")) {
                q.h("gmaads", "gmasdk installed, remove the App lifecycle observer");
                h0.INSTANCE.a().a().d(this);
            } else {
                q.h("gmaads", "The App moved to background, trigger the gmasdk install worker");
                d.b();
            }
        }
    }

    public c(@NotNull l0 mainDispatcher) {
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        this.mainDispatcher = mainDispatcher;
        this.observer = new C0553c();
    }

    @Nullable
    public final Object d(@NotNull mt.b<? super Unit> bVar) {
        Object g10 = ju.i.g(this.mainDispatcher, new b(null), bVar);
        return g10 == nt.c.e() ? g10 : Unit.f22894a;
    }

    public /* synthetic */ c(l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g1.c().getImmediate() : l0Var);
    }
}
