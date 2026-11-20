package qe;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class t1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final a f29757a;

    public static final class a {
        public static final a b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f29758c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f29759d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f29760a;

        public a(String str) {
            this.f29760a = str;
        }

        public String toString() {
            return this.f29760a;
        }
    }

    public t1(a aVar) {
        this.f29757a = aVar;
    }

    public static t1 b(a aVar) {
        return new t1(aVar);
    }

    @Override // pe.x
    public boolean a() {
        return this.f29757a != a.f29759d;
    }

    public a c() {
        return this.f29757a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t1) && ((t1) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(t1.class, this.f29757a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f29757a + ")";
    }
}
