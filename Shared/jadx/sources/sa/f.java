package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<CreateCredentialRequest> {
    public static void c(CreateCredentialRequest createCredentialRequest, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, createCredentialRequest.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.f(parcel, 2, createCredentialRequest.getCredentialData(), false);
        o9.b.f(parcel, 3, createCredentialRequest.getCandidateQueryData(), false);
        o9.b.v(parcel, 4, createCredentialRequest.getOrigin(), false);
        o9.b.v(parcel, 5, createCredentialRequest.getRequestJson(), false);
        o9.b.t(parcel, 6, createCredentialRequest.getResultReceiver(), i10, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str2 = null;
        String str3 = null;
        ResultReceiver resultReceiver = null;
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
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 5:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 6:
                    resultReceiver = (ResultReceiver) o9.a.g(parcel, u8, ResultReceiver.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new CreateCredentialRequest(str, bundle, bundle2, str2, str3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreateCredentialRequest[] newArray(int i10) {
        return new CreateCredentialRequest[i10];
    }
}
