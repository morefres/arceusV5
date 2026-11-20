package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class s3 implements Iterable, Serializable {
    public static final s3 b = new q3(z4.f7405a);

    /* renamed from: a, reason: collision with root package name */
    public int f7282a = 0;

    static {
        int i10 = e3.f7081a;
    }

    public static int i(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static s3 k(byte[] bArr, int i10, int i11) {
        try {
            i(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new q3(bArr2);
        } catch (f5 e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    public static /* bridge */ /* synthetic */ boolean l(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        i(i10, i13, bArr.length);
        i(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public abstract byte b(int i10);

    public abstract int c(int i10, int i11, int i12);

    public abstract int d();

    public abstract s3 e(int i10, int i11);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        int d10 = d();
        if (d10 != s3Var.d()) {
            return false;
        }
        if (d10 == 0) {
            return true;
        }
        int i10 = this.f7282a;
        int i11 = s3Var.f7282a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return h(s3Var);
        }
        return false;
    }

    public abstract void f(byte[] bArr, int i10, int i11, int i12);

    public abstract void g(i3 i3Var);

    public abstract boolean h(s3 s3Var);

    public final int hashCode() {
        int i10 = this.f7282a;
        if (i10 == 0) {
            int d10 = d();
            i10 = c(d10, 0, d10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7282a = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new j3(this);
    }

    public final byte[] m() {
        int d10 = d();
        if (d10 == 0) {
            return z4.f7405a;
        }
        byte[] bArr = new byte[d10];
        f(bArr, 0, 0, d10);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? r6.a(m()) : r6.a(e(0, 47).m()).concat("..."));
    }
}
