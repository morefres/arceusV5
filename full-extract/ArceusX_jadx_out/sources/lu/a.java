package lu;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Llu/a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23848a = new a("SUSPEND", 0);
    public static final a b = new a("DROP_OLDEST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f23849c = new a("DROP_LATEST", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f23850d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f23851e;

    static {
        a[] a10 = a();
        f23850d = a10;
        f23851e = pt.b.a(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f23848a, b, f23849c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f23850d.clone();
    }
}
