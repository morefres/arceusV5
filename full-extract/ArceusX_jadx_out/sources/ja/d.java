package ja;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;
import com.google.android.gms.games.internal.player.zzh;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        Status status = null;
        String str = null;
        StockProfileImageEntity stockProfileImageEntity = null;
        zzh zzhVar = null;
        Boolean bool = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i10 = 0;
        boolean z15 = false;
        boolean z16 = false;
        int i11 = 0;
        int i12 = 0;
        boolean z17 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    status = (Status) o9.a.g(parcel, u8, Status.CREATOR);
                    break;
                case 2:
                    str = o9.a.h(parcel, u8);
                    break;
                case 3:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 4:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case 5:
                    z12 = o9.a.o(parcel, u8);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) o9.a.g(parcel, u8, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    z13 = o9.a.o(parcel, u8);
                    break;
                case 8:
                    z14 = o9.a.o(parcel, u8);
                    break;
                case 9:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 10:
                    z15 = o9.a.o(parcel, u8);
                    break;
                case 11:
                    z16 = o9.a.o(parcel, u8);
                    break;
                case 12:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 13:
                    i12 = o9.a.w(parcel, u8);
                    break;
                case 14:
                    z17 = o9.a.o(parcel, u8);
                    break;
                case 15:
                    zzhVar = (zzh) o9.a.g(parcel, u8, zzh.CREATOR);
                    break;
                case 16:
                    bool = o9.a.p(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new ProfileSettingsEntity(status, str, z10, z11, z12, stockProfileImageEntity, z13, z14, i10, z15, z16, i11, i12, z17, zzhVar, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProfileSettingsEntity[i10];
    }
}
