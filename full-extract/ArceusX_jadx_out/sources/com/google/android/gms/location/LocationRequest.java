package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.t;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new t();

    /* renamed from: f, reason: collision with root package name */
    public int f7420f;

    /* renamed from: g, reason: collision with root package name */
    public long f7421g;

    /* renamed from: h, reason: collision with root package name */
    public long f7422h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7423i;

    /* renamed from: j, reason: collision with root package name */
    public long f7424j;

    /* renamed from: k, reason: collision with root package name */
    public int f7425k;

    /* renamed from: l, reason: collision with root package name */
    public float f7426l;

    /* renamed from: m, reason: collision with root package name */
    public long f7427m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7428n;

    @Deprecated
    public LocationRequest() {
        this.f7420f = 102;
        this.f7421g = 3600000L;
        this.f7422h = 600000L;
        this.f7423i = false;
        this.f7424j = Long.MAX_VALUE;
        this.f7425k = Integer.MAX_VALUE;
        this.f7426l = 0.0f;
        this.f7427m = 0L;
        this.f7428n = false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f7420f == locationRequest.f7420f && this.f7421g == locationRequest.f7421g && this.f7422h == locationRequest.f7422h && this.f7423i == locationRequest.f7423i && this.f7424j == locationRequest.f7424j && this.f7425k == locationRequest.f7425k && this.f7426l == locationRequest.f7426l && v3() == locationRequest.v3() && this.f7428n == locationRequest.f7428n) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f7420f), Long.valueOf(this.f7421g), Float.valueOf(this.f7426l), Long.valueOf(this.f7427m));
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        int i10 = this.f7420f;
        sb2.append(i10 != 100 ? i10 != 102 ? i10 != 104 ? i10 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f7420f != 105) {
            sb2.append(" requested=");
            sb2.append(this.f7421g);
            sb2.append("ms");
        }
        sb2.append(" fastest=");
        sb2.append(this.f7422h);
        sb2.append("ms");
        if (this.f7427m > this.f7421g) {
            sb2.append(" maxWait=");
            sb2.append(this.f7427m);
            sb2.append("ms");
        }
        if (this.f7426l > 0.0f) {
            sb2.append(" smallestDisplacement=");
            sb2.append(this.f7426l);
            sb2.append("m");
        }
        long j10 = this.f7424j;
        if (j10 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb2.append(" expireIn=");
            sb2.append(j10 - elapsedRealtime);
            sb2.append("ms");
        }
        if (this.f7425k != Integer.MAX_VALUE) {
            sb2.append(" num=");
            sb2.append(this.f7425k);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public long v3() {
        long j10 = this.f7427m;
        long j11 = this.f7421g;
        return j10 < j11 ? j11 : j10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f7420f);
        b.r(parcel, 2, this.f7421g);
        b.r(parcel, 3, this.f7422h);
        b.c(parcel, 4, this.f7423i);
        b.r(parcel, 5, this.f7424j);
        b.n(parcel, 6, this.f7425k);
        b.k(parcel, 7, this.f7426l);
        b.r(parcel, 8, this.f7427m);
        b.c(parcel, 9, this.f7428n);
        b.b(parcel, a10);
    }

    public LocationRequest(int i10, long j10, long j11, boolean z10, long j12, int i11, float f10, long j13, boolean z11) {
        this.f7420f = i10;
        this.f7421g = j10;
        this.f7422h = j11;
        this.f7423i = z10;
        this.f7424j = j12;
        this.f7425k = i11;
        this.f7426l = f10;
        this.f7427m = j13;
        this.f7428n = z11;
    }
}
