package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8600a = c(1, 3);
    public static final int b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final int f8601c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f8602d = c(3, 2);

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
        public static final b f8603c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f8604d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f8605e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f8606f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f8607g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f8608h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f8609i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f8610j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f8611k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f8612l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f8613m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f8614n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f8615o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f8616p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f8617q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f8618r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f8619s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f8620t;

        /* renamed from: u, reason: collision with root package name */
        public static final /* synthetic */ b[] f8621u;

        /* renamed from: a, reason: collision with root package name */
        public final c f8622a;
        public final int b;

        public enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.s1$b$b, reason: collision with other inner class name */
        public enum C0134b extends b {
            public C0134b(String str, int i10, c cVar, int i11) {
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
            f8603c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f8604d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f8605e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f8606f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f8607g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f8608h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f8609i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f8610j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f8611k = aVar;
            c cVar3 = c.MESSAGE;
            C0134b c0134b = new C0134b("GROUP", 9, cVar3, 3);
            f8612l = c0134b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f8613m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f8614n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f8615o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f8616p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f8617q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f8618r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f8619s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f8620t = bVar14;
            f8621u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0134b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f8621u.clone();
        }

        public c a() {
            return this.f8622a;
        }

        public b(String str, int i10, c cVar, int i11) {
            this.f8622a = cVar;
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
        BYTE_STRING(h.b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        public final Object f8632a;

        c(Object obj) {
            this.f8632a = obj;
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
