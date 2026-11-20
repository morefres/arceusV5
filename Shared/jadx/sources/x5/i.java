package x5;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lx5/i;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f35280a = new i("REPLACE", 0);
    public static final i b = new i("KEEP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final i f35281c = new i("UPDATE", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final i f35282d = new i("CANCEL_AND_REENQUEUE", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i[] f35283e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f35284f;

    static {
        i[] a10 = a();
        f35283e = a10;
        f35284f = pt.b.a(a10);
    }

    public i(String str, int i10) {
    }

    public static final /* synthetic */ i[] a() {
        return new i[]{f35280a, b, f35281c, f35282d};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f35283e.clone();
    }
}
