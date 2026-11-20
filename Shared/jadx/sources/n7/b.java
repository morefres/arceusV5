package n7;

import android.graphics.PointF;
import f7.h0;

/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25818a;
    public final m7.o<PointF, PointF> b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.f f25819c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25820d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25821e;

    public b(String str, m7.o<PointF, PointF> oVar, m7.f fVar, boolean z10, boolean z11) {
        this.f25818a = str;
        this.b = oVar;
        this.f25819c = fVar;
        this.f25820d = z10;
        this.f25821e = z11;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.f(h0Var, bVar, this);
    }

    public String b() {
        return this.f25818a;
    }

    public m7.o<PointF, PointF> c() {
        return this.b;
    }

    public m7.f d() {
        return this.f25819c;
    }

    public boolean e() {
        return this.f25821e;
    }

    public boolean f() {
        return this.f25820d;
    }
}
