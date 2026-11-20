package uf;

import java.lang.annotation.Annotation;
import uf.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f32674a;
    public d.a b = d.a.DEFAULT;

    /* renamed from: uf.a$a, reason: collision with other inner class name */
    public static final class C0594a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32675a;
        public final d.a b;

        public C0594a(int i10, d.a aVar) {
            this.f32675a = i10;
            this.b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f32675a == dVar.tag() && this.b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f32675a) + (this.b.hashCode() ^ 2041407134);
        }

        @Override // uf.d
        public d.a intEncoding() {
            return this.b;
        }

        @Override // uf.d
        public int tag() {
            return this.f32675a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f32675a + "intEncoding=" + this.b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0594a(this.f32674a, this.b);
    }

    public a c(int i10) {
        this.f32674a = i10;
        return this;
    }
}
