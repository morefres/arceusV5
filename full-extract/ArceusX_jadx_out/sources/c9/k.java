package c9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = "";
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 4) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) o9.a.g(parcel, u8, GoogleSignInAccount.CREATOR);
            } else if (n10 != 8) {
                o9.a.C(parcel, u8);
            } else {
                str2 = o9.a.h(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
