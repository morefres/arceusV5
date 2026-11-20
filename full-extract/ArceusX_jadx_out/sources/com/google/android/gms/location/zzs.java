package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.z;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new z();

    /* renamed from: f, reason: collision with root package name */
    public boolean f7444f;

    /* renamed from: g, reason: collision with root package name */
    public long f7445g;

    /* renamed from: h, reason: collision with root package name */
    public float f7446h;

    /* renamed from: i, reason: collision with root package name */
    public long f7447i;

    /* renamed from: j, reason: collision with root package name */
    public int f7448j;

    public zzs() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzs)) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return this.f7444f == zzsVar.f7444f && this.f7445g == zzsVar.f7445g && Float.compare(this.f7446h, zzsVar.f7446h) == 0 && this.f7447i == zzsVar.f7447i && this.f7448j == zzsVar.f7448j;
    }

    public final int hashCode() {
        return k.c(Boolean.valueOf(this.f7444f), Long.valueOf(this.f7445g), Float.valueOf(this.f7446h), Long.valueOf(this.f7447i), Integer.valueOf(this.f7448j));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DeviceOrientationRequest[mShouldUseMag=");
        sb2.append(this.f7444f);
        sb2.append(" mMinimumSamplingPeriodMs=");
        sb2.append(this.f7445g);
        sb2.append(" mSmallestAngleChangeRadians=");
        sb2.append(this.f7446h);
        long j10 = this.f7447i;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f7448j != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f7448j);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.c(parcel, 1, this.f7444f);
        b.r(parcel, 2, this.f7445g);
        b.k(parcel, 3, this.f7446h);
        b.r(parcel, 4, this.f7447i);
        b.n(parcel, 5, this.f7448j);
        b.b(parcel, a10);
    }

    public zzs(boolean z10, long j10, float f10, long j11, int i10) {
        this.f7444f = z10;
        this.f7445g = j10;
        this.f7446h = f10;
        this.f7447i = j11;
        this.f7448j = i10;
    }
}
