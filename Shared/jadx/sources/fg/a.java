package fg;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    public static final a f17190p = new C0309a().a();

    /* renamed from: a, reason: collision with root package name */
    public final long f17191a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17192c;

    /* renamed from: d, reason: collision with root package name */
    public final c f17193d;

    /* renamed from: e, reason: collision with root package name */
    public final d f17194e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17195f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17196g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17197h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17198i;

    /* renamed from: j, reason: collision with root package name */
    public final String f17199j;

    /* renamed from: k, reason: collision with root package name */
    public final long f17200k;

    /* renamed from: l, reason: collision with root package name */
    public final b f17201l;

    /* renamed from: m, reason: collision with root package name */
    public final String f17202m;

    /* renamed from: n, reason: collision with root package name */
    public final long f17203n;

    /* renamed from: o, reason: collision with root package name */
    public final String f17204o;

    /* renamed from: fg.a$a, reason: collision with other inner class name */
    public static final class C0309a {

        /* renamed from: a, reason: collision with root package name */
        public long f17205a = 0;
        public String b = "";

        /* renamed from: c, reason: collision with root package name */
        public String f17206c = "";

        /* renamed from: d, reason: collision with root package name */
        public c f17207d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        public d f17208e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        public String f17209f = "";

        /* renamed from: g, reason: collision with root package name */
        public String f17210g = "";

        /* renamed from: h, reason: collision with root package name */
        public int f17211h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f17212i = 0;

        /* renamed from: j, reason: collision with root package name */
        public String f17213j = "";

        /* renamed from: k, reason: collision with root package name */
        public long f17214k = 0;

        /* renamed from: l, reason: collision with root package name */
        public b f17215l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        public String f17216m = "";

        /* renamed from: n, reason: collision with root package name */
        public long f17217n = 0;

        /* renamed from: o, reason: collision with root package name */
        public String f17218o = "";

        public a a() {
            return new a(this.f17205a, this.b, this.f17206c, this.f17207d, this.f17208e, this.f17209f, this.f17210g, this.f17211h, this.f17212i, this.f17213j, this.f17214k, this.f17215l, this.f17216m, this.f17217n, this.f17218o);
        }

        public C0309a b(String str) {
            this.f17216m = str;
            return this;
        }

        public C0309a c(String str) {
            this.f17210g = str;
            return this;
        }

        public C0309a d(String str) {
            this.f17218o = str;
            return this;
        }

        public C0309a e(b bVar) {
            this.f17215l = bVar;
            return this;
        }

        public C0309a f(String str) {
            this.f17206c = str;
            return this;
        }

        public C0309a g(String str) {
            this.b = str;
            return this;
        }

        public C0309a h(c cVar) {
            this.f17207d = cVar;
            return this;
        }

        public C0309a i(String str) {
            this.f17209f = str;
            return this;
        }

        public C0309a j(int i10) {
            this.f17211h = i10;
            return this;
        }

        public C0309a k(long j10) {
            this.f17205a = j10;
            return this;
        }

        public C0309a l(d dVar) {
            this.f17208e = dVar;
            return this;
        }

        public C0309a m(String str) {
            this.f17213j = str;
            return this;
        }

        public C0309a n(int i10) {
            this.f17212i = i10;
            return this;
        }
    }

    public enum b implements uf.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f17222a;

        b(int i10) {
            this.f17222a = i10;
        }

        @Override // uf.c
        public int getNumber() {
            return this.f17222a;
        }
    }

    public enum c implements uf.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f17227a;

        c(int i10) {
            this.f17227a = i10;
        }

        @Override // uf.c
        public int getNumber() {
            return this.f17227a;
        }
    }

    public enum d implements uf.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f17232a;

        d(int i10) {
            this.f17232a = i10;
        }

        @Override // uf.c
        public int getNumber() {
            return this.f17232a;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f17191a = j10;
        this.b = str;
        this.f17192c = str2;
        this.f17193d = cVar;
        this.f17194e = dVar;
        this.f17195f = str3;
        this.f17196g = str4;
        this.f17197h = i10;
        this.f17198i = i11;
        this.f17199j = str5;
        this.f17200k = j11;
        this.f17201l = bVar;
        this.f17202m = str6;
        this.f17203n = j12;
        this.f17204o = str7;
    }

    public static C0309a p() {
        return new C0309a();
    }

    @uf.d(tag = 13)
    public String a() {
        return this.f17202m;
    }

    @uf.d(tag = 11)
    public long b() {
        return this.f17200k;
    }

    @uf.d(tag = 14)
    public long c() {
        return this.f17203n;
    }

    @uf.d(tag = 7)
    public String d() {
        return this.f17196g;
    }

    @uf.d(tag = 15)
    public String e() {
        return this.f17204o;
    }

    @uf.d(tag = 12)
    public b f() {
        return this.f17201l;
    }

    @uf.d(tag = 3)
    public String g() {
        return this.f17192c;
    }

    @uf.d(tag = 2)
    public String h() {
        return this.b;
    }

    @uf.d(tag = 4)
    public c i() {
        return this.f17193d;
    }

    @uf.d(tag = 6)
    public String j() {
        return this.f17195f;
    }

    @uf.d(tag = 8)
    public int k() {
        return this.f17197h;
    }

    @uf.d(tag = 1)
    public long l() {
        return this.f17191a;
    }

    @uf.d(tag = 5)
    public d m() {
        return this.f17194e;
    }

    @uf.d(tag = 10)
    public String n() {
        return this.f17199j;
    }

    @uf.d(tag = 9)
    public int o() {
        return this.f17198i;
    }
}
