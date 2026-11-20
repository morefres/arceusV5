package lb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.zzs;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        boolean z10 = true;
        long j10 = 50;
        float f10 = 0.0f;
        long j11 = Long.MAX_VALUE;
        int i10 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                z10 = o9.a.o(parcel, u8);
            } else if (n10 == 2) {
                j10 = o9.a.y(parcel, u8);
            } else if (n10 == 3) {
                f10 = o9.a.s(parcel, u8);
            } else if (n10 == 4) {
                j11 = o9.a.y(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                i10 = o9.a.w(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzs(z10, j10, f10, j11, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i10) {
        return new zzs[i10];
    }
}
