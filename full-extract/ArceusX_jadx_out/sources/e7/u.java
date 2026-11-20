package e7;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\fJ3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Le7/u;", "", "", "tag", "Le7/u$a;", "level", "message", "", "throwable", "", j6.b.f21518e, "(Ljava/lang/String;Le7/u$a;Ljava/lang/String;Ljava/lang/Throwable;)V", ve.a.f33391e, "()Le7/u$a;", "setMinLevel", "(Le7/u$a;)V", "minLevel", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface u {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Le7/u$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15728a = new a("Verbose", 0);
        public static final a b = new a("Debug", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f15729c = new a("Info", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f15730d = new a("Warn", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f15731e = new a("Error", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f15732f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ pt.a f15733g;

        static {
            a[] a10 = a();
            f15732f = a10;
            f15733g = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f15728a, b, f15729c, f15730d, f15731e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f15732f.clone();
        }
    }

    @NotNull
    a a();

    void b(@NotNull String tag, @NotNull a level, @Nullable String message, @Nullable Throwable throwable);
}
