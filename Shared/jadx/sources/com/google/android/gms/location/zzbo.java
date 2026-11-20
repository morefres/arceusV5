package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import lb.y;
import n9.k;
import o9.b;

/* loaded from: classes.dex */
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new y();

    /* renamed from: f, reason: collision with root package name */
    public final int f7440f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7441g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7442h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7443i;

    public zzbo(int i10, int i11, long j10, long j11) {
        this.f7440f = i10;
        this.f7441g = i11;
        this.f7442h = j10;
        this.f7443i = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzboVar = (zzbo) obj;
            if (this.f7440f == zzboVar.f7440f && this.f7441g == zzboVar.f7441g && this.f7442h == zzboVar.f7442h && this.f7443i == zzboVar.f7443i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return k.c(Integer.valueOf(this.f7441g), Integer.valueOf(this.f7440f), Long.valueOf(this.f7443i), Long.valueOf(this.f7442h));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f7440f + " Cell status: " + this.f7441g + " elapsed time NS: " + this.f7443i + " system time ms: " + this.f7442h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 1, this.f7440f);
        b.n(parcel, 2, this.f7441g);
        b.r(parcel, 3, this.f7442h);
        b.r(parcel, 4, this.f7443i);
        b.b(parcel, a10);
    }
}
