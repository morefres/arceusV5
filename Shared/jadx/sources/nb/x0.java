package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26786a;
    public final /* synthetic */ y1 b;

    public x0(y1 y1Var, long j10) {
        this.f26786a = j10;
        Objects.requireNonNull(y1Var);
        this.b = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.n(this.f26786a);
    }
}
