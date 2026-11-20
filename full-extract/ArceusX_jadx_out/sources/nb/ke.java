package nb;

/* loaded from: classes.dex */
public final class ke {

    /* renamed from: a, reason: collision with root package name */
    public final me f26408a;
    public int b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f26409c = d();

    public ke(me meVar) {
        this.f26408a = meVar;
    }

    public final void a() {
        this.b++;
        this.f26409c = d();
    }

    public final boolean b() {
        return this.f26408a.e().a() >= this.f26409c;
    }

    public final /* synthetic */ long c() {
        return this.f26409c;
    }

    public final long d() {
        me meVar = this.f26408a;
        n9.m.l(meVar);
        long longValue = ((Long) z4.f26905v.b(null)).longValue();
        long longValue2 = ((Long) z4.f26907w.b(null)).longValue();
        for (int i10 = 1; i10 < this.b; i10++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        return meVar.e().a() + Math.min(longValue, longValue2);
    }
}
