package ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.video.VideoCapabilities;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean[] zArr = null;
        boolean[] zArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                z10 = o9.a.o(parcel, u8);
            } else if (n10 == 2) {
                z11 = o9.a.o(parcel, u8);
            } else if (n10 == 3) {
                z12 = o9.a.o(parcel, u8);
            } else if (n10 == 4) {
                zArr = o9.a.a(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                zArr2 = o9.a.a(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new VideoCapabilities(z10, z11, z12, zArr, zArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VideoCapabilities[i10];
    }
}
