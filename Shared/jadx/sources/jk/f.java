package jk;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ljk/f;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21853a = new f("Update", 0);
    public static final f b = new f("Remove", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final f f21854c = new f("SizeChange", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final f f21855d = new f("Enable", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final f f21856e = new f("Disable", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f21857f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pt.a f21858g;

    static {
        f[] a10 = a();
        f21857f = a10;
        f21858g = pt.b.a(a10);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{f21853a, b, f21854c, f21855d, f21856e};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f21857f.clone();
    }
}
