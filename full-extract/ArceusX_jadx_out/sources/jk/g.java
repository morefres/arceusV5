package jk;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ljk/g;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f21859a = new g("Home", 0);
    public static final g b = new g("Lock", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f21860c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pt.a f21861d;

    static {
        g[] a10 = a();
        f21860c = a10;
        f21861d = pt.b.a(a10);
    }

    public g(String str, int i10) {
    }

    public static final /* synthetic */ g[] a() {
        return new g[]{f21859a, b};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f21860c.clone();
    }
}
