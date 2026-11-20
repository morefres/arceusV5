package ke;

import he.n;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class b {
    public abstract OutputStream a();

    public void b(byte[] bArr) {
        n.l(bArr);
        try {
            OutputStream outputStream = (OutputStream) f.a().b(a());
            outputStream.write(bArr);
            outputStream.flush();
        } finally {
        }
    }
}
