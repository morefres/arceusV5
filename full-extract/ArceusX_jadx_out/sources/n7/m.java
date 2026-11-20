package n7;

import f7.h0;

/* loaded from: classes3.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25895a;
    public final m7.b b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.b f25896c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.n f25897d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25898e;

    public m(String str, m7.b bVar, m7.b bVar2, m7.n nVar, boolean z10) {
        this.f25895a = str;
        this.b = bVar;
        this.f25896c = bVar2;
        this.f25897d = nVar;
        this.f25898e = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.p(h0Var, bVar, this);
    }

    public m7.b b() {
        return this.b;
    }

    public String c() {
        return this.f25895a;
    }

    public m7.b d() {
        return this.f25896c;
    }

    public m7.n e() {
        return this.f25897d;
    }

    public boolean f() {
        return this.f25898e;
    }
}
