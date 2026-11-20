package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class be implements ae {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6439a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6439a = b.d("measurement.service.ad_impression.convert_value_to_double", true);
        b.d("measurement.service.separate_public_internal_event_blacklisting", true);
        b.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.ae
    public final boolean zza() {
        return ((Boolean) f6439a.d()).booleanValue();
    }
}
