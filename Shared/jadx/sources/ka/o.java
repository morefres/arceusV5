package ka;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.v2.appshortcuts.zzr;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        ComponentName componentName = null;
        String str2 = null;
        int i10 = 0;
        long j10 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                j10 = o9.a.y(parcel, u8);
            } else if (n10 == 2) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                i10 = o9.a.w(parcel, u8);
            } else if (n10 == 4) {
                componentName = (ComponentName) o9.a.g(parcel, u8, ComponentName.CREATOR);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                str2 = o9.a.h(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzr(j10, str, i10, componentName, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
