package os;

import kotlin.Metadata;
import rl.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Los/a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", d.f30696a, "e", "f", "g", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28137a = new a("MILLISECOND", 0);
    public static final a b = new a("SECOND", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f28138c = new a("MINUTE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f28139d = new a("HOUR", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f28140e = new a("DAY", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final a f28141f = new a("MONTH", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final a f28142g = new a("YEAR", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a[] f28143h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pt.a f28144i;

    static {
        a[] a10 = a();
        f28143h = a10;
        f28144i = pt.b.a(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f28137a, b, f28138c, f28139d, f28140e, f28141f, f28142g};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28143h.clone();
    }
}
