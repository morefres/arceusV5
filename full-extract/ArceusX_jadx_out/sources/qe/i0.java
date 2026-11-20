package qe;

import af.f0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class i0 implements pe.a {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f29668d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static final Set<String> f29669e = g();

    /* renamed from: a, reason: collision with root package name */
    public final String f29670a;
    public final pe.x b;

    /* renamed from: c, reason: collision with root package name */
    public final pe.a f29671c;

    @Deprecated
    public i0(af.h0 h0Var, pe.a aVar) {
        if (f(h0Var.f0())) {
            this.f29670a = h0Var.f0();
            this.b = e(h0Var);
            this.f29671c = aVar;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + h0Var.f0() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static pe.a d(c cVar, pe.a aVar) {
        try {
            return new i0(af.h0.j0(pe.h0.b(cVar), com.google.crypto.tink.shaded.protobuf.p.b()), aVar);
        } catch (com.google.crypto.tink.shaded.protobuf.b0 e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static boolean f(String str) {
        return f29669e.contains(str);
    }

    public static Set<String> g() {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        pe.l c10 = we.w.f().c(this.b, null);
        byte[] a10 = this.f29671c.a(((we.l0) we.d0.c().n(c10, we.l0.class, pe.j.a())).g().v(), f29668d);
        if (a10.length <= 4096) {
            return c(a10, ((pe.a) we.a0.c().b(c10, pe.a.class)).a(bArr, bArr2));
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 <= 0 || i10 > 4096 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i10];
            wrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((pe.a) we.a0.c().b(we.d0.c().f(we.l0.b(this.f29670a, com.google.crypto.tink.shaded.protobuf.h.e(this.f29671c.b(bArr3, f29668d)), f0.c.SYMMETRIC, af.p0.RAW, null), pe.j.a()), pe.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public final pe.x e(af.h0 h0Var) {
        return pe.h0.a(af.h0.i0(h0Var).C(af.p0.RAW).build().n());
    }
}
