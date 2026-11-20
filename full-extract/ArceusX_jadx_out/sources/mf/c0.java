package mf;

/* loaded from: classes2.dex */
public class c0<T> implements yf.b<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final yf.a<Object> f24425c = new yf.a() { // from class: mf.a0
        @Override // yf.a
        public final void a(yf.b bVar) {
            c0.b(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final yf.b<Object> f24426d = new yf.b() { // from class: mf.b0
        @Override // yf.b
        public final Object get() {
            return c0.a();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public yf.a<T> f24427a;
    public volatile yf.b<T> b;

    public c0(yf.a<T> aVar, yf.b<T> bVar) {
        this.f24427a = aVar;
        this.b = bVar;
    }

    public static /* synthetic */ Object a() {
        return null;
    }

    public static /* synthetic */ void b(yf.b bVar) {
    }

    public static <T> c0<T> c() {
        return new c0<>(f24425c, f24426d);
    }

    public void d(yf.b<T> bVar) {
        yf.a<T> aVar;
        if (this.b != f24426d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f24427a;
            this.f24427a = null;
            this.b = bVar;
        }
        aVar.a(bVar);
    }

    @Override // yf.b
    public T get() {
        return this.b.get();
    }
}
