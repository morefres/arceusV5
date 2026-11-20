package bp;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lbp/h;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @sm.g(name = "transition")
    public static final h f4328a = new h("Transition", 0);

    @sm.g(name = "transition-back")
    public static final h b = new h("TransitionBack", 1);

    /* renamed from: c, reason: collision with root package name */
    @sm.g(name = "document-files-post")
    public static final h f4329c = new h("DocumentFilesPost", 2);

    /* renamed from: d, reason: collision with root package name */
    @sm.g(name = "document-files-delete")
    public static final h f4330d = new h("DocumentFilesDelete", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f4331e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f4332f;

    static {
        h[] a10 = a();
        f4331e = a10;
        f4332f = pt.b.a(a10);
    }

    public h(String str, int i10) {
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{f4328a, b, f4329c, f4330d};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f4331e.clone();
    }
}
