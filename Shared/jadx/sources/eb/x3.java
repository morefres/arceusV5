package eb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x3 extends e4 {

    /* renamed from: a, reason: collision with root package name */
    public final m3 f15943a;

    public x3(m3 m3Var) {
        this.f15943a = m3Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        e4 e4Var = (e4) obj;
        if (e4.c((byte) 64) != e4Var.zza()) {
            return e4.c((byte) 64) - e4Var.zza();
        }
        x3 x3Var = (x3) e4Var;
        m3 m3Var = this.f15943a;
        int d10 = m3Var.d();
        m3 m3Var2 = x3Var.f15943a;
        if (d10 != m3Var2.d()) {
            return m3Var.d() - m3Var2.d();
        }
        return b3.a().compare(m3Var.p(), x3Var.f15943a.p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x3.class == obj.getClass()) {
            return this.f15943a.equals(((x3) obj).f15943a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(e4.c((byte) 64)), this.f15943a});
    }

    public final m3 q() {
        return this.f15943a;
    }

    public final String toString() {
        u2 c10 = u2.d().c();
        byte[] p8 = this.f15943a.p();
        return "h'" + c10.e(p8, 0, p8.length) + "'";
    }

    @Override // eb.e4
    public final int zza() {
        return e4.c((byte) 64);
    }
}
