package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import lb.s;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new s();

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public int f7415f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public int f7416g;

    /* renamed from: h, reason: collision with root package name */
    public long f7417h;

    /* renamed from: i, reason: collision with root package name */
    public int f7418i;

    /* renamed from: j, reason: collision with root package name */
    public zzbo[] f7419j;

    public LocationAvailability(int i10, int i11, int i12, long j10, zzbo[] zzboVarArr) {
        this.f7418i = i10;
        this.f7415f = i11;
        this.f7416g = i12;
        this.f7417h = j10;
        this.f7419j = zzboVarArr;
    }

    public boolean equals(@NonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f7415f == locationAvailability.f7415f && this.f7416g == locationAvailability.f7416g && this.f7417h == locationAvailability.f7417h && this.f7418i == locationAvailability.f7418i && Arrays.equals(this.f7419j, locationAvailability.f7419j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k.c(Integer.valueOf(this.f7418i), Integer.valueOf(this.f7415f), Integer.valueOf(this.f7416g), Long.valueOf(this.f7417h), this.f7419j);
    }

    @NonNull
    public String toString() {
        boolean v32 = v3();
        StringBuilder sb2 = new StringBuilder(48);
        sb2.append("LocationAvailability[isLocationAvailable: ");
        sb2.append(v32);
        sb2.append("]");
        return sb2.toString();
    }

    public boolean v3() {
        return this.f7418i < 1000;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f7415f);
        b.n(parcel, 2, this.f7416g);
        b.r(parcel, 3, this.f7417h);
        b.n(parcel, 4, this.f7418i);
        b.y(parcel, 5, this.f7419j, i10, false);
        b.b(parcel, a10);
    }
}
