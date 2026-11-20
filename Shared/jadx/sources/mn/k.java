package mn;

import on.s;

/* loaded from: classes3.dex */
public class k implements qn.f {

    /* renamed from: a, reason: collision with root package name */
    public final a f24642a;
    public final s b;

    /* renamed from: c, reason: collision with root package name */
    public final qn.h f24643c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24644d = false;

    public enum a {
        WRAP,
        REPLACE
    }

    public k(a aVar, s sVar, qn.h hVar) {
        this.f24642a = aVar;
        this.b = sVar;
        this.f24643c = hVar;
    }

    @Override // qn.f
    public qn.f c() {
        this.f24644d = true;
        return this;
    }

    public s d() {
        return this.b;
    }

    public qn.h e() {
        return this.f24643c;
    }

    public a f() {
        return this.f24642a;
    }

    public boolean g() {
        return this.f24644d;
    }
}
