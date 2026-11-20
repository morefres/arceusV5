package eb;

/* loaded from: classes.dex */
public abstract class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f15799a = "0123456789abcdef".toCharArray();

    public abstract int a();

    public abstract int b();

    public abstract boolean c(i2 i2Var);

    public abstract byte[] d();

    public abstract byte[] e();

    public final boolean equals(Object obj) {
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            if (b() == i2Var.b() && c(i2Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] e10 = e();
        int i10 = e10[0] & 255;
        for (int i11 = 1; i11 < e10.length; i11++) {
            i10 |= (e10[i11] & 255) << (i11 * 8);
        }
        return i10;
    }

    public final String toString() {
        byte[] e10 = e();
        int length = e10.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b : e10) {
            char[] cArr = f15799a;
            sb2.append(cArr[(b >> 4) & 15]);
            sb2.append(cArr[b & 15]);
        }
        return sb2.toString();
    }
}
