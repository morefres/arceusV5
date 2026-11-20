package pp;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lpp/j1;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f28919a = new j1("PermissionGranted", 0);
    public static final j1 b = new j1("PermissionRejected", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f28920c = new j1("SettingsLaunched", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j1[] f28921d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f28922e;

    static {
        j1[] a10 = a();
        f28921d = a10;
        f28922e = pt.b.a(a10);
    }

    public j1(String str, int i10) {
    }

    public static final /* synthetic */ j1[] a() {
        return new j1[]{f28919a, b, f28920c};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f28921d.clone();
    }
}
