package nj;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rg.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0011\u0010\fj\u0002\b\u000bj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lnj/a;", "", "", "nameId", "", "id", "importance", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", ve.a.f33391e, "I", rl.d.f30696a, "()I", j6.b.f21518e, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "c", "e", "f", "g", "h", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f27134d = new a("URGENT", 0, q0.f30493q1, "channel_urgent", 4);

    /* renamed from: e, reason: collision with root package name */
    public static final a f27135e = new a("DEFAULT", 1, q0.f30472j1, "channel_default", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f27136f = new a("LOW", 2, q0.f30481m1, "channel_medium", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final a f27137g = new a("MINIMUM", 3, q0.f30484n1, "channel_minimum", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final a f27138h = new a("GENERAL", 4, q0.f30478l1, "channel_general", 3);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f27139i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pt.a f27140j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int nameId;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int importance;

    static {
        a[] a10 = a();
        f27139i = a10;
        f27140j = pt.b.a(a10);
    }

    public a(String str, int i10, int i11, String str2, int i12) {
        this.nameId = i11;
        this.id = str2;
        this.importance = i12;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f27134d, f27135e, f27136f, f27137g, f27138h};
    }

    @NotNull
    public static pt.a<a> b() {
        return f27140j;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27139i.clone();
    }

    /* renamed from: c, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* renamed from: d, reason: from getter */
    public final int getNameId() {
        return this.nameId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
