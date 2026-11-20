package s0;

import android.graphics.Matrix;
import g0.i1;
import n0.e0;
import n0.z3;
import p0.i;

/* loaded from: classes.dex */
public final class c implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f30827a;

    public c(e0 e0Var) {
        this.f30827a = e0Var;
    }

    @Override // g0.i1
    public void a(i.b bVar) {
        this.f30827a.a(bVar);
    }

    @Override // g0.i1
    public int b() {
        return this.f30827a.b().b();
    }

    @Override // g0.i1
    public z3 c() {
        return this.f30827a.c();
    }

    @Override // g0.i1
    public int d() {
        return 0;
    }

    @Override // g0.i1
    public Matrix e() {
        return new Matrix();
    }

    public e0 f() {
        return this.f30827a;
    }

    @Override // g0.i1
    public long getTimestamp() {
        return this.f30827a.getTimestamp();
    }
}
