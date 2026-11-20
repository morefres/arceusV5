package ka;

import android.content.pm.ShortcutInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.v2.appshortcuts.zzg;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int D = o9.a.D(parcel);
        ArrayList<String> arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        ArrayList<String> arrayList4 = null;
        while (parcel.dataPosition() < D) {
            int u8 = o9.a.u(parcel);
            int n10 = o9.a.n(u8);
            if (n10 == 1) {
                arrayList = o9.a.j(parcel, u8);
            } else if (n10 == 2) {
                arrayList2 = o9.a.l(parcel, u8, ShortcutInfo.CREATOR);
            } else if (n10 == 3) {
                arrayList3 = o9.a.j(parcel, u8);
            } else if (n10 != 4) {
                o9.a.C(parcel, u8);
            } else {
                arrayList4 = o9.a.j(parcel, u8);
            }
        }
        o9.a.m(parcel, D);
        return new zzg(arrayList, arrayList2, arrayList3, arrayList4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
