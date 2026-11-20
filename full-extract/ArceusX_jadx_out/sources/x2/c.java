package x2;

/* loaded from: classes.dex */
public class c<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f35015a;
    public final S b;

    public c(F f10, S s8) {
        this.f35015a = f10;
        this.b = s8;
    }

    public static <A, B> c<A, B> a(A a10, B b) {
        return new c<>(a10, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f35015a, this.f35015a) && b.a(cVar.b, this.b);
    }

    public int hashCode() {
        F f10 = this.f35015a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s8 = this.b;
        return hashCode ^ (s8 != null ? s8.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f35015a + " " + this.b + "}";
    }
}
