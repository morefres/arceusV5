package o1;

import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import g0.r1;
import m1.o1;
import n0.a4;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f27530a;
    public final a4 b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraUseInconsistentTimebaseQuirk f27531c;

    /* renamed from: d, reason: collision with root package name */
    public long f27532d = -1;

    /* renamed from: e, reason: collision with root package name */
    public a4 f27533e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27534a;

        static {
            int[] iArr = new int[a4.values().length];
            f27534a = iArr;
            try {
                iArr[a4.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27534a[a4.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(o1 o1Var, a4 a4Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f27530a = o1Var;
        this.b = a4Var;
        this.f27531c = cameraUseInconsistentTimebaseQuirk;
    }

    public final long a() {
        long j10 = Long.MAX_VALUE;
        long j11 = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            long b = this.f27530a.b();
            long a10 = this.f27530a.a();
            long b10 = this.f27530a.b();
            long j12 = b10 - b;
            if (i10 == 0 || j12 < j10) {
                j11 = a10 - ((b + b10) >> 1);
                j10 = j12;
            }
        }
        return Math.max(0L, j11);
    }

    public long b(long j10) {
        if (this.f27533e == null) {
            this.f27533e = e(j10);
        }
        int i10 = a.f27534a[this.f27533e.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return j10;
            }
            throw new AssertionError("Unknown timebase: " + this.f27533e);
        }
        if (this.f27532d == -1) {
            this.f27532d = a();
            r1.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f27532d);
        }
        return j10 - this.f27532d;
    }

    public final boolean c() {
        return this.f27530a.a() - this.f27530a.b() > 3000000;
    }

    public final boolean d(long j10) {
        return Math.abs(j10 - this.f27530a.a()) < Math.abs(j10 - this.f27530a.b());
    }

    public final a4 e(long j10) {
        boolean z10;
        String str;
        String str2;
        if (this.f27531c != null) {
            r1.l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z10 = false;
        } else {
            if (!c()) {
                return this.b;
            }
            z10 = true;
        }
        a4 a4Var = d(j10) ? a4.REALTIME : a4.UPTIME;
        if (!z10 || a4Var == this.b) {
            r1.a("VideoTimebaseConverter", "Detect input timebase = " + a4Var);
            return a4Var;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", SOC: ");
            str2 = Build.SOC_MODEL;
            sb2.append(str2);
            str = sb2.toString();
        } else {
            str = "";
        }
        r1.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i10), str, this.b, a4Var));
        return a4Var;
    }
}
