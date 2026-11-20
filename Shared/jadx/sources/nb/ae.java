package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ae implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ne f26045a;
    public final /* synthetic */ me b;

    public ae(me meVar, ne neVar) {
        this.f26045a = neVar;
        Objects.requireNonNull(meVar);
        this.b = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        me meVar = this.b;
        meVar.u0(this.f26045a);
        meVar.A0();
    }
}
