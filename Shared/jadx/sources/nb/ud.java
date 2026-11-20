package nb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzom;

/* loaded from: classes.dex */
public final class ud implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 2:
                    bArr = o9.a.c(parcel, u8);
                    break;
                case 3:
                    str = o9.a.h(parcel, u8);
                    break;
                case 4:
                    bundle = o9.a.b(parcel, u8);
                    break;
                case 5:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 6:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 7:
                    str2 = o9.a.h(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzom(j10, bArr, str, bundle, i10, j11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzom[i10];
    }
}
