package n7;

import f7.h0;

/* loaded from: classes3.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25927a;
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.b f25928c;

    /* renamed from: d, reason: collision with root package name */
    public final m7.b f25929d;

    /* renamed from: e, reason: collision with root package name */
    public final m7.b f25930e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25931f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, m7.b bVar, m7.b bVar2, m7.b bVar3, boolean z10) {
        this.f25927a = str;
        this.b = aVar;
        this.f25928c = bVar;
        this.f25929d = bVar2;
        this.f25930e = bVar3;
        this.f25931f = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.u(bVar, this);
    }

    public m7.b b() {
        return this.f25929d;
    }

    public String c() {
        return this.f25927a;
    }

    public m7.b d() {
        return this.f25930e;
    }

    public m7.b e() {
        return this.f25928c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f25931f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f25928c + ", end: " + this.f25929d + ", offset: " + this.f25930e + "}";
    }
}
