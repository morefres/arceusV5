package i8;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s implements d8.b<r> {

    /* renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f20296a;
    public final ft.a<c8.e> b;

    /* renamed from: c, reason: collision with root package name */
    public final ft.a<j8.d> f20297c;

    /* renamed from: d, reason: collision with root package name */
    public final ft.a<x> f20298d;

    /* renamed from: e, reason: collision with root package name */
    public final ft.a<Executor> f20299e;

    /* renamed from: f, reason: collision with root package name */
    public final ft.a<k8.b> f20300f;

    /* renamed from: g, reason: collision with root package name */
    public final ft.a<l8.a> f20301g;

    /* renamed from: h, reason: collision with root package name */
    public final ft.a<l8.a> f20302h;

    /* renamed from: i, reason: collision with root package name */
    public final ft.a<j8.c> f20303i;

    public s(ft.a<Context> aVar, ft.a<c8.e> aVar2, ft.a<j8.d> aVar3, ft.a<x> aVar4, ft.a<Executor> aVar5, ft.a<k8.b> aVar6, ft.a<l8.a> aVar7, ft.a<l8.a> aVar8, ft.a<j8.c> aVar9) {
        this.f20296a = aVar;
        this.b = aVar2;
        this.f20297c = aVar3;
        this.f20298d = aVar4;
        this.f20299e = aVar5;
        this.f20300f = aVar6;
        this.f20301g = aVar7;
        this.f20302h = aVar8;
        this.f20303i = aVar9;
    }

    public static s a(ft.a<Context> aVar, ft.a<c8.e> aVar2, ft.a<j8.d> aVar3, ft.a<x> aVar4, ft.a<Executor> aVar5, ft.a<k8.b> aVar6, ft.a<l8.a> aVar7, ft.a<l8.a> aVar8, ft.a<j8.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, c8.e eVar, j8.d dVar, x xVar, Executor executor, k8.b bVar, l8.a aVar, l8.a aVar2, j8.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f20296a.get(), this.b.get(), this.f20297c.get(), this.f20298d.get(), this.f20299e.get(), this.f20300f.get(), this.f20301g.get(), this.f20302h.get(), this.f20303i.get());
    }
}
