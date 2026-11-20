package ql;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lql/m;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f29895a = new m("LOCAL", 0);
    public static final m b = new m("REMOTE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ m[] f29896c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pt.a f29897d;

    static {
        m[] a10 = a();
        f29896c = a10;
        f29897d = pt.b.a(a10);
    }

    public m(String str, int i10) {
    }

    public static final /* synthetic */ m[] a() {
        return new m[]{f29895a, b};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f29896c.clone();
    }
}
