package z8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 3:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 4:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    uri = (Uri) o9.a.g(parcel, u8, Uri.CREATOR);
                    break;
                case 6:
                    str5 = o9.a.h(parcel, u8);
                    break;
                case 7:
                    str6 = o9.a.h(parcel, u8);
                    break;
                case 8:
                    str7 = o9.a.h(parcel, u8);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) o9.a.g(parcel, u8, PublicKeyCredential.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6, str7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInCredential[i10];
    }
}
