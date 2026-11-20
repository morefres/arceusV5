package l9;

import k9.a;

/* loaded from: classes.dex */
public final class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f23322a;

    public h0(i0 i0Var) {
        this.f23322a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        j0 j0Var = this.f23322a.f23324a;
        fVar = j0Var.b;
        fVar2 = j0Var.b;
        fVar.disconnect(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
