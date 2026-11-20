package lf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzk;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzg;

/* loaded from: classes2.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        zzk zzkVar = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            switch (o9.a.n(u8)) {
                case 1:
                    i10 = o9.a.w(parcel, u8);
                    break;
                case 2:
                    thingArr = (Thing[]) o9.a.k(parcel, u8, Thing.CREATOR);
                    break;
                case 3:
                    strArr = o9.a.i(parcel, u8);
                    break;
                case 4:
                default:
                    o9.a.C(parcel, u8);
                    break;
                case 5:
                    strArr2 = o9.a.i(parcel, u8);
                    break;
                case 6:
                    zzkVar = (zzk) o9.a.g(parcel, u8, zzk.CREATOR);
                    break;
                case 7:
                    str = o9.a.h(parcel, u8);
                    break;
                case 8:
                    str2 = o9.a.h(parcel, u8);
                    break;
            }
        }
        o9.a.m(parcel, D);
        return new zzg(i10, thingArr, strArr, strArr2, zzkVar, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
