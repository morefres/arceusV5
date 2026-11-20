package up;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0010\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0015\u0010\fR\"\u0010\u0018\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0017\u0010\f¨\u0006\u0019"}, d2 = {"Lup/c;", "", "<init>", "()V", "", "g", "", ve.a.f33391e, "Z", rl.d.f30696a, "()Z", "e", "(Z)V", "isSandboxModeEnabled", "Lup/c$b;", "value", j6.b.f21518e, "Lup/c$b;", "()Lup/c$b;", "debugForcedStatus", "c", "f", "simulateGovIdNfc", "setSimulateJpMyNumberNfc", "simulateJpMyNumberNfc", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isSandboxModeEnabled;

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public b debugForcedStatus = b.b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean simulateGovIdNfc = true;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean simulateJpMyNumberNfc = true;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lup/c$a;", "", "<init>", "()V", "Lup/c$b;", "", ve.a.f33391e, "(Lup/c$b;)Ljava/lang/String;", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: up.c$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* renamed from: up.c$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0602a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f33061a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.f33062a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f33061a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            int i10 = C0602a.f33061a[bVar.ordinal()];
            if (i10 == 1) {
                return "failed";
            }
            if (i10 == 2) {
                return "passed";
            }
            throw new gt.l();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lup/c$b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33062a = new b("Failed", 0);
        public static final b b = new b("Passed", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f33063c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ pt.a f33064d;

        static {
            b[] a10 = a();
            f33063c = a10;
            f33064d = pt.b.a(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f33062a, b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33063c.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: up.c$c, reason: collision with other inner class name */
    public static final /* synthetic */ class C0603c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33065a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f33062a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33065a = iArr;
        }
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final b getDebugForcedStatus() {
        return this.debugForcedStatus;
    }

    public final boolean b() {
        return this.isSandboxModeEnabled && this.simulateGovIdNfc;
    }

    public final boolean c() {
        return this.isSandboxModeEnabled && this.simulateJpMyNumberNfc;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsSandboxModeEnabled() {
        return this.isSandboxModeEnabled;
    }

    public final void e(boolean z10) {
        this.isSandboxModeEnabled = z10;
    }

    public final void f(boolean z10) {
        this.simulateGovIdNfc = z10;
    }

    public final void g() {
        b bVar;
        int i10 = C0603c.f33065a[this.debugForcedStatus.ordinal()];
        if (i10 == 1) {
            bVar = b.b;
        } else {
            if (i10 != 2) {
                throw new gt.l();
            }
            bVar = b.f33062a;
        }
        this.debugForcedStatus = bVar;
    }
}
