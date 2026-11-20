package xo;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lxo/a0;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f35796a = new a0("Background", 0);
    public static final a0 b = new a0("Blocking", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a0[] f35797c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pt.a f35798d;

    static {
        a0[] a10 = a();
        f35797c = a10;
        f35798d = pt.b.a(a10);
    }

    public a0(String str, int i10) {
    }

    public static final /* synthetic */ a0[] a() {
        return new a0[]{f35796a, b};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f35797c.clone();
    }
}
