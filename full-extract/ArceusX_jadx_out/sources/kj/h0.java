package kj;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkj/h0;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f22695a = new h0("NONE", 0);
    public static final h0 b = new h0("FIREBASE_CLOUD_MESSAGING", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f22696c = new h0("AMAZON_DEVICE_MESSAGING", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f22697d = new h0("TENCENT_PUSH_NOTIFICATION_SERVICE", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h0[] f22698e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f22699f;

    static {
        h0[] a10 = a();
        f22698e = a10;
        f22699f = pt.b.a(a10);
    }

    public h0(String str, int i10) {
    }

    public static final /* synthetic */ h0[] a() {
        return new h0[]{f22695a, b, f22696c, f22697d};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f22698e.clone();
    }
}
