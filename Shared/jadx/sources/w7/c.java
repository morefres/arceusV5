package w7;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f33804a;
    public long b;

    public c(long j10, int i10) {
        this.b = j10;
        this.f33804a = i10;
    }

    public static c b(String str, int i10, int i11) {
        long j10;
        int i12;
        if (i10 >= i11) {
            return null;
        }
        long j11 = 0;
        int i13 = i10;
        while (i13 < i11) {
            char charAt = str.charAt(i13);
            if (charAt < '0' || charAt > '9') {
                if (charAt >= 'A' && charAt <= 'F') {
                    j10 = j11 * 16;
                    i12 = charAt - 'A';
                } else {
                    if (charAt < 'a' || charAt > 'f') {
                        break;
                    }
                    j10 = j11 * 16;
                    i12 = charAt - 'a';
                }
                j11 = j10 + i12 + 10;
            } else {
                j11 = (j11 * 16) + (charAt - '0');
            }
            if (j11 > 4294967295L) {
                return null;
            }
            i13++;
        }
        if (i13 == i10) {
            return null;
        }
        return new c(j11, i13);
    }

    public static c c(String str, int i10, int i11, boolean z10) {
        if (i10 >= i11) {
            return null;
        }
        if (z10) {
            char charAt = str.charAt(i10);
            if (charAt != '+') {
                r1 = charAt == '-';
            }
            i10++;
        }
        long j10 = 0;
        int i12 = i10;
        while (i12 < i11) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < '0' || charAt2 > '9') {
                break;
            }
            if (r1) {
                j10 = (j10 * 10) - (charAt2 - '0');
                if (j10 < -2147483648L) {
                    return null;
                }
            } else {
                j10 = (j10 * 10) + (charAt2 - '0');
                if (j10 > 2147483647L) {
                    return null;
                }
            }
            i12++;
        }
        if (i12 == i10) {
            return null;
        }
        return new c(j10, i12);
    }

    public int a() {
        return this.f33804a;
    }

    public int d() {
        return (int) this.b;
    }
}
