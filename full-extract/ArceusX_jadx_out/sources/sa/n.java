package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.GetCredentialResponse;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<GetCredentialResponse> {
    public static void c(GetCredentialResponse getCredentialResponse, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.t(parcel, 1, getCredentialResponse.getCredential(), i10, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetCredentialResponse createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            if (o9.a.n(u8) != 1) {
                o9.a.C(parcel, u8);
            } else {
                credential = (Credential) o9.a.g(parcel, u8, Credential.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new GetCredentialResponse(credential);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetCredentialResponse[] newArray(int i10) {
        return new GetCredentialResponse[i10];
    }
}
