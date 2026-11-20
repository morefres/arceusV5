package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class g5 {
    public static final g5 b;

    /* renamed from: c, reason: collision with root package name */
    public static final g5 f7101c;

    /* renamed from: d, reason: collision with root package name */
    public static final g5 f7102d;

    /* renamed from: e, reason: collision with root package name */
    public static final g5 f7103e;

    /* renamed from: f, reason: collision with root package name */
    public static final g5 f7104f;

    /* renamed from: g, reason: collision with root package name */
    public static final g5 f7105g;

    /* renamed from: h, reason: collision with root package name */
    public static final g5 f7106h;

    /* renamed from: i, reason: collision with root package name */
    public static final g5 f7107i;

    /* renamed from: j, reason: collision with root package name */
    public static final g5 f7108j;

    /* renamed from: k, reason: collision with root package name */
    public static final g5 f7109k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ g5[] f7110l;

    /* renamed from: a, reason: collision with root package name */
    public final Class f7111a;

    static {
        g5 g5Var = new g5("VOID", 0, Void.class, Void.class, null);
        b = g5Var;
        Class cls = Integer.TYPE;
        g5 g5Var2 = new g5("INT", 1, cls, Integer.class, 0);
        f7101c = g5Var2;
        g5 g5Var3 = new g5("LONG", 2, Long.TYPE, Long.class, 0L);
        f7102d = g5Var3;
        g5 g5Var4 = new g5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7103e = g5Var4;
        g5 g5Var5 = new g5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f7104f = g5Var5;
        g5 g5Var6 = new g5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7105g = g5Var6;
        g5 g5Var7 = new g5("STRING", 6, String.class, String.class, "");
        f7106h = g5Var7;
        g5 g5Var8 = new g5("BYTE_STRING", 7, s3.class, s3.class, s3.b);
        f7107i = g5Var8;
        g5 g5Var9 = new g5("ENUM", 8, cls, Integer.class, null);
        f7108j = g5Var9;
        g5 g5Var10 = new g5("MESSAGE", 9, Object.class, Object.class, null);
        f7109k = g5Var10;
        f7110l = new g5[]{g5Var, g5Var2, g5Var3, g5Var4, g5Var5, g5Var6, g5Var7, g5Var8, g5Var9, g5Var10};
    }

    public g5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f7111a = cls2;
    }

    public static g5[] values() {
        return (g5[]) f7110l.clone();
    }

    public final Class a() {
        return this.f7111a;
    }
}
