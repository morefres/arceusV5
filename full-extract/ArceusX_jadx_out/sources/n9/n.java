package n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* loaded from: classes.dex */
public final class n {
    public static n b;

    /* renamed from: c, reason: collision with root package name */
    public static final RootTelemetryConfiguration f25993c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public RootTelemetryConfiguration f25994a;

    @NonNull
    public static synchronized n b() {
        n nVar;
        synchronized (n.class) {
            try {
                if (b == null) {
                    b = new n();
                }
                nVar = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    public RootTelemetryConfiguration a() {
        return this.f25994a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f25994a = f25993c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f25994a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.z3() < rootTelemetryConfiguration.z3()) {
            this.f25994a = rootTelemetryConfiguration;
        }
    }
}
