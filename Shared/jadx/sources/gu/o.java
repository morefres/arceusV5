package gu;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lgu/o;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f18862a = new o("PUBLIC", 0);
    public static final o b = new o("PROTECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final o f18863c = new o("INTERNAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final o f18864d = new o("PRIVATE", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ o[] f18865e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f18866f;

    static {
        o[] a10 = a();
        f18865e = a10;
        f18866f = pt.b.a(a10);
    }

    public o(String str, int i10) {
    }

    public static final /* synthetic */ o[] a() {
        return new o[]{f18862a, b, f18863c, f18864d};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f18865e.clone();
    }
}
