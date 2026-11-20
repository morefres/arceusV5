package bf;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class i extends a1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f4054a;

    public static final class a {
        public static final a b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f4055c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f4056d = new a("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final a f4057e = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f4058a;

        public a(String str) {
            this.f4058a = str;
        }

        public String toString() {
            return this.f4058a;
        }
    }

    public i(a aVar) {
        this.f4054a = aVar;
    }

    public static i b(a aVar) {
        return new i(aVar);
    }

    @Override // pe.x
    public boolean a() {
        return this.f4054a != a.f4057e;
    }

    public a c() {
        return this.f4054a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && ((i) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(i.class, this.f4054a);
    }

    public String toString() {
        return "Ed25519 Parameters (variant: " + this.f4054a + ")";
    }
}
