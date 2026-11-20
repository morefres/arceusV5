package oj;

import com.google.gson.annotations.SerializedName;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import kotlin.Metadata;
import rl.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Loj/c;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", d.f30696a, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("square")
    public static final c f27919a = new c("SQUARE", 0);

    @SerializedName("rectangle")
    public static final c b = new c("RECTANGLE", 1);

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("circle")
    public static final c f27920c = new c("CIRCLE", 2);

    /* renamed from: d, reason: collision with root package name */
    @SerializedName(PayloadNotificationChannel.SOUND_NONE)
    public static final c f27921d = new c("NONE", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f27922e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pt.a f27923f;

    static {
        c[] a10 = a();
        f27922e = a10;
        f27923f = pt.b.a(a10);
    }

    public c(String str, int i10) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f27919a, b, f27920c, f27921d};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f27922e.clone();
    }
}
