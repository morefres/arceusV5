package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        PlayerLevel playerLevel = null;
        PlayerLevel playerLevel2 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                j10 = o9.a.y(parcel, u8);
            } else if (n10 == 2) {
                j11 = o9.a.y(parcel, u8);
            } else if (n10 == 3) {
                playerLevel = (PlayerLevel) o9.a.g(parcel, u8, PlayerLevel.CREATOR);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                playerLevel2 = (PlayerLevel) o9.a.g(parcel, u8, PlayerLevel.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new PlayerLevelInfo(j10, j11, playerLevel, playerLevel2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PlayerLevelInfo[i10];
    }
}
