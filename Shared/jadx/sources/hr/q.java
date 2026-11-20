package hr;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lhr/q;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f19719a = new q("BASE", 0);
    public static final q b = new q("ACTIVE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final q f19720c = new q("DISABLED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ q[] f19721d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f19722e;

    static {
        q[] a10 = a();
        f19721d = a10;
        f19722e = pt.b.a(a10);
    }

    public q(String str, int i10) {
    }

    public static final /* synthetic */ q[] a() {
        return new q[]{f19719a, b, f19720c};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f19721d.clone();
    }
}
