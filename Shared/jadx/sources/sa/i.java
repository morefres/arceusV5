package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CredentialOption;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<CredentialOption> {
    public static void c(CredentialOption credentialOption, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, credentialOption.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.f(parcel, 2, credentialOption.getCredentialRetrievalData(), false);
        o9.b.f(parcel, 3, credentialOption.getCandidateQueryData(), false);
        o9.b.v(parcel, 4, credentialOption.getRequestMatcher(), false);
        o9.b.v(parcel, 5, credentialOption.getRequestType(), false);
        o9.b.v(parcel, 6, credentialOption.getProtocolType(), false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CredentialOption createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str4 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    str = o9.a.h(parcel, u8);
                    break;
                case 2:
                    bundle = o9.a.b(parcel, u8);
                    break;
                case 3:
                    bundle2 = o9.a.b(parcel, u8);
                    break;
                case 4:
                    str4 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    str3 = o9.a.h(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new CredentialOption(str, bundle, bundle2, str4, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CredentialOption[] newArray(int i10) {
        return new CredentialOption[i10];
    }
}
