package ch;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public long f4933a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f4934c;

    /* renamed from: d, reason: collision with root package name */
    public String f4935d;

    public a(long j10, String str) {
        this.f4933a = j10;
        this.b = str == null ? "" : str;
        this.f4934c = "";
        this.f4935d = "";
    }

    public String a() {
        return this.f4935d;
    }

    public long b() {
        return this.f4933a;
    }

    public String c() {
        return this.f4934c;
    }

    public String d() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return "User " + b();
    }

    public void e(String str) {
        this.f4935d = str;
    }

    public void f(long j10) {
        this.f4933a = j10;
    }

    public void g(String str) {
        this.f4934c = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(a aVar) {
        if (aVar == this) {
            return;
        }
        if (this.f4933a != aVar.b() && aVar.b() != -1) {
            f(aVar.b());
        }
        if (!this.b.equals(aVar.d()) && !aVar.d().isEmpty()) {
            h(aVar.d());
        }
        if (!this.f4934c.equals(aVar.c()) && !aVar.c().isEmpty()) {
            g(aVar.c());
        }
        if (this.f4935d.equals(aVar.a()) || aVar.a().isEmpty()) {
            return;
        }
        e(aVar.a());
    }
}
