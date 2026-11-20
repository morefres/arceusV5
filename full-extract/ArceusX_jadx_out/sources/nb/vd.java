package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        ArrayList<Integer> arrayList = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            if (o9.a.n(u8) != 1) {
                o9.a.C(parcel, u8);
            } else {
                arrayList = o9.a.f(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzoo[i10];
    }
}
