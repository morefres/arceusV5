package qe;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class e0 extends c {

    /* renamed from: a, reason: collision with root package name */
    public final a f29655a;

    public static final class a {
        public static final a b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f29656c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f29657d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f29658a;

        public a(String str) {
            this.f29658a = str;
        }

        public String toString() {
            return this.f29658a;
        }
    }

    public e0(a aVar) {
        this.f29655a = aVar;
    }

    public static e0 b(a aVar) {
        return new e0(aVar);
    }

    @Override // pe.x
    public boolean a() {
        return this.f29655a != a.f29657d;
    }

    public a c() {
        return this.f29655a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && ((e0) obj).c() == c();
    }

    public int hashCode() {
        return Objects.hash(e0.class, this.f29655a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f29655a + ")";
    }
}
