package r9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 != 2) {
                o9.a.C(parcel, u8);
            } else {
                z10 = o9.a.o(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new ModuleInstallResponse(i10, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ModuleInstallResponse[i10];
    }
}
