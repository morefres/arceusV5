package rl;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lrl/g;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", d.f30696a, "e", "f", "g", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f30698a = new g("NOT_INSTALLED", 0);
    public static final g b = new g("NOT_INITIALIZED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final g f30699c = new g("GENERATE_SIGNAL_FAILED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final g f30700d = new g("SERVE_AD_FAILED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final g f30701e = new g("NO_FILL", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final g f30702f = new g("LOAD_FAILED", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final g f30703g = new g("TIMED_OUT", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ g[] f30704h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pt.a f30705i;

    static {
        g[] a10 = a();
        f30704h = a10;
        f30705i = pt.b.a(a10);
    }

    public g(String str, int i10) {
    }

    public static final /* synthetic */ g[] a() {
        return new g[]{f30698a, b, f30699c, f30700d, f30701e, f30702f, f30703g};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f30704h.clone();
    }
}
