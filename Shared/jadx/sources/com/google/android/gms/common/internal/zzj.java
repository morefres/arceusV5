package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.b1;

/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new b1();

    /* renamed from: f, reason: collision with root package name */
    public Bundle f5863f;

    /* renamed from: g, reason: collision with root package name */
    public Feature[] f5864g;

    /* renamed from: h, reason: collision with root package name */
    public int f5865h;

    /* renamed from: i, reason: collision with root package name */
    public ConnectionTelemetryConfiguration f5866i;

    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.f(parcel, 1, this.f5863f, false);
        o9.b.y(parcel, 2, this.f5864g, i10, false);
        o9.b.n(parcel, 3, this.f5865h);
        o9.b.t(parcel, 4, this.f5866i, i10, false);
        o9.b.b(parcel, a10);
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i10, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f5863f = bundle;
        this.f5864g = featureArr;
        this.f5865h = i10;
        this.f5866i = connectionTelemetryConfiguration;
    }
}
