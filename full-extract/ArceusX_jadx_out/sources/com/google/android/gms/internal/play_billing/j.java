package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j extends g implements m {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    @Override // com.google.android.gms.internal.play_billing.m
    public final void f1(String str, String str2, o oVar) {
        Parcel r22 = r2();
        r22.writeString(str);
        r22.writeString(str2);
        i.c(r22, oVar);
        t2(1, r22);
    }
}
