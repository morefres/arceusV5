package t7;

/* loaded from: classes3.dex */
public class c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final b<T> f32072a;
    public i7.a<?, ?> b;

    /* renamed from: c, reason: collision with root package name */
    public T f32073c;

    public c() {
        this.f32072a = new b<>();
        this.f32073c = null;
    }

    public T a(b<T> bVar) {
        return this.f32073c;
    }

    public final T b(float f10, float f11, T t8, T t10, float f12, float f13, float f14) {
        return a(this.f32072a.h(f10, f11, t8, t10, f12, f13, f14));
    }

    public final void c(i7.a<?, ?> aVar) {
        this.b = aVar;
    }

    public c(T t8) {
        this.f32072a = new b<>();
        this.f32073c = t8;
    }
}
