package ni;

import android.util.Log;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm.c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u001b\u0010$\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u001b\u0010'\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001b\u0010*\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001b\u0010-\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b,\u0010\u001aR\u001b\u0010/\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b.\u0010\u001a¨\u00060"}, d2 = {"Lni/v;", "", "<init>", "()V", "", "name", "", "B", "(Ljava/lang/String;)V", "", "error", "y", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "A", "z", "(Ljava/lang/Throwable;)V", "outcome", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;", "backend", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "i", "(Ljava/lang/String;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;)Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", zl.t.f38095d, j6.b.f21518e, "Lgt/h;", "r", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "successCounter", "c", "s", "successEvent", rl.d.f30696a, "l", "failureCounter", "e", "m", "failureEvent", "f", "p", "recoverySuccessCounter", "g", "q", "recoverySuccessEvent", "h", "n", "recoveryFailureCounter", "o", "recoveryFailureEvent", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f27126a = new v();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h successCounter = gt.i.b(new Function0() { // from class: ni.n
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig C;
            C = v.C();
            return C;
        }
    });

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h successEvent = gt.i.b(new Function0() { // from class: ni.o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig D;
            D = v.D();
            return D;
        }
    });

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h failureCounter = gt.i.b(new Function0() { // from class: ni.p
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig j10;
            j10 = v.j();
            return j10;
        }
    });

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h failureEvent = gt.i.b(new Function0() { // from class: ni.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig k10;
            k10 = v.k();
            return k10;
        }
    });

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h recoverySuccessCounter = gt.i.b(new Function0() { // from class: ni.r
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig w5;
            w5 = v.w();
            return w5;
        }
    });

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h recoverySuccessEvent = gt.i.b(new Function0() { // from class: ni.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig x10;
            x10 = v.x();
            return x10;
        }
    });

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h recoveryFailureCounter = gt.i.b(new Function0() { // from class: ni.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig u8;
            u8 = v.u();
            return u8;
        }
    });

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h recoveryFailureEvent = gt.i.b(new Function0() { // from class: ni.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig v5;
            v5 = v.v();
            return v5;
        }
    });

    public static final TelemetryConfig C() {
        return f27126a.i("SuccessCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig D() {
        return f27126a.i("Success", TelemetryBackend.EVENT_INGEST);
    }

    public static final TelemetryConfig j() {
        return f27126a.i("FailureCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig k() {
        return f27126a.i("Failure", TelemetryBackend.EVENT_INGEST);
    }

    public static final TelemetryConfig u() {
        return f27126a.t("FailureCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig v() {
        return f27126a.t("Failure", TelemetryBackend.EVENT_INGEST);
    }

    public static final TelemetryConfig w() {
        return f27126a.t("SuccessCounter", TelemetryBackend.COUNTER);
    }

    public static final TelemetryConfig x() {
        return f27126a.t("Success", TelemetryBackend.EVENT_INGEST);
    }

    public final void A() {
        qm.c.f(p(), 0.0d, 2, null);
        TelemetryConfig q10 = q();
        c.b bVar = new c.b();
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.h(q10, bVar.l());
    }

    public final void B(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        qm.c.f(r(), 0.0d, 2, null);
        TelemetryConfig s8 = s();
        c.b bVar = new c.b();
        bVar.c("iconName", name);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.h(s8, bVar.l());
    }

    public final TelemetryConfig i(String outcome, TelemetryBackend backend) {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeAppIconSet" + outcome + "Android", p0.c(backend));
        aVar.b(2026, 10, 6);
        aVar.a("App icon request outcome; iconName is the logical name (empty for default).");
        return aVar.d();
    }

    public final TelemetryConfig l() {
        return (TelemetryConfig) failureCounter.getValue();
    }

    public final TelemetryConfig m() {
        return (TelemetryConfig) failureEvent.getValue();
    }

    public final TelemetryConfig n() {
        return (TelemetryConfig) recoveryFailureCounter.getValue();
    }

    public final TelemetryConfig o() {
        return (TelemetryConfig) recoveryFailureEvent.getValue();
    }

    public final TelemetryConfig p() {
        return (TelemetryConfig) recoverySuccessCounter.getValue();
    }

    public final TelemetryConfig q() {
        return (TelemetryConfig) recoverySuccessEvent.getValue();
    }

    public final TelemetryConfig r() {
        return (TelemetryConfig) successCounter.getValue();
    }

    public final TelemetryConfig s() {
        return (TelemetryConfig) successEvent.getValue();
    }

    public final TelemetryConfig t(String outcome, TelemetryBackend backend) {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeAppIconRecovery" + outcome + "Android", p0.c(backend));
        aVar.b(2026, 10, 8);
        aVar.a("Outcome of restoring the default launcher alias when no alias is enabled.");
        return aVar.d();
    }

    public final void y(@NotNull String name, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w("LauncherIconManager", "App icon '" + name + "' failed", error);
        qm.c.f(l(), 0.0d, 2, null);
        TelemetryConfig m10 = m();
        c.b bVar = new c.b();
        bVar.c("iconName", name);
        String name2 = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        bVar.c("errorClass", name2);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.c("errorMessage", message);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.h(m10, bVar.l());
    }

    public final void z(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w("LauncherIconManager", "Could not restore launcher entry", error);
        qm.c.f(n(), 0.0d, 2, null);
        TelemetryConfig o8 = o();
        c.b bVar = new c.b();
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar.c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.c("errorMessage", message);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.h(o8, bVar.l());
    }
}
