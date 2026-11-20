package f7;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public Map<String, List<o7.e>> f16950c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, k0> f16951d;

    /* renamed from: e, reason: collision with root package name */
    public float f16952e;

    /* renamed from: f, reason: collision with root package name */
    public Map<String, l7.c> f16953f;

    /* renamed from: g, reason: collision with root package name */
    public List<l7.h> f16954g;

    /* renamed from: h, reason: collision with root package name */
    public w1.k<l7.d> f16955h;

    /* renamed from: i, reason: collision with root package name */
    public w1.g<o7.e> f16956i;

    /* renamed from: j, reason: collision with root package name */
    public List<o7.e> f16957j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f16958k;

    /* renamed from: l, reason: collision with root package name */
    public float f16959l;

    /* renamed from: m, reason: collision with root package name */
    public float f16960m;

    /* renamed from: n, reason: collision with root package name */
    public float f16961n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16962o;

    /* renamed from: q, reason: collision with root package name */
    public int f16964q;

    /* renamed from: r, reason: collision with root package name */
    public int f16965r;

    /* renamed from: a, reason: collision with root package name */
    public final u0 f16949a = new u0();
    public final HashSet<String> b = new HashSet<>();

    /* renamed from: p, reason: collision with root package name */
    public int f16963p = 0;

    public void a(String str) {
        s7.e.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.f16958k;
    }

    public w1.k<l7.d> c() {
        return this.f16955h;
    }

    public float d() {
        return (long) ((e() / this.f16961n) * 1000.0f);
    }

    public float e() {
        return this.f16960m - this.f16959l;
    }

    public float f() {
        return this.f16960m;
    }

    public Map<String, l7.c> g() {
        return this.f16953f;
    }

    public float h(float f10) {
        return s7.j.i(this.f16959l, this.f16960m, f10);
    }

    public float i() {
        return this.f16961n;
    }

    public Map<String, k0> j() {
        float e10 = s7.m.e();
        if (e10 != this.f16952e) {
            for (Map.Entry<String, k0> entry : this.f16951d.entrySet()) {
                this.f16951d.put(entry.getKey(), entry.getValue().a(this.f16952e / e10));
            }
        }
        this.f16952e = e10;
        return this.f16951d;
    }

    public List<o7.e> k() {
        return this.f16957j;
    }

    public l7.h l(String str) {
        int size = this.f16954g.size();
        for (int i10 = 0; i10 < size; i10++) {
            l7.h hVar = this.f16954g.get(i10);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f16963p;
    }

    public u0 n() {
        return this.f16949a;
    }

    public List<o7.e> o(String str) {
        return this.f16950c.get(str);
    }

    public float p() {
        return this.f16959l;
    }

    public boolean q() {
        return this.f16962o;
    }

    public void r(int i10) {
        this.f16963p += i10;
    }

    public void s(Rect rect, float f10, float f11, float f12, List<o7.e> list, w1.g<o7.e> gVar, Map<String, List<o7.e>> map, Map<String, k0> map2, float f13, w1.k<l7.d> kVar, Map<String, l7.c> map3, List<l7.h> list2, int i10, int i11) {
        this.f16958k = rect;
        this.f16959l = f10;
        this.f16960m = f11;
        this.f16961n = f12;
        this.f16957j = list;
        this.f16956i = gVar;
        this.f16950c = map;
        this.f16951d = map2;
        this.f16952e = f13;
        this.f16955h = kVar;
        this.f16953f = map3;
        this.f16954g = list2;
        this.f16964q = i10;
        this.f16965r = i11;
    }

    public o7.e t(long j10) {
        return this.f16956i.e(j10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LottieComposition:\n");
        Iterator<o7.e> it = this.f16957j.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().z("\t"));
        }
        return sb2.toString();
    }

    public void u(boolean z10) {
        this.f16962o = z10;
    }

    public void v(boolean z10) {
        this.f16949a.b(z10);
    }
}
