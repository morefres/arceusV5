package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<SignalCredentialStateRequest> {
    public static void c(SignalCredentialStateRequest signalCredentialStateRequest, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, signalCredentialStateRequest.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.v(parcel, 2, signalCredentialStateRequest.getOrigin(), false);
        o9.b.f(parcel, 3, signalCredentialStateRequest.getRequestData(), false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SignalCredentialStateRequest createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 2) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 != 3) {
                o9.a.C(parcel, u8);
            } else {
                bundle = o9.a.b(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new SignalCredentialStateRequest(str, str2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SignalCredentialStateRequest[] newArray(int i10) {
        return new SignalCredentialStateRequest[i10];
    }
}
