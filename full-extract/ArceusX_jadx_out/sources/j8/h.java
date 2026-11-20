package j8;

import android.content.Context;

/* loaded from: classes.dex */
public final class h implements d8.b<String> {

    /* renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f21542a;

    public h(ft.a<Context> aVar) {
        this.f21542a = aVar;
    }

    public static h a(ft.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) d8.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f21542a.get());
    }
}
