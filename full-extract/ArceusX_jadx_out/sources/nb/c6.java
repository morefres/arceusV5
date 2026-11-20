package nb;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c6 {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public String P;
    public boolean Q;
    public long R;
    public long S;

    /* renamed from: a, reason: collision with root package name */
    public final g7 f26090a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public String f26091c;

    /* renamed from: d, reason: collision with root package name */
    public String f26092d;

    /* renamed from: e, reason: collision with root package name */
    public String f26093e;

    /* renamed from: f, reason: collision with root package name */
    public String f26094f;

    /* renamed from: g, reason: collision with root package name */
    public long f26095g;

    /* renamed from: h, reason: collision with root package name */
    public long f26096h;

    /* renamed from: i, reason: collision with root package name */
    public long f26097i;

    /* renamed from: j, reason: collision with root package name */
    public String f26098j;

    /* renamed from: k, reason: collision with root package name */
    public long f26099k;

    /* renamed from: l, reason: collision with root package name */
    public String f26100l;

    /* renamed from: m, reason: collision with root package name */
    public long f26101m;

    /* renamed from: n, reason: collision with root package name */
    public long f26102n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26103o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26104p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f26105q;

    /* renamed from: r, reason: collision with root package name */
    public long f26106r;

    /* renamed from: s, reason: collision with root package name */
    public List f26107s;

    /* renamed from: t, reason: collision with root package name */
    public String f26108t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f26109u;

    /* renamed from: v, reason: collision with root package name */
    public long f26110v;

    /* renamed from: w, reason: collision with root package name */
    public long f26111w;

    /* renamed from: x, reason: collision with root package name */
    public int f26112x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f26113y;

    /* renamed from: z, reason: collision with root package name */
    public Long f26114z;

    public c6(g7 g7Var, String str) {
        n9.m.l(g7Var);
        n9.m.f(str);
        this.f26090a = g7Var;
        this.b = str;
        g7Var.b().h();
    }

    public final boolean A() {
        this.f26090a.b().h();
        return this.Q;
    }

    public final void A0(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26096h != j10;
        this.f26096h = j10;
    }

    public final int B() {
        this.f26090a.b().h();
        return this.D;
    }

    public final long B0() {
        this.f26090a.b().h();
        return this.f26097i;
    }

    public final void C(int i10) {
        this.f26090a.b().h();
        this.Q |= this.D != i10;
        this.D = i10;
    }

    public final void C0(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26097i != j10;
        this.f26097i = j10;
    }

    public final int D() {
        this.f26090a.b().h();
        return this.E;
    }

    public final String D0() {
        this.f26090a.b().h();
        return this.f26098j;
    }

    public final void E(int i10) {
        this.f26090a.b().h();
        this.Q |= this.E != i10;
        this.E = i10;
    }

    public final void E0(String str) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26098j, str);
        this.f26098j = str;
    }

    public final void F(long j10) {
        this.f26090a.b().h();
        this.Q |= this.F != j10;
        this.F = j10;
    }

    public final long F0() {
        this.f26090a.b().h();
        return this.f26099k;
    }

    public final long G() {
        this.f26090a.b().h();
        return this.F;
    }

    public final void G0(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26099k != j10;
        this.f26099k = j10;
    }

    public final void H(String str) {
        this.f26090a.b().h();
        this.Q |= this.G != str;
        this.G = str;
    }

    public final String H0() {
        this.f26090a.b().h();
        return this.f26100l;
    }

    public final String I() {
        this.f26090a.b().h();
        return this.G;
    }

    public final void I0(String str) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26100l, str);
        this.f26100l = str;
    }

    public final void J(byte[] bArr) {
        this.f26090a.b().h();
        this.Q |= this.H != bArr;
        this.H = bArr;
    }

    public final long J0() {
        this.f26090a.b().h();
        return this.f26101m;
    }

    public final byte[] K() {
        this.f26090a.b().h();
        return this.H;
    }

    public final void K0(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26101m != j10;
        this.f26101m = j10;
    }

    public final void L(int i10) {
        this.f26090a.b().h();
        this.Q |= this.I != i10;
        this.I = i10;
    }

    public final long L0() {
        this.f26090a.b().h();
        return this.f26102n;
    }

    public final int M() {
        this.f26090a.b().h();
        return this.I;
    }

    public final String N() {
        this.f26090a.b().h();
        String str = this.P;
        O(null);
        return str;
    }

    public final void O(String str) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.P, str);
        this.P = str;
    }

    public final boolean P() {
        this.f26090a.b().h();
        return this.f26104p;
    }

    public final void Q(boolean z10) {
        this.f26090a.b().h();
        this.Q |= this.f26104p != z10;
        this.f26104p = z10;
    }

    public final Boolean R() {
        this.f26090a.b().h();
        return this.f26105q;
    }

    public final void S(Boolean bool) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26105q, bool);
        this.f26105q = bool;
    }

    public final List T() {
        this.f26090a.b().h();
        return this.f26107s;
    }

    public final void U(List list) {
        this.f26090a.b().h();
        if (Objects.equals(this.f26107s, list)) {
            return;
        }
        this.Q = true;
        this.f26107s = list != null ? new ArrayList(list) : null;
    }

    public final boolean V() {
        this.f26090a.b().h();
        return this.f26109u;
    }

    public final void W(boolean z10) {
        this.f26090a.b().h();
        this.Q |= this.f26109u != z10;
        this.f26109u = z10;
    }

    public final long X() {
        this.f26090a.b().h();
        return this.f26110v;
    }

    public final void Y(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26110v != j10;
        this.f26110v = j10;
    }

    public final long Z() {
        this.f26090a.b().h();
        return this.f26111w;
    }

    public final void a(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26102n != j10;
        this.f26102n = j10;
    }

    public final void a0(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26111w != j10;
        this.f26111w = j10;
    }

    public final long b() {
        this.f26090a.b().h();
        return this.f26106r;
    }

    public final int b0() {
        this.f26090a.b().h();
        return this.f26112x;
    }

    public final void c(long j10) {
        this.f26090a.b().h();
        this.Q |= this.f26106r != j10;
        this.f26106r = j10;
    }

    public final void c0(int i10) {
        this.f26090a.b().h();
        this.Q |= this.f26112x != i10;
        this.f26112x = i10;
    }

    public final boolean d() {
        this.f26090a.b().h();
        return this.f26103o;
    }

    public final boolean d0() {
        this.f26090a.b().h();
        return this.f26113y;
    }

    public final void e(boolean z10) {
        this.f26090a.b().h();
        this.Q |= this.f26103o != z10;
        this.f26103o = z10;
    }

    public final void e0(boolean z10) {
        this.f26090a.b().h();
        this.Q |= this.f26113y != z10;
        this.f26113y = z10;
    }

    public final void f(long j10) {
        n9.m.a(j10 >= 0);
        this.f26090a.b().h();
        this.Q |= this.f26095g != j10;
        this.f26095g = j10;
    }

    public final Long f0() {
        this.f26090a.b().h();
        return this.f26114z;
    }

    public final long g() {
        this.f26090a.b().h();
        return this.f26095g;
    }

    public final void g0(Long l10) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26114z, l10);
        this.f26114z = l10;
    }

    public final long h() {
        this.f26090a.b().h();
        return this.R;
    }

    public final Long h0() {
        this.f26090a.b().h();
        return this.A;
    }

    public final void i(long j10) {
        this.f26090a.b().h();
        this.Q |= this.R != j10;
        this.R = j10;
    }

    public final void i0(Long l10) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.A, l10);
        this.A = l10;
    }

    public final long j() {
        this.f26090a.b().h();
        return this.S;
    }

    public final long j0() {
        this.f26090a.b().h();
        return this.B;
    }

    public final void k(long j10) {
        this.f26090a.b().h();
        this.Q |= this.S != j10;
        this.S = j10;
    }

    public final void k0(long j10) {
        this.f26090a.b().h();
        this.Q |= this.B != j10;
        this.B = j10;
    }

    public final void l() {
        g7 g7Var = this.f26090a;
        g7Var.b().h();
        long j10 = this.f26095g + 1;
        if (j10 > 2147483647L) {
            g7Var.a().r().b("Bundle index overflow. appId", w5.x(this.b));
            j10 = 0;
        }
        this.Q = true;
        this.f26095g = j10;
    }

    public final String l0() {
        this.f26090a.b().h();
        return this.C;
    }

    public final void m(long j10) {
        g7 g7Var = this.f26090a;
        g7Var.b().h();
        long j11 = this.f26095g + j10;
        if (j11 > 2147483647L) {
            g7Var.a().r().b("Bundle index overflow. appId", w5.x(this.b));
            j11 = (-1) + j10;
        }
        long j12 = this.F + 1;
        if (j12 > 2147483647L) {
            g7Var.a().r().b("Delivery index overflow. appId", w5.x(this.b));
            j12 = 0;
        }
        this.Q = true;
        this.f26095g = j11;
        this.F = j12;
    }

    public final void m0(String str) {
        this.f26090a.b().h();
        this.Q |= this.C != str;
        this.C = str;
    }

    public final long n() {
        this.f26090a.b().h();
        return this.J;
    }

    public final void n0() {
        this.f26090a.b().h();
        this.Q = false;
    }

    public final void o(long j10) {
        this.f26090a.b().h();
        this.Q |= this.J != j10;
        this.J = j10;
    }

    public final String o0() {
        this.f26090a.b().h();
        return this.b;
    }

    public final long p() {
        this.f26090a.b().h();
        return this.K;
    }

    public final String p0() {
        this.f26090a.b().h();
        return this.f26091c;
    }

    public final void q(long j10) {
        this.f26090a.b().h();
        this.Q |= this.K != j10;
        this.K = j10;
    }

    public final void q0(String str) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26091c, str);
        this.f26091c = str;
    }

    public final long r() {
        this.f26090a.b().h();
        return this.L;
    }

    public final String r0() {
        this.f26090a.b().h();
        return this.f26092d;
    }

    public final void s(long j10) {
        this.f26090a.b().h();
        this.Q |= this.L != j10;
        this.L = j10;
    }

    public final void s0(String str) {
        this.f26090a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f26092d, str);
        this.f26092d = str;
    }

    public final long t() {
        this.f26090a.b().h();
        return this.M;
    }

    public final String t0() {
        this.f26090a.b().h();
        return this.f26108t;
    }

    public final void u(long j10) {
        this.f26090a.b().h();
        this.Q |= this.M != j10;
        this.M = j10;
    }

    public final void u0(String str) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26108t, str);
        this.f26108t = str;
    }

    public final long v() {
        this.f26090a.b().h();
        return this.O;
    }

    public final String v0() {
        this.f26090a.b().h();
        return this.f26093e;
    }

    public final void w(long j10) {
        this.f26090a.b().h();
        this.Q |= this.O != j10;
        this.O = j10;
    }

    public final void w0(String str) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26093e, str);
        this.f26093e = str;
    }

    public final long x() {
        this.f26090a.b().h();
        return this.N;
    }

    public final String x0() {
        this.f26090a.b().h();
        return this.f26094f;
    }

    public final void y(long j10) {
        this.f26090a.b().h();
        this.Q |= this.N != j10;
        this.N = j10;
    }

    public final void y0(String str) {
        this.f26090a.b().h();
        this.Q |= !Objects.equals(this.f26094f, str);
        this.f26094f = str;
    }

    public final String z() {
        this.f26090a.b().h();
        return this.P;
    }

    public final long z0() {
        this.f26090a.b().h();
        return this.f26096h;
    }
}
