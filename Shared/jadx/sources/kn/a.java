package kn;

import j6.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkn/a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, b.f21518e, "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22871a = new a("Stream", 0);
    public static final a b = new a("Upload", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f22872c = new a("None", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f22873d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f22874e;

    static {
        a[] a10 = a();
        f22873d = a10;
        f22874e = pt.b.a(a10);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f22871a, b, f22872c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f22873d.clone();
    }
}
