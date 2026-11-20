package db;

/* loaded from: classes.dex */
public final class f extends v {

    /* renamed from: c, reason: collision with root package name */
    public final i f14489c;

    public f(i iVar, int i10) {
        super(iVar.size(), i10);
        this.f14489c = iVar;
    }

    @Override // db.v
    public final Object a(int i10) {
        return this.f14489c.get(i10);
    }
}
