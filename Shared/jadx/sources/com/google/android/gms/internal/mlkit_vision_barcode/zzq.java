package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import o9.b;

/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzad();
    public int zza;
    public String zzb;

    public zzq() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.n(parcel, 2, this.zza);
        b.v(parcel, 3, this.zzb, false);
        b.b(parcel, a10);
    }

    public zzq(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }
}
