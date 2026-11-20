package androidx.datastore.preferences.protobuf;

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
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f1942d;

    /* renamed from: e, reason: collision with root package name */
    public static final b0 f1943e;

    /* renamed from: f, reason: collision with root package name */
    public static final b0 f1944f;

    /* renamed from: g, reason: collision with root package name */
    public static final b0 f1945g;

    /* renamed from: h, reason: collision with root package name */
    public static final b0 f1946h;

    /* renamed from: i, reason: collision with root package name */
    public static final b0 f1947i;

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f1948j;

    /* renamed from: k, reason: collision with root package name */
    public static final b0 f1949k;

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f1950l;

    /* renamed from: m, reason: collision with root package name */
    public static final b0 f1951m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ b0[] f1952n;

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f1953a;
    public final Class<?> b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1954c;

    static {
        b0 b0Var = new b0("VOID", 0, Void.class, Void.class, null);
        f1942d = b0Var;
        Class cls = Integer.TYPE;
        b0 b0Var2 = new b0("INT", 1, cls, Integer.class, 0);
        f1943e = b0Var2;
        b0 b0Var3 = new b0("LONG", 2, Long.TYPE, Long.class, 0L);
        f1944f = b0Var3;
        b0 b0Var4 = new b0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f1945g = b0Var4;
        b0 b0Var5 = new b0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f1946h = b0Var5;
        b0 b0Var6 = new b0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f1947i = b0Var6;
        b0 b0Var7 = new b0("STRING", 6, String.class, String.class, "");
        f1948j = b0Var7;
        b0 b0Var8 = new b0("BYTE_STRING", 7, g.class, g.class, g.b);
        f1949k = b0Var8;
        b0 b0Var9 = new b0("ENUM", 8, cls, Integer.class, null);
        f1950l = b0Var9;
        b0 b0Var10 = new b0("MESSAGE", 9, Object.class, Object.class, null);
        f1951m = b0Var10;
        f1952n = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5, b0Var6, b0Var7, b0Var8, b0Var9, b0Var10};
    }

    public b0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f1953a = cls;
        this.b = cls2;
        this.f1954c = obj;
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f1952n.clone();
    }

    public Class<?> a() {
        return this.b;
    }
}
