package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class oe implements ne {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6763a;
    public static final l9 b;

    static {
        f9 b10 = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        b10.d("measurement.set_default_event_parameters_with_backfill.service", true);
        b10.c("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f6763a = b10.d("measurement.set_default_event_parameters.fix_app_update_logging", true);
        b = b10.d("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        b10.d("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.ne
    public final boolean zza() {
        return ((Boolean) f6763a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.ne
    public final boolean zzb() {
        return ((Boolean) b.d()).booleanValue();
    }
}
