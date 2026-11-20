package pa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = false;
        float f10 = 0.0f;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    gameEntity = (GameEntity) o9.a.g(parcel, u8, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) o9.a.g(parcel, u8, PlayerEntity.CREATOR);
                    break;
                case 3:
                    str = o9.a.h(parcel, u8);
                    break;
                case 4:
                default:
                    o9.a.C(parcel, u8);
                    break;
                case 5:
                    uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 6:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 7:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 8:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 10:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 11:
                    f10 = o9.a.s(parcel, u8);
                    break;
                case 12:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 13:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 14:
                    j12 = o9.a.y(parcel, u8);
                    break;
                case 15:
                    str6 = o9.a.h(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new SnapshotMetadataEntity(gameEntity, playerEntity, str, uri, str2, str3, str4, j10, j11, f10, str5, z10, j12, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataEntity[i10];
    }
}
