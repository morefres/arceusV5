package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa f26190a;

    public e9(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.f26190a = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26190a.f26609r.a();
    }
}
