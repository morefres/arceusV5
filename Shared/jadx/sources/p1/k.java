package p1;

/* loaded from: classes.dex */
public final class k<T> extends android.view.b0<T> {

    /* renamed from: m, reason: collision with root package name */
    public android.view.a0<T> f28312m;

    @Override // android.view.a0
    public T f() {
        android.view.a0<T> a0Var = this.f28312m;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(android.view.a0<T> a0Var) {
        android.view.a0<T> a0Var2 = this.f28312m;
        if (a0Var2 != null) {
            super.q(a0Var2);
        }
        this.f28312m = a0Var;
        super.p(a0Var, new android.view.e0() { // from class: p1.j
            @Override // android.view.e0
            public final void a(Object obj) {
                k.this.o(obj);
            }
        });
    }
}
