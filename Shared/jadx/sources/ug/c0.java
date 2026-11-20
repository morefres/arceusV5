package ug;

import android.os.Debug;
import androidx.core.os.EnvironmentCompat;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import gt.n;
import java.net.URI;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import qm.c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001e#4B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010(\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001b\u0010+\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!R\u001b\u0010.\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001b\u00101\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!R\u001b\u00103\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b2\u0010!¨\u00065"}, d2 = {"Lug/c0;", "", "<init>", "()V", "Lug/c0$b;", "surface", "", "url", "", "w", "(Lug/c0$b;Ljava/lang/String;)V", "Lug/c0$c;", "outcome", "v", "(Lug/c0$c;)V", "r", "(Ljava/lang/String;)V", "u", "Lug/c0$a;", "closeSource", "q", "(Lug/c0$a;)V", zl.t.f38095d, "", "level", "s", "(I)V", "h", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", j6.b.f21518e, "Lgt/h;", "l", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "urlOpenSourceSurfaceCounter", "c", "k", "urlHandlingCounter", rl.d.f30696a, "i", "impressionCounter", "e", "j", "nativeMobileWebOpenCounter", "f", "m", "webClosedCounter", "g", "n", "webViewMemoryOnCloseCounter", "o", "webViewMemoryOnTrimCounter", ve.a.f33391e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c0 f32698a = new c0();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final gt.h urlOpenSourceSurfaceCounter = gt.i.b(new Function0() { // from class: ug.v
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig z10;
            z10 = c0.z();
            return z10;
        }
    });

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h urlHandlingCounter = gt.i.b(new Function0() { // from class: ug.w
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig y10;
            y10 = c0.y();
            return y10;
        }
    });

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h impressionCounter = gt.i.b(new Function0() { // from class: ug.x
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig p8;
            p8 = c0.p();
            return p8;
        }
    });

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h nativeMobileWebOpenCounter = gt.i.b(new Function0() { // from class: ug.y
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig x10;
            x10 = c0.x();
            return x10;
        }
    });

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h webClosedCounter = gt.i.b(new Function0() { // from class: ug.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig A;
            A = c0.A();
            return A;
        }
    });

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h webViewMemoryOnCloseCounter = gt.i.b(new Function0() { // from class: ug.a0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig B;
            B = c0.B();
            return B;
        }
    });

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final gt.h webViewMemoryOnTrimCounter = gt.i.b(new Function0() { // from class: ug.b0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            TelemetryConfig C;
            C = c0.C();
            return C;
        }
    });

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lug/c0$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", rl.d.f30696a, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public static final a b = new a("CLOSE_BUTTON", 0, "close_button");

        /* renamed from: c, reason: collision with root package name */
        public static final a f32705c = new a("BACK_BUTTON", 1, "back_button");

        /* renamed from: d, reason: collision with root package name */
        public static final a f32706d = new a("PROGRAMMATIC", 2, "programmatic");

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f32707e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ pt.a f32708f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        static {
            a[] a10 = a();
            f32707e = a10;
            f32708f = pt.b.a(a10);
        }

        public a(String str, int i10, String str2) {
            this.value = str2;
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{b, f32705c, f32706d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f32707e.clone();
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lug/c0$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", rl.d.f30696a, "e", "f", "g", "h", "i", "j", "k", "l", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        public static final b b = new b("BROWSER_SERVICE_BRIDGE", 0, "browser_service_bridge");

        /* renamed from: c, reason: collision with root package name */
        public static final b f32710c = new b("WEB_ACTIVITY", 1, "web_activity");

        /* renamed from: d, reason: collision with root package name */
        public static final b f32711d = new b("WEB_FRAGMENT", 2, "web_fragment");

        /* renamed from: e, reason: collision with root package name */
        public static final b f32712e = new b("WEB_DIALOG_FRAGMENT", 3, "web_dialog_fragment");

        /* renamed from: f, reason: collision with root package name */
        public static final b f32713f = new b("NOTIFICATION_STREAM_ACTIVITY", 4, "notification_stream_activity");

        /* renamed from: g, reason: collision with root package name */
        public static final b f32714g = new b("NOTIFICATION_STREAM_WEB_FRAGMENT", 5, "notification_stream_web_fragment");

        /* renamed from: h, reason: collision with root package name */
        public static final b f32715h = new b("RESET_PASSWORD_ACTIVITY", 6, "reset_password_activity");

        /* renamed from: i, reason: collision with root package name */
        public static final b f32716i = new b("ROBLOX_MODAL_WEB_FRAGMENT", 7, "roblox_modal_web_fragment");

        /* renamed from: j, reason: collision with root package name */
        public static final b f32717j = new b("ROBUX_PREMIUM_DIALOG_FRAGMENT", 8, "robux_premium_dialog_fragment");

        /* renamed from: k, reason: collision with root package name */
        public static final b f32718k = new b("ROBUX_PREMIUM_FRAGMENT", 9, "robux_premium_fragment");

        /* renamed from: l, reason: collision with root package name */
        public static final b f32719l = new b("GENERIC_WEB_FRAGMENT", 10, "generic_web_fragment");

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ b[] f32720m;

        /* renamed from: n, reason: collision with root package name */
        public static final /* synthetic */ pt.a f32721n;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        static {
            b[] a10 = a();
            f32720m = a10;
            f32721n = pt.b.a(a10);
        }

        public b(String str, int i10, String str2) {
            this.value = str2;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{b, f32710c, f32711d, f32712e, f32713f, f32714g, f32715h, f32716i, f32717j, f32718k, f32719l};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f32720m.clone();
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lug/c0$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", ve.a.f33391e, "Ljava/lang/String;", j6.b.f21518e, "()Ljava/lang/String;", "c", rl.d.f30696a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        public static final c b = new c("URL_NULL", 0, "url_null");

        /* renamed from: c, reason: collision with root package name */
        public static final c f32723c = new c("ACTIVITY_FINISHING", 1, "activity_finishing");

        /* renamed from: d, reason: collision with root package name */
        public static final c f32724d = new c("NETWORK_DISCONNECTED", 2, "network_disconnected");

        /* renamed from: e, reason: collision with root package name */
        public static final c f32725e = new c("WEB_LINK", 3, "web_link");

        /* renamed from: f, reason: collision with root package name */
        public static final c f32726f = new c("SOCIAL_MEDIA", 4, "social_media");

        /* renamed from: g, reason: collision with root package name */
        public static final c f32727g = new c("PASSWORD_RESET", 5, "password_reset");

        /* renamed from: h, reason: collision with root package name */
        public static final c f32728h = new c("SESSION_EXPIRED", 6, "session_expired");

        /* renamed from: i, reason: collision with root package name */
        public static final c f32729i = new c("PURCHASE", 7, "purchase");

        /* renamed from: j, reason: collision with root package name */
        public static final c f32730j = new c("DEEPLINK_INTERCEPT", 8, "deeplink_intercept");

        /* renamed from: k, reason: collision with root package name */
        public static final c f32731k = new c("FIRST_PARTY_LOAD", 9, "first_party_load");

        /* renamed from: l, reason: collision with root package name */
        public static final c f32732l = new c("SECOND_PARTY_LOAD", 10, "second_party_load");

        /* renamed from: m, reason: collision with root package name */
        public static final c f32733m = new c("THIRD_PARTY_EXTERNAL", 11, "third_party_external");

        /* renamed from: n, reason: collision with root package name */
        public static final c f32734n = new c("DEFAULT_LOAD", 12, "default_load");

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ c[] f32735o;

        /* renamed from: p, reason: collision with root package name */
        public static final /* synthetic */ pt.a f32736p;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        static {
            c[] a10 = a();
            f32735o = a10;
            f32736p = pt.b.a(a10);
        }

        public c(String str, int i10, String str2) {
            this.value = str2;
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{b, f32723c, f32724d, f32725e, f32726f, f32727g, f32728h, f32729i, f32730j, f32731k, f32732l, f32733m, f32734n};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f32735o.clone();
        }

        @NotNull
        /* renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    public static final TelemetryConfig A() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("web_closed_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 11);
        aVar.a("Counts how many times the user explicitly closes a GenericWebFragment (MOBAPP-2510)");
        return aVar.d();
    }

    public static final TelemetryConfig B() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("webview_memory_on_close_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 8, 18);
        aVar.a("Logs memory usage when a WebView is destroyed (dev builds only, MOBAPP-2891)");
        return aVar.d();
    }

    public static final TelemetryConfig C() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("webview_memory_on_trim_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 8, 18);
        aVar.a("Logs memory usage when onTrimMemory is triggered (dev builds only, MOBAPP-2891)");
        return aVar.d();
    }

    public static final TelemetryConfig p() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("webview_impression_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 3);
        aVar.a("Counter for webview impressions — page fully loaded and visible to the user");
        return aVar.d();
    }

    public static final void q(@NotNull a closeSource) {
        Intrinsics.checkNotNullParameter(closeSource, "closeSource");
        ek.q.b("WebViewAnalytics", "logCounter(web_closed_counter): closeSource=" + closeSource.getValue());
        TelemetryConfig m10 = f32698a.m();
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.c("close_source", closeSource.getValue());
        qm.c.g(m10, bVar.l(), 0.0d, 4, null);
    }

    public static final void r(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        c0 c0Var = f32698a;
        String h10 = c0Var.h(url);
        ek.q.b("WebViewAnalytics", "logCounter(webview_impression_counter): url=" + h10);
        TelemetryConfig i10 = c0Var.i();
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.c("url", h10);
        qm.c.g(i10, bVar.l(), 0.0d, 4, null);
    }

    public static final void s(int level) {
        if (mh.b.a()) {
            Runtime runtime = Runtime.getRuntime();
            long j10 = 1048576;
            long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / j10;
            long maxMemory = runtime.maxMemory() / j10;
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / j10;
            ek.q.b("WebViewAnalytics", "logCounter(webview_memory_on_trim_counter): javaHeap=" + freeMemory + "MB native=" + nativeHeapAllocatedSize + "MB max=" + maxMemory + "MB trimLevel=" + level);
            TelemetryConfig o8 = f32698a.o();
            qm.c cVar = qm.c.f29956a;
            c.b bVar = new c.b();
            bVar.c("java_heap_mb", String.valueOf(freeMemory));
            bVar.c("native_heap_mb", String.valueOf(nativeHeapAllocatedSize));
            bVar.c("java_heap_max_mb", String.valueOf(maxMemory));
            bVar.c("trim_level", String.valueOf(level));
            qm.c.g(o8, bVar.l(), 0.0d, 4, null);
        }
    }

    public static final void t() {
        if (mh.b.a()) {
            Runtime runtime = Runtime.getRuntime();
            long j10 = 1048576;
            long freeMemory = (runtime.totalMemory() - runtime.freeMemory()) / j10;
            long maxMemory = runtime.maxMemory() / j10;
            long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / j10;
            ek.q.b("WebViewAnalytics", "logCounter(webview_memory_on_close_counter): javaHeap=" + freeMemory + "MB native=" + nativeHeapAllocatedSize + "MB max=" + maxMemory + "MB");
            TelemetryConfig n10 = f32698a.n();
            qm.c cVar = qm.c.f29956a;
            c.b bVar = new c.b();
            bVar.c("java_heap_mb", String.valueOf(freeMemory));
            bVar.c("native_heap_mb", String.valueOf(nativeHeapAllocatedSize));
            bVar.c("java_heap_max_mb", String.valueOf(maxMemory));
            qm.c.g(n10, bVar.l(), 0.0d, 4, null);
        }
    }

    public static final void u(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        c0 c0Var = f32698a;
        String h10 = c0Var.h(url);
        ek.q.b("WebViewAnalytics", "logCounter(native_mobile_web_open_counter): url=" + h10);
        TelemetryConfig j10 = c0Var.j();
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.c("url", h10);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.g(j10, bVar.l(), 0.0d, 4, null);
    }

    public static final void v(@NotNull c outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        ek.q.b("WebViewAnalytics", "logCounter(webview_url_handling_counter): outcome=" + outcome.getValue());
        TelemetryConfig k10 = f32698a.k();
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.c("outcome", outcome.getValue());
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.g(k10, bVar.l(), 0.0d, 4, null);
    }

    public static final void w(@NotNull b surface, @NotNull String url) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(url, "url");
        c0 c0Var = f32698a;
        String h10 = c0Var.h(url);
        ek.q.b("WebViewAnalytics", "logCounter(android_webview_url_open_counter): surface=" + surface.getValue() + " authorityAndPath=" + h10);
        TelemetryConfig l10 = c0Var.l();
        qm.c cVar = qm.c.f29956a;
        c.b bVar = new c.b();
        bVar.c("surface", surface.getValue());
        bVar.c("url", h10);
        bVar.h(TelemetryStandardizedField.ADD_OS_INFO);
        qm.c.g(l10, bVar.l(), 0.0d, 4, null);
    }

    public static final TelemetryConfig x() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("native_mobile_web_open_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 10);
        aVar.a("Tracks WebView sessions opened via the native openWindow protocol from the C++ engine (MOBAPP-2589)");
        return aVar.d();
    }

    public static final TelemetryConfig y() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("webview_url_handling_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 6, 10);
        aVar.a("Tracks the outcome of every URL navigation decision in RobloxWebDialogFragment (MOBAPP-2589)");
        return aVar.d();
    }

    public static final TelemetryConfig z() {
        qm.c cVar = qm.c.f29956a;
        c.a aVar = new c.a("android_webview_url_open_counter", p0.c(TelemetryBackend.COUNTER));
        aVar.b(2026, 5, 27);
        aVar.a("Counts WebView opens per surface and URL scheme (MOBAPP-2516)");
        return aVar.d();
    }

    @NotNull
    public final String h(@NotNull String url) {
        Object b10;
        Object b11;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            n.Companion companion = gt.n.INSTANCE;
            b10 = gt.n.b(new URI(url));
        } catch (Throwable th2) {
            n.Companion companion2 = gt.n.INSTANCE;
            b10 = gt.n.b(gt.o.a(th2));
        }
        if (gt.n.h(b10)) {
            try {
                URI uri = (URI) b10;
                String authority = uri.getAuthority();
                if (authority == null) {
                    throw new IllegalStateException(("URI authority is null for url: " + url).toString());
                }
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                b11 = gt.n.b(new Pair(authority, StringsKt.s1(path, '/')));
            } catch (Throwable th3) {
                n.Companion companion3 = gt.n.INSTANCE;
                b11 = gt.n.b(gt.o.a(th3));
            }
        } else {
            b11 = gt.n.b(b10);
        }
        if (gt.n.h(b11)) {
            Pair pair = (Pair) b11;
            b11 = ((String) pair.a()) + "/" + ((String) pair.b());
        }
        Object b12 = gt.n.b(b11);
        Throwable e10 = gt.n.e(b12);
        if (e10 == null) {
            String r12 = StringsKt.r1((String) b12, '/');
            return r12.length() == 0 ? EnvironmentCompat.MEDIA_UNKNOWN : r12;
        }
        ek.q.f("WebViewAnalytics", "Failed to extract authority and path from url", e10);
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public final TelemetryConfig i() {
        return (TelemetryConfig) impressionCounter.getValue();
    }

    public final TelemetryConfig j() {
        return (TelemetryConfig) nativeMobileWebOpenCounter.getValue();
    }

    public final TelemetryConfig k() {
        return (TelemetryConfig) urlHandlingCounter.getValue();
    }

    public final TelemetryConfig l() {
        return (TelemetryConfig) urlOpenSourceSurfaceCounter.getValue();
    }

    public final TelemetryConfig m() {
        return (TelemetryConfig) webClosedCounter.getValue();
    }

    public final TelemetryConfig n() {
        return (TelemetryConfig) webViewMemoryOnCloseCounter.getValue();
    }

    public final TelemetryConfig o() {
        return (TelemetryConfig) webViewMemoryOnTrimCounter.getValue();
    }
}
