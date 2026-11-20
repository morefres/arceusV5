package c8;

import c8.f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Iterable<b8.i> f4781a;
    public final byte[] b;

    public static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        public Iterable<b8.i> f4782a;
        public byte[] b;

        @Override // c8.f.a
        public f a() {
            String str = "";
            if (this.f4782a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f4782a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c8.f.a
        public f.a b(Iterable<b8.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f4782a = iterable;
            return this;
        }

        @Override // c8.f.a
        public f.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // c8.f
    public Iterable<b8.i> b() {
        return this.f4781a;
    }

    @Override // c8.f
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f4781a.equals(fVar.b())) {
                if (Arrays.equals(this.b, fVar instanceof a ? ((a) fVar).b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4781a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f4781a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    public a(Iterable<b8.i> iterable, byte[] bArr) {
        this.f4781a = iterable;
        this.b = bArr;
    }
}
