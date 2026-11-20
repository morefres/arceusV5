package he;

/* loaded from: classes2.dex */
public final class o<T> extends k<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f19360a;

    public o(T t8) {
        this.f19360a = t8;
    }

    @Override // he.k
    public T b() {
        return this.f19360a;
    }

    @Override // he.k
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f19360a.equals(((o) obj).f19360a);
        }
        return false;
    }

    public int hashCode() {
        return this.f19360a.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f19360a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
        sb2.append("Optional.of(");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }
}
