package eb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15801a;
    public final h0 b;

    /* renamed from: c, reason: collision with root package name */
    public h0 f15802c;

    public /* synthetic */ j0(String str, i0 i0Var) {
        h0 h0Var = new h0();
        this.b = h0Var;
        this.f15802c = h0Var;
        str.getClass();
        this.f15801a = str;
    }

    public final j0 a(String str, int i10) {
        String valueOf = String.valueOf(i10);
        g0 g0Var = new g0(null);
        this.f15802c.f15791c = g0Var;
        this.f15802c = g0Var;
        g0Var.b = valueOf;
        g0Var.f15790a = "errorCode";
        return this;
    }

    public final j0 b(String str, Object obj) {
        h0 h0Var = new h0();
        this.f15802c.f15791c = h0Var;
        this.f15802c = h0Var;
        h0Var.b = obj;
        h0Var.f15790a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f15801a);
        sb2.append('{');
        h0 h0Var = this.b.f15791c;
        String str = "";
        while (h0Var != null) {
            Object obj = h0Var.b;
            sb2.append(str);
            String str2 = h0Var.f15790a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            h0Var = h0Var.f15791c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
