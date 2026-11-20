package wj;

import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import gt.h;
import gt.i;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import qm.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lwj/b;", "", "<init>", "()V", "", PinShortcutHandler.EXTRA_PLACE_ID, "", rl.d.f30696a, "(J)V", "e", "", "h", "(J)Ljava/lang/String;", "g", "Lwj/b$a;", "action", "f", "(JLwj/b$a;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", j6.b.f21518e, "Lgt/h;", "c", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "config", ve.a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f34343a = new b();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final h config = i.b(new Function0() { // from class: wj.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig b;
            b = b.b();
            return b;
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lwj/b$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34344a = new a("PIN_SHORTCUT_REQUESTED", 0);
        public static final a b = new a("PIN_SHORTCUT_SUCCESSFUL", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f34345c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ pt.a f34346d;

        static {
            a[] a10 = a();
            f34345c = a10;
            f34346d = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f34344a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f34345c.clone();
        }
    }

    public static final TelemetryConfig b() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("androidPinnedShortcutAction", q0.g(TelemetryBackend.EVENT_INGEST, TelemetryBackend.POINTS));
        aVar.b(2026, 8, 7);
        aVar.a("Tracks Android app shortcut pin request and success actions");
        aVar.c(Integer.valueOf(rh.h.a().Z1()));
        return aVar.d();
    }

    public final TelemetryConfig c() {
        return (TelemetryConfig) config.getValue();
    }

    public final void d(long placeId) {
        f(placeId, a.f34344a);
    }

    public final void e(long placeId) {
        f(placeId, a.b);
    }

    public final void f(long placeId, a action) {
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.c("shortcutId", rh.h.a().W0() ? f34343a.g(placeId) : f34343a.h(placeId));
        bVar.c("shortcutAction", action.name());
        qm.c.h(c(), bVar.l());
    }

    @NotNull
    public final String g(long placeId) {
        return "experience_edp_" + placeId;
    }

    @NotNull
    public final String h(long placeId) {
        return "experience_" + placeId;
    }
}
