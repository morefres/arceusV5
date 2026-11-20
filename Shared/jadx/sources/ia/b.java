package ia;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* loaded from: classes.dex */
public class b implements Parcelable.Creator {
    public GameBadgeEntity a(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        Uri uri = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 2) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new GameBadgeEntity(i10, str, str2, uri);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GameBadgeEntity[i10];
    }
}
