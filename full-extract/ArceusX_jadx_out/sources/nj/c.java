package nj;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rg.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lnj/c;", "", "", "id", "", "nameId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", ve.a.f33391e, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", j6.b.f21518e, "I", "c", "()I", rl.d.f30696a, "e", "f", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f27168c = new c("SOCIAL", 0, "channel_group_social", q0.f30466h1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f27169d = new c("EXPERIENCES", 1, "channel_group_experiences", q0.Z);

    /* renamed from: e, reason: collision with root package name */
    public static final c f27170e = new c("COMMUNITIES", 2, "channel_group_communities", q0.Y);

    /* renamed from: f, reason: collision with root package name */
    public static final c f27171f = new c("PLATFORM_NEWS", 3, "channel_group_platform_news", q0.f30445a0);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f27172g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pt.a f27173h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* renamed from: b, reason: from kotlin metadata */
    public final int nameId;

    static {
        c[] a10 = a();
        f27172g = a10;
        f27173h = pt.b.a(a10);
    }

    public c(String str, int i10, String str2, int i11) {
        this.id = str2;
        this.nameId = i11;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f27168c, f27169d, f27170e, f27171f};
    }

    @NotNull
    public static pt.a<c> b() {
        return f27173h;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f27172g.clone();
    }

    /* renamed from: c, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
