package wn;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lwn/n;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", rl.d.f30696a, "device_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n {
    public static final n b = new n("ON_CALL", 0, "on_call");

    /* renamed from: c, reason: collision with root package name */
    public static final n f34455c = new n("NONE_DETECTED", 1, "none_detected");

    /* renamed from: d, reason: collision with root package name */
    public static final n f34456d = new n("UNAVAILABLE", 2, "unavailable");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n[] f34457e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f34458f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String serializedValue;

    static {
        n[] a10 = a();
        f34457e = a10;
        f34458f = pt.b.a(a10);
    }

    public n(String str, int i10, String str2) {
        this.serializedValue = str2;
    }

    public static final /* synthetic */ n[] a() {
        return new n[]{b, f34455c, f34456d};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f34457e.clone();
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getSerializedValue() {
        return this.serializedValue;
    }
}
