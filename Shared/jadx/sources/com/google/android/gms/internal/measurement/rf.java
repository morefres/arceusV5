package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class rf implements qf {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6827a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        b.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f6827a = b.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        b.c("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.qf
    public final boolean zza() {
        return ((Boolean) f6827a.d()).booleanValue();
    }
}
