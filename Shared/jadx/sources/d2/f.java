package d2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public p f14281d;

    /* renamed from: f, reason: collision with root package name */
    public int f14283f;

    /* renamed from: g, reason: collision with root package name */
    public int f14284g;

    /* renamed from: a, reason: collision with root package name */
    public d f14279a = null;
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14280c = false;

    /* renamed from: e, reason: collision with root package name */
    public a f14282e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    public int f14285h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f14286i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14287j = false;

    /* renamed from: k, reason: collision with root package name */
    public List<d> f14288k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public List<f> f14289l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f14281d = pVar;
    }

    @Override // d2.d
    public void a(d dVar) {
        Iterator<f> it = this.f14289l.iterator();
        while (it.hasNext()) {
            if (!it.next().f14287j) {
                return;
            }
        }
        this.f14280c = true;
        d dVar2 = this.f14279a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.b) {
            this.f14281d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f14289l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f14287j) {
            g gVar = this.f14286i;
            if (gVar != null) {
                if (!gVar.f14287j) {
                    return;
                } else {
                    this.f14283f = this.f14285h * gVar.f14284g;
                }
            }
            d(fVar.f14284g + this.f14283f);
        }
        d dVar3 = this.f14279a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f14288k.add(dVar);
        if (this.f14287j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f14289l.clear();
        this.f14288k.clear();
        this.f14287j = false;
        this.f14284g = 0;
        this.f14280c = false;
        this.b = false;
    }

    public void d(int i10) {
        if (this.f14287j) {
            return;
        }
        this.f14287j = true;
        this.f14284g = i10;
        for (d dVar : this.f14288k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14281d.b.t());
        sb2.append(":");
        sb2.append(this.f14282e);
        sb2.append("(");
        sb2.append(this.f14287j ? Integer.valueOf(this.f14284g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f14289l.size());
        sb2.append(":d=");
        sb2.append(this.f14288k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
