package ga;

import android.os.Parcel;
import com.google.android.gms.internal.games_v2.zzaf;
import fb.k0;

/* loaded from: classes.dex */
public abstract class f extends fb.q implements g {
    public f() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // fb.q
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1001) {
            return false;
        }
        zzaf zzb = zzb();
        parcel2.writeNoException();
        int i12 = k0.f17111a;
        parcel2.writeInt(1);
        zzb.writeToParcel(parcel2, 1);
        return true;
    }
}
