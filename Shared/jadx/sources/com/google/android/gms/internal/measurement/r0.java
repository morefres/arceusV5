package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r0 extends o0 implements t0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final Bundle j(Bundle bundle) {
        Parcel s22 = s2();
        q0.c(s22, bundle);
        Parcel r22 = r2(1, s22);
        Bundle bundle2 = (Bundle) q0.b(r22, Bundle.CREATOR);
        r22.recycle();
        return bundle2;
    }
}
