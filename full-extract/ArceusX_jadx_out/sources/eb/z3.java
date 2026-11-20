package eb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z3 extends e4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f15950a;

    public z3(long j10) {
        this.f15950a = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e4 e4Var = (e4) obj;
        if (zza() != e4Var.zza()) {
            return zza() - e4Var.zza();
        }
        long abs = Math.abs(this.f15950a);
        long abs2 = Math.abs(((z3) e4Var).f15950a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z3.class == obj.getClass() && this.f15950a == ((z3) obj).f15950a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f15950a)});
    }

    public final long q() {
        return this.f15950a;
    }

    public final String toString() {
        return Long.toString(this.f15950a);
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c(this.f15950a >= 0 ? (byte) 0 : (byte) 32);
    }
}
