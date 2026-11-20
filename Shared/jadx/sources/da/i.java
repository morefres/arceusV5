package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.zza;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    public static void a(zza zzaVar, Parcel parcel, int i10) {
        int a10 = o9.b.a(parcel);
        o9.b.n(parcel, 1, zzaVar.A1());
        o9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            if (o9.a.n(u8) != 1) {
                o9.a.C(parcel, u8);
            } else {
                i10 = o9.a.w(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zza(i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zza[i10];
    }
}
