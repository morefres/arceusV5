package h8;

/* loaded from: classes.dex */
public final class g implements d8.b<i8.f> {

    /* renamed from: a, reason: collision with root package name */
    public final ft.a<l8.a> f19167a;

    public g(ft.a<l8.a> aVar) {
        this.f19167a = aVar;
    }

    public static i8.f a(l8.a aVar) {
        return (i8.f) d8.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(ft.a<l8.a> aVar) {
        return new g(aVar);
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i8.f get() {
        return a(this.f19167a.get());
    }
}
