package tl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rl.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ltl/c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", d.f30696a, "e", "f", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {
    public static final c b = new c("SHOW_COMPLETED", 0, "ShowCompleted");

    /* renamed from: c, reason: collision with root package name */
    public static final c f32312c = new c("SHOW_INTERRUPTED", 1, "ShowInterrupted");

    /* renamed from: d, reason: collision with root package name */
    public static final c f32313d = new c("ADS_NOT_READY", 2, "AdsNotReady");

    /* renamed from: e, reason: collision with root package name */
    public static final c f32314e = new c("AD_NOT_READY", 3, "AdNotReady");

    /* renamed from: f, reason: collision with root package name */
    public static final c f32315f = new c("INTERNAL_ERROR", 4, "InternalError");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f32316g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pt.a f32317h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    static {
        c[] a10 = a();
        f32316g = a10;
        f32317h = pt.b.a(a10);
    }

    public c(String str, int i10, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{b, f32312c, f32313d, f32314e, f32315f};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f32316g.clone();
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
