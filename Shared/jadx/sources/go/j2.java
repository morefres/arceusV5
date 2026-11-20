package go;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lgo/j2;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final j2 f18631a = new j2("World", 0);
    public static final j2 b = new j2("Card", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final j2 f18632c = new j2("Flag", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final j2 f18633d = new j2("House", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j2[] f18634e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f18635f;

    static {
        j2[] a10 = a();
        f18634e = a10;
        f18635f = pt.b.a(a10);
    }

    public j2(String str, int i10) {
    }

    public static final /* synthetic */ j2[] a() {
        return new j2[]{f18631a, b, f18632c, f18633d};
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) f18634e.clone();
    }
}
