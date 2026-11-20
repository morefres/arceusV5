package db;

import java.util.List;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: c, reason: collision with root package name */
    public final transient i f14490c;

    public g(i iVar) {
        this.f14490c = iVar;
    }

    @Override // db.i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14490c.contains(obj);
    }

    @Override // db.i
    public final i e() {
        return this.f14490c;
    }

    @Override // db.i
    /* renamed from: f */
    public final i subList(int i10, int i11) {
        i iVar = this.f14490c;
        s.d(i10, i11, iVar.size());
        return iVar.subList(iVar.size() - i11, iVar.size() - i10).e();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i iVar = this.f14490c;
        s.b(i10, iVar.size(), "index");
        return iVar.get(p(i10));
    }

    @Override // db.i, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f14490c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return p(lastIndexOf);
        }
        return -1;
    }

    @Override // db.i, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f14490c.indexOf(obj);
        if (indexOf >= 0) {
            return p(indexOf);
        }
        return -1;
    }

    public final int p(int i10) {
        return (this.f14490c.size() - 1) - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14490c.size();
    }

    @Override // db.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
