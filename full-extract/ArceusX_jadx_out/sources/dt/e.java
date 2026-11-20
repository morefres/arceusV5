package dt;

/* loaded from: classes3.dex */
public final class e<T> implements d<T>, at.a<T> {
    public static final e<Object> b = new e<>(null);

    /* renamed from: a, reason: collision with root package name */
    public final T f15394a;

    public e(T t8) {
        this.f15394a = t8;
    }

    public static <T> d<T> a(T t8) {
        return new e(h.c(t8, "instance cannot be null"));
    }

    @Override // ft.a
    public T get() {
        return this.f15394a;
    }
}
