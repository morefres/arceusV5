package op;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lop/a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28088a = new a("NotRequested", 0);
    public static final a b = new a("NotSupported", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f28089c = new a("Failed", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f28090d = new a("Success", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f28091e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f28092f;

    static {
        a[] a10 = a();
        f28091e = a10;
        f28092f = pt.b.a(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f28088a, b, f28089c, f28090d};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28091e.clone();
    }
}
