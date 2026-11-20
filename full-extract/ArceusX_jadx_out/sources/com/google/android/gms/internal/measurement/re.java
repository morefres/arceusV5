package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class re implements qe {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6826a;
    public static final l9 b;

    static {
        f9 b10 = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6826a = b10.d("measurement.set_default_event_parameters_propagate_clear.client.dev", true);
        b = b10.d("measurement.set_default_event_parameters_propagate_clear.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean zza() {
        return ((Boolean) f6826a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.qe
    public final boolean zzb() {
        return ((Boolean) b.d()).booleanValue();
    }
}
