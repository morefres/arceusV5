package ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public static void a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, mostRecentGameInfoEntity.zza(), false);
        o9.b.v(parcel, 2, mostRecentGameInfoEntity.zzb(), false);
        o9.b.r(parcel, 3, mostRecentGameInfoEntity.zzc());
        o9.b.t(parcel, 4, mostRecentGameInfoEntity.zzd(), i10, false);
        o9.b.t(parcel, 5, mostRecentGameInfoEntity.zze(), i10, false);
        o9.b.t(parcel, 6, mostRecentGameInfoEntity.zzf(), i10, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
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
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 4:
                    uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new MostRecentGameInfoEntity(str, str2, j10, uri, uri2, uri3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MostRecentGameInfoEntity[i10];
    }
}
