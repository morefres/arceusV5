package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class of implements nf {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6764a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b.d("measurement.gmscore_feature_tracking", true);
        f6764a = b.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.nf
    public final boolean zza() {
        return ((Boolean) f6764a.d()).booleanValue();
    }
}
