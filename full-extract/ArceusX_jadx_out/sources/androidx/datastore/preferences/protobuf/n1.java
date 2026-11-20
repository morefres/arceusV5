package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class n1<T, B> {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f2058a = 100;

    public abstract void a(B b, int i10, int i11);

    public abstract void b(B b, int i10, long j10);

    public abstract void c(B b, int i10, T t8);

    public abstract void d(B b, int i10, g gVar);

    public abstract void e(B b, int i10, long j10);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t8);

    public abstract int i(T t8);

    public abstract void j(Object obj);

    public abstract T k(T t8, T t10);

    public final void l(B b, f1 f1Var, int i10) {
        while (f1Var.A() != Integer.MAX_VALUE && m(b, f1Var, i10)) {
        }
    }

    public final boolean m(B b, f1 f1Var, int i10) {
        int a10 = f1Var.a();
        int a11 = s1.a(a10);
        int b10 = s1.b(a10);
        if (b10 == 0) {
            e(b, a11, f1Var.H());
            return true;
        }
        if (b10 == 1) {
            b(b, a11, f1Var.b());
            return true;
        }
        if (b10 == 2) {
            d(b, a11, f1Var.o());
            return true;
        }
        if (b10 != 3) {
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw a0.e();
            }
            a(b, a11, f1Var.u());
            return true;
        }
        B n10 = n();
        int c10 = s1.c(a11, 4);
        int i11 = i10 + 1;
        if (i11 >= f2058a) {
            throw a0.i();
        }
        l(n10, f1Var, i11);
        if (c10 != f1Var.a()) {
            throw a0.b();
        }
        c(b, a11, r(n10));
        return true;
    }

    public abstract B n();

    public abstract void o(Object obj, B b);

    public abstract void p(Object obj, T t8);

    public abstract boolean q(f1 f1Var);

    public abstract T r(B b);

    public abstract void s(T t8, t1 t1Var);

    public abstract void t(T t8, t1 t1Var);
}
