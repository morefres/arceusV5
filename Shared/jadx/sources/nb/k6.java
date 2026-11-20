package nb;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import backtraceio.library.services.BacktraceMetrics;
import q8.a;

/* loaded from: classes.dex */
public final class k6 extends k8 {
    public static final Pair A = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f26371c;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences f26372d;

    /* renamed from: e, reason: collision with root package name */
    public i6 f26373e;

    /* renamed from: f, reason: collision with root package name */
    public final h6 f26374f;

    /* renamed from: g, reason: collision with root package name */
    public final h6 f26375g;

    /* renamed from: h, reason: collision with root package name */
    public final j6 f26376h;

    /* renamed from: i, reason: collision with root package name */
    public String f26377i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f26378j;

    /* renamed from: k, reason: collision with root package name */
    public long f26379k;

    /* renamed from: l, reason: collision with root package name */
    public final h6 f26380l;

    /* renamed from: m, reason: collision with root package name */
    public final f6 f26381m;

    /* renamed from: n, reason: collision with root package name */
    public final j6 f26382n;

    /* renamed from: o, reason: collision with root package name */
    public final g6 f26383o;

    /* renamed from: p, reason: collision with root package name */
    public final f6 f26384p;

    /* renamed from: q, reason: collision with root package name */
    public final h6 f26385q;

    /* renamed from: r, reason: collision with root package name */
    public final h6 f26386r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f26387s;

    /* renamed from: t, reason: collision with root package name */
    public final f6 f26388t;

    /* renamed from: u, reason: collision with root package name */
    public final f6 f26389u;

    /* renamed from: v, reason: collision with root package name */
    public final h6 f26390v;

    /* renamed from: w, reason: collision with root package name */
    public final j6 f26391w;

    /* renamed from: x, reason: collision with root package name */
    public final j6 f26392x;

    /* renamed from: y, reason: collision with root package name */
    public final h6 f26393y;

    /* renamed from: z, reason: collision with root package name */
    public final g6 f26394z;

    public k6(g7 g7Var) {
        super(g7Var);
        this.f26380l = new h6(this, "session_timeout", BacktraceMetrics.defaultTimeIntervalMs);
        this.f26381m = new f6(this, "start_new_session", true);
        this.f26385q = new h6(this, "last_pause_time", 0L);
        this.f26386r = new h6(this, "session_id", 0L);
        this.f26382n = new j6(this, "non_personalized_ads", null);
        this.f26383o = new g6(this, "last_received_uri_timestamps_by_source", null);
        this.f26384p = new f6(this, "allow_remote_dynamite", false);
        this.f26374f = new h6(this, "first_open_time", 0L);
        this.f26375g = new h6(this, "app_install_time", 0L);
        this.f26376h = new j6(this, "app_instance_id", null);
        this.f26388t = new f6(this, "app_backgrounded", false);
        this.f26389u = new f6(this, "deep_link_retrieval_complete", false);
        this.f26390v = new h6(this, "deep_link_retrieval_attempts", 0L);
        this.f26391w = new j6(this, "firebase_feature_rollouts", null);
        this.f26392x = new j6(this, "deferred_attribution_cache", null);
        this.f26393y = new h6(this, "deferred_attribution_cache_timestamp", 0L);
        this.f26394z = new g6(this, "default_event_parameters", null);
    }

    public final boolean A(long j10) {
        return j10 - this.f26380l.a() > this.f26385q.a();
    }

    @Override // nb.k8
    public final boolean i() {
        return true;
    }

    @Override // nb.k8
    public final void j() {
        g7 g7Var = this.f26328a;
        SharedPreferences sharedPreferences = g7Var.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f26371c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f26387s = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f26371c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        g7Var.w();
        this.f26373e = new i6(this, "health_monitor", Math.max(0L, ((Long) z4.f26860d.b(null)).longValue()), null);
    }

    public final Pair o(String str) {
        h();
        if (!w().o(p8.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        g7 g7Var = this.f26328a;
        long b = g7Var.e().b();
        String str2 = this.f26377i;
        if (str2 != null && b < this.f26379k) {
            return new Pair(str2, Boolean.valueOf(this.f26378j));
        }
        this.f26379k = b + g7Var.w().D(str, z4.b);
        q8.a.b(true);
        try {
            a.C0516a a10 = q8.a.a(g7Var.d());
            this.f26377i = "";
            String a11 = a10.a();
            if (a11 != null) {
                this.f26377i = a11;
            }
            this.f26378j = a10.b();
        } catch (Exception e10) {
            this.f26328a.a().v().b("Unable to get advertising id", e10);
            this.f26377i = "";
        }
        q8.a.b(false);
        return new Pair(this.f26377i, Boolean.valueOf(this.f26378j));
    }

    public final SharedPreferences p() {
        h();
        l();
        n9.m.l(this.f26371c);
        return this.f26371c;
    }

    public final SharedPreferences q() {
        h();
        l();
        if (this.f26372d == null) {
            g7 g7Var = this.f26328a;
            String valueOf = String.valueOf(g7Var.d().getPackageName());
            u5 w5 = g7Var.a().w();
            String concat = valueOf.concat("_preferences");
            w5.b("Default prefs file", concat);
            this.f26372d = g7Var.d().getSharedPreferences(concat, 0);
        }
        return this.f26372d;
    }

    public final SparseArray r() {
        Bundle a10 = this.f26383o.a();
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f26328a.a().o().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final void s(Boolean bool) {
        h();
        SharedPreferences.Editor edit = p().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final Boolean t() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final x u() {
        h();
        return x.g(p().getString("dma_consent_settings", null));
    }

    public final boolean v(int i10) {
        return q8.u(i10, p().getInt("consent_source", 100));
    }

    public final q8 w() {
        h();
        return q8.f(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    public final boolean x(md mdVar) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String a10 = mdVar.a();
        if (a10.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = p().edit();
        edit.putString("stored_tcf_param", a10);
        edit.apply();
        return true;
    }

    public final void y(boolean z10) {
        h();
        this.f26328a.a().w().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = p().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean z() {
        SharedPreferences sharedPreferences = this.f26371c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
