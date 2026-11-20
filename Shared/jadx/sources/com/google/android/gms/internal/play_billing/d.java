package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d extends g implements f {
    public d(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final void D1(int i10, String str, Bundle bundle, c cVar) {
        Parcel r22 = r2();
        r22.writeInt(25);
        r22.writeString(str);
        i.b(r22, bundle);
        i.c(r22, cVar);
        t2(2101, r22);
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle O0(int i10, String str, String str2, Bundle bundle) {
        Parcel r22 = r2();
        r22.writeInt(9);
        r22.writeString(str);
        r22.writeString(str2);
        i.b(r22, bundle);
        Parcel s22 = s2(12, r22);
        Bundle bundle2 = (Bundle) i.a(s22, Bundle.CREATOR);
        s22.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final int T(int i10, String str, String str2) {
        Parcel r22 = r2();
        r22.writeInt(i10);
        r22.writeString(str);
        r22.writeString(str2);
        Parcel s22 = s2(1, r22);
        int readInt = s22.readInt();
        s22.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final int W1(int i10, String str, String str2, Bundle bundle) {
        Parcel r22 = r2();
        r22.writeInt(i10);
        r22.writeString(str);
        r22.writeString(str2);
        i.b(r22, bundle);
        Parcel s22 = s2(10, r22);
        int readInt = s22.readInt();
        s22.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle Y(int i10, String str, String str2, String str3) {
        Parcel r22 = r2();
        r22.writeInt(3);
        r22.writeString(str);
        r22.writeString(str2);
        r22.writeString(str3);
        Parcel s22 = s2(4, r22);
        Bundle bundle = (Bundle) i.a(s22, Bundle.CREATOR);
        s22.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle a2(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel r22 = r2();
        r22.writeInt(i10);
        r22.writeString(str);
        r22.writeString(str2);
        i.b(r22, bundle);
        i.b(r22, bundle2);
        Parcel s22 = s2(901, r22);
        Bundle bundle3 = (Bundle) i.a(s22, Bundle.CREATOR);
        s22.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle e1(int i10, String str, String str2, String str3, String str4) {
        Parcel r22 = r2();
        r22.writeInt(3);
        r22.writeString(str);
        r22.writeString(str2);
        r22.writeString(str3);
        r22.writeString(null);
        Parcel s22 = s2(3, r22);
        Bundle bundle = (Bundle) i.a(s22, Bundle.CREATOR);
        s22.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle l0(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel r22 = r2();
        r22.writeInt(i10);
        r22.writeString(str);
        r22.writeString(str2);
        r22.writeString(str3);
        r22.writeString(null);
        i.b(r22, bundle);
        Parcel s22 = s2(8, r22);
        Bundle bundle2 = (Bundle) i.a(s22, Bundle.CREATOR);
        s22.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle o2(int i10, String str, String str2, Bundle bundle) {
        Parcel r22 = r2();
        r22.writeInt(9);
        r22.writeString(str);
        r22.writeString(str2);
        i.b(r22, bundle);
        Parcel s22 = s2(902, r22);
        Bundle bundle2 = (Bundle) i.a(s22, Bundle.CREATOR);
        s22.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final int u(int i10, String str, String str2) {
        Parcel r22 = r2();
        r22.writeInt(3);
        r22.writeString(str);
        r22.writeString(str2);
        Parcel s22 = s2(5, r22);
        int readInt = s22.readInt();
        s22.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.f
    public final Bundle u0(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel r22 = r2();
        r22.writeInt(i10);
        r22.writeString(str);
        r22.writeString(str2);
        r22.writeString(str3);
        i.b(r22, bundle);
        Parcel s22 = s2(11, r22);
        Bundle bundle2 = (Bundle) i.a(s22, Bundle.CREATOR);
        s22.recycle();
        return bundle2;
    }
}
