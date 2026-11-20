package x5;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lx5/x;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "f", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f35347a = new x("NOT_REQUIRED", 0);
    public static final x b = new x("CONNECTED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final x f35348c = new x("UNMETERED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final x f35349d = new x("NOT_ROAMING", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final x f35350e = new x("METERED", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final x f35351f = new x("TEMPORARILY_UNMETERED", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ x[] f35352g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pt.a f35353h;

    static {
        x[] a10 = a();
        f35352g = a10;
        f35353h = pt.b.a(a10);
    }

    public x(String str, int i10) {
    }

    public static final /* synthetic */ x[] a() {
        return new x[]{f35347a, b, f35348c, f35349d, f35350e, f35351f};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f35352g.clone();
    }
}
