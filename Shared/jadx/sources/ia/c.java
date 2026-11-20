package ia;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.ScreenshotEntity;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        Uri uri = null;
        int i11 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
            } else if (n10 == 2) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 != 3) {
                o9.a.C(parcel, u8);
            } else {
                i11 = o9.a.w(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new ScreenshotEntity(uri, i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ScreenshotEntity[i10];
    }
}
