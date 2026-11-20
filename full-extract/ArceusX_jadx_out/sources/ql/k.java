package ql;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lql/k;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f29889a = new k("INITIALIZE_FAILED", 0);
    public static final k b = new k("ALREADY_INITIALIZED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final k f29890c = new k("SUCCESS", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f29891d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f29892e;

    static {
        k[] a10 = a();
        f29891d = a10;
        f29892e = pt.b.a(a10);
    }

    public k(String str, int i10) {
    }

    public static final /* synthetic */ k[] a() {
        return new k[]{f29889a, b, f29890c};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f29891d.clone();
    }
}
