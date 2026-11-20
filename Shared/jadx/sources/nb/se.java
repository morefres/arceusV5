package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzpl;

/* loaded from: classes.dex */
public final class se implements Parcelable.Creator {
    public static void a(zzpl zzplVar, Parcel parcel, int i10) {
        int i11 = zzplVar.f7487f;
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.v(parcel, 2, zzplVar.f7488g, false);
        o9.b.r(parcel, 3, zzplVar.f7489h);
        o9.b.s(parcel, 4, zzplVar.f7490i, false);
        o9.b.l(parcel, 5, null, false);
        o9.b.v(parcel, 6, zzplVar.f7491j, false);
        o9.b.v(parcel, 7, zzplVar.f7492k, false);
        o9.b.j(parcel, 8, zzplVar.f7493l, false);
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    str = o9.a.h(parcel, u8);
                    break;
                case 3:
                    j10 = o9.a.y(parcel, u8);
                    break;
                case 4:
                    l10 = o9.a.z(parcel, u8);
                    break;
                case 5:
                    f10 = o9.a.t(parcel, u8);
                    break;
                case 6:
                    str2 = o9.a.h(parcel, u8);
                    break;
                case 7:
                    str3 = o9.a.h(parcel, u8);
                    break;
                case 8:
                    d10 = o9.a.r(parcel, u8);
                    break;
                default:
                    o9.a.C(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzpl(i10, str, j10, l10, f10, str2, str3, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzpl[i10];
    }
}
