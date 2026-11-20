package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class af implements ze {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6426a;
    public static final l9 b;

    /* renamed from: c, reason: collision with root package name */
    public static final l9 f6427c;

    static {
        f9 b10 = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f6426a = b10.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = b10.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f6427c = b10.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zzb() {
        return ((Boolean) f6426a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ze
    public final boolean zzd() {
        return ((Boolean) f6427c.d()).booleanValue();
    }
}
