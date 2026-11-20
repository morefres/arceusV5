package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.appindex.zzk;

/* loaded from: classes.dex */
public final class a0 extends a implements IInterface {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void u2(c0 c0Var, zzk[] zzkVarArr) {
        Parcel r22 = r2();
        x.d(r22, c0Var);
        r22.writeTypedArray(zzkVarArr, 0);
        t2(7, r22);
    }
}
