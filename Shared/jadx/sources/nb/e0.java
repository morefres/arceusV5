package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    public static void a(zzbg zzbgVar, Parcel parcel, int i10) {
        String str = zzbgVar.f7471f;
        int a10 = o9.b.a(parcel);
        o9.b.v(parcel, 2, str, false);
        o9.b.t(parcel, 3, zzbgVar.f7472g, i10, false);
        o9.b.v(parcel, 4, zzbgVar.f7473h, false);
        o9.b.r(parcel, 5, zzbgVar.f7474i);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        long j10 = 0;
        String str = null;
        zzbe zzbeVar = null;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 2) {
                str = o9.a.h(parcel, u8);
            } else if (n10 == 3) {
                zzbeVar = (zzbe) o9.a.g(parcel, u8, zzbe.CREATOR);
            } else if (n10 == 4) {
                str2 = o9.a.h(parcel, u8);
            } else if (n10 != 5) {
                o9.a.C(parcel, u8);
            } else {
                j10 = o9.a.y(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzbg(str, zzbeVar, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbg[i10];
    }
}
