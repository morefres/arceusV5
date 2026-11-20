package db;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f14491c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f14492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f14493e;

    public h(i iVar, int i10, int i11) {
        Objects.requireNonNull(iVar);
        this.f14493e = iVar;
        this.f14491c = i10;
        this.f14492d = i11;
    }

    @Override // db.d
    public final Object[] a() {
        return this.f14493e.a();
    }

    @Override // db.d
    public final int b() {
        return this.f14493e.b() + this.f14491c;
    }

    @Override // db.d
    public final int c() {
        return this.f14493e.b() + this.f14491c + this.f14492d;
    }

    @Override // db.i
    /* renamed from: f */
    public final i subList(int i10, int i11) {
        s.d(i10, i11, this.f14492d);
        int i12 = this.f14491c;
        return this.f14493e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        s.b(i10, this.f14492d, "index");
        return this.f14493e.get(i10 + this.f14491c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14492d;
    }

    @Override // db.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
