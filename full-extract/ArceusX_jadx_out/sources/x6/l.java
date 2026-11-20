package x6;

import ju.d2;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lx6/l;", "Lx6/q;", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/l;", "lifecycle", "Lju/d2;", "job", "<init>", "(Landroidx/lifecycle/l;Lju/d2;)V", "", "start", "()V", "c", "(Lmt/b;)Ljava/lang/Object;", "e", rl.d.f30696a, "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", ve.a.f33391e, "Landroidx/lifecycle/l;", j6.b.f21518e, "Lju/d2;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l implements q, android.view.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.l lifecycle;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d2 job;

    public l(@NotNull android.view.l lVar, @NotNull d2 d2Var) {
        this.lifecycle = lVar;
        this.job = d2Var;
    }

    @Override // x6.q
    @Nullable
    public Object c(@NotNull mt.b<? super Unit> bVar) {
        Object a10 = e7.s.a(this.lifecycle, bVar);
        return a10 == nt.c.e() ? a10 : Unit.f22894a;
    }

    public void d() {
        d2.a.a(this.job, null, 1, null);
    }

    @Override // x6.q
    public void e() {
        this.lifecycle.d(this);
    }

    @Override // android.view.f
    public void onDestroy(@NotNull android.view.s owner) {
        d();
    }

    @Override // x6.q
    public void start() {
        this.lifecycle.a(this);
    }
}
