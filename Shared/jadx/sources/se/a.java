package se;

import df.a0;
import df.e;
import df.m;
import df.p;
import df.u;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import pe.j;
import qe.v;
import we.s0;

/* loaded from: classes2.dex */
public final class a implements pe.a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f31041c = p.a("7a806c");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f31042d = p.a("46bb91c3c5");

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f31043e = p.a("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f31044f = p.a("bae8e37fc83441b16034566b");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f31045g = p.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f31046h = new C0551a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f31047a;
    public final byte[] b;

    /* renamed from: se.a$a, reason: collision with other inner class name */
    public class C0551a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher a10 = m.b.a("AES/GCM-SIV/NoPadding");
                if (a.h(a10)) {
                    return a10;
                }
                return null;
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public a(byte[] bArr, byte[] bArr2) {
        this.b = bArr2;
        a0.a(bArr.length);
        this.f31047a = new SecretKeySpec(bArr, "AES");
    }

    public static pe.a d(v vVar) {
        return new a(vVar.c().d(j.a()), vVar.d().d());
    }

    public static AlgorithmParameterSpec f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec g(byte[] bArr, int i10, int i11) {
        return new GCMParameterSpec(128, bArr, i10, i11);
    }

    public static boolean h(Cipher cipher) {
        try {
            cipher.init(2, new SecretKeySpec(f31043e, "AES"), f(f31044f));
            cipher.updateAAD(f31042d);
            byte[] bArr = f31045g;
            return e.b(cipher.doFinal(bArr, 0, bArr.length), f31041c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // pe.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] j10 = j(bArr, bArr2);
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? j10 : e.a(bArr3, j10);
    }

    @Override // pe.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return i(bArr, bArr2);
        }
        if (s0.e(bArr3, bArr)) {
            return i(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    public final Cipher e() {
        Cipher cipher = f31046h.get();
        if (cipher != null) {
            return cipher;
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    public final byte[] i(byte[] bArr, byte[] bArr2) {
        Cipher e10 = e();
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        e10.init(2, this.f31047a, g(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            e10.updateAAD(bArr2);
        }
        return e10.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] j(byte[] bArr, byte[] bArr2) {
        Cipher e10 = e();
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] a10 = u.a(12);
        System.arraycopy(a10, 0, bArr3, 0, 12);
        e10.init(1, this.f31047a, f(a10));
        if (bArr2 != null && bArr2.length != 0) {
            e10.updateAAD(bArr2);
        }
        int doFinal = e10.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
    }
}
