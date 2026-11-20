package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b2 extends o0 implements e2 {
    public b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final void p(String str, String str2, Bundle bundle, long j10) {
        Parcel s22 = s2();
        s22.writeString(str);
        s22.writeString(str2);
        q0.c(s22, bundle);
        s22.writeLong(j10);
        t2(1, s22);
    }

    @Override // com.google.android.gms.internal.measurement.e2
    public final int zzf() {
        Parcel r22 = r2(2, s2());
        int readInt = r22.readInt();
        r22.recycle();
        return readInt;
    }
}
