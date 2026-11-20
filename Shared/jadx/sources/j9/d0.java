package j9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzp;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 3:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case 4:
                    iBinder = o9.a.v(parcel, u8);
                    break;
                case 5:
                    z12 = o9.a.o(parcel, u8);
                    break;
                case 6:
                    z13 = o9.a.o(parcel, u8);
                    break;
                case 7:
                default:
                    o9.a.C(parcel, u8);
                    break;
                case 8:
                    z14 = o9.a.o(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzp(str, z10, z11, iBinder, z12, z13, z14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzp[i10];
    }
}
