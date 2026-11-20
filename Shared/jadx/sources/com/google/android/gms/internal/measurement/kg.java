package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class kg implements jg {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6641a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6641a = b.d("measurement.session_stitching_token_enabled", false);
        b.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.jg
    public final boolean zzb() {
        return ((Boolean) f6641a.d()).booleanValue();
    }
}
