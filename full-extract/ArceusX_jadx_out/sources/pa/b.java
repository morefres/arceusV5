package pa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        SnapshotMetadataEntity snapshotMetadataEntity = null;
        SnapshotContentsEntity snapshotContentsEntity = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                snapshotMetadataEntity = (SnapshotMetadataEntity) o9.a.g(parcel, u8, SnapshotMetadataEntity.CREATOR);
            } else if (n10 != 3) {
                o9.a.C(parcel, u8);
            } else {
                snapshotContentsEntity = (SnapshotContentsEntity) o9.a.g(parcel, u8, SnapshotContentsEntity.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new SnapshotEntity(snapshotMetadataEntity, snapshotContentsEntity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotEntity[i10];
    }
}
