package m6;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lm6/f;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f24337a = new f("MEMORY_CACHE", 0);
    public static final f b = new f("MEMORY", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final f f24338c = new f("DISK", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final f f24339d = new f("NETWORK", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f[] f24340e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f24341f;

    static {
        f[] a10 = a();
        f24340e = a10;
        f24341f = pt.b.a(a10);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{f24337a, b, f24338c, f24339d};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f24340e.clone();
    }
}
