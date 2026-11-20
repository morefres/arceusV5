package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzai;
import eb.m3;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                bArr = o9.a.c(parcel, u8);
            } else if (n10 == 2) {
                bArr2 = o9.a.c(parcel, u8);
            } else if (n10 == 3) {
                bArr3 = o9.a.c(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                i10 = o9.a.w(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzai(bArr == null ? null : m3.m(bArr, 0, bArr.length), bArr2 == null ? null : m3.m(bArr2, 0, bArr2.length), bArr3 != null ? m3.m(bArr3, 0, bArr3.length) : null, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzai[i10];
    }
}
