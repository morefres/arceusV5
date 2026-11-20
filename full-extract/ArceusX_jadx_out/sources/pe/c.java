package pe;

import af.j0;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f28589a;

    public c(OutputStream outputStream) {
        this.f28589a = outputStream;
    }

    public static s c(OutputStream outputStream) {
        return new c(outputStream);
    }

    @Override // pe.s
    public void a(j0 j0Var) {
        try {
            j0Var.o(this.f28589a);
        } finally {
            this.f28589a.close();
        }
    }

    @Override // pe.s
    public void b(af.a0 a0Var) {
        try {
            a0Var.a().C().build().o(this.f28589a);
        } finally {
            this.f28589a.close();
        }
    }
}
