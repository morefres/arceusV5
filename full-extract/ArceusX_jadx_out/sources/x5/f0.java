package x5;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx5/f0;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f35273a = new f0("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    public static final f0 b = new f0("DROP_WORK_REQUEST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f0[] f35274c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pt.a f35275d;

    static {
        f0[] a10 = a();
        f35274c = a10;
        f35275d = pt.b.a(a10);
    }

    public f0(String str, int i10) {
    }

    public static final /* synthetic */ f0[] a() {
        return new f0[]{f35273a, b};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f35274c.clone();
    }
}
