package eb;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o2 extends e2 {
    public final MessageDigest b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15832c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15833d;

    public /* synthetic */ o2(MessageDigest messageDigest, int i10, n2 n2Var) {
        this.b = messageDigest;
        this.f15832c = i10;
    }

    @Override // eb.e2
    public final void b(byte[] bArr, int i10, int i11) {
        c();
        this.b.update(bArr, 0, i11);
    }

    public final void c() {
        n0.f(!this.f15833d, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // eb.k2
    public final i2 zzc() {
        c();
        this.f15833d = true;
        int i10 = this.f15832c;
        if (i10 == this.b.getDigestLength()) {
            byte[] digest = this.b.digest();
            char[] cArr = i2.f15799a;
            return new h2(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.b.digest(), i10);
        char[] cArr2 = i2.f15799a;
        return new h2(copyOf);
    }
}
