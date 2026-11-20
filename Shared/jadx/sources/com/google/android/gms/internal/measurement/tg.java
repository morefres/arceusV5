package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class tg implements sg {

    /* renamed from: a, reason: collision with root package name */
    public static final l9 f6866a;

    static {
        f9 b = new f9(a9.a("com.google.android.gms.measurement")).a().b();
        f6866a = b.d("measurement.tcf.consent_fix", true);
        b.d("measurement.tcf.client", true);
        b.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.sg
    public final boolean zza() {
        return ((Boolean) f6866a.d()).booleanValue();
    }
}
