package pp;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpp/v;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f28964a = new v("Success", 0);
    public static final v b = new v("Failure", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final v f28965c = new v("SettingsLaunched", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ v[] f28966d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f28967e;

    static {
        v[] a10 = a();
        f28966d = a10;
        f28967e = pt.b.a(a10);
    }

    public v(String str, int i10) {
    }

    public static final /* synthetic */ v[] a() {
        return new v[]{f28964a, b, f28965c};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f28966d.clone();
    }
}
