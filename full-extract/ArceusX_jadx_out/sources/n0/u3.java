package n0;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Ln0/u3;", "", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "", ve.a.f33391e, "J", j6.b.f21518e, "()J", "value", "c", rl.d.f30696a, "e", "f", "g", "h", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u3 {
    public static final u3 b = new u3("DEFAULT", 0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final u3 f25583c = new u3("PREVIEW", 1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final u3 f25584d = new u3("VIDEO_RECORD", 2, 3);

    /* renamed from: e, reason: collision with root package name */
    public static final u3 f25585e = new u3("STILL_CAPTURE", 3, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final u3 f25586f = new u3("VIDEO_CALL", 4, 5);

    /* renamed from: g, reason: collision with root package name */
    public static final u3 f25587g = new u3("PREVIEW_VIDEO_STILL", 5, 4);

    /* renamed from: h, reason: collision with root package name */
    public static final u3 f25588h = new u3("CROPPED_RAW", 6, 6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ u3[] f25589i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pt.a f25590j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long value;

    static {
        u3[] a10 = a();
        f25589i = a10;
        f25590j = pt.b.a(a10);
    }

    public u3(String str, int i10, int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ u3[] a() {
        return new u3[]{b, f25583c, f25584d, f25585e, f25586f, f25587g, f25588h};
    }

    public static u3 valueOf(String str) {
        return (u3) Enum.valueOf(u3.class, str);
    }

    public static u3[] values() {
        return (u3[]) f25589i.clone();
    }

    /* renamed from: b, reason: from getter */
    public final long getValue() {
        return this.value;
    }
}
