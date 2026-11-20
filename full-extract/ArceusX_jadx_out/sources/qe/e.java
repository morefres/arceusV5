package qe;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import we.h0;
import we.j0;
import we.s;

/* loaded from: classes2.dex */
public class e implements we.k0<pe.a, pe.a> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f29652a = new e();
    public static final we.h0<we.p, pe.a> b = we.h0.b(new h0.b() { // from class: qe.d
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return re.j0.d((we.p) lVar);
        }
    }, we.p.class, pe.a.class);

    public static class b implements pe.a {

        /* renamed from: a, reason: collision with root package name */
        public final we.j0<pe.a> f29653a;
        public final s.a b;

        /* renamed from: c, reason: collision with root package name */
        public final s.a f29654c;

        @Override // pe.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = this.f29653a.d().b().a(bArr, bArr2);
                this.b.a(this.f29653a.d().c(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }

        @Override // pe.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                for (j0.c<pe.a> cVar : this.f29653a.e(Arrays.copyOf(bArr, 5))) {
                    try {
                        byte[] b = cVar.b().b(bArr, bArr2);
                        this.f29654c.a(cVar.c(), bArr.length);
                        return b;
                    } catch (GeneralSecurityException unused) {
                    }
                }
            }
            for (j0.c<pe.a> cVar2 : this.f29653a.g()) {
                try {
                    byte[] b10 = cVar2.b().b(bArr, bArr2);
                    this.f29654c.a(cVar2.c(), bArr.length);
                    return b10;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f29654c.b();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(we.j0<pe.a> j0Var) {
            this.f29653a = j0Var;
            if (!j0Var.h()) {
                s.a aVar = we.u.f34297a;
                this.b = aVar;
                this.f29654c = aVar;
            } else {
                we.s a10 = we.y.b().a();
                we.t a11 = we.u.a(j0Var);
                this.b = a10.a(a11, "aead", "encrypt");
                this.f29654c = a10.a(a11, "aead", "decrypt");
            }
        }
    }

    public static void d() {
        we.a0.c().e(f29652a);
        we.a0.c().d(b);
    }

    @Override // we.k0
    public Class<pe.a> a() {
        return pe.a.class;
    }

    @Override // we.k0
    public Class<pe.a> c() {
        return pe.a.class;
    }

    @Override // we.k0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public pe.a b(we.j0<pe.a> j0Var) {
        return new b(j0Var);
    }
}
