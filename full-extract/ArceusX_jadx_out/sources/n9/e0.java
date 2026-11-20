package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        long j11 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i11 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    i12 = o9.a.w(parcel, u8);
                    break;
                case 3:
                    i13 = o9.a.w(parcel, u8);
                    break;
                case 4:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 5:
                    j11 = o9.a.y(parcel, u8);
                    break;
                case 6:
                    str = o9.a.h(parcel, u8);
                    break;
                case 7:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 8:
                    i14 = o9.a.w(parcel, u8);
                    break;
                case 9:
                    i10 = o9.a.w(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new MethodInvocation(i11, i12, i13, j10, j11, str, str2, i14, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
