package pp;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lpp/i0;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f28911a = new i0("Camera", 0);
    public static final i0 b = new i0("RecordAudio", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f28912c = new i0("RoughLocation", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final i0 f28913d = new i0("PreciseLocation", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i0[] f28914e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f28915f;

    static {
        i0[] a10 = a();
        f28914e = a10;
        f28915f = pt.b.a(a10);
    }

    public i0(String str, int i10) {
    }

    public static final /* synthetic */ i0[] a() {
        return new i0[]{f28911a, b, f28912c, f28913d};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f28914e.clone();
    }
}
