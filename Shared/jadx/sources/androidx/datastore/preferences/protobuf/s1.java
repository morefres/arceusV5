package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2094a = c(1, 3);
    public static final int b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final int f2095c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f2096d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f2097c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f2098d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f2099e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f2100f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f2101g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f2102h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f2103i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f2104j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f2105k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f2106l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f2107m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f2108n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f2109o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f2110p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f2111q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f2112r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f2113s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f2114t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ b[] f2115u;

        /* renamed from: a, reason: collision with root package name */
        public final c f2116a;
        public final int b;

        public enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.s1$b$b, reason: collision with other inner class name */
        public enum C0030b extends b {
            public C0030b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        public enum c extends b {
            public c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        public enum d extends b {
            public d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f2097c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f2098d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f2099e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f2100f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f2101g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f2102h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f2103i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f2104j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f2105k = aVar;
            c cVar3 = c.MESSAGE;
            C0030b c0030b = new C0030b("GROUP", 9, cVar3, 3);
            f2106l = c0030b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f2107m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f2108n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f2109o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f2110p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f2111q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f2112r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f2113s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f2114t = bVar14;
            f2115u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0030b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2115u.clone();
        }

        public c a() {
            return this.f2116a;
        }

        public int b() {
            return this.b;
        }

        public b(String str, int i10, c cVar, int i11) {
            this.f2116a = cVar;
            this.b = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(g.b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        public final Object f2126a;

        c(Object obj) {
            this.f2126a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    public static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
