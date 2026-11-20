package com.google.android.gms.internal.measurement;

import backtraceio.library.services.BacktraceMetrics;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes.dex */
public final class ie implements he {
    public static final l9 A;
    public static final l9 B;
    public static final l9 C;
    public static final l9 D;
    public static final l9 E;
    public static final l9 F;
    public static final l9 G;
    public static final l9 H;
    public static final l9 I;
    public static final l9 J;
    public static final l9 K;
    public static final l9 L;
    public static final l9 M;
    public static final l9 N;
    public static final l9 O;
    public static final l9 P;
    public static final l9 Q;
    public static final l9 R;
    public static final l9 S;
    public static final l9 T;
    public static final l9 U;
    public static final l9 V;
    public static final l9 W;
    public static final l9 X;
    public static final l9 Y;
    public static final l9 Z;

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6544a;

    /* renamed from: a0, reason: collision with root package name */
    public static final l9 f6545a0;
    public static final l9 b;

    /* renamed from: b0, reason: collision with root package name */
    public static final l9 f6546b0;

    /* renamed from: c, reason: collision with root package name */
    public static final l9 f6547c;

    /* renamed from: c0, reason: collision with root package name */
    public static final l9 f6548c0;

    /* renamed from: d, reason: collision with root package name */
    public static final l9 f6549d;

    /* renamed from: d0, reason: collision with root package name */
    public static final l9 f6550d0;

    /* renamed from: e, reason: collision with root package name */
    public static final l9 f6551e;

    /* renamed from: e0, reason: collision with root package name */
    public static final l9 f6552e0;

    /* renamed from: f, reason: collision with root package name */
    public static final l9 f6553f;

    /* renamed from: f0, reason: collision with root package name */
    public static final l9 f6554f0;

    /* renamed from: g, reason: collision with root package name */
    public static final l9 f6555g;

    /* renamed from: g0, reason: collision with root package name */
    public static final l9 f6556g0;

    /* renamed from: h, reason: collision with root package name */
    public static final l9 f6557h;

    /* renamed from: h0, reason: collision with root package name */
    public static final l9 f6558h0;

    /* renamed from: i, reason: collision with root package name */
    public static final l9 f6559i;

    /* renamed from: i0, reason: collision with root package name */
    public static final l9 f6560i0;

    /* renamed from: j, reason: collision with root package name */
    public static final l9 f6561j;

    /* renamed from: j0, reason: collision with root package name */
    public static final l9 f6562j0;

    /* renamed from: k, reason: collision with root package name */
    public static final l9 f6563k;

    /* renamed from: k0, reason: collision with root package name */
    public static final l9 f6564k0;

    /* renamed from: l, reason: collision with root package name */
    public static final l9 f6565l;

    /* renamed from: l0, reason: collision with root package name */
    public static final l9 f6566l0;

    /* renamed from: m, reason: collision with root package name */
    public static final l9 f6567m;

    /* renamed from: m0, reason: collision with root package name */
    public static final l9 f6568m0;

    /* renamed from: n, reason: collision with root package name */
    public static final l9 f6569n;

    /* renamed from: n0, reason: collision with root package name */
    public static final l9 f6570n0;

    /* renamed from: o, reason: collision with root package name */
    public static final l9 f6571o;

    /* renamed from: o0, reason: collision with root package name */
    public static final l9 f6572o0;

    /* renamed from: p, reason: collision with root package name */
    public static final l9 f6573p;

    /* renamed from: p0, reason: collision with root package name */
    public static final l9 f6574p0;

    /* renamed from: q, reason: collision with root package name */
    public static final l9 f6575q;

    /* renamed from: q0, reason: collision with root package name */
    public static final l9 f6576q0;

    /* renamed from: r, reason: collision with root package name */
    public static final l9 f6577r;

    /* renamed from: r0, reason: collision with root package name */
    public static final l9 f6578r0;

    /* renamed from: s, reason: collision with root package name */
    public static final l9 f6579s;

    /* renamed from: s0, reason: collision with root package name */
    public static final l9 f6580s0;

    /* renamed from: t, reason: collision with root package name */
    public static final l9 f6581t;

    /* renamed from: t0, reason: collision with root package name */
    public static final l9 f6582t0;

    /* renamed from: u, reason: collision with root package name */
    public static final l9 f6583u;

    /* renamed from: u0, reason: collision with root package name */
    public static final l9 f6584u0;

    /* renamed from: v, reason: collision with root package name */
    public static final l9 f6585v;

    /* renamed from: v0, reason: collision with root package name */
    public static final l9 f6586v0;

    /* renamed from: w, reason: collision with root package name */
    public static final l9 f6587w;

    /* renamed from: w0, reason: collision with root package name */
    public static final l9 f6588w0;

    /* renamed from: x, reason: collision with root package name */
    public static final l9 f6589x;

