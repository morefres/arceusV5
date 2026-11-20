package nb;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.internal.measurement.vf;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import ie.u;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class qa extends b5 {

    /* renamed from: c, reason: collision with root package name */
    public da f26594c;

    /* renamed from: d, reason: collision with root package name */
    public u8 f26595d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f26596e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26597f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f26598g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f26599h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26600i;

    /* renamed from: j, reason: collision with root package name */
    public int f26601j;

    /* renamed from: k, reason: collision with root package name */
    public w f26602k;

    /* renamed from: l, reason: collision with root package name */
    public w f26603l;

    /* renamed from: m, reason: collision with root package name */
    public PriorityQueue f26604m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26605n;

    /* renamed from: o, reason: collision with root package name */
    public q8 f26606o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicLong f26607p;

    /* renamed from: q, reason: collision with root package name */
    public long f26608q;

    /* renamed from: r, reason: collision with root package name */
    public final cf f26609r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26610s;

    /* renamed from: t, reason: collision with root package name */
    public w f26611t;

    /* renamed from: u, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f26612u;

    /* renamed from: v, reason: collision with root package name */
    public w f26613v;

    /* renamed from: w, reason: collision with root package name */
    public final ue f26614w;

    public qa(g7 g7Var) {
        super(g7Var);
        this.f26596e = new CopyOnWriteArraySet();
        this.f26599h = new Object();
        this.f26600i = false;
        this.f26601j = 1;
        this.f26610s = true;
        this.f26614w = new s9(this);
        this.f26598g = new AtomicReference();
        this.f26606o = q8.f26588c;
        this.f26608q = -1L;
        this.f26607p = new AtomicLong(0L);
        this.f26609r = new cf(g7Var);
    }

    public final void A(String str, String str2, long j10, Object obj) {
        this.f26328a.b().t(new j9(this, str, str2, obj, j10));
    }

    public final void B(String str, String str2, Object obj, long j10) {
        n9.m.f(str);
        n9.m.f(str2);
        h();
        j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j11 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    g7 g7Var = this.f26328a;
                    Long valueOf = Long.valueOf(j11);
                    g7Var.x().f26382n.b(valueOf.longValue() == 1 ? "true" : "false");
                    obj = valueOf;
                    str2 = "_npa";
                    this.f26328a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
                    obj2 = obj;
                }
            }
            if (obj == null) {
                this.f26328a.x().f26382n.b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f26328a.a().w().c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        g7 g7Var2 = this.f26328a;
        if (!g7Var2.g()) {
            this.f26328a.a().w().a("User property not set since app measurement is disabled");
        } else if (g7Var2.m()) {
            this.f26328a.J().o(new zzpl(str4, j10, obj3, str));
        }
    }

    public final Map C(String str, String str2, boolean z10) {
        g7 g7Var = this.f26328a;
        if (g7Var.b().p()) {
            g7Var.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        g7Var.c();
        if (f.a()) {
            g7Var.a().o().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f26328a.b().u(atomicReference, 5000L, "get user properties", new q9(this, atomicReference, null, str, str2, z10));
        List<zzpl> list = (List) atomicReference.get();
        if (list == null) {
            g7Var.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
            return Collections.EMPTY_MAP;
        }
        w1.a aVar = new w1.a(list.size());
        for (zzpl zzplVar : list) {
            Object zza = zzplVar.zza();
            if (zza != null) {
                aVar.put(zzplVar.f7488g, zza);
            }
        }
        return aVar;
    }

    public final String D() {
        return (String) this.f26598g.get();
    }

    public final void E(String str) {
        this.f26598g.set(str);
    }

    public final void F() {
        h();
        g7 g7Var = this.f26328a;
        if (g7Var.x().f26389u.a()) {
            g7Var.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a10 = g7Var.x().f26390v.a();
        g7Var.x().f26390v.b(1 + a10);
        g7Var.w();
        if (a10 >= 5) {
            g7Var.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            g7Var.x().f26389u.b(true);
        } else {
            if (this.f26611t == null) {
                this.f26611t = new l9(this, this.f26328a);
            }
            this.f26611t.b(0L);
        }
    }

    public final void G(long j10) {
        this.f26598g.set(null);
        this.f26328a.b().t(new m9(this, j10));
    }

    public final void H() {
        h();
        j();
        if (this.f26328a.m()) {
            g7 g7Var = this.f26328a;
            k w5 = g7Var.w();
            w5.f26328a.c();
            Boolean J = w5.J("google_analytics_deferred_deep_link_enabled");
            if (J != null && J.booleanValue()) {
                g7Var.a().v().a("Deferred Deep Link feature enabled.");
                g7Var.b().t(new Runnable() { // from class: nb.na
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        qa.this.F();
                    }
                });
            }
            this.f26328a.J().s();
            this.f26610s = false;
            k6 x10 = g7Var.x();
            x10.h();
            String string = x10.p().getString("previous_os_version", null);
            x10.f26328a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = x10.p().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            g7Var.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(u8 u8Var) {
        u8 u8Var2;
        h();
        j();
        if (u8Var != null && u8Var != (u8Var2 = this.f26595d)) {
            n9.m.q(u8Var2 == null, "EventInterceptor already set.");
        }
        this.f26595d = u8Var;
    }

    public final void J(v8 v8Var) {
        j();
        n9.m.l(v8Var);
        if (this.f26596e.add(v8Var)) {
            return;
        }
        this.f26328a.a().r().a("OnEventListener already registered");
    }

    public final void K(v8 v8Var) {
        j();
        n9.m.l(v8Var);
        if (this.f26596e.remove(v8Var)) {
            return;
        }
        this.f26328a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        n9.m.f(str);
        this.f26328a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.f26328a.e().a());
    }

    public final void N(Bundle bundle, long j10) {
        n9.m.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f26328a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        n9.m.l(bundle2);
        m8.b(bundle2, "app_id", String.class, null);
        m8.b(bundle2, "origin", String.class, null);
        m8.b(bundle2, "name", String.class, null);
        m8.b(bundle2, "value", Object.class, null);
        m8.b(bundle2, "trigger_event_name", String.class, null);
        m8.b(bundle2, "trigger_timeout", Long.class, 0L);
        m8.b(bundle2, "timed_out_event_name", String.class, null);
        m8.b(bundle2, "timed_out_event_params", Bundle.class, null);
        m8.b(bundle2, "triggered_event_name", String.class, null);
        m8.b(bundle2, "triggered_event_params", Bundle.class, null);
        m8.b(bundle2, "time_to_live", Long.class, 0L);
        m8.b(bundle2, "expired_event_name", String.class, null);
        m8.b(bundle2, "expired_event_params", Bundle.class, null);
        n9.m.f(bundle2.getString("name"));
        n9.m.f(bundle2.getString("origin"));
        n9.m.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        g7 g7Var = this.f26328a;
        if (g7Var.C().y0(string) != 0) {
            g7Var.a().o().b("Invalid conditional user property name", g7Var.D().c(string));
            return;
        }
        if (g7Var.C().y(string, obj) != 0) {
            g7Var.a().o().c("Invalid conditional user property value", g7Var.D().c(string), obj);
            return;
        }
        Object z10 = g7Var.C().z(string, obj);
        if (z10 == null) {
            g7Var.a().o().c("Unable to normalize conditional user property value", g7Var.D().c(string), obj);
            return;
        }
        m8.a(bundle2, z10);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            g7Var.w();
            if (j11 > 15552000000L || j11 < 1) {
                g7Var.a().o().c("Invalid conditional user property timeout", g7Var.D().c(string), Long.valueOf(j11));
                return;
            }
        }
        long j12 = bundle2.getLong("time_to_live");
        g7Var.w();
        if (j12 > 15552000000L || j12 < 1) {
            g7Var.a().o().c("Invalid conditional user property time to live", g7Var.D().c(string), Long.valueOf(j12));
        } else {
            g7Var.b().t(new n9(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        g7 g7Var = this.f26328a;
        long a10 = g7Var.e().a();
        n9.m.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a10);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        g7Var.b().t(new o9(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        g7 g7Var = this.f26328a;
        if (g7Var.b().p()) {
            g7Var.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        g7Var.c();
        if (f.a()) {
            g7Var.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f26328a.b().u(atomicReference, 5000L, "get conditional user properties", new p9(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ve.h0(list);
        }
        g7Var.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        bb u8 = this.f26328a.I().u();
        if (u8 != null) {
            return u8.f26068a;
        }
        return null;
    }

    public final String R() {
        bb u8 = this.f26328a.I().u();
        if (u8 != null) {
            return u8.b;
        }
        return null;
    }

    public final String S() {
        try {
            return ab.a(this.f26328a.d(), "google_app_id", this.f26328a.H());
        } catch (IllegalStateException e10) {
            this.f26328a.a().o().b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    public final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        g7 g7Var = this.f26328a;
        if (!g7Var.w().H(null, z4.f26854a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                g7Var.a().w().a("IABTCF_TCString change picked up in listener.");
                ((w) n9.m.l(this.f26613v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            g7Var.a().w().a("IABTCF_TCString change picked up in listener.");
            ((w) n9.m.l(this.f26613v)).b(500L);
        }
    }

    public final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i10;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            g7 g7Var = this.f26328a;
            bundle2 = new Bundle(g7Var.x().f26394z.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (g7Var.C().B0(obj)) {
                        g7Var.C().B(this.f26614w, null, 27, null, null, 0);
                    }
                    g7Var.a().t().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (ve.N(next)) {
                    g7Var.a().t().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (g7Var.C().C0("param", next, g7Var.w().x(null, false), obj)) {
                    g7Var.C().A(bundle2, next, obj);
                }
            }
            g7Var.C();
            int v5 = g7Var.w().v();
            if (bundle2.size() > v5) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i10++;
                    if (i10 > v5) {
                        bundle2.remove(str);
                    }
                }
                g7Var.C().B(this.f26614w, null, 26, null, null, 0);
                g7Var.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        g7 g7Var2 = this.f26328a;
        g7Var2.x().f26394z.b(bundle2);
        if (!bundle.isEmpty() || g7Var2.w().H(null, z4.X0)) {
            this.f26328a.J().v(bundle2);
        }
    }

    public final /* synthetic */ void V(int i10) {
        if (this.f26602k == null) {
            this.f26602k = new c9(this, this.f26328a);
        }
        this.f26602k.b(i10 * 1000);
    }

    public final /* synthetic */ void W(Boolean bool, boolean z10) {
        f0(bool, true);
    }

    public final /* synthetic */ void X(q8 q8Var, long j10, boolean z10, boolean z11) {
        h();
        j();
        g7 g7Var = this.f26328a;
        q8 w5 = g7Var.x().w();
        if (j10 <= this.f26608q && q8.u(w5.b(), q8Var.b())) {
            g7Var.a().u().b("Dropped out-of-date consent setting, proposed settings", q8Var);
            return;
        }
        k6 x10 = g7Var.x();
        g7 g7Var2 = x10.f26328a;
        x10.h();
        int b = q8Var.b();
        if (!x10.v(b)) {
            g7Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(q8Var.b()));
            return;
        }
        g7 g7Var3 = this.f26328a;
        SharedPreferences.Editor edit = x10.p().edit();
        edit.putString("consent_settings", q8Var.l());
        edit.putInt("consent_source", b);
        edit.apply();
        g7Var.a().w().b("Setting storage consent(FE)", q8Var);
        this.f26608q = j10;
        if (g7Var3.J().D()) {
            g7Var3.J().Z(z10);
        } else {
            g7Var3.J().Y(z10);
        }
        if (z11) {
            g7Var3.J().q(new AtomicReference());
        }
    }

    public final /* synthetic */ void Z(boolean z10) {
        this.f26600i = false;
    }

    public final /* synthetic */ int a0() {
        return this.f26601j;
    }

    public final /* synthetic */ void b0(int i10) {
        this.f26601j = i10;
    }

    public final /* synthetic */ w c0() {
        return this.f26611t;
    }

    public final /* synthetic */ int d0(Throwable th2) {
        String message = th2.getMessage();
        this.f26605n = false;
        if (message == null) {
            return 2;
        }
        if (!(th2 instanceof IllegalStateException) && !message.contains("garbage collected") && !th2.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th2 instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f26605n = true;
        return 1;
    }

    public final ya e0(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.f7480h).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String s8 = this.f26328a.L().s();
            g7 g7Var = this.f26328a;
            u5 w5 = g7Var.a().w();
            Long valueOf = Long.valueOf(zzomVar.f7478f);
            w5.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, zzomVar.f7480h, Integer.valueOf(zzomVar.f7479g.length));
            if (!TextUtils.isEmpty(zzomVar.f7484l)) {
                g7Var.a().w().c("[sgtm] Uploading data from app. row_id", valueOf, zzomVar.f7484l);
            }
            HashMap hashMap = new HashMap();
            Bundle bundle = zzomVar.f7481i;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            va F = g7Var.F();
            byte[] bArr = zzomVar.f7479g;
            sa saVar = new sa() { // from class: nb.ea
                /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
                @Override // nb.sa
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
                    /*
                        r6 = this;
                        nb.qa r7 = nb.qa.this
                        r7.h()
                        com.google.android.gms.measurement.internal.zzom r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        nb.g7 r8 = r7.f26328a
                        nb.w5 r8 = r8.a()
                        nb.u5 r8 = r8.w()
                        long r0 = r10.f7478f
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.b(r11, r9)
                        nb.ya r8 = nb.ya.SUCCESS
                        goto L69
                    L2e:
                        nb.g7 r11 = r7.f26328a
                        nb.w5 r11 = r11.a()
                        nb.u5 r11 = r11.r()
                        long r0 = r10.f7478f
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.d(r2, r0, r1, r9)
                        nb.y4 r9 = nb.z4.f26903u
                        r11 = 0
                        java.lang.Object r9 = r9.b(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        nb.ya r8 = nb.ya.BACKOFF
                        goto L69
                    L67:
                        nb.ya r8 = nb.ya.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r9 = r2
                        nb.g7 r11 = r7.f26328a
                        nb.tc r11 = r11.J()
                        com.google.android.gms.measurement.internal.zzaf r0 = new com.google.android.gms.measurement.internal.zzaf
                        long r1 = r10.f7478f
                        int r3 = r8.zza()
                        long r4 = r10.f7483k
                        r0.<init>(r1, r3, r4)
                        r11.k0(r0)
                        nb.g7 r7 = r7.f26328a
                        nb.w5 r7 = r7.a()
                        nb.u5 r7 = r7.w()
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r11 = "[sgtm] Updated status for row_id"
                        r7.c(r11, r10, r8)
                        monitor-enter(r9)
                        r9.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r9.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: nb.ea.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            F.l();
            n9.m.l(url);
            n9.m.l(bArr);
            n9.m.l(saVar);
            F.f26328a.b().w(new ua(F, s8, url, bArr, hashMap, saVar));
            try {
                g7 g7Var2 = g7Var.C().f26328a;
                long a10 = g7Var2.e().a();
                long j10 = a10 + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                synchronized (atomicReference) {
                    for (long j11 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS; atomicReference.get() == null && j11 > 0; j11 = j10 - g7Var2.e().a()) {
                        try {
                            atomicReference.wait(j11);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f26328a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? ya.UNKNOWN : (ya) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e10) {
            this.f26328a.a().o().d("[sgtm] Bad upload url for row_id", zzomVar.f7480h, Long.valueOf(zzomVar.f7478f), e10);
            return ya.FAILURE;
        }
    }

    public final void f0(Boolean bool, boolean z10) {
        h();
        j();
        g7 g7Var = this.f26328a;
        g7Var.a().v().b("Setting app measurement enabled (FE)", bool);
        g7Var.x().s(bool);
        if (z10) {
            k6 x10 = g7Var.x();
            g7 g7Var2 = x10.f26328a;
            x10.h();
            SharedPreferences.Editor edit = x10.p().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f26328a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        qa qaVar;
        h();
        g7 g7Var = this.f26328a;
        String a10 = g7Var.x().f26382n.a();
        if (a10 == null) {
            qaVar = this;
        } else if ("unset".equals(a10)) {
            qaVar = this;
            qaVar.B(Payload.TYPE_APP, "_npa", null, g7Var.e().a());
        } else {
            B(Payload.TYPE_APP, "_npa", Long.valueOf(true != "true".equals(a10) ? 0L : 1L), g7Var.e().a());
            qaVar = this;
        }
        if (!qaVar.f26328a.g() || !qaVar.f26610s) {
            g7Var.a().v().a("Updating Scion state (FE)");
            qaVar.f26328a.J().X();
        } else {
            g7Var.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            qaVar.f26328a.z().f26437e.a();
            g7Var.b().t(new e9(this));
        }
    }

    public final void h0() {
        g7 g7Var = this.f26328a;
        if (!(g7Var.d().getApplicationContext() instanceof Application) || this.f26594c == null) {
            return;
        }
        ((Application) g7Var.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f26594c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f26328a.b().u(atomicReference, 15000L, "boolean test flag value", new k9(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f26328a.b().u(atomicReference, 15000L, "String test flag value", new t9(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f26328a.b().u(atomicReference, 15000L, "long test flag value", new u9(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f26328a.b().u(atomicReference, 15000L, "int test flag value", new v9(this, atomicReference));
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f26328a.b().u(atomicReference, 15000L, "double test flag value", new w9(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.f26328a.b().t(new x9(this, bool));
    }

    public final void o(q8 q8Var) {
        h();
        boolean z10 = (q8Var.o(p8.ANALYTICS_STORAGE) && q8Var.o(p8.AD_STORAGE)) || this.f26328a.J().C();
        g7 g7Var = this.f26328a;
        if (z10 != g7Var.j()) {
            g7Var.i(z10);
            k6 x10 = this.f26328a.x();
            g7 g7Var2 = x10.f26328a;
            x10.h();
            Boolean valueOf = x10.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(x10.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || valueOf == null || valueOf.booleanValue()) {
                f0(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void o0(Bundle bundle, int i10, long j10) {
        Object obj;
        String string;
        j();
        q8 q8Var = q8.f26588c;
        p8[] b = o8.STORAGE.b();
        int length = b.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            String str = b[i11].f26558a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i11++;
        }
        if (obj != null) {
            g7 g7Var = this.f26328a;
            g7Var.a().t().b("Ignoring invalid consent setting", obj);
            g7Var.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean p8 = this.f26328a.b().p();
        q8 e10 = q8.e(bundle, i10);
        if (e10.c()) {
            q0(e10, p8);
        }
        x h10 = x.h(bundle, i10);
        if (h10.d()) {
            p0(h10, p8);
        }
        Boolean i12 = x.i(bundle);
        if (i12 != null) {
            String str2 = i10 == -30 ? "tcf" : Payload.TYPE_APP;
            if (p8) {
                B(str2, "allow_personalized_ads", i12.toString(), j10);
            } else {
                z(str2, "allow_personalized_ads", i12.toString(), false, j10);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.f26328a.e().a());
    }

    public final void p0(x xVar, boolean z10) {
        y9 y9Var = new y9(this, xVar);
        if (!z10) {
            this.f26328a.b().t(y9Var);
        } else {
            h();
            y9Var.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f26328a.I().s(bundle2, j10);
            return;
        }
        boolean z12 = true;
        if (z11 && this.f26595d != null && !ve.N(str2)) {
            z12 = false;
        }
        boolean z13 = z12;
        if (str == null) {
            str = Payload.TYPE_APP;
        }
        x(str, str2, j10, bundle2, z11, z13, z10, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void q0(nb.q8 r10, boolean r11) {
        /*
            r9 = this;
            r9.j()
            int r0 = r10.b()
            r1 = -10
            if (r0 == r1) goto L2a
            nb.n8 r2 = r10.p()
            nb.n8 r3 = nb.n8.UNINITIALIZED
            if (r2 != r3) goto L2a
            nb.n8 r2 = r10.q()
            if (r2 == r3) goto L1a
            goto L2a
        L1a:
            nb.g7 r10 = r9.f26328a
            nb.w5 r10 = r10.a()
            nb.u5 r10 = r10.t()
            java.lang.String r11 = "Ignoring empty consent settings"
            r10.a(r11)
            return
        L2a:
            java.lang.Object r2 = r9.f26599h
            monitor-enter(r2)
            nb.q8 r3 = r9.f26606o     // Catch: java.lang.Throwable -> Lcb
            int r3 = r3.b()     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = nb.q8.u(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            r4 = 0
            if (r3 == 0) goto L64
            nb.q8 r3 = r9.f26606o     // Catch: java.lang.Throwable -> L53
            boolean r3 = r10.r(r3)     // Catch: java.lang.Throwable -> L53
            nb.p8 r5 = nb.p8.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.o(r5)     // Catch: java.lang.Throwable -> L53
            r7 = 1
            if (r6 == 0) goto L58
            nb.q8 r6 = r9.f26606o     // Catch: java.lang.Throwable -> L53
            boolean r5 = r6.o(r5)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto L58
            r4 = r7
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto Lce
        L58:
            nb.q8 r5 = r9.f26606o     // Catch: java.lang.Throwable -> L53
            nb.q8 r10 = r10.t(r5)     // Catch: java.lang.Throwable -> L53
            r9.f26606o = r10     // Catch: java.lang.Throwable -> L53
            r8 = r4
            r4 = r7
        L62:
            r5 = r10
            goto L67
        L64:
            r3 = r4
            r8 = r3
            goto L62
        L67:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L7a
            nb.g7 r10 = r9.f26328a
            nb.w5 r10 = r10.a()
            nb.u5 r10 = r10.u()
            java.lang.String r11 = "Ignoring lower-priority consent settings, proposed settings"
            r10.b(r11, r5)
            return
        L7a:
            java.util.concurrent.atomic.AtomicLong r10 = r9.f26607p
            long r6 = r10.getAndIncrement()
            if (r3 == 0) goto La1
            java.util.concurrent.atomic.AtomicReference r10 = r9.f26598g
            r0 = 0
            r10.set(r0)
            nb.z9 r3 = new nb.z9
            r4 = r9
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto L97
            r9.h()
            r3.run()
            return
        L97:
            nb.g7 r10 = r4.f26328a
            nb.c7 r10 = r10.b()
            r10.v(r3)
            return
        La1:
            r4 = r9
            nb.aa r3 = new nb.aa
            r3.<init>(r4, r5, r6, r8)
            if (r11 == 0) goto Lb0
            r9.h()
            r3.run()
            return
        Lb0:
            r10 = 30
            if (r0 == r10) goto Lc1
            if (r0 != r1) goto Lb7
            goto Lc1
        Lb7:
            nb.g7 r10 = r4.f26328a
            nb.c7 r10 = r10.b()
            r10.t(r3)
            return
        Lc1:
            nb.g7 r10 = r4.f26328a
            nb.c7 r10 = r10.b()
            r10.v(r3)
            return
        Lcb:
            r0 = move-exception
            r4 = r9
        Lcd:
            r10 = r0
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld0
            throw r10
        Ld0:
            r0 = move-exception
            goto Lcd
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.qa.q0(nb.q8, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        g7 g7Var;
        md mdVar;
        md mdVar2;
        com.google.android.gms.internal.measurement.p9 p9Var;
        h();
        g7 g7Var2 = this.f26328a;
        g7Var2.a().v().a("Handle tcf update.");
        SharedPreferences q10 = g7Var2.x().q();
        HashMap hashMap = new HashMap();
        y4 y4Var = z4.f26854a1;
        if (((Boolean) y4Var.b(null)).booleanValue()) {
            ie.t tVar = od.f26527a;
            com.google.android.gms.internal.measurement.o9 o9Var = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            nd ndVar = nd.CONSENT;
            Map.Entry a10 = pa.a(o9Var, ndVar);
            int i10 = 2;
            com.google.android.gms.internal.measurement.o9 o9Var2 = com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            int i11 = 1;
            nd ndVar2 = nd.FLEXIBLE_LEGITIMATE_INTEREST;
            g7Var = g7Var2;
            ie.u o8 = ie.u.o(a10, pa.a(o9Var2, ndVar2), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, ndVar), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, ndVar), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, ndVar2), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, ndVar2), pa.a(com.google.android.gms.internal.measurement.o9.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, ndVar2));
            ie.w u8 = ie.w.u("CH");
            char[] cArr = new char[5];
            boolean contains = q10.contains("IABTCF_TCString");
            int b = od.b(q10, "IABTCF_CmpSdkID");
            int b10 = od.b(q10, "IABTCF_PolicyVersion");
            int b11 = od.b(q10, "IABTCF_gdprApplies");
            int b12 = od.b(q10, "IABTCF_PurposeOneTreatment");
            int b13 = od.b(q10, "IABTCF_EnableAdvertiserConsentMode");
            String a11 = od.a(q10, "IABTCF_PublisherCC");
            u.a a12 = ie.u.a();
            ie.y0 it = o8.keySet().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.o9 o9Var3 = (com.google.android.gms.internal.measurement.o9) it.next();
                int zza = o9Var3.zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 28);
                sb2.append("IABTCF_PublisherRestrictions");
                sb2.append(zza);
                String a13 = od.a(q10, sb2.toString());
                if (TextUtils.isEmpty(a13) || a13.length() < 755) {
                    p9Var = com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int digit = Character.digit(a13.charAt(754), 10);
                    p9Var = (digit < 0 || digit > com.google.android.gms.internal.measurement.p9.values().length || digit == 0) ? com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_NOT_ALLOWED : digit != i11 ? digit != i10 ? com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_UNDEFINED : com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : com.google.android.gms.internal.measurement.p9.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                a12.f(o9Var3, p9Var);
                i10 = 2;
                i11 = 1;
            }
            ie.u c10 = a12.c();
            String a14 = od.a(q10, "IABTCF_PurposeConsents");
            String a15 = od.a(q10, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(a15) && a15.length() >= 755 && a15.charAt(754) == '1';
            String a16 = od.a(q10, "IABTCF_PurposeLegitimateInterests");
            String a17 = od.a(q10, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(a17) && a17.length() >= 755 && a17.charAt(754) == '1';
            cArr[0] = '2';
            mdVar = new md(od.d(o8, c10, u8, cArr, b, b13, b11, b10, b12, a11, a14, a16, z10, z11, contains));
        } else {
            g7Var = g7Var2;
            String a18 = od.a(q10, "IABTCF_VendorConsents");
            if (!"".equals(a18) && a18.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a18.charAt(754)));
            }
            int b14 = od.b(q10, "IABTCF_gdprApplies");
            if (b14 != -1) {
                hashMap.put("gdprApplies", String.valueOf(b14));
            }
            int b15 = od.b(q10, "IABTCF_EnableAdvertiserConsentMode");
            if (b15 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(b15));
            }
            int b16 = od.b(q10, "IABTCF_PolicyVersion");
            if (b16 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(b16));
            }
            String a19 = od.a(q10, "IABTCF_PurposeConsents");
            if (!"".equals(a19)) {
                hashMap.put("PurposeConsents", a19);
            }
            int b17 = od.b(q10, "IABTCF_CmpSdkID");
            if (b17 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(b17));
            }
            mdVar = new md(hashMap);
        }
        g7Var.a().w().b("Tcf preferences read", mdVar);
        if (!g7Var.w().H(null, y4Var)) {
            if (g7Var.x().x(mdVar)) {
                Bundle b18 = mdVar.b();
                g7Var.a().w().b("Consent generated from Tcf", b18);
                if (b18 != Bundle.EMPTY) {
                    o0(b18, -30, g7Var.e().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", mdVar.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        k6 x10 = g7Var.x();
        x10.h();
        String string = x10.p().getString("stored_tcf_param", "");
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            mdVar2 = new md(hashMap2);
        } else {
            for (String str : string.split(";")) {
                String[] split = str.split("=");
                if (split.length >= 2 && od.f26527a.contains(split[0])) {
                    hashMap2.put(split[0], split[1]);
                }
            }
            mdVar2 = new md(hashMap2);
        }
        if (g7Var.x().x(mdVar)) {
            Bundle b19 = mdVar.b();
            g7Var.a().w().b("Consent generated from Tcf", b19);
            if (b19 != Bundle.EMPTY) {
                o0(b19, -30, g7Var.e().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", mdVar.d(mdVar2));
            bundle2.putString("_tcfd2", mdVar.c());
            bundle2.putString("_tcfd", mdVar.e());
            t("auto", "_tcf", bundle2);
        }
    }

    public final void r0(Runnable runnable) {
        j();
        g7 g7Var = this.f26328a;
        if (g7Var.b().p()) {
            g7Var.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (g7Var.b().q()) {
            g7Var.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        g7Var.c();
        if (f.a()) {
            g7Var.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        g7Var.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (!z10) {
            g7Var.a().w().a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            g7Var.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: nb.oa
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    qa.this.f26328a.J().j0(atomicReference, zzoo.a(za.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            List list = zzoqVar.f7486f;
            if (!list.isEmpty()) {
                g7Var.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                i10 += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    ya e02 = e0((zzom) it.next());
                    if (e02 == ya.SUCCESS) {
                        i11++;
                    } else if (e02 == ya.BACKOFF) {
                        z10 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        g7Var.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i10), Integer.valueOf(i11));
        runnable.run();
    }

    public final void s() {
        h();
        g7 g7Var = this.f26328a;
        g7Var.a().v().a("Register tcfPrefChangeListener.");
        if (this.f26612u == null) {
            this.f26613v = new h9(this, this.f26328a);
            this.f26612u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: nb.ka
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    qa.this.T(sharedPreferences, str);
                }
            };
        }
        g7Var.x().q().registerOnSharedPreferenceChangeListener(this.f26612u);
    }

    public final void s0(long j10) {
        h();
        if (this.f26603l == null) {
            this.f26603l = new z8(this, this.f26328a);
        }
        this.f26603l.b(j10);
    }

    public final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.f26328a.e().a(), bundle);
    }

    public final void t0() {
        h();
        w wVar = this.f26603l;
        if (wVar != null) {
            wVar.d();
        }
    }

    public final void u(String str, String str2, long j10, Bundle bundle) {
        h();
        boolean z10 = true;
        if (this.f26595d != null && !ve.N(str2)) {
            z10 = false;
        }
        v(str, str2, j10, bundle, true, z10, true, null);
    }

    public final void u0() {
        vf.a();
        g7 g7Var = this.f26328a;
        if (g7Var.w().H(null, z4.R0)) {
            if (g7Var.b().p()) {
                g7Var.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            g7Var.c();
            if (f.a()) {
                g7Var.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            g7Var.a().w().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            g7Var.b().u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: nb.ga
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    qa qaVar = qa.this;
                    qaVar.f26328a.J().i0(atomicReference, qaVar.f26328a.x().f26383o.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                g7Var.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                g7Var.b().t(new Runnable() { // from class: nb.ha
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        qa qaVar = qa.this;
                        qaVar.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray r8 = qaVar.f26328a.x().r();
                        for (zzoh zzohVar : list2) {
                            int i10 = zzohVar.f7477h;
                            if (!r8.contains(i10) || ((Long) r8.get(i10)).longValue() < zzohVar.f7476g) {
                                qaVar.w0().add(zzohVar);
                            }
                        }
                        qaVar.x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    public final void v(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        boolean z13;
        boolean z14;
        g7 g7Var;
        long j11;
        long j12;
        String str4;
        long j13;
        Bundle[] bundleArr;
        String str5 = str;
        n9.m.f(str5);
        n9.m.l(bundle);
        h();
        j();
        g7 g7Var2 = this.f26328a;
        if (!g7Var2.g()) {
            this.f26328a.a().v().a("Event not sent since app measurement is disabled");
            return;
        }
        List w5 = this.f26328a.L().w();
        if (w5 != null && !w5.contains(str2)) {
            this.f26328a.a().v().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f26597f) {
            this.f26597f = true;
            try {
                try {
                    (!g7Var2.G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f26328a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f26328a.d());
                } catch (Exception e10) {
                    this.f26328a.a().r().b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                this.f26328a.a().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        g7 g7Var3 = this.f26328a;
        if (!g7Var3.w().H(null, z4.f26871g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            g7Var3.c();
            B("auto", "_lgclid", bundle.getString("gclid"), g7Var3.e().a());
        }
        qa qaVar = this;
        g7Var3.c();
        if (z10 && ve.U(str2)) {
            g7Var3.C().w(bundle, g7Var3.x().f26394z.a());
        }
        if (!z12) {
            g7Var3.c();
            if (!"_iap".equals(str2)) {
                g7 g7Var4 = qaVar.f26328a;
                ve C = g7Var4.C();
                int i10 = 2;
                if (C.t0(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (C.v0(NotificationCompat.CATEGORY_EVENT, r8.f26630a, r8.b, str2)) {
                        C.f26328a.w();
                        if (C.w0(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i10 = 0;
                        }
                    } else {
                        i10 = 13;
                    }
                }
                if (i10 != 0) {
                    g7Var3.a().q().b("Invalid public event name. Event will not be logged (FE)", g7Var3.D().a(str2));
                    ve C2 = g7Var4.C();
                    g7Var4.w();
                    g7Var4.C().B(qaVar.f26614w, null, i10, "_ev", C2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        g7Var3.c();
        g7 g7Var5 = qaVar.f26328a;
        bb q10 = g7Var5.I().q(false);
        if (q10 != null && !bundle.containsKey("_sc")) {
            q10.f26070d = true;
        }
        ve.k0(q10, bundle, z10 && !z12);
        boolean equals = "am".equals(str5);
        boolean N = ve.N(str2);
        if (!z10 || qaVar.f26595d == null || N) {
            z13 = equals;
        } else {
            if (!equals) {
                g7Var3.a().v().c("Passing event to registered event handler (FE)", g7Var3.D().a(str2), g7Var3.D().e(bundle));
                n9.m.l(qaVar.f26595d);
                qaVar.f26595d.a(str5, str2, bundle, j10);
                return;
            }
            z13 = true;
        }
        g7 g7Var6 = qaVar.f26328a;
        if (g7Var6.m()) {
            int x02 = g7Var3.C().x0(str2);
            if (x02 != 0) {
                g7Var3.a().q().b("Invalid event name. Event will not be logged (FE)", g7Var3.D().a(str2));
                ve C3 = g7Var3.C();
                g7Var3.w();
                g7Var6.C().B(qaVar.f26614w, str3, x02, "_ev", C3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle t8 = g7Var3.C().t(str3, str2, bundle, u9.f.b("_o", "_sn", "_sc", "_si"), z12);
            n9.m.l(t8);
            g7Var3.c();
            if (g7Var5.I().q(false) == null || !"_ae".equals(str2)) {
                z14 = 0;
                g7Var = g7Var5;
                j11 = 0;
            } else {
                jd jdVar = g7Var5.z().f26438f;
                j11 = 0;
                long b = jdVar.f26347d.f26328a.e().b();
                boolean z15 = false;
                g7Var = g7Var5;
                long j14 = b - jdVar.b;
                jdVar.b = b;
                z14 = z15;
                if (j14 > 0) {
                    g7Var3.C().Z(t8, j14);
                    z14 = z15;
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                ve C4 = g7Var3.C();
                String string = t8.getString("_ffr");
                if (u9.o.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                g7 g7Var7 = C4.f26328a;
                if (Objects.equals(string, g7Var7.x().f26391w.a())) {
                    g7Var7.a().v().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                g7Var7.x().f26391w.b(string);
            } else if ("_ae".equals(str2)) {
                String a10 = g7Var3.C().f26328a.x().f26391w.a();
                if (!TextUtils.isEmpty(a10)) {
                    t8.putString("_ffr", a10);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(t8);
            boolean p8 = g7Var3.w().H(null, z4.V0) ? g7Var.z().p() : g7Var3.x().f26388t.a();
            if (g7Var3.x().f26385q.a() > j11 && g7Var3.x().A(j10) && p8) {
                g7Var3.a().w().a("Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                j12 = j11;
                B("auto", "_sid", null, g7Var3.e().a());
                B("auto", "_sno", null, g7Var3.e().a());
                B("auto", "_se", null, g7Var3.e().a());
                qaVar = this;
                g7Var3.x().f26386r.b(j12);
            } else {
                j12 = j11;
                str4 = "_ae";
            }
            if (t8.getLong("extend_session", j12) == 1) {
                g7Var3.a().w().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j13 = j10;
                g7Var6.z().f26437e.b(j13, true);
            } else {
                j13 = j10;
            }
            ArrayList arrayList2 = new ArrayList(t8.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i11 = z14; i11 < size; i11++) {
                String str6 = (String) arrayList2.get(i11);
                if (str6 != null) {
                    g7Var3.C();
                    Object obj = t8.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[z14] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        t8.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i12 = z14;
            while (i12 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i12);
                String str7 = i12 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str5);
                if (z11) {
                    bundle2 = g7Var3.C().Q(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                g7Var.J().c0(new zzbg(str7, new zzbe(bundle3), str5, j13), str3);
                if (!z13) {
                    Iterator it = qaVar.f26596e.iterator();
                    while (it.hasNext()) {
                        ((v8) it.next()).a(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i12++;
                str5 = str;
                j13 = j10;
            }
            g7Var3.c();
            if (g7Var.I().q(z14) == null || !str4.equals(str2)) {
                return;
            }
            g7Var.z().f26438f.d(true, true, g7Var3.e().b());
        }
    }

    public final boolean v0() {
        return this.f26605n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        g7.q();
        x("auto", str2, this.f26328a.e().a(), bundle, false, true, true, str3);
    }

    @TargetApi(BacktraceMetrics.defaultTimeIntervalInMin)
    public final PriorityQueue w0() {
        if (this.f26604m == null) {
            this.f26604m = new PriorityQueue(Comparator.comparing(new Function() { // from class: nb.ia
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    return Long.valueOf(((zzoh) obj).f7476g);
                }
            }, new Comparator() { // from class: nb.ja
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f26604m;
    }

    public final void x(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        String[] strArr = ve.f26743i;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i10];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelable);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        this.f26328a.b().t(new i9(this, str, str2, j10, bundle2, z10, z11, z12, str3));
    }

    @TargetApi(BacktraceMetrics.defaultTimeIntervalInMin)
    public final void x0() {
        zzoh zzohVar;
        h();
        this.f26605n = false;
        if (w0().isEmpty() || this.f26600i || (zzohVar = (zzoh) w0().poll()) == null) {
            return;
        }
        g7 g7Var = this.f26328a;
        r4.a H = g7Var.C().H();
        if (H != null) {
            this.f26600i = true;
            u5 w5 = g7Var.a().w();
            String str = zzohVar.f7475f;
            w5.b("Registering trigger URI", str);
            ne.x<Unit> c10 = H.c(Uri.parse(str));
            if (c10 != null) {
                ne.s.a(c10, new b9(this, zzohVar), new a9(this));
            } else {
                this.f26600i = false;
                w0().add(zzohVar);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z10) {
        z("auto", "_ldl", obj, true, this.f26328a.e().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            nb.g7 r5 = r0.f26328a
            nb.ve r5 = r5.C()
            int r5 = r5.y0(r2)
        L15:
            r12 = r5
            goto L41
        L17:
            nb.g7 r5 = r0.f26328a
            nb.ve r5 = r5.C()
            java.lang.String r6 = "user property"
            boolean r7 = r5.t0(r6, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = nb.t8.f26683a
            r9 = 0
            boolean r7 = r5.v0(r6, r7, r9, r2)
            if (r7 != 0) goto L34
            r5 = 15
            goto L15
        L34:
            nb.g7 r7 = r5.f26328a
            r7.w()
            boolean r5 = r5.w0(r6, r4, r2)
            if (r5 != 0) goto L40
            goto L26
        L40:
            r12 = r3
        L41:
            r5 = 1
            if (r12 == 0) goto L67
            nb.g7 r1 = r0.f26328a
            nb.ve r6 = r1.C()
            r1.w()
            java.lang.String r14 = r6.q(r2, r4, r5)
            if (r2 == 0) goto L57
            int r3 = r2.length()
        L57:
            r15 = r3
            nb.g7 r1 = r0.f26328a
            nb.ue r10 = r0.f26614w
            nb.ve r9 = r1.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r6 = "app"
            goto L6e
        L6c:
            r6 = r17
        L6e:
            if (r1 == 0) goto Lbb
            nb.g7 r7 = r0.f26328a
            nb.ve r8 = r7.C()
            int r12 = r8.y(r2, r1)
            if (r12 == 0) goto Laa
            nb.ve r6 = r7.C()
            r7.w()
            java.lang.String r14 = r6.q(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r3
            goto L9b
        L92:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L90
        L9b:
            nb.g7 r1 = r0.f26328a
            nb.ue r10 = r0.f26614w
            nb.ve r9 = r1.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            nb.ve r3 = r7.C()
            java.lang.Object r5 = r3.z(r2, r1)
            if (r5 == 0) goto Lba
            r3 = r21
            r1 = r6
            r0.A(r1, r2, r3, r5)
        Lba:
            return
        Lbb:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.A(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.qa.z(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }
}
