package x6;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lx6/c;", "", "", "readEnabled", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", ve.a.f33391e, "Z", j6.b.f21518e, "()Z", "c", rl.d.f30696a, "e", "f", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f35363c = new c("ENABLED", 0, true, true);

    /* renamed from: d, reason: collision with root package name */
    public static final c f35364d = new c("READ_ONLY", 1, true, false);

    /* renamed from: e, reason: collision with root package name */
    public static final c f35365e = new c("WRITE_ONLY", 2, false, true);

    /* renamed from: f, reason: collision with root package name */
    public static final c f35366f = new c("DISABLED", 3, false, false);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f35367g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pt.a f35368h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean readEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    public final boolean writeEnabled;

    static {
        c[] a10 = a();
        f35367g = a10;
        f35368h = pt.b.a(a10);
    }

    public c(String str, int i10, boolean z10, boolean z11) {
        this.readEnabled = z10;
        this.writeEnabled = z11;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f35363c, f35364d, f35365e, f35366f};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f35367g.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
