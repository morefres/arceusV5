package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    public static final ApiMetadata a(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                complianceOptions = (ComplianceOptions) o9.a.g(parcel, u8, ComplianceOptions.CREATOR);
            } else if (n10 != 2) {
                o9.a.C(parcel, u8);
            } else {
                z10 = o9.a.o(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new ApiMetadata(complianceOptions, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
