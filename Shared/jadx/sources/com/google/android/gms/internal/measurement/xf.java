package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class xf implements wf {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6991a;
    public static final l9 b;

    /* renamed from: c, reason: collision with root package name */
    public static final l9 f6992c;

    /* renamed from: d, reason: collision with root package name */
    public static final l9 f6993d;

    /* renamed from: e, reason: collision with root package name */
    public static final l9 f6994e;

    /* renamed from: f, reason: collision with root package name */
    public static final l9 f6995f;

    /* renamed from: g, reason: collision with root package name */
    public static final l9 f6996g;

    /* renamed from: h, reason: collision with root package name */
    public static final l9 f6997h;

    static {
        f9 b10 = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.rb.attribution.ad_campaign_info", true);
        b10.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f6991a = b10.d("measurement.rb.attribution.client2", true);
        b = b10.d("measurement.rb.attribution.followup1.service", false);
        b10.d("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f6992c = b10.d("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        b10.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f6993d = b10.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f6994e = b10.d("measurement.rb.attribution.retry_disposition", false);
        f6995f = b10.d("measurement.rb.attribution.service", true);
        f6996g = b10.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f6997h = b10.d("measurement.rb.attribution.uuid_generation", true);
        b10.c("measurement.id.rb.attribution.retry_disposition", 0L);
        b10.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean c() {
        return ((Boolean) f6995f.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean d() {
        return ((Boolean) f6997h.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzb() {
        return ((Boolean) f6991a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzd() {
        return ((Boolean) f6992c.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zze() {
        return ((Boolean) f6993d.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzf() {
        return ((Boolean) f6994e.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.wf
    public final boolean zzh() {
        return ((Boolean) f6996g.d()).booleanValue();
    }
}
