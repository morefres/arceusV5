package wp;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lwp/x;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f34766a = new x("Center", 0);
    public static final x b = new x("Left", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final x f34767c = new x("Right", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final x f34768d = new x("Up", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final x f34769e = new x("Down", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ x[] f34770f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pt.a f34771g;

    static {
        x[] a10 = a();
        f34770f = a10;
        f34771g = pt.b.a(a10);
    }

    public x(String str, int i10) {
    }

    public static final /* synthetic */ x[] a() {
        return new x[]{f34766a, b, f34767c, f34768d, f34769e};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f34770f.clone();
    }
}
