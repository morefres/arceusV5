package uk;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import ek.q;
import gt.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00034\u0019)B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J#\u0010\u0014\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\t*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0007¢\u0006\u0004\b%\u0010\u0006J\u000f\u0010&\u001a\u00020\"H\u0007¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b'\u0010\u0006J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\"H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010\u0003J'\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001072\b\u00106\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020+H\u0002¢\u0006\u0004\b:\u0010-J\u0017\u0010<\u001a\u00020+2\u0006\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0004H\u0002¢\u0006\u0004\b>\u0010\u0006R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010BR\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010DR\u0018\u0010G\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010IR\u0016\u0010L\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010KR\u0016\u0010N\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010MR$\u0010Q\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010D\u001a\u0004\bP\u0010\u0006R\u0018\u0010R\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010D¨\u0006S"}, d2 = {"Luk/e;", "", "<init>", "()V", "", "j", "()Ljava/lang/String;", "Landroid/content/Context;", "ctx", "", "x", "(Landroid/content/Context;)V", "url", "z", "(Ljava/lang/String;)V", "m", rl.d.f30696a, "cookie", "Luk/e$c;", Payload.SOURCE, "y", "(Ljava/lang/String;Luk/e$c;)V", "u", "(Luk/e$c;)V", "Landroid/content/SharedPreferences$Editor;", j6.b.f21518e, "(Landroid/content/SharedPreferences$Editor;)V", "r", "(Landroid/content/SharedPreferences$Editor;Luk/e$c;)V", "Luk/e$b;", "q", "()Luk/e$b;", "domain", "A", "", "i", "()J", "h", "g", "f", "timestampMillis", ve.a.f33391e, "(J)Ljava/lang/String;", "", "o", "()Z", "Luk/e$a;", "e", "()Luk/e$a;", "Landroid/webkit/CookieManager;", "k", "()Landroid/webkit/CookieManager;", "c", "w", "pair", "Lkotlin/Pair;", "p", "(Ljava/lang/String;)Lkotlin/Pair;", "l", "key", "n", "(Ljava/lang/String;)Z", "s", "", "Ljava/util/List;", "METADATA_SUFFIXES", "Landroid/content/Context;", "appContext", "Ljava/lang/String;", "migrationSourceUrl", "Landroid/webkit/CookieManager;", "webkitCookieManager", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "nativeStorage", "Luk/e$a;", "migrationResult", "Z", "migrationTriggered", "value", "getWebViewCookieStateAtMigration", "webViewCookieStateAtMigration", "cachedCookieHeader", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile Context appContext;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static CookieManager webkitCookieManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static SharedPreferences nativeStorage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean migrationTriggered;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static volatile String cachedCookieHeader;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f32991a = new e();

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<String> METADATA_SUFFIXES = p.n("__write_time", "__write_source", "__delete_time", "__delete_source");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static volatile String migrationSourceUrl = "https://www.roblox.com";

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static a migrationResult = a.f33000a;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static volatile String webViewCookieStateAtMigration = EnvironmentCompat.MEDIA_UNKNOWN;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Luk/e$a;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33000a = new a("OLD", 0);
        public static final a b = new a("NEW_FLOW_LOADED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f33001c = new a("NEW_FLOW_MIGRATED", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f33002d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ pt.a f33003e;

        static {
            a[] a10 = a();
            f33002d = a10;
            f33003e = pt.b.a(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f33000a, b, f33001c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f33002d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Luk/e$b;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33004a = new b("NO_WEBVIEW_COOKIE", 0);
        public static final b b = new b("UNCHANGED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f33005c = new b("FILLED_EMPTY", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f33006d = new b("REPLACED", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b[] f33007e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ pt.a f33008f;

        static {
            b[] a10 = a();
            f33007e = a10;
            f33008f = pt.b.a(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f33004a, b, f33005c, f33006d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f33007e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Luk/e$c;", "", "<init>", "(Ljava/lang/String;I)V", ve.a.f33391e, j6.b.f21518e, "c", rl.d.f30696a, "e", "f", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33009a = new c("MIGRATION", 0);
        public static final c b = new c("OKHTTP_RESPONSE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f33010c = new c("WEBVIEW_PULL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final c f33011d = new c("ENGINE_PUSH", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final c f33012e = new c("LOGOUT_CLEAR", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final c f33013f = new c("UNKNOWN", 5);

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ c[] f33014g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ pt.a f33015h;

        static {
            c[] a10 = a();
            f33014g = a10;
            f33015h = pt.b.a(a10);
        }

        public c(String str, int i10) {
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{f33009a, b, f33010c, f33011d, f33012e, f33013f};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f33014g.clone();
        }
    }

    public static final void A(@NotNull String domain) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(domain, "domain");
        q.h("NativeCookieStorage", "Populating WebView cookies from native storage");
        List split$default = StringsKt.split$default(d(), new String[]{"; "}, false, 0, 6, null);
        CookieManager k10 = f32991a.k();
        String str2 = "https://" + domain;
        Iterator it = split$default.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            if (!StringsKt.p0(str3)) {
                if (StringsKt.a0(str3, ".ROBLOSECURITY", false, 2, null) || StringsKt.a0(str3, ".RBXIDCHECK", false, 2, null)) {
                    str = str3 + "; Domain=." + domain + "; Path=/; HttpOnly; Secure";
                } else {
                    str = str3 + "; Domain=." + domain + "; Path=/";
                }
                k10.setCookie(str2, str);
            }
        }
        Iterator it2 = split$default.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (x.T((String) next, ".ROBLOSECURITY=", false, 2, null)) {
                obj = next;
                break;
            }
        }
        String str4 = (String) obj;
        if (str4 == null) {
            k10.setCookie(str2, ".ROBLOSECURITY=; Domain=." + domain + "; Path=/; HttpOnly; Secure; Expires=Thu, 01 Jan 1970 00:00:00 GMT");
        }
        h.j().l(str4);
    }

    @NotNull
    public static final String a(long timestampMillis) {
        if (timestampMillis <= 0) {
            return PayloadNotificationChannel.SOUND_NONE;
        }
        long currentTimeMillis = (System.currentTimeMillis() - timestampMillis) / 1000;
        return currentTimeMillis < 0 ? "clock_skew" : currentTimeMillis < 60 ? "lt_1m" : currentTimeMillis < 3600 ? "lt_1h" : currentTimeMillis < 86400 ? "lt_1d" : currentTimeMillis < 604800 ? "lt_7d" : "ge_7d";
    }

    @NotNull
    public static final String d() {
        e eVar = f32991a;
        eVar.c();
        String str = cachedCookieHeader;
        return str != null ? str : eVar.s();
    }

    @NotNull
    public static final a e() {
        return migrationResult;
    }

    @NotNull
    public static final String f() {
        String string;
        SharedPreferences sharedPreferences = nativeStorage;
        return (sharedPreferences == null || (string = sharedPreferences.getString(".ROBLOSECURITY__delete_source", "UNKNOWN")) == null) ? "UNKNOWN" : string;
    }

    public static final long g() {
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(".ROBLOSECURITY__delete_time", 0L);
    }

    @NotNull
    public static final String h() {
        String string;
        SharedPreferences sharedPreferences = nativeStorage;
        return (sharedPreferences == null || (string = sharedPreferences.getString(".ROBLOSECURITY__write_source", "UNKNOWN")) == null) ? "UNKNOWN" : string;
    }

    public static final long i() {
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(".ROBLOSECURITY__write_time", 0L);
    }

    @NotNull
    public static final String j() {
        return webViewCookieStateAtMigration;
    }

    public static final void m() {
        Context context = appContext;
        SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("WebViewCookieHandlerNativeStorage", 0) : null;
        nativeStorage = sharedPreferences;
        boolean z10 = sharedPreferences != null;
        q.h("NativeCookieStorage", "NativeCookieStorage enabled: storageReady=" + z10 + ", migrationSourceUrl=" + migrationSourceUrl);
    }

    public static final boolean o() {
        return webkitCookieManager != null;
    }

    @NotNull
    public static final b q() {
        q.h("NativeCookieStorage", "Synchronizing cookie from WebView due to security change");
        String cookie = f32991a.k().getCookie(migrationSourceUrl);
        if (cookie == null) {
            q.k("NativeCookieStorage", "pullSecurityCookieFromWebView: WebView returned null cookies, nothing to pull");
            return b.f33004a;
        }
        for (String str : StringsKt.split$default(cookie, new String[]{"; "}, false, 0, 6, null)) {
            if (x.T(str, ".ROBLOSECURITY=", false, 2, null)) {
                f32991a.c();
                SharedPreferences sharedPreferences = nativeStorage;
                String string = sharedPreferences != null ? sharedPreferences.getString(".ROBLOSECURITY", null) : null;
                String substring = str.substring(15);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (substring.length() == 0) {
                    return b.f33004a;
                }
                y(str, c.f33010c);
                return (string == null || string.length() == 0) ? b.f33005c : Intrinsics.c(string, substring) ? b.b : b.f33006d;
            }
        }
        q.k("NativeCookieStorage", "pullSecurityCookieFromWebView: no .ROBLOSECURITY in WebView cookies, native store left unchanged");
        return b.f33004a;
    }

    public static final void t() {
        v(null, 1, null);
    }

    public static final void u(@NotNull c source) {
        Intrinsics.checkNotNullParameter(source, "source");
        e eVar = f32991a;
        eVar.c();
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return;
        }
        q.h("NativeCookieStorage", "removeSecurityCookie: removing .ROBLOSECURITY from native storage (source=" + source.name() + ")");
        synchronized (eVar) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(".ROBLOSECURITY");
            eVar.b(edit);
            eVar.r(edit, source);
            edit.commit();
            cachedCookieHeader = null;
            Unit unit = Unit.f22894a;
        }
    }

    public static /* synthetic */ void v(c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = c.f33012e;
        }
        u(cVar);
    }

    public static final void x(@Nullable Context ctx) {
        if (ctx != null) {
            appContext = ctx.getApplicationContext();
        }
    }

    public static final void y(@Nullable String cookie, @NotNull c source) {
        SharedPreferences sharedPreferences;
        String str;
        Intrinsics.checkNotNullParameter(source, "source");
        e eVar = f32991a;
        eVar.c();
        if (cookie == null || cookie.length() == 0 || (sharedPreferences = nativeStorage) == null) {
            return;
        }
        int m02 = StringsKt.m0(cookie, ';', 0, false, 6, null);
        if (m02 >= 0) {
            str = cookie.substring(0, m02);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        } else {
            str = cookie;
        }
        Pair<String, String> p8 = eVar.p(str);
        if (p8 == null) {
            return;
        }
        String a10 = p8.a();
        String b10 = p8.b();
        boolean c10 = Intrinsics.c(a10, ".ROBLOSECURITY");
        synchronized (eVar) {
            String string = sharedPreferences.getString(a10, null);
            if (b10.length() == 0) {
                if (string == null) {
                    return;
                }
            } else if (c10 && Intrinsics.c(b10, string)) {
                return;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (b10.length() == 0) {
                edit.remove(a10);
                if (c10) {
                    eVar.b(edit);
                    eVar.r(edit, source);
                    q.h("NativeCookieStorage", "setCookie: DELETING .ROBLOSECURITY (empty value, source=" + source.name() + ")");
                }
            } else {
                edit.putString(a10, b10);
                if (c10) {
                    edit.putLong(".ROBLOSECURITY__write_time", System.currentTimeMillis());
                    edit.putString(".ROBLOSECURITY__write_source", source.name());
                    q.h("NativeCookieStorage", "setCookie: wrote .ROBLOSECURITY (len=" + b10.length() + ", source=" + source.name() + ")");
                }
            }
            if (c10) {
                edit.commit();
            } else {
                edit.apply();
            }
            cachedCookieHeader = null;
            Unit unit = Unit.f22894a;
        }
    }

    public static final void z(@Nullable String url) {
        if (url != null) {
            migrationSourceUrl = url;
        }
    }

    public final void b(SharedPreferences.Editor editor) {
        editor.remove(".ROBLOSECURITY__write_time");
        editor.remove(".ROBLOSECURITY__write_source");
    }

    public final void c() {
        if (migrationTriggered) {
            return;
        }
        if (nativeStorage == null) {
            q.k("NativeCookieStorage", "ensureMigratedIfNeeded: nativeStorage is null (context not injected); cookie store is inert");
            return;
        }
        synchronized (this) {
            if (migrationTriggered) {
                return;
            }
            migrationTriggered = true;
            f32991a.w();
            Unit unit = Unit.f22894a;
        }
    }

    public final CookieManager k() {
        CookieManager cookieManager = webkitCookieManager;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        webkitCookieManager = cookieManager2;
        Intrinsics.checkNotNullExpressionValue(cookieManager2, "also(...)");
        return cookieManager2;
    }

    public final boolean l() {
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return false;
        }
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        if (all.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue() instanceof String) {
                e eVar = f32991a;
                Intrinsics.checkNotNull(key);
                if (!eVar.n(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(String key) {
        List<String> list = METADATA_SUFFIXES;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (x.D(key, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final Pair<String, String> p(String pair) {
        String obj;
        int m02;
        if (pair == null || (m02 = StringsKt.m0((obj = StringsKt.p1(pair).toString()), '=', 0, false, 6, null)) <= 0) {
            return null;
        }
        String substring = obj.substring(0, m02);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = obj.substring(m02 + 1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return s.a(substring, substring2);
    }

    public final void r(SharedPreferences.Editor editor, c cVar) {
        editor.putLong(".ROBLOSECURITY__delete_time", System.currentTimeMillis());
        editor.putString(".ROBLOSECURITY__delete_source", cVar.name());
    }

    public final synchronized String s() {
        String str = cachedCookieHeader;
        if (str != null) {
            return str;
        }
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Map<String, ?> all = sharedPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!Intrinsics.c(key, "__migrated_from_webview_v5__")) {
                Intrinsics.checkNotNull(key);
                if (!n(key)) {
                    String str2 = value instanceof String ? (String) value : null;
                    if (str2 != null) {
                        if (sb2.length() > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(key);
                        sb2.append('=');
                        sb2.append(str2);
                    }
                }
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        cachedCookieHeader = sb3;
        return sb3;
    }

    public final void w() {
        SharedPreferences sharedPreferences = nativeStorage;
        if (sharedPreferences == null) {
            return;
        }
        boolean z10 = false;
        if (sharedPreferences.getBoolean("__migrated_from_webview_v5__", false)) {
            webViewCookieStateAtMigration = "already_loaded";
            boolean l10 = l();
            q.h("NativeCookieStorage", "Cookies already migrated, loading from native storage. hasData=" + l10);
            migrationResult = l10 ? a.b : a.f33000a;
            return;
        }
        String str = migrationSourceUrl;
        q.h("NativeCookieStorage", "Migrating cookies from WebView storage to SharedPreferences using " + str);
        boolean contains = sharedPreferences.contains(".ROBLOSECURITY");
        String cookie = k().getCookie(str);
        webViewCookieStateAtMigration = (cookie == null || !StringsKt.a0(cookie, ".ROBLOSECURITY", false, 2, null)) ? cookie == null ? contains ? "null_kept_native" : "null" : cookie.length() == 0 ? contains ? "empty_kept_native" : "empty" : contains ? "no_roblosecurity_kept_native" : "no_roblosecurity" : "has_roblosecurity";
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (cookie != null && cookie.length() != 0) {
            Iterator it = StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                Pair<String, String> p8 = f32991a.p((String) it.next());
                if (p8 != null) {
                    edit.putString(p8.c(), p8.d());
                    if (Intrinsics.c(p8.c(), ".ROBLOSECURITY")) {
                        edit.putLong(".ROBLOSECURITY__write_time", System.currentTimeMillis());
                        edit.putString(".ROBLOSECURITY__write_source", "MIGRATION");
                    }
                    z10 = true;
                }
            }
        }
        edit.putBoolean("__migrated_from_webview_v5__", true);
        edit.apply();
        cachedCookieHeader = null;
        migrationResult = z10 ? a.f33001c : a.f33000a;
    }
}
