package pe;

import af.j0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f28586a;

    public b(InputStream inputStream) {
        this.f28586a = inputStream;
    }

    public static r b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // pe.r
    public af.a0 a() {
        try {
            return af.a0.g0(this.f28586a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f28586a.close();
        }
    }

    @Override // pe.r
    public j0 read() {
        try {
            return j0.j0(this.f28586a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f28586a.close();
        }
    }
}
