package x0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class u<T> implements x2.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public x2.a<T> f34984a;

    public void a(x2.a<T> aVar) {
        this.f34984a = aVar;
    }

    @Override // x2.a
    public void accept(T t8) {
        Intrinsics.d(this.f34984a, "Listener is not set.");
        this.f34984a.accept(t8);
    }
}
