package ni;

import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryData;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qm.c;
import wj.f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\bJ\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0015\u0010\u0010R!\u0010\u001c\u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001aR!\u0010 \u001a\u00020\u00168BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001f\u0010\u0003\u001a\u0004\b\u001e\u0010\u001aR\u001b\u0010#\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001aR\u001b\u0010&\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001b\u0010)\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u001b\u0010,\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR\u001b\u0010/\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001aR\u001b\u00101\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b0\u0010\u001a¨\u00062"}, d2 = {"Lni/l;", "", "<init>", "()V", "", "classicActive", "", zl.t.f38095d, "(Z)V", "Lwj/f$a;", "migration", "v", "(Lwj/f$a;)V", "", "error", "r", "(ZLjava/lang/Throwable;)V", "", "q", "(Z)Ljava/lang/String;", "u", "s", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", j6.b.f21518e, "Lgt/h;", "l", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "getSetSuccessConfig$annotations", "setSuccessConfig", "c", "i", "getSetFailureConfig$annotations", "setFailureConfig", rl.d.f30696a, "m", "setSuccessCounterConfig", "e", "n", "setSuccessEventConfig", "f", "j", "setFailureCounterConfig", "g", "k", "setFailureEventConfig", "h", "o", "shortcutMigrationCounterConfig", "p", "shortcutMigrationEventConfig", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f27108a = new l();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h setSuccessConfig = gt.i.b(new Function0() { // from class: ni.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig z10;
            z10 = l.z();
            return z10;
        }
    });

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h setFailureConfig = gt.i.b(new Function0() { // from class: ni.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig w5;
            w5 = l.w();
            return w5;
        }
    });

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h setSuccessCounterConfig = gt.i.b(new Function0() { // from class: ni.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig A;
            A = l.A();
            return A;
        }
    });

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h setSuccessEventConfig = gt.i.b(new Function0() { // from class: ni.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig B;
            B = l.B();
            return B;
        }
    });

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h setFailureCounterConfig = gt.i.b(new Function0() { // from class: ni.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig x10;
            x10 = l.x();
            return x10;
        }
    });

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h setFailureEventConfig = gt.i.b(new Function0() { // from class: ni.i
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig y10;
            y10 = l.y();
            return y10;
        }
    });

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h shortcutMigrationCounterConfig = gt.i.b(new Function0() { // from class: ni.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig C;
            C = l.C();
            return C;
        }
    });

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h shortcutMigrationEventConfig = gt.i.b(new Function0() { // from class: ni.k
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig D;
            D = l.D();
            return D;
        }
    });

    public static final TelemetryConfig A() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconSetSuccessCounterAndroid", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 9, 4);
        aVar.a("Counter for successful Classic Theme launcher-icon swaps.");
        return aVar.d();
    }

    public static final TelemetryConfig B() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconSetSuccessAndroid", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.b(2026, 9, 4);
        aVar.a("Event for a successful Classic Theme launcher-icon swap (iconName: \"classic\" = swapped to the Classic icon, \"default\" = reverted).");
        return aVar.d();
    }

    public static final TelemetryConfig C() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconShortcutMigrationCounterAndroid", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 9, 18);
        aVar.a("Counter for pinned-shortcut migrations off the launcher aliases, attempted during a Classic Theme launcher-icon swap.");
        return aVar.d();
    }

    public static final TelemetryConfig D() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconShortcutMigrationAndroid", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.b(2026, 9, 18);
        aVar.a("Event for a pinned-shortcut migration off the launcher aliases during a Classic Theme launcher-icon swap (outcome: \"migrated\" or \"failed\", the number of shortcuts involved, and the failure reason). A failure means the icon swap was deferred to protect the shortcuts.");
        return aVar.d();
    }

    public static final TelemetryConfig w() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconSetFailureAndroid", q0.g(TelemetryBackend.COUNTER, TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(rh.h.a().I4()));
        aVar.b(2026, 8, 28);
        aVar.a("A Classic Theme launcher-icon swap failed; the event carries classicActive and the error class/message (the counter carries classicActive only).");
        return aVar.d();
    }

    public static final TelemetryConfig x() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconSetFailureCounterAndroid", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 9, 4);
        aVar.a("Counter for a failed Classic Theme launcher-icon swap.");
        return aVar.d();
    }

    public static final TelemetryConfig y() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconSetFailureAndroid", p0.c(TelemetryBackend.EVENT_INGEST));
        aVar.b(2026, 9, 4);
        aVar.a("Event for a failed Classic Theme launcher-icon swap, with error details.");
        return aVar.d();
    }

    public static final TelemetryConfig z() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("SystemThemeClassicIconSetSuccessAndroid", q0.g(TelemetryBackend.COUNTER, TelemetryBackend.EVENT_INGEST));
        aVar.c(Integer.valueOf(rh.h.a().I4()));
        aVar.b(2026, 8, 28);
        aVar.a("Successful Classic Theme launcher-icon swaps (classicActive: true = swapped to the Classic icon, false = reverted to default).");
        return aVar.d();
    }

    public final TelemetryConfig i() {
        return (TelemetryConfig) setFailureConfig.getValue();
    }

    public final TelemetryConfig j() {
        return (TelemetryConfig) setFailureCounterConfig.getValue();
    }

    public final TelemetryConfig k() {
        return (TelemetryConfig) setFailureEventConfig.getValue();
    }

    public final TelemetryConfig l() {
        return (TelemetryConfig) setSuccessConfig.getValue();
    }

    public final TelemetryConfig m() {
        return (TelemetryConfig) setSuccessCounterConfig.getValue();
    }

    public final TelemetryConfig n() {
        return (TelemetryConfig) setSuccessEventConfig.getValue();
    }

    public final TelemetryConfig o() {
        return (TelemetryConfig) shortcutMigrationCounterConfig.getValue();
    }

    public final TelemetryConfig p() {
        return (TelemetryConfig) shortcutMigrationEventConfig.getValue();
    }

    public final String q(boolean classicActive) {
        return classicActive ? "classic" : "default";
    }

    public final void r(boolean classicActive, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!rh.h.a().w0()) {
            s(classicActive, error);
            return;
        }
        qm.c.f(j(), 0.0d, 2, null);
        TelemetryConfig k10 = k();
        c.b bVar = new c.b();
        bVar.c("iconName", f27108a.q(classicActive));
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar.c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar.c("errorMessage", message);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.h(k10, bVar.l());
    }

    public final void s(boolean classicActive, Throwable error) {
        TelemetryConfig i10 = i();
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.e("classicActive", classicActive);
        TelemetryStandardizedField telemetryStandardizedField = TelemetryStandardizedField.ADD_OS_INFO;
        bVar.h(telemetryStandardizedField);
        qm.c.g(i10, bVar.l(), 0.0d, 4, null);
        TelemetryConfig i11 = i();
        c.b bVar2 = new c.b();
        bVar2.e("classicActive", classicActive);
        String name = error.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        bVar2.c("errorClass", name);
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        bVar2.c("errorMessage", message);
        bVar2.h(telemetryStandardizedField);
        qm.c.h(i11, bVar2.l());
    }

    public final void t(boolean classicActive) {
        if (!rh.h.a().w0()) {
            u(classicActive);
            return;
        }
        qm.c.f(m(), 0.0d, 2, null);
        TelemetryConfig n10 = n();
        c.b bVar = new c.b();
        bVar.c("iconName", f27108a.q(classicActive));
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.h(n10, bVar.l());
    }

    public final void u(boolean classicActive) {
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.e("classicActive", classicActive);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        TelemetryData l10 = bVar.l();
        qm.c.g(l(), l10, 0.0d, 4, null);
        qm.c.h(l(), l10);
    }

    public final void v(@NotNull f.a migration) {
        gt.r rVar;
        Intrinsics.checkNotNullParameter(migration, "migration");
        if (migration instanceof f.a.c) {
            return;
        }
        if (migration instanceof f.a.Migrated) {
            rVar = new gt.r("migrated", Integer.valueOf(((f.a.Migrated) migration).getCount()), null);
        } else {
            if (!(migration instanceof f.a.Failed)) {
                throw new gt.l();
            }
            f.a.Failed failed = (f.a.Failed) migration;
            rVar = new gt.r("failed", Integer.valueOf(failed.getCount()), failed.getReason());
        }
        String str = (String) rVar.a();
        int intValue = ((Number) rVar.b()).intValue();
        String str2 = (String) rVar.c();
        qm.c.f(o(), 0.0d, 2, null);
        TelemetryConfig p8 = p();
        c.b bVar = new c.b();
        bVar.c("outcome", str);
        bVar.f("shortcutCount", intValue);
        if (str2 != null) {
            bVar.c("failureReason", str2);
        }
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.h(p8, bVar.l());
    }
}
