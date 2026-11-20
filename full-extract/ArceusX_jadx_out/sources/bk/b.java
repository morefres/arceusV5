package bk;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public ck.a f4297a = new ck.a();
    public InterfaceC0086b b;

    public class a implements bk.a {
        public a() {
        }

        @Override // bk.a
        public void a(String str) {
            ml.a b = ml.a.b(str);
            dk.c.c().u(b);
            b.this.c(b);
        }
    }

    /* renamed from: bk.b$b, reason: collision with other inner class name */
    public interface InterfaceC0086b {
        void a(ml.a aVar);
    }

    public void b(InterfaceC0086b interfaceC0086b) {
        this.b = interfaceC0086b;
        this.f4297a.d(dk.c.c().j(), new a());
    }

    public final void c(ml.a aVar) {
        InterfaceC0086b interfaceC0086b = this.b;
        if (interfaceC0086b != null) {
            interfaceC0086b.a(aVar);
        }
    }
}
