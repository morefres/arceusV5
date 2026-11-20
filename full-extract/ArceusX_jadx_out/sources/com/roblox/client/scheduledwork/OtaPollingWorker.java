package com.roblox.client.scheduledwork;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.scheduledwork.OtaPollingWorker;
import ek.w;
import gt.n;
import gt.o;
import gt.s;
import j6.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import ot.m;
import rg.a1;
import rh.h;
import tt.c;
import x5.d;
import x5.g0;
import x5.i;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 22\u00020\u0001:\u000223B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u000b2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020#H\u0002¢\u0006\u0004\b/\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lmt/b;)Ljava/lang/Object;", "", "behaviorName", "configUrl", "Landroid/content/SharedPreferences;", "prefs", "Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;", "v", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/SharedPreferences;Lmt/b;)Ljava/lang/Object;", "", "behaviorNames", "", "w", "(Landroid/content/SharedPreferences;Ljava/util/Set;)V", "url", "Ljava/io/File;", "dest", "m", "(Ljava/lang/String;Ljava/io/File;Lmt/b;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "o", "(Ljava/lang/String;Lmt/b;)Ljava/lang/Object;", "Ljava/net/HttpURLConnection;", "u", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "", "p", "()Z", "eventName", "", "Lcom/roblox/client/datastructures/NameValuePair;", "extraParams", "r", "(Ljava/lang/String;Ljava/util/List;)V", "message", "n", "(Ljava/lang/String;)Ljava/lang/String;", "q", ve.a.f33391e, "Landroid/content/Context;", b.f21518e, "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OtaPollingWorker extends CoroutineWorker {

    /* renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f9399c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f9400d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static Function2<? super Network, ? super URL, ? extends URLConnection> f9401e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static Function1<? super Context, ? extends Network> f9402f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static Function0<String> f9403g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function0<String> {
        public a(Object obj) {
            super(0, obj, OtaConfigHandler.class, "getEngineVersion", "getEngineVersion()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((OtaConfigHandler) this.receiver).getEngineVersion();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ!\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010#\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0014\u0010$\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0016R\u0014\u0010%\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0014\u0010&\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0014\u0010'\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0014\u0010(\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0014\u0010)\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0016R\u0014\u0010*\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u0016¨\u0006+"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "f", "(Landroid/content/Context;)V", b.f21518e, "", "configUrl", "engineVersion", rl.d.f30696a, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "rawConfig", "appVersion", "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "WORK_TAG", "Ljava/lang/String;", "TAG", "OTA_WORKER_BLOBS_DIR", "WORKER_BLOB_PREFIX", "Lkotlin/time/a;", "CONNECT_TIMEOUT", "J", "READ_TIMEOUT", "", "MAX_RETRY_ATTEMPTS", "I", "DEFAULT_INACTIVITY_DAYS", "KEY_MAX_RETRY_ATTEMPTS", "KEY_INACTIVITY_DAYS", "KEY_FLAGS_FROM_SCHEDULE", "KEY_DEBUG_MODE", "KEY_MAX_APP_VERSION_CHECK", "KEY_RETARGET_CONFIG_URL", "KEY_BIND_NETWORK", "PREF_LAST_STARTUP_TIME", "PREF_OTA_POLLING_SCHEDULED", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final CharSequence e(String str, String pair) {
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (!Intrinsics.c(Uri.decode(StringsKt.i1(pair, '=', null, 2, null)), "version")) {
                return pair;
            }
            return "version=" + Uri.encode(str);
        }

        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.INSTANCE.a(context).a("background_ota_polling");
            SharedPreferences U = a1.U(context);
            Intrinsics.checkNotNullExpressionValue(U, "getKeyValues(...)");
            SharedPreferences.Editor edit = U.edit();
            edit.putBoolean("ota_polling_scheduled", false);
            edit.apply();
        }

        public final boolean c(@NotNull JSONObject rawConfig, @NotNull String appVersion) {
            String str;
            Long t8;
            Intrinsics.checkNotNullParameter(rawConfig, "rawConfig");
            Intrinsics.checkNotNullParameter(appVersion, "appVersion");
            if (!rawConfig.optBoolean("isDevelopmentConfig", false) && (str = (String) CollectionsKt.f0(StringsKt.P0(appVersion, new char[]{'.'}, false, 0, 6, null), 1)) != null && (t8 = StringsKt.t(str)) != null) {
                if (t8.longValue() < 0) {
                    t8 = null;
                }
                if (t8 != null) {
                    long longValue = t8.longValue();
                    String optString = rawConfig.optString("maxAppVersion", "0");
                    Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                    Long t10 = StringsKt.t(optString);
                    if (t10 != null) {
                        Long l10 = t10.longValue() >= 0 ? t10 : null;
                        if (l10 != null && l10.longValue() < longValue) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        @NotNull
        public final String d(@NotNull String configUrl, @Nullable final String engineVersion) {
            Intrinsics.checkNotNullParameter(configUrl, "configUrl");
            Uri parse = Uri.parse(configUrl);
            String queryParameter = parse.getQueryParameter("version");
            if (engineVersion == null || queryParameter == null || Intrinsics.c(queryParameter, engineVersion)) {
                return configUrl;
            }
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            String uri = parse.buildUpon().encodedQuery(CollectionsKt.m0(StringsKt.P0(encodedQuery, new char[]{'&'}, false, 0, 6, null), "&", null, null, 0, null, new Function1() { // from class: sj.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence e10;
                    e10 = OtaPollingWorker.Companion.e(engineVersion, (String) obj);
                    return e10;
                }
            }, 30, null)).build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return uri;
        }

        public final void f(@NotNull Context context) {
            androidx.work.b a10;
            Intrinsics.checkNotNullParameter(context, "context");
            boolean G5 = h.a().G5();
            boolean D1 = h.a().D1();
            if (G5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enabled=" + D1);
            }
            if (!D1) {
                if (Intrinsics.c(w.a(context), "foreground")) {
                    boolean z10 = a1.U(context).getBoolean("ota_polling_scheduled", false);
                    b(context);
                    p0.INSTANCE.a(context).b("background_ota_polling_debug_once");
                    if (z10) {
                        OtaConfigHandler.logEvent$NativeShell_googleProdRelease$default(OtaConfigHandler.INSTANCE, "ota_polling_worker_flag_disabled_foreground_cancelled", "background_ota_worker", null, 4, null);
                        return;
                    }
                    return;
                }
                return;
            }
            if (h.a().X5()) {
                Pair[] pairArr = {s.a("flags_from_schedule", Boolean.TRUE), s.a("debug_mode", Boolean.valueOf(G5)), s.a("max_app_version_check", Boolean.valueOf(h.a().j())), s.a("retarget_config_url", Boolean.valueOf(h.a().y3())), s.a("bind_network", Boolean.valueOf(h.a().g0()))};
                b.a aVar = new b.a();
                for (int i10 = 0; i10 < 5; i10++) {
                    Pair pair = pairArr[i10];
                    aVar.b((String) pair.c(), pair.d());
                }
                a10 = aVar.a();
            } else {
                a10 = new b.a().a();
            }
            if (G5) {
                p0.INSTANCE.a(context).g("background_ota_polling_debug_once", j.b, new z.a(OtaPollingWorker.class).a("background_ota_polling_debug_once").o(a10).n(30L, TimeUnit.SECONDS).k(new d.a().b(x.b).a()).b());
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued one-time debug work (30s delay, KEEP — kill app within 30s to test dead-process wakeup)");
            } else {
                p0.INSTANCE.a(context).b("background_ota_polling_debug_once");
            }
            boolean p42 = h.a().p4();
            long Y4 = h.a().Y4();
            long d02 = h.a().d0();
            int m12 = h.a().m1();
            int B5 = h.a().B5();
            x5.d a11 = new d.a().b(p42 ? x.f35348c : x.b).c(true).f(true).a();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            g0 b = new g0.a(OtaPollingWorker.class, Y4, timeUnit, d02, timeUnit).a("background_ota_polling").k(a11).i(x5.a.f35237a, 10L, TimeUnit.SECONDS).o(new b.a().c(a10).f("max_retry_attempts", m12).f("inactivity_days", B5).a()).b();
            SharedPreferences U = a1.U(context);
            Intrinsics.checkNotNullExpressionValue(U, "getKeyValues(...)");
            SharedPreferences.Editor edit = U.edit();
            edit.putLong("last_startup_time", System.currentTimeMillis());
            edit.putBoolean("ota_polling_scheduled", true);
            edit.apply();
            p0.INSTANCE.a(context).e("background_ota_polling", i.f35281c, b);
            if (G5) {
                Log.i("OtaPollingWorker", "DEV scheduleOtaPolling: enqueued periodic work tag=background_ota_polling intervalMin=" + Y4 + " flexMin=" + d02);
            }
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/scheduledwork/OtaPollingWorker$c;", "", "", "assetId", "assetVersion", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ve.a.f33391e, "J", "()J", j6.b.f21518e, "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.roblox.client.scheduledwork.OtaPollingWorker$c, reason: from toString */
    public static final /* data */ class PollResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final long assetId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        public final long assetVersion;

        public PollResult(long j10, long j11) {
            this.assetId = j10;
            this.assetVersion = j11;
        }

        /* renamed from: a, reason: from getter */
        public final long getAssetId() {
            return this.assetId;
        }

        /* renamed from: b, reason: from getter */
        public final long getAssetVersion() {
            return this.assetVersion;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PollResult)) {
                return false;
            }
            PollResult pollResult = (PollResult) other;
            return this.assetId == pollResult.assetId && this.assetVersion == pollResult.assetVersion;
        }

        public int hashCode() {
            return (Long.hashCode(this.assetId) * 31) + Long.hashCode(this.assetVersion);
        }

        @NotNull
        public String toString() {
            return "PollResult(assetId=" + this.assetId + ", assetVersion=" + this.assetVersion + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.scheduledwork.OtaPollingWorker", f = "OtaPollingWorker.kt", l = {318}, m = "doWork", v = 1)
    public static final class d extends ot.d {
        public long A;
        public /* synthetic */ Object B;
        public int D;

        /* renamed from: t, reason: collision with root package name */
        public boolean f9406t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f9407u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9408v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9409w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9410x;

        /* renamed from: y, reason: collision with root package name */
        public Object f9411y;

        /* renamed from: z, reason: collision with root package name */
        public int f9412z;

        public d(mt.b<? super d> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.B = obj;
            this.D |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OtaPollingWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    @ot.f(c = "com.roblox.client.scheduledwork.OtaPollingWorker$doWork$2", f = "OtaPollingWorker.kt", l = {329}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<ju.p0, mt.b<? super Unit>, Object> {
        public final /* synthetic */ y A;

        /* renamed from: t, reason: collision with root package name */
        public Object f9413t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9414u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9415v;

        /* renamed from: w, reason: collision with root package name */
        public int f9416w;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SharedPreferences f9418y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Set<String> f9419z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SharedPreferences sharedPreferences, Set<String> set, y yVar, mt.b<? super e> bVar) {
            super(2, bVar);
            this.f9418y = sharedPreferences;
            this.f9419z = set;
            this.A = yVar;
        }

        @Override // ot.a
        public final mt.b<Unit> create(Object obj, mt.b<?> bVar) {
            return OtaPollingWorker.this.new e(this.f9418y, this.f9419z, this.A, bVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0089 A[Catch: IOException -> 0x001f, TRY_LEAVE, TryCatch #0 {IOException -> 0x001f, blocks: (B:6:0x001b, B:7:0x0085, B:17:0x006e, B:9:0x0089), top: B:5:0x001b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0082 -> B:7:0x0085). Please report as a decompilation issue!!! */
        @Override // ot.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.scheduledwork.OtaPollingWorker.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ju.p0 p0Var, mt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22894a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @ot.f(c = "com.roblox.client.scheduledwork.OtaPollingWorker", f = "OtaPollingWorker.kt", l = {419, 492}, m = "pollBehavior", v = 1)
    public static final class f extends ot.d {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public long I;
        public long J;
        public boolean K;
        public boolean L;
        public /* synthetic */ Object M;
        public int O;

        /* renamed from: t, reason: collision with root package name */
        public Object f9420t;

        /* renamed from: u, reason: collision with root package name */
        public Object f9421u;

        /* renamed from: v, reason: collision with root package name */
        public Object f9422v;

        /* renamed from: w, reason: collision with root package name */
        public Object f9423w;

        /* renamed from: x, reason: collision with root package name */
        public Object f9424x;

        /* renamed from: y, reason: collision with root package name */
        public Object f9425y;

        /* renamed from: z, reason: collision with root package name */
        public Object f9426z;

        public f(mt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // ot.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.M = obj;
            this.O |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OtaPollingWorker.this.v(null, null, null, this);
        }
    }

    static {
        a.Companion companion = kotlin.time.a.INSTANCE;
        iu.b bVar = iu.b.f21121e;
        f9399c = kotlin.time.b.p(10, bVar);
        f9400d = kotlin.time.b.p(30, bVar);
        f9401e = new Function2() { // from class: sj.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                URLConnection t8;
                t8 = OtaPollingWorker.t((Network) obj, (URL) obj2);
                return t8;
            }
        };
        f9402f = new Function1() { // from class: sj.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Network l10;
                l10 = OtaPollingWorker.l((Context) obj);
                return l10;
            }
        };
        f9403g = new a(OtaConfigHandler.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtaPollingWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        this.context = context;
    }

    public static final String A(List list) {
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        return "WorkerBlob_" + ((String) list.get(0)) + "_" + ((String) list.get(1));
    }

    public static final void B(@NotNull Context context) {
        INSTANCE.f(context);
    }

    public static final Network l(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ConnectivityManager connectivityManager = (ConnectivityManager) l2.b.k(context, ConnectivityManager.class);
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetwork();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void s(OtaPollingWorker otaPollingWorker, String str, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = p.k();
        }
        otaPollingWorker.r(str, list);
    }

    public static final URLConnection t(Network network, URL it) {
        Intrinsics.checkNotNullParameter(network, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        return network.openConnection(it);
    }

    public static final String x(SharedPreferences sharedPreferences, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return sharedPreferences.getString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + it, null);
    }

    public static final List y(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.H0(StringsKt.split$default(it, new String[]{":"}, false, 3, 2, null), 2);
    }

    public static final boolean z(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0274 A[Catch: all -> 0x02d4, TRY_LEAVE, TryCatch #1 {all -> 0x02d4, blocks: (B:25:0x0270, B:27:0x0274, B:30:0x02d6), top: B:24:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02d6 A[Catch: all -> 0x02d4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02d4, blocks: (B:25:0x0270, B:27:0x0274, B:30:0x02d6), top: B:24:0x0270 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // androidx.work.CoroutineWorker
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull mt.b<? super androidx.work.c.a> r24) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.scheduledwork.OtaPollingWorker.doWork(mt.b):java.lang.Object");
    }

    public final Object m(String str, File file, mt.b<? super Unit> bVar) {
        File file2 = new File(file.getParent(), file.getName() + ".tmp." + getId());
        try {
            HttpURLConnection u8 = u(str);
            int responseCode = u8.getResponseCode();
            if (responseCode != 200) {
                throw new IOException("HTTP " + responseCode + " downloading blob " + str);
            }
            Log.i("OtaPollingWorker", "OtaPollingWorker: blob HTTP " + responseCode + " contentLength=" + u8.getContentLengthLong() + " dest=" + file.getName());
            InputStream inputStream = u8.getInputStream();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    Intrinsics.checkNotNull(inputStream);
                    tt.b.b(inputStream, fileOutputStream, 0, 2, null);
                    c.a(fileOutputStream, null);
                    c.a(inputStream, null);
                    Log.i("OtaPollingWorker", "OtaPollingWorker: blob copy complete size=" + file2.length() + " dest=" + file.getName());
                    if (file2.renameTo(file)) {
                        return Unit.f22894a;
                    }
                    throw new IOException("Failed to rename " + file2 + " to " + file);
                } finally {
                }
            } finally {
            }
        } catch (Exception e10) {
            file2.delete();
            throw e10;
        }
    }

    public final String n(String message) {
        Object obj;
        Object obj2 = EnvironmentCompat.MEDIA_UNKNOWN;
        if (message == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        try {
            n.Companion companion = n.INSTANCE;
            obj = n.b(new URL(StringsKt.f1(message, " ", null, 2, null)).getHost());
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            obj = n.b(o.a(th2));
        }
        if (!n.g(obj)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public final Object o(String str, mt.b<? super JSONArray> bVar) {
        HttpURLConnection u8 = u(str);
        int responseCode = u8.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("HTTP " + responseCode + " fetching " + str);
        }
        InputStream inputStream = u8.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
        try {
            String h10 = tt.n.h(bufferedReader);
            c.a(bufferedReader, null);
            return new JSONArray(h10);
        } finally {
        }
    }

    public final boolean p() {
        return getInputData().c("flags_from_schedule", false);
    }

    public final boolean q() {
        SharedPreferences U = a1.U(this.context);
        a.Companion companion = kotlin.time.a.INSTANCE;
        long j10 = U.getLong("last_startup_time", 0L);
        iu.b bVar = iu.b.f21120d;
        return kotlin.time.a.j(kotlin.time.a.L(kotlin.time.b.q(System.currentTimeMillis(), bVar), kotlin.time.b.q(j10, bVar)), kotlin.time.b.q((long) getInputData().d("inactivity_days", 3), iu.b.f21124h)) <= 0;
    }

    public final void r(String eventName, List<? extends NameValuePair> extraParams) {
        OtaConfigHandler.INSTANCE.logEvent$NativeShell_googleProdRelease(eventName, "background_ota_worker", extraParams);
    }

    public final HttpURLConnection u(String url) {
        URLConnection openConnection;
        Network invoke = getInputData().c("bind_network", false) ? (Build.VERSION.SDK_INT < 28 || getNetwork() == null) ? f9402f.invoke(this.context) : getNetwork() : null;
        if (invoke == null || (openConnection = f9401e.invoke(invoke, new URL(url))) == null) {
            openConnection = new URL(url).openConnection();
        }
        Intrinsics.d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout((int) kotlin.time.a.w(f9399c));
        httpURLConnection.setReadTimeout((int) kotlin.time.a.w(f9400d));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r33, java.lang.String r34, android.content.SharedPreferences r35, mt.b<? super com.roblox.client.scheduledwork.OtaPollingWorker.PollResult> r36) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.scheduledwork.OtaPollingWorker.v(java.lang.String, java.lang.String, android.content.SharedPreferences, mt.b):java.lang.Object");
    }

    public final void w(final SharedPreferences prefs, Set<String> behaviorNames) {
        int i10;
        Iterator<String> it = behaviorNames.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            String string = prefs.getString(OtaConfigHandler.KEY_WORKER_PENDING_PREFIX + next, null);
            if (string != null) {
                List split$default = StringsKt.split$default(string, new String[]{":"}, false, 0, 6, null);
                List list = split$default.size() >= 2 ? split$default : null;
                if (list != null) {
                    if (!new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs/WorkerBlob_" + ((String) list.get(0)) + "_" + ((String) list.get(1))).exists()) {
                        Log.i("OtaPollingWorker", "OtaPollingWorker: clearing marker for missing blob " + next + "=" + string);
                        r("ota_polling_worker_orphan_marker_cleared", kotlin.collections.o.d(new NameValuePair("behavior_name", next)));
                        OtaConfigHandler.INSTANCE.clearPendingWorkerBlob(prefs, next);
                    }
                }
            }
        }
        File file = new File(this.context.getFilesDir(), "appData/OTAWorkerBlobs");
        if (file.exists()) {
            Set A = hu.p.A(hu.p.x(hu.p.p(hu.p.x(hu.p.y(CollectionsKt.U(behaviorNames), new Function1() { // from class: sj.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String x10;
                    x10 = OtaPollingWorker.x(prefs, (String) obj);
                    return x10;
                }
            }), new Function1() { // from class: sj.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List y10;
                    y10 = OtaPollingWorker.y((String) obj);
                    return y10;
                }
            }), new Function1() { // from class: sj.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean z10;
                    z10 = OtaPollingWorker.z((List) obj);
                    return Boolean.valueOf(z10);
                }
            }), new Function1() { // from class: sj.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String A2;
                    A2 = OtaPollingWorker.A((List) obj);
                    return A2;
                }
            }));
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!A.contains(file2.getName())) {
                        Log.i("OtaPollingWorker", "OtaPollingWorker: pruning orphaned blob " + file2.getName());
                        r("ota_polling_worker_orphan_blob_pruned", kotlin.collections.o.d(new NameValuePair("blob_name", file2.getName())));
                        file2.delete();
                    }
                }
            }
        }
    }
}
