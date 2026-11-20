package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzbj;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator<LocationSettingsRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        ArrayList arrayList = null;
        boolean z10 = false;
        boolean z11 = false;
        zzbj zzbjVar = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                arrayList = o9.a.l(parcel, u8, LocationRequest.CREATOR);
            } else if (n10 == 2) {
                z10 = o9.a.o(parcel, u8);
            } else if (n10 == 3) {
                z11 = o9.a.o(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                zzbjVar = (zzbj) o9.a.g(parcel, u8, zzbj.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new LocationSettingsRequest(arrayList, z10, z11, zzbjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationSettingsRequest[] newArray(int i10) {
        return new LocationSettingsRequest[i10];
    }
}
