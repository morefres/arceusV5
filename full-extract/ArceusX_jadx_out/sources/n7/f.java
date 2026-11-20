package n7;

import f7.h0;
import java.util.List;
import n7.s;

/* loaded from: classes3.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25832a;
    public final g b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.c f25833c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.d f25834d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.f f25835e;

    /* renamed from: f, reason: collision with root package name */
    public final m7.f f25836f;

    /* renamed from: g, reason: collision with root package name */
    public final m7.b f25837g;

    /* renamed from: h, reason: collision with root package name */
    public final s.a f25838h;

    /* renamed from: i, reason: collision with root package name */
    public final s.b f25839i;

    /* renamed from: j, reason: collision with root package name */
    public final float f25840j;

    /* renamed from: k, reason: collision with root package name */
    public final List<m7.b> f25841k;

    /* renamed from: l, reason: collision with root package name */
    public final m7.b f25842l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f25843m;

    public f(String str, g gVar, m7.c cVar, m7.d dVar, m7.f fVar, m7.f fVar2, m7.b bVar, s.a aVar, s.b bVar2, float f10, List<m7.b> list, m7.b bVar3, boolean z10) {
        this.f25832a = str;
        this.b = gVar;
        this.f25833c = cVar;
        this.f25834d = dVar;
        this.f25835e = fVar;
        this.f25836f = fVar2;
        this.f25837g = bVar;
        this.f25838h = aVar;
        this.f25839i = bVar2;
        this.f25840j = f10;
        this.f25841k = list;
        this.f25842l = bVar3;
        this.f25843m = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.i(h0Var, bVar, this);
    }

    public s.a b() {
        return this.f25838h;
    }

    public m7.b c() {
        return this.f25842l;
    }

    public m7.f d() {
        return this.f25836f;
    }

    public m7.c e() {
        return this.f25833c;
    }

    public g f() {
        return this.b;
    }

    public s.b g() {
        return this.f25839i;
    }

    public List<m7.b> h() {
        return this.f25841k;
    }

    public float i() {
        return this.f25840j;
    }

    public String j() {
        return this.f25832a;
    }

    public m7.d k() {
        return this.f25834d;
    }

    public m7.f l() {
        return this.f25835e;
    }

    public m7.b m() {
        return this.f25837g;
    }

    public boolean n() {
        return this.f25843m;
    }
}
