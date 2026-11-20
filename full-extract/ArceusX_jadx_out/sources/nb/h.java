package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        zzpl zzplVar = null;
        String str3 = null;
        zzbg zzbgVar = null;
        zzbg zzbgVar2 = null;
        zzbg zzbgVar3 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 2:
                    str = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    zzplVar = (zzpl) o9.a.g(parcel, u8, zzpl.CREATOR);
                    break;
                case 5:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 6:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 7:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 8:
                    zzbgVar = (zzbg) o9.a.g(parcel, u8, zzbg.CREATOR);
                    break;
                case 9:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 10:
                    zzbgVar2 = (zzbg) o9.a.g(parcel, u8, zzbg.CREATOR);
                    break;
                case 11:
                    j12 = o9.a.y(parcel, u8);
                    break;
                case 12:
                    zzbgVar3 = (zzbg) o9.a.g(parcel, u8, zzbg.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzah(str, str2, zzplVar, j10, z10, str3, zzbgVar, j11, zzbgVar2, j12, zzbgVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzah[i10];
    }
}
