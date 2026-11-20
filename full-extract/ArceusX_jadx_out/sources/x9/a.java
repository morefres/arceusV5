package x9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        DriveId driveId = null;
        String str = null;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) o9.a.g(parcel, u8, ParcelFileDescriptor.CREATOR);
            } else if (n10 == 3) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 4) {
                i11 = o9.a.w(parcel, u8);
            } else if (n10 == 5) {
                driveId = (DriveId) o9.a.g(parcel, u8, DriveId.CREATOR);
            } else if (n10 == 7) {
                z10 = o9.a.o(parcel, u8);
            } else if (n10 != 8) {
                o9.a.C(parcel, u8);
            } else {
                str = o9.a.h(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new Contents(parcelFileDescriptor, i10, i11, driveId, z10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Contents[i10];
    }
}
