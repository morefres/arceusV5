package os;

import gt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Los/b;", "", "<init>", "()V", "", "isoDate", "Los/a;", "precision", "Lkotlin/time/c;", ve.a.f33391e, "(Ljava/lang/String;Los/a;)Lkotlin/time/c;", j6.b.f21518e, "(Los/a;)Ljava/lang/String;", "", "c", "(Los/a;)I", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: os.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0496b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28146a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f28137a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f28138c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f28139d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f28140e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f28141f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f28142g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f28146a = iArr;
        }
    }

    @NotNull
    public final kotlin.time.c a(@NotNull String isoDate, @NotNull a precision) {
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        Intrinsics.checkNotNullParameter(precision, "precision");
        c.Companion companion = kotlin.time.c.INSTANCE;
        String substring = isoDate.substring(0, c(precision));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return companion.e(substring + b(precision));
    }

    public final String b(a precision) {
        switch (C0496b.f28146a[precision.ordinal()]) {
            case 1:
                return "";
            case 2:
                return ".001Z";
            case 3:
                return ":00.001Z";
            case 4:
                return ":00:00.001Z";
            case 5:
                return "T00:00:00.001Z";
            case 6:
                return "-01T00:00:00.001Z";
            case 7:
                return "-01-01T00:00:00.001Z";
            default:
                throw new l();
        }
    }

    public final int c(a precision) {
        switch (C0496b.f28146a[precision.ordinal()]) {
            case 1:
                return 24;
            case 2:
                return 19;
            case 3:
                return 16;
            case 4:
                return 13;
            case 5:
                return 10;
            case 6:
                return 7;
            case 7:
                return 4;
            default:
                throw new l();
        }
    }
}
