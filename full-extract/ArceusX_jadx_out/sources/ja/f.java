package ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = "";
        String str2 = null;
        Uri uri = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 == 2) {
                uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
            } else if (n10 != 3) {
                o9.a.C(parcel, u8);
            } else {
                str = o9.a.h(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new StockProfileImageEntity(str2, uri, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StockProfileImageEntity[i10];
    }
}
