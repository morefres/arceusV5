package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class le implements ke {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6659a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b.d("measurement.client.3p_consent_state_v1", true);
        f6659a = b.c("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final long zza() {
        return ((Long) f6659a.d()).longValue();
    }
}
