package h8;

import i8.x;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements d8.b<c> {

    /* renamed from: a, reason: collision with root package name */
    public final ft.a<Executor> f19163a;
    public final ft.a<c8.e> b;

    /* renamed from: c, reason: collision with root package name */
    public final ft.a<x> f19164c;

    /* renamed from: d, reason: collision with root package name */
    public final ft.a<j8.d> f19165d;

    /* renamed from: e, reason: collision with root package name */
    public final ft.a<k8.b> f19166e;

    public d(ft.a<Executor> aVar, ft.a<c8.e> aVar2, ft.a<x> aVar3, ft.a<j8.d> aVar4, ft.a<k8.b> aVar5) {
        this.f19163a = aVar;
        this.b = aVar2;
        this.f19164c = aVar3;
        this.f19165d = aVar4;
        this.f19166e = aVar5;
    }

    public static d a(ft.a<Executor> aVar, ft.a<c8.e> aVar2, ft.a<x> aVar3, ft.a<j8.d> aVar4, ft.a<k8.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, c8.e eVar, x xVar, j8.d dVar, k8.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f19163a.get(), this.b.get(), this.f19164c.get(), this.f19165d.get(), this.f19166e.get());
    }
}
