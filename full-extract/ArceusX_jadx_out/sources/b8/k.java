package b8;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements d8.b<Executor> {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k f3902a = new k();
    }

    public static k a() {
        return a.f3902a;
    }

    public static Executor b() {
        return (Executor) d8.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ft.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
