package xo;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lxo/h;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f35843a = new h("PRODUCTION", 0);
    public static final h b = new h("SANDBOX", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f35844c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pt.a f35845d;

    static {
        h[] a10 = a();
        f35844c = a10;
        f35845d = pt.b.a(a10);
    }

    public h(String str, int i10) {
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{f35843a, b};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f35844c.clone();
    }
}
