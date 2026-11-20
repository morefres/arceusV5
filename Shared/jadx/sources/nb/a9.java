package nb;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a9 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa f26035a;

    public a9(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.f26035a = qaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f26035a.f26328a.b().t(runnable);
    }
}
