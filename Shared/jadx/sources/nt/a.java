package nt;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lnt/a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27362a = new a("COROUTINE_SUSPENDED", 0);
    public static final a b = new a("UNDECIDED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f27363c = new a("RESUMED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f27364d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f27365e;

    static {
        a[] a10 = a();
        f27364d = a10;
        f27365e = pt.b.a(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f27362a, b, f27363c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27364d.clone();
    }
}
