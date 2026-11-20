package c2;

import c2.d;
import d2.n;
import d2.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    public int A0;
    public boolean B0;
    public boolean C0;
    public float[] D0;
    public e[] E0;
    public e[] F0;
    public e G0;
    public e H0;
    public int I0;
    public int J0;
    public boolean K;
    public d V;
    public d[] W;
    public ArrayList<d> X;
    public boolean[] Y;
    public b[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public e f4492a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f4493b0;

    /* renamed from: c, reason: collision with root package name */
    public d2.c f4494c;

    /* renamed from: c0, reason: collision with root package name */
    public int f4495c0;

    /* renamed from: d, reason: collision with root package name */
    public d2.c f4496d;

    /* renamed from: d0, reason: collision with root package name */
    public float f4497d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f4499e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f4501f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f4503g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f4505h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f4507i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f4509j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f4511k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f4513l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4515m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f4517n0;

    /* renamed from: o, reason: collision with root package name */
    public String f4518o;

    /* renamed from: o0, reason: collision with root package name */
    public float f4519o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f4521p0;

    /* renamed from: q0, reason: collision with root package name */
    public Object f4523q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f4525r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f4527s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f4529t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f4531u0;

    /* renamed from: v0, reason: collision with root package name */
    public String f4533v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f4535w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f4537x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4539y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4541z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4491a = false;
    public p[] b = new p[2];

    /* renamed from: e, reason: collision with root package name */
    public d2.l f4498e = null;

    /* renamed from: f, reason: collision with root package name */
    public n f4500f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean[] f4502g = {true, true};

    /* renamed from: h, reason: collision with root package name */
    public boolean f4504h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4506i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4508j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4510k = true;

    /* renamed from: l, reason: collision with root package name */
    public int f4512l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f4514m = -1;

    /* renamed from: n, reason: collision with root package name */
    public b2.a f4516n = new b2.a(this);

    /* renamed from: p, reason: collision with root package name */
    public boolean f4520p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4522q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4524r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4526s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f4528t = -1;

    /* renamed from: u, reason: collision with root package name */
    public int f4530u = -1;

    /* renamed from: v, reason: collision with root package name */
    public int f4532v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f4534w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f4536x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int[] f4538y = new int[2];

    /* renamed from: z, reason: collision with root package name */
    public int f4540z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    public int F = -1;
    public float G = 1.0f;
    public int[] H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float I = Float.NaN;
    public boolean J = false;
    public boolean L = false;
    public int M = 0;
    public int N = 0;
    public d O = new d(this, d.a.LEFT);
    public d P = new d(this, d.a.TOP);
    public d Q = new d(this, d.a.RIGHT);
    public d R = new d(this, d.a.BOTTOM);
    public d S = new d(this, d.a.BASELINE);
    public d T = new d(this, d.a.CENTER_X);
    public d U = new d(this, d.a.CENTER_Y);

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4542a;

        static {
            int[] iArr = new int[d.a.values().length];
            f4542a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4542a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4542a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4542a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4542a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4542a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4542a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4542a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4542a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        this.X = new ArrayList<>();
        this.Y = new boolean[2];
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        this.f4492a0 = null;
        this.f4493b0 = 0;
        this.f4495c0 = 0;
        this.f4497d0 = 0.0f;
        this.f4499e0 = -1;
        this.f4501f0 = 0;
        this.f4503g0 = 0;
        this.f4505h0 = 0;
        this.f4507i0 = 0;
        this.f4509j0 = 0;
        this.f4511k0 = 0;
        this.f4513l0 = 0;
        float f10 = K0;
        this.f4519o0 = f10;
        this.f4521p0 = f10;
        this.f4525r0 = 0;
        this.f4527s0 = 0;
        this.f4529t0 = false;
        this.f4531u0 = null;
        this.f4533v0 = null;
        this.f4539y0 = false;
        this.f4541z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    public b A() {
        return this.Z[0];
    }

    public final void A0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public int B() {
        d dVar = this.O;
        int i10 = dVar != null ? dVar.f4479g : 0;
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f4479g : i10;
    }

    public void B0(int i10) {
        this.f4513l0 = i10;
        this.J = i10 > 0;
    }

    public int C() {
        return this.M;
    }

    public void C0(Object obj) {
        this.f4523q0 = obj;
    }

    public int D() {
        return this.N;
    }

    public void D0(String str) {
        this.f4531u0 = str;
    }

    public int E(int i10) {
        if (i10 == 0) {
            return W();
        }
        if (i10 == 1) {
            return x();
        }
        return 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void E0(String str) {
        float f10;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f4497d0 = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i11 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i11 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f10 = Float.parseFloat(substring2);
            }
            f10 = i10;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f10 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f10 = i10;
        }
        i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f4497d0 = f10;
            this.f4499e0 = i11;
        }
    }

    public int F() {
        return this.H[1];
    }

    public void F0(int i10) {
        if (this.J) {
            int i11 = i10 - this.f4513l0;
            int i12 = this.f4495c0 + i11;
            this.f4503g0 = i11;
            this.P.t(i11);
            this.R.t(i12);
            this.S.t(i10);
            this.f4522q = true;
        }
    }

    public int G() {
        return this.H[0];
    }

    public void G0(int i10, int i11) {
        if (this.f4520p) {
            return;
        }
        this.O.t(i10);
        this.Q.t(i11);
        this.f4501f0 = i10;
        this.f4493b0 = i11 - i10;
        this.f4520p = true;
    }

    public int H() {
        return this.f4517n0;
    }

    public void H0(int i10) {
        this.O.t(i10);
        this.f4501f0 = i10;
    }

    public int I() {
        return this.f4515m0;
    }

    public void I0(int i10) {
        this.P.t(i10);
        this.f4503g0 = i10;
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.R).f4478f) != null && dVar2.f4478f == dVar) {
                return dVar2.f4476d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f4478f;
        if (dVar4 == null || dVar4.f4478f != dVar3) {
            return null;
        }
        return dVar4.f4476d;
    }

    public void J0(int i10, int i11) {
        if (this.f4522q) {
            return;
        }
        this.P.t(i10);
        this.R.t(i11);
        this.f4503g0 = i10;
        this.f4495c0 = i11 - i10;
        if (this.J) {
            this.S.t(i10 + this.f4513l0);
        }
        this.f4522q = true;
    }

    public e K() {
        return this.f4492a0;
    }

    public void K0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f4501f0 = i10;
        this.f4503g0 = i11;
        if (this.f4527s0 == 8) {
            this.f4493b0 = 0;
            this.f4495c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f4493b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f4495c0)) {
            i17 = i14;
        }
        this.f4493b0 = i16;
        this.f4495c0 = i17;
        int i18 = this.f4517n0;
        if (i17 < i18) {
            this.f4495c0 = i18;
        }
        int i19 = this.f4515m0;
        if (i16 < i19) {
            this.f4493b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f4493b0 = Math.min(this.f4493b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f4495c0 = Math.min(this.f4495c0, i21);
        }
        int i22 = this.f4493b0;
        if (i16 != i22) {
            this.f4512l = i22;
        }
        int i23 = this.f4495c0;
        if (i17 != i23) {
            this.f4514m = i23;
        }
    }

    public e L(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.P).f4478f) != null && dVar2.f4478f == dVar) {
                return dVar2.f4476d;
            }
            return null;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f4478f;
        if (dVar4 == null || dVar4.f4478f != dVar3) {
            return null;
        }
        return dVar4.f4476d;
    }

    public void L0(boolean z10) {
        this.J = z10;
    }

    public int M() {
        return X() + this.f4493b0;
    }

    public void M0(int i10) {
        this.f4495c0 = i10;
        int i11 = this.f4517n0;
        if (i10 < i11) {
            this.f4495c0 = i11;
        }
    }

    public p N(int i10) {
        if (i10 == 0) {
            return this.f4498e;
        }
        if (i10 == 1) {
            return this.f4500f;
        }
        return null;
    }

    public void N0(float f10) {
        this.f4519o0 = f10;
    }

    public void O(StringBuilder sb2) {
        sb2.append("  " + this.f4518o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f4493b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f4495c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f4501f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f4503g0);
        sb2.append("\n");
        Q(sb2, "left", this.O);
        Q(sb2, "top", this.P);
        Q(sb2, "right", this.Q);
        Q(sb2, "bottom", this.R);
        Q(sb2, "baseline", this.S);
        Q(sb2, "centerX", this.T);
        Q(sb2, "centerY", this.U);
        P(sb2, "    width", this.f4493b0, this.f4515m0, this.H[0], this.f4512l, this.f4540z, this.f4534w, this.B, this.Z[0], this.D0[0]);
        P(sb2, "    height", this.f4495c0, this.f4517n0, this.H[1], this.f4514m, this.C, this.f4536x, this.E, this.Z[1], this.D0[1]);
        A0(sb2, "    dimensionRatio", this.f4497d0, this.f4499e0);
        x0(sb2, "    horizontalBias", this.f4519o0, K0);
        x0(sb2, "    verticalBias", this.f4521p0, K0);
        y0(sb2, "    horizontalChainStyle", this.f4541z0, 0);
        y0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void O0(int i10) {
        this.f4541z0 = i10;
    }

    public final void P(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        z0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        y0(sb2, "      size", i10, 0);
        y0(sb2, "      min", i11, 0);
        y0(sb2, "      max", i12, Integer.MAX_VALUE);
        y0(sb2, "      matchMin", i14, 0);
        y0(sb2, "      matchDef", i15, 0);
        x0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public void P0(int i10, int i11) {
        this.f4501f0 = i10;
        int i12 = i11 - i10;
        this.f4493b0 = i12;
        int i13 = this.f4515m0;
        if (i12 < i13) {
            this.f4493b0 = i13;
        }
    }

    public final void Q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f4478f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f4478f);
        sb2.append("'");
        if (dVar.f4480h != Integer.MIN_VALUE || dVar.f4479g != 0) {
            sb2.append(",");
            sb2.append(dVar.f4479g);
            if (dVar.f4480h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f4480h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public void Q0(b bVar) {
        this.Z[0] = bVar;
    }

    public float R() {
        return this.f4521p0;
    }

    public void R0(int i10, int i11, int i12, float f10) {
        this.f4534w = i10;
        this.f4540z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f4534w = 2;
    }

    public int S() {
        return this.A0;
    }

    public void S0(float f10) {
        this.D0[0] = f10;
    }

    public b T() {
        return this.Z[1];
    }

    public void T0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public int U() {
        int i10 = this.O != null ? this.P.f4479g : 0;
        return this.Q != null ? i10 + this.R.f4479g : i10;
    }

    public void U0(boolean z10) {
        this.K = z10;
    }

    public int V() {
        return this.f4527s0;
    }

    public void V0(boolean z10) {
        this.L = z10;
    }

    public int W() {
        if (this.f4527s0 == 8) {
            return 0;
        }
        return this.f4493b0;
    }

    public void W0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        Z0(false);
    }

    public int X() {
        e eVar = this.f4492a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f4501f0 : ((f) eVar).S0 + this.f4501f0;
    }

    public void X0(int i10) {
        this.H[1] = i10;
    }

    public int Y() {
        e eVar = this.f4492a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f4503g0 : ((f) eVar).T0 + this.f4503g0;
    }

    public void Y0(int i10) {
        this.H[0] = i10;
    }

    public boolean Z() {
        return this.J;
    }

    public void Z0(boolean z10) {
        this.f4506i = z10;
    }

    public boolean a0(int i10) {
        if (i10 == 0) {
            return (this.O.f4478f != null ? 1 : 0) + (this.Q.f4478f != null ? 1 : 0) < 2;
        }
        return ((this.P.f4478f != null ? 1 : 0) + (this.R.f4478f != null ? 1 : 0)) + (this.S.f4478f != null ? 1 : 0) < 2;
    }

    public void a1(int i10) {
        if (i10 < 0) {
            this.f4517n0 = 0;
        } else {
            this.f4517n0 = i10;
        }
    }

    public boolean b0() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.X.get(i10).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i10) {
        if (i10 < 0) {
            this.f4515m0 = 0;
        } else {
            this.f4515m0 = i10;
        }
    }

    public boolean c0() {
        return (this.f4512l == -1 && this.f4514m == -1) ? false : true;
    }

    public void c1(int i10, int i11) {
        this.f4501f0 = i10;
        this.f4503g0 = i11;
    }

    public final void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    public boolean d0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f4478f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.Q.f4478f) != null && dVar2.n() && (this.Q.f4478f.e() - this.Q.f()) - (this.O.f4478f.e() + this.O.f()) >= i11;
        }
        d dVar4 = this.P.f4478f;
        if (dVar4 != null && dVar4.n() && (dVar = this.R.f4478f) != null && dVar.n() && (this.R.f4478f.e() - this.R.f()) - (this.P.f4478f.e() + this.P.f()) >= i11) {
            return true;
        }
        return false;
    }

    public void d1(e eVar) {
        this.f4492a0 = eVar;
    }

    public void e(f fVar, z1.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.V1(64));
        }
        if (i10 == 0) {
            HashSet<d> d10 = this.O.d();
            if (d10 != null) {
                Iterator<d> it = d10.iterator();
                while (it.hasNext()) {
                    it.next().f4476d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> d11 = this.Q.d();
            if (d11 != null) {
                Iterator<d> it2 = d11.iterator();
                while (it2.hasNext()) {
                    it2.next().f4476d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<d> d12 = this.P.d();
        if (d12 != null) {
            Iterator<d> it3 = d12.iterator();
            while (it3.hasNext()) {
                it3.next().f4476d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> d13 = this.R.d();
        if (d13 != null) {
            Iterator<d> it4 = d13.iterator();
            while (it4.hasNext()) {
                it4.next().f4476d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> d14 = this.S.d();
        if (d14 != null) {
            Iterator<d> it5 = d14.iterator();
            while (it5.hasNext()) {
                it5.next().f4476d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public void e0(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        o(aVar).b(eVar.o(aVar2), i10, i11, true);
    }

    public void e1(float f10) {
        this.f4521p0 = f10;
    }

    public boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public final boolean f0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.W;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f4478f;
        return (dVar4 == null || dVar4.f4478f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f4478f) == null || dVar2.f4478f != dVar) ? false : true;
    }

    public void f1(int i10) {
        this.A0 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r13 != 3) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0210  */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(z1.d r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.e.g(z1.d, boolean):void");
    }

    public boolean g0() {
        return this.f4524r;
    }

    public void g1(int i10, int i11) {
        this.f4503g0 = i10;
        int i12 = i11 - i10;
        this.f4495c0 = i12;
        int i13 = this.f4517n0;
        if (i12 < i13) {
            this.f4495c0 = i13;
        }
    }

    public boolean h() {
        return this.f4527s0 != 8;
    }

    public boolean h0(int i10) {
        return this.Y[i10];
    }

    public void h1(b bVar) {
        this.Z[1] = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0513 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(z1.d r31, boolean r32, boolean r33, boolean r34, boolean r35, z1.i r36, z1.i r37, c2.e.b r38, boolean r39, c2.d r40, c2.d r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.e.i(z1.d, boolean, boolean, boolean, boolean, z1.i, z1.i, c2.e$b, boolean, c2.d, c2.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public boolean i0() {
        d dVar = this.O;
        d dVar2 = dVar.f4478f;
        if (dVar2 != null && dVar2.f4478f == dVar) {
            return true;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f4478f;
        return dVar4 != null && dVar4.f4478f == dVar3;
    }

    public void i1(int i10, int i11, int i12, float f10) {
        this.f4536x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f4536x = 2;
    }

    public void j(d.a aVar, e eVar, d.a aVar2, int i10) {
        d.a aVar3;
        d.a aVar4;
        boolean z10;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    j(aVar6, eVar, aVar2, 0);
                    j(d.a.RIGHT, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    j(aVar7, eVar, aVar2, 0);
                    j(d.a.BOTTOM, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d o8 = o(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d o10 = o(aVar9);
            d.a aVar10 = d.a.TOP;
            d o11 = o(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d o12 = o(aVar11);
            boolean z11 = true;
            if ((o8 == null || !o8.o()) && (o10 == null || !o10.o())) {
                j(aVar8, eVar, aVar8, 0);
                j(aVar9, eVar, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((o11 == null || !o11.o()) && (o12 == null || !o12.o())) {
                j(aVar10, eVar, aVar10, 0);
                j(aVar11, eVar, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                o(aVar5).a(eVar.o(aVar5), 0);
                return;
            }
            if (z10) {
                d.a aVar12 = d.a.CENTER_X;
                o(aVar12).a(eVar.o(aVar12), 0);
                return;
            } else {
                if (z11) {
                    d.a aVar13 = d.a.CENTER_Y;
                    o(aVar13).a(eVar.o(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d o13 = o(aVar4);
            d o14 = eVar.o(aVar2);
            d o15 = o(d.a.RIGHT);
            o13.a(o14, 0);
            o15.a(o14, 0);
            o(aVar14).a(o14, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d o16 = eVar.o(aVar2);
            o(aVar3).a(o16, 0);
            o(d.a.BOTTOM).a(o16, 0);
            o(aVar15).a(o16, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            o(aVar16).a(eVar.o(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            o(aVar17).a(eVar.o(aVar17), 0);
            o(aVar14).a(eVar.o(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            o(aVar18).a(eVar.o(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            o(aVar19).a(eVar.o(aVar19), 0);
            o(aVar15).a(eVar.o(aVar2), 0);
            return;
        }
        d o17 = o(aVar);
        d o18 = eVar.o(aVar2);
        if (o17.p(o18)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d o19 = o(d.a.TOP);
                d o20 = o(d.a.BOTTOM);
                if (o19 != null) {
                    o19.q();
                }
                if (o20 != null) {
                    o20.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d o21 = o(aVar20);
                if (o21 != null) {
                    o21.q();
                }
                d o22 = o(aVar5);
                if (o22.j() != o18) {
                    o22.q();
                }
                d g10 = o(aVar).g();
                d o23 = o(aVar15);
                if (o23.o()) {
                    g10.q();
                    o23.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d o24 = o(aVar5);
                if (o24.j() != o18) {
                    o24.q();
                }
                d g11 = o(aVar).g();
                d o25 = o(aVar14);
                if (o25.o()) {
                    g11.q();
                    o25.q();
                }
            }
            o17.a(o18, i10);
        }
    }

    public boolean j0() {
        return this.K;
    }

    public void j1(float f10) {
        this.D0[1] = f10;
    }

    public void k(d dVar, d dVar2, int i10) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i10);
        }
    }

    public boolean k0() {
        d dVar = this.P;
        d dVar2 = dVar.f4478f;
        if (dVar2 != null && dVar2.f4478f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f4478f;
        return dVar4 != null && dVar4.f4478f == dVar3;
    }

    public void k1(int i10) {
        this.f4527s0 = i10;
    }

    public void l(e eVar, float f10, int i10) {
        d.a aVar = d.a.CENTER;
        e0(aVar, eVar, aVar, i10, 0);
        this.I = f10;
    }

    public boolean l0() {
        return this.L;
    }

    public void l1(int i10) {
        this.f4493b0 = i10;
        int i11 = this.f4515m0;
        if (i10 < i11) {
            this.f4493b0 = i11;
        }
    }

    public void m(z1.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f4513l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean m0() {
        return this.f4506i && this.f4527s0 != 8;
    }

    public void m1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f4532v = i10;
    }

    public void n() {
        if (this.f4498e == null) {
            this.f4498e = new d2.l(this);
        }
        if (this.f4500f == null) {
            this.f4500f = new n(this);
        }
    }

    public boolean n0() {
        if (this.f4520p) {
            return true;
        }
        return this.O.n() && this.Q.n();
    }

    public void n1(int i10) {
        this.f4501f0 = i10;
    }

    public d o(d.a aVar) {
        switch (a.f4542a[aVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean o0() {
        if (this.f4522q) {
            return true;
        }
        return this.P.n() && this.R.n();
    }

    public void o1(int i10) {
        this.f4503g0 = i10;
    }

    public int p() {
        return this.f4513l0;
    }

    public boolean p0() {
        return this.f4526s;
    }

    public void p1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f4499e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.o() || !this.R.o())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f4540z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i10 != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public float q(int i10) {
        if (i10 == 0) {
            return this.f4519o0;
        }
        if (i10 == 1) {
            return this.f4521p0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f4524r = true;
    }

    public void q1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f4498e.k();
        boolean k11 = z11 & this.f4500f.k();
        d2.l lVar = this.f4498e;
        int i12 = lVar.f14331h.f14284g;
        n nVar = this.f4500f;
        int i13 = nVar.f14331h.f14284g;
        int i14 = lVar.f14332i.f14284g;
        int i15 = nVar.f14332i.f14284g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f4501f0 = i12;
        }
        if (k11) {
            this.f4503g0 = i13;
        }
        if (this.f4527s0 == 8) {
            this.f4493b0 = 0;
            this.f4495c0 = 0;
            return;
        }
        if (k10) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f4493b0)) {
                i17 = i11;
            }
            this.f4493b0 = i17;
            int i19 = this.f4515m0;
            if (i17 < i19) {
                this.f4493b0 = i19;
            }
        }
        if (k11) {
            if (this.Z[1] == b.FIXED && i18 < (i10 = this.f4495c0)) {
                i18 = i10;
            }
            this.f4495c0 = i18;
            int i20 = this.f4517n0;
            if (i18 < i20) {
                this.f4495c0 = i20;
            }
        }
    }

    public int r() {
        return Y() + this.f4495c0;
    }

    public void r0() {
        this.f4526s = true;
    }

    public void r1(z1.d dVar, boolean z10) {
        n nVar;
        d2.l lVar;
        int y10 = dVar.y(this.O);
        int y11 = dVar.y(this.P);
        int y12 = dVar.y(this.Q);
        int y13 = dVar.y(this.R);
        if (z10 && (lVar = this.f4498e) != null) {
            d2.f fVar = lVar.f14331h;
            if (fVar.f14287j) {
                d2.f fVar2 = lVar.f14332i;
                if (fVar2.f14287j) {
                    y10 = fVar.f14284g;
                    y12 = fVar2.f14284g;
                }
            }
        }
        if (z10 && (nVar = this.f4500f) != null) {
            d2.f fVar3 = nVar.f14331h;
            if (fVar3.f14287j) {
                d2.f fVar4 = nVar.f14332i;
                if (fVar4.f14287j) {
                    y11 = fVar3.f14284g;
                    y13 = fVar4.f14284g;
                }
            }
        }
        int i10 = y13 - y11;
        if (y12 - y10 < 0 || i10 < 0 || y10 == Integer.MIN_VALUE || y10 == Integer.MAX_VALUE || y11 == Integer.MIN_VALUE || y11 == Integer.MAX_VALUE || y12 == Integer.MIN_VALUE || y12 == Integer.MAX_VALUE || y13 == Integer.MIN_VALUE || y13 == Integer.MAX_VALUE) {
            y10 = 0;
            y13 = 0;
            y11 = 0;
            y12 = 0;
        }
        K0(y10, y11, y12, y13);
    }

    public Object s() {
        return this.f4523q0;
    }

    public boolean s0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String t() {
        return this.f4531u0;
    }

    public void t0() {
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.f4492a0 = null;
        this.I = Float.NaN;
        this.f4493b0 = 0;
        this.f4495c0 = 0;
        this.f4497d0 = 0.0f;
        this.f4499e0 = -1;
        this.f4501f0 = 0;
        this.f4503g0 = 0;
        this.f4509j0 = 0;
        this.f4511k0 = 0;
        this.f4513l0 = 0;
        this.f4515m0 = 0;
        this.f4517n0 = 0;
        float f10 = K0;
        this.f4519o0 = f10;
        this.f4521p0 = f10;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f4523q0 = null;
        this.f4525r0 = 0;
        this.f4527s0 = 0;
        this.f4533v0 = null;
        this.f4535w0 = false;
        this.f4537x0 = false;
        this.f4541z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4528t = -1;
        this.f4530u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f4534w = 0;
        this.f4536x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f4540z = 0;
        this.C = 0;
        this.f4504h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f4539y0 = false;
        boolean[] zArr = this.f4502g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4506i = true;
        int[] iArr2 = this.f4538y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f4512l = -1;
        this.f4514m = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f4533v0 != null) {
            str = "type: " + this.f4533v0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f4531u0 != null) {
            str2 = "id: " + this.f4531u0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f4501f0);
        sb2.append(", ");
        sb2.append(this.f4503g0);
        sb2.append(") - (");
        sb2.append(this.f4493b0);
        sb2.append(" x ");
        sb2.append(this.f4495c0);
        sb2.append(")");
        return sb2.toString();
    }

    public b u(int i10) {
        if (i10 == 0) {
            return A();
        }
        if (i10 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e K = K();
        if (K != null && (K instanceof f) && ((f) K()).N1()) {
            return;
        }
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X.get(i10).q();
        }
    }

    public float v() {
        return this.f4497d0;
    }

    public void v0() {
        this.f4520p = false;
        this.f4522q = false;
        this.f4524r = false;
        this.f4526s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X.get(i10).r();
        }
    }

    public int w() {
        return this.f4499e0;
    }

    public void w0(z1.c cVar) {
        this.O.s(cVar);
        this.P.s(cVar);
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.V.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
    }

    public int x() {
        if (this.f4527s0 == 8) {
            return 0;
        }
        return this.f4495c0;
    }

    public final void x0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public float y() {
        return this.f4519o0;
    }

    public final void y0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public int z() {
        return this.f4541z0;
    }

    public final void z0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }
}
