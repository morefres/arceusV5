package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<GetCredentialRequest> {
    public static void c(GetCredentialRequest getCredentialRequest, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.z(parcel, 1, getCredentialRequest.v3(), false);
        o9.b.f(parcel, 2, getCredentialRequest.getData(), false);
        o9.b.v(parcel, 3, getCredentialRequest.getOrigin(), false);
        o9.b.t(parcel, 4, getCredentialRequest.getResultReceiver(), i10, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        String str = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                arrayList = o9.a.l(parcel, u8, CredentialOption.CREATOR);
            } else if (n10 == 2) {
                bundle = o9.a.b(parcel, u8);
            } else if (n10 == 3) {
                str = o9.a.h(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                resultReceiver = (ResultReceiver) o9.a.g(parcel, u8, ResultReceiver.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new GetCredentialRequest(arrayList, bundle, str, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest[] newArray(int i10) {
        return new GetCredentialRequest[i10];
    }
}
