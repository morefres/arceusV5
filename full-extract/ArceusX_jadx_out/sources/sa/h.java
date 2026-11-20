package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.Credential;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<Credential> {
    public static void c(Credential credential, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 1, credential.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.f(parcel, 2, credential.getData(), false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Credential createFromParcel(@NonNull Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                str = o9.a.h(parcel, u8);
            } else if (n10 != 2) {
                o9.a.C(parcel, u8);
            } else {
                bundle = o9.a.b(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new Credential(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Credential[] newArray(int i10) {
        return new Credential[i10];
    }
}
