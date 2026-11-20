package xq;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lxq/d;", "", "", "key", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", rl.d.f30696a, "e", "f", "g", "sna_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f36093c = new d("IntegrationError", 0, "integration_error", "Silent Network Authentication implementation is not available. Please ensure sna-impl module is included.");

    /* renamed from: d, reason: collision with root package name */
    public static final d f36094d = new d("InvalidCheckUrlError", 1, "invalid_check_url", "Silent Network Authentication check_url is missing or invalid.");

    /* renamed from: e, reason: collision with root package name */
    public static final d f36095e = new d("ParsingError", 2, "parsing_error", null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    public static final d f36096f = new d("UnknownError", 3, "unknown_error", null, 2, null);

    /* renamed from: g, reason: collision with root package name */
    public static final d f36097g = new d("TimeoutError", 4, "timeout_error", null, 2, null);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ d[] f36098h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pt.a f36099i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String message;

    static {
        d[] a10 = a();
        f36098h = a10;
        f36099i = pt.b.a(a10);
    }

    public d(String str, int i10, String str2, String str3) {
        this.key = str2;
        this.message = str3;
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{f36093c, f36094d, f36095e, f36096f, f36097g};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f36098h.clone();
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public /* synthetic */ d(String str, int i10, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, (i11 & 2) != 0 ? "" : str3);
    }
}
