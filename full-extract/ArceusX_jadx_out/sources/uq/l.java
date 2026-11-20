package uq;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Luq/l;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f33106a = new l("SLIDE_IN", 0);
    public static final l b = new l("SLIDE_OUT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final l f33107c = new l("NONE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f33108d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f33109e;

    static {
        l[] a10 = a();
        f33108d = a10;
        f33109e = pt.b.a(a10);
    }

    public l(String str, int i10) {
    }

    public static final /* synthetic */ l[] a() {
        return new l[]{f33106a, b, f33107c};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f33108d.clone();
    }
}
