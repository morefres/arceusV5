package n0;

import n0.n1;

/* loaded from: classes.dex */
public final class j<T> extends n1.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f25405a;
    public final Class<T> b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25406c;

    public j(String str, Class<T> cls, Object obj) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f25405a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.f25406c = obj;
    }

    @Override // n0.n1.a
    public String c() {
        return this.f25405a;
    }

    @Override // n0.n1.a
    public Object d() {
        return this.f25406c;
    }

    @Override // n0.n1.a
    public Class<T> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1.a) {
            n1.a aVar = (n1.a) obj;
            if (this.f25405a.equals(aVar.c()) && this.b.equals(aVar.e()) && ((obj2 = this.f25406c) != null ? obj2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f25405a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.f25406c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f25405a + ", valueClass=" + this.b + ", token=" + this.f25406c + "}";
    }
}
