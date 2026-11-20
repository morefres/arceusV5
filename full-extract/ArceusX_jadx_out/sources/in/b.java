package in;

import kotlin.Metadata;
import rl.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lin/b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", d.f30696a, "e", "f", "g", "h", "i", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20971a = new b("FaceNotCentered", 0);
    public static final b b = new b("FaceTooClose", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f20972c = new b("FaceTooFar", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f20973d = new b("MultipleFaces", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final b f20974e = new b("IncompleteFace", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final b f20975f = new b("FaceNotFound", 5);

    /* renamed from: g, reason: collision with root package name */
    public static final b f20976g = new b("IncorrectPose", 6);

    /* renamed from: h, reason: collision with root package name */
    public static final b f20977h = new b("FaceDetectionUnsupported", 7);

    /* renamed from: i, reason: collision with root package name */
    public static final b f20978i = new b("Other", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ b[] f20979j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ pt.a f20980k;

    static {
        b[] a10 = a();
        f20979j = a10;
        f20980k = pt.b.a(a10);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f20971a, b, f20972c, f20973d, f20974e, f20975f, f20976g, f20977h, f20978i};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20979j.clone();
    }
}
