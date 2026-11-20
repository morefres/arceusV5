package com.google.android.gms.internal.measurement;

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
public final class wd {

    /* renamed from: c, reason: collision with root package name */
    public static final wd f6920c;

    /* renamed from: d, reason: collision with root package name */
    public static final wd f6921d;

    /* renamed from: e, reason: collision with root package name */
    public static final wd f6922e;

    /* renamed from: f, reason: collision with root package name */
    public static final wd f6923f;

    /* renamed from: g, reason: collision with root package name */
    public static final wd f6924g;

    /* renamed from: h, reason: collision with root package name */
    public static final wd f6925h;

    /* renamed from: i, reason: collision with root package name */
    public static final wd f6926i;

    /* renamed from: j, reason: collision with root package name */
    public static final wd f6927j;

    /* renamed from: k, reason: collision with root package name */
    public static final wd f6928k;

    /* renamed from: l, reason: collision with root package name */
    public static final wd f6929l;

    /* renamed from: m, reason: collision with root package name */
    public static final wd f6930m;

    /* renamed from: n, reason: collision with root package name */
    public static final wd f6931n;

    /* renamed from: o, reason: collision with root package name */
    public static final wd f6932o;

    /* renamed from: p, reason: collision with root package name */
    public static final wd f6933p;

    /* renamed from: q, reason: collision with root package name */
    public static final wd f6934q;

    /* renamed from: r, reason: collision with root package name */
    public static final wd f6935r;

    /* renamed from: s, reason: collision with root package name */
    public static final wd f6936s;

    /* renamed from: t, reason: collision with root package name */
    public static final wd f6937t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ wd[] f6938u;

    /* renamed from: a, reason: collision with root package name */
    public final xd f6939a;
    public final int b;

    static {
        wd wdVar = new wd("DOUBLE", 0, xd.DOUBLE, 1);
        f6920c = wdVar;
        wd wdVar2 = new wd("FLOAT", 1, xd.FLOAT, 5);
        f6921d = wdVar2;
        xd xdVar = xd.LONG;
        wd wdVar3 = new wd("INT64", 2, xdVar, 0);
        f6922e = wdVar3;
        wd wdVar4 = new wd("UINT64", 3, xdVar, 0);
        f6923f = wdVar4;
        xd xdVar2 = xd.INT;
        wd wdVar5 = new wd("INT32", 4, xdVar2, 0);
        f6924g = wdVar5;
        wd wdVar6 = new wd("FIXED64", 5, xdVar, 1);
        f6925h = wdVar6;
        wd wdVar7 = new wd("FIXED32", 6, xdVar2, 5);
        f6926i = wdVar7;
        wd wdVar8 = new wd("BOOL", 7, xd.BOOLEAN, 0);
        f6927j = wdVar8;
        wd wdVar9 = new wd("STRING", 8, xd.STRING, 2);
        f6928k = wdVar9;
        xd xdVar3 = xd.MESSAGE;
        wd wdVar10 = new wd("GROUP", 9, xdVar3, 3);
        f6929l = wdVar10;
        wd wdVar11 = new wd("MESSAGE", 10, xdVar3, 2);
        f6930m = wdVar11;
        wd wdVar12 = new wd("BYTES", 11, xd.BYTE_STRING, 2);
        f6931n = wdVar12;
        wd wdVar13 = new wd("UINT32", 12, xdVar2, 0);
        f6932o = wdVar13;
        wd wdVar14 = new wd("ENUM", 13, xd.ENUM, 0);
        f6933p = wdVar14;
        wd wdVar15 = new wd("SFIXED32", 14, xdVar2, 5);
        f6934q = wdVar15;
        wd wdVar16 = new wd("SFIXED64", 15, xdVar, 1);
        f6935r = wdVar16;
        wd wdVar17 = new wd("SINT32", 16, xdVar2, 0);
        f6936s = wdVar17;
        wd wdVar18 = new wd("SINT64", 17, xdVar, 0);
        f6937t = wdVar18;
        f6938u = new wd[]{wdVar, wdVar2, wdVar3, wdVar4, wdVar5, wdVar6, wdVar7, wdVar8, wdVar9, wdVar10, wdVar11, wdVar12, wdVar13, wdVar14, wdVar15, wdVar16, wdVar17, wdVar18};
    }

    public wd(String str, int i10, xd xdVar, int i11) {
        this.f6939a = xdVar;
        this.b = i11;
    }

    public static wd[] values() {
        return (wd[]) f6938u.clone();
    }

    public final xd a() {
        return this.f6939a;
    }

    public final int b() {
        return this.b;
    }
}
