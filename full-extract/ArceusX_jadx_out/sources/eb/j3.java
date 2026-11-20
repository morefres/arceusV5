package eb;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class j3 extends i3 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f15804e;

    public j3(byte[] bArr) {
        bArr.getClass();
        this.f15804e = bArr;
    }

    @Override // eb.m3
    public byte b(int i10) {
        return this.f15804e[i10];
    }

    @Override // eb.m3
    public byte c(int i10) {
        return this.f15804e[i10];
    }

    @Override // eb.m3
    public int d() {
        return this.f15804e.length;
    }

    @Override // eb.m3
    public void e(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f15804e, 0, bArr, 0, i12);
    }

    @Override // eb.m3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m3) || d() != ((m3) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return obj.equals(this);
        }
        j3 j3Var = (j3) obj;
        int l10 = l();
        int l11 = j3Var.l();
        if (l10 != 0 && l11 != 0 && l10 != l11) {
            return false;
        }
        int d10 = d();
        if (d10 > j3Var.d()) {
            throw new IllegalArgumentException("Length too large: " + d10 + d());
        }
        if (d10 > j3Var.d()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + d10 + ", " + j3Var.d());
        }
        byte[] bArr = this.f15804e;
        byte[] bArr2 = j3Var.f15804e;
        int t8 = t() + d10;
        int t10 = t();
        int t11 = j3Var.t();
        while (t10 < t8) {
            if (bArr[t10] != bArr2[t11]) {
                return false;
            }
            t10++;
            t11++;
        }
        return true;
    }

    @Override // eb.m3
    public final int f(int i10, int i11, int i12) {
        int t8 = t();
        Charset charset = s3.f15909a;
        for (int i13 = t8; i13 < t8 + i12; i13++) {
            i10 = (i10 * 31) + this.f15804e[i13];
        }
        return i10;
    }

    @Override // eb.m3
    public final m3 g(int i10, int i11) {
        int k10 = m3.k(i10, i11, d());
        return k10 == 0 ? m3.b : new g3(this.f15804e, t() + i10, k10);
    }

    @Override // eb.m3
    public final InputStream h() {
        return new ByteArrayInputStream(this.f15804e, t(), d());
    }

    @Override // eb.m3
    public final ByteBuffer i() {
        return ByteBuffer.wrap(this.f15804e, t(), d()).asReadOnlyBuffer();
    }

    public int t() {
        return 0;
    }
}
