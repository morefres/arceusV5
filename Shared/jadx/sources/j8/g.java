package j8;

/* loaded from: classes.dex */
public final class g implements d8.b<String> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f21541a = new g();
    }

    public static g a() {
        return a.f21541a;
    }

    public static String b() {
        return (String) d8.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
