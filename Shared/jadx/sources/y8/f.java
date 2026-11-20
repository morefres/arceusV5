package y8;

@Deprecated
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f36541a;
    public String b;

    public f() {
        this.f36541a = Boolean.FALSE;
    }

    public final f a(String str) {
        this.b = str;
        return this;
    }

    public f(g gVar) {
        boolean z10;
        String str;
        this.f36541a = Boolean.FALSE;
        g.b(gVar);
        z10 = gVar.b;
        this.f36541a = Boolean.valueOf(z10);
        str = gVar.f36544c;
        this.b = str;
    }
}
