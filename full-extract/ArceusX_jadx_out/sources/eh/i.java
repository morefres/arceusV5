package eh;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Leh/i;", "", "Leh/i$a;", Payload.TYPE, "", ve.a.f33391e, "(Leh/i$a;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface i {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Leh/i$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16030a = new a("Optional", 0);
        public static final a b = new a("Required", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f16031c = new a("NewApp", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f16032d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f16033e;

        static {
            a[] a10 = a();
            f16032d = a10;
            f16033e = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f16030a, b, f16031c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f16032d.clone();
        }
    }

    void a(@NotNull a type);
}
