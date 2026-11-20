package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class xe implements we {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6990a;
    public static final l9 b;

    static {
        f9 b10 = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b10.d("measurement.collection.event_safelist", true);
        f6990a = b10.d("measurement.service.store_null_safelist", true);
        b = b10.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.we
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.we
    public final boolean zzb() {
        return ((Boolean) f6990a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.we
    public final boolean zzc() {
        return ((Boolean) b.d()).booleanValue();
    }
}
