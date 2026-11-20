package eb;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class p2 extends f2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final MessageDigest f15844a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15845c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15846d;

    public p2(String str, String str2) {
        MessageDigest a10 = a("SHA-256");
        this.f15844a = a10;
        this.b = a10.getDigestLength();
        this.f15846d = "Hashing.sha256()";
        this.f15845c = b(a10);
    }

    public static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public static boolean b(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.f15846d;
    }

    @Override // eb.j2
    public final k2 zza() {
        n2 n2Var = null;
        if (this.f15845c) {
            try {
                return new o2((MessageDigest) this.f15844a.clone(), this.b, n2Var);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new o2(a(this.f15844a.getAlgorithm()), this.b, n2Var);
    }
}
