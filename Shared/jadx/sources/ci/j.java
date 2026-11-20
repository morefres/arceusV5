package ci;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public a f4949a;

    /* renamed from: e, reason: collision with root package name */
    public int f4952e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4954g;
    public String b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f4950c = null;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f4951d = null;

    /* renamed from: f, reason: collision with root package name */
    public long f4953f = 0;

    /* renamed from: h, reason: collision with root package name */
    public String f4955h = "";

    public enum a {
        GET,
        POST
    }

    public String a() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f4952e;
    }

    public void c(String str) {
        this.f4955h = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.f4950c;
    }

    public String toString() {
        return "HTTP Response for URL: " + this.f4950c + "\nRequest Type: " + this.f4949a + "\nResponse Body: " + this.b + "\nResponse Code: " + this.f4952e;
    }
}
