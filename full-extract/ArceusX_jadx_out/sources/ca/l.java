package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 2) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                bArr = o9.a.c(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                arrayList = o9.a.l(parcel, u8, Transport.CREATOR);
            }
        }
        o9.a.m(parcel, D);
        return new PublicKeyCredentialDescriptor(str, bArr, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialDescriptor[i10];
    }
}
