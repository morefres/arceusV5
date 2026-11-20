package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 2) {
                bArr = o9.a.c(parcel, u8);
            } else if (n10 == 3) {
                bArr2 = o9.a.c(parcel, u8);
            } else if (n10 == 4) {
                bArr3 = o9.a.c(parcel, u8);
            } else if (n10 == 5) {
                bArr4 = o9.a.c(parcel, u8);
            } else if (n10 != 6) {
                o9.a.C(parcel, u8);
            } else {
                bArr5 = o9.a.c(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new AuthenticatorAssertionResponse(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorAssertionResponse[i10];
    }
}
