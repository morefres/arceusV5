package n7;

import f7.h0;

/* loaded from: classes3.dex */
public class r implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25909a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.h f25910c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25911d;

    public r(String str, int i10, m7.h hVar, boolean z10) {
        this.f25909a = str;
        this.b = i10;
        this.f25910c = hVar;
        this.f25911d = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.r(h0Var, bVar, this);
    }

    public String b() {
        return this.f25909a;
    }

    public m7.h c() {
        return this.f25910c;
    }

    public boolean d() {
        return this.f25911d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f25909a + ", index=" + this.b + '}';
    }
}
