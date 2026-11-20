package pe;

import af.f0;
import af.j0;
import af.k0;
import af.p0;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class k implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f28594c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f28595a;
    public boolean b = false;

    public k(InputStream inputStream) {
        this.f28595a = inputStream;
    }

    public static int c(jg.l lVar) {
        if (!lVar.u()) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!lVar.h().C()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long a10 = we.k.a(lVar.h().k());
            if (a10 > 4294967295L || a10 < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) a10;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static f0.c d(String str) {
        str.getClass();
        switch (str) {
            case "REMOTE":
                return f0.c.REMOTE;
            case "SYMMETRIC":
                return f0.c.SYMMETRIC;
            case "ASYMMETRIC_PRIVATE":
                return f0.c.ASYMMETRIC_PRIVATE;
            case "ASYMMETRIC_PUBLIC":
                return f0.c.ASYMMETRIC_PUBLIC;
            default:
                throw new jg.p("unknown key material type: " + str);
        }
    }

    public static p0 e(String str) {
        str.getClass();
        switch (str) {
            case "LEGACY":
                return p0.LEGACY;
            case "RAW":
                return p0.RAW;
            case "TINK":
                return p0.TINK;
            case "CRUNCHY":
                return p0.CRUNCHY;
            default:
                throw new jg.p("unknown output prefix type: " + str);
        }
    }

    public static af.g0 f(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return af.g0.ENABLED;
            case "DESTROYED":
                return af.g0.DESTROYED;
            case "DISABLED":
                return af.g0.DISABLED;
            default:
                throw new jg.p("unknown status: " + str);
        }
    }

    public static k0.c i(jg.o oVar) {
        return k0.c.e0().E(f(oVar.E(NotificationCompat.CATEGORY_STATUS).l())).C(c(oVar.E("keyId"))).D(e(oVar.E("outputPrefixType").l())).G(oVar.E("typeUrl").l()).build();
    }

    public static k0 k(jg.o oVar) {
        k0.b e02 = k0.e0();
        if (oVar.H("primaryKeyId")) {
            e02.D(c(oVar.E("primaryKeyId")));
        }
        if (oVar.H("keyInfo")) {
            jg.i F = oVar.F("keyInfo");
            for (int i10 = 0; i10 < F.size(); i10++) {
                e02.C(i(F.A(i10).g()));
            }
        }
        return e02.build();
    }

    public static void l(jg.o oVar) {
        if (!oVar.H("encryptedKeyset")) {
            throw new jg.p("invalid encrypted keyset");
        }
    }

    public static k m(String str) {
        return new k(new ByteArrayInputStream(str.getBytes(f28594c)));
    }

    @Override // pe.r
    public af.a0 a() {
        try {
            try {
                return b(we.k.c(new String(i0.c(this.f28595a), f28594c)).g());
            } finally {
                InputStream inputStream = this.f28595a;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IllegalStateException | jg.p e10) {
            throw new IOException(e10);
        }
    }

    public final af.a0 b(jg.o oVar) {
        l(oVar);
        byte[] e10 = this.b ? df.d.e(oVar.E("encryptedKeyset").l()) : df.d.a(oVar.E("encryptedKeyset").l());
        return oVar.H("keysetInfo") ? af.a0.f0().D(com.google.crypto.tink.shaded.protobuf.h.e(e10)).E(k(oVar.G("keysetInfo"))).build() : af.a0.f0().D(com.google.crypto.tink.shaded.protobuf.h.e(e10)).build();
    }

    public final af.f0 g(jg.o oVar) {
        if (oVar.H("typeUrl") && oVar.H("value") && oVar.H("keyMaterialType")) {
            return af.f0.h0().D(oVar.E("typeUrl").l()).E(com.google.crypto.tink.shaded.protobuf.h.e(this.b ? df.d.e(oVar.E("value").l()) : df.d.a(oVar.E("value").l()))).C(d(oVar.E("keyMaterialType").l())).build();
        }
        throw new jg.p("invalid keyData");
    }

    public final j0.c h(jg.o oVar) {
        if (!oVar.H("keyData") || !oVar.H(NotificationCompat.CATEGORY_STATUS) || !oVar.H("keyId") || !oVar.H("outputPrefixType")) {
            throw new jg.p("invalid key");
        }
        jg.l E = oVar.E("keyData");
        if (E.t()) {
            return j0.c.j0().J(f(oVar.E(NotificationCompat.CATEGORY_STATUS).l())).E(c(oVar.E("keyId"))).G(e(oVar.E("outputPrefixType").l())).D(g(E.g())).build();
        }
        throw new jg.p("invalid key: keyData must be an object");
    }

    public final j0 j(jg.o oVar) {
        if (!oVar.H("key")) {
            throw new jg.p("invalid keyset: no key");
        }
        jg.l E = oVar.E("key");
        if (!E.m()) {
            throw new jg.p("invalid keyset: key must be an array");
        }
        jg.i f10 = E.f();
        if (f10.size() == 0) {
            throw new jg.p("invalid keyset: key is empty");
        }
        j0.b i02 = j0.i0();
        if (oVar.H("primaryKeyId")) {
            i02.D(c(oVar.E("primaryKeyId")));
        }
        for (int i10 = 0; i10 < f10.size(); i10++) {
            i02.C(h(f10.A(i10).g()));
        }
        return i02.build();
    }

    @Override // pe.r
    public j0 read() {
        try {
            try {
                return j(we.k.c(new String(i0.c(this.f28595a), f28594c)).g());
            } finally {
                InputStream inputStream = this.f28595a;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (IllegalStateException | jg.p e10) {
            throw new IOException(e10);
        }
    }
}
