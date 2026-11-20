package ka;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.gms.games.internal.v2.appshortcuts.zzi;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        PersistableBundle persistableBundle = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 2) {
                persistableBundle = (PersistableBundle) o9.a.g(parcel, u8, PersistableBundle.CREATOR);
            } else if (n10 == 3) {
                bool = o9.a.p(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                bool2 = o9.a.p(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzi(str, persistableBundle, bool, bool2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzi[i10];
    }
}
