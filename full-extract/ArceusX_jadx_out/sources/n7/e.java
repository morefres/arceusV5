package n7;

import android.graphics.Path;
import f7.h0;

/* loaded from: classes3.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final g f25823a;
    public final Path.FillType b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.c f25824c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.d f25825d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.f f25826e;

    /* renamed from: f, reason: collision with root package name */
    public final m7.f f25827f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25828g;

    /* renamed from: h, reason: collision with root package name */
    public final m7.b f25829h;

    /* renamed from: i, reason: collision with root package name */
    public final m7.b f25830i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25831j;

    public e(String str, g gVar, Path.FillType fillType, m7.c cVar, m7.d dVar, m7.f fVar, m7.f fVar2, m7.b bVar, m7.b bVar2, boolean z10) {
        this.f25823a = gVar;
        this.b = fillType;
        this.f25824c = cVar;
        this.f25825d = dVar;
        this.f25826e = fVar;
        this.f25827f = fVar2;
        this.f25828g = str;
        this.f25829h = bVar;
        this.f25830i = bVar2;
        this.f25831j = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.h(h0Var, iVar, bVar, this);
    }

    public m7.f b() {
        return this.f25827f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public m7.c d() {
        return this.f25824c;
    }

    public g e() {
        return this.f25823a;
    }

    public String f() {
        return this.f25828g;
    }

    public m7.d g() {
        return this.f25825d;
    }

    public m7.f h() {
        return this.f25826e;
    }

    public boolean i() {
        return this.f25831j;
    }
}
