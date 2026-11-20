package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import o9.b;
import qb.i;

/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new i();

    /* renamed from: f, reason: collision with root package name */
    public final int f7522f;

    /* renamed from: g, reason: collision with root package name */
    public final ConnectionResult f7523g;

    /* renamed from: h, reason: collision with root package name */
    public final zav f7524h;

    public zak(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f7522f = i10;
        this.f7523g = connectionResult;
        this.f7524h = zavVar;
    }

    public final ConnectionResult v3() {
        return this.f7523g;
    }

    public final zav w3() {
        return this.f7524h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f7522f);
        b.t(parcel, 2, this.f7523g, i10, false);
        b.t(parcel, 3, this.f7524h, i10, false);
        b.b(parcel, a10);
    }
}
