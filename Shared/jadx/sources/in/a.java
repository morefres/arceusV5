package in;

import kotlin.Metadata;
import rl.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lin/a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", d.f30696a, "e", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20965a = new a("Center", 0);
    public static final a b = new a("Left", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f20966c = new a("Right", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f20967d = new a("Up", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f20968e = new a("Down", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f20969f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pt.a f20970g;

    static {
        a[] a10 = a();
        f20969f = a10;
        f20970g = pt.b.a(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f20965a, b, f20966c, f20967d, f20968e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20969f.clone();
    }
}
