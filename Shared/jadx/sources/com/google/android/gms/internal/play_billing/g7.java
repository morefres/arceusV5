package com.google.android.gms.internal.play_billing;

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
public final class g7 {

    /* renamed from: c, reason: collision with root package name */
    public static final g7 f7115c;

    /* renamed from: d, reason: collision with root package name */
    public static final g7 f7116d;

    /* renamed from: e, reason: collision with root package name */
    public static final g7 f7117e;

    /* renamed from: f, reason: collision with root package name */
    public static final g7 f7118f;

    /* renamed from: g, reason: collision with root package name */
    public static final g7 f7119g;

    /* renamed from: h, reason: collision with root package name */
    public static final g7 f7120h;

    /* renamed from: i, reason: collision with root package name */
    public static final g7 f7121i;

    /* renamed from: j, reason: collision with root package name */
    public static final g7 f7122j;

    /* renamed from: k, reason: collision with root package name */
    public static final g7 f7123k;

    /* renamed from: l, reason: collision with root package name */
    public static final g7 f7124l;

    /* renamed from: m, reason: collision with root package name */
    public static final g7 f7125m;

    /* renamed from: n, reason: collision with root package name */
    public static final g7 f7126n;

    /* renamed from: o, reason: collision with root package name */
    public static final g7 f7127o;

    /* renamed from: p, reason: collision with root package name */
    public static final g7 f7128p;

    /* renamed from: q, reason: collision with root package name */
    public static final g7 f7129q;

    /* renamed from: r, reason: collision with root package name */
    public static final g7 f7130r;

    /* renamed from: s, reason: collision with root package name */
    public static final g7 f7131s;

    /* renamed from: t, reason: collision with root package name */
    public static final g7 f7132t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ g7[] f7133u;

    /* renamed from: a, reason: collision with root package name */
    public final h7 f7134a;
    public final int b;

    static {
        g7 g7Var = new g7("DOUBLE", 0, h7.DOUBLE, 1);
        f7115c = g7Var;
        g7 g7Var2 = new g7("FLOAT", 1, h7.FLOAT, 5);
        f7116d = g7Var2;
        h7 h7Var = h7.LONG;
        g7 g7Var3 = new g7("INT64", 2, h7Var, 0);
        f7117e = g7Var3;
        g7 g7Var4 = new g7("UINT64", 3, h7Var, 0);
        f7118f = g7Var4;
        h7 h7Var2 = h7.INT;
        g7 g7Var5 = new g7("INT32", 4, h7Var2, 0);
        f7119g = g7Var5;
        g7 g7Var6 = new g7("FIXED64", 5, h7Var, 1);
        f7120h = g7Var6;
        g7 g7Var7 = new g7("FIXED32", 6, h7Var2, 5);
        f7121i = g7Var7;
        g7 g7Var8 = new g7("BOOL", 7, h7.BOOLEAN, 0);
        f7122j = g7Var8;
        g7 g7Var9 = new g7("STRING", 8, h7.STRING, 2);
        f7123k = g7Var9;
        h7 h7Var3 = h7.MESSAGE;
        g7 g7Var10 = new g7("GROUP", 9, h7Var3, 3);
        f7124l = g7Var10;
        g7 g7Var11 = new g7("MESSAGE", 10, h7Var3, 2);
        f7125m = g7Var11;
        g7 g7Var12 = new g7("BYTES", 11, h7.BYTE_STRING, 2);
        f7126n = g7Var12;
        g7 g7Var13 = new g7("UINT32", 12, h7Var2, 0);
        f7127o = g7Var13;
        g7 g7Var14 = new g7("ENUM", 13, h7.ENUM, 0);
        f7128p = g7Var14;
        g7 g7Var15 = new g7("SFIXED32", 14, h7Var2, 5);
        f7129q = g7Var15;
        g7 g7Var16 = new g7("SFIXED64", 15, h7Var, 1);
        f7130r = g7Var16;
        g7 g7Var17 = new g7("SINT32", 16, h7Var2, 0);
        f7131s = g7Var17;
        g7 g7Var18 = new g7("SINT64", 17, h7Var, 0);
        f7132t = g7Var18;
        f7133u = new g7[]{g7Var, g7Var2, g7Var3, g7Var4, g7Var5, g7Var6, g7Var7, g7Var8, g7Var9, g7Var10, g7Var11, g7Var12, g7Var13, g7Var14, g7Var15, g7Var16, g7Var17, g7Var18};
    }

    public g7(String str, int i10, h7 h7Var, int i11) {
        this.f7134a = h7Var;
        this.b = i11;
    }

    public static g7[] values() {
        return (g7[]) f7133u.clone();
    }

    public final h7 a() {
        return this.f7134a;
    }
}
