package fa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.event.EventEntity;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        PlayerEntity playerEntity = null;
        String str5 = null;
        long j10 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 5:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) o9.a.g(parcel, u8, PlayerEntity.CREATOR);
                    break;
                case 7:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 8:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    z10 = o9.a.o(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new EventEntity(str, str2, str3, uri, str4, playerEntity, j10, str5, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new EventEntity[i10];
    }
}
