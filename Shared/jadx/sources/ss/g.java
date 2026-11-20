package ss;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final ts.c f31648a;
    public final ws.a b;

    /* renamed from: c, reason: collision with root package name */
    public final ys.a f31649c;

    /* renamed from: d, reason: collision with root package name */
    public final c f31650d;

    /* renamed from: e, reason: collision with root package name */
    public final xs.a f31651e;

    /* renamed from: f, reason: collision with root package name */
    public final ws.d f31652f;

    /* renamed from: g, reason: collision with root package name */
    public final k f31653g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public ts.c f31654a;
        public ws.a b;

        /* renamed from: c, reason: collision with root package name */
        public ys.a f31655c;

        /* renamed from: d, reason: collision with root package name */
        public c f31656d;

        /* renamed from: e, reason: collision with root package name */
        public xs.a f31657e;

        /* renamed from: f, reason: collision with root package name */
        public ws.d f31658f;

        /* renamed from: g, reason: collision with root package name */
        public k f31659g;

        @NonNull
        public g h(@NonNull ts.c cVar, @NonNull k kVar) {
            this.f31654a = cVar;
            this.f31659g = kVar;
            if (this.b == null) {
                this.b = ws.a.a();
            }
            if (this.f31655c == null) {
                this.f31655c = new ys.b();
            }
            if (this.f31656d == null) {
                this.f31656d = new d();
            }
            if (this.f31657e == null) {
                this.f31657e = xs.a.a();
            }
            if (this.f31658f == null) {
                this.f31658f = new ws.e();
            }
            return new g(this);
        }
    }

    @NonNull
    public xs.a a() {
        return this.f31651e;
    }

    @NonNull
    public c b() {
        return this.f31650d;
    }

    @NonNull
    public k c() {
        return this.f31653g;
    }

    @NonNull
    public ys.a d() {
        return this.f31649c;
    }

    @NonNull
    public ts.c e() {
        return this.f31648a;
    }

    public g(@NonNull a aVar) {
        this.f31648a = aVar.f31654a;
        this.b = aVar.b;
        this.f31649c = aVar.f31655c;
        this.f31650d = aVar.f31656d;
        this.f31651e = aVar.f31657e;
        this.f31652f = aVar.f31658f;
        this.f31653g = aVar.f31659g;
    }
}
