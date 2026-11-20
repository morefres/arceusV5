package wa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appset.zza;

/* loaded from: classes.dex */
public final class g extends a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void t2(zza zzaVar, f fVar) {
        Parcel r22 = r2();
        c.b(r22, zzaVar);
        c.c(r22, fVar);
        s2(1, r22);
    }
}
