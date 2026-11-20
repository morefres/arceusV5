package we;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a0 {
    public static a0 b = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<i0> f34194a = new AtomicReference<>(i0.c().c());

    public static a0 c() {
        return b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) {
        return this.f34194a.get().e(cls);
    }

    public <KeyT extends pe.l, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.f34194a.get().f(keyt, cls);
    }

    public synchronized <KeyT extends pe.l, PrimitiveT> void d(h0<KeyT, PrimitiveT> h0Var) {
        this.f34194a.set(i0.d(this.f34194a.get()).d(h0Var).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(k0<InputPrimitiveT, WrapperPrimitiveT> k0Var) {
        this.f34194a.set(i0.d(this.f34194a.get()).e(k0Var).c());
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(j0<InputPrimitiveT> j0Var, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.f34194a.get().g(j0Var, cls);
    }
}
