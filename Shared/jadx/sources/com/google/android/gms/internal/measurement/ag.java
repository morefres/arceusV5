package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class ag implements zf {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6428a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6428a = b.d("measurement.add_first_launch_logging_timestamp.service", false);
        b.c("measurement.id.add_first_launch_logging_timestamp.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zf
    public final boolean zza() {
        return ((Boolean) f6428a.d()).booleanValue();
    }
}
