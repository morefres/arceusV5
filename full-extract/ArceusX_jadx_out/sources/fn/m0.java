package fn;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lfn/m0;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f17385a = new m0("FRONT", 0);
    public static final m0 b = new m0("BACK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f17386c = new m0("EXTERNAL", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ m0[] f17387d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f17388e;

    static {
        m0[] a10 = a();
        f17387d = a10;
        f17388e = pt.b.a(a10);
    }

    public m0(String str, int i10) {
    }

    public static final /* synthetic */ m0[] a() {
        return new m0[]{f17385a, b, f17386c};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f17387d.clone();
    }
}
