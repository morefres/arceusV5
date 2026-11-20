package ke;

import he.n;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class c {
    public long a(b bVar) {
        n.l(bVar);
        f a10 = f.a();
        try {
            return d.b((InputStream) a10.b(b()), (OutputStream) a10.b(bVar.a()));
        } finally {
        }
    }

    public abstract InputStream b();
}
