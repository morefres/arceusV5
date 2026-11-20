package x5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.a0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx5/b0;", "Lx5/a0;", "Landroidx/lifecycle/a0;", "Lx5/a0$b;", "state", "Lne/x;", "Lx5/a0$b$c;", "future", "<init>", "(Landroidx/lifecycle/a0;Lne/x;)V", "c", "Landroidx/lifecycle/a0;", rl.d.f30696a, "Lne/x;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.view.a0<a0.b> state;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ne.x<a0.b.c> future;

    public b0(@NotNull android.view.a0<a0.b> state, @NotNull ne.x<a0.b.c> future) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(future, "future");
        this.state = state;
        this.future = future;
    }
}