    /* renamed from: y, reason: collision with root package name */
    public static final l9 f6590y;

    /* renamed from: z, reason: collision with root package name */
    public static final l9 f6591z;

    static {
        f9 b10 = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6544a = b10.c("measurement.ad_id_cache_time", 10000L);
        b = b10.c("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        f6547c = b10.d("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        f6549d = b10.c("measurement.max_bundles_per_iteration", 100L);
        f6551e = b10.f("measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid");
        f6553f = b10.c("measurement.config.cache_time", 86400000L);
        b10.f("measurement.log_tag", "FA");
        f6555g = b10.f("measurement.config.url_authority", "app-measurement.com");
        f6557h = b10.f("measurement.config.url_scheme", "https");
        f6559i = b10.c("measurement.upload.debug_upload_interval", 1000L);
        b10.d("measurement.config.default_flag_values", true);
        f6561j = b10.c("measurement.session.engagement_interval", 3600000L);
        f6563k = b10.f("measurement.rb.attribution.event_params", "value|currency");
        f6565l = b10.f("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp");
        f6567m = b10.c("measurement.upload.google_signal_max_queue_time", 605000L);
        f6569n = b10.f("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        b10.c("measurement.id.upload.max_conversions_per_day", 0L);
        f6571o = b10.c("measurement.lifetimevalue.max_currency_tracked", 4L);
        f6573p = b10.c("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        f6575q = b10.c("measurement.upload.max_event_parameter_value_length", 500L);
        f6577r = b10.c("measurement.store.max_stored_events_per_app", 100000L);
        f6579s = b10.c("measurement.experiment.max_ids", 50L);
        f6581t = b10.c("measurement.audience.filter_result_max_count", 200L);
        f6583u = b10.c("measurement.upload.max_item_scoped_custom_parameters", 27L);
        f6585v = b10.c("measurement.rb.max_trigger_registrations_per_day", 1000L);
        f6587w = b10.c("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0L);
        f6589x = b10.c("measurement.rb.attribution.client.min_ad_services_version", 7L);
        f6590y = b10.c("measurement.alarm_manager.minimum_interval", RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
        f6591z = b10.c("measurement.upload.minimum_delay", 500L);
        A = b10.c("measurement.monitoring.sample_period_millis", 86400000L);
        B = b10.c("measurement.rb.attribution.notify_app_delay_millis", 3000L);
        C = b10.d("measurement.config.notify_trigger_uris_on_backgrounded", true);
        D = b10.f("measurement.rb.attribution.app_allowlist", "");
        E = b10.c("measurement.upload.realtime_upload_interval", 10000L);
        F = b10.c("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        b10.c("measurement.config.cache_time.service", 3600000L);
        G = b10.c("measurement.service_client.idle_disconnect_millis", 5000L);
        b10.f("measurement.log_tag.service", "FA-SVC");
        H = b10.c("measurement.service_client.reconnect_millis", 1000L);
        b10.f("measurement.sgtm.app_allowlist", "*");
        I = b10.c("measurement.sgtm.batch.long_queuing_threshold", 240000L);
        J = b10.c("measurement.sgtm.batch.retry_interval", BacktraceMetrics.defaultTimeIntervalMs);
        K = b10.c("measurement.sgtm.batch.retry_max_count", 10L);
        L = b10.c("measurement.sgtm.batch.retry_max_wait", 21600000L);
        M = b10.f("measurement.sgtm.service_upload_apps_list", "");
        N = b10.f("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
        O = b10.c("measurement.sgtm.upload.batches_retrieval_limit", 5L);
        P = b10.c("measurement.sgtm.upload.max_queued_batches", 5000L);
        Q = b10.c("measurement.sgtm.upload.min_delay_after_background", 600000L);
        R = b10.c("measurement.sgtm.upload.min_delay_after_broadcast", 1000L);
        S = b10.c("measurement.sgtm.upload.min_delay_after_startup", 5000L);
        T = b10.c("measurement.sgtm.upload.retry_interval", 600000L);
        U = b10.c("measurement.sgtm.upload.retry_max_wait", 21600000L);
        V = b10.c("measurement.upload.stale_data_deletion_interval", 86400000L);
        W = b10.c("measurement.rb.attribution.max_retry_delay_seconds", 16L);
        X = b10.c("measurement.rb.attribution.client.min_time_after_boot_seconds", 90L);
        Y = b10.f("measurement.rb.attribution.uri_authority", "google-analytics.com");
        Z = b10.c("measurement.rb.attribution.max_queue_time", 864000000L);
        f6545a0 = b10.f("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        f6546b0 = b10.f("measurement.rb.attribution.query_parameters_to_remove", "");
        f6548c0 = b10.f("measurement.rb.attribution.uri_scheme", "https");
        f6550d0 = b10.c("measurement.sdk.attribution.cache.ttl", 604800000L);
        f6552e0 = b10.c("measurement.redaction.app_instance_id.ttl", 7200000L);
        f6554f0 = b10.c("measurement.upload.backoff_period", 43200000L);
        f6556g0 = b10.c("measurement.upload.initial_upload_delay_time", 15000L);
        f6558h0 = b10.c("measurement.upload.interval", 3600000L);
        f6560i0 = b10.c("measurement.upload.max_bundle_size", 65536L);
        f6562j0 = b10.c("measurement.upload.max_bundles", 100L);
        f6564k0 = b10.c("measurement.upload.max_conversions_per_day", 500L);
        f6566l0 = b10.c("measurement.upload.max_error_events_per_day", 1000L);
        f6568m0 = b10.c("measurement.upload.max_events_per_bundle", 1000L);
        f6570n0 = b10.c("measurement.upload.max_events_per_day", 100000L);
        f6572o0 = b10.c("measurement.upload.max_public_events_per_day", 50000L);
        f6574p0 = b10.c("measurement.upload.max_queue_time", 518400000L);
        f6576q0 = b10.c("measurement.upload.max_realtime_events_per_day", 10L);
        f6578r0 = b10.c("measurement.upload.max_batch_size", 65536L);
        f6580s0 = b10.c("measurement.upload.retry_count", 6L);
        f6582t0 = b10.c("measurement.upload.retry_time", BacktraceMetrics.defaultTimeIntervalMs);
        f6584u0 = b10.f("measurement.upload.url", "https://app-measurement.com/a");
        f6586v0 = b10.c("measurement.upload.window_interval", 3600000L);
        f6588w0 = b10.f("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long A() {
        return ((Long) G.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long B() {
        return ((Long) X.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long C() {
        return ((Long) f6558h0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long D() {
        return ((Long) f6552e0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long E() {
        return ((Long) f6586v0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String F() {
        return (String) D.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long G() {
        return ((Long) U.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long H() {
        return ((Long) E.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long I() {
        return ((Long) V.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long J() {
        return ((Long) f6589x.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long K() {
        return ((Long) f6554f0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String L() {
        return (String) f6588w0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long M() {
        return ((Long) f6566l0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long N() {
        return ((Long) J.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long O() {
        return ((Long) f6568m0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long P() {
        return ((Long) K.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long Q() {
        return ((Long) f6562j0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long R() {
        return ((Long) H.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String S() {
        return (String) Y.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long T() {
        return ((Long) f6560i0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long U() {
        return ((Long) f6564k0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long V() {
        return ((Long) I.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long W() {
        return ((Long) Z.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String X() {
        return (String) N.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long Y() {
        return ((Long) f6574p0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long Z() {
        return ((Long) O.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long a() {
        return ((Long) f6581t.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long a0() {
        return ((Long) f6576q0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long b0() {
        return ((Long) f6577r.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String c() {
        return (String) f6555g.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long c0() {
        return ((Long) f6570n0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long d() {
        return ((Long) f6559i.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long d0() {
        return ((Long) L.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long e() {
        return ((Long) f6561j.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String e0() {
        return (String) M.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String f() {
        return (String) f6565l.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long f0() {
        return ((Long) f6572o0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String g() {
        return (String) f6563k.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String g0() {
        return (String) f6548c0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long h0() {
        return ((Long) f6582t0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long i0() {
        return ((Long) B.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long j0() {
        return ((Long) f6583u.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long k0() {
        return ((Long) S.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long l0() {
        return ((Long) f6550d0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String m0() {
        return (String) f6584u0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long n0() {
        return ((Long) T.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean o0() {
        return ((Boolean) C.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long p0() {
        return ((Long) P.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String q0() {
        return (String) f6545a0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long r0() {
        return ((Long) f6578r0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long s0() {
        return ((Long) Q.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String t0() {
        return (String) f6546b0.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long u() {
        return ((Long) f6567m.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long u0() {
        return ((Long) f6580s0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long v() {
        return ((Long) F.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long v0() {
        return ((Long) R.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long w() {
        return ((Long) W.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long w0() {
        return ((Long) A.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long x() {
        return ((Long) f6590y.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long y() {
        return ((Long) f6556g0.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long z() {
        return ((Long) f6591z.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zza() {
        return ((Long) f6544a.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzb() {
        return ((Long) b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final boolean zzc() {
        return ((Boolean) f6547c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzd() {
        return ((Long) f6549d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String zze() {
        return (String) f6551e.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzf() {
        return ((Long) f6553f.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String zzh() {
        return (String) f6557h.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final String zzn() {
        return (String) f6569n.d();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzo() {
        return ((Long) f6571o.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzp() {
        return ((Long) f6573p.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzq() {
        return ((Long) f6575q.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzs() {
        return ((Long) f6579s.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzv() {
        return ((Long) f6585v.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final long zzw() {
        return ((Long) f6587w.d()).longValue();
    }
}
