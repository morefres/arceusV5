package k0;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lk0/b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22176a = new b("DYNAMIC_RANGE", 0);
    public static final b b = new b("FPS_RANGE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f22177c = new b("VIDEO_STABILIZATION", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f22178d = new b("IMAGE_FORMAT", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f22179e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f22180f;

    static {
        b[] a10 = a();
        f22179e = a10;
        f22180f = pt.b.a(a10);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f22176a, b, f22177c, f22178d};
    }

    @NotNull
    public static pt.a<b> b() {
        return f22180f;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f22179e.clone();
    }
}
