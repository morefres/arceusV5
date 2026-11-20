package ga;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    public static final q f18426d = new q(new p(null));

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18427a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18428c;

    public q(p pVar) {
        this.f18427a = pVar.e();
        this.b = pVar.f();
        this.f18428c = pVar.g();
    }

    public static p d() {
        return new p(null);
    }

    public final boolean a() {
        return this.f18427a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.f18428c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            if (this.f18427a == qVar.f18427a && this.b == qVar.b && this.f18428c == qVar.f18428c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18427a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.f18428c ? 1 : 0);
    }

    public /* synthetic */ q(p pVar, byte[] bArr) {
        this(pVar);
    }
}
