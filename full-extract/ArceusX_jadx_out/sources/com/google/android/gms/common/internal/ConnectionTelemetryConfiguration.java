package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.c1;

/* loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new c1();

    /* renamed from: f, reason: collision with root package name */
    public final RootTelemetryConfiguration f5814f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5815g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5816h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f5817i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5818j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f5819k;

    public ConnectionTelemetryConfiguration(@NonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f5814f = rootTelemetryConfiguration;
        this.f5815g = z10;
        this.f5816h = z11;
        this.f5817i = iArr;
        this.f5818j = i10;
        this.f5819k = iArr2;
    }

    @NonNull
    public final RootTelemetryConfiguration A3() {
        return this.f5814f;
    }

    public int v3() {
        return this.f5818j;
    }

    public int[] w3() {
        return this.f5817i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 1, this.f5814f, i10, false);
        o9.b.c(parcel, 2, y3());
        o9.b.c(parcel, 3, z3());
        o9.b.o(parcel, 4, w3(), false);
        o9.b.n(parcel, 5, v3());
        o9.b.o(parcel, 6, x3(), false);
        o9.b.b(parcel, a10);
    }

    public int[] x3() {
        return this.f5819k;
    }

    public boolean y3() {
        return this.f5815g;
    }

    public boolean z3() {
        return this.f5816h;
    }
}
