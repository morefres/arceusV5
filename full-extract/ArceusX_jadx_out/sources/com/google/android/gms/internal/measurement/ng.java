package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ng implements mg {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6738a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6738a = b.d("measurement.client.sessions.enable_fix_background_engagement", false);
        b.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        b.c("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.mg
    public final boolean zza() {
        return ((Boolean) f6738a.d()).booleanValue();
    }
}
