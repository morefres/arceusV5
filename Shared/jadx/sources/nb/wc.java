package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class wc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me f26779a;
    public final /* synthetic */ Runnable b;

    public wc(bd bdVar, me meVar, Runnable runnable) {
        this.f26779a = meVar;
        this.b = runnable;
        Objects.requireNonNull(bdVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        me meVar = this.f26779a;
        meVar.E();
        meVar.D(this.b);
        meVar.r();
    }
}
