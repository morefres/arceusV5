package ea;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        PlayerEntity playerEntity = null;
        String str7 = null;
        String str8 = null;
        float f10 = -1.0f;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 3:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 6:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 7:
                    uri2 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 8:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 10:
                    str6 = o9.a.h(parcel, u8);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) o9.a.g(parcel, u8, PlayerEntity.CREATOR);
                    break;
                case 12:
                    i12 = o9.a.w(parcel, u8);
                    break;
                case 13:
                    i13 = o9.a.w(parcel, u8);
                    break;
                case 14:
                    str7 = o9.a.h(parcel, u8);
                    break;
                case 15:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 16:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 17:
                    f10 = o9.a.s(parcel, u8);
                    break;
                case 18:
                    str8 = o9.a.h(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new AchievementEntity(str, i10, str2, str3, uri, str4, uri2, str5, i11, str6, playerEntity, i12, i13, str7, j10, j11, f10, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AchievementEntity[i10];
    }
}
