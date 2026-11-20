package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        boolean z10 = false;
        boolean z11 = false;
        long j12 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        long j13 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 3:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 4:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 5:
                    j12 = o9.a.y(parcel, u8);
                    break;
                case 6:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 7:
                    f10 = o9.a.s(parcel, u8);
                    break;
                case 8:
                    j13 = o9.a.y(parcel, u8);
                    break;
                case 9:
                    z11 = o9.a.o(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new LocationRequest(i10, j10, j11, z10, j12, i11, f10, j13, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
