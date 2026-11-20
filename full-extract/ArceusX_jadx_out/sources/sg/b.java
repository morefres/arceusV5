package sg;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lsg/b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    public static final b b = new b("ATTEMPT", 0, "attempt");

    /* renamed from: c, reason: collision with root package name */
    public static final b f31057c = new b("TERMINAL", 1, "terminal");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f31058d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pt.a f31059e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    static {
        b[] a10 = a();
        f31058d = a10;
        f31059e = pt.b.a(a10);
    }

    public b(String str, int i10, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{b, f31057c};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f31058d.clone();
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
