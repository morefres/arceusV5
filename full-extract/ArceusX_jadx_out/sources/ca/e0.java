package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 2) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                bool = o9.a.p(parcel, u8);
            } else if (n10 == 4) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                str3 = o9.a.h(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new AuthenticatorSelectionCriteria(str, bool, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorSelectionCriteria[i10];
    }
}
