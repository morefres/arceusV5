package nb;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l8 f26721a;
    public final /* synthetic */ w b;

    public v(w wVar, l8 l8Var) {
        this.f26721a = l8Var;
        Objects.requireNonNull(wVar);
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l8 l8Var = this.f26721a;
        l8Var.c();
        if (f.a()) {
            l8Var.b().t(this);
            return;
        }
        w wVar = this.b;
        boolean c10 = wVar.c();
        wVar.e(0L);
        if (c10) {
            wVar.a();
        }
    }
}
