package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.s0;

/* loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new s0();

    /* renamed from: f, reason: collision with root package name */
    public final int f5847f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5848g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5849h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5850i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5851j;

    public RootTelemetryConfiguration(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f5847f = i10;
        this.f5848g = z10;
        this.f5849h = z11;
        this.f5850i = i11;
        this.f5851j = i12;
    }

    public int v3() {
        return this.f5850i;
    }

    public int w3() {
        return this.f5851j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, z3());
        o9.b.c(parcel, 2, x3());
        o9.b.c(parcel, 3, y3());
        o9.b.n(parcel, 4, v3());
        o9.b.n(parcel, 5, w3());
        o9.b.b(parcel, a10);
    }

    public boolean x3() {
        return this.f5848g;
    }

    public boolean y3() {
        return this.f5849h;
    }

    public int z3() {
        return this.f5847f;
    }
}
