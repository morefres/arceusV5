package h8;

import android.content.Context;
import i8.x;

/* loaded from: classes.dex */
public final class i implements d8.b<x> {

    /* renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f19168a;
    public final ft.a<j8.d> b;

    /* renamed from: c, reason: collision with root package name */
    public final ft.a<i8.f> f19169c;

    /* renamed from: d, reason: collision with root package name */
    public final ft.a<l8.a> f19170d;

    public i(ft.a<Context> aVar, ft.a<j8.d> aVar2, ft.a<i8.f> aVar3, ft.a<l8.a> aVar4) {
        this.f19168a = aVar;
        this.b = aVar2;
        this.f19169c = aVar3;
        this.f19170d = aVar4;
    }

    public static i a(ft.a<Context> aVar, ft.a<j8.d> aVar2, ft.a<i8.f> aVar3, ft.a<l8.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, j8.d dVar, i8.f fVar, l8.a aVar) {
        return (x) d8.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ft.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f19168a.get(), this.b.get(), this.f19169c.get(), this.f19170d.get());
    }
}
