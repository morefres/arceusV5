package fb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.games_v2.zzq;

/* loaded from: classes.dex */
public final class g2 extends a implements IInterface {
    public g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.connect.IGamesConnectService");
    }

    public final void t2(f2 f2Var, zzq zzqVar) {
        Parcel r22 = r2();
        k0.d(r22, f2Var);
        k0.c(r22, zzqVar);
        s2(2, r22);
    }
}
