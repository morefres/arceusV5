package ev;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16342a;
    public final l b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f16343c = true;

    public n(Object obj, l lVar) {
        this.f16342a = obj;
        this.b = lVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f16342a == nVar.f16342a && this.b.equals(nVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f16342a.hashCode() + this.b.f16331f.hashCode();
    }
}
