package b1;

import b1.g;
import g0.w2;
import java.util.Collection;
import n0.a3;
import n0.l0;
import n0.o0;
import n0.p0;
import ne.x;
import p0.z;

/* loaded from: classes.dex */
public class j implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f3666a;
    public final p b;

    /* renamed from: c, reason: collision with root package name */
    public final q f3667c;

    /* renamed from: d, reason: collision with root package name */
    public final w2.c f3668d;

    public j(p0 p0Var, w2.c cVar, g.a aVar) {
        this.f3666a = p0Var;
        this.f3668d = cVar;
        this.b = new p(p0Var.e(), aVar);
        this.f3667c = new q(p0Var.k());
    }

    @Override // n0.p0
    public x<Void> a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // n0.p0
    public a3<p0.a> b() {
        return this.f3666a.b();
    }

    @Override // n0.p0
    public l0 e() {
        return this.b;
    }

    @Override // g0.w2.c
    public void f(w2 w2Var) {
        z.b();
        this.f3668d.f(w2Var);
    }

    @Override // n0.p0
    public void i(Collection<w2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // n0.p0
    public void j(Collection<w2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // n0.p0
    public o0 k() {
        return this.f3667c;
    }

    @Override // g0.w2.c
    public void m(w2 w2Var) {
        z.b();
        this.f3668d.m(w2Var);
    }

    @Override // g0.w2.c
    public void n(w2 w2Var) {
        z.b();
        this.f3668d.n(w2Var);
    }

    @Override // n0.p0
    public boolean q() {
        return false;
    }

    @Override // g0.w2.c
    public void s(w2 w2Var) {
        z.b();
        this.f3668d.s(w2Var);
    }

    public void t(int i10) {
        this.f3667c.B(i10);
    }
}
