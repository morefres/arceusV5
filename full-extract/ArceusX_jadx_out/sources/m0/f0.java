package m0;

import g0.f1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public class f0 implements x0.a0<a, f1.i> {

    public static abstract class a {
        public static a c(x0.b0<byte[]> b0Var, f1.h hVar) {
            return new e(b0Var, hVar);
        }

        public abstract f1.h a();

        public abstract x0.b0<byte[]> b();
    }

    public static void b(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr, 0, new v0.c().b(bArr));
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            throw new g0.h1(1, "Failed to write to temp file", e10);
        }
    }

    @Override // x0.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1.i apply(a aVar) {
        x0.b0<byte[]> b = aVar.b();
        f1.h a10 = aVar.a();
        File e10 = z.e(a10);
        b(e10, b.c());
        p0.g d10 = b.d();
        Objects.requireNonNull(d10);
        z.l(e10, d10, a10, b.f());
        return new f1.i(z.j(e10, a10), 256);
    }
}
