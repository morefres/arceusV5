package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class lf implements kf {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6660a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b.d("measurement.gbraid_campaign.gbraid.client", true);
        f6660a = b.d("measurement.gbraid_campaign.stop_lgclid", false);
    }

    @Override // com.google.android.gms.internal.measurement.kf
    public final boolean zza() {
        return ((Boolean) f6660a.d()).booleanValue();
    }
}
