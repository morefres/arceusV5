package pa;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        Long l10 = null;
        BitmapTeleporter bitmapTeleporter = null;
        Uri uri = null;
        Long l11 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 2) {
                l10 = o9.a.z(parcel, u8);
            } else if (n10 == 4) {
                uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
            } else if (n10 == 5) {
                bitmapTeleporter = (BitmapTeleporter) o9.a.g(parcel, u8, BitmapTeleporter.CREATOR);
            } else if (n10 != 6) {
                o9.a.C(parcel, u8);
            } else {
                l11 = o9.a.z(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new SnapshotMetadataChangeEntity(str, l10, bitmapTeleporter, uri, l11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotMetadataChangeEntity[i10];
    }
}
