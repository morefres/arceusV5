package dt;

/* loaded from: classes3.dex */
public final class c<T> implements i<T>, at.a<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15392c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile i<T> f15393a;
    public volatile Object b = f15392c;

    public c(i<T> iVar) {
        this.f15393a = iVar;
    }

    public static <T> at.a<T> b(i<T> iVar) {
        return iVar instanceof at.a ? (at.a) iVar : new c((i) h.b(iVar));
    }

    public static <T> i<T> c(i<T> iVar) {
        h.b(iVar);
        return iVar instanceof c ? iVar : new c(iVar);
    }

    private static Object d(Object obj, Object obj2) {
        if (obj == f15392c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public final synchronized Object a() {
        Object obj;
        obj = this.b;
        if (obj == f15392c) {
            obj = this.f15393a.get();
            this.b = d(this.b, obj);
            this.f15393a = null;
        }
        return obj;
    }

    @Override // ft.a
    public T get() {
        T t8 = (T) this.b;
        return t8 == f15392c ? (T) a() : t8;
    }
}
