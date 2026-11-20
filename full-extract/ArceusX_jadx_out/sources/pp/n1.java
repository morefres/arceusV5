package pp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpp/i0;", "", "c", "(Lpp/i0;)Ljava/lang/String;", "Lpp/j1;", j6.b.f21518e, "(Lpp/j1;)Ljava/lang/String;", "Lpp/u;", ve.a.f33391e, "(Lpp/i0;)Lpp/u;", "permissions_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28936a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[i0.values().length];
            try {
                iArr[i0.f28911a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i0.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i0.f28912c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i0.f28913d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28936a = iArr;
            int[] iArr2 = new int[j1.values().length];
            try {
                iArr2[j1.f28919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[j1.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[j1.f28920c.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    @NotNull
    public static final u a(@NotNull i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        int i10 = a.f28936a[i0Var.ordinal()];
        if (i10 == 1) {
            return u.f28958a;
        }
        if (i10 == 2) {
            return u.b;
        }
        if (i10 == 3) {
            return u.f28959c;
        }
        if (i10 == 4) {
            return u.f28960d;
        }
        throw new gt.l();
    }

    @NotNull
    public static final String b(@NotNull j1 j1Var) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        int i10 = a.b[j1Var.ordinal()];
        if (i10 == 1) {
            return "granted";
        }
        if (i10 == 2) {
            return "denied";
        }
        if (i10 == 3) {
            return "settings_opened";
        }
        throw new gt.l();
    }

    @NotNull
    public static final String c(@NotNull i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        int i10 = a.f28936a[i0Var.ordinal()];
        if (i10 == 1) {
            return "android.permission.CAMERA";
        }
        if (i10 == 2) {
            return "android.permission.RECORD_AUDIO";
        }
        if (i10 == 3) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        if (i10 == 4) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        throw new gt.l();
    }
}
