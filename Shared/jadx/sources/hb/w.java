package hb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.location.zzs;
import java.util.List;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        zzs zzsVar = zzj.f6408j;
        List<ClientIdentity> list = zzj.f6407i;
        String str = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                zzsVar = (zzs) o9.a.g(parcel, u8, zzs.CREATOR);
            } else if (n10 == 2) {
                list = o9.a.l(parcel, u8, ClientIdentity.CREATOR);
            } else if (n10 != 3) {
                o9.a.C(parcel, u8);
            } else {
                str = o9.a.h(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzj(zzsVar, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i10) {
        return new zzj[i10];
    }
}
