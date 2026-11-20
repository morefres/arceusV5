package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/text/m;", "Lkotlin/text/d;", "", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", ve.a.f33391e, "I", "getValue", "()I", j6.b.f21518e, "getMask", "c", rl.d.f30696a, "e", "f", "g", "h", "i", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final m f23076c = new m("IGNORE_CASE", 0, 2, 0, 2, null);

    /* renamed from: d, reason: collision with root package name */
    public static final m f23077d = new m("MULTILINE", 1, 8, 0, 2, null);

    /* renamed from: e, reason: collision with root package name */
    public static final m f23078e = new m("LITERAL", 2, 16, 0, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public static final m f23079f = new m("UNIX_LINES", 3, 1, 0, 2, null);

    /* renamed from: g, reason: collision with root package name */
    public static final m f23080g = new m("COMMENTS", 4, 4, 0, 2, null);

    /* renamed from: h, reason: collision with root package name */
    public static final m f23081h = new m("DOT_MATCHES_ALL", 5, 32, 0, 2, null);

    /* renamed from: i, reason: collision with root package name */
    public static final m f23082i = new m("CANON_EQ", 6, 128, 0, 2, null);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ m[] f23083j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ pt.a f23084k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int value;

    /* renamed from: b, reason: from kotlin metadata */
    public final int mask;

    static {
        m[] a10 = a();
        f23083j = a10;
        f23084k = pt.b.a(a10);
    }

    public m(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    public static final /* synthetic */ m[] a() {
        return new m[]{f23076c, f23077d, f23078e, f23079f, f23080g, f23081h, f23082i};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f23083j.clone();
    }

    @Override // kotlin.text.d
    public int getValue() {
        return this.value;
    }

    public /* synthetic */ m(String str, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
