package m7;

import android.graphics.PointF;
import f7.h0;

/* loaded from: classes3.dex */
public class n implements n7.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f24389a;
    public final o<PointF, PointF> b;

    /* renamed from: c, reason: collision with root package name */
    public final g f24390c;

    /* renamed from: d, reason: collision with root package name */
    public final b f24391d;

    /* renamed from: e, reason: collision with root package name */
    public final d f24392e;

    /* renamed from: f, reason: collision with root package name */
    public final b f24393f;

    /* renamed from: g, reason: collision with root package name */
    public final b f24394g;

    /* renamed from: h, reason: collision with root package name */
    public final b f24395h;

    /* renamed from: i, reason: collision with root package name */
    public final b f24396i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24397j;

    public n() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return null;
    }

    public i7.p b() {
        return new i7.p(this);
    }

    public e c() {
        return this.f24389a;
    }

    public b d() {
        return this.f24396i;
    }

    public d e() {
        return this.f24392e;
    }

    public o<PointF, PointF> f() {
        return this.b;
    }

    public b g() {
        return this.f24391d;
    }

    public g h() {
        return this.f24390c;
    }

    public b i() {
        return this.f24393f;
    }

    public b j() {
        return this.f24394g;
    }

    public b k() {
        return this.f24395h;
    }

    public boolean l() {
        return this.f24397j;
    }

    public void m(boolean z10) {
        this.f24397j = z10;
    }

    public n(e eVar, o<PointF, PointF> oVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f24397j = false;
        this.f24389a = eVar;
        this.b = oVar;
        this.f24390c = gVar;
        this.f24391d = bVar;
        this.f24392e = dVar;
        this.f24395h = bVar2;
        this.f24396i = bVar3;
        this.f24393f = bVar4;
        this.f24394g = bVar5;
    }
}
