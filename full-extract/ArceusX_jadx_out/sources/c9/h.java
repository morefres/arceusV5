package c9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    arrayList = o9.a.l(parcel, u8, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) o9.a.g(parcel, u8, Account.CREATOR);
                    break;
                case 4:
                    z10 = o9.a.o(parcel, u8);
                    break;
                case 5:
                    z11 = o9.a.o(parcel, u8);
                    break;
                case 6:
                    z12 = o9.a.o(parcel, u8);
                    break;
                case 7:
                    str = o9.a.h(parcel, u8);
                    break;
                case 8:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    arrayList2 = o9.a.l(parcel, u8, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = o9.a.h(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new GoogleSignInOptions(i10, arrayList, account, z10, z11, z12, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
