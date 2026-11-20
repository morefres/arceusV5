package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class uf implements tf {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6880a;
    public static final l9 b;

    /* renamed from: c, reason: collision with root package name */
    public static final l9 f6881c;

    /* renamed from: d, reason: collision with root package name */
    public static final l9 f6882d;

    /* renamed from: e, reason: collision with root package name */
    public static final l9 f6883e;

    /* renamed from: f, reason: collision with root package name */
    public static final l9 f6884f;

    static {
        f9 b10 = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6880a = b10.d("measurement.test.boolean_flag", false);
        b = b10.c("measurement.test.cached_long_flag", -1L);
        f6881c = b10.e("measurement.test.double_flag", -3.0d);
        f6882d = b10.c("measurement.test.int_flag", -2L);
        f6883e = b10.c("measurement.test.long_flag", -1L);
        f6884f = b10.f("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final boolean zza() {
        return ((Boolean) f6880a.d()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final long zzb() {
        return ((Long) b.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final double zzc() {
        return ((Double) f6881c.d()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final long zzd() {
        return ((Long) f6882d.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final long zze() {
        return ((Long) f6883e.d()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.tf
    public final String zzf() {
        return (String) f6884f.d();
    }
}
