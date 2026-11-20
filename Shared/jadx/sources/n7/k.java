package n7;

import android.graphics.PointF;
import f7.h0;

/* loaded from: classes3.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25878a;
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.b f25879c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.o<PointF, PointF> f25880d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.b f25881e;

    /* renamed from: f, reason: collision with root package name */
    public final m7.b f25882f;

    /* renamed from: g, reason: collision with root package name */
    public final m7.b f25883g;

    /* renamed from: h, reason: collision with root package name */
    public final m7.b f25884h;

    /* renamed from: i, reason: collision with root package name */
    public final m7.b f25885i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25886j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f25887k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f25890a;

        a(int i10) {
            this.f25890a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f25890a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, m7.b bVar, m7.o<PointF, PointF> oVar, m7.b bVar2, m7.b bVar3, m7.b bVar4, m7.b bVar5, m7.b bVar6, boolean z10, boolean z11) {
        this.f25878a = str;
        this.b = aVar;
        this.f25879c = bVar;
        this.f25880d = oVar;
        this.f25881e = bVar2;
        this.f25882f = bVar3;
        this.f25883g = bVar4;
        this.f25884h = bVar5;
        this.f25885i = bVar6;
        this.f25886j = z10;
        this.f25887k = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.n(h0Var, bVar, this);
    }

    public m7.b b() {
        return this.f25882f;
    }

    public m7.b c() {
        return this.f25884h;
    }

    public String d() {
        return this.f25878a;
    }

    public m7.b e() {
        return this.f25883g;
    }

    public m7.b f() {
        return this.f25885i;
    }

    public m7.b g() {
        return this.f25879c;
    }

    public m7.o<PointF, PointF> h() {
        return this.f25880d;
    }

    public m7.b i() {
        return this.f25881e;
    }

    public a j() {
        return this.b;
    }

    public boolean k() {
        return this.f25886j;
    }

    public boolean l() {
        return this.f25887k;
    }
}
