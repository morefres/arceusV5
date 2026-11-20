package ha;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.experience.ExperienceEventEntity;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        int i11 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        String str = null;
        GameEntity gameEntity = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    gameEntity = (GameEntity) o9.a.g(parcel, u8, GameEntity.CREATOR);
                    break;
                case 3:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 7:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 8:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 9:
                    j12 = o9.a.y(parcel, u8);
                    break;
                case 10:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 11:
                    i11 = o9.a.w(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new ExperienceEventEntity(str, gameEntity, str2, str3, str4, uri, j10, j11, j12, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ExperienceEventEntity[i10];
    }
}
