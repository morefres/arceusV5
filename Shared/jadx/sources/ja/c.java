package ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.zze;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 2:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case 3:
                    z12 = o9.a.o(parcel, u8);
                    break;
                case 4:
                    z13 = o9.a.o(parcel, u8);
                    break;
                case 5:
                    z14 = o9.a.o(parcel, u8);
                    break;
                case 6:
                    z15 = o9.a.o(parcel, u8);
                    break;
                case 7:
                    z16 = o9.a.o(parcel, u8);
                    break;
                case 8:
                    z17 = o9.a.o(parcel, u8);
                    break;
                case 9:
                    z18 = o9.a.o(parcel, u8);
                    break;
                case 10:
                    z19 = o9.a.o(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zze(z10, z11, z12, z13, z14, z15, z16, z17, z18, z19);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zze[i10];
    }
}
