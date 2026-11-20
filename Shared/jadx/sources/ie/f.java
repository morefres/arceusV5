package ie;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f<F, T> extends m0<F> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final he.f<F, ? extends T> f20828a;
    public final m0<T> b;

    public f(he.f<F, ? extends T> fVar, m0<T> m0Var) {
        this.f20828a = (he.f) he.n.l(fVar);
        this.b = (m0) he.n.l(m0Var);
    }

    @Override // ie.m0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.b.compare(this.f20828a.apply(f10), this.f20828a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f20828a.equals(fVar.f20828a) && this.b.equals(fVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return he.j.b(this.f20828a, this.b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.f20828a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
