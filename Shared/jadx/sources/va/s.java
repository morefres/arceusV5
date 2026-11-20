package va;

/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public volatile r f33383a;

    public s(r rVar) {
        this.f33383a = rVar;
    }

    public final String toString() {
        Object obj = this.f33383a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + ((Object) null) + ">";
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
