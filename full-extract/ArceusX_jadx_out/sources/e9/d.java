package e9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                arrayList = o9.a.j(parcel, u8);
            } else if (n10 != 2) {
                o9.a.C(parcel, u8);
            } else {
                z10 = o9.a.o(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new RetrieveBytesRequest(arrayList, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RetrieveBytesRequest[i10];
    }
}
