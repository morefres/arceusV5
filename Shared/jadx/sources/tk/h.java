package tk;

import iv.e;
import okhttp3.OkHttpClient;
import xk.j;
import xk.k;
import xk.l;
import xk.m;
import xk.n;

/* loaded from: classes2.dex */
public class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public k f32277a;
    public xk.d b;

    /* renamed from: c, reason: collision with root package name */
    public xk.e f32278c;

    /* renamed from: d, reason: collision with root package name */
    public xk.h f32279d;

    /* renamed from: e, reason: collision with root package name */
    public j f32280e;

    /* renamed from: f, reason: collision with root package name */
    public xk.i f32281f;

    /* renamed from: g, reason: collision with root package name */
    public xk.g f32282g;

    /* renamed from: h, reason: collision with root package name */
    public xk.f f32283h;

    /* renamed from: i, reason: collision with root package name */
    public n f32284i;

    /* renamed from: j, reason: collision with root package name */
    public xk.b f32285j;

    /* renamed from: k, reason: collision with root package name */
    public xk.c f32286k;

    /* renamed from: l, reason: collision with root package name */
    public xk.a f32287l;

    /* renamed from: m, reason: collision with root package name */
    public m f32288m;

    /* renamed from: n, reason: collision with root package name */
    public OkHttpClient f32289n;

    /* renamed from: o, reason: collision with root package name */
    public e.a f32290o;

    public h(OkHttpClient okHttpClient, e.a aVar) {
        this.f32289n = okHttpClient;
        this.f32290o = aVar;
    }

    @Override // tk.d
    public xk.h a() {
        xk.h hVar = this.f32279d;
        if (hVar != null) {
            return hVar;
        }
        throw new RuntimeException("Metrics interface not initialized");
    }

    @Override // tk.d
    public xk.f b() {
        xk.f fVar = this.f32283h;
        if (fVar != null) {
            return fVar;
        }
        throw new RuntimeException("Friends interface not initialized");
    }

    @Override // tk.d
    public k c() {
        k kVar = this.f32277a;
        if (kVar != null) {
            return kVar;
        }
        throw new RuntimeException("PlatformChat interface not initialized");
    }

    @Override // tk.d
    public m d() {
        m mVar = this.f32288m;
        if (mVar != null) {
            return mVar;
        }
        throw new RuntimeException("Thumbnails interface not initialized");
    }

    @Override // tk.d
    public xk.g e(OkHttpClient okHttpClient) {
        xk.g gVar = (xk.g) new l("locale", g.c().f32268a).f(okHttpClient).e(this.f32290o).a(xk.g.class);
        if (gVar != null) {
            return gVar;
        }
        throw new RuntimeException("Locale interface not initialized");
    }

    @Override // tk.d
    public j f() {
        j jVar = this.f32280e;
        if (jVar != null) {
            return jVar;
        }
        throw new RuntimeException("Notifications interface not initialized");
    }

    @Override // tk.d
    public xk.i g(b bVar) {
        if (this.f32281f == null) {
            this.f32281f = (xk.i) new l("apis", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.i.class);
        }
        return this.f32281f;
    }

    @Override // tk.d
    public xk.b h() {
        xk.b bVar = this.f32285j;
        if (bVar != null) {
            return bVar;
        }
        throw new RuntimeException("AccountSettings interface not initialized");
    }

    public d i(b bVar) {
        if (this.f32277a == null) {
            this.f32277a = (k) new l("apis", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(k.class);
        }
        if (this.b == null) {
            this.b = (xk.d) new l("chat", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.d.class);
        }
        if (this.f32278c == null) {
            this.f32278c = (xk.e) new l("clientsettings.api", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.e.class);
        }
        if (this.f32279d == null) {
            this.f32279d = (xk.h) new l("metrics", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.h.class);
        }
        if (this.f32280e == null) {
            this.f32280e = (j) new l("notifications", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(j.class);
        }
        if (this.f32282g == null) {
            this.f32282g = (xk.g) new l("locale", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.g.class);
        }
        if (this.f32283h == null) {
            this.f32283h = (xk.f) new l("friends", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.f.class);
        }
        if (this.f32284i == null) {
            this.f32284i = (n) new l("translations", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(n.class);
        }
        if (this.f32285j == null) {
            this.f32285j = (xk.b) new l("accountsettings", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.b.class);
        }
        if (this.f32286k == null) {
            this.f32286k = (xk.c) new l("auth", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.c.class);
        }
        if (this.f32287l == null) {
            this.f32287l = (xk.a) new l("accountinformation", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(xk.a.class);
        }
        if (this.f32288m == null) {
            this.f32288m = (m) new l("thumbnails", bVar.f32268a).f(this.f32289n).e(this.f32290o).a(m.class);
        }
        return this;
    }
}
