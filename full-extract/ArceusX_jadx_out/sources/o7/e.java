package o7;

import java.util.List;
import java.util.Locale;
import m7.j;
import m7.k;
import m7.n;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<n7.c> f27780a;
    public final f7.i b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27781c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27782d;

    /* renamed from: e, reason: collision with root package name */
    public final a f27783e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27784f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27785g;

    /* renamed from: h, reason: collision with root package name */
    public final List<n7.i> f27786h;

    /* renamed from: i, reason: collision with root package name */
    public final n f27787i;

    /* renamed from: j, reason: collision with root package name */
    public final int f27788j;

    /* renamed from: k, reason: collision with root package name */
    public final int f27789k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27790l;

    /* renamed from: m, reason: collision with root package name */
    public final float f27791m;

    /* renamed from: n, reason: collision with root package name */
    public final float f27792n;

    /* renamed from: o, reason: collision with root package name */
    public final float f27793o;

    /* renamed from: p, reason: collision with root package name */
    public final float f27794p;

    /* renamed from: q, reason: collision with root package name */
    public final j f27795q;

    /* renamed from: r, reason: collision with root package name */
    public final k f27796r;

    /* renamed from: s, reason: collision with root package name */
    public final m7.b f27797s;

    /* renamed from: t, reason: collision with root package name */
    public final List<t7.a<Float>> f27798t;

    /* renamed from: u, reason: collision with root package name */
    public final b f27799u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f27800v;

    /* renamed from: w, reason: collision with root package name */
    public final n7.a f27801w;

    /* renamed from: x, reason: collision with root package name */
    public final q7.j f27802x;

    /* renamed from: y, reason: collision with root package name */
    public final n7.h f27803y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<n7.c> list, f7.i iVar, String str, long j10, a aVar, long j11, String str2, List<n7.i> list2, n nVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List<t7.a<Float>> list3, b bVar, m7.b bVar2, boolean z10, n7.a aVar2, q7.j jVar2, n7.h hVar) {
        this.f27780a = list;
        this.b = iVar;
        this.f27781c = str;
        this.f27782d = j10;
        this.f27783e = aVar;
        this.f27784f = j11;
        this.f27785g = str2;
        this.f27786h = list2;
        this.f27787i = nVar;
        this.f27788j = i10;
        this.f27789k = i11;
        this.f27790l = i12;
        this.f27791m = f10;
        this.f27792n = f11;
        this.f27793o = f12;
        this.f27794p = f13;
        this.f27795q = jVar;
        this.f27796r = kVar;
        this.f27798t = list3;
        this.f27799u = bVar;
        this.f27797s = bVar2;
        this.f27800v = z10;
        this.f27801w = aVar2;
        this.f27802x = jVar2;
        this.f27803y = hVar;
    }

    public n7.h a() {
        return this.f27803y;
    }

    public n7.a b() {
        return this.f27801w;
    }

    public f7.i c() {
        return this.b;
    }

    public q7.j d() {
        return this.f27802x;
    }

    public long e() {
        return this.f27782d;
    }

    public List<t7.a<Float>> f() {
        return this.f27798t;
    }

    public a g() {
        return this.f27783e;
    }

    public List<n7.i> h() {
        return this.f27786h;
    }

    public b i() {
        return this.f27799u;
    }

    public String j() {
        return this.f27781c;
    }

    public long k() {
        return this.f27784f;
    }

    public float l() {
        return this.f27794p;
    }

    public float m() {
        return this.f27793o;
    }

    public String n() {
        return this.f27785g;
    }

    public List<n7.c> o() {
        return this.f27780a;
    }

    public int p() {
        return this.f27790l;
    }

    public int q() {
        return this.f27789k;
    }

    public int r() {
        return this.f27788j;
    }

    public float s() {
        return this.f27792n / this.b.e();
    }

    public j t() {
        return this.f27795q;
    }

    public String toString() {
        return z("");
    }

    public k u() {
        return this.f27796r;
    }

    public m7.b v() {
        return this.f27797s;
    }

    public float w() {
        return this.f27791m;
    }

    public n x() {
        return this.f27787i;
    }

    public boolean y() {
        return this.f27800v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e t8 = this.b.t(k());
        if (t8 != null) {
            sb2.append("\t\tParents: ");
            sb2.append(t8.j());
            e t10 = this.b.t(t8.k());
            while (t10 != null) {
                sb2.append("->");
                sb2.append(t10.j());
                t10 = this.b.t(t10.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f27780a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (n7.c cVar : this.f27780a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
