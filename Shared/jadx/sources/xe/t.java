package xe;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import we.a0;
import we.h0;
import we.j0;
import we.k0;
import we.s;

/* loaded from: classes2.dex */
public class t implements k0<pe.w, pe.w> {

    /* renamed from: a, reason: collision with root package name */
    public static final t f35569a = new t();
    public static final h0<we.p, pe.w> b = h0.b(new h0.b() { // from class: xe.s
        @Override // we.h0.b
        public final Object a(pe.l lVar) {
            return ye.n.c((we.p) lVar);
        }
    }, we.p.class, pe.w.class);

    public static class b implements pe.w {

        /* renamed from: a, reason: collision with root package name */
        public final j0<pe.w> f35570a;
        public final s.a b;

        /* renamed from: c, reason: collision with root package name */
        public final s.a f35571c;

        @Override // pe.w
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f35571c.b();
                throw new GeneralSecurityException("tag too short");
            }
            for (j0.c<pe.w> cVar : this.f35570a.e(Arrays.copyOf(bArr, 5))) {
                try {
                    cVar.b().a(bArr, bArr2);
                    this.f35571c.a(cVar.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (j0.c<pe.w> cVar2 : this.f35570a.g()) {
                try {
                    cVar2.b().a(bArr, bArr2);
                    this.f35571c.a(cVar2.c(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            this.f35571c.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // pe.w
        public byte[] b(byte[] bArr) {
            try {
                byte[] b = this.f35570a.d().b().b(bArr);
                this.b.a(this.f35570a.d().c(), bArr.length);
                return b;
            } catch (GeneralSecurityException e10) {
                this.b.b();
                throw e10;
            }
        }

        public b(j0<pe.w> j0Var) {
            this.f35570a = j0Var;
            if (!j0Var.h()) {
                s.a aVar = we.u.f34297a;
                this.b = aVar;
                this.f35571c = aVar;
            } else {
                we.s a10 = we.y.b().a();
                we.t a11 = we.u.a(j0Var);
                this.b = a10.a(a11, "mac", "compute");
                this.f35571c = a10.a(a11, "mac", "verify");
            }
        }
    }

    public static void d() {
        a0.c().e(f35569a);
        a0.c().d(b);
    }

    @Override // we.k0
    public Class<pe.w> a() {
        return pe.w.class;
    }

    @Override // we.k0
    public Class<pe.w> c() {
        return pe.w.class;
    }

    @Override // we.k0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public pe.w b(j0<pe.w> j0Var) {
        return new b(j0Var);
    }
}
