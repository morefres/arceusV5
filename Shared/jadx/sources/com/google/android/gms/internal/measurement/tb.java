package com.google.android.gms.internal.measurement;

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
public final class tb {
    public static final tb b;

    /* renamed from: c, reason: collision with root package name */
    public static final tb f6855c;

    /* renamed from: d, reason: collision with root package name */
    public static final tb f6856d;

    /* renamed from: e, reason: collision with root package name */
    public static final tb f6857e;

    /* renamed from: f, reason: collision with root package name */
    public static final tb f6858f;

    /* renamed from: g, reason: collision with root package name */
    public static final tb f6859g;

    /* renamed from: h, reason: collision with root package name */
    public static final tb f6860h;

    /* renamed from: i, reason: collision with root package name */
    public static final tb f6861i;

    /* renamed from: j, reason: collision with root package name */
    public static final tb f6862j;

    /* renamed from: k, reason: collision with root package name */
    public static final tb f6863k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ tb[] f6864l;

    /* renamed from: a, reason: collision with root package name */
    public final Class f6865a;

    static {
        tb tbVar = new tb("VOID", 0, Void.class, Void.class, null);
        b = tbVar;
        Class cls = Integer.TYPE;
        tb tbVar2 = new tb("INT", 1, cls, Integer.class, 0);
        f6855c = tbVar2;
        tb tbVar3 = new tb("LONG", 2, Long.TYPE, Long.class, 0L);
        f6856d = tbVar3;
        tb tbVar4 = new tb("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6857e = tbVar4;
        tb tbVar5 = new tb("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6858f = tbVar5;
        tb tbVar6 = new tb("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6859g = tbVar6;
        tb tbVar7 = new tb("STRING", 6, String.class, String.class, "");
        f6860h = tbVar7;
        tb tbVar8 = new tb("BYTE_STRING", 7, ha.class, ha.class, ha.b);
        f6861i = tbVar8;
        tb tbVar9 = new tb("ENUM", 8, cls, Integer.class, null);
        f6862j = tbVar9;
        tb tbVar10 = new tb("MESSAGE", 9, Object.class, Object.class, null);
        f6863k = tbVar10;
        f6864l = new tb[]{tbVar, tbVar2, tbVar3, tbVar4, tbVar5, tbVar6, tbVar7, tbVar8, tbVar9, tbVar10};
    }

    public tb(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f6865a = cls2;
    }

    public static tb[] values() {
        return (tb[]) f6864l.clone();
    }

    public final Class a() {
        return this.f6865a;
    }
}
